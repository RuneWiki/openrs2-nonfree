import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "Lclient!qg;")
	public static Class87 aClass87_4;

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "Lclient!gv;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ca", name = "r", descriptor = "J")
	public static long aLong44 = 0L;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLclient!tb;)I")
	public static int method958(@OriginalArg(1) Class6_Sub40 arg0) {
		@Pc(7) String local7 = Static105.method1871(arg0);
		@Pc(9) int[] local9 = null;
		if (Static49.method1093(arg0.anInt6722)) {
			local9 = Static380.aClass231_2.method5648((int) arg0.aLong192).anIntArray8;
		} else if (arg0.anInt6721 != -1) {
			local9 = Static380.aClass231_2.method5648(arg0.anInt6721).anIntArray8;
		} else if (Static428.method6233(arg0.anInt6722)) {
			@Pc(84) Class3_Sub2_Sub1_Sub1 local84 = Static308.aClass3_Sub2_Sub1_Sub1Array1[(int) arg0.aLong192];
			if (local84 != null) {
				@Pc(89) Class48 local89 = local84.aClass48_1;
				if (local89.anIntArray103 != null) {
					local89 = local89.method1378(Static393.aClass207_1);
				}
				if (local89 != null) {
					local9 = local89.anIntArray104;
				}
			}
		} else if (Static86.method822(arg0.anInt6722)) {
			@Pc(52) Class106 local52;
			if (arg0.anInt6722 == 1002) {
				local52 = Static448.aClass104_4.method2616((int) arg0.aLong192);
			} else {
				local52 = Static448.aClass104_4.method2616((int) (arg0.aLong192 >>> 32 & 0x7FFFFFFFL));
			}
			if (local52.anIntArray188 != null) {
				local52 = local52.method2625(Static393.aClass207_1);
			}
			if (local52 != null) {
				local9 = local52.anIntArray191;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static221.method3327(local9);
		}
		@Pc(130) int local130 = Static237.aClass166_8.method3884(local7, Static58.aClass87Array8);
		if (arg0.aBoolean429) {
			local130 += Static172.aClass87_11.method6555() + 4;
		}
		return local130;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBI)Ljava/lang/String;")
	public static String method959(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)V")
	public static void method960(@OriginalArg(0) int arg0) {
		Static244.anInt7797 = arg0;
		Static24.aClass44_2.method1351();
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(IB)V")
	public static void method961(@OriginalArg(0) int arg0) {
		Static285.method5698();
		@Pc(19) int local19 = Static447.aClass257_10.method6296(arg0).anInt1882;
		if (local19 == 0) {
			return;
		}
		@Pc(27) int local27 = Static393.aClass207_1.anIntArray381[arg0];
		if (local19 == 5) {
			Static14.anInt440 = local27;
		}
		if (local19 == 6) {
			Static370.anInt6672 = local27;
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	public static void method963() {
		Static151.anInt3129 = 0;
		Static292.aClass244_25.method5969();
		Static292.aClass244_25.method5966(Static445.aClass6_Sub40_2);
		Static151.anInt3129++;
	}
}
