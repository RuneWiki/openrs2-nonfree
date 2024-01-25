import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "Lclient!kda;")
	public static Class160 aClass160_37;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "Lclient!mo;")
	public static final Class196 aClass196_3 = new Class196();

	@OriginalMember(owner = "client!gp", name = "l", descriptor = "[I")
	public static final int[] anIntArray288 = new int[14];

	@OriginalMember(owner = "client!gp", name = "m", descriptor = "[[F")
	public static final float[][] aFloatArrayArray2 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method3270(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(13) String local13;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(17) RuntimeException_Sub1 local17 = (RuntimeException_Sub1) arg0;
			arg0 = local17.aThrowable1;
			local13 = local17.aString30 + " | ";
		} else {
			local13 = "";
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
				return local13 + "| " + local58;
			}
			@Pc(67) int local67 = local61.indexOf(40);
			@Pc(74) int local74 = local61.indexOf(41, local67 + 1);
			@Pc(82) String local82;
			if (local67 == -1) {
				local82 = local61;
			} else {
				local82 = local61.substring(0, local67);
			}
			local82 = local82.trim();
			local82 = local82.substring(local82.lastIndexOf(32) + 1);
			local82 = local82.substring(local82.lastIndexOf(9) + 1);
			local13 = local13 + local82;
			if (local67 != -1 && local74 != -1) {
				@Pc(125) int local125 = local61.indexOf(".java:", local67);
				if (local125 >= 0) {
					local13 = local13 + local61.substring(local125 + 5, local74);
				}
			}
			local13 = local13 + ' ';
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!vp;B)V")
	public static void method3271(@OriginalArg(0) Class309 arg0) {
		if (arg0.anInt8761 != Static72.anInt2028) {
			return;
		}
		if (Static16.aClass47_Sub2_Sub3_Sub2_1.aString36 == null) {
			arg0.anInt8778 = 0;
			arg0.anInt8794 = 0;
			return;
		}
		arg0.anInt8724 = 150;
		arg0.anInt8757 = (int) (Math.sin((double) Static416.anInt7252 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt8792 = 5;
		arg0.anInt8794 = Static150.anInt3353;
		arg0.anInt8778 = Static476.method6226(Static16.aClass47_Sub2_Sub3_Sub2_1.aString36);
		arg0.anInt8776 = Static16.aClass47_Sub2_Sub3_Sub2_1.anInt5054;
		arg0.anInt8738 = Static16.aClass47_Sub2_Sub3_Sub2_1.anInt5021;
		arg0.anInt8766 = Static16.aClass47_Sub2_Sub3_Sub2_1.anInt5039;
		arg0.anInt8791 = 0;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)V")
	public static void method3272() {
		for (@Pc(1) int local1 = 0; local1 < 5; local1++) {
			Static385.aBooleanArray27[local1] = false;
		}
		Static547.anInt9478 = -1;
		Static464.anInt8003 = 1;
		Static97.anInt6559 = 0;
		Static341.anInt6385 = -1;
		Static501.anInt8508 = 0;
	}
}
