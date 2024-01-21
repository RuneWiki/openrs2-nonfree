import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!i", name = "a", descriptor = "I")
	public static int anInt1239 = 0;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "I")
	public static int anInt1240 = 0;

	@OriginalMember(owner = "client!i", name = "h", descriptor = "Lclient!na;")
	public static Class53 aClass53_555 = Static109.method1737("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!i", name = "k", descriptor = "Lclient!ud;")
	public static Class77 aClass77_6 = new Class77(512);

	@OriginalMember(owner = "client!i", name = "v", descriptor = "Lclient!na;")
	private static Class53 aClass53_558 = Static109.method1737("OFF");

	@OriginalMember(owner = "client!i", name = "q", descriptor = "Lclient!na;")
	public static Class53 aClass53_556 = aClass53_558;

	@OriginalMember(owner = "client!i", name = "s", descriptor = "I")
	public static int anInt1251 = 0;

	@OriginalMember(owner = "client!i", name = "t", descriptor = "Lclient!na;")
	private static Class53 aClass53_557 = Static109.method1737("No reply from loginserver)3");

	@OriginalMember(owner = "client!i", name = "x", descriptor = "Lclient!na;")
	public static Class53 aClass53_559 = Static109.method1737("Von:");

	@OriginalMember(owner = "client!i", name = "B", descriptor = "[Lclient!db;")
	public static Class3_Sub1_Sub4_Sub1_Sub1[] aClass3_Sub1_Sub4_Sub1_Sub1Array1 = new Class3_Sub1_Sub4_Sub1_Sub1[32768];

	@OriginalMember(owner = "client!i", name = "D", descriptor = "Lclient!na;")
	public static Class53 aClass53_560 = aClass53_557;

	@OriginalMember(owner = "client!i", name = "F", descriptor = "Lclient!na;")
	public static Class53 aClass53_561 = Static109.method1737(")4lang)4de");

	@OriginalMember(owner = "client!i", name = "G", descriptor = "Z")
	public static boolean aBoolean46 = false;

	@OriginalMember(owner = "client!i", name = "I", descriptor = "I")
	public static int anInt1256 = 0;

	@OriginalMember(owner = "client!i", name = "K", descriptor = "Lclient!na;")
	private static Class53 aClass53_563 = Static109.method1737("Classic");

	@OriginalMember(owner = "client!i", name = "J", descriptor = "Lclient!na;")
	public static Class53 aClass53_562 = aClass53_563;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)I")
	public static int method870() {
		return 19;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method872(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(7) RuntimeException_Sub1 local7 = (RuntimeException_Sub1) arg0;
			local17 = local7.aString4 + " | ";
			arg0 = local7.aThrowable1;
		} else {
			local17 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(42) PrintWriter local42 = new PrintWriter(local33);
		arg0.printStackTrace(local42);
		local42.close();
		@Pc(50) String local50 = local33.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			while (true) {
				@Pc(64) String local64 = local58.readLine();
				if (local64 == null) {
					return local17 + "| " + local61;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(91) String local91 = local64.substring(local70 + 1, local77);
					@Pc(95) int local95 = local91.indexOf(".java:");
					if (local95 >= 0) {
						local91 = local91.substring(0, local95) + local91.substring(local95 + 5);
						local17 = local17 + local91 + ' ';
						continue;
					}
					local64 = local64.substring(0, local70);
				}
				local64 = local64.trim();
				local64 = local64.substring(local64.lastIndexOf(32) + 1);
				local64 = local64.substring(local64.lastIndexOf(9) + 1);
				local17 = local17 + local64 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
	public static void method874() {
		aClass53_556 = null;
		aClass53_559 = null;
		aClass53_561 = null;
		aClass77_6 = null;
		aClass53_560 = null;
		aClass53_563 = null;
		aClass53_558 = null;
		aClass3_Sub1_Sub4_Sub1_Sub1Array1 = null;
		aClass53_557 = null;
		aClass53_555 = null;
		aClass53_562 = null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IBI)Z")
	public static boolean method880(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		@Pc(27) Class3_Sub1_Sub2 local27 = Static12.method200(arg1);
		return local27.method167(arg0);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIII[Lclient!vb;IIIILclient!vb;)Lclient!vb;")
	public static Class3_Sub1_Sub15 method883(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class3_Sub1_Sub15[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class3_Sub1_Sub15 arg10) {
		if (arg6 < arg2 || arg7 > arg0 || arg1 <= arg6 || arg9 <= arg0) {
			return null;
		}
		for (@Pc(41) int local41 = 0; local41 < arg5.length; local41++) {
			@Pc(47) Class3_Sub1_Sub15 local47 = arg5[local41];
			if (local47 != null && arg8 == local47.anInt2704 && !Static75.method1250(local47) && local47 != arg10) {
				@Pc(70) int local70 = arg2 + local47.anInt2677 - arg4;
				@Pc(79) int local79 = local47.anInt2708 + arg7 - arg3;
				if (local47.anInt2707 == 0) {
					@Pc(110) Class3_Sub1_Sub15 local110 = method883(arg0, local70 + local47.anInt2727, local70, local47.anInt2724, local47.anInt2691, arg5, arg6, local79, local47.anInt2686, local79 + local47.anInt2703, arg10);
					if (local110 != null) {
						return local110;
					}
					if (local47.aClass3_Sub1_Sub15Array2 != null) {
						local110 = method883(arg0, local47.anInt2727 + local70, local70, local47.anInt2724, local47.anInt2691, local47.aClass3_Sub1_Sub15Array2, arg6, local79, local47.anInt2686, local47.anInt2703 + local79, arg10);
						if (local110 != null) {
							return local110;
						}
					}
				}
				if (Static78.method1365(Static50.method1914(local47)) && local70 <= arg6 && arg0 >= local79 && local70 + local47.anInt2727 > arg6 && local79 + local47.anInt2703 > arg0) {
					return local47;
				}
			}
		}
		return null;
	}
}
