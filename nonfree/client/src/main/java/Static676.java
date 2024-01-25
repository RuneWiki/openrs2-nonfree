import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static676 {

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "Lclient!uq;")
	public static Class362 aClass362_155;

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "Z")
	public static boolean aBoolean756;

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_162 = new Class171(27, 6);

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "([Lclient!fq;II)V")
	public static void method9002(@OriginalArg(0) Class34_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class34_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt9617;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt9617 > local27 + (local29 & 0x1)) {
				@Pc(44) Class34_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method9002(arg0, arg1, local10 - 1);
		method9002(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)I")
	public static int method9003(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IB[Lclient!ofa;)V")
	public static void method9004(@OriginalArg(0) int arg0, @OriginalArg(2) Class265[] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg1.length; local8++) {
			@Pc(14) Class265 local14 = arg1[local8];
			if (local14 != null && arg0 == local14.anInt6985 && !Static86.method1367(local14)) {
				if (local14.anInt6967 == 0) {
					method9004(local14.anInt7032, arg1);
					if (local14.aClass265Array4 != null) {
						method9004(local14.anInt7032, local14.aClass265Array4);
					}
					@Pc(55) Class3_Sub25 local55 = (Class3_Sub25) Static513.aClass333_33.method7489((long) local14.anInt7032);
					if (local55 != null) {
						Static340.method4972(local55.anInt3959);
					}
				}
				if (local14.anInt6967 == 6 && local14.anInt7026 != -1) {
					@Pc(77) Class239 local77 = Static13.aClass213_1.method5008(local14.anInt7026);
					if (local77 != null) {
						local14.anInt7041 += Static281.anInt4774;
						@Pc(88) int local88 = local14.anInt6979;
						while (local14.anInt7041 > local77.anIntArray337[local14.anInt6979]) {
							local14.anInt7041 -= local77.anIntArray337[local14.anInt6979];
							local14.anInt6979++;
							if (local14.anInt6979 >= local77.anIntArray339.length) {
								local14.anInt6979 -= local77.anInt6414;
								if (local14.anInt6979 < 0 || local77.anIntArray339.length <= local14.anInt6979) {
									local14.anInt6979 = 0;
								}
							}
							local14.anInt7022 = local14.anInt6979 + 1;
							if (local14.anInt7022 >= local77.anIntArray339.length) {
								local14.anInt7022 -= local77.anInt6414;
								if (local14.anInt7022 < 0 || local14.anInt7022 >= local77.anIntArray339.length) {
									local14.anInt7022 = -1;
								}
							}
							Static218.method3194(local14);
						}
						if (local88 != local14.anInt6979) {
							Static367.method9033(local14.anInt6979, local77);
						}
					}
				}
			}
		}
	}
}
