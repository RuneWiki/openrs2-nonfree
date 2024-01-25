import java.awt.Canvas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
	public static int anInt146;

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "[I")
	public static int[] anIntArray9;

	@OriginalMember(owner = "client!ag", name = "M", descriptor = "I")
	public static int anInt158;

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "Z")
	public static final boolean aBoolean10 = false;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method197(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString96 + " | ";
		} else {
			local10 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local34.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(65) String local65 = local55.readLine();
		while (true) {
			@Pc(68) String local68 = local55.readLine();
			if (local68 == null) {
				return local10 + "| " + local65;
			}
			@Pc(74) int local74 = local68.indexOf(40);
			@Pc(81) int local81 = local68.indexOf(41, local74 + 1);
			@Pc(91) String local91;
			if (local74 == -1) {
				local91 = local68;
			} else {
				local91 = local68.substring(0, local74);
			}
			local91 = local91.trim();
			local91 = local91.substring(local91.lastIndexOf(32) + 1);
			local91 = local91.substring(local91.lastIndexOf(9) + 1);
			local10 = local10 + local91;
			if (local74 != -1 && local81 != -1) {
				@Pc(143) int local143 = local68.indexOf(".java:", local74);
				if (local143 >= 0) {
					local10 = local10 + local68.substring(local143 + 5, local81);
				}
			}
			local10 = local10 + ' ';
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!d;BILjava/awt/Canvas;I)Lclient!ha;")
	public static Class100 method198(@OriginalArg(0) Interface7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) int arg3) {
		return new Class100_Sub2(arg2, arg0, arg3, arg1);
	}
}
