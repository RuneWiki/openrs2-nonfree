import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!vs", name = "v", descriptor = "[[S")
	public static short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!vs", name = "w", descriptor = "Lclient!ht;")
	public static Class112 aClass112_6;

	@OriginalMember(owner = "client!vs", name = "r", descriptor = "Lclient!rv;")
	public static final Class227 aClass227_4 = new Class227(2);

	@OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
	public static int anInt3187 = 0;

	@OriginalMember(owner = "client!vs", name = "u", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_116 = new Class67(73, 8);

	@OriginalMember(owner = "client!vs", name = "x", descriptor = "Lclient!am;")
	public static final Class14 aClass14_21 = new Class14();

	@OriginalMember(owner = "client!vs", name = "y", descriptor = "J")
	public static volatile long aLong109 = 0L;

	@OriginalMember(owner = "client!vs", name = "z", descriptor = "Lclient!hm;")
	public static Class107 aClass107_7 = null;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)Z")
	public static boolean method2582(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
	public static void method2583() {
		for (@Pc(14) Class1_Sub24 local14 = (Class1_Sub24) Static231.aClass14_24.method203(); local14 != null; local14 = (Class1_Sub24) Static231.aClass14_24.method208()) {
			if (Static259.aClass216ArrayArrayArray3 == null) {
				local14.method5953();
			} else {
				@Pc(36) int local36;
				@Pc(104) Class11_Sub2 local104;
				@Pc(117) Class11_Sub2_Sub1 local117;
				@Pc(60) Class11_Sub1 local60;
				@Pc(139) Class11_Sub4 local139;
				@Pc(175) Class11_Sub3 local175;
				@Pc(152) Class11_Sub4_Sub3 local152;
				@Pc(188) Class11_Sub3_Sub1 local188;
				if (local14.anInt3675 <= Static98.anInt1304) {
					local36 = Static17.anIntArray311[local14.anInt3676];
					if (local36 == 0) {
						local175 = Static464.method5366(local14.anInt3669, local14.anInt3666, local14.anInt3677);
						if (local175 instanceof Class11_Sub3_Sub1) {
							Static371.method4828(local14.anInt3669, local14.anInt3666, local14.anInt3677);
							local188 = (Class11_Sub3_Sub1) local175;
							if (local188.aClass11_Sub3_1 != null) {
								Static176.method2561(local14.anInt3669, local14.anInt3666, local14.anInt3677, local188.aClass11_Sub3_1, null);
							}
						}
					} else if (local36 == 1) {
						local139 = Static282.method3773(local14.anInt3669, local14.anInt3666, local14.anInt3677);
						if (local139 instanceof Class11_Sub4_Sub3) {
							Static355.method4660(local14.anInt3669, local14.anInt3666, local14.anInt3677);
							local152 = (Class11_Sub4_Sub3) local139;
							if (local152.aClass11_Sub4_3 != null) {
								Static406.method5231(local14.anInt3669, local14.anInt3666, local14.anInt3677, local152.aClass11_Sub4_3, null);
							}
						}
					} else if (local36 == 2) {
						local60 = Static423.method5398(local14.anInt3669, local14.anInt3666, local14.anInt3677, nc.class);
						if (local60 instanceof Class11_Sub1_Sub1) {
							Static371.method4830(local14.anInt3669, local14.anInt3666, local14.anInt3677, nc.class);
							@Pc(81) Class11_Sub1_Sub1 local81 = (Class11_Sub1_Sub1) local60;
							if (local81.aClass11_Sub1_1 != null) {
								Static95.method5201(local81.aClass11_Sub1_1, false);
							}
						}
					} else if (local36 == 3) {
						local104 = Static168.method2856(local14.anInt3669, local14.anInt3666, local14.anInt3677);
						if (local104 instanceof Class11_Sub2_Sub1) {
							Static216.method3114(local14.anInt3669, local14.anInt3666, local14.anInt3677);
							local117 = (Class11_Sub2_Sub1) local104;
							if (local117.aClass11_Sub2_1 != null) {
								Static24.method353(local14.anInt3669, local14.anInt3666, local14.anInt3677, local117.aClass11_Sub2_1);
							}
						}
					}
					local14.method5953();
				} else if (Static98.anInt1304 == local14.anInt3674) {
					local36 = Static17.anIntArray311[local14.anInt3676];
					if (local36 == 0) {
						local175 = Static464.method5366(local14.anInt3669, local14.anInt3666, local14.anInt3677);
						if (local175 instanceof Class11_Sub3_Sub1) {
							local14.method5953();
						} else if (Static114.method1407(local14.anInt3669, local14.anInt3666, local14.anInt3677) == null) {
							local188 = new Class11_Sub3_Sub1(local14.anInt3676, local14.anInt3678, local14.anInt3673, local14.anInt3672, local14.anInt3679, local175);
							Static176.method2561(local14.anInt3669, local14.anInt3666, local14.anInt3677, local188, null);
						} else {
							local14.method5953();
						}
					} else if (local36 == 1) {
						local139 = Static282.method3773(local14.anInt3669, local14.anInt3666, local14.anInt3677);
						if (local139 instanceof Class11_Sub4_Sub3) {
							local14.method5953();
						} else if (Static367.method4799(local14.anInt3669, local14.anInt3666, local14.anInt3677) == null) {
							local152 = new Class11_Sub4_Sub3(local14.anInt3676, local14.anInt3678, local14.anInt3673, local14.anInt3672, local14.anInt3679, local139);
							Static406.method5231(local14.anInt3669, local14.anInt3666, local14.anInt3677, local152, null);
						} else {
							local14.method5953();
						}
					} else if (local36 == 2) {
						local60 = Static423.method5398(local14.anInt3669, local14.anInt3666, local14.anInt3677, nc.class);
						if (local60 instanceof Class11_Sub1_Sub1) {
							local14.method5953();
						} else {
							Static371.method4830(local14.anInt3669, local14.anInt3666, local14.anInt3677, nc.class);
							@Pc(386) Class87 local386 = Static86.aClass248_7.method5246(local14.anInt3667);
							@Pc(399) int local399;
							@Pc(402) int local402;
							if (local14.anInt3678 == 1 || local14.anInt3678 == 3) {
								local399 = local386.anInt1959;
								local402 = local386.anInt1916;
							} else {
								local399 = local386.anInt1916;
								local402 = local386.anInt1959;
							}
							@Pc(444) Class11_Sub1_Sub1 local444 = new Class11_Sub1_Sub1(local14.anInt3676, local14.anInt3678, local14.anInt3669, local14.anInt3673, local14.anInt3672, local14.anInt3679, local14.anInt3666, local14.anInt3666 + local399 - 1, local14.anInt3677, local14.anInt3677 + local402 - 1, local60);
							Static95.method5201(local444, false);
						}
					} else if (local36 == 3) {
						local104 = Static168.method2856(local14.anInt3669, local14.anInt3666, local14.anInt3677);
						if (local104 instanceof Class11_Sub2_Sub1) {
							local14.method5953();
						} else {
							local117 = new Class11_Sub2_Sub1(local14.anInt3673, local14.anInt3672, local14.anInt3679, local104);
							Static24.method353(local14.anInt3669, local14.anInt3666, local14.anInt3677, local117);
						}
					}
				}
			}
		}
	}
}
