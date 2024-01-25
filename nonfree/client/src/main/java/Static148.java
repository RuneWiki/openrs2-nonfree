import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!ffa", name = "v", descriptor = "F")
	public static float aFloat35;

	@OriginalMember(owner = "client!ffa", name = "t", descriptor = "I")
	public static int anInt2587 = 0;

	@OriginalMember(owner = "client!ffa", name = "x", descriptor = "Z")
	public static boolean aBoolean201 = false;

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V")
	public static void method2200() {
		for (@Pc(15) Class5_Sub5_Sub5 local15 = (Class5_Sub5_Sub5) Static202.aClass330_21.method7908(); local15 != null; local15 = (Class5_Sub5_Sub5) Static202.aClass330_21.method7914()) {
			@Pc(20) Class4_Sub2_Sub1_Sub5 local20 = local15.aClass4_Sub2_Sub1_Sub5_1;
			if (local20.anInt9488 < Static631.anInt10493) {
				local15.method9047();
				local20.method8171();
			} else if (Static631.anInt10493 >= local20.anInt9507) {
				local20.method8167();
				if (local20.anInt9492 > 0) {
					@Pc(59) Class5_Sub3 local59 = (Class5_Sub3) Static445.aClass273_29.method6581((long) (local20.anInt9492 - 1));
					if (local59 != null) {
						@Pc(64) Class4_Sub2_Sub1_Sub1_Sub2 local64 = local59.aClass4_Sub2_Sub1_Sub1_Sub2_1;
						if (local64.anInt10231 >= 0 && local64.anInt10231 < Static326.anInt5541 * 512 && local64.anInt10229 >= 0 && Static448.anInt7637 * 512 > local64.anInt10229) {
							local20.method8174(Static631.anInt10493, local64.anInt10229, local64.anInt10231, Static644.method9021(local64.anInt10229, local64.anInt10231, local20.aByte132) - local20.anInt9497);
						}
					}
				}
				if (local20.anInt9492 < 0) {
					@Pc(125) int local125 = -local20.anInt9492 - 1;
					@Pc(132) Class4_Sub2_Sub1_Sub1_Sub1 local132;
					if (local125 == Static337.anInt5722) {
						local132 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2;
					} else {
						local132 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local125];
					}
					if (local132 != null && local132.anInt10231 >= 0 && Static326.anInt5541 * 512 > local132.anInt10231 && local132.anInt10229 >= 0 && Static448.anInt7637 * 512 > local132.anInt10229) {
						local20.method8174(Static631.anInt10493, local132.anInt10229, local132.anInt10231, Static644.method9021(local132.anInt10229, local132.anInt10231, local20.aByte132) - local20.anInt9497);
					}
				}
				local20.method8169(Static435.anInt7492);
				Static37.method569(local20, true);
			}
		}
	}

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(II)Lclient!sw;")
	public static Class5_Sub5_Sub19 method2201(@OriginalArg(1) int arg0) {
		@Pc(15) Class5_Sub5_Sub19 local15 = (Class5_Sub5_Sub19) Static37.aClass232_1.method5128((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(27) byte[] local27 = Static436.aClass207_88.method4681(arg0, 0);
		if (local27 == null || local27.length <= 1) {
			return null;
		}
		try {
			local15 = Static94.method1585(local27);
		} catch (@Pc(41) Exception local41) {
			throw new RuntimeException(local41.getMessage() + " S: " + arg0);
		}
		Static37.aClass232_1.method5129(local15, (long) arg0);
		return local15;
	}
}
