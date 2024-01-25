import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!sv", name = "r", descriptor = "Lclient!gga;")
	public static final Class120 aClass120_5 = new Class120();

	@OriginalMember(owner = "client!sv", name = "t", descriptor = "Z")
	public static boolean aBoolean759 = false;

	@OriginalMember(owner = "client!sv", name = "u", descriptor = "J")
	public static long aLong226 = 0L;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method7465(@OriginalArg(0) String arg0) {
		@Pc(5) long local5 = 0L;
		@Pc(8) int local8 = arg0.length();
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			local5 *= 37L;
			@Pc(24) char local24 = arg0.charAt(local10);
			if (local24 >= 'A' && local24 <= 'Z') {
				local5 += local24 + 1 - 65;
			} else if (local24 >= 'a' && local24 <= 'z') {
				local5 += local24 - 96;
			} else if (local24 >= '0' && local24 <= '9') {
				local5 += local24 + 27 - 48;
			}
			if (local5 >= 177917621779460413L) {
				break;
			}
		}
		while (local5 % 37L == 0L && local5 != 0L) {
			local5 /= 37L;
		}
		return local5;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method7466(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (arg0 == 0) {
			Static546.aClass15_16 = Static362.method5283(Static44.aClass254_17, Static545.aCanvas14, Static122.anInterface4_5, Static455.aClass3_Sub27_Sub1_1.anInt4798 * 2, 0);
			if (arg1 != null) {
				Static546.aClass15_16.D(0);
				@Pc(153) Class297 local153 = Static155.method2986(Static536.anInt9710, Static289.aClass254_92);
				@Pc(162) Class111 local162 = Static546.aClass15_16.method5346(local153, Static599.method813(Static579.aClass254_137, Static536.anInt9710));
				Static251.method4499();
				Static569.method8164(true, arg1, Static546.aClass15_16, local162, local153);
			}
		} else {
			@Pc(3) Class15 local3 = null;
			@Pc(22) Class297 local22;
			@Pc(31) Class111 local31;
			if (arg1 != null) {
				local3 = Static362.method5283(Static44.aClass254_17, Static545.aCanvas14, Static122.anInterface4_5, 0, 0);
				local3.D(0);
				local22 = Static155.method2986(Static536.anInt9710, Static289.aClass254_92);
				local31 = local3.method5346(local22, Static599.method813(Static579.aClass254_137, Static536.anInt9710));
				Static251.method4499();
				Static569.method8164(true, arg1, local3, local31, local22);
			}
			try {
				Static546.aClass15_16 = Static362.method5283(Static44.aClass254_17, Static545.aCanvas14, Static122.anInterface4_5, Static455.aClass3_Sub27_Sub1_1.anInt4798 * 2, arg0);
				if (arg1 != null) {
					local3.D(0);
					local22 = Static155.method2986(Static536.anInt9710, Static289.aClass254_92);
					local31 = local3.method5346(local22, Static599.method813(Static579.aClass254_137, Static536.anInt9710));
					Static251.method4499();
					Static569.method8164(true, arg1, local3, local31, local22);
				}
				if (Static546.aClass15_16.method5332()) {
					@Pc(85) boolean local85 = true;
					try {
						local85 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(95) Throwable local95) {
					}
					@Pc(101) Class3_Sub19 local101;
					if (local85) {
						local101 = Static546.aClass15_16.method5313(146800640);
					} else {
						local101 = Static546.aClass15_16.method5313(104857600);
					}
					Static546.aClass15_16.method5293(local101);
				}
			} catch (@Pc(111) Throwable local111) {
				Static546.aClass15_16 = Static362.method5283(Static44.aClass254_17, Static545.aCanvas14, Static122.anInterface4_5, 0, 0);
				arg0 = 0;
			}
			if (local3 != null) {
				try {
					local3.method5337();
				} catch (@Pc(128) Throwable local128) {
				}
			}
		}
		Static275.anInt5823 = arg0;
		Static356.method5902();
		if (!Static546.aClass15_16.method5284()) {
			Static583.anInt9699 = 1;
		}
		Static546.aClass15_16.method5304(Static583.anInt9699);
		Static546.aClass15_16.method5317(0);
		Static546.aClass15_16.JA(32);
		Static574.aClass255_9 = Static546.aClass15_16.method5294();
		Static202.aClass255_6 = Static546.aClass15_16.method5294();
		Static97.method2119();
		Static546.aClass15_16.method5282(!Static455.aClass3_Sub27_Sub1_1.aBoolean396);
		if (Static546.aClass15_16.method5279()) {
			Static200.method3363(Static455.aClass3_Sub27_Sub1_1.aBoolean380);
		}
		Static447.method7002(Static546.aClass15_16, Static460.anInt8640 >> 3, Static292.anInt7682 >> 3);
		Static423.method6761();
		Static502.aClass13Array1 = null;
		Static11.aBoolean30 = false;
		Static159.aBoolean265 = true;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BILclient!ji;II)Lclient!ch;")
	public static Class11_Sub2_Sub1 method7467(@OriginalArg(2) Class15_Sub3 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		if (arg0.aBoolean457 || Static282.method4863(arg2) && Static282.method4863(arg1)) {
			return new Class11_Sub2_Sub1(arg0, 3553, 6408, arg2, arg1);
		} else if (arg0.aBoolean446) {
			return new Class11_Sub2_Sub1(arg0, 34037, 6408, arg2, arg1);
		} else {
			return new Class11_Sub2_Sub1(arg0, 6408, arg2, arg1, Static178.method3152(arg2), Static178.method3152(arg1));
		}
	}
}
