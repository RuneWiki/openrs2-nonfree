import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!hd", name = "md", descriptor = "I")
	public static int anInt1206;

	@OriginalMember(owner = "client!hd", name = "ad", descriptor = "Lclient!he;")
	public static Class28 aClass28_9 = new Class28();

	@OriginalMember(owner = "client!hd", name = "bd", descriptor = "I")
	public static int anInt1200 = 0;

	@OriginalMember(owner = "client!hd", name = "cd", descriptor = "Lclient!hb;")
	public static Class27 aClass27_585 = Static87.method1648("backright2");

	@OriginalMember(owner = "client!hd", name = "jd", descriptor = "Lclient!hb;")
	private static Class27 aClass27_587 = Static87.method1648("From");

	@OriginalMember(owner = "client!hd", name = "ed", descriptor = "Lclient!hb;")
	public static Class27 aClass27_586 = aClass27_587;

	@OriginalMember(owner = "client!hd", name = "ld", descriptor = "Lclient!hb;")
	public static Class27 aClass27_588 = Static87.method1648("Menge eingeben:");

	@OriginalMember(owner = "client!hd", name = "nd", descriptor = "Lclient!hb;")
	public static Class27 aClass27_589 = Static87.method1648("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!hd", name = "od", descriptor = "Lclient!hb;")
	public static Class27 aClass27_590 = Static87.method1648("Handel akzeptieren");

	@OriginalMember(owner = "client!hd", name = "pd", descriptor = "I")
	public static final int anInt1207 = 50;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(II)V")
	public static void method871(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static59.aBooleanArray9[arg0]) {
			return;
		}
		Static92.aClass54_31.method1618(arg0);
		if (Static96.aClass3_Sub3_Sub6ArrayArray5[arg0] == null) {
			return;
		}
		@Pc(26) boolean local26 = true;
		for (@Pc(28) int local28 = 0; local28 < Static96.aClass3_Sub3_Sub6ArrayArray5[arg0].length; local28++) {
			if (Static96.aClass3_Sub3_Sub6ArrayArray5[arg0][local28] != null) {
				if (Static96.aClass3_Sub3_Sub6ArrayArray5[arg0][local28].anInt1608 == 2) {
					local26 = false;
				} else {
					Static96.aClass3_Sub3_Sub6ArrayArray5[arg0][local28] = null;
				}
			}
		}
		if (local26) {
			Static96.aClass3_Sub3_Sub6ArrayArray5[arg0] = null;
		}
		Static59.aBooleanArray9[arg0] = false;
	}

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "(I)V")
	public static void method872() {
		aClass27_587 = null;
		aClass27_589 = null;
		aClass27_588 = null;
		aClass27_586 = null;
		aClass28_9 = null;
		aClass27_585 = null;
		aClass27_590 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 1 || arg4 < 1 || arg1 > 102 || arg4 > 102) {
			return;
		}
		if (Static70.aBoolean94 && Static68.anInt1747 != arg5) {
			return;
		}
		@Pc(32) int local32 = 0;
		if (arg3 == 0) {
			local32 = Static76.aClass18_1.method505(arg5, arg1, arg4);
		}
		if (arg3 == 1) {
			local32 = Static76.aClass18_1.method507(arg5, arg1, arg4);
		}
		if (arg3 == 2) {
			local32 = Static76.aClass18_1.method518(arg5, arg1, arg4);
		}
		if (arg3 == 3) {
			local32 = Static76.aClass18_1.method531(arg5, arg1, arg4);
		}
		@Pc(91) int local91;
		if (local32 != 0) {
			@Pc(84) int local84 = local32 >> 14 & 0x7FFF;
			local91 = Static76.aClass18_1.method535(arg5, arg1, arg4, local32);
			@Pc(95) int local95 = local91 & 0x1F;
			@Pc(101) int local101 = local91 >> 6 & 0x3;
			@Pc(112) Class3_Sub3_Sub4 local112;
			if (arg3 == 0) {
				Static76.aClass18_1.method492(arg5, arg1, arg4);
				local112 = Static108.method1902(local84);
				if (local112.aBoolean68) {
					Static57.aClass49Array1[arg5].method1533(arg1, local112.aBoolean64, local101, arg4, local95);
				}
			}
			if (arg3 == 1) {
				Static76.aClass18_1.method506(arg5, arg1, arg4);
			}
			if (arg3 == 2) {
				Static76.aClass18_1.method538(arg5, arg1, arg4);
				local112 = Static108.method1902(local84);
				if (arg1 + local112.anInt1334 > 103 || arg4 + local112.anInt1334 > 103 || arg1 + local112.anInt1309 > 103 || local112.anInt1309 + arg4 > 103) {
					return;
				}
				if (local112.aBoolean68) {
					Static57.aClass49Array1[arg5].method1532(arg4, local112.aBoolean64, arg1, local112.anInt1334, local101, local112.anInt1309);
				}
			}
			if (arg3 == 3) {
				Static76.aClass18_1.method524(arg5, arg1, arg4);
				local112 = Static108.method1902(local84);
				if (local112.aBoolean68 && local112.anInt1311 == 1) {
					Static57.aClass49Array1[arg5].method1530(arg1, arg4);
				}
			}
		}
		if (arg2 < 0) {
			return;
		}
		local91 = arg5;
		if (arg5 < 3 && (Static89.aByteArrayArrayArray11[1][arg1][arg4] & 0x2) == 2) {
			local91 = arg5 + 1;
		}
		Static30.method653(arg1, arg2, arg6, local91, Static76.aClass18_1, arg5, Static57.aClass49Array1[arg5], arg0, arg4);
		return;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method874(@OriginalArg(0) Throwable arg0) throws IOException {
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
		@Pc(57) String local57 = local32.toString();
		@Pc(65) BufferedReader local65 = new BufferedReader(new StringReader(local57));
		@Pc(68) String local68 = local65.readLine();
		while (true) {
			while (true) {
				@Pc(71) String local71 = local65.readLine();
				if (local71 == null) {
					return local10 + "| " + local68;
				}
				@Pc(77) int local77 = local71.indexOf(40);
				@Pc(84) int local84 = local71.indexOf(41, local77 + 1);
				if (local77 >= 0 && local84 >= 0) {
					@Pc(98) String local98 = local71.substring(local77 + 1, local84);
					@Pc(102) int local102 = local98.indexOf(".java:");
					if (local102 >= 0) {
						local98 = local98.substring(0, local102) + local98.substring(local102 + 5);
						local10 = local10 + local98 + ' ';
						continue;
					}
					local71 = local71.substring(0, local77);
				}
				local71 = local71.trim();
				local71 = local71.substring(local71.lastIndexOf(32) + 1);
				local71 = local71.substring(local71.lastIndexOf(9) + 1);
				local10 = local10 + local71 + ' ';
			}
		}
	}
}
