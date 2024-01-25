import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static643 {

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "I")
	public static int anInt10191 = 0;

	@OriginalMember(owner = "client!vn", name = "C", descriptor = "[S")
	private static final short[] aShortArray148 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!vn", name = "R", descriptor = "[S")
	private static final short[] aShortArray150 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!vn", name = "x", descriptor = "[S")
	private static final short[] aShortArray147 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!vn", name = "L", descriptor = "[S")
	private static final short[] aShortArray149 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!vn", name = "v", descriptor = "[[S")
	public static final short[][] aShortArrayArray30 = new short[][] { aShortArray148, aShortArray150, aShortArray147, aShortArray149 };

	@OriginalMember(owner = "client!vn", name = "K", descriptor = "Lclient!jda;")
	public static final Class165 aClass165_77 = new Class165(260);

	@OriginalMember(owner = "client!vn", name = "S", descriptor = "[I")
	public static final int[] anIntArray893 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	public static void method8930() {
		Static401.method5649();
		@Pc(12) int local12 = Static24.aClass3_Sub22_4.aClass6_Sub2_1.method601();
		if (local12 == 2) {
			Static652.method9040(Static674.aClass13_22, Static222.anInt4196, Static312.anInt5191);
		} else if (local12 == 3) {
			Static514.method7237(Static222.anInt4196, Static664.anInt10594, Static674.aClass13_22, Static9.anInt99, Static312.anInt5191);
		}
		if (Static24.aClass3_Sub22_4.aClass6_Sub2_1.method605()) {
			Static651.method9018(Static126.aCanvas6);
		}
		if (Static674.aClass13_22 != null) {
			Static585.method8258();
		}
		Static443.aBoolean515 = Static24.aClass3_Sub22_4.aClass6_Sub2_1.method601() != 0;
		Static82.aBoolean134 = Static24.aClass3_Sub22_4.aClass6_Sub2_1.method605();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method8934(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString1 + " | ";
			arg0 = local15.aThrowable1;
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local45));
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
				@Pc(130) int local130 = local64.indexOf(".java:", local70);
				if (local130 >= 0) {
					local10 = local10 + local64.substring(local130 + 5, local77);
				}
			}
			local10 = local10 + ' ';
		}
	}
}
