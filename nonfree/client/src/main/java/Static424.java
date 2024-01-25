import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!vf", name = "D", descriptor = "Lclient!nd;")
	public static Class2_Sub32 aClass2_Sub32_3;

	@OriginalMember(owner = "client!vf", name = "G", descriptor = "Lclient!vu;")
	public static Class260 aClass260_7;

	@OriginalMember(owner = "client!vf", name = "q", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_147 = new Class211(48, 12);

	@OriginalMember(owner = "client!vf", name = "E", descriptor = "[S")
	public static final short[] aShortArray93 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!vf", name = "F", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_148 = new Class211(21, -2);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZ)I")
	public static int method5111(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
	public static void method5112(@OriginalArg(1) int arg0) {
		Static441.method5590();
		Static116.method1757();
		Static405.method5143(arg0, true);
		Static272.method3656(Static103.aClass54_28, Static82.aClass163_1, Static77.aClass54_26);
		Static449.method5643(Static103.aClass54_28, Static82.aClass163_1);
		Static310.method4243();
		Static111.method1710(Static108.aClass13Array5);
		Static204.method2721();
		Static361.method4755();
		if (Static290.anInt4777 == 2) {
			Static37.method5022(3);
		} else if (Static290.anInt4777 == 6) {
			Static37.method5022(7);
		} else if (Static290.anInt4777 == 9) {
			Static37.method5022(10);
			return;
		} else if (Static290.anInt4777 == 1) {
			Static4.method77(Static82.aClass163_1, Static103.aClass54_28);
			return;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!at;IILjava/lang/String;Lclient!la;Lclient!ta;BILclient!kt;III)V")
	public static void method5114(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) Class92 arg4, @OriginalArg(5) Class35 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class141 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(16) int local16;
		if (Static414.anInt6776 == 4) {
			local16 = (int) Static113.aFloat19 & 0x3FFF;
		} else {
			local16 = Static363.anInt6120 + (int) Static113.aFloat19 & 0x3FFF;
		}
		@Pc(37) int local37 = Math.max(arg0.anInt294 / 2, arg0.anInt285 / 2) + 10;
		@Pc(45) int local45 = arg2 * arg2 + arg9 * arg9;
		if (local45 > local37 * local37) {
			return;
		}
		@Pc(55) int local55 = Class155.anIntArray342[local16];
		@Pc(59) int local59 = Class155.anIntArray341[local16];
		if (Static414.anInt6776 != 4) {
			local59 = local59 * 256 / (Static454.anInt7274 + 256);
			local55 = local55 * 256 / (Static454.anInt7274 + 256);
		}
		@Pc(90) int local90 = arg9 * local59 + local55 * arg2 >> 15;
		@Pc(100) int local100 = local59 * arg2 - local55 * arg9 >> 15;
		@Pc(107) int local107 = arg7.method2906(null, 100, arg3);
		@Pc(113) int local113 = local90 - local107 / 2;
		@Pc(121) int local121 = arg7.method2908(arg3, null);
		if (-arg0.anInt294 <= local113 && arg0.anInt294 >= local113 && local100 >= -arg0.anInt285 && arg0.anInt285 >= local100) {
			arg4.method4517(arg5, local107, arg8 + local113 + arg0.anInt294 / 2, -local121 + -local100 + arg1 + (arg0.anInt285 / 2 - arg6), arg1, 0, arg8, null, null, arg10, arg3, 50, 0);
		}
	}
}
