import java.awt.Frame;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!bb", name = "jb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!bb", name = "rb", descriptor = "[I")
	public static int[] anIntArray368;

	@OriginalMember(owner = "client!bb", name = "Wb", descriptor = "Lclient!pc;")
	public static Class63 aClass63_6;

	@OriginalMember(owner = "client!bb", name = "kc", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!bb", name = "Hb", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1515 = Static51.method932("Your account has been disabled)3");

	@OriginalMember(owner = "client!bb", name = "eb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1510 = aClass10_1515;

	@OriginalMember(owner = "client!bb", name = "lb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1511 = Static51.method932("mod_icons");

	@OriginalMember(owner = "client!bb", name = "ob", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1512 = Static51.method932("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!bb", name = "tb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1513 = Static51.method932(")4lang)4de");

	@OriginalMember(owner = "client!bb", name = "wb", descriptor = "[Z")
	public static boolean[] aBooleanArray17 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!bb", name = "Yb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1516 = Static51.method932("sl_back");

	@OriginalMember(owner = "client!bb", name = "gc", descriptor = "I")
	public static int anInt3504 = 0;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
	public static void method2462() {
		aBooleanArray17 = null;
		aFrame3 = null;
		aClass10_1516 = null;
		anIntArray368 = null;
		aClass10_1512 = null;
		aByteArrayArrayArray11 = null;
		aClass63_6 = null;
		aClass10_1510 = null;
		aClass10_1515 = null;
		aClass10_1511 = null;
		aClass10_1513 = null;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(JI)V")
	public static void method2465(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static139.anInt3081; local12++) {
			if (Static167.aLongArray6[local12] == arg0) {
				Static139.anInt3081--;
				for (@Pc(30) int local30 = local12; local30 < Static139.anInt3081; local30++) {
					Static167.aLongArray6[local30] = Static167.aLongArray6[local30 + 1];
					Static116.aClass10Array20[local30] = Static116.aClass10Array20[local30 + 1];
				}
				Static1.anInt5 = Static12.anInt364;
				Static141.aClass2_Sub11_Sub1_3.method1495(163);
				Static141.aClass2_Sub11_Sub1_3.method1458(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;")
	public static String method2466(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local6 = local11.aString5 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local6 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(42) PrintWriter local42 = new PrintWriter(local32);
		arg0.printStackTrace(local42);
		local42.close();
		@Pc(50) String local50 = local32.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			while (true) {
				@Pc(64) String local64 = local58.readLine();
				if (local64 == null) {
					return local6 + "| " + local61;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(91) String local91 = local64.substring(local70 + 1, local77);
					@Pc(95) int local95 = local91.indexOf(".java:");
					if (local95 >= 0) {
						local91 = local91.substring(0, local95) + local91.substring(local95 + 5);
						local6 = local6 + local91 + ' ';
						continue;
					}
					local64 = local64.substring(0, local70);
				}
				local64 = local64.trim();
				local64 = local64.substring(local64.lastIndexOf(32) + 1);
				local64 = local64.substring(local64.lastIndexOf(9) + 1);
				local6 = local6 + local64 + ' ';
			}
		}
	}
}
