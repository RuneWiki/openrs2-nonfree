import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "F")
	public static float aFloat125;

	@OriginalMember(owner = "client!ol", name = "u", descriptor = "[[B")
	public static byte[][] aByteArrayArray50;

	@OriginalMember(owner = "client!ol", name = "s", descriptor = "Lclient!wm;")
	public static final Class267 aClass267_84 = new Class267(4);

	@OriginalMember(owner = "client!ol", name = "t", descriptor = "Lclient!dg;")
	public static Applet_Sub1 anApplet_Sub1_27 = null;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BIII)V")
	public static void method5895(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class10_Sub1_Sub17 local8 = Static154.method2630(9, arg0);
		local8.method5345();
		local8.anInt6813 = arg2;
		local8.anInt6806 = arg1;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method5898(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString31 + " | ";
		} else {
			local24 = "";
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
				return local24 + "| " + local61;
			}
			@Pc(70) int local70 = local64.indexOf(40);
			@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
			@Pc(83) String local83;
			if (local70 == -1) {
				local83 = local64;
			} else {
				local83 = local64.substring(0, local70);
			}
			local83 = local83.trim();
			local83 = local83.substring(local83.lastIndexOf(32) + 1);
			local83 = local83.substring(local83.lastIndexOf(9) + 1);
			local24 = local24 + local83;
			if (local70 != -1 && local77 != -1) {
				@Pc(130) int local130 = local64.indexOf(".java:", local70);
				if (local130 >= 0) {
					local24 = local24 + local64.substring(local130 + 5, local77);
				}
			}
			local24 = local24 + ' ';
		}
	}
}
