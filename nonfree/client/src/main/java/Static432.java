import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!sba", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray35;

	@OriginalMember(owner = "client!sba", name = "r", descriptor = "[Lclient!taa;")
	public static Class266[] aClass266Array2;

	@OriginalMember(owner = "client!sba", name = "l", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_80 = new Class243(70, -1);

	@OriginalMember(owner = "client!sba", name = "t", descriptor = "I")
	public static int anInt7922 = -1;

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(IIZIIII)V")
	public static void method6628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static7.anInt8119 <= arg5 - arg4 && arg4 + arg5 <= Static34.anInt603 && Static328.anInt6154 <= arg2 - arg4 && Static394.anInt7462 >= arg4 + arg2) {
			Static296.method4689(arg4, arg0, arg1, arg2, arg5, arg3);
		} else {
			Static196.method3172(arg1, arg2, arg5, arg0, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "()V")
	public static void method6629() {
		for (@Pc(1) int local1 = 0; local1 < Static361.anInt6824; local1++) {
			if (!Static230.aBooleanArray22[local1]) {
				@Pc(10) Class83 local10 = Static410.aClass83Array1[local1];
				@Pc(13) Class2_Sub5 local13 = local10.aClass2_Sub5_1;
				@Pc(16) int local16 = local10.anInt2484;
				@Pc(22) int local22 = local13.method1666() - Static392.anInt7455;
				@Pc(30) int local30 = (local22 * 2 >> Static175.anInt3259) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method1672() - local22 >> Static175.anInt3259;
				@Pc(53) int local53 = local13.method1662() - local22 >> Static175.anInt3259;
				@Pc(61) int local61 = local13.method1662() + local22 >> Static175.anInt3259;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static315.anInt5693) {
					local61 = Static315.anInt5693 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray59[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static515.anInt3809) {
						local108 = Static515.anInt3809 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class1_Sub1 local141 = Static214.method3907(local16, local125, local78, lba.class);
						if (local141 != null && local141.aByte91 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte91 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray59[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray59[local32 - 1];
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
									local182 = local10.aShortArray59[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray59[local32 + 1];
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
				Static230.aBooleanArray22[local1] = true;
				Static532.aClass75Array3[local16].method6706(local13, local37);
			}
		}
	}
}
