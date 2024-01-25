import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
	public static int anInt8877;

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_119 = new Class218(100, 6);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "()V")
	public static void method7321() {
		for (@Pc(1) int local1 = 0; local1 < Static252.anInt5591; local1++) {
			if (!Static511.aBooleanArray23[local1]) {
				@Pc(10) Class93 local10 = Static523.aClass93Array1[local1];
				@Pc(13) Class3_Sub27 local13 = local10.aClass3_Sub27_2;
				@Pc(16) int local16 = local10.anInt3588;
				@Pc(22) int local22 = local13.method5624() - Static510.anInt8986;
				@Pc(30) int local30 = (local22 * 2 >> Static276.anInt5846) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method5627() - local22 >> Static276.anInt5846;
				@Pc(53) int local53 = local13.method5630() - local22 >> Static276.anInt5846;
				@Pc(61) int local61 = local13.method5630() + local22 >> Static276.anInt5846;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static158.anInt3845) {
					local61 = Static158.anInt3845 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray33[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static642.anInt10523) {
						local108 = Static642.anInt10523 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class2_Sub3_Sub1 local141 = Static17.method258(local16, local125, local78, rq.class);
						if (local141 != null && local141.aByte130 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte130 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray33[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray33[local32 - 1];
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
									local182 = local10.aShortArray33[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray33[local32 + 1];
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
				Static511.aBooleanArray23[local1] = true;
				Static500.aClass274Array2[local16].method8040(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(III)Z")
	public static boolean method7323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static578.method8021(arg1, arg0) || Static626.method8491(arg0, arg1);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method7331(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5) {
		Static318.method5388(arg2, arg5, 0, arg4, arg0, arg3, arg1);
	}
}
