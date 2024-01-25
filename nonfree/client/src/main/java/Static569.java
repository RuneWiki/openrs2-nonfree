import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "[Lclient!pg;")
	public static Class258[] aClass258Array1;

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "Lclient!f;")
	public static Class46 aClass46_33;

	@OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
	public static int anInt9141;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!lk;I)V")
	public static void method7556(@OriginalArg(0) Class203 arg0) {
		if (!Static380.aBoolean537) {
			return;
		}
		if (arg0.anObjectArray17 != null) {
			@Pc(23) Class203 local23 = Static582.method7699(Static550.anInt7639, Static345.anInt6055);
			if (local23 != null) {
				@Pc(29) Class3_Sub45 local29 = new Class3_Sub45();
				local29.anObjectArray33 = arg0.anObjectArray17;
				local29.aClass203_136 = arg0;
				local29.aClass203_137 = local23;
				Static149.method2778(local29);
			}
		}
		@Pc(46) Class3_Sub34 local46 = Static374.method5522(Static454.aClass298_154, Static220.aClass287_2);
		local46.aClass3_Sub11_Sub1_2.method3101(arg0.anInt5531);
		local46.aClass3_Sub11_Sub1_2.method3132(arg0.anInt5504);
		local46.aClass3_Sub11_Sub1_2.method3132(Static63.anInt1712);
		local46.aClass3_Sub11_Sub1_2.method3095(Static345.anInt6055);
		local46.aClass3_Sub11_Sub1_2.method3095(arg0.anInt5507);
		local46.aClass3_Sub11_Sub1_2.method3087(Static550.anInt7639);
		Static131.method2572(local46);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Ljava/lang/String;ZJZ)V")
	public static void method7557(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2) {
		if (arg1) {
			Static405.method5875();
			if (Static113.aString36.equals("")) {
				Static5.anInt98 = 39;
				return;
			}
		}
		@Pc(19) Class3_Sub11 local19 = new Class3_Sub11(576);
		local19.method3079(10);
		local19.method3131((int) (Math.random() * 65535.0D));
		local19.method3124(arg2);
		local19.method3131(arg1 ? Static503.anInt8031 : Static350.anInt8128);
		local19.method3136(arg0);
		local19.method3124(arg1 ? Static505.aLong83 : Static513.aLong237);
		if (arg1) {
			local19.method3124(Static248.method7734(Static113.aString36));
			try {
				local19.method3124(Long.parseLong(Static546.aString119));
			} catch (@Pc(99) Exception local99) {
				Static5.anInt98 = 39;
				return;
			}
		} else {
			local19.method3101((int) (Math.random() * 9.9999999E7D));
			local19.method3101((int) (Math.random() * 9.9999999E7D));
			local19.method3101((int) (Math.random() * 9.9999999E7D));
			local19.method3101((int) (Math.random() * 9.9999999E7D));
		}
		local19.method3101((int) (Math.random() * 9.9999999E7D));
		local19.method3119(Static479.aBigInteger6, Static551.aBigInteger8);
		@Pc(122) Class3_Sub34 local122 = Static17.method293();
		local122.aClass3_Sub11_Sub1_2.method3079(arg1 ? Static115.aClass92_12.anInt2893 : Static115.aClass92_9.anInt2893);
		@Pc(135) int local135 = 1;
		if (Static428.aString28 != null) {
			local135 = Static428.aString28.length() + 1 + 1;
		}
		local122.aClass3_Sub11_Sub1_2.method3131(local135 + local19.anInt3520 + 28);
		local122.aClass3_Sub11_Sub1_2.method3131(620);
		local122.aClass3_Sub11_Sub1_2.method3079(Static131.anInt2839);
		local122.aClass3_Sub11_Sub1_2.method3079(Static227.aClass211_1.anInt5793);
		Static254.method4070(local122.aClass3_Sub11_Sub1_2);
		@Pc(182) String local182 = arg1 ? Static402.aString98 : Static428.aString28;
		local122.aClass3_Sub11_Sub1_2.method3079(local182 == null ? 0 : 1);
		if (local182 != null) {
			local122.aClass3_Sub11_Sub1_2.method3136(local182);
		}
		local122.aClass3_Sub11_Sub1_2.method3084(local19.anInt3520, local19.aByteArray36);
		Static131.method2572(local122);
		Static144.anInt3061 = 1;
		Static268.anInt5017 = 0;
		Static221.anInt5801 = 0;
		Static5.anInt98 = -3;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!qh;I)Lclient!gn;")
	public static Class94_Sub1_Sub1 method7559(@OriginalArg(0) Class3_Sub11 arg0) {
		@Pc(7) Class94_Sub1 local7 = Static445.method6252(arg0);
		@Pc(18) int local18 = arg0.method3107();
		return new Class94_Sub1_Sub1(local7.aClass300_13, local7.aClass140_15, local7.anInt8266, local7.anInt8265, local7.anInt8263, local7.anInt8262, local7.anInt8268, local7.anInt8269, local7.anInt8267, local7.anInt3443, local7.anInt3449, local7.anInt3445, local7.anInt3452, local7.anInt3444, local7.anInt3446, local18);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)V")
	public static void method7560(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static457.aBooleanArray29[arg0]) {
			Static552.aClass246_253.method5677(arg0);
			Static59.aClass203ArrayArray3[arg0] = null;
			Static267.aClass203ArrayArray2[arg0] = null;
			Static457.aBooleanArray29[arg0] = false;
		}
	}
}
