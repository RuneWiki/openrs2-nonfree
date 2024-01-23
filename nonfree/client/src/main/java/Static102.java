import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!hh", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString73 = "Loading title screen - ";

	@OriginalMember(owner = "client!hh", name = "z", descriptor = "Z")
	public static boolean aBoolean119 = false;

	@OriginalMember(owner = "client!hh", name = "G", descriptor = "I")
	public static int anInt2239 = 0;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIBIII)V")
	public static void method1682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 < 0 || arg0 < 0 || arg6 >= 103 || arg0 >= 103) {
			return;
		}
		@Pc(42) int local42;
		if (arg4 == 0) {
			@Pc(31) Class133 local31 = Static234.method4063(arg3, arg6, arg0);
			if (local31 != null) {
				local42 = Integer.MAX_VALUE & (int) (local31.aLong160 >>> 32);
				if (arg5 == 2) {
					local31.aClass25_4 = new Class25_Sub4(local42, 2, arg1 + 4, arg3, arg6, arg0, arg2, false, local31.aClass25_4);
					local31.aClass25_5 = new Class25_Sub4(local42, 2, arg1 + 1 & 0x3, arg3, arg6, arg0, arg2, false, local31.aClass25_5);
				} else {
					local31.aClass25_4 = new Class25_Sub4(local42, arg5, arg1, arg3, arg6, arg0, arg2, false, local31.aClass25_4);
				}
			}
		}
		if (arg4 == 1) {
			@Pc(110) Class101 local110 = Static150.method1234(arg3, arg6, arg0);
			if (local110 != null) {
				local42 = Integer.MAX_VALUE & (int) (local110.aLong131 >>> 32);
				if (arg5 == 4 || arg5 == 5) {
					local110.aClass25_3 = new Class25_Sub4(local42, 4, arg1, arg3, arg6, arg0, arg2, false, local110.aClass25_3);
				} else if (arg5 == 6) {
					local110.aClass25_3 = new Class25_Sub4(local42, 4, arg1 + 4, arg3, arg6, arg0, arg2, false, local110.aClass25_3);
				} else if (arg5 == 7) {
					local110.aClass25_3 = new Class25_Sub4(local42, 4, (arg1 + 2 & 0x3) + 4, arg3, arg6, arg0, arg2, false, local110.aClass25_3);
				} else if (arg5 == 8) {
					local110.aClass25_3 = new Class25_Sub4(local42, 4, arg1 + 4, arg3, arg6, arg0, arg2, false, local110.aClass25_3);
					local110.aClass25_2 = new Class25_Sub4(local42, 4, (arg1 + 2 & 0x3) + 4, arg3, arg6, arg0, arg2, false, local110.aClass25_2);
				}
			}
		}
		if (arg4 == 2) {
			if (arg5 == 11) {
				arg5 = 10;
			}
			@Pc(254) Class152 local254 = Static263.method4471(arg3, arg6, arg0);
			if (local254 != null) {
				local254.aClass25_6 = new Class25_Sub4(Integer.MAX_VALUE & (int) (local254.aLong181 >>> 32), arg5, arg1, arg3, arg6, arg0, arg2, false, local254.aClass25_6);
			}
		}
		if (arg4 == 3) {
			@Pc(290) Class162 local290 = Static218.method3884(arg3, arg6, arg0);
			if (local290 != null) {
				local290.aClass25_7 = new Class25_Sub4((int) (local290.aLong192 >>> 32) & Integer.MAX_VALUE, 22, arg1, arg3, arg6, arg0, arg2, false, local290.aClass25_7);
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)V")
	public static void method1683(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static194.anInt4389 != -1) {
				Static206.method3662(Static194.anInt4389);
			}
			for (@Pc(16) Class1_Sub12 local16 = (Class1_Sub12) Static147.aClass117_12.method3441(); local16 != null; local16 = (Class1_Sub12) Static147.aClass117_12.method3444()) {
				Static271.method4538(local16, true);
			}
			Static194.anInt4389 = -1;
			Static147.aClass117_12 = new Class117(8);
			Static197.method3554();
			Static194.anInt4389 = Static66.anInt3693;
			Static87.method1517(false);
			method1689();
			Static275.method4584(Static194.anInt4389);
		}
		Static78.anInt1880 = -1;
		Static257.method4359(Static266.anInt5786);
		Static239.aClass25_Sub1_Sub1_2 = new Class25_Sub1_Sub1();
		Static239.aClass25_Sub1_Sub1_2.anInt1635 = 3000;
		Static239.aClass25_Sub1_Sub1_2.anInt1604 = 3000;
		if (!Static296.aBoolean335 && Static230.anInt5101 == 0) {
			Static230.method4021(Static33.aClass83_20);
			Static140.method2511(10);
			return;
		}
		if (Static280.anInt5999 == 2) {
			Static229.anInt5072 = Static251.anInt5457 << 7;
			Static157.anInt3612 = Static295.anInt3204 << 7;
		} else {
			Static235.method4067();
		}
		if (Static296.aBoolean335) {
			Static94.method4775();
		}
		Static65.method327();
		Static140.method2511(28);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!kb;ILclient!kb;)I")
	public static int method1685(@OriginalArg(0) Class83 arg0, @OriginalArg(2) Class83 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method2302(Static271.anInt5844)) {
			local5++;
		}
		if (arg1.method2302(Static204.anInt4558)) {
			local5++;
		}
		if (arg1.method2302(Static171.anInt3868)) {
			local5++;
		}
		if (arg0.method2302(Static271.anInt5844)) {
			local5++;
		}
		if (arg0.method2302(Static204.anInt4558)) {
			local5++;
		}
		if (arg0.method2302(Static171.anInt3868)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI)Z")
	public static boolean method1686(@OriginalArg(1) int arg0) {
		return (-arg0 & arg0) == arg0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method1687(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString145 + " | ";
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
				@Pc(132) int local132 = local64.indexOf(".java:", local70);
				if (local132 >= 0) {
					local10 = local10 + local64.substring(local132 + 5, local77);
				}
			}
			local10 = local10 + ' ';
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(12) int local12 = 0; local12 < Static159.aClass78_2.anInt2855; local12++) {
			if (Static159.aClass78_2.method2184(local12)) {
				@Pc(53) int[] local53 = Static176.aClass1_Sub2_Sub9_2.method1638(Static159.aClass78_2.anIntArray264[local12] >> 28 & 0x3, Static159.aClass78_2.anIntArray264[local12] & 0x3FFF, Static159.aClass78_2.anIntArray264[local12] >> 14 & 0x3FFF);
				if (local53 != null) {
					@Pc(67) int local67 = Static48.anInt1347 + Static173.anInt3932 - local53[2] - 1;
					@Pc(73) int local73 = local53[1] - Static234.anInt5158;
					@Pc(90) int local90 = arg5 + (local73 - arg3) * (arg6 - arg5) / (arg7 - arg3);
					@Pc(95) int local95 = Static159.aClass78_2.method2182(local12);
					@Pc(112) int local112 = arg2 + (arg0 - arg2) * (local67 - arg1) / (arg4 - arg1);
					@Pc(114) int local114 = 16777215;
					@Pc(116) Class100 local116 = null;
					if (local95 == 0) {
						if ((double) Static241.aFloat173 == 3.0D) {
							local116 = Static236.aClass100_6;
						}
						if ((double) Static241.aFloat173 == 4.0D) {
							local116 = Static80.aClass100_1;
						}
						if ((double) Static241.aFloat173 == 6.0D) {
							local116 = Static190.aClass100_4;
						}
						if ((double) Static241.aFloat173 >= 8.0D) {
							local116 = Static166.aClass100_3;
						}
					}
					if (local95 == 1) {
						if ((double) Static241.aFloat173 == 3.0D) {
							local116 = Static190.aClass100_4;
						}
						if ((double) Static241.aFloat173 == 4.0D) {
							local116 = Static166.aClass100_3;
						}
						if ((double) Static241.aFloat173 == 6.0D) {
							local116 = Static99.aClass100_2;
						}
						if ((double) Static241.aFloat173 >= 8.0D) {
							local116 = Static258.aClass100_7;
						}
					}
					if (local95 == 2) {
						local114 = 16755200;
						if ((double) Static241.aFloat173 == 3.0D) {
							local116 = Static99.aClass100_2;
						}
						if ((double) Static241.aFloat173 == 4.0D) {
							local116 = Static258.aClass100_7;
						}
						if ((double) Static241.aFloat173 == 6.0D) {
							local116 = Static280.aClass100_8;
						}
						if ((double) Static241.aFloat173 >= 8.0D) {
							local116 = Static210.aClass100_5;
						}
					}
					if (Static159.aClass78_2.anIntArray265[local12] != -1) {
						local114 = Static159.aClass78_2.anIntArray265[local12];
					}
					if (local116 != null) {
						@Pc(242) int local242 = Static14.aClass1_Sub2_Sub16_1.method3977(Static159.aClass78_2.aStringArray14[local12], null, Static16.aStringArray2);
						local112 -= (local242 - 1) * local116.method3013() / 2;
						local112 += local116.method3018() / 2;
						for (@Pc(262) int local262 = 0; local262 < local242; local262++) {
							@Pc(269) String local269 = Static16.aStringArray2[local262];
							if (local242 - 1 > local262) {
								local269 = local269.substring(0, local269.length() - 4);
							}
							local116.method3014(local269, local90, local112, local114);
							local112 += local116.method3013();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)V")
	public static void method1689() {
		for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
			Static165.aBooleanArray16[local12] = true;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(SB)Z")
	public static boolean method1690(@OriginalArg(0) short arg0) {
		if (arg0 == 38 || arg0 == 3 || arg0 == 10 || arg0 == 7 || arg0 == 46 || arg0 == 33 || arg0 == 11 || arg0 == 4) {
			return true;
		} else if (arg0 == 2 || arg0 == 19 || arg0 == 1002 || arg0 == 1006) {
			return true;
		} else if (arg0 == 21 || arg0 == 35 || arg0 == 5 || arg0 == 47 || arg0 == 20) {
			return true;
		} else {
			return arg0 == 28 || arg0 == 59 || arg0 == 22 || arg0 == 60 || arg0 == 30 || arg0 == 31;
		}
	}
}
