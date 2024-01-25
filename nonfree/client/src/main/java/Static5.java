import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
	public static int anInt78;

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "Lclient!oq;")
	public static final Class182 aClass182_1 = new Class182("", 15);

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
	public static void method62() {
		for (@Pc(11) int local11 = 0; local11 < Static234.anInt4174; local11++) {
			@Pc(17) Class266 local17 = Static249.aClass266Array1[local11];
			if (local17.aByte105 == 2) {
				if (local17.aClass1_Sub6_Sub3_4 == null) {
					local17.anInt7428 = Integer.MIN_VALUE;
				} else {
					Static355.aClass1_Sub6_Sub4_2.method5179(local17.aClass1_Sub6_Sub3_4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLclient!wk;)V")
	public static void method64(@OriginalArg(1) Class25_Sub5_Sub1 arg0) {
		if (arg0 instanceof Class25_Sub5_Sub1_Sub1) {
			@Pc(28) Class25_Sub5_Sub1_Sub1 local28 = (Class25_Sub5_Sub1_Sub1) arg0;
			if (local28.aClass54_1 != null) {
				Static406.method5263(local28, local28.aByte94 != Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94);
			}
		} else if (arg0 instanceof Class25_Sub5_Sub1_Sub2) {
			@Pc(8) Class25_Sub5_Sub1_Sub2 local8 = (Class25_Sub5_Sub1_Sub2) arg0;
			Static223.method4577(local8, Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94 != local8.aByte94);
		}
	}
}
