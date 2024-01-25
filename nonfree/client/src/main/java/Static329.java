import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "Lclient!uk;")
	public static Class240 aClass240_1;

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_264 = new Class22(68, 5);

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
	public static int anInt5685 = 0;

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
	public static final int anInt5689 = 1400;

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "[I")
	public static final int[] anIntArray398 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)I")
	public static int method4426(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
	public static void method4427() {
		if (Static424.aClass49_2 != null) {
			Static424.aClass49_2.method2077();
		}
		if (Static291.aClass49_1 != null) {
			Static291.aClass49_1.method2077();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method4429(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(29) String local29;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(16) RuntimeException_Sub1 local16 = (RuntimeException_Sub1) arg0;
			arg0 = local16.aThrowable1;
			local29 = local16.aString46 + " | ";
		} else {
			local29 = "";
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
				return local29 + "| " + local61;
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
			local29 = local29 + local85;
			if (local70 != -1 && local77 != -1) {
				@Pc(129) int local129 = local64.indexOf(".java:", local70);
				if (local129 >= 0) {
					local29 = local29 + local64.substring(local129 + 5, local77);
				}
			}
			local29 = local29 + ' ';
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
	public static void method4430() {
		@Pc(9) int local9 = Static146.anInt266 * 128 + 64;
		@Pc(15) int local15 = Static188.anInt5355 * 128 + 64;
		@Pc(24) int local24 = Static13.method135(local9, Static263.anInt4963, local15) - Static365.anInt6311;
		if (Static286.anInt5198 < 100) {
			if (Static163.anInt3197 < local9) {
				Static163.anInt3197 += Static67.anInt1408 + (local9 - Static163.anInt3197) * Static286.anInt5198 / 1000;
				if (Static163.anInt3197 > local9) {
					Static163.anInt3197 = local9;
				}
			}
			if (Static100.anInt2024 < local24) {
				Static100.anInt2024 += Static67.anInt1408 + Static286.anInt5198 * (local24 - Static100.anInt2024) / 1000;
				if (local24 < Static100.anInt2024) {
					Static100.anInt2024 = local24;
				}
			}
			if (local9 < Static163.anInt3197) {
				Static163.anInt3197 -= (Static163.anInt3197 - local9) * Static286.anInt5198 / 1000 + Static67.anInt1408;
				if (local9 > Static163.anInt3197) {
					Static163.anInt3197 = local9;
				}
			}
			if (local15 > Static145.anInt2906) {
				Static145.anInt2906 += Static67.anInt1408 + (local15 - Static145.anInt2906) * Static286.anInt5198 / 1000;
				if (local15 < Static145.anInt2906) {
					Static145.anInt2906 = local15;
				}
			}
			if (Static100.anInt2024 > local24) {
				Static100.anInt2024 -= Static67.anInt1408 + (Static100.anInt2024 - local24) * Static286.anInt5198 / 1000;
				if (Static100.anInt2024 < local24) {
					Static100.anInt2024 = local24;
				}
			}
			if (local15 < Static145.anInt2906) {
				Static145.anInt2906 -= Static67.anInt1408 + (Static145.anInt2906 - local15) * Static286.anInt5198 / 1000;
				if (Static145.anInt2906 < local15) {
					Static145.anInt2906 = local15;
				}
			}
		} else {
			Static163.anInt3197 = Static146.anInt266 * 128 + 64;
			Static145.anInt2906 = Static188.anInt5355 * 128 + 64;
			Static100.anInt2024 = Static13.method135(Static163.anInt3197, Static263.anInt4963, Static145.anInt2906) - Static365.anInt6311;
		}
		local15 = Static419.anInt6924 * 128 + 64;
		local9 = Static111.anInt2379 * 128 + 64;
		local24 = Static13.method135(local9, Static263.anInt4963, local15) - Static238.anInt4509;
		@Pc(218) int local218 = local9 - Static163.anInt3197;
		@Pc(223) int local223 = local24 - Static100.anInt2024;
		@Pc(228) int local228 = local15 - Static145.anInt2906;
		@Pc(240) int local240 = (int) Math.sqrt((double) (local218 * local218 + local228 * local228));
		@Pc(251) int local251 = (int) (Math.atan2((double) local223, (double) local240) * 2607.5945876176133D) & 0x3FFF;
		if (local251 < 1024) {
			local251 = 1024;
		}
		@Pc(269) int local269 = (int) (Math.atan2((double) local218, (double) local228) * -2607.5945876176133D) & 0x3FFF;
		if (local251 > 3072) {
			local251 = 3072;
		}
		if (local251 > Static431.anInt7074) {
			Static431.anInt7074 += Static381.anInt6417 * (local251 - Static431.anInt7074 >> 3) / 1000 + Static222.anInt4125 << 3;
			if (local251 < Static431.anInt7074) {
				Static431.anInt7074 = local251;
			}
		}
		if (Static431.anInt7074 > local251) {
			Static431.anInt7074 -= Static381.anInt6417 * (Static431.anInt7074 - local251 >> 3) / 1000 + Static222.anInt4125 << 3;
			if (Static431.anInt7074 < local251) {
				Static431.anInt7074 = local251;
			}
		}
		@Pc(341) int local341 = local269 - Static136.anInt2790;
		if (local341 > 8192) {
			local341 -= 16384;
		}
		if (local341 < -8192) {
			local341 += 16384;
		}
		local341 >>= 0x3;
		if (local341 > 0) {
			Static136.anInt2790 += Static222.anInt4125 + local341 * Static381.anInt6417 / 1000 << 3;
			Static136.anInt2790 &= 0x3FFF;
		}
		if (local341 < 0) {
			Static136.anInt2790 -= Static222.anInt4125 + Static381.anInt6417 * -local341 / 1000 << 3;
			Static136.anInt2790 &= 0x3FFF;
		}
		@Pc(407) int local407 = local269 - Static136.anInt2790;
		if (local407 > 8192) {
			local407 -= 16384;
		}
		if (local407 < -8192) {
			local407 += 16384;
		}
		Static103.anInt2070 = 0;
		if (local407 < 0 && local341 > 0 || local407 > 0 && local341 < 0) {
			Static136.anInt2790 = local269;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!uu;B)Ljava/lang/String;")
	public static String method4431(@OriginalArg(0) Class247 arg0) {
		if (Static53.method900(arg0).method3911() == 0) {
			return null;
		} else if (arg0.aString68 == null || arg0.aString68.trim().length() == 0) {
			return Static415.aBoolean626 ? "Hidden-use" : null;
		} else {
			return arg0.aString68;
		}
	}
}
