import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "Lclient!vm;")
	public static Class2_Sub47 aClass2_Sub47_1;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "Ljava/lang/Object;")
	public static Object anObject7;

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "Lclient!ae;")
	public static Class8 aClass8_3;

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray14;

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
	public static int anInt909 = 0;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
	public static int anInt910 = 0;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V")
	public static void method636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class346 local7 = Static389.aClass346ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static451.method310(local7.aClass6_Sub1_Sub3_2);
		Static451.method310(local7.aClass6_Sub1_Sub3_1);
		if (local7.aClass6_Sub1_Sub3_2 != null) {
			local7.aClass6_Sub1_Sub3_2 = null;
		}
		if (local7.aClass6_Sub1_Sub3_1 != null) {
			local7.aClass6_Sub1_Sub3_1 = null;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([IBLclient!ac;I)V")
	public static void method637(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class6_Sub1_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg1.anIntArray507 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg1.anIntArray507.length; local8++) {
				if (arg1.anIntArray507[local8] != arg0[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg1.anInt7370 != -1) {
				@Pc(40) Class84 local40 = Static116.aClass140_2.method3287(arg1.anInt7370);
				@Pc(43) int local43 = local40.anInt2056;
				if (local43 == 1) {
					arg1.anInt7349 = 1;
					arg1.anInt7378 = 0;
					arg1.anInt7400 = 0;
					arg1.anInt7406 = arg2;
					arg1.anInt7416 = 0;
					Static434.method4018(arg1.aByte112, local40, arg1.anInt8761, arg1.anInt8764, arg1.anInt7416, false);
				}
				if (local43 == 2) {
					arg1.anInt7378 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg0.length; local8++) {
			if (arg0[local8] != -1) {
				local6 = false;
			}
			if (arg1.anIntArray507 == null || arg1.anIntArray507[local8] == -1 || Static116.aClass140_2.method3287(arg0[local8]).anInt2065 >= Static116.aClass140_2.method3287(arg1.anIntArray507[local8]).anInt2065) {
				arg1.anInt7423 = arg1.anInt7424;
				arg1.anIntArray507 = arg0;
				arg1.anInt7406 = arg2;
			}
		}
		if (local6) {
			arg1.anInt7406 = arg2;
			arg1.anIntArray507 = arg0;
			arg1.anInt7423 = arg1.anInt7424;
		}
	}
}
