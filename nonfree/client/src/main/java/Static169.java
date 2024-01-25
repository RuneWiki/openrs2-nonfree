import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "Lclient!ew;")
	public static Class99 aClass99_2;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_44 = new Class349(6, 0);

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_31 = new Class154(15, 6);

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;")
	public static String method2207(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(21) String local21 = arg0[arg1];
			return local21 == null ? "null" : local21.toString();
		} else {
			@Pc(32) int local32 = arg2 + arg1;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = arg1; local36 < local32; local36++) {
				@Pc(42) String local42 = arg0[local36];
				if (local42 == null) {
					local34 += 4;
				} else {
					local34 += local42.length();
				}
			}
			@Pc(65) StringBuffer local65 = new StringBuffer(local34);
			for (@Pc(67) int local67 = arg1; local67 < local32; local67++) {
				@Pc(76) String local76 = arg0[local67];
				if (local76 == null) {
					local65.append("null");
				} else {
					local65.append(local76);
				}
			}
			return local65.toString();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BZ)V")
	public static void method2209(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static476.aClass2_Sub2_Sub9_3 != null) {
			Static138.anInt2261 = Static476.aClass2_Sub2_Sub9_3.anInt3270;
		} else {
			Static138.anInt2261 = -1;
		}
		Static177.aClass70_9 = null;
		Static559.anInt9135 = 0;
		Static476.aClass2_Sub2_Sub9_3 = null;
		Static176.aClass273_5 = null;
		Static476.method6115();
		Static476.aClass70_47.method1265();
		Static317.anInt5332 = -1;
		Static212.aClass200_4 = null;
		Static94.aClass200_2 = null;
		Static115.aClass200_3 = null;
		Static246.aClass200_5 = null;
		Static343.aClass200_8 = null;
		Static86.aClass38_9 = null;
		Static290.aClass200_6 = null;
		Static187.anInt8961 = -1;
		Static336.aClass200_7 = null;
		Static75.aClass200_1 = null;
		Static476.aClass214_3 = null;
		if (Static476.aClass360_4 != null) {
			Static476.aClass360_4.method7574();
			Static476.aClass360_4.method7571(128, 64);
		}
		if (Static476.aClass212_5 != null) {
			Static476.aClass212_5.method4406(64, 64);
		}
		if (Static476.aClass290_4 != null) {
			Static476.aClass290_4.method5801(64);
		}
		Static31.aClass145_1.method2544(64);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!mq;IIILclient!lt;ILclient!u;)V")
	public static void method2211(@OriginalArg(0) int arg0, @OriginalArg(1) Class12_Sub2_Sub1_Sub4_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class216 arg5, @OriginalArg(7) Class12_Sub2_Sub1_Sub4_Sub2 arg6) {
		@Pc(11) Class2_Sub40 local11 = new Class2_Sub40();
		local11.anInt7186 = arg4;
		local11.anInt7184 = arg3 << 9;
		local11.anInt7178 = arg0 << 9;
		if (arg5 != null) {
			local11.aClass216_1 = arg5;
			@Pc(32) int local32 = arg5.anInt5287;
			@Pc(35) int local35 = arg5.anInt5244;
			if (arg2 == 1 || arg2 == 3) {
				local35 = arg5.anInt5287;
				local32 = arg5.anInt5244;
			}
			local11.anInt7173 = arg5.anInt5265 << 9;
			local11.anInt7187 = arg0 + local32 << 9;
			local11.anInt7185 = arg5.anInt5240;
			local11.aBoolean592 = arg5.aBoolean405;
			local11.anInt7175 = arg5.anInt5250;
			local11.anInt7192 = arg5.anInt5252;
			local11.aBoolean591 = arg5.aBoolean404;
			local11.anInt7190 = arg5.anInt5239;
			local11.anInt7174 = arg5.anInt5258;
			local11.anInt7188 = arg3 + local35 << 9;
			local11.anInt7176 = arg5.anInt5249;
			local11.anIntArray485 = arg5.anIntArray360;
			if (arg5.anIntArray362 != null) {
				local11.aBoolean593 = true;
				local11.method5859();
			}
			if (local11.anIntArray485 != null) {
				local11.anInt7180 = local11.anInt7192 + (int) (Math.random() * (double) (local11.anInt7174 - local11.anInt7192));
			}
			Static249.aClass70_26.method1269(local11);
		} else if (arg6 != null) {
			local11.aClass12_Sub2_Sub1_Sub4_Sub2_2 = arg6;
			@Pc(145) Class295 local145 = arg6.aClass295_1;
			if (local145.anIntArray493 != null) {
				local11.aBoolean593 = true;
				local145 = local145.method5942(Static426.aClass160_1);
			}
			if (local145 != null) {
				local11.anInt7187 = arg0 + local145.anInt7362 << 9;
				local11.anInt7188 = arg3 + local145.anInt7362 << 9;
				local11.anInt7190 = Static473.method6141(arg6);
				local11.anInt7185 = local145.anInt7341;
				local11.anInt7175 = local145.anInt7335;
				local11.anInt7173 = local145.anInt7324 << 9;
				local11.aBoolean592 = local145.aBoolean616;
				local11.anInt7176 = local145.anInt7346;
			}
			Static524.aClass70_58.method1269(local11);
		} else if (arg1 != null) {
			local11.aClass12_Sub2_Sub1_Sub4_Sub1_24 = arg1;
			local11.anInt7187 = arg1.method6777() + arg0 << 9;
			local11.anInt7188 = arg3 + arg1.method6777() << 9;
			local11.anInt7190 = Static542.method5365(arg1);
			local11.anInt7175 = arg1.anInt5820;
			local11.aBoolean592 = arg1.aBoolean458;
			local11.anInt7185 = 256;
			local11.anInt7176 = 256;
			local11.anInt7173 = arg1.anInt5821 << 9;
			Static399.aClass90_23.method1684(local11, (long) arg1.anInt8406);
		}
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)V")
	public static void method2212() {
		Static84.anInt9548 = 0;
		for (@Pc(9) int local9 = 0; local9 < 2048; local9++) {
			Static316.aClass2_Sub7Array1[local9] = null;
			Static12.aByteArray5[local9] = 1;
			Static261.aClass20Array1[local9] = null;
		}
	}
}
