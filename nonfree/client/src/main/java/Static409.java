import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!ur", name = "X", descriptor = "[[[Lclient!hg;")
	public static Class101[][][] aClass101ArrayArrayArray3;

	@OriginalMember(owner = "client!ur", name = "T", descriptor = "Lclient!um;")
	public static final Class244 aClass244_44 = new Class244();

	@OriginalMember(owner = "client!ur", name = "V", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_377 = new Class123(52, 7);

	@OriginalMember(owner = "client!ur", name = "W", descriptor = "Z")
	public static boolean aBoolean466 = true;

	@OriginalMember(owner = "client!ur", name = "Y", descriptor = "Lclient!ak;")
	public static final Class10 aClass10_23 = new Class10(13, 0, 1, 0);

	@OriginalMember(owner = "client!ur", name = "Z", descriptor = "Z")
	public static boolean aBoolean467 = true;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "()V")
	public static void method6043() {
		for (@Pc(1) int local1 = 0; local1 < Static56.anInt1522; local1++) {
			if (!Static302.aBooleanArray20[local1]) {
				@Pc(10) Class76 local10 = Static411.aClass76Array1[local1];
				@Pc(13) Class6_Sub11 local13 = local10.aClass6_Sub11_1;
				@Pc(16) int local16 = local10.anInt2354;
				@Pc(22) int local22 = local13.method6395() - Static437.anInt7761;
				@Pc(30) int local30 = (local22 * 2 >> Static62.anInt1705) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method6390() - local22 >> Static62.anInt1705;
				@Pc(53) int local53 = local13.method6392() - local22 >> Static62.anInt1705;
				@Pc(61) int local61 = local13.method6392() + local22 >> Static62.anInt1705;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static61.anInt1698) {
					local61 = Static61.anInt1698 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray25[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static229.anInt4189) {
						local108 = Static229.anInt4189 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class3_Sub2 local141 = Static415.method6101(local16, local125, local78, jo.class);
						if (local141 != null && local141.aByte104 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte104 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray25[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray25[local32 - 1];
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
									local182 = local10.aShortArray25[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray25[local32 + 1];
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
				Static302.aBooleanArray20[local1] = true;
				Static55.aClass86Array1[local16].method6585(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIZ)V")
	public static void method6044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= Static172.anInt3442 && Static324.anInt5590 >= arg3) {
			@Pc(19) int local19 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg0);
			@Pc(25) int local25 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg2);
			Static226.method4724(arg3, arg1, local25, local19);
		}
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(BI)Z")
	public static boolean method6045(@OriginalArg(1) int arg0) {
		Static268.aBoolean303 = true;
		Static206.anInt3849 = arg0 + 1 & 0xFFFF;
		return true;
	}
}
