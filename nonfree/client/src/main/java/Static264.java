import java.awt.Canvas;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "Z")
	public static boolean aBoolean464 = true;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "Lclient!pj;")
	public static final Class156 aClass156_11 = new Class156(64);

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "[I")
	public static final int[] anIntArray684 = new int[200];

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "()V")
	public static void method4807() {
		for (@Pc(1) int local1 = 0; local1 < Static160.anInt3182; local1++) {
			if (!Static30.aBooleanArray3[local1]) {
				@Pc(10) Class1_Sub31_Sub1 local10 = Static327.aClass1_Sub31_Sub1Array3[local1];
				@Pc(13) int local13 = local10.anInt4698;
				@Pc(18) int local18 = local10.anInt4688 - 64;
				@Pc(26) int local26 = (local18 * 2 >> 7) + 1;
				@Pc(28) int local28 = 0;
				@Pc(33) int[] local33 = new int[local26 * local26];
				@Pc(40) int local40 = local10.anInt4687 - local18 >> 7;
				@Pc(47) int local47 = local10.anInt4693 - local18 >> 7;
				@Pc(54) int local54 = local10.anInt4693 + local18 >> 7;
				if (local47 < 0) {
					local28 = -local47;
					local47 = 0;
				}
				if (local54 >= Static74.anInt3404) {
					local54 = Static74.anInt3404 - 1;
				}
				for (@Pc(71) int local71 = local47; local71 <= local54; local71++) {
					@Pc(77) short local77 = local10.aShortArray76[local28];
					@Pc(81) int local81 = local77 >>> 8;
					@Pc(87) int local87 = local28 * local26 + local81;
					@Pc(93) int local93 = local40 + (local77 >>> 8);
					@Pc(101) int local101 = local93 + (local77 & 0xFF) - 1;
					if (local93 < 0) {
						local87 -= local93;
						local93 = 0;
					}
					if (local101 >= Static222.anInt4391) {
						local101 = Static222.anInt4391 - 1;
					}
					for (@Pc(118) int local118 = local93; local118 <= local101; local118++) {
						@Pc(121) byte local121 = 1;
						@Pc(134) Class5_Sub3 local134 = Static66.method1372(local13, local118, local71, cp.class);
						if (local134 != null && local134.aByte52 != 0) {
							@Pc(152) boolean local152;
							@Pc(161) boolean local161;
							@Pc(175) short local175;
							@Pc(181) int local181;
							@Pc(187) int local187;
							if (local134.aByte52 == 1) {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 + 1 <= local54) {
									local175 = local10.aShortArray76[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 - 1 >= local47) {
									local175 = local10.aShortArray76[local28 - 1];
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
									local175 = local10.aShortArray76[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 + 1 <= local54) {
									local175 = local10.aShortArray76[local28 + 1];
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
				Static30.aBooleanArray3[local1] = true;
				Static7.aClass41Array1[local13].method5423(local10, local33);
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!ql;II)V")
	public static void method4808(@OriginalArg(1) Class5_Sub3_Sub3_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0.anInt4977 && arg2 != -1) {
			@Pc(79) Class121 local79 = Static133.method2520(arg2);
			@Pc(82) int local82 = local79.anInt3780;
			if (local82 == 1) {
				arg0.anInt4957 = 0;
				arg0.anInt4922 = 0;
				arg0.anInt4936 = arg1;
				arg0.anInt4965 = 1;
				arg0.anInt4950 = 0;
				Static131.method2490(false, local79, arg0.anInt4950, arg0.anInt5047, arg0.anInt5050);
			}
			if (local82 == 2) {
				arg0.anInt4922 = 0;
				return;
			}
		} else if (arg2 == -1 || arg0.anInt4977 == -1 || Static133.method2520(arg2).anInt3772 >= Static133.method2520(arg0.anInt4977).anInt3772) {
			arg0.anInt4936 = arg1;
			arg0.anInt4950 = 0;
			arg0.anInt4957 = 0;
			arg0.anInt4965 = 1;
			arg0.anInt4922 = 0;
			arg0.anInt4984 = arg0.anInt4985;
			arg0.anInt4977 = arg2;
			if (arg0.anInt4977 != -1) {
				Static131.method2490(false, Static133.method2520(arg0.anInt4977), arg0.anInt4950, arg0.anInt5047, arg0.anInt5050);
				return;
			}
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILclient!kq;Ljava/lang/String;)Lclient!mq;")
	public static Class134 method4810(@OriginalArg(0) int arg0, @OriginalArg(2) Class110 arg1, @OriginalArg(3) String arg2) {
		if (arg0 == 0) {
			return arg1.method3360(arg2);
		}
		@Pc(44) Class134 local44;
		if (arg0 == 1) {
			try {
				Static365.method4928(new Object[] { (new URL(arg1.anApplet1.getCodeBase(), arg2)).toString() }, arg1.anApplet1, "openjs");
				local44 = new Class134();
				local44.anInt4033 = 1;
				return local44;
			} catch (@Pc(50) Throwable local50) {
				local44 = new Class134();
				local44.anInt4033 = 2;
				return local44;
			}
		} else if (arg0 == 2) {
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg2), "_blank");
				local44 = new Class134();
				local44.anInt4033 = 1;
				return local44;
			} catch (@Pc(84) Exception local84) {
				local44 = new Class134();
				local44.anInt4033 = 2;
				return local44;
			}
		} else if (arg0 == 3) {
			try {
				Static365.method4929(arg1.anApplet1, "loggedout");
			} catch (@Pc(106) Throwable local106) {
			}
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg2), "_top");
				local44 = new Class134();
				local44.anInt4033 = 1;
				return local44;
			} catch (@Pc(128) Exception local128) {
				local44 = new Class134();
				local44.anInt4033 = 2;
				return local44;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)Lclient!ti;")
	public static Class5_Sub1 method4812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class204 local7 = Static138.aClass204ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass5_Sub1_1;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/awt/Canvas;I)Lclient!ra;")
	public static Class86 method4814(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class86_Sub1");
			@Pc(15) Class86 local15 = (Class86) local11.getDeclaredConstructor().newInstance();
			local15.method4813(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class86_Sub2 local26 = new Class86_Sub2();
			local26.method4813(arg0);
			return local26;
		}
	}
}
