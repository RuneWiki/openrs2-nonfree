import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!eq", name = "I", descriptor = "Lclient!da;")
	public static Class72 aClass72_6;

	@OriginalMember(owner = "client!eq", name = "J", descriptor = "[[I")
	public static final int[][] anIntArrayArray17 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!eq", name = "N", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_91 = new Class196(41, -1);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BI[FIIII)V")
	public static void method2100(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 > 0 && !Static384.method5636(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static384.method5636(arg5)) {
			@Pc(29) int local29 = Static135.method2040(6408);
			@Pc(31) int local31 = 0;
			@Pc(38) int local38 = arg5 > arg4 ? arg4 : arg5;
			@Pc(42) int local42 = arg4 >> 1;
			@Pc(51) int local51 = arg5 >> 1;
			@Pc(53) float[] local53 = arg1;
			@Pc(60) float[] local60 = new float[local51 * local42 * local29];
			while (true) {
				OpenGL.glTexImage2Df(3553, local31, 34842, arg4, arg5, 0, 6408, 5126, local53, 0);
				if (local38 <= 1) {
					return;
				}
				@Pc(78) int local78 = arg4 * local29;
				for (@Pc(80) int local80 = 0; local80 < local29; local80++) {
					@Pc(83) int local83 = local80;
					@Pc(85) int local85 = local80;
					@Pc(90) int local90 = local80 + local78;
					for (@Pc(92) int local92 = 0; local92 < local51; local92++) {
						for (@Pc(95) int local95 = 0; local95 < local42; local95++) {
							@Pc(100) float local100 = local53[local85];
							local85 += local29;
							@Pc(110) float local110 = local100 + local53[local85];
							local85 += local29;
							@Pc(120) float local120 = local110 + local53[local90];
							local90 += local29;
							@Pc(130) float local130 = local120 + local53[local90];
							local90 += local29;
							local60[local83] = local130 * 0.25F;
							local83 += local29;
						}
						local85 += local78;
						local90 += local78;
					}
				}
				@Pc(170) float[] local170 = local60;
				local60 = local53;
				local53 = local170;
				arg5 = local51;
				arg4 = local42;
				local38 >>= 0x1;
				local51 >>= 0x1;
				local31++;
				local42 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!rv;I)Lclient!tp;")
	public static Class343 method2101(@OriginalArg(0) Class5_Sub15 arg0) {
		@Pc(7) String local7 = arg0.method3661();
		@Pc(14) Class112 local14 = Static17.method265()[arg0.method3642()];
		@Pc(21) Class4 local21 = Static49.method727()[arg0.method3642()];
		@Pc(25) int local25 = arg0.method3638();
		@Pc(29) int local29 = arg0.method3638();
		@Pc(39) int local39 = arg0.method3642();
		@Pc(43) int local43 = arg0.method3642();
		@Pc(47) int local47 = arg0.method3642();
		@Pc(51) int local51 = arg0.method3698();
		@Pc(55) int local55 = arg0.method3698();
		@Pc(59) int local59 = arg0.method3671();
		@Pc(63) int local63 = arg0.method3671();
		@Pc(67) int local67 = arg0.method3671();
		return new Class343(local7, local14, local21, local25, local29, local39, local43, local47, local51, local55, local59, local63, local67);
	}

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "(I)Lclient!ib;")
	public static Class160_Sub1 method2103() {
		return Static375.anInt6552 < Static475.aClass160_Sub1Array2.length ? Static475.aClass160_Sub1Array2[Static375.anInt6552++] : null;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILclient!kj;BII)Ljava/awt/Frame;")
	public static Frame method2105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class202 arg2, @OriginalArg(5) int arg3) {
		if (!arg2.method4742()) {
			return null;
		}
		@Pc(15) Class96[] local15 = Static296.method4059(arg2);
		if (local15 == null) {
			return null;
		}
		@Pc(21) boolean local21 = false;
		for (@Pc(23) int local23 = 0; local23 < local15.length; local23++) {
			if (arg1 == local15[local23].anInt2225 && arg0 == local15[local23].anInt2224 && (!local21 || local15[local23].anInt2223 > arg3)) {
				local21 = true;
				arg3 = local15[local23].anInt2223;
			}
		}
		if (!local21) {
			return null;
		}
		@Pc(91) Class297 local91 = arg2.method4741(arg0, arg3, arg1);
		while (local91.anInt8459 == 0) {
			Static127.method1985(10L);
		}
		@Pc(110) Frame local110 = (Frame) local91.anObject15;
		if (local110 == null) {
			return null;
		} else if (local91.anInt8459 == 2) {
			Static419.method6179(arg2, local110);
			return null;
		} else {
			return local110;
		}
	}
}
