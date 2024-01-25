import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!qq", name = "m", descriptor = "I")
	public static int anInt5033;

	@OriginalMember(owner = "client!qq", name = "o", descriptor = "Lclient!b;")
	public static Class20 aClass20_70;

	@OriginalMember(owner = "client!qq", name = "q", descriptor = "I")
	public static int anInt5034;

	@OriginalMember(owner = "client!qq", name = "r", descriptor = "[Lclient!tr;")
	public static Class110[] aClass110Array11;

	@OriginalMember(owner = "client!qq", name = "s", descriptor = "Lclient!pc;")
	public static Class52 aClass52_1;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "Lclient!us;")
	public static final Class234 aClass234_100 = new Class234(90, 1);

	@OriginalMember(owner = "client!qq", name = "j", descriptor = "Lclient!us;")
	public static final Class234 aClass234_101 = new Class234(93, 8);

	@OriginalMember(owner = "client!qq", name = "k", descriptor = "Lclient!us;")
	public static final Class234 aClass234_102 = new Class234(84, 8);

	@OriginalMember(owner = "client!qq", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[8];

	@OriginalMember(owner = "client!qq", name = "p", descriptor = "[I")
	public static final int[] anIntArray561 = new int[50];

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIILclient!dt;Lclient!np;BLclient!sm;)V")
	public static void method4515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class62 arg5, @OriginalArg(6) Class155 arg6, @OriginalArg(8) Class38 arg7) {
		@Pc(10) Class196 local10 = Static326.aClass195_4.method4500(arg4);
		if (local10 == null || !local10.aBoolean398 || !local10.method4505(Static331.aClass115_1)) {
			return;
		}
		@Pc(30) int local30;
		if (local10.anIntArray558 != null) {
			@Pc(28) int[] local28 = new int[local10.anIntArray558.length];
			@Pc(42) int local42;
			for (local30 = 0; local30 < local28.length / 2; local30++) {
				if (Static88.anInt1815 == 4) {
					local42 = (int) Static352.aFloat68 & 0x3FFF;
				} else {
					local42 = Static129.anInt2435 + (int) Static352.aFloat68 & 0x3FFF;
				}
				@Pc(53) int local53 = Class226.anIntArray614[local42];
				@Pc(57) int local57 = Class226.anIntArray613[local42];
				if (Static88.anInt1815 != 4) {
					local57 = local57 * 256 / (Static187.anInt3396 + 256);
					local53 = local53 * 256 / (Static187.anInt3396 + 256);
				}
				local28[local30 * 2] = (local53 * (local10.anIntArray558[local30 * 2 + 1] * 4 + arg3) + local57 * (local10.anIntArray558[local30 * 2] * 4 + arg0) >> 15) + arg1 + arg5.anInt1546 / 2;
				local28[local30 * 2 + 1] = arg2 + arg5.anInt1551 / 2 - ((arg3 + local10.anIntArray558[local30 * 2 + 1] * 4) * local57 - local53 * (arg0 + local10.anIntArray558[local30 * 2] * 4) >> 15);
			}
			Static360.method5367(arg6, local28, local10.anInt4998, arg5.anIntArray155, arg5.anIntArray156);
			for (local42 = 0; local42 < local28.length / 2 - 1; local42++) {
				arg6.method4916(local28[local42 * 2], local28[local42 * 2 + 1], local28[local42 * 2 + 2], local28[local42 * 2 + 2 + 1], local10.anInt5017, arg7, arg1, arg2);
			}
			arg6.method4916(local28[local28.length - 2], local28[local28.length - 1], local28[0], local28[1], local10.anInt5017, arg7, arg1, arg2);
		}
		@Pc(261) Class110 local261 = null;
		if (local10.anInt4994 != -1) {
			local261 = local10.method4508(false, arg6);
			if (local261 != null) {
				Static342.method5171(arg3, local261, arg1, arg7, arg0, arg2, arg5);
			}
		}
		if (local10.aString53 == null) {
			return;
		}
		local30 = 0;
		if (local261 != null) {
			local30 = local261.method5090();
		}
		@Pc(294) Class150 local294 = Static71.aClass150_1;
		@Pc(296) Class190 local296 = Static316.aClass190_8;
		if (local10.anInt5011 == 1) {
			local294 = Static140.aClass150_3;
			local296 = Static61.aClass190_1;
		}
		if (local10.anInt5011 == 2) {
			local294 = Static95.aClass150_6;
			local296 = Static366.aClass190_7;
		}
		Static158.method2451(arg3, arg2, local30, local294, arg1, local10.anInt5012, arg0, arg5, arg7, local296, local10.aString53);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIILclient!wm;Lclient!wm;)V")
	public static void method4516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class28_Sub4 arg3, @OriginalArg(4) Class28_Sub4 arg4) {
		@Pc(4) Class48 local4 = Static382.method5674(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass28_Sub4_2 = arg3;
			local4.aClass28_Sub4_1 = arg4;
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IB)V")
	public static void method4517(@OriginalArg(0) int arg0) {
		Static21.anInt266 = arg0;
		Static186.aClass139_39.method3075();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!oh;ILjava/lang/String;Z)V")
	public static void method4519(@OriginalArg(0) Class150 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(22) int local22 = Static61.aClass190_1.method4350(null, arg1, 250);
		@Pc(31) int local31 = Static61.aClass190_1.method4353(arg1, null, 250) * 13;
		Static347.aClass155_9.method4896(6, 6, local22 + 4 + 4, local31 + 4 + 4, -16777216, 0);
		Static347.aClass155_9.method4855(6, 6, local22 + 8, local31 - -4 - -4, -1, 0);
		arg0.method5730(10, null, 1, 1, 0, -1, 0, -1, null, local31, 10, local22, arg1, 0, null);
		Static203.method3170(6, 6, local22 + 8, local31 + 8);
		if (arg2) {
			Static347.aClass155_9.method4894();
		}
	}
}
