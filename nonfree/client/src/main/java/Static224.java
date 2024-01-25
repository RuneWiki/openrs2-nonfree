import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_137 = new Class92(10, 2);

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray35 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "[I")
	public static final int[] anIntArray327 = new int[2048];

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "Lclient!jd;")
	public static final Class119 aClass119_12 = new Class119(0, 2, 2, 1);

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "[F")
	public static final float[] aFloatArray31 = new float[4];

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZII)V")
	public static void method3526(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			Static414.method5552(Static340.aClass92_207);
		}
		if (arg2 == 1) {
			Static414.method5552(Static101.aClass92_75);
		}
		Static302.aClass3_Sub2_Sub2_2.method6001(Static19.aClass16_1.method580(82) ? 1 : 0);
		Static302.aClass3_Sub2_Sub2_2.method5996(arg1 + Static108.anInt3458);
		Static302.aClass3_Sub2_Sub2_2.method6002(Static339.anInt6223 + arg0);
		Static196.aBoolean301 = false;
		Static116.anInt6680 = arg0;
		Static388.anInt6735 = arg1;
		Static279.method5819();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!eo;I)V")
	public static void method3527(@OriginalArg(0) Class68 arg0) {
		if (!Static59.aBoolean111) {
			return;
		}
		if (arg0.anObjectArray23 != null) {
			@Pc(14) Class68 local14 = Static347.method4975(Static295.anInt5382, Static207.anInt4138);
			if (local14 != null) {
				@Pc(20) Class3_Sub20 local20 = new Class3_Sub20();
				local20.aClass68_4 = arg0;
				local20.anObjectArray35 = arg0.anObjectArray23;
				local20.aClass68_5 = local14;
				Static272.method4044(local20);
			}
		}
		Static414.method5552(Static67.aClass92_52);
		Static302.aClass3_Sub2_Sub2_2.method6008(arg0.anInt2177);
		Static302.aClass3_Sub2_Sub2_2.method6045(Static207.anInt4138);
		Static302.aClass3_Sub2_Sub2_2.method6043(Static295.anInt5382);
		Static302.aClass3_Sub2_Sub2_2.method6042(Static455.anInt5935);
		Static302.aClass3_Sub2_Sub2_2.method6045(arg0.anInt2192);
		Static302.aClass3_Sub2_Sub2_2.method6042(arg0.anInt2187);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZ)Z")
	public static boolean method3528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIILclient!nm;Lclient!nm;)V")
	public static void method3531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub5 arg3, @OriginalArg(4) Class1_Sub5 arg4) {
		@Pc(4) Class217 local4 = Static344.method4926(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass1_Sub5_2 = arg3;
			local4.aClass1_Sub5_3 = arg4;
		}
	}
}
