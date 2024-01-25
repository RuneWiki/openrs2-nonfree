import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	public static int anInt5018;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "F")
	public static float aFloat118;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_53 = new Class70(71, -1);

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_152 = new Class235(41, 2);

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_153 = new Class235(0, -1);

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
	public static final int anInt5022 = 1400;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
	public static void method4090(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub6_Sub16 local8 = Static212.method3332(8, arg0);
		local8.method6593();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)Z")
	public static boolean method4091(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static539.aCharArray7[local7 - 128] != '\u0000';
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!de;[IB)V")
	public static void method4092(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub3_Sub3_Sub1_Sub1 arg1, @OriginalArg(2) int[] arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg1.anIntArray532 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg1.anIntArray532.length; local8++) {
				if (arg1.anIntArray532[local8] != arg2[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg1.anInt6822 != -1) {
				@Pc(48) Class290 local48 = Static192.aClass211_1.method4277(arg1.anInt6822);
				@Pc(51) int local51 = local48.anInt7801;
				if (local51 == 1) {
					arg1.anInt6785 = arg0;
					arg1.anInt6849 = 0;
					arg1.anInt6850 = 0;
					arg1.anInt6825 = 1;
					arg1.anInt6803 = 0;
					Static137.method2090(local48, arg1.anInt9365, arg1.anInt6803, arg1 == Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1, arg1.anInt9370, arg1.aByte123);
				}
				if (local51 == 2) {
					arg1.anInt6850 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg2.length; local8++) {
			if (arg2[local8] != -1) {
				local6 = false;
			}
			if (arg1.anIntArray532 == null || arg1.anIntArray532[local8] == -1 || Static192.aClass211_1.method4277(arg2[local8]).anInt7802 >= Static192.aClass211_1.method4277(arg1.anIntArray532[local8]).anInt7802) {
				arg1.anIntArray532 = arg2;
				arg1.anInt6785 = arg0;
				break;
			}
		}
		if (local6) {
			arg1.anIntArray532 = arg2;
			arg1.anInt6785 = arg0;
		}
	}
}
