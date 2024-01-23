import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!rh", name = "gb", descriptor = "I")
	public static int anInt4793;

	@OriginalMember(owner = "client!rh", name = "jb", descriptor = "I")
	public static int anInt4796 = 0;

	@OriginalMember(owner = "client!rh", name = "lb", descriptor = "Lclient!mk;")
	public static Interface5 anInterface5_1 = null;

	@OriginalMember(owner = "client!rh", name = "ob", descriptor = "[J")
	public static long[] aLongArray10 = new long[32];

	@OriginalMember(owner = "client!rh", name = "pb", descriptor = "I")
	public static int anInt4800 = 0;

	@OriginalMember(owner = "client!rh", name = "qb", descriptor = "I")
	public static int anInt4801 = 0;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)V")
	public static void method3657(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub2_Sub11 local12 = Static163.method3579(8, arg0);
		local12.method1853();
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(Z)V")
	public static void method3658(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static130.aClass1_Sub19ArrayArrayArray1 = Static263.aClass1_Sub19ArrayArrayArray3;
			Static163.anIntArrayArrayArray16 = Static165.anIntArrayArrayArray13;
			Static151.aClass1_Sub25ArrayArray2 = Static263.aClass1_Sub25ArrayArray3;
		} else {
			Static130.aClass1_Sub19ArrayArrayArray1 = Static191.aClass1_Sub19ArrayArrayArray2;
			Static163.anIntArrayArrayArray16 = Static152.anIntArrayArrayArray11;
			Static151.aClass1_Sub25ArrayArray2 = Static32.aClass1_Sub25ArrayArray1;
		}
		Static158.anInt2965 = Static130.aClass1_Sub19ArrayArrayArray1.length;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(CIB)I")
	public static int method3659(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local12 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local12 = 1762;
		}
		return local12;
	}

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "(I)V")
	public static void method3660() {
		Static191.aClass22_15.method635();
		Static12.aClass17_1.method468();
		Static51.aClass17_3.method468();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!ak;BLclient!mk;Lclient!ak;)V")
	public static void method3661(@OriginalArg(0) Class7 arg0, @OriginalArg(2) Interface5 arg1, @OriginalArg(3) Class7 arg2) {
		Static1.aClass7_1 = arg0;
		Static79.aClass7_130 = arg2;
		anInterface5_1 = arg1;
		if (Static1.aClass7_1 != null) {
			Static16.anInt403 = Static1.aClass7_1.method265(1);
		}
		if (Static79.aClass7_130 != null) {
			Static138.anInt2605 = Static79.aClass7_130.method265(1);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method3662(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(21) String local21;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local21 = local11.aString149 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local21 = "";
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
				return local21 + "| " + local61;
			}
			@Pc(72) int local72 = local64.indexOf(40);
			@Pc(79) int local79 = local64.indexOf(41, local72 + 1);
			@Pc(85) String local85;
			if (local72 == -1) {
				local85 = local64;
			} else {
				local85 = local64.substring(0, local72);
			}
			local85 = local85.trim();
			local85 = local85.substring(local85.lastIndexOf(32) + 1);
			local85 = local85.substring(local85.lastIndexOf(9) + 1);
			local21 = local21 + local85;
			if (local72 != -1 && local79 != -1) {
				@Pc(133) int local133 = local64.indexOf(".java:", local72);
				if (local133 >= 0) {
					local21 = local21 + local64.substring(local133 + 5, local79);
				}
			}
			local21 = local21 + ' ';
		}
	}
}
