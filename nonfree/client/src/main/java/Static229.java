import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!ir", name = "s", descriptor = "[I")
	public static int[] anIntArray594;

	@OriginalMember(owner = "client!ir", name = "i", descriptor = "Lclient!lg;")
	public static final Class201 aClass201_46 = new Class201(1, 2, 2, 0);

	@OriginalMember(owner = "client!ir", name = "u", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_210 = new Class81(80, 6);

	@OriginalMember(owner = "client!ir", name = "v", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_211 = new Class81(112, 19);

	@OriginalMember(owner = "client!ir", name = "z", descriptor = "J")
	public static long aLong386 = -1L;

	@OriginalMember(owner = "client!ir", name = "A", descriptor = "Lclient!sr;")
	public static Applet_Sub1 anApplet_Sub1_20 = null;

	@OriginalMember(owner = "client!ir", name = "B", descriptor = "Z")
	public static boolean aBoolean645 = false;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILclient!wv;Lclient!ua;BIILclient!f;)V")
	public static void method7248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class365 arg2, @OriginalArg(3) Class200 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class10 arg6) {
		if (arg6 == null) {
			return;
		}
		@Pc(21) int local21;
		if (Static585.anInt9461 == 4) {
			local21 = (int) Static143.aFloat61 & 0x3FFF;
		} else {
			local21 = (int) Static143.aFloat61 + Static368.anInt6520 & 0x3FFF;
		}
		@Pc(42) int local42 = Math.max(arg2.anInt9578 / 2, arg2.anInt9638 / 2) + 10;
		@Pc(50) int local50 = arg4 * arg4 + arg1 * arg1;
		if (local42 * local42 < local50) {
			return;
		}
		@Pc(60) int local60 = Class151.anIntArray244[local21];
		@Pc(64) int local64 = Class151.anIntArray245[local21];
		if (Static585.anInt9461 != 4) {
			local60 = local60 * 256 / (Static536.anInt8845 + 256);
			local64 = local64 * 256 / (Static536.anInt8845 + 256);
		}
		@Pc(93) int local93 = local64 * arg4 + local60 * arg1 >> 14;
		@Pc(104) int local104 = local64 * arg1 - arg4 * local60 >> 14;
		arg6.method7683(arg5 + arg2.anInt9578 / 2 + local93 - arg6.A() / 2, -local104 + arg2.anInt9638 / 2 + arg0 + -(arg6.ca() / 2), arg3, arg5, arg0);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method7250(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString42 + " | ";
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			@Pc(59) String local59 = local53.readLine();
			if (local59 == null) {
				return local10 + "| " + local56;
			}
			@Pc(65) int local65 = local59.indexOf(40);
			@Pc(72) int local72 = local59.indexOf(41, local65 + 1);
			@Pc(77) String local77;
			if (local65 == -1) {
				local77 = local59;
			} else {
				local77 = local59.substring(0, local65);
			}
			local77 = local77.trim();
			local77 = local77.substring(local77.lastIndexOf(32) + 1);
			local77 = local77.substring(local77.lastIndexOf(9) + 1);
			local10 = local10 + local77;
			if (local65 != -1 && local72 != -1) {
				@Pc(124) int local124 = local59.indexOf(".java:", local65);
				if (local124 >= 0) {
					local10 = local10 + local59.substring(local124 + 5, local72);
				}
			}
			local10 = local10 + ' ';
		}
	}

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "(I)V")
	public static void method7251() {
		Static183.aClass326_16.method7230();
	}
}
