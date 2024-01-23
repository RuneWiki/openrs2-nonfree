import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
	public static int anInt894;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "Lclient!wf;")
	public static Class189 aClass189_3;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
	public static int anInt901;

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
	public static int anInt914;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
	public static int anInt902 = 0;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "[I")
	public static int[] anIntArray64 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
	public static int anInt912 = 0;

	@OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
	public static int anInt915 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method742(@OriginalArg(0) long arg0) {
		Static138.aCalendar1.setTime(new Date(arg0));
		@Pc(9) int local9 = Static138.aCalendar1.get(7);
		@Pc(17) int local17 = Static138.aCalendar1.get(5);
		@Pc(21) int local21 = Static138.aCalendar1.get(2);
		@Pc(25) int local25 = Static138.aCalendar1.get(1);
		@Pc(29) int local29 = Static138.aCalendar1.get(11);
		@Pc(33) int local33 = Static138.aCalendar1.get(12);
		@Pc(37) int local37 = Static138.aCalendar1.get(13);
		return Static112.aStringArray37[local9 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static255.aStringArray28[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10 + ":" + local37 / 10 + local37 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method744(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(14) String local14;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(19) RuntimeException_Sub1 local19 = (RuntimeException_Sub1) arg0;
			local14 = local19.aString31 + " | ";
			arg0 = local19.aThrowable1;
		} else {
			local14 = "";
		}
		@Pc(36) StringWriter local36 = new StringWriter();
		@Pc(41) PrintWriter local41 = new PrintWriter(local36);
		arg0.printStackTrace(local41);
		local41.close();
		@Pc(49) String local49 = local36.toString();
		@Pc(57) BufferedReader local57 = new BufferedReader(new StringReader(local49));
		@Pc(60) String local60 = local57.readLine();
		while (true) {
			@Pc(63) String local63 = local57.readLine();
			if (local63 == null) {
				return local14 + "| " + local60;
			}
			@Pc(72) int local72 = local63.indexOf(40);
			@Pc(79) int local79 = local63.indexOf(41, local72 + 1);
			@Pc(88) String local88;
			if (local72 == -1) {
				local88 = local63;
			} else {
				local88 = local63.substring(0, local72);
			}
			local88 = local88.trim();
			local88 = local88.substring(local88.lastIndexOf(32) + 1);
			local88 = local88.substring(local88.lastIndexOf(9) + 1);
			local14 = local14 + local88;
			if (local72 != -1 && local79 != -1) {
				@Pc(136) int local136 = local63.indexOf(".java:", local72);
				if (local136 >= 0) {
					local14 = local14 + local63.substring(local136 + 5, local79);
				}
			}
			local14 = local14 + ' ';
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!eg;IIILclient!vg;IIIZIII)Lclient!vg;")
	public static Class53_Sub4 method745(@OriginalArg(0) int arg0, @OriginalArg(2) Class46 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class53_Sub4 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(23) long local23 = ((long) arg10 << 32) + ((long) ((arg4 << 24) + (arg11 << 16) + arg3) + ((long) arg0 << 48));
		@Pc(33) Class53_Sub4 local33 = (Class53_Sub4) Static250.aClass26_50.method518(local23);
		@Pc(113) int local113;
		@Pc(115) int local115;
		@Pc(126) int local126;
		@Pc(130) int local130;
		@Pc(155) int local155;
		if (local33 == null) {
			@Pc(41) byte local41;
			if (arg3 == 1) {
				local41 = 9;
			} else if (arg3 == 2) {
				local41 = 12;
			} else if (arg3 == 3) {
				local41 = 15;
			} else if (arg3 == 4) {
				local41 = 18;
			} else {
				local41 = 21;
			}
			@Pc(83) int[] local83 = new int[] { 64, 96, 128 };
			@Pc(89) int[][] local89 = new int[3][local41];
			@Pc(107) Class53_Sub3 local107 = new Class53_Sub3(local41 * 3 + 1, local41 * 2 * 3 + -local41, 0);
			local113 = local107.method2776(0, 0);
			for (local115 = 0; local115 < 3; local115++) {
				local126 = local83[local115];
				local130 = local83[local115];
				for (@Pc(132) int local132 = 0; local132 < local41; local132++) {
					@Pc(145) int local145 = (local132 << 11) / local41;
					local155 = Class111.anIntArray299[local145] * local126 + arg12 >> 16;
					@Pc(165) int local165 = Class111.anIntArray298[local145] * local130 + arg8 >> 16;
					local89[local115][local132] = local107.method2776(local155, local165);
				}
			}
			for (local115 = 0; local115 < 3; local115++) {
				local126 = (local115 * 256 + 128) / 3;
				local130 = 256 - local126;
				@Pc(214) byte local214 = (byte) (local126 * arg4 + local130 * arg11 >> 8);
				@Pc(259) short local259 = (short) ((local126 * (arg0 & 0xFC00) + local130 * (arg10 & 0xFC00) & 0xFC0000) + ((arg0 & 0x380) * local126 + local130 * (arg10 & 0x380) & 0x38000) + ((arg10 & 0x7F) * local130 + local126 * (arg0 & 0x7F) & 0x7F00) >> 8);
				for (local155 = 0; local155 < local41; local155++) {
					if (local115 == 0) {
						local107.method2769(local113, local89[0][(local155 + 1) % local41], local89[0][local155], local259, local214);
					} else {
						local107.method2769(local89[local115 - 1][local155], local89[local115 - 1][(local155 + 1) % local41], local89[local115][(local155 + 1) % local41], local259, local214);
						local107.method2769(local89[local115 - 1][local155], local89[local115][(local155 + 1) % local41], local89[local115][local155], local259, local214);
					}
				}
			}
			local33 = local107.method2774(64, 768, -50, -10, -50);
			Static250.aClass26_50.method510(local33, local23);
		}
		@Pc(377) int local377 = arg3 * 64 - 1;
		@Pc(380) int local380 = -local377;
		@Pc(387) int local387 = local377;
		@Pc(390) int local390 = -local377;
		local113 = local377;
		if (arg9) {
			if (arg2 > 128 && arg2 < 896) {
				local380 -= 128;
			}
			if (arg2 > 1664 || arg2 < 384) {
				local390 -= 128;
			}
			if (arg2 > 1152 && arg2 < 1920) {
				local387 = local377 + 128;
			}
			if (arg2 > 640 && arg2 < 1408) {
				local113 = local377 + 128;
			}
		}
		@Pc(432) int local432 = arg5.method3866();
		local115 = arg5.method3875();
		local126 = arg5.method3855();
		if (local387 < local115) {
			local115 = local387;
		}
		if (local390 > local126) {
			local126 = local390;
		}
		local130 = arg5.method3878();
		if (local432 < local380) {
			local432 = local380;
		}
		if (local130 > local113) {
			local130 = local113;
		}
		@Pc(475) Class4_Sub3_Sub19 local475 = null;
		if (arg1 != null) {
			@Pc(482) int local482 = arg1.anIntArray95[arg6];
			local475 = Static253.method4021(local482 >> 16);
			arg6 = local482 & 0xFFFF;
		}
		if (local475 == null) {
			local33 = local33.method3873(true, true, true);
			local33.method3861((local115 - local432) / 2, 128, (local130 - local126) / 2);
			local33.method3860((local432 + local115) / 2, 0, (local126 + local130) / 2);
		} else {
			local33 = local33.method3873(!local475.method4187(arg6), !local475.method4188(arg6), true);
			local33.method3861((local115 - local432) / 2, 128, (local130 - local126) / 2);
			local33.method3860((local115 + local432) / 2, 0, (local126 + local130) / 2);
			local33.method3881(local475, arg6);
		}
		if (arg2 != 0) {
			local33.method3852(arg2);
		}
		if (Static94.aBoolean138) {
			@Pc(591) Class53_Sub4_Sub2 local591 = (Class53_Sub4_Sub2) local33;
			if (arg7 != Static33.method522(local126 + arg8, arg12 + local432, Static281.anInt5335) || Static33.method522(local130 + arg8, local115 + arg12, Static281.anInt5335) != arg7) {
				for (local155 = 0; local155 < local591.anInt4690; local155++) {
					local591.anIntArray504[local155] += Static33.method522(arg8 + local591.anIntArray502[local155], arg12 + local591.anIntArray507[local155], Static281.anInt5335) - arg7;
				}
				local591.aClass57_1.aBoolean103 = false;
				local591.aClass15_1.aBoolean15 = false;
			}
		} else {
			@Pc(660) Class53_Sub4_Sub1 local660 = (Class53_Sub4_Sub1) local33;
			if (arg7 != Static33.method522(local126 + arg8, local432 + arg12, Static281.anInt5335) || arg7 != Static33.method522(local130 + arg8, arg12 - -local115, Static281.anInt5335)) {
				for (local155 = 0; local155 < local660.anInt3440; local155++) {
					local660.anIntArray344[local155] += Static33.method522(local660.anIntArray340[local155] + arg8, local660.anIntArray347[local155] - -arg12, Static281.anInt5335) - arg7;
				}
				local660.aBoolean244 = false;
			}
		}
		return local33;
	}
}
