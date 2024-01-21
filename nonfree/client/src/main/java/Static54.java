import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!k", name = "p", descriptor = "Lclient!sd;")
	public static Class29 aClass29_36;

	@OriginalMember(owner = "client!k", name = "s", descriptor = "Lclient!sd;")
	public static Class29 aClass29_37;

	@OriginalMember(owner = "client!k", name = "t", descriptor = "Lclient!v;")
	public static Class5_Sub7_Sub4 aClass5_Sub7_Sub4_3;

	@OriginalMember(owner = "client!k", name = "w", descriptor = "Lclient!mc;")
	public static Class46 aClass46_2;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "Lclient!mb;")
	public static Class45 aClass45_651 = Static63.method1251("");

	@OriginalMember(owner = "client!k", name = "c", descriptor = "[J")
	public static long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!k", name = "d", descriptor = "[Lclient!pc;")
	public static Class5_Sub2_Sub4_Sub3_Sub2[] aClass5_Sub2_Sub4_Sub3_Sub2Array1 = new Class5_Sub2_Sub4_Sub3_Sub2[32768];

	@OriginalMember(owner = "client!k", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray5 = new byte[50][];

	@OriginalMember(owner = "client!k", name = "l", descriptor = "Lclient!mb;")
	public static Class45 aClass45_652 = Static63.method1251("Privater Chat");

	@OriginalMember(owner = "client!k", name = "m", descriptor = "Lclient!sa;")
	public static Class67 aClass67_14 = new Class67(64);

	@OriginalMember(owner = "client!k", name = "n", descriptor = "Lclient!mb;")
	public static Class45 aClass45_653 = Static63.method1251("mod_icons");

	@OriginalMember(owner = "client!k", name = "o", descriptor = "I")
	public static int anInt1636 = 0;

	@OriginalMember(owner = "client!k", name = "q", descriptor = "Lclient!mb;")
	private static Class45 aClass45_654 = Static63.method1251("Remove");

	@OriginalMember(owner = "client!k", name = "r", descriptor = "I")
	public static int anInt1637 = -1;

	@OriginalMember(owner = "client!k", name = "u", descriptor = "Lclient!mb;")
	public static Class45 aClass45_655 = aClass45_654;

	@OriginalMember(owner = "client!k", name = "v", descriptor = "I")
	public static int anInt1638 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!k", name = "x", descriptor = "Lclient!mb;")
	public static Class45 aClass45_656 = Static63.method1251(":duelreq:");

	@OriginalMember(owner = "client!k", name = "y", descriptor = "I")
	public static int anInt1639 = 500;

	@OriginalMember(owner = "client!k", name = "z", descriptor = "J")
	public static long aLong78 = 0L;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1129(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString1 + " | ";
			arg0 = local15.aThrowable1;
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(61) String local61 = local53.readLine();
		while (true) {
			while (true) {
				@Pc(64) String local64 = local53.readLine();
				if (local64 == null) {
					return local10 + "| " + local61;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(88) String local88 = local64.substring(local70 + 1, local77);
					@Pc(92) int local92 = local88.indexOf(".java:");
					if (local92 >= 0) {
						local88 = local88.substring(0, local92) + local88.substring(local92 + 5);
						local10 = local10 + local88 + ' ';
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

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4 method1130() {
		@Pc(7) Class5_Sub2_Sub6_Sub4 local7 = new Class5_Sub2_Sub6_Sub4();
		local7.anInt2729 = Static89.anIntArray368[0];
		local7.anInt2731 = Static110.anIntArray438[0];
		local7.anInt2726 = Static64.anInt1855;
		local7.anInt2727 = Static104.anIntArray424[0];
		local7.anIntArray415 = Static7.anIntArray25;
		local7.aByteArray37 = Static16.aByteArrayArray2[0];
		local7.anInt2728 = Static111.anIntArray440[0];
		local7.anInt2730 = Static45.anInt1316;
		Static96.method1797();
		return local7;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V")
	public static void method1131() {
		aClass67_14 = null;
		aByteArrayArray5 = null;
		aClass45_652 = null;
		aClass29_36 = null;
		aClass46_2 = null;
		aClass45_653 = null;
		aClass5_Sub2_Sub4_Sub3_Sub2Array1 = null;
		aClass45_654 = null;
		aClass29_37 = null;
		aClass5_Sub7_Sub4_3 = null;
		aLongArray2 = null;
		aClass45_656 = null;
		aClass45_651 = null;
		aClass45_655 = null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method1132(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZLclient!u;)V")
	public static void method1133(@OriginalArg(1) Class5_Sub7 arg0) {
		if (arg0.aClass5_Sub5_5 != null) {
			arg0.aClass5_Sub5_5.anInt772 = 0;
		}
		arg0.aBoolean128 = false;
		for (@Pc(16) Class5_Sub7 local16 = arg0.method2024(); local16 != null; local16 = arg0.method2026()) {
			method1133(local16);
		}
	}
}
