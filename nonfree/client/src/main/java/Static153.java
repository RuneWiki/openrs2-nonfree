import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
	public static int anInt673;

	@OriginalMember(owner = "client!rc", name = "K", descriptor = "[Lclient!fd;")
	public static Class3_Sub9[] aClass3_Sub9Array2;

	@OriginalMember(owner = "client!rc", name = "Y", descriptor = "I")
	private static int anInt688;

	@OriginalMember(owner = "client!rc", name = "P", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_213 = Static120.method1824("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "Lclient!rd;")
	public static Class80 aClass80_210 = aClass80_213;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_211 = Static120.method1824("<col=ffff00>");

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "J")
	public static long aLong22 = 0L;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "[Lclient!wa;")
	public static final Class93[] aClass93Array2 = new Class93[50];

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	public static int anInt657 = 0;

	@OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
	public static int anInt672 = 0;

	@OriginalMember(owner = "client!rc", name = "C", descriptor = "[I")
	public static final int[] anIntArray86 = new int[2000];

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "[Lclient!ad;")
	public static final Class4[] aClass4Array2 = new Class4[5000];

	@OriginalMember(owner = "client!rc", name = "E", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_212 = Static120.method1824("welle:");

	@OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
	public static int anInt685 = 0;

	@OriginalMember(owner = "client!rc", name = "V", descriptor = "I")
	public static int anInt686 = -1;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public static void method447() {
		if (Static51.anIntArray160 != null && Static48.anIntArray150 != null) {
			return;
		}
		Static48.anIntArray150 = new int[256];
		Static51.anIntArray160 = new int[256];
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(26) double local26 = (double) local17 / 255.0D * 6.283185307179586D;
			Static51.anIntArray160[local17] = (int) (Math.sin(local26) * 4096.0D);
			Static48.anIntArray150[local17] = (int) (Math.cos(local26) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IJ)V")
	public static void method449(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static116.anInt4479; local12++) {
			if (Static186.aLongArray10[local12] == arg0) {
				Static116.anInt4479--;
				for (@Pc(31) int local31 = local12; local31 < Static116.anInt4479; local31++) {
					Static141.aClass80Array20[local31] = Static141.aClass80Array20[local31 + 1];
					Static161.anIntArray450[local31] = Static161.anIntArray450[local31 + 1];
					Static56.aClass80Array10[local31] = Static56.aClass80Array10[local31 + 1];
					Static186.aLongArray10[local31] = Static186.aLongArray10[local31 + 1];
					Static184.anIntArray496[local31] = Static184.anIntArray496[local31 + 1];
				}
				Static168.anInt3770 = Static31.anInt747;
				Static146.aClass3_Sub17_Sub1_3.method2146(52);
				Static146.aClass3_Sub17_Sub1_3.method2112(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!de;)V")
	public static void method452(@OriginalArg(1) Class19 arg0) {
		Static22.aClass19_1 = arg0;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method462(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString1 + " | ";
			arg0 = local15.aThrowable1;
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
}
