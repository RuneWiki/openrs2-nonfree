import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_10 = new Class208(45, 3);

	@OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
	public static int anInt784 = -1;

	@OriginalMember(owner = "client!ch", name = "v", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_18 = new Class25(7, -2);

	@OriginalMember(owner = "client!ch", name = "w", descriptor = "[I")
	public static final int[] anIntArray63 = new int[1000];

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!qc;B)Ljava/lang/String;")
	public static String method741(@OriginalArg(0) Class2_Sub35 arg0) {
		return arg0.aString61 == null || arg0.aString61.length() <= 0 ? arg0.aString60 : arg0.aString60 + Static401.aClass231_114.method5261(Static80.anInt6195) + arg0.aString61;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V")
	public static void method742(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub1_Sub6 local12 = Static267.method3705(arg0, 7);
		local12.method2578();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "([[BBLclient!hd;)V")
	public static void method743(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class107_Sub1 arg1) {
		@Pc(17) int[] local17 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(19) int local19 = 0; local19 < arg1.anInt2740; local19++) {
			Static230.method3117();
			for (@Pc(25) int local25 = 0; local25 < Static234.anInt3949 >> 3; local25++) {
				for (@Pc(29) int local29 = 0; local29 < Static371.anInt6492 >> 3; local29++) {
					@Pc(39) int local39 = Static111.anIntArrayArrayArray4[local19][local25][local29];
					if (local39 != -1) {
						@Pc(48) int local48 = local39 >> 24 & 0x3;
						if (!arg1.aBoolean171 || local48 == 0) {
							@Pc(62) int local62 = local39 >> 1 & 0x3;
							@Pc(68) int local68 = local39 >> 14 & 0x3FF;
							@Pc(74) int local74 = local39 >> 3 & 0x7FF;
							@Pc(84) int local84 = (local68 / 8 << 8) + local74 / 8;
							for (@Pc(86) int local86 = 0; local86 < Static450.anIntArray635.length; local86++) {
								if (local84 == Static450.anIntArray635[local86] && arg0[local86] != null) {
									@Pc(108) Class2_Sub17 local108 = new Class2_Sub17(arg0[local86]);
									arg1.method2272(local29 * 8, local74, local62, local48, Static89.aClass225Array2, local19, local108, local25 * 8, local68);
									arg1.method2288(local29 * 8, local48, local25 * 8, local68, local17[0] == -1 ? local17 : null, local108, local74, local19, Static257.aClass75_8, local62);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local17[0] != -1) {
			Static454.aClass247_1 = Static174.aClass147_1.method3049(Static388.aClass35_1, local17[2], local17[0], local17[3], local17[1]);
			Static149.anInt7394 = local17[4];
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method744(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString12 + " | ";
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(63) String local63 = local53.readLine();
		while (true) {
			@Pc(66) String local66 = local53.readLine();
			if (local66 == null) {
				return local10 + "| " + local63;
			}
			@Pc(72) int local72 = local66.indexOf(40);
			@Pc(79) int local79 = local66.indexOf(41, local72 + 1);
			@Pc(88) String local88;
			if (local72 == -1) {
				local88 = local66;
			} else {
				local88 = local66.substring(0, local72);
			}
			local88 = local88.trim();
			local88 = local88.substring(local88.lastIndexOf(32) + 1);
			local88 = local88.substring(local88.lastIndexOf(9) + 1);
			local10 = local10 + local88;
			if (local72 != -1 && local79 != -1) {
				@Pc(133) int local133 = local66.indexOf(".java:", local72);
				if (local133 >= 0) {
					local10 = local10 + local66.substring(local133 + 5, local79);
				}
			}
			local10 = local10 + ' ';
		}
	}
}
