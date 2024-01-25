import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class14_Sub1_Sub11 extends Class14_Sub1 {

	@OriginalMember(owner = "client!fg", name = "F", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!fg", name = "I", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!fg", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
	private int anInt3113 = 0;

	@OriginalMember(owner = "client!fg", name = "S", descriptor = "[S")
	private final short[] aShortArray47 = new short[257];

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub11() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt3113 = arg0.method5866();
		this.anIntArrayArray18 = new int[arg0.method5866()][2];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray18.length; local21++) {
			this.anIntArrayArray18[local21][0] = arg0.method5900();
			this.anIntArrayArray18[local21][1] = arg0.method5900();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
	@Override
	public void method8899() {
		if (this.anIntArrayArray18 == null) {
			this.anIntArrayArray18 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray18.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3113 == 2) {
			this.method2546();
		}
		Static277.method4028();
		this.method2545();
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V")
	private void method2545() {
		@Pc(11) int local11 = this.anInt3113;
		@Pc(31) int local31;
		@Pc(29) int local29;
		@Pc(62) int[] local62;
		@Pc(67) int[] local67;
		@Pc(76) int local76;
		@Pc(80) int local80;
		@Pc(84) int local84;
		@Pc(93) int local93;
		if (local11 == 2) {
			for (local11 = 0; local11 < 257; local11++) {
				local29 = local11 << 4;
				for (local31 = 1; local31 < this.anIntArrayArray18.length - 1 && this.anIntArrayArray18[local31][0] <= local29; local31++) {
				}
				local62 = this.anIntArrayArray18[local31 - 1];
				local67 = this.anIntArrayArray18[local31];
				local76 = this.method2548(local31 - 2)[1];
				local80 = local62[1];
				local84 = local67[1];
				local93 = this.method2548(local31 + 1)[1];
				@Pc(111) int local111 = (local29 - local62[0] << 12) / (local67[0] - local62[0]);
				@Pc(117) int local117 = local111 * local111 >> 12;
				@Pc(126) int local126 = local93 + local80 - local76 - local84;
				@Pc(134) int local134 = local76 - local126 - local80;
				@Pc(139) int local139 = local84 - local76;
				@Pc(151) int local151 = local117 * (local111 * local126 >> 12) >> 12;
				@Pc(157) int local157 = local117 * local134 >> 12;
				@Pc(163) int local163 = local139 * local111 >> 12;
				@Pc(172) int local172 = local151 + local157 + local163 + local80;
				if (local172 <= -32768) {
					local172 = -32767;
				}
				if (local172 >= 32768) {
					local172 = 32767;
				}
				this.aShortArray47[local11] = (short) local172;
			}
		} else if (local11 == 1) {
			for (local11 = 0; local11 < 257; local11++) {
				local29 = local11 << 4;
				for (local31 = 1; local31 < this.anIntArrayArray18.length - 1 && local29 >= this.anIntArrayArray18[local31][0]; local31++) {
				}
				local62 = this.anIntArrayArray18[local31 - 1];
				local67 = this.anIntArrayArray18[local31];
				local76 = (local29 - local62[0] << 12) / (local67[0] - local62[0]);
				local80 = 4096 - Static646.anIntArray808[local76 >> 5 & 0xFF] >> 1;
				local84 = 4096 - local80;
				local93 = local62[1] * local84 + local80 * local67[1] >> 12;
				if (local93 <= -32768) {
					local93 = -32767;
				}
				if (local93 >= 32768) {
					local93 = 32767;
				}
				this.aShortArray47[local11] = (short) local93;
			}
		} else {
			for (local11 = 0; local11 < 257; local11++) {
				local29 = local11 << 4;
				for (local31 = 1; local31 < this.anIntArrayArray18.length - 1 && local29 >= this.anIntArrayArray18[local31][0]; local31++) {
				}
				local62 = this.anIntArrayArray18[local31 - 1];
				local67 = this.anIntArrayArray18[local31];
				local76 = (local29 - local62[0] << 12) / (local67[0] - local62[0]);
				local80 = 4096 - local76;
				local84 = local67[1] * local76 + local62[1] * local80 >> 12;
				if (local84 <= -32768) {
					local84 = -32767;
				}
				if (local84 >= 32768) {
					local84 = 32767;
				}
				this.aShortArray47[local11] = (short) local84;
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			@Pc(27) int[] local27 = this.method8897(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static371.anInt6835; local29++) {
				@Pc(37) int local37 = local27[local29] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local17[local29] = this.aShortArray47[local37];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V")
	private void method2546() {
		@Pc(8) int[] local8 = this.anIntArrayArray18[0];
		@Pc(13) int[] local13 = this.anIntArrayArray18[1];
		@Pc(22) int[] local22 = this.anIntArrayArray18[this.anIntArrayArray18.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray18[this.anIntArrayArray18.length - 1];
		this.anIntArray251 = new int[] { local22[0] + local22[0] - local39[0], local22[1] + -local39[1] + local22[1] };
		this.anIntArray252 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + (local8[1] - local13[1]) };
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(BI)[I")
	private int[] method2548(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray252;
		} else if (this.anIntArrayArray18.length <= arg0) {
			return this.anIntArray251;
		} else {
			return this.anIntArrayArray18[arg0];
		}
	}
}
