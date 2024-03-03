import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
	public static int anInt3773;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "Lclient!jd;")
	public static Class13 aClass13_13;

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "Lclient!cc;")
	public static Class32 aClass32_8;

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
	public static int anInt3776;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V", line = 3)
	public static void method3722() {
		Static37.aClass72_3.method2105();
		Static313.aClass241_5.method6271();
		Static21.aClass55_1.method1784();
		Static334.aClass202_4.method5160();
		Static6.aClass219_1.method5572();
		Static290.aClass107_2.method2763();
		Static37.aClass85_1.method2375();
		Static299.aClass211_2.method5411();
		Static299.aClass128_1.method3396();
		Static52.aClass199_1.method5109();
		Static55.aClass7_1.method241();
		Static297.aClass104_2.method2709();
		Static219.aClass125_1.method3381();
		Static264.aClass233_1.method5882();
		Static338.aClass18_2.method563();
		Static9.aClass213_1.method5427();
		Static255.aClass160_1.method4034();
		Static84.aClass190_3.method4886();
		Static206.aClass150_3.method3734();
		Static342.aClass132_1.method3476();
		Static131.method2629();
		Static85.method1964();
		Static67.method6022();
		if (Class132.aClass127_6 != Static114.aClass127_4) {
			for (@Pc(80) int local80 = 0; local80 < Static25.aByteArrayArray3.length; local80++) {
				Static25.aByteArrayArray3[local80] = null;
			}
			Class41.anInt1331 = 0;
		}
		Static263.method4922();
		Static251.method4628();
		Static344.method6218();
		Static179.method3509();
		Static151.method2970();
		Class139.aClass98_30.method2616();
		Static177.aClass19_8.method2905();
		Class174.aClass116_7.method3154();
		Static181.method3542();
		Static319.aClass197_77.method5069();
		Static33.aClass197_67.method5069();
		Static266.aClass197_71.method5069();
		Static329.aClass197_9.method5069();
		Static81.aClass197_21.method5069();
		Static265.aClass197_70.method5069();
		Static94.aClass197_23.method5069();
		Static220.aClass197_63.method5069();
		Static29.aClass197_5.method5069();
		Static301.aClass197_86.method5069();
		Static71.aClass197_18.method5069();
		Static201.aClass197_58.method5069();
		Static182.aClass197_54.method5069();
		Static235.aClass197_64.method5069();
		Static124.aClass197_32.method5069();
		Static113.aClass197_28.method5069();
		Static365.aClass197_96.method5069();
		Static210.aClass197_61.method5069();
		Static201.aClass197_57.method5069();
		Static57.aClass197_12.method5069();
		Static130.aClass197_35.method5069();
		Static162.aClass197_45.method5069();
		Static271.aClass197_75.method5069();
		Static363.aClass197_66.method5069();
		Static359.aClass197_94.method5069();
		Static130.aClass197_34.method5069();
		Static218.aClass197_47.method5069();
		Static57.aClass197_11.method5069();
		Static81.aClass197_20.method5069();
		Class2_Sub24_Sub1.aClass98_49.method2616();
		Class97.aClass98_18.method2616();
		Class2_Sub3_Sub7.aClass98_5.method2616();
		Class148.aClass98_31.method2616();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V", line = 90)
	public static void method3723(@OriginalArg(1) int arg0) {
		Class2_Sub10.anInt1761 = -1;
		if (arg0 == 37) {
			Static321.aFloat72 = 3.0F;
		} else if (arg0 == 50) {
			Static321.aFloat72 = 4.0F;
		} else if (arg0 == 75) {
			Static321.aFloat72 = 6.0F;
		} else if (arg0 == 100) {
			Static321.aFloat72 = 8.0F;
		} else if (arg0 == 200) {
			Static321.aFloat72 = 16.0F;
		}
		Class2_Sub10.anInt1761 = -1;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ct;IILclient!nh;Lclient!oe;BII)V", line = 137)
	public static void method3725(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub5_Sub2_Sub1 arg3, @OriginalArg(4) Class11_Sub5_Sub2_Sub2 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class2_Sub19 local7 = new Class2_Sub19();
		local7.anInt2902 = arg6;
		local7.anInt2896 = arg5 * 128;
		local7.anInt2907 = arg1 * 128;
		if (arg0 != null) {
			local7.aClass41_1 = arg0;
			@Pc(33) int local33 = arg0.anInt1354;
			@Pc(36) int local36 = arg0.anInt1326;
			if (arg2 == 1 || arg2 == 3) {
				local33 = arg0.anInt1326;
				local36 = arg0.anInt1354;
			}
			local7.anIntArray181 = arg0.anIntArray93;
			local7.anInt2900 = arg0.anInt1333;
			local7.anInt2893 = (arg5 + local33) * 128;
			local7.anInt2898 = arg0.anInt1306 * 128;
			local7.anInt2901 = (local36 + arg1) * 128;
			local7.anInt2903 = arg0.anInt1319;
			local7.anInt2891 = arg0.anInt1324;
			local7.anInt2894 = arg0.anInt1314;
			if (arg0.anIntArray94 != null) {
				local7.aBoolean204 = true;
				local7.method2942();
			}
			if (local7.anIntArray181 != null) {
				local7.anInt2904 = local7.anInt2900 + (int) ((double) (local7.anInt2894 - local7.anInt2900) * Math.random());
			}
			Class62.aClass135_14.method3541(local7);
		} else if (arg4 != null) {
			local7.aClass11_Sub5_Sub2_Sub2_1 = arg4;
			@Pc(131) Class71 local131 = arg4.aClass71_1;
			if (local131.anIntArray129 != null) {
				local7.aBoolean204 = true;
				local131 = local131.method2095(Static199.aClass226_1);
			}
			if (local131 != null) {
				local7.anInt2901 = (arg1 + local131.anInt2038) * 128;
				local7.anInt2893 = (arg5 + local131.anInt2038) * 128;
				local7.anInt2891 = Static317.method5765(arg4);
				local7.anInt2898 = local131.anInt2020 * 128;
				local7.anInt2903 = local131.anInt2048;
			}
			Class11_Sub5_Sub6.aClass135_39.method3541(local7);
		} else if (arg3 != null) {
			local7.aClass11_Sub5_Sub2_Sub1_2 = arg3;
			local7.anInt2893 = (arg5 + arg3.method4329()) * 128;
			local7.anInt2901 = (arg1 + arg3.method4329()) * 128;
			local7.anInt2891 = Static358.method6416(arg3);
			local7.anInt2903 = arg3.anInt4195;
			local7.anInt2898 = arg3.anInt4176 * 128;
			Class160.aClass4_86.method87(local7, (long) arg3.anInt4610);
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V", line = 239)
	public static void method3726() {
		if (Class11_Sub3_Sub1.anInt1868 > 0) {
			Static92.method2146();
		} else {
			Static227.aClass111_2 = Static312.aClass111_4;
			Static312.aClass111_4 = null;
			Static313.method5706(40);
		}
	}
}
