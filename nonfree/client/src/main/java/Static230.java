import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!p", name = "d", descriptor = "Lclient!qj;")
	public static Class165 aClass165_70;

	@OriginalMember(owner = "client!p", name = "q", descriptor = "I")
	public static int anInt4530;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_119 = new Class140(4);

	@OriginalMember(owner = "client!p", name = "p", descriptor = "I")
	public static int anInt4529 = 0;

	@OriginalMember(owner = "client!p", name = "r", descriptor = "I")
	public static int anInt4531 = 0;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)V")
	public static void method4154(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			Static248.aClass1_Sub7_Sub1_2.method728(215);
		}
		if (arg2 == 1) {
			Static248.aClass1_Sub7_Sub1_2.method728(10);
		}
		Static248.aClass1_Sub7_Sub1_2.method3150(arg0 + Static161.anInt3315);
		Static248.aClass1_Sub7_Sub1_2.method3096(Static220.aBooleanArray24[82] ? 1 : 0);
		Static248.aClass1_Sub7_Sub1_2.method3140(arg1 + Static182.anInt3775);
		Static307.aBoolean518 = false;
		Static152.anInt3053 = arg0;
		Static94.anInt1845 = arg1;
		Static198.method3728();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!aa;IZ[Lclient!ie;Lclient!sm;)V")
	public static void method4156(@OriginalArg(0) int arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class91[] arg3, @OriginalArg(5) Class41 arg4) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(34) int local34;
		if (!arg2) {
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				for (local13 = 0; local13 < Static48.anInt1107; local13++) {
					for (local17 = 0; local17 < Static337.anInt6402; local17++) {
						if ((Static183.aByteArrayArrayArray7[local9][local13][local17] & 0x1) != 0) {
							local34 = local9;
							if ((Static183.aByteArrayArrayArray7[1][local13][local17] & 0x2) != 0) {
								local34 = local9 - 1;
							}
							if (local34 >= 0) {
								arg3[local34].method2589(local13, local17);
							}
						}
					}
				}
			}
		}
		@Pc(75) int[][] local75 = new int[Static48.anInt1107][Static337.anInt6402];
		for (local13 = 0; local13 < arg0; local13++) {
			for (local17 = 0; local17 < Static337.anInt6402; local17++) {
				Static35.anIntArray106[local17] = 0;
				Static235.anIntArray590[local17] = 0;
				Static126.anIntArray296[local17] = 0;
				Static277.anIntArray774[local17] = 0;
				Static352.anIntArray810[local17] = 0;
			}
			for (local34 = -5; local34 < Static48.anInt1107; local34++) {
				@Pc(123) int local123;
				@Pc(136) int local136;
				@Pc(205) int local205;
				for (@Pc(117) int local117 = 0; local117 < Static337.anInt6402; local117++) {
					local123 = local34 + 5;
					@Pc(183) int local183;
					if (Static48.anInt1107 > local123) {
						local136 = Static3.aByteArrayArrayArray1[local13][local123][local117] & 0xFF;
						if (local136 > 0) {
							@Pc(147) Class9 local147 = Static33.method873(local136 - 1);
							Static35.anIntArray106[local117] += local147.anInt224;
							Static235.anIntArray590[local117] += local147.anInt231;
							Static126.anIntArray296[local117] += local147.anInt230;
							Static277.anIntArray774[local117] += local147.anInt228;
							local183 = Static352.anIntArray810[local117]++;
						}
					}
					local136 = local34 - 5;
					if (local136 >= 0) {
						local205 = Static3.aByteArrayArrayArray1[local13][local136][local117] & 0xFF;
						if (local205 > 0) {
							@Pc(213) Class9 local213 = Static33.method873(local205 - 1);
							Static35.anIntArray106[local117] -= local213.anInt224;
							Static235.anIntArray590[local117] -= local213.anInt231;
							Static126.anIntArray296[local117] -= local213.anInt230;
							Static277.anIntArray774[local117] -= local213.anInt228;
							local183 = Static352.anIntArray810[local117]--;
						}
					}
				}
				if (local34 >= 0) {
					local123 = 0;
					local136 = 0;
					local205 = 0;
					@Pc(266) int local266 = 0;
					@Pc(268) int local268 = 0;
					for (@Pc(270) int local270 = -5; local270 < Static337.anInt6402; local270++) {
						@Pc(276) int local276 = local270 + 5;
						if (local276 < Static337.anInt6402) {
							local266 += Static277.anIntArray774[local276];
							local123 += Static35.anIntArray106[local276];
							local136 += Static235.anIntArray590[local276];
							local268 += Static352.anIntArray810[local276];
							local205 += Static126.anIntArray296[local276];
						}
						@Pc(313) int local313 = local270 - 5;
						if (local313 >= 0) {
							local136 -= Static235.anIntArray590[local313];
							local123 -= Static35.anIntArray106[local313];
							local266 -= Static277.anIntArray774[local313];
							local268 -= Static352.anIntArray810[local313];
							local205 -= Static126.anIntArray296[local313];
						}
						if (local270 >= 0 && local266 > 0 && local268 > 0) {
							local75[local34][local270] = Static257.method4559(local136 / local268, local205 / local268, local123 * 256 / local266);
						}
					}
				}
			}
			Static296.method5069(local75, arg1, Static337.anInt6402, local13, Static178.aByteArrayArrayArray6[local13], arg4, Static7.aClass41Array1[local13], arg2, Static48.anInt1107, Static3.aByteArrayArrayArray1[local13], Static233.aByteArrayArrayArray11[local13], Static159.aByteArrayArrayArray5[local13]);
			Static3.aByteArrayArrayArray1[local13] = null;
			Static159.aByteArrayArrayArray5[local13] = null;
			Static178.aByteArrayArrayArray6[local13] = null;
			Static233.aByteArrayArrayArray11[local13] = null;
		}
		if (!arg2) {
			if (Static44.aBoolean87) {
				Static264.method4807();
			}
			if (Static158.anInt3147 != 0) {
				Static175.method3454();
			}
		}
		for (local17 = 0; local17 < arg0; local17++) {
			Static7.aClass41Array1[local17].method5422();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method4157(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString229 + " | ";
		} else {
			local10 = "";
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
				return local10 + "| " + local61;
			}
			@Pc(70) int local70 = local64.indexOf(40);
			@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
			@Pc(82) String local82;
			if (local70 == -1) {
				local82 = local64;
			} else {
				local82 = local64.substring(0, local70);
			}
			local82 = local82.trim();
			local82 = local82.substring(local82.lastIndexOf(32) + 1);
			local82 = local82.substring(local82.lastIndexOf(9) + 1);
			local10 = local10 + local82;
			if (local70 != -1 && local77 != -1) {
				@Pc(130) int local130 = local64.indexOf(".java:", local70);
				if (local130 >= 0) {
					local10 = local10 + local64.substring(local130 + 5, local77);
				}
			}
			local10 = local10 + ' ';
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!aa;B)V")
	public static void method4160(@OriginalArg(0) Class2 arg0) {
		if (Static179.aBoolean310) {
			Static139.method2666(arg0);
		} else {
			Static68.method1384(arg0);
		}
	}
}
