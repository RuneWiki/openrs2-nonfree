import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "Lclient!e;")
	public static Class46 aClass46_4;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	public static int anInt3351 = 0;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "Lclient!jg;")
	public static final Class14_Sub4 aClass14_Sub4_5 = new Class14_Sub4(new byte[5000]);

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
	public static void method3100(@OriginalArg(1) int arg0) {
		if (!Static99.aBoolean157) {
			arg0 = -1;
		}
		if (Static20.anInt394 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(29) Class99 local29 = Static90.method2138(arg0);
			@Pc(35) Class207 local35 = local29.method2826();
			if (local35 == null) {
				arg0 = -1;
			} else {
				Static105.aClass15_2.method292(Static95.aCanvas2, local35.method5817(), local35.method5809(), local35.method5815(), new Point(local29.anInt2990, local29.anInt2988));
				Static20.anInt394 = arg0;
			}
		}
		if (arg0 == -1 && Static20.anInt394 != -1) {
			Static105.aClass15_2.method292(Static95.aCanvas2, -1, null, -1, new Point());
			Static20.anInt394 = -1;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()V")
	public static void method3102() {
		for (@Pc(1) int local1 = 0; local1 < Static4.anInt118; local1++) {
			if (!Static124.aBooleanArray13[local1]) {
				@Pc(10) Class14_Sub13_Sub1 local10 = Static127.aClass14_Sub13_Sub1Array1[local1];
				@Pc(13) int local13 = local10.anInt5650;
				@Pc(18) int local18 = local10.anInt5639 - 64;
				@Pc(26) int local26 = (local18 * 2 >> 7) + 1;
				@Pc(28) int local28 = 0;
				@Pc(33) int[] local33 = new int[local26 * local26];
				@Pc(40) int local40 = local10.anInt5640 - local18 >> 7;
				@Pc(47) int local47 = local10.anInt5638 - local18 >> 7;
				@Pc(54) int local54 = local10.anInt5638 + local18 >> 7;
				if (local47 < 0) {
					local28 = -local47;
					local47 = 0;
				}
				if (local54 >= Static180.anInt3712) {
					local54 = Static180.anInt3712 - 1;
				}
				for (@Pc(71) int local71 = local47; local71 <= local54; local71++) {
					@Pc(77) short local77 = local10.aShortArray113[local28];
					@Pc(81) int local81 = local77 >>> 8;
					@Pc(87) int local87 = local28 * local26 + local81;
					@Pc(93) int local93 = local40 + (local77 >>> 8);
					@Pc(101) int local101 = local93 + (local77 & 0xFF) - 1;
					if (local93 < 0) {
						local87 -= local93;
						local93 = 0;
					}
					if (local101 >= Static233.anInt4556) {
						local101 = Static233.anInt4556 - 1;
					}
					for (@Pc(118) int local118 = local93; local118 <= local101; local118++) {
						@Pc(121) byte local121 = 1;
						@Pc(134) Class10_Sub3 local134 = Static263.method4514(local13, local118, local71, jr.class);
						if (local134 != null && local134.aByte63 != 0) {
							@Pc(152) boolean local152;
							@Pc(161) boolean local161;
							@Pc(175) short local175;
							@Pc(181) int local181;
							@Pc(187) int local187;
							if (local134.aByte63 == 1) {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 + 1 <= local54) {
									local175 = local10.aShortArray113[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 - 1 >= local47) {
									local175 = local10.aShortArray113[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local161 = local118 > local181 && local118 < local187;
								}
								if (local152 && !local161) {
									local121 = 4;
								} else if (local161 && !local152) {
									local121 = 2;
								}
							} else {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 - 1 >= local47) {
									local175 = local10.aShortArray113[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 + 1 <= local54) {
									local175 = local10.aShortArray113[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local161 = local118 > local181 && local118 < local187;
								}
								if (local152 && !local161) {
									local121 = 3;
								} else if (local161 && !local152) {
									local121 = 5;
								}
							}
						}
						local33[local87++] = local121;
					}
					local28++;
				}
				Static124.aBooleanArray13[local1] = true;
				Static158.aClass114Array2[local13].method3604(local10, local33);
			}
		}
	}
}
