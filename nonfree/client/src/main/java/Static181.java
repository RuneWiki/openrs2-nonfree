import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!wh", name = "ib", descriptor = "Lclient!cf;")
	public static Class13 aClass13_1;

	@OriginalMember(owner = "client!wh", name = "jb", descriptor = "I")
	public static int anInt4071 = 1;

	@OriginalMember(owner = "client!wh", name = "lb", descriptor = "I")
	public static int anInt4073 = 0;

	@OriginalMember(owner = "client!wh", name = "nb", descriptor = "Lclient!ch;")
	public static Class14 aClass14_208 = new Class14(100);

	@OriginalMember(owner = "client!wh", name = "qb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2451 = Static107.method1838("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!wh", name = "rb", descriptor = "[I")
	public static int[] anIntArray371 = new int[100];

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!ff;IIIIIII)V")
	public static void method2905(@OriginalArg(0) Class24 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static9.aBoolean13) {
			Static26.anInt809 = 32;
		} else {
			Static26.anInt809 = 0;
		}
		Static9.aBoolean13 = false;
		@Pc(110) int local110;
		if (Static152.anInt3425 != 0) {
			if (arg2 >= arg6 && arg6 + 16 > arg2 && arg1 >= arg5 && arg5 + 16 > arg1) {
				arg0.anInt1406 -= 4;
				Static104.method1828(arg0);
			} else if (arg2 >= arg6 && arg2 < arg6 + 16 && arg1 >= arg5 + arg4 - 16 && arg1 < arg5 + arg4) {
				arg0.anInt1406 += 4;
				Static104.method1828(arg0);
			} else if (arg6 - Static26.anInt809 <= arg2 && arg2 < arg6 + Static26.anInt809 + 16 && arg5 + 16 <= arg1 && arg1 < arg5 + arg4 - 16) {
				local110 = arg4 * (arg4 - 32) / arg3;
				if (local110 < 8) {
					local110 = 8;
				}
				@Pc(129) int local129 = arg1 - local110 / 2 - arg5 - 16;
				@Pc(136) int local136 = arg4 - local110 - 32;
				arg0.anInt1406 = (arg3 - arg4) * local129 / local136;
				Static104.method1828(arg0);
				Static9.aBoolean13 = true;
			}
		}
		if (Static148.anInt3354 == 0) {
			return;
		}
		local110 = arg0.anInt1357;
		if (arg6 - local110 <= arg2 && arg5 <= arg1 && arg6 + 16 > arg2 && arg1 <= arg4 + arg5) {
			arg0.anInt1406 += Static148.anInt3354 * 45;
			Static104.method1828(arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method2906(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString1 + " | ";
		} else {
			local10 = "";
		}
		@Pc(40) StringWriter local40 = new StringWriter();
		@Pc(45) PrintWriter local45 = new PrintWriter(local40);
		arg0.printStackTrace(local45);
		local45.close();
		@Pc(53) String local53 = local40.toString();
		@Pc(61) BufferedReader local61 = new BufferedReader(new StringReader(local53));
		@Pc(64) String local64 = local61.readLine();
		while (true) {
			while (true) {
				@Pc(67) String local67 = local61.readLine();
				if (local67 == null) {
					return local10 + "| " + local64;
				}
				@Pc(73) int local73 = local67.indexOf(40);
				@Pc(80) int local80 = local67.indexOf(41, local73 + 1);
				if (local73 >= 0 && local80 >= 0) {
					@Pc(91) String local91 = local67.substring(local73 + 1, local80);
					@Pc(95) int local95 = local91.indexOf(".java:");
					if (local95 >= 0) {
						local91 = local91.substring(0, local95) + local91.substring(local95 + 5);
						local10 = local10 + local91 + ' ';
						continue;
					}
					local67 = local67.substring(0, local73);
				}
				local67 = local67.trim();
				local67 = local67.substring(local67.lastIndexOf(32) + 1);
				local67 = local67.substring(local67.lastIndexOf(9) + 1);
				local10 = local10 + local67 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
	public static void method2908() {
		anIntArray371 = null;
		aClass28_2451 = null;
		aClass13_1 = null;
		aClass14_208 = null;
	}
}
