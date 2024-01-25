import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!tw", name = "d", descriptor = "I")
	public static int anInt9105;

	@OriginalMember(owner = "client!tw", name = "j", descriptor = "Lclient!pga;")
	public static Class281 aClass281_8;

	@OriginalMember(owner = "client!tw", name = "g", descriptor = "Lclient!ml;")
	public static final Class236 aClass236_8 = new Class236();

	@OriginalMember(owner = "client!tw", name = "k", descriptor = "Lclient!pe;")
	public static final Class276 aClass276_18 = new Class276(2);

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIII)Z")
	public static boolean method7783(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static671.aBoolean798 || !Static142.aBoolean362) {
			return false;
		} else if (Static267.anInt4311 < 100) {
			return false;
		} else {
			@Pc(24) int local24 = Static233.anIntArrayArrayArray10[arg0][arg2][arg1];
			if (-Static79.anInt1702 == local24) {
				return false;
			} else if (local24 == Static79.anInt1702) {
				return true;
			} else if (Static140.aClass42Array4 == Static146.aClass42Array3) {
				return false;
			} else {
				@Pc(52) int local52 = arg2 << Static273.anInt4424;
				@Pc(56) int local56 = arg1 << Static273.anInt4424;
				if (Static479.method6586(Static140.aClass42Array4[arg0].method7450(arg1, arg2), local52 + 1, local56 + 1, Static63.anInt1356 + local56 - 1, local56 + -1 + Static63.anInt1356, Static140.aClass42Array4[arg0].method7450(arg1 + 1, arg2), local52 + 1, local52 - -Static63.anInt1356 + -1, Static140.aClass42Array4[arg0].method7450(arg1 + 1, arg2 + 1)) && Static479.method6586(Static140.aClass42Array4[arg0].method7450(arg1, arg2), local52 + 1, local56 + 1, local56 + 1, local56 + -1 + Static63.anInt1356, Static140.aClass42Array4[arg0].method7450(arg1 + 1, arg2 + 1), local52 + Static63.anInt1356 - 1, Static63.anInt1356 + (local52 - 1), Static140.aClass42Array4[arg0].method7450(arg1, arg2 + 1))) {
					Static106.anInt2135++;
					Static233.anIntArrayArrayArray10[arg0][arg2][arg1] = Static79.anInt1702;
					return true;
				} else {
					Static233.anIntArrayArrayArray10[arg0][arg2][arg1] = -Static79.anInt1702;
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)V")
	public static void method7784() {
		Static280.anInt10342 = 0;
		Static473.anInt7504 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static257.anInt4179; local18++) {
			@Pc(24) int local24 = local18 * Static217.anInt3516;
			for (@Pc(26) int local26 = 0; local26 < Static217.anInt3516; local26++) {
				@Pc(32) int local32 = local24 + local26;
				Static151.anInterface18Array1[local32].method8693(local26 * Static614.anInt9423, local18 * Static567.anInt8756, Static614.anInt9423, Static567.anInt8756, true);
			}
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(ZII)V")
	public static void method7785(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21;
		if (arg1 != Static269.anInt4330) {
			Static312.anIntArray370 = new int[arg1];
			for (local21 = 0; local21 < arg1; local21++) {
				Static312.anIntArray370[local21] = (local21 << 12) / arg1;
			}
			Static269.anInt4330 = arg1;
			Static117.anInt2241 = arg1 * 32;
			Static215.anInt3481 = arg1 - 1;
		}
		if (Static355.anInt5410 == arg0) {
			return;
		}
		if (arg0 == Static269.anInt4330) {
			Static429.anIntArray465 = Static312.anIntArray370;
		} else {
			Static429.anIntArray465 = new int[arg0];
			for (local21 = 0; local21 < arg0; local21++) {
				Static429.anIntArray465[local21] = (local21 << 12) / arg0;
			}
		}
		Static489.anInt7677 = arg0 - 1;
		Static355.anInt5410 = arg0;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method7786(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26 = arg0 ? 32768 : 0;
		@Pc(36) int local36 = local26 + (arg0 ? Static410.aClass298_1.anInt7577 : Static410.aClass298_1.anInt7579);
		for (@Pc(38) int local38 = local26; local38 < local36; local38++) {
			@Pc(45) Class4_Sub5_Sub16 local45 = Static410.aClass298_1.method6589(local38);
			if (local45.aBoolean581 && local45.method6415().toLowerCase().indexOf(local4) != -1) {
				if (local20 >= 50) {
					Static359.anInt5450 = -1;
					Static118.aShortArray33 = null;
					return;
				}
				if (local20 >= local11.length) {
					@Pc(81) short[] local81 = new short[local11.length * 2];
					for (@Pc(83) int local83 = 0; local83 < local20; local83++) {
						local81[local83] = local11[local83];
					}
					local11 = local81;
				}
				local11[local20++] = (short) local38;
			}
		}
		Static359.anInt5450 = local20;
		Static558.anInt8602 = 0;
		Static118.aShortArray33 = local11;
		@Pc(120) String[] local120 = new String[Static359.anInt5450];
		for (@Pc(122) int local122 = 0; local122 < Static359.anInt5450; local122++) {
			local120[local122] = Static410.aClass298_1.method6589(local11[local122]).method6415();
		}
		Static479.method6584(Static118.aShortArray33, local120);
	}
}
