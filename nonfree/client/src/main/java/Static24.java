import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!at", name = "g", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_7 = new Class73(15, -2);

	@OriginalMember(owner = "client!at", name = "j", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_9 = new Class185(58, 8);

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIIIII)Lclient!di;")
	public static Class31 method699(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(38) long local38 = (long) arg1 * 76724863L ^ (long) arg0 * 986053L ^ (long) arg4 * 67481L ^ (long) arg5 * 97549L ^ (long) arg3 * 475427L ^ (long) arg2 * 32147369L;
		@Pc(44) Class31 local44 = (Class31) Static235.aClass94_6.method2960(local38);
		if (local44 == null) {
			local44 = Static443.aClass5_12.method6166(arg4, arg5, arg3, arg0, arg2, arg1);
			Static235.aClass94_6.method2963(local38, local44);
			return local44;
		} else {
			return local44;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method704(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString87 + " | ";
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(50) String local50 = local32.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			@Pc(64) String local64 = local58.readLine();
			if (local64 == null) {
				return local10 + "| " + local61;
			}
			@Pc(70) int local70 = local64.indexOf(40);
			@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
			@Pc(85) String local85;
			if (local70 == -1) {
				local85 = local64;
			} else {
				local85 = local64.substring(0, local70);
			}
			local85 = local85.trim();
			local85 = local85.substring(local85.lastIndexOf(32) + 1);
			local85 = local85.substring(local85.lastIndexOf(9) + 1);
			local10 = local10 + local85;
			if (local70 != -1 && local77 != -1) {
				@Pc(128) int local128 = local64.indexOf(".java:", local70);
				if (local128 >= 0) {
					local10 = local10 + local64.substring(local128 + 5, local77);
				}
			}
			local10 = local10 + ' ';
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(III)Z")
	public static boolean method706(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static598.method8290(arg1, arg0) || Static290.method5003(arg1, arg0);
	}
}
