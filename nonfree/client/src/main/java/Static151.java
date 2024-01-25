import java.awt.Frame;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!ji", name = "N", descriptor = "[I")
	public static final int[] anIntArray295 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!ji", name = "T", descriptor = "Lclient!le;")
	public static final Class122 aClass122_7 = new Class122(64);

	@OriginalMember(owner = "client!ji", name = "U", descriptor = "I")
	public static int anInt2973 = 0;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method2735(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(27) String local27;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(14) RuntimeException_Sub1 local14 = (RuntimeException_Sub1) arg0;
			arg0 = local14.aThrowable1;
			local27 = local14.aString8 + " | ";
		} else {
			local27 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local34.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			@Pc(61) String local61 = local55.readLine();
			if (local61 == null) {
				return local27 + "| " + local58;
			}
			@Pc(67) int local67 = local61.indexOf(40);
			@Pc(74) int local74 = local61.indexOf(41, local67 + 1);
			@Pc(80) String local80;
			if (local67 == -1) {
				local80 = local61;
			} else {
				local80 = local61.substring(0, local67);
			}
			local80 = local80.trim();
			local80 = local80.substring(local80.lastIndexOf(32) + 1);
			local80 = local80.substring(local80.lastIndexOf(9) + 1);
			local27 = local27 + local80;
			if (local67 != -1 && local74 != -1) {
				@Pc(126) int local126 = local61.indexOf(".java:", local67);
				if (local126 >= 0) {
					local27 = local27 + local61.substring(local126 + 5, local74);
				}
			}
			local27 = local27 + ' ';
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/awt/Frame;ILclient!ne;)V")
	public static void method2736(@OriginalArg(0) Frame arg0, @OriginalArg(2) Class139 arg1) {
		while (true) {
			@Pc(10) Class16 local10 = arg1.method3863(arg0);
			while (local10.anInt381 == 0) {
				Static20.method408(10L);
			}
			if (local10.anInt381 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static20.method408(100L);
		}
	}
}
