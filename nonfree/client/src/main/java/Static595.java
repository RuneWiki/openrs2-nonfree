import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!ww", name = "J", descriptor = "Lclient!sc;")
	public static Class31 aClass31_1;

	@OriginalMember(owner = "client!ww", name = "h", descriptor = "I")
	public static int anInt9666 = -1;

	@OriginalMember(owner = "client!ww", name = "q", descriptor = "Lclient!uf;")
	public static final Class326 aClass326_60 = new Class326(8);

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!r;ILclient!kt;Lclient!lv;)V")
	public static void method7929(@OriginalArg(0) Class12 arg0, @OriginalArg(2) Class196 arg1, @OriginalArg(3) Class1_Sub27 arg2) {
		@Pc(10) Class10 local10 = arg1.method4336(arg0);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.E();
		if (local10.u() > local16) {
			local16 = local10.u();
		}
		@Pc(28) int local28 = arg2.anInt5626;
		@Pc(39) int local39 = arg2.anInt5622;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(59) int local59;
		@Pc(86) int local86;
		if (arg1.aString57 != null) {
			local41 = Static481.aClass13_13.method458(null, Static461.aStringArray31, arg1.aString57, null);
			for (local59 = 0; local59 < local41; local59++) {
				@Pc(65) String local65 = Static461.aStringArray31[local59];
				if (local59 < local41 - 1) {
					local65 = local65.substring(0, local65.length() - 4);
				}
				local86 = Static398.aClass27_6.method855(local65);
				if (local43 < local86) {
					local43 = local86;
				}
			}
			local45 = local41 * Static398.aClass27_6.method849() + Static398.aClass27_6.method854() / 2;
		}
		local59 = arg2.anInt5626 + local16 / 2;
		if (local16 + Static313.anInt4090 > local28) {
			local59 = local43 / 2 + local16 / 2 + Static313.anInt4090 + 10 + 5;
			local28 = Static313.anInt4090;
		} else if (Static313.anInt4091 - local16 < local28) {
			local28 = Static313.anInt4091 - local16;
			local59 = Static313.anInt4091 - local43 / 2 - local16 / 2 - 5 - 10;
		}
		@Pc(175) int local175 = arg2.anInt5622;
		if (Static313.anInt4086 + local16 > local39) {
			local39 = Static313.anInt4086;
			local175 = Static313.anInt4086 + local16 / 2 + 10;
		} else if (local39 > Static313.anInt4092 - local16) {
			local39 = Static313.anInt4092 - local16;
			local175 = Static313.anInt4092 - local16 / 2 - local45 - 10;
		}
		local86 = (int) (Math.atan2((double) (local28 - arg2.anInt5626), (double) (local39 - arg2.anInt5622)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method7678((float) local28 + (float) local16 / 2.0F, (float) local39 + (float) local16 / 2.0F, 4096, local86);
		@Pc(261) int local261 = -2;
		@Pc(263) int local263 = -2;
		@Pc(265) int local265 = -2;
		@Pc(267) int local267 = -2;
		if (arg1.aString57 != null) {
			local263 = local175;
			local261 = local59 - local43 / 2 - 5;
			local265 = local261 + local43 + 10;
			local267 = Static398.aClass27_6.method849() * local41 + local175 + 3;
			if (arg1.anInt5167 != 0) {
				arg0.method6418(local267 - local175, local261, local175, local265 - local261, arg1.anInt5167);
			}
			if (arg1.anInt5166 != 0) {
				arg0.method6456(local175, local261, local267 - local175, local265 + -local261, arg1.anInt5166);
			}
			for (@Pc(337) int local337 = 0; local337 < local41; local337++) {
				@Pc(343) String local343 = Static461.aStringArray31[local337];
				if (local41 - 1 > local337) {
					local343 = local343.substring(0, local343.length() - 4);
				}
				Static398.aClass27_6.method852(arg0, local343, local59, local175, arg1.anInt5165);
				local175 += Static398.aClass27_6.method849();
			}
		}
		if (arg1.anInt5179 == -1 && arg1.aString57 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(391) Class1_Sub47 local391 = new Class1_Sub47(arg2);
		local391.anInt8486 = local28 + local16;
		local391.anInt8482 = local39 - local16;
		local391.anInt8484 = local261;
		local391.anInt8487 = local263;
		local391.anInt8485 = local265;
		local391.anInt8477 = local28 - local16;
		local391.anInt8479 = local267;
		local391.anInt8481 = local39 + local16;
		Static266.aClass361_88.method7855(local391);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(BILjava/lang/Object;I)[B")
	public static byte[] method7932(@OriginalArg(1) int arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return Static565.method7636(arg0, local18);
		} else if (arg1 instanceof Class317) {
			@Pc(30) Class317 local30 = (Class317) arg1;
			return local30.method7059(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!io;B)Lclient!nga;")
	public static Class226 method7934(@OriginalArg(0) Class1_Sub20 arg0) {
		@Pc(7) String local7 = arg0.method4388();
		@Pc(14) Class314 local14 = Static303.method7887()[arg0.method4393()];
		@Pc(21) Class103 local21 = Static208.method7270()[arg0.method4393()];
		@Pc(25) int local25 = arg0.method4391();
		@Pc(29) int local29 = arg0.method4391();
		@Pc(33) int local33 = arg0.method4393();
		@Pc(37) int local37 = arg0.method4393();
		@Pc(41) int local41 = arg0.method4393();
		@Pc(45) int local45 = arg0.method4426();
		@Pc(49) int local49 = arg0.method4426();
		@Pc(53) int local53 = arg0.method4371();
		@Pc(62) int local62 = arg0.method4371();
		@Pc(66) int local66 = arg0.method4371();
		return new Class226(local7, local14, local21, local25, local29, local33, local37, local41, local45, local49, local53, local62, local66);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIIIII)V")
	public static void method7937(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static68.anInt1583 = arg2;
		Static316.anInt5683 = arg4;
		Static142.anInt2727 = arg3;
		Static335.anInt5962 = arg0;
		Static274.anInt5078 = arg1;
		if (Static142.anInt2727 >= 100) {
			@Pc(28) int local28 = Static274.anInt5078 * 512 + 256;
			@Pc(34) int local34 = Static316.anInt5683 * 512 + 256;
			@Pc(43) int local43 = Static122.method2103(Static240.anInt4595, local28, local34) - Static68.anInt1583;
			@Pc(48) int local48 = local28 - Static333.anInt5940;
			@Pc(53) int local53 = local43 - Static350.anInt6168;
			@Pc(58) int local58 = local34 - Static216.anInt4203;
			@Pc(69) int local69 = (int) Math.sqrt((double) (local48 * local48 + local58 * local58));
			Static124.anInt2517 = (int) (Math.atan2((double) local53, (double) local69) * 2607.5945876176133D) & 0x3FFF;
			Static202.anInt4065 = (int) (Math.atan2((double) local48, (double) local58) * -2607.5945876176133D) & 0x3FFF;
			if (Static124.anInt2517 < 1024) {
				Static124.anInt2517 = 1024;
			}
			Static427.anInt7255 = 0;
			if (Static124.anInt2517 > 3072) {
				Static124.anInt2517 = 3072;
			}
		}
		Static282.anInt5182 = -1;
		Static394.anInt6810 = -1;
		Static585.anInt9461 = 2;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILclient!df;)V")
	public static void method7941(@OriginalArg(1) Class67 arg0) {
		Static254.aClass67_1 = arg0;
	}
}
