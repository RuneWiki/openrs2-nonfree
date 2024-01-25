import java.awt.Canvas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString53;

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
	public static int anInt5890;

	@OriginalMember(owner = "client!tg", name = "r", descriptor = "[I")
	public static int[] anIntArray456;

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString54;

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "Lclient!ei;")
	public static final Class44 aClass44_9 = new Class44(128);

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "Lclient!il;")
	public static final Class93 aClass93_18 = new Class93(7, 17);

	@OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
	public static final int anInt5899 = 205;

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "[I")
	public static final int[] anIntArray457 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method5295(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString6 + " | ";
		} else {
			local24 = "";
		}
		@Pc(40) StringWriter local40 = new StringWriter();
		@Pc(45) PrintWriter local45 = new PrintWriter(local40);
		arg0.printStackTrace(local45);
		local45.close();
		@Pc(53) String local53 = local40.toString();
		@Pc(61) BufferedReader local61 = new BufferedReader(new StringReader(local53));
		@Pc(64) String local64 = local61.readLine();
		while (true) {
			@Pc(67) String local67 = local61.readLine();
			if (local67 == null) {
				return local24 + "| " + local64;
			}
			@Pc(73) int local73 = local67.indexOf(40);
			@Pc(80) int local80 = local67.indexOf(41, local73 + 1);
			@Pc(89) String local89;
			if (local73 == -1) {
				local89 = local67;
			} else {
				local89 = local67.substring(0, local73);
			}
			local89 = local89.trim();
			local89 = local89.substring(local89.lastIndexOf(32) + 1);
			local89 = local89.substring(local89.lastIndexOf(9) + 1);
			local24 = local24 + local89;
			if (local73 != -1 && local80 != -1) {
				@Pc(134) int local134 = local67.indexOf(".java:", local73);
				if (local134 >= 0) {
					local24 = local24 + local67.substring(local134 + 5, local80);
				}
			}
			local24 = local24 + ' ';
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)I")
	public static int method5299() {
		@Pc(7) Class63 local7 = Static9.aClass63_1;
		@Pc(9) boolean local9 = false;
		if (Static241.anInt4925 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local9 = true;
			local7 = Static93.method4640(0, 0, null, null, local18);
		}
		@Pc(35) long local35 = Static183.method3462();
		for (@Pc(37) int local37 = 0; local37 < 10000; local37++) {
			local7.method4610();
		}
		@Pc(67) int local67 = (int) (Static183.method3462() - local35);
		local7.method4639(0, 0, 100, -16777216, 100);
		if (local9) {
			local7.method4625();
		}
		return local67;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)I")
	public static int method5305(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (arg0 + local12) / arg1 - local12;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIII)V")
	public static void method5307(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static93.anInt5014 <= arg4 - arg1 && Static122.anInt1360 >= arg1 + arg4 && arg0 - arg1 >= Static131.anInt2843 && arg0 + arg1 <= Static38.anInt945) {
			Static141.method2839(arg1, arg4, arg2, arg3, arg0, arg5);
		} else {
			Static42.method984(arg5, arg1, arg0, arg4, arg2, arg3);
		}
	}
}
