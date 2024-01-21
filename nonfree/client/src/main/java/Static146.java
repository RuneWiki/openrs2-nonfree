import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigInteger;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!se", name = "y", descriptor = "[I")
	public static int[] anIntArray618;

	@OriginalMember(owner = "client!se", name = "z", descriptor = "Lclient!jh;")
	public static Class3_Sub2_Sub2_Sub1_Sub1 aClass3_Sub2_Sub2_Sub1_Sub1_5;

	@OriginalMember(owner = "client!se", name = "A", descriptor = "[Lclient!fb;")
	public static Class3_Sub2_Sub2_Sub4[] aClass3_Sub2_Sub2_Sub4Array7;

	@OriginalMember(owner = "client!se", name = "K", descriptor = "Lclient!ah;")
	public static Class7 aClass7_61;

	@OriginalMember(owner = "client!se", name = "L", descriptor = "Lclient!oc;")
	public static Class61 aClass61_7;

	@OriginalMember(owner = "client!se", name = "s", descriptor = "I")
	public static int anInt3647 = 0;

	@OriginalMember(owner = "client!se", name = "w", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!se", name = "C", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1226 = Static170.method3101("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!se", name = "Q", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1227 = aClass28_1226;

	@OriginalMember(owner = "client!se", name = "T", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1228 = Static170.method3101("Please enter your password)3");

	@OriginalMember(owner = "client!se", name = "V", descriptor = "Lclient!pa;")
	public static Class63 aClass63_27 = new Class63(64);

	@OriginalMember(owner = "client!se", name = "W", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1229 = Static170.method3101("Fallen lassen");

	@OriginalMember(owner = "client!se", name = "Y", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1230 = aClass28_1228;

	@OriginalMember(owner = "client!se", name = "Z", descriptor = "[[I")
	public static int[][] anIntArrayArray27 = new int[5][5000];

	@OriginalMember(owner = "client!se", name = "ab", descriptor = "I")
	public static int anInt3665 = 0;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method2791(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(5) String local5 = "";
			if (arg0 != null) {
				local5 = method2794(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg1;
			}
			System.out.println("Error: " + local5);
			local5 = local5.replace(':', '.');
			local5 = local5.replace('@', '_');
			local5 = local5.replace('&', '_');
			local5 = local5.replace('#', '_');
			if (Static111.aClass68_3.anApplet1 != null) {
				@Pc(104) Class61 local104 = Static111.aClass68_3.method2532(new URL(Static111.aClass68_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static32.anInt971 + "&u=" + Static151.aLong124 + "&v1=" + Static130.aString5 + "&v2=" + Static130.aString3 + "&e=" + local5));
				while (local104.anInt2845 == 0) {
					Static65.method1574(1L);
				}
				if (local104.anInt2845 == 1) {
					@Pc(121) DataInputStream local121 = (DataInputStream) local104.anObject4;
					local121.read();
					local121.close();
				}
			}
		} catch (@Pc(128) Exception local128) {
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)Lclient!eh;")
	public static Class28 method2793(@OriginalArg(0) int arg0) {
		return Static77.method1751(arg0, false);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;")
	private static String method2794(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(15) String local15;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(5) RuntimeException_Sub1 local5 = (RuntimeException_Sub1) arg0;
			local15 = local5.aString2 + " | ";
			arg0 = local5.aThrowable1;
		} else {
			local15 = "";
		}
		@Pc(25) StringWriter local25 = new StringWriter();
		@Pc(34) PrintWriter local34 = new PrintWriter(local25);
		arg0.printStackTrace(local34);
		local34.close();
		@Pc(42) String local42 = local25.toString();
		@Pc(50) BufferedReader local50 = new BufferedReader(new StringReader(local42));
		@Pc(53) String local53 = local50.readLine();
		while (true) {
			while (true) {
				@Pc(56) String local56 = local50.readLine();
				if (local56 == null) {
					return local15 + "| " + local53;
				}
				@Pc(62) int local62 = local56.indexOf(40);
				@Pc(69) int local69 = local56.indexOf(41, local62 + 1);
				if (local62 >= 0 && local69 >= 0) {
					@Pc(80) String local80 = local56.substring(local62 + 1, local69);
					@Pc(84) int local84 = local80.indexOf(".java:");
					if (local84 >= 0) {
						local80 = local80.substring(0, local84) + local80.substring(local84 + 5);
						local15 = local15 + local80 + ' ';
						continue;
					}
					local56 = local56.substring(0, local62);
				}
				local56 = local56.trim();
				local56 = local56.substring(local56.lastIndexOf(32) + 1);
				local56 = local56.substring(local56.lastIndexOf(9) + 1);
				local15 = local15 + local56 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
	public static void method2796() {
		aClass28_1229 = null;
		aBigInteger1 = null;
		aClass3_Sub2_Sub2_Sub4Array7 = null;
		anIntArray618 = null;
		anIntArrayArray27 = null;
		aClass61_7 = null;
		aClass3_Sub2_Sub2_Sub1_Sub1_5 = null;
		aClass7_61 = null;
		aClass28_1226 = null;
		aClass28_1227 = null;
		aClass28_1230 = null;
		aClass28_1228 = null;
		aClass63_27 = null;
	}
}
