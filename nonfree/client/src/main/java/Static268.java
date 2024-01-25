import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "[I")
	public static final int[] anIntArray274 = new int[16];

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "[F")
	public static final float[] aFloatArray48 = new float[2];

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!em;IIILclient!ih;Lclient!fw;IZ)V")
	public static void method4558(@OriginalArg(0) Class60_Sub1_Sub1_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class60_Sub1_Sub1_Sub3_Sub2 arg4, @OriginalArg(5) Class125 arg5, @OriginalArg(6) int arg6) {
		@Pc(14) Class6_Sub35 local14 = new Class6_Sub35();
		local14.anInt6192 = arg6;
		local14.anInt6190 = arg1 << 9;
		local14.anInt6189 = arg3 << 9;
		if (arg5 != null) {
			local14.aClass125_1 = arg5;
			@Pc(35) int local35 = arg5.anInt3614;
			@Pc(38) int local38 = arg5.lb;
			if (arg2 == 1 || arg2 == 3) {
				local38 = arg5.anInt3614;
				local35 = arg5.lb;
			}
			local14.anInt6187 = arg5.anInt3626;
			local14.anInt6179 = arg5.anInt3606;
			local14.anInt6197 = arg5.anInt3584;
			local14.anInt6184 = arg5.anInt3602 << 9;
			local14.anInt6188 = local35 + arg3 << 9;
			local14.anIntArray364 = arg5.anIntArray195;
			local14.anInt6199 = arg5.anInt3604;
			local14.aBoolean456 = arg5.aBoolean287;
			local14.anInt6191 = arg5.anInt3617;
			local14.aBoolean458 = arg5.aBoolean284;
			local14.anInt6185 = arg5.anInt3575;
			local14.anInt6180 = arg5.anInt3616 << 9;
			local14.anInt6178 = arg1 + local38 << 9;
			if (arg5.anIntArray198 != null) {
				local14.aBoolean457 = true;
				local14.method5556();
			}
			if (local14.anIntArray364 != null) {
				local14.anInt6193 = (int) (Math.random() * (double) (local14.anInt6191 - local14.anInt6197)) + local14.anInt6197;
			}
			Static549.aClass340_69.method8131(local14);
		} else if (arg4 != null) {
			local14.aClass60_Sub1_Sub1_Sub3_Sub2_2 = arg4;
			@Pc(225) Class294 local225 = arg4.aClass294_1;
			if (local225.anIntArray511 != null) {
				local14.aBoolean457 = true;
				local225 = local225.method7168(Static303.aClass55_2);
			}
			if (local225 != null) {
				local14.anInt6178 = local225.anInt8169 + arg1 << 9;
				local14.anInt6188 = local225.anInt8169 + arg3 << 9;
				local14.anInt6179 = Static46.method559(arg4);
				local14.anInt6180 = local225.anInt8161 << 9;
				local14.anInt6185 = local225.anInt8165;
				local14.aBoolean456 = local225.aBoolean618;
				local14.anInt6199 = local225.anInt8156;
				local14.anInt6184 = local225.anInt8148 << 9;
				local14.anInt6187 = local225.anInt8141;
			}
			Static81.aClass340_3.method8131(local14);
		} else if (arg0 != null) {
			local14.aClass60_Sub1_Sub1_Sub3_Sub1_2 = arg0;
			local14.anInt6188 = arg3 + arg0.method4424((byte) -28) << 9;
			local14.anInt6178 = arg0.method4424((byte) -28) + arg1 << 9;
			local14.anInt6179 = Static334.method5179(arg0);
			local14.anInt6184 = arg0.anInt2862 << 9;
			local14.anInt6199 = 256;
			local14.anInt6185 = arg0.anInt2844;
			local14.anInt6187 = 256;
			local14.anInt6180 = 0;
			local14.aBoolean456 = arg0.aBoolean231;
			Static635.aClass74_71.method1399(local14, (long) arg0.anInt4845);
			return;
		}
	}
}
