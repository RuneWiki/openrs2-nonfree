import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "[I")
	public static int[] anIntArray34;

	@OriginalMember(owner = "client!ah", name = "s", descriptor = "Lclient!ag;")
	public static Class4 aClass4_9;

	@OriginalMember(owner = "client!ah", name = "u", descriptor = "Lclient!da;")
	public static Class1_Sub2_Sub5 aClass1_Sub2_Sub5_1;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "Lclient!dd;")
	public static Class13 aClass13_138 = Static161.method2971("(U0a )2 via: ");

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "Lclient!l;")
	public static Class45 aClass45_2 = new Class45(4096);

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "Lclient!dd;")
	private static Class13 aClass13_140 = Static161.method2971("Loaded fonts");

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "Lclient!dd;")
	public static Class13 aClass13_139 = aClass13_140;

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
	public static int anInt287 = 1;

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
	public static int anInt289 = 0;

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "Lclient!dd;")
	public static Class13 aClass13_141 = Static161.method2971("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
	public static int anInt293 = 0;

	@OriginalMember(owner = "client!ah", name = "r", descriptor = "Lclient!dd;")
	private static Class13 aClass13_142 = Static161.method2971("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!ah", name = "t", descriptor = "Lclient!dd;")
	public static Class13 aClass13_143 = aClass13_142;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
	public static void method303() {
		aClass4_9 = null;
		aClass13_143 = null;
		aClass1_Sub2_Sub5_1 = null;
		aClass13_139 = null;
		aClass13_138 = null;
		aClass13_140 = null;
		aClass13_142 = null;
		aClass13_141 = null;
		anIntArray34 = null;
		aClass45_2 = null;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIBII)V")
	public static void method304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 1 || arg0 < 1 || arg2 > 102 || arg0 > 102) {
			return;
		}
		if (Static30.aBoolean72 && Static156.anInt3696 != arg4) {
			return;
		}
		@Pc(31) long local31 = 0L;
		if (arg1 == 0) {
			local31 = Static99.method1994(arg4, arg2, arg0);
		}
		if (arg1 == 1) {
			local31 = Static49.method1232(arg4, arg2, arg0);
		}
		if (arg1 == 2) {
			local31 = Static77.method1587(arg4, arg2, arg0);
		}
		if (arg1 == 3) {
			local31 = Static50.method1243(arg4, arg2, arg0);
		}
		if (local31 != 0L) {
			@Pc(79) int local79 = Integer.MAX_VALUE & (int) (local31 >>> 32);
			@Pc(86) int local86 = (int) local31 >> 14 & 0x1F;
			@Pc(93) int local93 = (int) local31 >> 20 & 0x3;
			@Pc(106) Class1_Sub2_Sub14 local106;
			if (arg1 == 0) {
				Static170.method2790(arg4, arg2, arg0);
				local106 = Static4.method79(local79);
				if (local106.anInt3320 != 0) {
					Static149.aClass12Array1[arg4].method821(local106.aBoolean257, local93, arg2, local86, arg0);
				}
			}
			if (arg1 == 1) {
				Static131.method2377(arg4, arg2, arg0);
			}
			if (arg1 == 2) {
				Static59.method1375(arg4, arg2, arg0);
				local106 = Static4.method79(local79);
				if (local106.anInt3302 + arg2 > 103 || arg0 + local106.anInt3302 > 103 || local106.anInt3314 + arg2 > 103 || local106.anInt3314 + arg0 > 103) {
					return;
				}
				if (local106.anInt3320 != 0) {
					Static149.aClass12Array1[arg4].method818(arg2, local93, local106.aBoolean257, local106.anInt3302, local106.anInt3314, arg0);
				}
			}
			if (arg1 == 3) {
				Static187.method3028(arg4, arg2, arg0);
				local106 = Static4.method79(local79);
				if (local106.anInt3320 == 1) {
					Static149.aClass12Array1[arg4].method817(arg0, arg2);
				}
			}
		}
		if (arg6 < 0) {
			return;
		}
		@Pc(221) int local221 = arg4;
		if (arg4 < 3 && (Static35.aByteArrayArrayArray20[1][arg2][arg0] & 0x2) == 2) {
			local221 = arg4 + 1;
		}
		Static4.method77(arg6, arg2, arg0, Static149.aClass12Array1[arg4], arg4, arg3, arg5, local221);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBIII)I")
	public static int method305(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class1_Sub2_Sub1_Sub2.anIntArray38[arg0 * 1024 / arg3] >> 1;
		return (arg1 * local21 >> 16) + (arg2 * (65536 - local21) >> 16);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!ag;)V")
	public static void method306(@OriginalArg(1) Class4 arg0) {
		aClass4_9 = arg0;
		Static118.anInt3117 = aClass4_9.method2260(16);
	}
}
