import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
	public static int anInt154 = 0;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "()V")
	public static void method117() {
		for (@Pc(1) int local1 = 0; local1 < Static135.anInt6872; local1++) {
			if (!Static338.aBooleanArray18[local1]) {
				@Pc(10) Class225 local10 = Static25.aClass225Array1[local1];
				@Pc(13) Class10_Sub4 local13 = local10.aClass10_Sub4_1;
				@Pc(16) int local16 = local10.anInt6417;
				@Pc(22) int local22 = local13.method5355() - Static437.anInt7214;
				@Pc(30) int local30 = (local22 * 2 >> Static286.anInt5018) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method5354() - local22 >> Static286.anInt5018;
				@Pc(53) int local53 = local13.method5362() - local22 >> Static286.anInt5018;
				@Pc(61) int local61 = local13.method5362() + local22 >> Static286.anInt5018;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static24.anInt401) {
					local61 = Static24.anInt401 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray105[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static54.anInt998) {
						local108 = Static54.anInt998 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class24_Sub3 local141 = Static106.method1867(local16, local125, local78, qi.class);
						if (local141 != null && local141.aByte97 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte97 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray105[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray105[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 4;
								} else if (local168 && !local159) {
									local128 = 2;
								}
							} else {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 - 1 >= local53) {
									local182 = local10.aShortArray105[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray105[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 3;
								} else if (local168 && !local159) {
									local128 = 5;
								}
							}
						}
						local37[local94++] = local128;
					}
					local32++;
				}
				Static338.aBooleanArray18[local1] = true;
				Static332.aClass154Array3[local16].method6079(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!qi;Z)Z")
	public static boolean method119(@OriginalArg(0) Class24_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static332.aClass154Array3 == Static173.aClass154Array1;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method5580();
		if (arg0.aShort107 < 0 || arg0.aShort105 < 0 || arg0.aShort106 >= Static54.anInt998 || arg0.aShort104 >= Static24.anInt401) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort107; local34 <= arg0.aShort106; local34++) {
			for (local38 = arg0.aShort105; local38 <= arg0.aShort104; local38++) {
				@Pc(45) Class11 local45 = Static21.method286(arg0.aByte98, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort107) {
						local49++;
					}
					if (local34 < arg0.aShort106) {
						local49 += 4;
					}
					if (local38 > arg0.aShort105) {
						local49 += 8;
					}
					if (local38 < arg0.aShort104) {
						local49 += 2;
					}
					@Pc(74) Class1 local74 = Static415.method5446(arg0, local49);
					@Pc(77) Class1 local77 = local45.aClass1_3;
					if (local77 == null) {
						local45.aClass1_3 = local74;
					} else {
						while (local77.aClass1_1 != null) {
							local77 = local77.aClass1_1;
						}
						local77.aClass1_1 = local74;
					}
					local45.aByte4 = (byte) (local45.aByte4 | local49);
					if (local6 && (Static290.anIntArrayArray46[local34][local38] & 0xFF000000) != 0) {
						local8 = Static290.anIntArrayArray46[local34][local38];
						local10 = Static452.aShortArrayArray4[local34][local38];
						local12 = Static120.aByteArrayArray20[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort107; local38 <= arg0.aShort106; local38++) {
				for (@Pc(150) int local150 = arg0.aShort105; local150 <= arg0.aShort104; local150++) {
					if ((Static290.anIntArrayArray46[local38][local150] & 0xFF000000) == 0) {
						Static290.anIntArrayArray46[local38][local150] = local8;
						Static452.aShortArrayArray4[local38][local150] = local10;
						Static120.aByteArrayArray20[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static400.aClass24_Sub3Array3[Static270.anInt4750++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIII)V")
	public static void method120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static397.method5273(arg3);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg3 - arg0;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg3;
		@Pc(24) int local24 = -arg3;
		@Pc(35) int local35 = local15;
		@Pc(38) int local38 = -local15;
		@Pc(40) int local40 = -1;
		@Pc(42) int local42 = -1;
		@Pc(46) int[] local46 = Class10_Sub10_Sub1.lb[arg1];
		@Pc(51) int local51 = arg2 - local15;
		Static212.method3267(arg2 - arg3, local51, arg4, local46);
		@Pc(64) int local64 = local15 + arg2;
		Static212.method3267(local51, local64, arg5, local46);
		Static212.method3267(local64, arg2 + arg3, arg4, local46);
		while (local10 < local21) {
			local42 += 2;
			local40 += 2;
			local24 += local40;
			local38 += local42;
			if (local38 >= 0 && local35 >= 1) {
				Static267.anIntArray463[local35] = local10;
				local35--;
				local38 -= local35 << 1;
			}
			local10++;
			@Pc(128) int[] local128;
			@Pc(135) int[] local135;
			@Pc(139) int local139;
			@Pc(144) int local144;
			@Pc(149) int local149;
			@Pc(153) int local153;
			@Pc(158) int local158;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				if (local21 < local15) {
					local128 = Class10_Sub10_Sub1.lb[arg1 + local21];
					local135 = Class10_Sub10_Sub1.lb[arg1 - local21];
					local139 = Static267.anIntArray463[local21];
					local144 = arg2 + local10;
					local149 = arg2 - local10;
					local153 = arg2 + local139;
					local158 = arg2 - local139;
					Static212.method3267(local149, local158, arg4, local128);
					Static212.method3267(local158, local153, arg5, local128);
					Static212.method3267(local153, local144, arg4, local128);
					Static212.method3267(local149, local158, arg4, local135);
					Static212.method3267(local158, local153, arg5, local135);
					Static212.method3267(local153, local144, arg4, local135);
				} else {
					local128 = Class10_Sub10_Sub1.lb[local21 + arg1];
					local135 = Class10_Sub10_Sub1.lb[arg1 - local21];
					local139 = arg2 + local10;
					local144 = arg2 - local10;
					Static212.method3267(local144, local139, arg4, local128);
					Static212.method3267(local144, local139, arg4, local135);
				}
			}
			local128 = Class10_Sub10_Sub1.lb[local10 + arg1];
			local135 = Class10_Sub10_Sub1.lb[arg1 - local10];
			local139 = local21 + arg2;
			local144 = arg2 - local21;
			if (local10 < local15) {
				local149 = local35 >= local10 ? local35 : Static267.anIntArray463[local10];
				local153 = local149 + arg2;
				local158 = arg2 - local149;
				Static212.method3267(local144, local158, arg4, local128);
				Static212.method3267(local158, local153, arg5, local128);
				Static212.method3267(local153, local139, arg4, local128);
				Static212.method3267(local144, local158, arg4, local135);
				Static212.method3267(local158, local153, arg5, local135);
				Static212.method3267(local153, local139, arg4, local135);
			} else {
				Static212.method3267(local144, local139, arg4, local128);
				Static212.method3267(local144, local139, arg4, local135);
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIILjava/lang/Object;)[B")
	public static byte[] method121(@OriginalArg(0) int arg0, @OriginalArg(3) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return Static117.method2050(arg0, local13);
		} else if (arg1 instanceof Class164) {
			@Pc(25) Class164 local25 = (Class164) arg1;
			return local25.method3656(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
