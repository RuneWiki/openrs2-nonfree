import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class8_Sub3_Sub26 extends Class8_Sub3 {

	@OriginalMember(owner = "client!o", name = "ab", descriptor = "[I")
	public static int[] anIntArray265 = new int[256];

	@OriginalMember(owner = "client!o", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!o", name = "bb", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!o", name = "cb", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!o", name = "Y", descriptor = "[S")
	private short[] aShortArray29 = new short[257];

	@OriginalMember(owner = "client!o", name = "P", descriptor = "I")
	private int anInt3560 = 0;

	static {
		for (@Pc(41) int local41 = 0; local41 < 256; local41++) {
			@Pc(46) int local46 = local41;
			for (@Pc(48) int local48 = 0; local48 < 8; local48++) {
				if ((local46 & 0x1) == 1) {
					local46 = local46 >>> 1 ^ 0xEDB88320;
				} else {
					local46 >>>= 0x1;
				}
			}
			anIntArray265[local41] = local46;
		}
	}

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub26() {
		super(1, true);
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
	@Override
	public void method4220() {
		if (this.anIntArrayArray20 == null) {
			this.anIntArrayArray20 = new int[][] { { 0, 0 }, { 4096, 4096 } };
		}
		if (this.anIntArrayArray20.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3560 == 2) {
			this.method2778();
		}
		Static111.method1828();
		this.method2781();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt3560 = arg1.method2334();
		this.anIntArrayArray20 = new int[arg1.method2334()][2];
		for (@Pc(27) int local27 = 0; local27 < this.anIntArrayArray20.length; local27++) {
			this.anIntArrayArray20[local27][0] = arg1.method2375();
			this.anIntArrayArray20[local27][1] = arg1.method2375();
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(II)[I")
	private int[] method2776(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray266;
		} else if (this.anIntArrayArray20.length <= arg0) {
			return this.anIntArray267;
		} else {
			return this.anIntArrayArray20[arg0];
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			@Pc(28) int[] local28 = this.method4230(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static239.anInt4789; local30++) {
				@Pc(43) int local43 = local28[local30] >> 4;
				if (local43 < 0) {
					local43 = 0;
				}
				if (local43 > 256) {
					local43 = 256;
				}
				local17[local30] = this.aShortArray29[local43];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!o", name = "f", descriptor = "(I)V")
	private void method2778() {
		@Pc(8) int[] local8 = this.anIntArrayArray20[1];
		@Pc(13) int[] local13 = this.anIntArrayArray20[0];
		@Pc(25) int[] local25 = this.anIntArrayArray20[this.anIntArrayArray20.length - 1];
		@Pc(34) int[] local34 = this.anIntArrayArray20[this.anIntArrayArray20.length - 2];
		this.anIntArray266 = new int[] { local13[0] + local13[0] - local8[0], -local8[1] + local13[1] + local13[1] };
		this.anIntArray267 = new int[] { local34[0] + local34[0] - local25[0], local34[1] + -local25[1] + local34[1] };
	}

	@OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V")
	private void method2781() {
		@Pc(14) int local14 = this.anInt3560;
		@Pc(39) int local39;
		@Pc(37) int local37;
		@Pc(70) int[] local70;
		@Pc(75) int[] local75;
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(101) int local101;
		if (local14 == 2) {
			for (local14 = 0; local14 < 257; local14++) {
				local37 = local14 << 4;
				for (local39 = 1; this.anIntArrayArray20.length - 1 > local39 && local37 >= this.anIntArrayArray20[local39][0]; local39++) {
				}
				local70 = this.anIntArrayArray20[local39 - 1];
				local75 = this.anIntArrayArray20[local39];
				local84 = this.method2776(local39 - 2)[1];
				local88 = local70[1];
				local92 = local75[1];
				local101 = this.method2776(local39 + 1)[1];
				@Pc(118) int local118 = (local37 - local70[0] << 12) / (local75[0] - local70[0]);
				@Pc(128) int local128 = local88 + local101 - local92 - local84;
				@Pc(134) int local134 = local118 * local118 >> 12;
				@Pc(142) int local142 = local84 - local128 - local88;
				@Pc(152) int local152 = (local128 * local118 >> 12) * local134 >> 12;
				@Pc(157) int local157 = local92 - local84;
				@Pc(165) int local165 = local134 * local142 >> 12;
				@Pc(171) int local171 = local157 * local118 >> 12;
				@Pc(181) int local181 = local152 + local165 + local171 + local88;
				if (local181 <= -32768) {
					local181 = -32767;
				}
				if (local181 >= 32768) {
					local181 = 32767;
				}
				this.aShortArray29[local14] = (short) local181;
			}
		} else if (local14 == 1) {
			for (local14 = 0; local14 < 257; local14++) {
				local37 = local14 << 4;
				for (local39 = 1; this.anIntArrayArray20.length - 1 > local39 && this.anIntArrayArray20[local39][0] <= local37; local39++) {
				}
				local70 = this.anIntArrayArray20[local39 - 1];
				local75 = this.anIntArrayArray20[local39];
				local84 = (local37 - local70[0] << 12) / (local75[0] - local70[0]);
				local88 = 4096 - Static15.anIntArray18[local84 >> 5 & 0xFF] >> 1;
				local92 = 4096 - local88;
				local101 = local70[1] * local92 + local75[1] * local88 >> 12;
				if (local101 <= -32768) {
					local101 = -32767;
				}
				if (local101 >= 32768) {
					local101 = 32767;
				}
				this.aShortArray29[local14] = (short) local101;
			}
		} else {
			for (local14 = 0; local14 < 257; local14++) {
				local37 = local14 << 4;
				for (local39 = 1; this.anIntArrayArray20.length - 1 > local39 && this.anIntArrayArray20[local39][0] <= local37; local39++) {
				}
				local70 = this.anIntArrayArray20[local39 - 1];
				local75 = this.anIntArrayArray20[local39];
				local84 = (local37 - local70[0] << 12) / (local75[0] - local70[0]);
				local88 = 4096 - local84;
				local92 = local70[1] * local88 + local75[1] * local84 >> 12;
				if (local92 <= -32768) {
					local92 = -32767;
				}
				if (local92 >= 32768) {
					local92 = 32767;
				}
				this.aShortArray29[local14] = (short) local92;
			}
		}
	}
}
