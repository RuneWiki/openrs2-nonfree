import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!s", name = "i", descriptor = "I")
	public static int anInt4656;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "I")
	public static int anInt4651 = 0;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "[I")
	public static final int[] anIntArray570 = new int[5];

	@OriginalMember(owner = "client!s", name = "h", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger5 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZ)V")
	public static void method4081(@OriginalArg(0) boolean arg0) {
		Static6.anInt170--;
		if (Static6.anInt170 == 0) {
			Static198.anIntArray439 = null;
		}
		if (!arg0) {
			return;
		}
		Static275.anInt4897--;
		if (Static275.anInt4897 == 0) {
			Static69.anIntArray170 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method4082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg0 - arg1;
		if (local13 < -9) {
			return "<col=ff0000>";
		} else if (local13 < -6) {
			return "<col=ff3000>";
		} else if (local13 < -3) {
			return "<col=ff7000>";
		} else if (local13 < 0) {
			return "<col=ffb000>";
		} else if (local13 > 9) {
			return "<col=00ff00>";
		} else if (local13 > 6) {
			return "<col=40ff00>";
		} else if (local13 > 3) {
			return "<col=80ff00>";
		} else if (local13 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method4083(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class2_Sub1_Sub2 local8 = Static323.method4982(arg0, 3);
		local8.method410();
		local8.aString1 = arg1;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIB)V")
	public static void method4085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static332.anInt5823 <= arg2 && Static202.anInt3722 >= arg2) {
			@Pc(15) int local15 = Static355.method5388(Static313.anInt5542, arg3, Static345.anInt6084);
			@Pc(21) int local21 = Static355.method5388(Static313.anInt5542, arg1, Static345.anInt6084);
			Static281.method4317(arg2, local15, arg0, local21);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
	public static void method4088() {
		for (@Pc(10) Class2_Sub3 local10 = (Class2_Sub3) Static365.aClass210_19.method5035(); local10 != null; local10 = (Class2_Sub3) Static365.aClass210_19.method5037()) {
			if (Static297.aClass227ArrayArrayArray7 == null) {
				local10.method5745();
			} else {
				@Pc(28) int local28;
				@Pc(38) Class12_Sub2 local38;
				@Pc(51) Class12_Sub2_Sub3 local51;
				@Pc(134) Class12_Sub5 local134;
				@Pc(90) Class12_Sub1 local90;
				@Pc(169) Class12_Sub4 local169;
				@Pc(147) Class12_Sub5_Sub3 local147;
				@Pc(182) Class12_Sub4_Sub3 local182;
				if (local10.anInt153 <= Static295.anInt5281) {
					local28 = Static223.anIntArray504[local10.anInt151];
					if (local28 == 0) {
						local38 = Static252.method4000(local10.anInt157, local10.anInt149, local10.anInt156);
						if (local38 instanceof Class12_Sub2_Sub3) {
							Static34.method765(local10.anInt157, local10.anInt149, local10.anInt156);
							local51 = (Class12_Sub2_Sub3) local38;
							if (local51.aClass12_Sub2_1 != null) {
								Static213.method3601(local10.anInt157, local10.anInt149, local10.anInt156, local51.aClass12_Sub2_1, null);
							}
						}
					} else if (local28 == 1) {
						local169 = Static221.method3733(local10.anInt157, local10.anInt149, local10.anInt156);
						if (local169 instanceof Class12_Sub4_Sub3) {
							Static62.method1135(local10.anInt157, local10.anInt149, local10.anInt156);
							local182 = (Class12_Sub4_Sub3) local169;
							if (local182.aClass12_Sub4_1 != null) {
								Static344.method5461(local10.anInt157, local10.anInt149, local10.anInt156, local182.aClass12_Sub4_1, null);
							}
						}
					} else if (local28 == 2) {
						local90 = Static86.method4712(local10.anInt157, local10.anInt149, local10.anInt156, wk.class);
						if (local90 instanceof Class12_Sub1_Sub3) {
							Static249.method3984(local10.anInt157, local10.anInt149, local10.anInt156, wk.class);
							@Pc(111) Class12_Sub1_Sub3 local111 = (Class12_Sub1_Sub3) local90;
							if (local111.aClass12_Sub1_1 != null) {
								Static326.method5033(local111.aClass12_Sub1_1, false);
							}
						}
					} else if (local28 == 3) {
						local134 = Static240.method3889(local10.anInt157, local10.anInt149, local10.anInt156);
						if (local134 instanceof Class12_Sub5_Sub3) {
							Static217.method3693(local10.anInt157, local10.anInt149, local10.anInt156);
							local147 = (Class12_Sub5_Sub3) local134;
							if (local147.aClass12_Sub5_1 != null) {
								Static149.method2527(local10.anInt157, local10.anInt149, local10.anInt156, local147.aClass12_Sub5_1);
							}
						}
					}
					local10.method5745();
				} else if (Static295.anInt5281 == local10.anInt155) {
					local28 = Static223.anIntArray504[local10.anInt151];
					if (local28 == 0) {
						local38 = Static252.method4000(local10.anInt157, local10.anInt149, local10.anInt156);
						if (local38 instanceof Class12_Sub2_Sub3) {
							local10.method5745();
						} else if (Static68.method1245(local10.anInt157, local10.anInt149, local10.anInt156) == null) {
							local51 = new Class12_Sub2_Sub3(local10.anInt151, local10.anInt161, local10.anInt145, local10.anInt148, local10.anInt146, local38);
							Static213.method3601(local10.anInt157, local10.anInt149, local10.anInt156, local51, null);
						} else {
							local10.method5745();
						}
					} else if (local28 == 1) {
						local169 = Static221.method3733(local10.anInt157, local10.anInt149, local10.anInt156);
						if (local169 instanceof Class12_Sub4_Sub3) {
							local10.method5745();
						} else if (Static159.method2667(local10.anInt157, local10.anInt149, local10.anInt156) == null) {
							local182 = new Class12_Sub4_Sub3(local10.anInt151, local10.anInt161, local10.anInt145, local10.anInt148, local10.anInt146, local169);
							Static344.method5461(local10.anInt157, local10.anInt149, local10.anInt156, local182, null);
						} else {
							local10.method5745();
						}
					} else if (local28 == 2) {
						local90 = Static86.method4712(local10.anInt157, local10.anInt149, local10.anInt156, wk.class);
						if (local90 instanceof Class12_Sub1_Sub3) {
							local10.method5745();
						} else {
							Static249.method3984(local10.anInt157, local10.anInt149, local10.anInt156, wk.class);
							@Pc(271) Class34 local271 = Static11.aClass123_5.method2703(local10.anInt160);
							@Pc(285) int local285;
							@Pc(282) int local282;
							if (local10.anInt161 == 1 || local10.anInt161 == 3) {
								local285 = local271.anInt808;
								local282 = local271.lb;
							} else {
								local282 = local271.anInt808;
								local285 = local271.lb;
							}
							@Pc(327) Class12_Sub1_Sub3 local327 = new Class12_Sub1_Sub3(local10.anInt151, local10.anInt161, local10.anInt157, local10.anInt145, local10.anInt148, local10.anInt146, local10.anInt149, local285 + local10.anInt149 - 1, local10.anInt156, local10.anInt156 + local282 - 1, local90);
							Static326.method5033(local327, false);
						}
					} else if (local28 == 3) {
						local134 = Static240.method3889(local10.anInt157, local10.anInt149, local10.anInt156);
						if (local134 instanceof Class12_Sub5_Sub3) {
							local10.method5745();
						} else {
							local147 = new Class12_Sub5_Sub3(local10.anInt145, local10.anInt148, local10.anInt146, local134);
							Static149.method2527(local10.anInt157, local10.anInt149, local10.anInt156, local147);
						}
					}
				}
			}
		}
	}
}
