import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "Lclient!mv;")
	public static Class103 aClass103_4;

	@OriginalMember(owner = "client!sd", name = "A", descriptor = "I")
	public static int anInt7729;

	@OriginalMember(owner = "client!sd", name = "B", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray10;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_117 = new Class252(78, -1);

	@OriginalMember(owner = "client!sd", name = "z", descriptor = "Lclient!pl;")
	public static final Class63 aClass63_1 = Static371.method5979();

	@OriginalMember(owner = "client!sd", name = "C", descriptor = "[B")
	public static final byte[] aByteArray103 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)Lclient!dg;")
	public static Class64 method6845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static263.aClass64ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static263.aClass64ArrayArrayArray3[0][arg1][arg2] != null && Static263.aClass64ArrayArrayArray3[0][arg1][arg2].aClass64_1 != null;
			if (local28 && arg0 >= Static63.anInt1587 - 1) {
				return null;
			}
			Static340.method5718(arg0, arg1, arg2);
		}
		return Static263.aClass64ArrayArrayArray3[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method6847(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(16) int local16 = 0;
		@Pc(19) int local19 = arg0.length();
		while (local19 > local16 && Static146.method2745(arg0.charAt(local16))) {
			local16++;
		}
		while (local19 > local16 && Static146.method2745(arg0.charAt(local19 - 1))) {
			local19--;
		}
		@Pc(54) int local54 = local19 - local16;
		if (local54 < 1 || local54 > 12) {
			return null;
		}
		@Pc(71) StringBuffer local71 = new StringBuffer(local54);
		for (@Pc(73) int local73 = local16; local73 < local19; local73++) {
			@Pc(79) char local79 = arg0.charAt(local73);
			if (Static460.method7021(local79)) {
				@Pc(87) char local87 = Static134.method2551(local79);
				if (local87 != '\u0000') {
					local71.append(local87);
				}
			}
		}
		if (local71.length() == 0) {
			return null;
		} else {
			return local71.toString();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V")
	public static void method6848(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 > arg3) {
			Static313.method5430(arg1, arg0, Static143.anIntArrayArray33[arg2], arg3);
		} else {
			Static313.method5430(arg3, arg0, Static143.anIntArrayArray33[arg2], arg1);
		}
	}
}
