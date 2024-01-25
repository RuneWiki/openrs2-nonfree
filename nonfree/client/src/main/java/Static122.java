import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!eca", name = "h", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_41 = new Class322(100, 0);

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!laa;")
	public static Class60_Sub1_Sub1 method2204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class243 local7 = Static334.aClass243ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(15) Class123 local15 = local7.aClass123_5; local15 != null; local15 = local15.aClass123_1) {
			@Pc(19) Class60_Sub1_Sub1 local19 = local15.aClass60_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local19.getClass()) && local19.aShort100 == arg1 && local19.aShort102 == arg2) {
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIBII)V")
	public static void method2206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class6_Sub2_Sub4 local14 = Static602.method8315((long) arg2 | (long) arg3 << 32, 19);
		local14.method2040();
		local14.anInt2111 = arg0;
		local14.anInt2113 = arg1;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!jc;I)Ljava/lang/String;")
	public static String method2208(@OriginalArg(0) Class6_Sub15 arg0) {
		return Static456.method6968(arg0);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!rfa;[Lclient!ta;)V")
	public static void method2209(@OriginalArg(0) Class60_Sub1 arg0, @OriginalArg(1) Class6_Sub10[] arg1) {
		@Pc(6) int local6;
		if (Static519.aBoolean663) {
			local6 = arg0.method7923(arg1);
			Static277.aClass75_7.method6682(local6, arg1);
		}
		if (Static216.aClass96Array1 == Static555.aClass96Array3) {
			@Pc(28) int local28;
			if (arg0 instanceof Class60_Sub1_Sub1) {
				local6 = ((Class60_Sub1_Sub1) arg0).aShort100;
				local28 = ((Class60_Sub1_Sub1) arg0).aShort102;
			} else {
				local6 = arg0.anInt9048 >> Static594.anInt9440;
				local28 = arg0.anInt9057 >> Static594.anInt9440;
			}
			Static277.aClass75_7.EA(Static524.aClass96Array2[0].method8077(arg0.anInt9048, arg0.anInt9057), Static547.method7749(local6, local28), Static435.method6607(local6, local28), Static395.method6084(local6, local28));
		}
		@Pc(64) Class60_Sub9 local64 = arg0.method7911(Static277.aClass75_7);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean683) {
			@Pc(74) Class60_Sub10[] local74 = local64.aClass60_Sub10Array1;
			for (@Pc(76) int local76 = 0; local76 < local74.length; local76++) {
				@Pc(81) Class60_Sub10 local81 = local74[local76];
				if (local81.aBoolean765) {
					Static494.method3707(local81.anInt10338 - local81.anInt10339, local81.anInt10340 - local81.anInt10339, local81.anInt10342 + local81.anInt10339, local81.anInt10341 + local81.anInt10339);
				}
			}
		}
		if (local64.aBoolean668) {
			local64.aClass60_Sub1_21 = arg0;
			if (Static398.aBoolean515) {
				@Pc(127) Class284 local127 = Static667.aClass284_3;
				synchronized (Static667.aClass284_3) {
					Static667.aClass284_3.method7014(local64);
					return;
				}
			}
			Static667.aClass284_3.method7014(local64);
			return;
		}
		Static288.method4731(local64);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(I[SI)[S")
	public static short[] method2210(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static695.method5642(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
