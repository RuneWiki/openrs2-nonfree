import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "[Lclient!pb;")
	public static Class1_Sub1_Sub4_Sub4[] aClass1_Sub1_Sub4_Sub4Array9;

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1 aClass1_Sub1_Sub4_Sub1_38;

	@OriginalMember(owner = "client!ma", name = "u", descriptor = "Lclient!ua;")
	public static Class62_Sub1 aClass62_Sub1_50;

	@OriginalMember(owner = "client!ma", name = "B", descriptor = "I")
	public static int anInt1892;

	@OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
	public static int anInt1893;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
	public static int anInt1879 = 0;

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "Lclient!kd;")
	public static Class39 aClass39_924 = Static108.method1915("<col=00ff00>");

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "Lclient!kd;")
	public static Class39 aClass39_925 = Static108.method1915("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "Lclient!kd;")
	public static Class39 aClass39_926 = Static108.method1915("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "Lclient!kd;")
	public static Class39 aClass39_927 = Static108.method1915(" ");

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "Lclient!kd;")
	public static Class39 aClass39_928 = Static108.method1915("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "Lclient!kd;")
	public static Class39 aClass39_929 = Static108.method1915("title)3jpg");

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(JI)Lclient!kd;")
	public static Class39 method1290(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(36) int local36 = 0;
			for (@Pc(38) long local38 = arg0; local38 != 0L; local38 /= 37L) {
				local36++;
			}
			@Pc(54) byte[] local54 = new byte[local36];
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				local36--;
				local54[local36] = Static120.aByteArray95[(int) (local58 - arg0 * 37L)];
			}
			@Pc(85) Class39 local85 = new Class39();
			local85.aByteArray50 = local54;
			local85.anInt1707 = local54.length;
			return local85;
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(Z)V")
	public static void method1291() {
		aClass39_928 = null;
		aClass62_Sub1_50 = null;
		aClass39_926 = null;
		aClass39_925 = null;
		aClass39_929 = null;
		aClass39_927 = null;
		aClass1_Sub1_Sub4_Sub4Array9 = null;
		aClass39_924 = null;
		aClass1_Sub1_Sub4_Sub1_38 = null;
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(Z)V")
	public static void method1294() {
		@Pc(3) Class39 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < Static110.anInt2795; local5++) {
			if (Static50.aClass39Array13[local5].method1166(Static112.aClass39_1346) != -1) {
				local3 = Static50.aClass39Array13[local5].method1181(Static50.aClass39Array13[local5].method1166(Static112.aClass39_1346));
				break;
			}
		}
		if (local3 == null) {
			Static124.method2080();
			return;
		}
		@Pc(43) int local43 = Static36.anInt1081;
		if (local43 < 0) {
			local43 = 0;
		}
		@Pc(49) int local49 = Static108.anInt2712;
		@Pc(51) int local51 = Static122.anInt2971;
		@Pc(53) int local53 = Static89.anInt2108;
		if (local49 > 190) {
			local49 = 190;
		}
		Static15.method1503(local43, local53, local49, local51, 6116423);
		Static15.method1503(local43 + 1, local53 + 1, local49 - 2, 16, 0);
		Static15.method1504(local43 + 1, local53 + 18, local49 - 2, local51 + -19, 0);
		Static53.aClass1_Sub1_Sub4_Sub3_1.method753(local3, local43 + 3, local53 + 14, 6116423, -1);
		@Pc(111) int local111 = Static29.anInt971;
		@Pc(113) int local113 = Static3.anInt150;
		if (Static46.anInt2774 == 0) {
			local111 -= 4;
			local113 -= 4;
		}
		if (Static46.anInt2774 == 1) {
			local111 -= 553;
			local113 -= 205;
		}
		if (Static46.anInt2774 == 2) {
			local111 -= 17;
			local113 -= 357;
		}
		for (@Pc(132) int local132 = 0; local132 < Static110.anInt2795; local132++) {
			@Pc(146) int local146 = (Static110.anInt2795 - local132 - 1) * 15 + local53 + 31;
			@Pc(148) int local148 = 16777215;
			if (local111 > local43 && local111 < local49 + local43 && local146 - 13 < local113 && local146 + 3 > local113) {
				local148 = 16776960;
			}
			@Pc(180) Class39 local180 = Static50.aClass39Array13[local132];
			if (local180.method1170(local3)) {
				local180 = local180.method1173(local180.method1175() - local3.method1175(), 0);
				if (local180.method1170(Static116.aClass39_1382)) {
					local180 = local180.method1173(local180.method1175() - Static116.aClass39_1382.method1175(), 0);
				}
			}
			Static53.aClass1_Sub1_Sub4_Sub3_1.method753(local180, local43 + 3, local146, local148, 0);
		}
	}
}
