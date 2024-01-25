import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!oh", name = "K", descriptor = "I")
	public static int anInt4417;

	@OriginalMember(owner = "client!oh", name = "cb", descriptor = "I")
	public static int anInt4433;

	@OriginalMember(owner = "client!oh", name = "bb", descriptor = "Z")
	public static boolean aBoolean375 = false;

	@OriginalMember(owner = "client!oh", name = "db", descriptor = "I")
	public static int anInt4434 = -1;

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(II)I")
	public static int method4076(@OriginalArg(1) int arg0) {
		if (Static153.aClass158_2 != null) {
			Static153.aClass158_2.method4339();
			Static153.aClass158_2 = null;
		}
		Static261.anInt5070++;
		if (Static261.anInt5070 > 4) {
			Static261.anInt5070 = 0;
			Static11.anInt5390 = 0;
			return arg0;
		}
		Static11.anInt5390 = 0;
		if (Static194.anInt3960 == anInt4433) {
			Static194.anInt3960 = Static102.anInt2099;
		} else {
			Static194.anInt3960 = anInt4433;
		}
		return -1;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!rg;BI)I")
	public static int method4077(@OriginalArg(0) Class177 arg0, @OriginalArg(2) int arg1) {
		if (!Static47.method1096(arg0).method4899(arg1) && arg0.anObjectArray14 == null) {
			return -1;
		} else if (arg0.anIntArray670 == null || arg0.anIntArray670.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray670[arg1];
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIZZB)V")
	public static void method4078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		Static309.method5207(0, arg0, arg2, arg1, arg3, Static296.aClass74_Sub1Array2.length - 1);
		Static2.aClass1_Sub15_3 = null;
		Static54.anInt3492 = 0;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIILclient!sk;Lclient!aa;I)V")
	public static void method4080(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class188 arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class185 local8 = Static28.method822(arg2.anInt5537);
		if (local8.anInt5464 == -1) {
			return;
		}
		if (arg2.aBoolean485) {
			@Pc(21) int local21 = arg1 + arg2.lb;
			arg1 = local21 & 0x3;
		} else {
			arg1 = 0;
		}
		@Pc(37) Class90 local37 = local8.method4855(arg3, arg1, arg2.aBoolean477);
		if (local37 == null) {
			return;
		}
		@Pc(50) int local50 = arg2.anInt5541;
		@Pc(53) int local53 = arg2.anInt5533;
		if ((arg1 & 0x1) == 1) {
			local50 = arg2.anInt5533;
			local53 = arg2.anInt5541;
		}
		@Pc(69) int local69 = local37.method5464();
		@Pc(72) int local72 = local37.method5467();
		if (local8.aBoolean469) {
			local72 = local53 * 4;
			local69 = local50 * 4;
		}
		if (local8.anInt5463 == 0) {
			local37.method5462(arg4, arg0 + 4 - local53 * 4, local69, local72);
		} else {
			local37.method5458(arg4, arg0 + 4 - local53 * 4, local69, local72, 1, local8.anInt5463 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ)I")
	public static int method4082(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!ke;)I")
	public static int method4084(@OriginalArg(1) Class5_Sub3_Sub3_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt3331;
		@Pc(14) Class45 local14 = arg0.method4533();
		if (arg0.aBoolean412) {
			local8 = arg0.anInt3313;
		} else if (arg0.anInt4975 == local14.anInt1490 || arg0.anInt4975 == local14.anInt1494 || local14.anInt1481 == arg0.anInt4975 || local14.anInt1489 == arg0.anInt4975) {
			local8 = arg0.anInt3308;
		} else if (local14.anInt1504 == arg0.anInt4975 || local14.anInt1476 == arg0.anInt4975 || local14.anInt1500 == arg0.anInt4975 || arg0.anInt4975 == local14.anInt1482) {
			local8 = arg0.anInt3323;
		}
		return local8;
	}
}
