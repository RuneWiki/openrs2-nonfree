import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "[I")
	public static int[] anIntArray534;

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
	public static int anInt8068;

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "S")
	public static short aShort100 = 32767;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZ[BI)I")
	public static int method6884(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = arg2; local14 < arg0; local14++) {
			local12 = local12 >>> 8 ^ Class195.anIntArray393[(local12 ^ arg1[local14]) & 0xFF];
		}
		return ~local12;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "()V")
	public static void method6885() {
		for (@Pc(1) int local1 = 0; local1 < Static102.anInt2851; local1++) {
			if (!Static475.aBooleanArray26[local1]) {
				@Pc(10) Class300 local10 = Static436.aClass300Array1[local1];
				@Pc(13) Class2_Sub1 local13 = local10.aClass2_Sub1_2;
				@Pc(16) int local16 = local10.anInt9115;
				@Pc(22) int local22 = local13.method3968() - Static361.anInt7189;
				@Pc(30) int local30 = (local22 * 2 >> Static151.anInt3896) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method3969() - local22 >> Static151.anInt3896;
				@Pc(53) int local53 = local13.method3962() - local22 >> Static151.anInt3896;
				@Pc(61) int local61 = local13.method3962() + local22 >> Static151.anInt3896;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static562.anInt10128) {
					local61 = Static562.anInt10128 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray123[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static477.anInt8929) {
						local108 = Static477.anInt8929 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class3_Sub1_Sub3 local141 = Static440.method6961(local16, local125, local78, jb.class);
						if (local141 != null && local141.aByte129 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte129 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray123[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray123[local32 - 1];
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
									local182 = local10.aShortArray123[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray123[local32 + 1];
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
				Static475.aBooleanArray26[local1] = true;
				Static9.aClass65Array1[local16].method7994(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BIIIII)I")
	public static int method6886(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static9.aClass65Array1 == null) {
			return 0;
		} else if (arg3 < 3) {
			@Pc(22) int local22 = arg0 >> 9;
			@Pc(26) int local26 = arg1 >> 9;
			if (arg2 < 0 || arg4 < 0 || Static47.anInt1794 - 1 < arg2 || Static209.anInt4742 - 1 < arg4) {
				return 0;
			} else if (local22 >= 1 && local26 >= 1 && Static47.anInt1794 - 1 >= local22 && local26 <= Static209.anInt4742 - 1) {
				@Pc(91) boolean local91 = (Static476.aByteArrayArrayArray5[1][arg0 >> 9][arg1 >> 9] & 0x2) != 0;
				@Pc(116) boolean local116;
				@Pc(132) boolean local132;
				if ((arg0 & 0x1FF) == 0) {
					local116 = (Static476.aByteArrayArrayArray5[1][local22 - 1][arg1 >> 9] & 0x2) != 0;
					local132 = (Static476.aByteArrayArrayArray5[1][local22][arg1 >> 9] & 0x2) != 0;
					if (local116 != local132) {
						local91 = (Static476.aByteArrayArrayArray5[1][arg2][arg4] & 0x2) != 0;
					}
				}
				if ((arg1 & 0x1FF) == 0) {
					local116 = (Static476.aByteArrayArrayArray5[1][arg0 >> 9][local26 - 1] & 0x2) != 0;
					local132 = (Static476.aByteArrayArrayArray5[1][arg0 >> 9][local26] & 0x2) != 0;
					if (local116 != local132) {
						local91 = (Static476.aByteArrayArrayArray5[1][arg2][arg4] & 0x2) != 0;
					}
				}
				if (local91) {
					arg3++;
				}
				return Static9.aClass65Array1[arg3].method7999(arg0, arg1);
			} else {
				return 0;
			}
		} else {
			return Static9.aClass65Array1[arg3].method7999(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)V")
	public static void method6888() {
		@Pc(1) Class169 local1 = Static118.aClass169_19;
		synchronized (Static118.aClass169_19) {
			Static118.aClass169_19.method4997(5);
		}
	}
}
