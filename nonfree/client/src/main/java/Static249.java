import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!ol", name = "H", descriptor = "Lclient!vg;")
	public static Class2_Sub2_Sub4 aClass2_Sub2_Sub4_42;

	@OriginalMember(owner = "client!ol", name = "J", descriptor = "[I")
	public static int[] anIntArray1342;

	@OriginalMember(owner = "client!ol", name = "x", descriptor = "[I")
	public static final int[] anIntArray1341 = new int[200];

	@OriginalMember(owner = "client!ol", name = "C", descriptor = "I")
	public static final int anInt6516 = 1;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIIILclient!n;IIILclient!qp;Lclient!vc;IZ)Lclient!n;")
	public static Class66 method5588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class66 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class202 arg10, @OriginalArg(12) Class63 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) boolean arg13) {
		if (arg6 == null) {
			return null;
		}
		@Pc(11) int local11 = 1031;
		if (arg10 != null) {
			local11 = arg10.method4330(false, -1, arg0) | 0x407;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = (long) (arg1 + (arg5 << 16) + (arg7 << 24)) + ((long) arg12 << 32) + ((long) arg8 << 48);
		@Pc(50) Class160 local50 = Static28.aClass160_3;
		@Pc(58) Class66 local58;
		synchronized (Static28.aClass160_3) {
			local58 = (Class66) Static28.aClass160_3.method3599(local48);
		}
		@Pc(153) int local153;
		@Pc(159) int local159;
		@Pc(165) int local165;
		@Pc(169) int local169;
		if (local58 == null || arg11.method2051(local58.method5127(), local11) != 0) {
			if (local58 != null) {
				local11 = arg11.method2031(local11, local58.method5127());
			}
			@Pc(99) byte local99;
			if (arg1 == 1) {
				local99 = 9;
			} else if (arg1 == 2) {
				local99 = 12;
			} else if (arg1 == 3) {
				local99 = 15;
			} else if (arg1 == 4) {
				local99 = 18;
			} else {
				local99 = 21;
			}
			@Pc(128) int[] local128 = new int[] { 64, 96, 128 };
			@Pc(146) Class200 local146 = new Class200(local99 * 3 + 1, 2 * 3 * local99 + -local99, 0);
			local153 = local146.method4253(0, 0, 0);
			@Pc(157) int[][] local157 = new int[3][local99];
			@Pc(171) int local171;
			@Pc(195) int local195;
			for (local159 = 0; local159 < 3; local159++) {
				local165 = local128[local159];
				local169 = local128[local159];
				for (local171 = 0; local171 < local99; local171++) {
					@Pc(179) int local179 = (local171 << 14) / local99;
					@Pc(187) int local187 = Class177.anIntArray843[local179] * local165 >> 15;
					local195 = local169 * Class177.anIntArray844[local179] >> 15;
					local157[local159][local171] = local146.method4253(0, local187, local195);
				}
			}
			for (local165 = 0; local165 < 3; local165++) {
				local169 = (local165 * 256 + 128) / 3;
				local171 = 256 - local169;
				@Pc(245) byte local245 = (byte) (arg7 * local169 + local171 * arg5 >> 8);
				@Pc(290) short local290 = (short) ((local171 * (arg12 & 0x7F) + local169 * (arg8 & 0x7F) & 0x7F00) + (local169 * (arg8 & 0x380) + (arg12 & 0x380) * local171 & 0x38000) + ((arg12 & 0xFC00) * local171 + (arg8 & 0xFC00) * local169 & 0xFC0000) >> 8);
				for (local195 = 0; local195 < local99; local195++) {
					if (local165 == 0) {
						local146.method4255(local245, local157[0][(local195 + 1) % local99], local290, local157[0][local195], (short) -1, (byte) -1, local153, (byte) 1);
					} else {
						local146.method4255(local245, local157[local165 - 1][(local195 + 1) % local99], local290, local157[local165][(local195 + 1) % local99], (short) -1, (byte) -1, local157[local165 - 1][local195], (byte) 1);
						local146.method4255(local245, local157[local165][(local195 + 1) % local99], local290, local157[local165][local195], (short) -1, (byte) -1, local157[local165 - 1][local195], (byte) 1);
					}
				}
			}
			local58 = arg11.method1998(local146, local11, Static65.anInt4692, 64, 768);
			@Pc(410) Class160 local410 = Static28.aClass160_3;
			synchronized (Static28.aClass160_3) {
				Static28.aClass160_3.method3602(local48, local58);
			}
		}
		@Pc(429) int local429 = arg1 * 64 - 1;
		@Pc(432) int local432 = -local429;
		@Pc(435) int local435 = -local429;
		@Pc(437) int local437 = local429;
		local153 = local429;
		if (arg13) {
			if (arg4 > 13312 || arg4 < 3072) {
				local435 -= 128;
			}
			if (arg4 > 1024 && arg4 < 7168) {
				local432 -= 128;
			}
			if (arg4 > 5120 && arg4 < 11264) {
				local153 = local429 + 128;
			}
			if (arg4 > 9216 && arg4 < 15360) {
				local437 = local429 + 128;
			}
		}
		@Pc(486) int local486 = arg6.method5161();
		local159 = arg6.method5134();
		local165 = arg6.method5146();
		if (local432 > local486) {
			local486 = local432;
		}
		if (local435 > local165) {
			local165 = local435;
		}
		local169 = arg6.method5148();
		if (local159 > local437) {
			local159 = local437;
		}
		if (local169 > local153) {
			local169 = local153;
		}
		@Pc(532) Class2_Sub10_Sub12 local532 = null;
		if (arg10 != null) {
			@Pc(539) int local539 = arg10.anIntArray974[arg0];
			local532 = Static36.aClass236_1.method5395(local539 >> 16);
			arg0 = local539 & 0xFFFF;
		}
		if (local532 == null) {
			local58 = local58.method5119((byte) 3, local11, true);
			local58.method5135((local159 - local486) / 2, 128, (local169 - local165) / 2);
			local58.method5132((local159 + local486) / 2, 0, (local169 + local165) / 2);
		} else {
			local58 = local58.method5119((byte) 3, local11, true);
			local58.method5135((local159 - local486) / 2, 128, (local169 - local165) / 2);
			local58.method5132((local486 + local159) / 2, 0, (local165 + local169) / 2);
			local58.method5149(local532, arg0);
		}
		if (arg9 != 0) {
			local58.method5153(arg9);
		}
		if (arg3 != 0) {
			local58.method5145(arg3);
		}
		if (arg2 != 0) {
			local58.method5132(0, arg2, 0);
		}
		return local58;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)Z")
	public static boolean method5593(@OriginalArg(1) int arg0) {
		if (arg0 == 19 || arg0 == 49 || arg0 == 15 || arg0 == 20 || arg0 == 1008) {
			return true;
		} else {
			return arg0 == 22 || arg0 == 1001;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5597(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static216.method3597(Static48.aClass11_17);
			Static372.aClass2_Sub16_Sub2_4.method5358(Static204.method3471(arg0));
			Static372.aClass2_Sub16_Sub2_4.method5362(arg0);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5599(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local10 += 3;
			}
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(local10 + local8);
		for (@Pc(45) int local45 = 0; local45 < local8; local45++) {
			@Pc(51) char local51 = arg0.charAt(local45);
			if (local51 == '<') {
				local43.append("<lt>");
			} else if (local51 == '>') {
				local43.append("<gt>");
			} else {
				local43.append(local51);
			}
		}
		return local43.toString();
	}
}
