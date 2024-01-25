import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
	public static int anInt2408;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "Lclient!av;")
	public static final Class27 aClass27_4 = new Class27(14, 16);

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_67 = new Class160(31, -1);

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_83 = new Class251(58, 6);

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZILclient!pi;[IIIB)Lclient!hr;")
	public static Class161_Sub1_Sub1 method2256(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class144_Sub3 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2.aBoolean556 || Static670.method9288(78, arg0) && Static670.method9288(89, arg1)) {
			return new Class161_Sub1_Sub1(arg2, 3553, arg0, arg1, false, arg3, arg5, 0);
		} else if (arg2.aBoolean575) {
			return new Class161_Sub1_Sub1(arg2, 34037, arg0, arg1, false, arg3, arg5, 0);
		} else {
			return new Class161_Sub1_Sub1(arg2, arg0, arg1, Static255.method4294(arg0), Static255.method4294(arg1), arg3);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!al;)I")
	public static int method2257(@OriginalArg(1) Class19 arg0) {
		if (Static18.aClass19_1 == arg0) {
			return 5120;
		} else if (arg0 == Static18.aClass19_2) {
			return 5122;
		} else if (arg0 == Static18.aClass19_3) {
			return 5124;
		} else if (arg0 == Static18.aClass19_4) {
			return 5121;
		} else if (arg0 == Static18.aClass19_5) {
			return 5123;
		} else if (arg0 == Static18.aClass19_6) {
			return 5125;
		} else if (arg0 == Static18.aClass19_7) {
			return 5131;
		} else if (Static18.aClass19_8 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!jc;)V")
	public static void method2258(@OriginalArg(1) Class14_Sub21 arg0) {
		for (@Pc(18) int local18 = 0; local18 < Static396.anInt6953; local18++) {
			@Pc(28) int local28 = arg0.method7728(-129);
			@Pc(34) int local34 = arg0.method7717(-1978450544);
			if (local34 == 65535) {
				local34 = -1;
			}
			if (Static590.aClass169_Sub1Array3[local28] != null) {
				Static590.aClass169_Sub1Array3[local28].anInt4665 = local34;
			}
		}
		anInt2408++;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)I")
	public static int method2259() {
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		if (Static344.aClass173_5.aBoolean358 && !Static344.aClass173_5.aBoolean359) {
			local5 = true;
			if (Static526.aClass14_Sub12_1.anInt1226 < 512 && Static526.aClass14_Sub12_1.anInt1226 != 0) {
				local5 = false;
			}
			if (Static251.aString65.startsWith("win")) {
				local7 = true;
				local9 = true;
			} else {
				local7 = true;
			}
		}
		if (Static284.aBoolean386) {
			local5 = false;
		}
		if (Static74.aBoolean73) {
			local9 = false;
		}
		if (Static284.aBoolean385) {
			local7 = false;
		}
		if (!local5 && !local7 && !local9) {
			return Static140.method2128();
		}
		@Pc(81) int local81 = -1;
		@Pc(83) int local83 = -1;
		if (local5) {
			try {
				local81 = Static12.method243(1000, 2);
			} catch (@Pc(92) Exception local92) {
			}
		}
		@Pc(95) int local95 = -1;
		if (local9) {
			try {
				local95 = Static12.method243(1000, 3);
				if (Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801() == 3) {
					@Pc(113) Class35 local113 = Static103.aClass144_3.method6960();
					@Pc(118) long local118 = local113.aLong30 & 0xFFFFFFFFFFFFL;
					@Pc(121) int local121 = local113.anInt653;
					if (local121 == 4318) {
						local7 &= local118 >= 64425238954L;
					} else if (local121 == 4098) {
						local7 &= local118 >= 60129613779L;
					}
				}
			} catch (@Pc(156) Exception local156) {
			}
		}
		if (local7) {
			try {
				local83 = Static12.method243(1000, 1);
			} catch (@Pc(166) Exception local166) {
			}
		}
		if (local81 == -1 && local83 == -1 && local95 == -1) {
			return Static140.method2128();
		}
		local95 = (int) ((float) local95 * 1.1F);
		local83 = (int) ((float) local83 * 1.1F);
		if (local81 > local95 && local83 < local81) {
			return Static578.method8261(local81);
		} else if (local83 < local95) {
			return Static148.method2182(3, local95);
		} else {
			return Static148.method2182(1, local83);
		}
	}
}
