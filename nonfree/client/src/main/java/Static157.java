import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!me", name = "u", descriptor = "[[I")
	public static int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!me", name = "w", descriptor = "Lclient!ka;")
	public static Class91 aClass91_1;

	@OriginalMember(owner = "client!me", name = "z", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!me", name = "A", descriptor = "I")
	public static int anInt3298;

	@OriginalMember(owner = "client!me", name = "v", descriptor = "Z")
	public static boolean aBoolean268 = false;

	@OriginalMember(owner = "client!me", name = "x", descriptor = "I")
	public static int anInt3296 = 0;

	@OriginalMember(owner = "client!me", name = "C", descriptor = "I")
	public static int anInt3299 = -1;

	@OriginalMember(owner = "client!me", name = "E", descriptor = "[I")
	public static int[] anIntArray234 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IZ)V")
	public static void method2694(@OriginalArg(1) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(13) byte[][] local13;
		if (Static60.aBoolean106 && arg0) {
			local11 = 1;
			local13 = Static155.aByteArrayArray126;
		} else {
			local13 = Static275.aByteArrayArray117;
			local11 = 4;
		}
		@Pc(22) int local22 = local13.length;
		@Pc(24) int local24;
		@Pc(39) int local39;
		for (local24 = 0; local24 < local22; local24++) {
			@Pc(29) int[] local29 = null;
			@Pc(33) byte[] local33 = local13[local24];
			local39 = Static63.anIntArray105[local24] & 0xFF;
			@Pc(45) int local45 = Static63.anIntArray105[local24] >> 8;
			@Pc(51) int local51 = local45 * 64 - Static125.anInt5772;
			@Pc(58) int local58 = local39 * 64 - Static203.anInt4236;
			if (local33 != null) {
				Static203.method3422();
				local29 = Static71.method1333(Static125.anInt5772, local33, local58, Static98.aClass52Array1, local51, arg0, Static203.anInt4236);
			}
			if (!arg0 && Static246.anInt5145 / 8 == local45 && local39 == Static68.anInt1503 / 8) {
				if (local29 == null) {
					Static200.anInt4150 = -1;
				} else {
					Static266.anInt5528 = local29[3];
					Static173.anInt3685 = local29[2];
					Static180.anInt3867 = local29[4];
					Static79.anInt1756 = local29[1];
					Static200.anInt4150 = local29[0];
				}
			}
		}
		for (local24 = 0; local24 < local22; local24++) {
			@Pc(136) int local136 = (Static63.anIntArray105[local24] & 0xFF) * 64 - Static203.anInt4236;
			@Pc(147) int local147 = (Static63.anIntArray105[local24] >> 8) * 64 - Static125.anInt5772;
			@Pc(151) byte[] local151 = local13[local24];
			if (local151 == null && Static68.anInt1503 < 800) {
				Static203.method3422();
				for (local39 = 0; local39 < local11; local39++) {
					Static237.method3916(local39, 64, 64, local147, local136);
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method2696(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(25) String local25;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(12) RuntimeException_Sub1 local12 = (RuntimeException_Sub1) arg0;
			arg0 = local12.aThrowable1;
			local25 = local12.aString20 + " | ";
		} else {
			local25 = "";
		}
		@Pc(37) StringWriter local37 = new StringWriter();
		@Pc(42) PrintWriter local42 = new PrintWriter(local37);
		arg0.printStackTrace(local42);
		local42.close();
		@Pc(50) String local50 = local37.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			@Pc(64) String local64 = local58.readLine();
			if (local64 == null) {
				return local25 + "| " + local61;
			}
			@Pc(70) int local70 = local64.indexOf(40);
			@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
			@Pc(87) String local87;
			if (local70 == -1) {
				local87 = local64;
			} else {
				local87 = local64.substring(0, local70);
			}
			local87 = local87.trim();
			local87 = local87.substring(local87.lastIndexOf(32) + 1);
			local87 = local87.substring(local87.lastIndexOf(9) + 1);
			local25 = local25 + local87;
			if (local70 != -1 && local77 != -1) {
				@Pc(131) int local131 = local64.indexOf(".java:", local70);
				if (local131 >= 0) {
					local25 = local25 + local64.substring(local131 + 5, local77);
				}
			}
			local25 = local25 + ' ';
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BLclient!jd;Lclient!jd;)V")
	public static void method2697(@OriginalArg(1) Class84 arg0, @OriginalArg(2) Class84 arg1) {
		Static11.aClass84_7 = arg1;
		Static61.aClass84_56 = arg0;
	}
}
