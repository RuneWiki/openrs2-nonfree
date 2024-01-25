import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!nr", name = "F", descriptor = "[I")
	public static int[] anIntArray601;

	@OriginalMember(owner = "client!nr", name = "jb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!nr", name = "W", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_43 = new Class103(64);

	@OriginalMember(owner = "client!nr", name = "gb", descriptor = "[S")
	public static final short[] aShortArray85 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!nr", name = "hb", descriptor = "[I")
	public static final int[] anIntArray602 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIB)V")
	public static void method3928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static23.anInt5708 = arg1 - Static306.anInt3327;
		Static142.anInt3109 = arg0 - Static306.anInt3329;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!kk;BIII)V")
	public static void method3929(@OriginalArg(0) Class122 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) Class7_Sub26 local12 = (Class7_Sub26) Static75.aClass74_7.method1793(); local12 != null; local12 = (Class7_Sub26) Static75.aClass74_7.method1798()) {
			if (arg1 == local12.anInt3934 && arg2 * 128 == local12.anInt3942 && arg3 * 128 == local12.anInt3945 && arg0.anInt3534 == local12.aClass122_1.anInt3534) {
				if (local12.aClass7_Sub8_Sub4_1 != null) {
					Static134.aClass7_Sub8_Sub3_2.method3898(local12.aClass7_Sub8_Sub4_1);
					local12.aClass7_Sub8_Sub4_1 = null;
				}
				if (local12.aClass7_Sub8_Sub4_2 != null) {
					Static134.aClass7_Sub8_Sub3_2.method3898(local12.aClass7_Sub8_Sub4_2);
					local12.aClass7_Sub8_Sub4_2 = null;
				}
				local12.method5648();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3930(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4) {
		Static342.method5549(arg2, arg3, arg4, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method3934(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(8) String local8;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(12) RuntimeException_Sub1 local12 = (RuntimeException_Sub1) arg0;
			local8 = local12.aString96 + " | ";
			arg0 = local12.aThrowable1;
		} else {
			local8 = "";
		}
		@Pc(29) StringWriter local29 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local29);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local29.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			@Pc(61) String local61 = local55.readLine();
			if (local61 == null) {
				return local8 + "| " + local58;
			}
			@Pc(67) int local67 = local61.indexOf(40);
			@Pc(74) int local74 = local61.indexOf(41, local67 + 1);
			@Pc(79) String local79;
			if (local67 == -1) {
				local79 = local61;
			} else {
				local79 = local61.substring(0, local67);
			}
			local79 = local79.trim();
			local79 = local79.substring(local79.lastIndexOf(32) + 1);
			local79 = local79.substring(local79.lastIndexOf(9) + 1);
			local8 = local8 + local79;
			if (local67 != -1 && local74 != -1) {
				@Pc(125) int local125 = local61.indexOf(".java:", local67);
				if (local125 >= 0) {
					local8 = local8 + local61.substring(local125 + 5, local74);
				}
			}
			local8 = local8 + ' ';
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
	public static void method3935() {
		Static21.aClass103_2.method2678();
		Static131.aClass103_26.method2678();
		Static128.aClass103_25.method2678();
		Static187.aClass103_33.method2678();
		Static262.aClass103_50.method2678();
	}
}
