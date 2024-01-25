import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "I")
	public static int anInt5055;

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "I")
	public static int anInt5057;

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_217 = new Class296(56, 7);

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "Z")
	public static boolean aBoolean356 = false;

	@OriginalMember(owner = "client!kw", name = "k", descriptor = "I")
	public static int anInt5061 = 0;

	@OriginalMember(owner = "client!kw", name = "l", descriptor = "Lclient!jq;")
	public static Class156 aClass156_10 = null;

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILclient!kr;)I")
	public static int method4382(@OriginalArg(1) Class171 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4327(Static259.anInt5036)) {
			local5++;
		}
		if (arg0.method4327(Static302.anInt5572)) {
			local5++;
		}
		if (arg0.method4327(Static386.anInt7018)) {
			local5++;
		}
		if (arg0.method4327(Static103.anInt2062)) {
			local5++;
		}
		if (arg0.method4327(Static531.anInt8928)) {
			local5++;
		}
		if (arg0.method4327(Static112.anInt2262)) {
			local5++;
		}
		if (arg0.method4327(Static454.anInt7750)) {
			local5++;
		}
		if (arg0.method4327(Static96.anInt1965)) {
			local5++;
		}
		if (arg0.method4327(Static442.anInt7611)) {
			local5++;
		}
		if (arg0.method4327(Static368.anInt6814)) {
			local5++;
		}
		if (arg0.method4327(Static190.anInt3386)) {
			local5++;
		}
		if (arg0.method4327(Static446.anInt7658)) {
			local5++;
		}
		if (arg0.method4327(Static415.anInt7306)) {
			local5++;
		}
		if (arg0.method4327(Static375.anInt6873)) {
			local5++;
		}
		if (arg0.method4327(Static233.anInt4643)) {
			local5++;
		}
		if (arg0.method4327(Static308.anInt5728)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "([I[IILclient!jc;[I)V")
	public static void method4383(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class49_Sub2_Sub2_Sub2 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) int local18 = arg0[local12];
			@Pc(22) int local22 = arg1[local12];
			@Pc(26) int local26 = arg3[local12];
			@Pc(28) int local28 = 0;
			while (local22 != 0 && arg2.aClass166Array3.length > local28) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg2.aClass166Array3[local28] = null;
					} else {
						@Pc(50) Class199 local50 = Static182.aClass218_1.method5221(local18);
						@Pc(53) int local53 = local50.anInt5744;
						@Pc(58) Class166 local58 = arg2.aClass166Array3[local28];
						if (local58 != null) {
							if (local18 == local58.anInt4909) {
								if (local53 == 0) {
									local58 = arg2.aClass166Array3[local28] = null;
								} else if (local53 == 1) {
									local58.anInt4905 = 1;
									local58.anInt4903 = 0;
									local58.anInt4904 = 0;
									local58.anInt4907 = 0;
									local58.anInt4911 = local26;
									Static381.method5839(arg2.anInt7141, false, local50, 0, arg2.aByte98, arg2.anInt7137);
								} else if (local53 == 2) {
									local58.anInt4907 = 0;
								}
							} else if (local50.anInt5750 >= Static182.aClass218_1.method5221(local58.anInt4909).anInt5750) {
								local58 = arg2.aClass166Array3[local28] = null;
							}
						}
						if (local58 == null) {
							local58 = arg2.aClass166Array3[local28] = new Class166();
							local58.anInt4909 = local18;
							local58.anInt4911 = local26;
							local58.anInt4905 = 1;
							local58.anInt4907 = 0;
							local58.anInt4904 = 0;
							local58.anInt4903 = 0;
							Static381.method5839(arg2.anInt7141, false, local50, 0, arg2.aByte98, arg2.anInt7137);
						}
					}
				}
				local28++;
				local22 >>>= 0x1;
			}
		}
	}
}
