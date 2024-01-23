import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!q", name = "c", descriptor = "Lclient!vb;")
	public static Class7_Sub1 aClass7_Sub1_24;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "I")
	public static int anInt3455;

	@OriginalMember(owner = "client!q", name = "k", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "[Lclient!ri;")
	public static Class86[] aClass86Array1 = new Class86[6];

	@OriginalMember(owner = "client!q", name = "b", descriptor = "I")
	public static int anInt3453 = 0;

	@OriginalMember(owner = "client!q", name = "f", descriptor = "I")
	public static int anInt3456 = 255;

	@OriginalMember(owner = "client!q", name = "g", descriptor = "Lclient!ge;")
	public static Class39 aClass39_18 = new Class39(100);

	@OriginalMember(owner = "client!q", name = "i", descriptor = "I")
	public static int anInt3458 = 0;

	@OriginalMember(owner = "client!q", name = "m", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1194 = Static200.method3116("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!q", name = "l", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1193 = aClass60_1194;

	@OriginalMember(owner = "client!q", name = "n", descriptor = "I")
	public static int anInt3460 = 0;

	@OriginalMember(owner = "client!q", name = "o", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1195 = aClass60_1194;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIZ)V")
	public static void method2625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(11) int local11 = arg4; local11 <= arg1; local11++) {
			Static104.method1768(arg3, arg2, arg0, Static148.anIntArrayArray78[local11]);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIII)V")
	public static void method2626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static149.method2554(arg4);
		@Pc(6) int local6 = 0;
		@Pc(15) int local15 = arg4 - arg2;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(23) int local23 = -arg4;
		@Pc(25) int local25 = arg4;
		@Pc(28) int local28 = -local15;
		@Pc(30) int local30 = local15;
		@Pc(32) int local32 = -1;
		@Pc(37) int local37 = arg0 - local15;
		@Pc(41) int[] local41 = Static148.anIntArrayArray78[arg5];
		@Pc(43) int local43 = -1;
		Static104.method1768(arg0 - arg4, local37, arg1, local41);
		@Pc(57) int local57 = arg0 + local15;
		Static104.method1768(local37, local57, arg3, local41);
		Static104.method1768(local57, arg0 + arg4, arg1, local41);
		while (local25 > local6) {
			local32 += 2;
			local43 += 2;
			local23 += local43;
			local28 += local32;
			if (local28 >= 0 && local30 >= 1) {
				Static56.anIntArray170[local30] = local6;
				local30--;
				local28 -= local30 << 1;
			}
			local6++;
			@Pc(139) int[] local139;
			@Pc(125) int[] local125;
			@Pc(129) int local129;
			@Pc(133) int local133;
			@Pc(143) int local143;
			@Pc(148) int local148;
			@Pc(153) int local153;
			if (local23 >= 0) {
				local25--;
				local23 -= local25 << 1;
				if (local25 < local15) {
					local125 = Static148.anIntArrayArray78[arg5 - local25];
					local129 = Static56.anIntArray170[local25];
					local133 = arg0 + local6;
					local139 = Static148.anIntArrayArray78[arg5 + local25];
					local143 = arg0 - local6;
					local148 = arg0 + local129;
					local153 = arg0 - local129;
					Static104.method1768(local143, local153, arg1, local139);
					Static104.method1768(local153, local148, arg3, local139);
					Static104.method1768(local148, local133, arg1, local139);
					Static104.method1768(local143, local153, arg1, local125);
					Static104.method1768(local153, local148, arg3, local125);
					Static104.method1768(local148, local133, arg1, local125);
				} else {
					local139 = Static148.anIntArrayArray78[local25 + arg5];
					local129 = local6 + arg0;
					local133 = arg0 - local6;
					local125 = Static148.anIntArrayArray78[arg5 - local25];
					Static104.method1768(local133, local129, arg1, local139);
					Static104.method1768(local133, local129, arg1, local125);
				}
			}
			local139 = Static148.anIntArrayArray78[arg5 + local6];
			local125 = Static148.anIntArrayArray78[arg5 - local6];
			local129 = arg0 + local25;
			local133 = arg0 - local25;
			if (local15 <= local6) {
				Static104.method1768(local133, local129, arg1, local139);
				Static104.method1768(local133, local129, arg1, local125);
			} else {
				local143 = local30 < local6 ? Static56.anIntArray170[local6] : local30;
				local153 = arg0 - local143;
				local148 = arg0 + local143;
				Static104.method1768(local133, local153, arg1, local139);
				Static104.method1768(local153, local148, arg3, local139);
				Static104.method1768(local148, local129, arg1, local139);
				Static104.method1768(local133, local153, arg1, local125);
				Static104.method1768(local153, local148, arg3, local125);
				Static104.method1768(local148, local129, arg1, local125);
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(JZIB)Lclient!kh;")
	public static Class60 method2627(@OriginalArg(0) long arg0) {
		@Pc(26) int local26 = 1;
		@Pc(31) long local31 = arg0 / (long) 10;
		while (local31 != 0L) {
			local31 /= 10;
			local26++;
		}
		@Pc(47) int local47 = local26;
		if (arg0 < 0L) {
			local47 = local26 + 1;
		}
		@Pc(64) byte[] local64 = new byte[local47];
		if (arg0 < 0L) {
			local64[0] = 45;
		}
		for (@Pc(84) int local84 = 0; local84 < local26; local84++) {
			@Pc(92) int local92 = (int) (arg0 % (long) 10);
			arg0 /= 10;
			if (local92 < 0) {
				local92 = -local92;
			}
			if (local92 > 9) {
				local92 += 39;
			}
			local64[local47 - local84 - 1] = (byte) (local92 + 48);
		}
		@Pc(128) Class60 local128 = new Class60();
		local128.aByteArray34 = local64;
		local128.anInt2439 = local47;
		return local128;
	}
}
