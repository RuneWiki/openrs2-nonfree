import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!km", name = "c", descriptor = "F")
	public static float aFloat57;

	@OriginalMember(owner = "client!km", name = "h", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray25;

	@OriginalMember(owner = "client!km", name = "i", descriptor = "I")
	public static int anInt3914;

	@OriginalMember(owner = "client!km", name = "d", descriptor = "[I")
	public static final int[] anIntArray325 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!km", name = "e", descriptor = "F")
	public static float aFloat58 = 1.0F;

	@OriginalMember(owner = "client!km", name = "g", descriptor = "Lclient!ah;")
	public static final Class1_Sub5_Sub1 aClass1_Sub5_Sub1_2 = new Class1_Sub5_Sub1(5000);

	@OriginalMember(owner = "client!km", name = "j", descriptor = "I")
	public static int anInt3915 = 0;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method3302(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(19) String local19;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(9) RuntimeException_Sub1 local9 = (RuntimeException_Sub1) arg0;
			local19 = local9.aString19 + " | ";
			arg0 = local9.aThrowable1;
		} else {
			local19 = "";
		}
		@Pc(29) StringWriter local29 = new StringWriter();
		@Pc(34) PrintWriter local34 = new PrintWriter(local29);
		arg0.printStackTrace(local34);
		local34.close();
		@Pc(50) String local50 = local29.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			@Pc(64) String local64 = local58.readLine();
			if (local64 == null) {
				return local19 + "| " + local61;
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
			local19 = local19 + local83;
			if (local70 != -1 && local77 != -1) {
				@Pc(129) int local129 = local64.indexOf(".java:", local70);
				if (local129 >= 0) {
					local19 = local19 + local64.substring(local129 + 5, local77);
				}
			}
			local19 = local19 + ' ';
		}
	}
}
