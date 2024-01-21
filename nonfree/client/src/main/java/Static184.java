import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "Lclient!vg;")
	public static Class85 aClass85_16;

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1754 = Static32.method683("Checking for updates )2 ");

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1753 = aClass49_1754;

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
	public static int anInt4072 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	public static void method3036() {
		aClass49_1753 = null;
		aClass49_1754 = null;
		aClass85_16 = null;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)V")
	public static void method3037(@OriginalArg(1) int arg0) {
		for (@Pc(15) Class2_Sub21 local15 = (Class2_Sub21) Static171.aClass25_14.method837(); local15 != null; local15 = (Class2_Sub21) Static171.aClass25_14.method834()) {
			if ((local15.aLong157 >> 48 & 0xFFFFL) == (long) arg0) {
				local15.method3007();
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[Lclient!vg;I)V")
	public static void method3038(@OriginalArg(1) Class85[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class85 local13 = arg0[local7];
			if (local13 != null) {
				if (local13.anInt3855 == 0) {
					if (local13.aClass85Array2 != null) {
						method3038(local13.aClass85Array2, arg1);
					}
					@Pc(34) Class2_Sub8 local34 = (Class2_Sub8) Static100.aClass25_7.method836((long) local13.anInt3849);
					if (local34 != null) {
						Static24.method455(arg1, local34.anInt1201);
					}
				}
				@Pc(55) Class2_Sub12 local55;
				if (arg1 == 0 && local13.anObjectArray19 != null) {
					local55 = new Class2_Sub12();
					local55.aClass85_4 = local13;
					local55.anObjectArray2 = local13.anObjectArray19;
					Static38.method766(local55);
				}
				if (arg1 == 1 && local13.anObjectArray23 != null) {
					if (local13.anInt3866 >= 0) {
						@Pc(81) Class85 local81 = Static140.method2337(local13.anInt3849);
						if (local81 == null || local81.aClass85Array2 == null || local81.aClass85Array2.length <= local13.anInt3866 || local81.aClass85Array2[local13.anInt3866] != local13) {
							continue;
						}
					}
					local55 = new Class2_Sub12();
					local55.aClass85_4 = local13;
					local55.anObjectArray2 = local13.anObjectArray23;
					Static38.method766(local55);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method3039(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local6 = local11.aString6 + " | ";
		} else {
			local6 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			while (true) {
				@Pc(64) String local64 = local53.readLine();
				if (local64 == null) {
					return local6 + "| " + local56;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(88) String local88 = local64.substring(local70 + 1, local77);
					@Pc(92) int local92 = local88.indexOf(".java:");
					if (local92 >= 0) {
						local88 = local88.substring(0, local92) + local88.substring(local92 + 5);
						local6 = local6 + local88 + ' ';
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
