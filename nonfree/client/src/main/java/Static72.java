import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "[I")
	public static int[] anIntArray144;

	@OriginalMember(owner = "client!cha", name = "f", descriptor = "Lclient!nd;")
	public static Class238 aClass238_40;

	@OriginalMember(owner = "client!cha", name = "c", descriptor = "[I")
	public static final int[] anIntArray145 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(IIIB)V")
	public static void method1634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg2 + Static406.anInt6899;
		@Pc(13) int local13 = Static338.anInt5885 + arg0;
		if (Static348.aClass84ArrayArrayArray5 == null || arg2 < 0 || arg0 < 0 || Static456.anInt7428 <= arg2 || Static5.anInt112 <= arg0 || Static305.aClass2_Sub49_15.aClass33_Sub27_1.method8670() == 0 && arg1 != Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109) {
			return;
		}
		@Pc(50) long local50 = (long) (arg1 << 28 | local13 << 14 | local9);
		@Pc(56) Class2_Sub23 local56 = (Class2_Sub23) Static263.aClass323_18.method7484(local50);
		if (local56 == null) {
			Static547.method7568(arg1, arg2, arg0);
			return;
		}
		@Pc(70) Class2_Sub50 local70 = (Class2_Sub50) local56.aClass114_22.method2772();
		if (local70 == null) {
			Static547.method7568(arg1, arg2, arg0);
			return;
		}
		@Pc(84) Class16_Sub1_Sub5_Sub1 local84 = (Class16_Sub1_Sub5_Sub1) Static547.method7568(arg1, arg2, arg0);
		if (local84 == null) {
			local84 = new Class16_Sub1_Sub5_Sub1(arg2 << 9, Static511.aClass91Array3[arg1].method7447(arg0, arg2), arg0 << 9, arg1, arg1);
		} else {
			local84.anInt7831 = local84.anInt7830 = -1;
		}
		local84.anInt7832 = local70.anInt10421;
		local84.anInt7842 = local70.anInt10422;
		label56: while (true) {
			@Pc(127) Class2_Sub50 local127 = (Class2_Sub50) local56.aClass114_22.method2762();
			if (local127 == null) {
				break;
			}
			if (local84.anInt7832 != local127.anInt10421) {
				local84.anInt7844 = local127.anInt10422;
				local84.anInt7831 = local127.anInt10421;
				while (true) {
					@Pc(152) Class2_Sub50 local152 = (Class2_Sub50) local56.aClass114_22.method2762();
					if (local152 == null) {
						break label56;
					}
					if (local152.anInt10421 != local84.anInt7832 && local152.anInt10421 != local84.anInt7831) {
						local84.anInt7838 = local152.anInt10422;
						local84.anInt7830 = local152.anInt10421;
					}
				}
			}
		}
		@Pc(196) int local196 = Static392.method5799(arg1, (arg2 << 9) + 256, (arg0 << 9) + 256);
		local84.anInt8034 = arg0 << 9;
		local84.anInt8037 = arg2 << 9;
		local84.aByte108 = (byte) arg1;
		local84.anInt8036 = local196;
		local84.aByte109 = (byte) arg1;
		local84.anInt7845 = 0;
		if (Static481.method6813(arg0, arg2)) {
			local84.aByte108++;
		}
		Static77.method1652(arg1, arg2, arg0, local196, local84);
	}

	@OriginalMember(owner = "client!cha", name = "b", descriptor = "(I)V")
	public static void method1636() {
		Static28.aClass13_87.method8106(Static346.aFloat112, Static364.aFloat117, Static63.aFloat33);
	}
}
