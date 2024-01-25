import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
	public static int anInt541;

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
	public static int anInt542;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
	public static int anInt545;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
	public static int anInt546;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
	public static int anInt547;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "[I")
	public static final int[] anIntArray28 = new int[200];

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
	public static int anInt548 = 0;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
	public static void method552() {
		Static355.aClass66_110.method1942();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZZ)V")
	public static void method553(@OriginalArg(1) boolean arg0) {
		if (Static219.aBoolean319 != arg0) {
			Static219.aBoolean319 = arg0;
			Static7.method233();
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
	public static void method554() {
		try {
			if (Static200.anInt5712 == 1) {
				@Pc(14) int local14 = Static352.aClass5_Sub17_Sub2_3.method3195();
				if (local14 > 0 && Static352.aClass5_Sub17_Sub2_3.method3186()) {
					local14 -= Static163.anInt3276;
					if (local14 < 0) {
						local14 = 0;
					}
					Static352.aClass5_Sub17_Sub2_3.method3205(local14);
				} else {
					Static352.aClass5_Sub17_Sub2_3.method3181();
					Static352.aClass5_Sub17_Sub2_3.method3200();
					if (Static110.aClass170_48 == null) {
						Static200.anInt5712 = 0;
					} else {
						Static200.anInt5712 = 2;
					}
					Static50.aClass50_1 = null;
					Static83.aClass5_Sub20_1 = null;
				}
			}
		} catch (@Pc(56) Exception local56) {
			local56.printStackTrace();
			Static352.aClass5_Sub17_Sub2_3.method3181();
			Static50.aClass50_1 = null;
			Static110.aClass170_48 = null;
			Static83.aClass5_Sub20_1 = null;
			Static200.anInt5712 = 0;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIILclient!jf;)V")
	public static void method555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class96 arg2) {
		@Pc(12) Class15 local12 = arg2.method2702(Static15.aClass59_1);
		if (local12 == null) {
			return;
		}
		Static15.aClass59_1.method4795(arg0, arg1, arg0 + arg2.anInt2943, arg1 - -arg2.anInt2916);
		if (Static115.anInt2459 < 3) {
			Static29.aClass54_1.method5561((float) arg0 + (float) arg2.anInt2943 / 2.0F, (float) arg1 + (float) arg2.anInt2916 / 2.0F, ((int) -Static155.aFloat64 & 0x3FFF) << 2, local12, arg0, arg1);
		} else {
			Static15.aClass59_1.method4803(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)I")
	public static int method557(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
