import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "[I")
	public static final int[] anIntArray322 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
	public static int anInt3867 = 0;

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "[I")
	public static final int[] anIntArray323 = new int[100];

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_95 = new Class7("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
	public static int anInt3872 = 0;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V")
	public static void method3275() {
		if (Static88.aBoolean115) {
			return;
		}
		if (Static38.aClass135_Sub1_1.aBoolean362) {
			Static142.aFloat89 = (int) Static142.aFloat89 + 191 & 0xFFFFFF80;
		} else {
			Static245.aFloat66 += (24.0F - Static245.aFloat66) / 2.0F;
		}
		Static84.aBoolean109 = true;
		Static88.aBoolean115 = true;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)V")
	public static void method3276() {
		Static336.aBoolean405 = true;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIII)V")
	public static void method3278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static149.method5330(arg5);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg5 - arg3;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(23) int local23 = arg5;
		@Pc(26) int local26 = -arg5;
		@Pc(28) int local28 = local14;
		@Pc(31) int local31 = -local14;
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = -1;
		@Pc(58) int local58;
		@Pc(66) int local66;
		@Pc(75) int local75;
		@Pc(83) int local83;
		if (arg0 >= Static108.anInt2276 && Static173.anInt3208 >= arg0) {
			@Pc(49) int[] local49 = Static163.anIntArrayArray35[arg0];
			local58 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg2 - arg5);
			local66 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg5 + arg2);
			local75 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg2 - local14);
			local83 = Static87.method1619(Static125.anInt2545, Static28.anInt644, local14 + arg2);
			Static59.method1261(local49, local75, local58, arg4);
			Static59.method1261(local49, local83, local75, arg1);
			Static59.method1261(local49, local66, local83, arg4);
		}
		while (local23 > local10) {
			local33 += 2;
			local35 += 2;
			local31 += local35;
			local26 += local33;
			if (local31 >= 0 && local28 >= 1) {
				local28--;
				Static152.anIntArray262[local28] = local10;
				local31 -= local28 << 1;
			}
			local10++;
			@Pc(189) int local189;
			@Pc(197) int local197;
			@Pc(204) int[] local204;
			@Pc(144) int local144;
			if (local26 >= 0) {
				local23--;
				local26 -= local23 << 1;
				local144 = arg0 - local23;
				local58 = local23 + arg0;
				if (local58 >= Static108.anInt2276 && local144 <= Static173.anInt3208) {
					if (local14 > local23) {
						local66 = Static152.anIntArray262[local23];
						local75 = Static87.method1619(Static125.anInt2545, Static28.anInt644, local10 + arg2);
						local83 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg2 - local10);
						local189 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg2 + local66);
						local197 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg2 - local66);
						if (Static173.anInt3208 >= local58) {
							local204 = Static163.anIntArrayArray35[local58];
							Static59.method1261(local204, local197, local83, arg4);
							Static59.method1261(local204, local189, local197, arg1);
							Static59.method1261(local204, local75, local189, arg4);
						}
						if (Static108.anInt2276 <= local144) {
							local204 = Static163.anIntArrayArray35[local144];
							Static59.method1261(local204, local197, local83, arg4);
							Static59.method1261(local204, local189, local197, arg1);
							Static59.method1261(local204, local75, local189, arg4);
						}
					} else {
						local66 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg2 + local10);
						local75 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg2 - local10);
						if (Static173.anInt3208 >= local58) {
							Static59.method1261(Static163.anIntArrayArray35[local58], local66, local75, arg4);
						}
						if (Static108.anInt2276 <= local144) {
							Static59.method1261(Static163.anIntArrayArray35[local144], local66, local75, arg4);
						}
					}
				}
			}
			local144 = arg0 - local10;
			local58 = local10 + arg0;
			if (local58 >= Static108.anInt2276 && Static173.anInt3208 >= local144) {
				local66 = arg2 + local23;
				local75 = arg2 - local23;
				if (local66 >= Static28.anInt644 && local75 <= Static125.anInt2545) {
					local66 = Static87.method1619(Static125.anInt2545, Static28.anInt644, local66);
					local75 = Static87.method1619(Static125.anInt2545, Static28.anInt644, local75);
					if (local14 > local10) {
						local83 = local28 < local10 ? Static152.anIntArray262[local10] : local28;
						local189 = Static87.method1619(Static125.anInt2545, Static28.anInt644, local83 + arg2);
						local197 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg2 - local83);
						if (local58 <= Static173.anInt3208) {
							local204 = Static163.anIntArrayArray35[local58];
							Static59.method1261(local204, local197, local75, arg4);
							Static59.method1261(local204, local189, local197, arg1);
							Static59.method1261(local204, local66, local189, arg4);
						}
						if (local144 >= Static108.anInt2276) {
							local204 = Static163.anIntArrayArray35[local144];
							Static59.method1261(local204, local197, local75, arg4);
							Static59.method1261(local204, local189, local197, arg1);
							Static59.method1261(local204, local66, local189, arg4);
						}
					} else {
						if (local58 <= Static173.anInt3208) {
							Static59.method1261(Static163.anIntArrayArray35[local58], local66, local75, arg4);
						}
						if (local144 >= Static108.anInt2276) {
							Static59.method1261(Static163.anIntArrayArray35[local144], local66, local75, arg4);
						}
					}
				}
			}
		}
	}
}
