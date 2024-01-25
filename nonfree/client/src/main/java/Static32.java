import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bca", name = "e", descriptor = "I")
	public static int anInt1305;

	@OriginalMember(owner = "client!bca", name = "h", descriptor = "Lclient!fca;")
	public static Class19_Sub1 aClass19_Sub1_1;

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "I")
	public static int anInt1302 = -2;

	@OriginalMember(owner = "client!bca", name = "d", descriptor = "I")
	public static int anInt1304 = 0;

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(BIII)I")
	public static int method1188(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = arg1 & 0x3;
		if (local14 == 0) {
			return arg2;
		} else if (local14 == 1) {
			return arg0;
		} else if (local14 == 2) {
			return 4095 - arg2;
		} else {
			return 4095 - arg0;
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V")
	public static void method1189() {
		Static572.aClass43_61 = new Class43();
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lclient!oh;BLclient!gh;)V")
	public static void method1191(@OriginalArg(0) Class237 arg0, @OriginalArg(2) Class118 arg1) {
		Static132.aString38 = "";
		Static60.aClass237_18 = arg0;
		Static440.aClass118_3 = arg1;
		if (Class17.aString6.startsWith("win")) {
			Static132.aString38 = Static132.aString38 + "windows/";
		} else if (Class17.aString6.startsWith("linux")) {
			Static132.aString38 = Static132.aString38 + "linux/";
		} else if (Class17.aString6.startsWith("mac")) {
			Static132.aString38 = Static132.aString38 + "macos/";
		}
		if (Static440.aClass118_3.aBoolean301) {
			Static132.aString38 = Static132.aString38 + "msjava/";
		} else if (Class17.aString7.startsWith("amd64") || Class17.aString7.startsWith("x86_64")) {
			Static132.aString38 = Static132.aString38 + "x86_64/";
		} else if (Class17.aString7.startsWith("i386") || Class17.aString7.startsWith("i486") || Class17.aString7.startsWith("i586") || Class17.aString7.startsWith("x86")) {
			Static132.aString38 = Static132.aString38 + "x86/";
		} else if (Class17.aString7.startsWith("ppc")) {
			Static132.aString38 = Static132.aString38 + "ppc/";
		} else {
			Static132.aString38 = Static132.aString38 + "universal/";
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "([II)Ljava/lang/String;")
	public static String method1192(@OriginalArg(0) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static595.anInt10186;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(22) Class295 local22 = Static216.aClass356_1.method8253(arg0[local13]);
			if (local22.anInt8684 != -1) {
				@Pc(34) Class21 local34 = (Class21) Static468.aClass236_107.method6242((long) local22.anInt8684);
				if (local34 == null) {
					@Pc(42) Class111 local42 = Static647.method3292(Static630.aClass237_149, local22.anInt8684, 0);
					if (local42 != null) {
						local34 = Static171.aClass16_5.method6135(local42, true);
						Static468.aClass236_107.method6241((long) local22.anInt8684, local34);
					}
				}
				if (local34 != null) {
					Static99.aClass21Array5[local11] = local34;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}
}
