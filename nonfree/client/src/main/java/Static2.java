import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Lclient!kd;")
	public static Class40_Sub1 aClass40_Sub1_9;

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "Lclient!qf;")
	public static Class4_Sub4_Sub3_Sub4 aClass4_Sub4_Sub3_Sub4_3;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "Lclient!qc;")
	private static Class60 aClass60_520 = Static121.method2047("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Lclient!qc;")
	public static Class60 aClass60_519 = aClass60_520;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
	public static int anInt1352 = -1;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "Lclient!qc;")
	public static Class60 aClass60_521 = aClass60_520;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
	public static int anInt1353 = 0;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "[I")
	public static int[] anIntArray144 = new int[1000];

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "Lclient!qc;")
	public static Class60 aClass60_522 = Static121.method2047("Versteckt");

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
	public static int anInt1356 = 0;

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "Lclient!qc;")
	public static Class60 aClass60_523 = Static121.method2047("au");

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "Z")
	public static final boolean aBoolean49 = false;

	@OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
	public static volatile int anInt1360 = 0;

	@OriginalMember(owner = "client!aa", name = "v", descriptor = "Lclient!qc;")
	public static Class60 aClass60_524 = Static121.method2047("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method991(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString4 + " | ";
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
					@Pc(94) String local94 = local64.substring(local70 + 1, local77);
					@Pc(98) int local98 = local94.indexOf(".java:");
					if (local98 >= 0) {
						local94 = local94.substring(0, local98) + local94.substring(local98 + 5);
						local10 = local10 + local94 + ' ';
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

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public static void method992() {
		aClass60_522 = null;
		aClass60_519 = null;
		aClass60_524 = null;
		aClass4_Sub4_Sub3_Sub4_3 = null;
		aClass60_523 = null;
		aClass40_Sub1_9 = null;
		aClass60_521 = null;
		aClass60_520 = null;
		anIntArray144 = null;
	}
}
