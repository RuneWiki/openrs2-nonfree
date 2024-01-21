import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!od", name = "y", descriptor = "Lclient!nc;")
	public static Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_19;

	@OriginalMember(owner = "client!od", name = "L", descriptor = "Lclient!jc;")
	public static Class7 aClass7_3;

	@OriginalMember(owner = "client!od", name = "R", descriptor = "Lclient!pb;")
	public static Class31 aClass31_29;

	@OriginalMember(owner = "client!od", name = "A", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1055 = Static23.method501("Enter name:");

	@OriginalMember(owner = "client!od", name = "u", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1052 = aClass42_1055;

	@OriginalMember(owner = "client!od", name = "M", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1058 = Static23.method501("Offline");

	@OriginalMember(owner = "client!od", name = "w", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1053 = aClass42_1058;

	@OriginalMember(owner = "client!od", name = "x", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1054 = Static23.method501("glow2:");

	@OriginalMember(owner = "client!od", name = "z", descriptor = "I")
	public static int anInt2003 = -1;

	@OriginalMember(owner = "client!od", name = "E", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1056 = Static23.method501("Privater Chat");

	@OriginalMember(owner = "client!od", name = "J", descriptor = "Lclient!fa;")
	public static Class22 aClass22_11 = new Class22();

	@OriginalMember(owner = "client!od", name = "K", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1057 = aClass42_1054;

	@OriginalMember(owner = "client!od", name = "N", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1059 = Static23.method501("backhmid2");

	@OriginalMember(owner = "client!od", name = "P", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1060 = Static23.method501("cyan:");

	@OriginalMember(owner = "client!od", name = "Q", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1061 = aClass42_1060;

	@OriginalMember(owner = "client!od", name = "S", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1062 = Static23.method501("@yel@*V");

	@OriginalMember(owner = "client!od", name = "T", descriptor = "I")
	public static int anInt2010 = 0;

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(B)V")
	public static void method1431() {
		aClass31_29 = null;
		aClass1_Sub1_Sub1_Sub4_19 = null;
		aClass42_1057 = null;
		aClass42_1052 = null;
		aClass42_1060 = null;
		aClass42_1059 = null;
		aClass42_1053 = null;
		aClass42_1054 = null;
		aClass42_1058 = null;
		aClass42_1061 = null;
		aClass42_1056 = null;
		aClass7_3 = null;
		aClass22_11 = null;
		aClass42_1055 = null;
		aClass42_1062 = null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!mc;ILclient!ka;)I")
	public static int method1435(@OriginalArg(0) Class42 arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		@Pc(6) int local6 = arg1.anInt1692;
		arg1.method1189(arg0.anInt1468);
		arg1.anInt1692 += Static31.aClass28_5.method585(0, arg1.anInt1692, arg1.aByteArray24, arg0.aByteArray17, arg0.anInt1468);
		return arg1.anInt1692 - local6;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)I")
	public static int method1436(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static20.anIntArray51[arg0];
		@Pc(11) int local11 = (local3 * Static49.anInt1251 >> 8) * local3;
		return (int) (Math.sqrt((double) local11) + 0.5D);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1437(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString1 + " | ";
		} else {
			local10 = "";
		}
		@Pc(37) StringWriter local37 = new StringWriter();
		@Pc(42) PrintWriter local42 = new PrintWriter(local37);
		arg0.printStackTrace(local42);
		local42.close();
		@Pc(50) String local50 = local37.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			while (true) {
				@Pc(64) String local64 = local58.readLine();
				if (local64 == null) {
					return local10 + "| " + local61;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(91) String local91 = local64.substring(local70 + 1, local77);
					@Pc(95) int local95 = local91.indexOf(".java:");
					if (local95 >= 0) {
						local91 = local91.substring(0, local95) + local91.substring(local95 + 5);
						local10 = local10 + local91 + ' ';
						continue;
					}
					local64 = local64.substring(0, local70);
				}
				local64 = local64.trim();
				local64 = local64.substring(local64.lastIndexOf(32) + 1);
				local64 = local64.substring(local64.lastIndexOf(9) + 1);
				local10 = local10 + local64 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
	public static void method1438(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static87.aBooleanArray16[arg0]) {
			return;
		}
		Static101.aClass33_30.method1312(arg0);
		if (Static61.aClass1_Sub1_Sub12ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(27) int local27 = 0; local27 < Static61.aClass1_Sub1_Sub12ArrayArray1[arg0].length; local27++) {
			if (Static61.aClass1_Sub1_Sub12ArrayArray1[arg0][local27] != null) {
				if (Static61.aClass1_Sub1_Sub12ArrayArray1[arg0][local27].anInt2177 == 2) {
					local25 = false;
				} else {
					Static61.aClass1_Sub1_Sub12ArrayArray1[arg0][local27] = null;
				}
			}
		}
		if (local25) {
			Static61.aClass1_Sub1_Sub12ArrayArray1[arg0] = null;
		}
		Static87.aBooleanArray16[arg0] = false;
	}
}
