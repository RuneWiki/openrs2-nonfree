import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!io", name = "b", descriptor = "I")
	public static int anInt2416;

	@OriginalMember(owner = "client!io", name = "e", descriptor = "J")
	public static long aLong85 = 0L;

	@OriginalMember(owner = "client!io", name = "f", descriptor = "I")
	public static int anInt2419 = 0;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIII)V")
	public static void method1925(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = -arg3;
		Static109.method1795(arg2 - arg3, Static51.anIntArrayArray1[arg0], arg2 + arg3, arg1);
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = arg3;
		@Pc(31) int local31 = -1;
		while (local27 < local29) {
			local27++;
			local31 += 2;
			local8 += local31;
			if (local8 >= 0) {
				local29--;
				local8 -= local29 << 1;
				@Pc(58) int[] local58 = Static51.anIntArrayArray1[local29 + arg0];
				@Pc(65) int[] local65 = Static51.anIntArrayArray1[arg0 - local29];
				@Pc(70) int local70 = arg2 + local27;
				@Pc(75) int local75 = arg2 - local27;
				Static109.method1795(local75, local58, local70, arg1);
				Static109.method1795(local75, local65, local70, arg1);
			}
			@Pc(91) int local91 = local29 + arg2;
			@Pc(96) int local96 = arg2 - local29;
			@Pc(102) int[] local102 = Static51.anIntArrayArray1[local27 + arg0];
			@Pc(108) int[] local108 = Static51.anIntArrayArray1[arg0 - local27];
			Static109.method1795(local96, local102, local91, arg1);
			Static109.method1795(local96, local108, local91, arg1);
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1926(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString36 + " | ";
		} else {
			local24 = "";
		}
		@Pc(38) StringWriter local38 = new StringWriter();
		@Pc(43) PrintWriter local43 = new PrintWriter(local38);
		arg0.printStackTrace(local43);
		local43.close();
		@Pc(51) String local51 = local38.toString();
		@Pc(59) BufferedReader local59 = new BufferedReader(new StringReader(local51));
		@Pc(62) String local62 = local59.readLine();
		while (true) {
			@Pc(65) String local65 = local59.readLine();
			if (local65 == null) {
				return local24 + "| " + local62;
			}
			@Pc(71) int local71 = local65.indexOf(40);
			@Pc(78) int local78 = local65.indexOf(41, local71 + 1);
			@Pc(86) String local86;
			if (local71 == -1) {
				local86 = local65;
			} else {
				local86 = local65.substring(0, local71);
			}
			local86 = local86.trim();
			local86 = local86.substring(local86.lastIndexOf(32) + 1);
			local86 = local86.substring(local86.lastIndexOf(9) + 1);
			local24 = local24 + local86;
			if (local71 != -1 && local78 != -1) {
				@Pc(131) int local131 = local65.indexOf(".java:", local71);
				if (local131 >= 0) {
					local24 = local24 + local65.substring(local131 + 5, local78);
				}
			}
			local24 = local24 + ' ';
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V")
	public static void method1927() {
		Static44.aClass169_32.method4014();
		Static299.aClass169_159.method4014();
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BJ)V")
	public static void method1928(@OriginalArg(1) long arg0) {
		if (!Static51.aBoolean77) {
			Static2.aFloat1 += (float) arg0 * Static287.aFloat54 / 40.0F;
			Static15.aFloat2 += Static60.aFloat10 * (float) arg0 / 40.0F;
		}
		@Pc(27) int local27 = Static89.anInt1629 + Static229.aClass22_Sub3_Sub2_2.anInt4601;
		@Pc(37) int local37 = Static229.aClass22_Sub3_Sub2_2.anInt4623 + Static34.anInt617;
		if (Static216.anInt4233 - local27 < -500 || Static216.anInt4233 - local27 > 500 || Static142.anInt2794 - local37 < -500 || Static142.anInt2794 - local37 > 500) {
			Static142.anInt2794 = local37;
			Static216.anInt4233 = local27;
		}
		@Pc(87) int local87;
		@Pc(95) int local95;
		if (Static216.anInt4233 != local27) {
			local87 = local27 - Static216.anInt4233;
			local95 = (int) ((long) local87 * arg0 / 320L);
			if (local87 <= 0) {
				if (local95 == 0) {
					local95 = -1;
				} else if (local87 > local95) {
					local95 = local87;
				}
			} else if (local95 == 0) {
				local95 = 1;
			} else if (local87 < local95) {
				local95 = local87;
			}
			Static216.anInt4233 += local95;
		}
		if (local37 != Static142.anInt2794) {
			local87 = local37 - Static142.anInt2794;
			local95 = (int) (arg0 * (long) local87 / 320L);
			if (local87 > 0) {
				if (local95 == 0) {
					local95 = 1;
				} else if (local87 < local95) {
					local95 = local87;
				}
			} else if (local95 == 0) {
				local95 = -1;
			} else if (local87 > local95) {
				local95 = local87;
			}
			Static142.anInt2794 += local95;
		}
		Static82.method1236();
	}
}
