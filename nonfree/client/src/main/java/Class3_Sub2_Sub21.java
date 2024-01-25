import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class3_Sub2_Sub21 extends Class3_Sub2 {

	@OriginalMember(owner = "client!me", name = "M", descriptor = "[I")
	private int[] anIntArray296;

	@OriginalMember(owner = "client!me", name = "Q", descriptor = "[I")
	private int[] anIntArray297;

	@OriginalMember(owner = "client!me", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!me", name = "K", descriptor = "I")
	private int anInt4658 = 0;

	@OriginalMember(owner = "client!me", name = "P", descriptor = "[S")
	private final short[] aShortArray79 = new short[257];

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub21() {
		super(1, true);
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
	private void method3683() {
		@Pc(8) int local8 = this.anInt4658;
		@Pc(30) int local30;
		@Pc(28) int local28;
		@Pc(61) int[] local61;
		@Pc(66) int[] local66;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(83) int local83;
		@Pc(92) int local92;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local28 = local8 << 4;
				for (local30 = 1; this.anIntArrayArray29.length - 1 > local30 && local28 >= this.anIntArrayArray29[local30][0]; local30++) {
				}
				local61 = this.anIntArrayArray29[local30 - 1];
				local66 = this.anIntArrayArray29[local30];
				local75 = this.method3684(local30 - 2)[1];
				local79 = local61[1];
				local83 = local66[1];
				local92 = this.method3684(local30 + 1)[1];
				@Pc(110) int local110 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				@Pc(116) int local116 = local110 * local110 >> 12;
				@Pc(126) int local126 = local92 + local79 - local75 - local83;
				@Pc(133) int local133 = local75 - local126 - local79;
				@Pc(138) int local138 = local83 - local75;
				@Pc(150) int local150 = (local110 * local126 >> 12) * local116 >> 12;
				@Pc(156) int local156 = local133 * local116 >> 12;
				@Pc(162) int local162 = local138 * local110 >> 12;
				@Pc(170) int local170 = local79 + local150 + local156 + local162;
				if (local170 <= -32768) {
					local170 = -32767;
				}
				if (local170 >= 32768) {
					local170 = 32767;
				}
				this.aShortArray79[local8] = (short) local170;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local28 = local8 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray29.length - 1 && this.anIntArrayArray29[local30][0] <= local28; local30++) {
				}
				local61 = this.anIntArrayArray29[local30 - 1];
				local66 = this.anIntArrayArray29[local30];
				local75 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - Static346.anIntArray387[local75 >> 5 & 0xFF] >> 1;
				local83 = 4096 - local79;
				local92 = local79 * local66[1] + local83 * local61[1] >> 12;
				if (local92 <= -32768) {
					local92 = -32767;
				}
				if (local92 >= 32768) {
					local92 = 32767;
				}
				this.aShortArray79[local8] = (short) local92;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local28 = local8 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray29.length - 1 && local28 >= this.anIntArrayArray29[local30][0]; local30++) {
				}
				local61 = this.anIntArrayArray29[local30 - 1];
				local66 = this.anIntArrayArray29[local30];
				local75 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - local75;
				local83 = local75 * local66[1] + local61[1] * local79 >> 12;
				if (local83 <= -32768) {
					local83 = -32767;
				}
				if (local83 >= 32768) {
					local83 = 32767;
				}
				this.aShortArray79[local8] = (short) local83;
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt4658 = arg0.method2582();
		this.anIntArrayArray29 = new int[arg0.method2582()][2];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArrayArray29.length; local17++) {
			this.anIntArrayArray29[local17][0] = arg0.method2588();
			this.anIntArrayArray29[local17][1] = arg0.method2588();
		}
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V")
	@Override
	public void method5898() {
		if (this.anIntArrayArray29 == null) {
			this.anIntArrayArray29 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray29.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt4658 == 2) {
			this.method3686();
		}
		Static437.method5734();
		this.method3683();
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(II)[I")
	private int[] method3684(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray296;
		} else if (arg0 >= this.anIntArrayArray29.length) {
			return this.anIntArray297;
		} else {
			return this.anIntArrayArray29[arg0];
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			@Pc(21) int[] local21 = this.method5894(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static406.anInt6694; local23++) {
				@Pc(31) int local31 = local21[local23] >> 4;
				if (local31 < 0) {
					local31 = 0;
				}
				if (local31 > 256) {
					local31 = 256;
				}
				local11[local23] = this.aShortArray79[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!me", name = "g", descriptor = "(I)V")
	private void method3686() {
		@Pc(14) int[] local14 = this.anIntArrayArray29[0];
		@Pc(19) int[] local19 = this.anIntArrayArray29[1];
		@Pc(28) int[] local28 = this.anIntArrayArray29[this.anIntArrayArray29.length - 2];
		@Pc(37) int[] local37 = this.anIntArrayArray29[this.anIntArrayArray29.length - 1];
		this.anIntArray296 = new int[] { local14[0] + local14[0] - local19[0], local14[1] + -local19[1] + local14[1] };
		this.anIntArray297 = new int[] { local28[0] + local28[0] - local37[0], -local37[1] + local28[1] + local28[1] };
	}
}
