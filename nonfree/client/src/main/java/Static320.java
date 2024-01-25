import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_90 = new Class252(81, 3);

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_93 = new Class45("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_299 = new Class305(47, -2);

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "Lclient!cu;")
	public static final Class54 aClass54_21 = new Class54(9, 7);

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "Lclient!cu;")
	public static final Class54 aClass54_22 = new Class54(7, -1);

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_300 = new Class305(101, 6);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
	public static void method5474(@OriginalArg(0) int arg0) {
		Static478.anInt8507 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static501.anInt9458; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static420.anInt7323; local6++) {
				if (Static263.aClass64ArrayArrayArray3[arg0][local3][local6] == null) {
					Static263.aClass64ArrayArrayArray3[arg0][local3][local6] = new Class64(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
	public static void method5475() {
		Static388.aClass230_40.method6141();
		Static412.aClass259_9.method6653();
		Static22.aClass259_1.method6653();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZIIII)V")
	public static void method5479(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(25) int local25 = arg0 - 334;
		if (local25 < 0) {
			local25 = 0;
		} else if (local25 > 100) {
			local25 = 100;
		}
		@Pc(51) int local51 = Static297.aShort66 + (Static481.aShort88 - Static297.aShort66) * local25 / 100;
		if (local51 < Static262.aShort58) {
			local51 = Static262.aShort58;
		} else if (local51 > Static107.aShort25) {
			local51 = Static107.aShort25;
		}
		@Pc(77) int local77 = local51 * 512 * arg0 / (arg3 * 334);
		@Pc(114) int local114;
		@Pc(121) int local121;
		@Pc(89) short local89;
		if (local77 < Static532.aShort127) {
			local89 = Static532.aShort127;
			local51 = local89 * arg3 * 334 / (arg0 * 512);
			if (Static107.aShort25 < local51) {
				local51 = Static107.aShort25;
				local114 = local51 * arg0 * 512 / (local89 * 334);
				local121 = (arg3 - local114) / 2;
				if (arg1) {
					Static455.aClass4_11.n();
					Static455.aClass4_11.method7162(-16777216, local121, arg4, arg2, arg0);
					Static455.aClass4_11.method7162(-16777216, local121, arg3 + arg4 - local121, arg2, arg0);
				}
				arg3 -= local121 * 2;
				arg4 += local121;
			}
		} else if (Static543.aShort129 < local77) {
			local89 = Static543.aShort129;
			local51 = local89 * arg3 * 334 / (arg0 * 512);
			if (local51 < Static262.aShort58) {
				local51 = Static262.aShort58;
				local114 = local89 * arg3 * 334 / (local51 * 512);
				local121 = (arg0 - local114) / 2;
				if (arg1) {
					Static455.aClass4_11.n();
					Static455.aClass4_11.method7162(-16777216, arg3, arg4, arg2, local121);
					Static455.aClass4_11.method7162(-16777216, arg3, arg4, arg0 + arg2 - local121, local121);
				}
				arg0 -= local121 * 2;
				arg2 += local121;
			}
		}
		Static466.anInt8045 = arg0 * local51 / 334;
		Static519.anInt2068 = (short) arg3;
		Static111.anInt2301 = arg4;
		Static369.anInt6640 = (short) arg0;
		Static145.anInt2913 = arg2;
	}
}
