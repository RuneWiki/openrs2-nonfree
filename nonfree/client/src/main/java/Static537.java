import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
	public static int anInt4380;

	@OriginalMember(owner = "client!uk", name = "v", descriptor = "Z")
	public static boolean aBoolean334 = false;

	@OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
	public static int anInt4383 = 0;

	@OriginalMember(owner = "client!uk", name = "y", descriptor = "J")
	public static long aLong125 = -1L;

	@OriginalMember(owner = "client!uk", name = "z", descriptor = "[I")
	public static final int[] anIntArray350 = new int[5];

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method3878(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString32 + " | ";
		} else {
			local24 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(42) PrintWriter local42 = new PrintWriter(local32);
		arg0.printStackTrace(local42);
		local42.close();
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
			@Pc(85) String local85;
			if (local70 == -1) {
				local85 = local64;
			} else {
				local85 = local64.substring(0, local70);
			}
			local85 = local85.trim();
			local85 = local85.substring(local85.lastIndexOf(32) + 1);
			local85 = local85.substring(local85.lastIndexOf(9) + 1);
			local24 = local24 + local85;
			if (local70 != -1 && local77 != -1) {
				@Pc(129) int local129 = local64.indexOf(".java:", local70);
				if (local129 >= 0) {
					local24 = local24 + local64.substring(local129 + 5, local77);
				}
			}
			local24 = local24 + ' ';
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)V")
	public static void method3881() {
		@Pc(12) Class235 local12 = null;
		try {
			local12 = Static342.method5189("2");
			@Pc(25) Class3_Sub11 local25 = new Class3_Sub11(Static167.anInt3319 * 6 + 3);
			local25.method3079(1);
			local25.method3131(Static167.anInt3319);
			for (@Pc(35) int local35 = 0; local35 < Static99.anIntArray166.length; local35++) {
				if (Static376.aBooleanArray27[local35]) {
					local25.method3131(local35);
					local25.method3101(Static99.anIntArray166[local35]);
				}
			}
			local12.method5486(local25.aByteArray36, local25.anInt3520, 0);
		} catch (@Pc(70) Exception local70) {
		}
		try {
			if (local12 != null) {
				local12.method5488();
			}
		} catch (@Pc(77) Exception local77) {
		}
		Static410.aLong195 = Static587.method7753();
		Static590.aBoolean729 = false;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BIII)V")
	public static void method3882(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub3_Sub7 local8 = Static363.method5457(arg1, 9);
		local8.method839();
		local8.anInt1091 = arg0;
		local8.anInt1088 = arg2;
	}
}
