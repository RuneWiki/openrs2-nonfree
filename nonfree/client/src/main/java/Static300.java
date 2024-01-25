import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!kq", name = "x", descriptor = "Lclient!ql;")
	public static Class278 aClass278_2;

	@OriginalMember(owner = "client!kq", name = "C", descriptor = "F")
	public static float aFloat177;

	@OriginalMember(owner = "client!kq", name = "D", descriptor = "Lclient!et;")
	public static Class3_Sub1_Sub4 aClass3_Sub1_Sub4_3;

	@OriginalMember(owner = "client!kq", name = "E", descriptor = "J")
	public static long aLong144;

	@OriginalMember(owner = "client!kq", name = "r", descriptor = "Lclient!em;")
	public static final Class82 aClass82_10 = new Class82(1);

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "([Lclient!mb;II)V")
	public static void method5149(@OriginalArg(0) Class2_Sub3[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class2_Sub3 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10423;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10423 > local27 + (local29 & 0x1)) {
				@Pc(44) Class2_Sub3 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method5149(arg0, arg1, local10 - 1);
		method5149(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BI)Lclient!jt;")
	public static Class167 method5150(@OriginalArg(1) int arg0) {
		@Pc(8) Class167[] local8 = Static177.method3607();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class167 local16 = local8[local10];
			if (local16.anInt5826 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZ)V")
	public static void method5151() {
		Static110.aClass181_22 = null;
		Static370.anInt7046 = 2;
		Static369.anInt7034 = -1;
		Static218.aClass3_Sub7_Sub5_1 = null;
		Static627.anInt10354 = -1;
		Static618.aBoolean861 = false;
		Static565.anInt9608 = 1;
		Static458.anInt8332 = 0;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BII[FIII)V")
	public static void method5153(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 > 0 && !Static474.method7016(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static474.method7016(arg0)) {
			@Pc(34) int local34 = Static393.method2874(6408);
			@Pc(36) int local36 = 0;
			@Pc(47) int local47 = arg0 > arg4 ? arg4 : arg0;
			@Pc(51) int local51 = arg4 >> 1;
			@Pc(55) int local55 = arg0 >> 1;
			@Pc(57) float[] local57 = arg2;
			@Pc(64) float[] local64 = new float[local51 * local55 * local34];
			while (true) {
				OpenGL.glTexImage2Df(3553, local36, 34842, arg4, arg0, 0, 6408, 5126, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(88) int local88 = local34 * arg4;
				for (@Pc(90) int local90 = 0; local90 < local34; local90++) {
					@Pc(94) int local94 = local90;
					@Pc(96) int local96 = local90;
					@Pc(100) int local100 = local88 + local90;
					for (@Pc(102) int local102 = 0; local102 < local55; local102++) {
						for (@Pc(106) int local106 = 0; local106 < local51; local106++) {
							@Pc(112) float local112 = local57[local96];
							local96 += local34;
							@Pc(122) float local122 = local112 + local57[local96];
							@Pc(128) float local128 = local122 + local57[local100];
							local96 += local34;
							local100 += local34;
							@Pc(142) float local142 = local128 + local57[local100];
							local100 += local34;
							local64[local94] = local142 * 0.25F;
							local94 += local34;
						}
						local96 += local88;
						local100 += local88;
					}
				}
				@Pc(182) float[] local182 = local64;
				local64 = local57;
				arg0 = local55;
				arg4 = local51;
				local57 = local182;
				local51 >>= 0x1;
				local55 >>= 0x1;
				local36++;
				local47 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!kha;I)V")
	public static void method5155(@OriginalArg(0) Class181 arg0) {
		Static501.aClass181_120 = arg0;
	}
}
