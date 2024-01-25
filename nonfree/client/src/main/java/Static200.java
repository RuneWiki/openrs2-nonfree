import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
	public static int anInt4040;

	@OriginalMember(owner = "client!hba", name = "f", descriptor = "I")
	public static final int anInt4042 = 1405;

	@OriginalMember(owner = "client!hba", name = "g", descriptor = "Lclient!jg;")
	public static final Class160 aClass160_4 = new Class160();

	@OriginalMember(owner = "client!hba", name = "h", descriptor = "Lclient!lf;")
	public static final Class187 aClass187_1 = new Class187();

	@OriginalMember(owner = "client!hba", name = "i", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_35 = new Class208(52, 8);

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(ILclient!ns;B)V")
	public static void method3538(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub2_Sub2_Sub1 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (Static113.anInt2243 < arg1.anInt5512) {
			Static141.method8189(arg1);
		} else if (Static113.anInt2243 > arg1.anInt5553) {
			Static623.method8674(false, arg1);
			local7 = Static8.anInt148;
			local9 = Static611.anInt10086;
		} else {
			Static116.method1913(arg1);
		}
		if (arg1.anInt10725 < 512 || arg1.anInt10729 < 512 || arg1.anInt10725 >= Static442.anInt7975 * 512 - 512 || Static284.anInt7916 * 512 - 512 <= arg1.anInt10729) {
			arg1.anInt5549 = -1;
			arg1.anIntArray327 = null;
			arg1.anInt5512 = 0;
			local7 = -1;
			local9 = 0;
			arg1.anInt5558 = -1;
			arg1.anInt5519 = -1;
			arg1.anInt5553 = 0;
			arg1.anInt10725 = arg1.anIntArray335[0] * 512 + arg1.method4913() * 256;
			arg1.anInt10729 = arg1.anIntArray336[0] * 512 + arg1.method4913() * 256;
			arg1.method4904();
		}
		if (arg1 == Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1 && (arg1.anInt10725 < 6144 || arg1.anInt10729 < 6144 || (Static442.anInt7975 - 12) * 512 <= arg1.anInt10725 || Static284.anInt7916 * 512 - 6144 <= arg1.anInt10729)) {
			arg1.anInt5558 = -1;
			local9 = 0;
			arg1.anIntArray327 = null;
			arg1.anInt5549 = -1;
			arg1.anInt5512 = 0;
			arg1.anInt5519 = -1;
			local7 = -1;
			arg1.anInt5553 = 0;
			arg1.anInt10725 = arg1.anIntArray335[0] * 512 + arg1.method4913() * 256;
			arg1.anInt10729 = arg1.anIntArray336[0] * 512 + arg1.method4913() * 256;
			arg1.method4904();
		}
		@Pc(237) int local237 = Static621.method8657(arg1);
		Static342.method5552(arg1);
		Static308.method5209(arg1, local237, local7, local9);
		Static92.method1519(local7, arg1);
		Static437.method6777(arg1);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(JJ)J")
	public static long method3539(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIIIIIBII)V")
	public static void method3540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14;
		if (Static578.method5705(arg7)) {
			local14 = 0;
			@Pc(34) int local34 = 0;
			@Pc(44) int local44 = 0;
			@Pc(46) int local46 = 0;
			@Pc(48) int local48 = 0;
			if (Static389.aBoolean497) {
				local46 = Static147.anInt2735;
				local14 = Static532.anInt9011;
				local48 = Static639.anInt10659;
				local44 = Static349.anInt6555;
				local34 = Static102.anInt2003;
				Static639.anInt10659 = 1;
			}
			if (Static590.aClass302ArrayArray3[arg7] == null) {
				Static539.method7921(arg2, arg4, arg3, -1, arg5, arg0, arg4 < 0, Static605.aClass302ArrayArray4[arg7], arg1, arg6);
			} else {
				Static539.method7921(arg2, arg4, arg3, -1, arg5, arg0, arg4 < 0, Static590.aClass302ArrayArray3[arg7], arg1, arg6);
			}
			if (Static389.aBoolean497) {
				if (arg4 >= 0 && Static639.anInt10659 == 2) {
					Static347.method5621(Static147.anInt2735, Static349.anInt6555, Static102.anInt2003, Static532.anInt9011);
				}
				Static639.anInt10659 = local48;
				Static102.anInt2003 = local34;
				Static532.anInt9011 = local14;
				Static349.anInt6555 = local44;
				Static147.anInt2735 = local46;
			}
		} else if (arg4 == -1) {
			for (local14 = 0; local14 < 100; local14++) {
				Static501.aBooleanArray46[local14] = true;
			}
		} else {
			Static501.aBooleanArray46[arg4] = true;
		}
	}
}
