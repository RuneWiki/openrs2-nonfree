import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
	public static int anInt4698;

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "Lclient!ok;")
	public static Class178 aClass178_86;

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "Lclient!go;")
	public static Class95 aClass95_11;

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "Lclient!fp;")
	public static final Class83 aClass83_9 = new Class83(0, 2, 2, 1);

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_102 = new Class55("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "[I")
	public static final int[] anIntArray426 = new int[5];

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "[I")
	public static final int[] anIntArray427 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZII)Z")
	public static boolean method3734(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIB)I")
	public static int method3735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static24.anInt346 < 100) {
			return -2;
		}
		@Pc(14) int local14 = -2;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(21) int local21 = arg2 - Static93.anInt4322;
		@Pc(26) int local26 = arg1 - Static93.anInt4323;
		for (@Pc(31) Class7_Sub11 local31 = (Class7_Sub11) Static93.aClass85_28.method2010(); local31 != null; local31 = (Class7_Sub11) Static93.aClass85_28.method2000()) {
			if (arg0 == local31.anInt1062) {
				@Pc(40) int local40 = local31.anInt1059;
				@Pc(43) int local43 = local31.anInt1058;
				@Pc(55) int local55 = local40 + Static93.anInt4322 << 14 | local43 + Static93.anInt4323;
				@Pc(75) int local75 = (local21 - local40) * (local21 + -local40) + (local26 - local43) * (-local43 + local26);
				if (local14 < 0 || local16 > local75) {
					local16 = local75;
					local14 = local55;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILjava/lang/String;Z)Z")
	public static boolean method3737(@OriginalArg(2) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(46) char local46 = arg0.charAt(local35);
			if (local35 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(89) int local89;
			if (local46 >= '0' && local46 <= '9') {
				local89 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local89 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local89 = local46 - 'W';
			} else {
				return false;
			}
			if (local89 >= 10) {
				return false;
			}
			if (local26) {
				local89 = -local89;
			}
			@Pc(117) int local117 = local30 * 10 + local89;
			if (local117 / 10 != local30) {
				return false;
			}
			local28 = true;
			local30 = local117;
		}
		return local28;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)I")
	public static int method3738(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
