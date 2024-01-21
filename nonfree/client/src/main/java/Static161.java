import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2158 = Static118.method2249("Your profile will be transferred in:");

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2157 = aClass65_2158;

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2162 = Static118.method2249("Please use a different world)3");

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2159 = aClass65_2162;

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
	public static int anInt3635 = 0;

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2160 = aClass65_2162;

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2161 = Static118.method2249("<col=ff3000>");

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
	public static int anInt3642 = 0;

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
	public static int anInt3643 = -1;

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "[Lclient!oc;")
	public static final Class65[] aClass65Array51 = new Class65[500];

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)I")
	public static int method2760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 256 - arg1;
		return ((arg2 & 0xFF00) * arg1 + (arg0 & 0xFF00) * local8 & 0xFF0000) + (local8 * (arg0 & 0xFF00FF) + (arg1 * (arg2 & 0xFF00FF)) & 0xFF00FF00) >> 8;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)V")
	public static void method2761(@OriginalArg(1) boolean arg0) {
		if (Static106.anInt2616 == Static201.aClass6_Sub4_Sub1_3.anInt3934 >> 7 && Static201.aClass6_Sub4_Sub1_3.anInt3976 >> 7 == Static129.anInt3182) {
			Static106.anInt2616 = 0;
		}
		@Pc(21) int local21 = Static44.anInt1123;
		if (arg0) {
			local21 = 1;
		}
		for (@Pc(37) int local37 = 0; local37 < local21; local37++) {
			@Pc(45) Class6_Sub4_Sub1 local45;
			@Pc(43) long local43;
			if (arg0) {
				local43 = 8791798054912L;
				local45 = Static201.aClass6_Sub4_Sub1_3;
			} else {
				local45 = Static158.aClass6_Sub4_Sub1Array1[Static138.anIntArray385[local37]];
				local43 = (long) Static138.anIntArray385[local37] << 32;
			}
			if (local45 != null && local45.method2996()) {
				@Pc(71) int local71 = local45.anInt3934 >> 7;
				@Pc(76) int local76 = local45.anInt3976 >> 7;
				local45.aBoolean25 = false;
				if ((Static13.aBoolean36 && Static44.anInt1123 > 50 || Static44.anInt1123 > 200) && !arg0 && local45.anInt3946 == local45.anInt3954) {
					local45.aBoolean25 = true;
				}
				if (local71 >= 0 && local71 < 104 && local76 >= 0 && local76 < 104) {
					if (local45.aClass6_Sub3_1 == null || local45.anInt598 > Static174.anInt3887 || Static174.anInt3887 >= local45.anInt594) {
						if ((local45.anInt3934 & 0x7F) == 64 && (local45.anInt3976 & 0x7F) == 64) {
							if (Static100.anInt2510 == Static86.anIntArrayArray19[local71][local76]) {
								continue;
							}
							Static86.anIntArrayArray19[local71][local76] = Static100.anInt2510;
						}
						local45.anInt3943 = Static171.method2896(local45.anInt3934, Static207.anInt4425, local45.anInt3976);
						Static133.method2536(Static207.anInt4425, local45.anInt3934, local45.anInt3976, local45.anInt3943, 60, local45, local45.anInt3971, local43, local45.aBoolean159);
					} else {
						local45.aBoolean25 = false;
						local45.anInt3943 = Static171.method2896(local45.anInt3934, Static207.anInt4425, local45.anInt3976);
						Static142.method2620(Static207.anInt4425, local45.anInt3934, local45.anInt3976, local45.anInt3943, local45, local45.anInt3971, local43, local45.anInt610, local45.anInt596, local45.anInt612, local45.anInt614);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method2762(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(15) String local15;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(5) RuntimeException_Sub1 local5 = (RuntimeException_Sub1) arg0;
			local15 = local5.aString4 + " | ";
			arg0 = local5.aThrowable1;
		} else {
			local15 = "";
		}
		@Pc(29) StringWriter local29 = new StringWriter();
		@Pc(34) PrintWriter local34 = new PrintWriter(local29);
		arg0.printStackTrace(local34);
		local34.close();
		@Pc(42) String local42 = local29.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local42));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			while (true) {
				@Pc(61) String local61 = local55.readLine();
				if (local61 == null) {
					return local15 + "| " + local58;
				}
				@Pc(67) int local67 = local61.indexOf(40);
				@Pc(74) int local74 = local61.indexOf(41, local67 + 1);
				if (local67 >= 0 && local74 >= 0) {
					@Pc(88) String local88 = local61.substring(local67 + 1, local74);
					@Pc(92) int local92 = local88.indexOf(".java:");
					if (local92 >= 0) {
						local88 = local88.substring(0, local92) + local88.substring(local92 + 5);
						local15 = local15 + local88 + ' ';
						continue;
					}
					local61 = local61.substring(0, local67);
				}
				local61 = local61.trim();
				local61 = local61.substring(local61.lastIndexOf(32) + 1);
				local61 = local61.substring(local61.lastIndexOf(9) + 1);
				local15 = local15 + local61 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
	public static void method2763() {
		if (Static21.anIntArray66 != null && Static143.anIntArray158 != null) {
			return;
		}
		Static143.anIntArray158 = new int[256];
		Static21.anIntArray66 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static21.anIntArray66[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static143.anIntArray158[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static191.anIntArrayArrayArray8[arg0][local16][local20] == -Static11.anInt255) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static206.anIntArrayArrayArray10[arg0][arg1][arg3] + arg5;
			if (!Static9.method165(local20, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static9.method165(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static9.method165(local20, local156, local182)) {
				return false;
			} else if (Static9.method165(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static206.method3278(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static9.method165(local16 + 1, Static206.anIntArrayArrayArray10[arg0][arg1][arg3] + arg5, local20 + 1) && Static9.method165(local16 + 128 - 1, Static206.anIntArrayArrayArray10[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static9.method165(local16 + 128 - 1, Static206.anIntArrayArrayArray10[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static9.method165(local16 + 1, Static206.anIntArrayArrayArray10[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}
}
