import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hea")
public final class Class2_Sub6_Sub14 extends Class2_Sub6 {

	@OriginalMember(owner = "client!hea", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!hea", name = "M", descriptor = "[I")
	private int[] anIntArray225;

	@OriginalMember(owner = "client!hea", name = "ab", descriptor = "[I")
	private int[] anIntArray226;

	@OriginalMember(owner = "client!hea", name = "Q", descriptor = "I")
	private int anInt3489 = 0;

	@OriginalMember(owner = "client!hea", name = "U", descriptor = "[S")
	private final short[] aShortArray43 = new short[257];

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub14() {
		super(1, true);
	}

	@OriginalMember(owner = "client!hea", name = "h", descriptor = "(I)V")
	private void method2913() {
		@Pc(12) int local12 = this.anInt3489;
		@Pc(30) int local30;
		@Pc(28) int local28;
		@Pc(65) int[] local65;
		@Pc(70) int[] local70;
		@Pc(79) int local79;
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(96) int local96;
		if (local12 == 2) {
			for (local12 = 0; local12 < 257; local12++) {
				local28 = local12 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray10.length - 1 && local28 >= this.anIntArrayArray10[local30][0]; local30++) {
				}
				local65 = this.anIntArrayArray10[local30 - 1];
				local70 = this.anIntArrayArray10[local30];
				local79 = this.method2916(local30 - 2)[1];
				local83 = local65[1];
				local87 = local70[1];
				local96 = this.method2916(local30 + 1)[1];
				@Pc(113) int local113 = (local28 - local65[0] << 12) / (local70[0] - local65[0]);
				@Pc(119) int local119 = local113 * local113 >> 12;
				@Pc(130) int local130 = local96 + local83 - local79 - local87;
				@Pc(138) int local138 = local79 - local130 - local83;
				@Pc(143) int local143 = local87 - local79;
				@Pc(155) int local155 = local119 * (local130 * local113 >> 12) >> 12;
				@Pc(161) int local161 = local119 * local138 >> 12;
				@Pc(167) int local167 = local143 * local113 >> 12;
				@Pc(176) int local176 = local83 + local155 + local161 + local167;
				if (local176 <= -32768) {
					local176 = -32767;
				}
				if (local176 >= 32768) {
					local176 = 32767;
				}
				this.aShortArray43[local12] = (short) local176;
			}
		} else if (local12 == 1) {
			for (local12 = 0; local12 < 257; local12++) {
				local28 = local12 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray10.length - 1 && local28 >= this.anIntArrayArray10[local30][0]; local30++) {
				}
				local65 = this.anIntArrayArray10[local30 - 1];
				local70 = this.anIntArrayArray10[local30];
				local79 = (local28 - local65[0] << 12) / (local70[0] - local65[0]);
				local83 = 4096 - Static111.anIntArray141[local79 >> 5 & 0xFF] >> 1;
				local87 = 4096 - local83;
				local96 = local87 * local65[1] + local70[1] * local83 >> 12;
				if (local96 <= -32768) {
					local96 = -32767;
				}
				if (local96 >= 32768) {
					local96 = 32767;
				}
				this.aShortArray43[local12] = (short) local96;
			}
		} else {
			for (local12 = 0; local12 < 257; local12++) {
				local28 = local12 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray10.length - 1 && this.anIntArrayArray10[local30][0] <= local28; local30++) {
				}
				local65 = this.anIntArrayArray10[local30 - 1];
				local70 = this.anIntArrayArray10[local30];
				local79 = (local28 - local65[0] << 12) / (local70[0] - local65[0]);
				local83 = 4096 - local79;
				local87 = local70[1] * local79 + local83 * local65[1] >> 12;
				if (local87 <= -32768) {
					local87 = -32767;
				}
				if (local87 >= 32768) {
					local87 = 32767;
				}
				this.aShortArray43[local12] = (short) local87;
			}
		}
	}

	@OriginalMember(owner = "client!hea", name = "d", descriptor = "(B)V")
	private void method2915() {
		@Pc(8) int[] local8 = this.anIntArrayArray10[0];
		@Pc(13) int[] local13 = this.anIntArrayArray10[1];
		@Pc(22) int[] local22 = this.anIntArrayArray10[this.anIntArrayArray10.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray10[this.anIntArrayArray10.length - 1];
		this.anIntArray226 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + -local13[1] + local8[1] };
		this.anIntArray225 = new int[] { local22[0] + local22[0] - local31[0], local22[1] + -local31[1] + local22[1] };
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IZ)[I")
	private int[] method2916(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray226;
		} else if (this.anIntArrayArray10.length <= arg0) {
			return this.anIntArray225;
		} else {
			return this.anIntArrayArray10[arg0];
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt3489 = arg1.method8547();
		this.anIntArrayArray10 = new int[arg1.method8547()][2];
		for (@Pc(26) int local26 = 0; local26 < this.anIntArrayArray10.length; local26++) {
			this.anIntArrayArray10[local26][0] = arg1.method8546();
			this.anIntArrayArray10[local26][1] = arg1.method8546();
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			@Pc(27) int[] local27 = this.method8461(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static51.anInt1085; local29++) {
				@Pc(37) int local37 = local27[local29] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local17[local29] = this.aShortArray43[local37];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(B)V")
	@Override
	public void method8462() {
		if (this.anIntArrayArray10 == null) {
			this.anIntArrayArray10 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray10.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3489 == 2) {
			this.method2915();
		}
		Static212.method2948();
		this.method2913();
	}
}
