import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class6_Sub8_Sub11 extends Class6_Sub8 {

	@OriginalMember(owner = "client!hr", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!hr", name = "D", descriptor = "[I")
	private int[] anIntArray234;

	@OriginalMember(owner = "client!hr", name = "O", descriptor = "[I")
	private int[] anIntArray236;

	@OriginalMember(owner = "client!hr", name = "L", descriptor = "I")
	private int anInt4564 = 0;

	@OriginalMember(owner = "client!hr", name = "J", descriptor = "[S")
	private final short[] aShortArray48 = new short[257];

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub11() {
		super(1, true);
	}

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "(I)V")
	private void method4174() {
		@Pc(8) int local8 = this.anInt4564;
		@Pc(34) int local34;
		@Pc(32) int local32;
		@Pc(69) int[] local69;
		@Pc(74) int[] local74;
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(91) int local91;
		@Pc(100) int local100;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local32 = local8 << 4;
				for (local34 = 1; this.anIntArrayArray23.length - 1 > local34 && local32 >= this.anIntArrayArray23[local34][0]; local34++) {
				}
				local69 = this.anIntArrayArray23[local34 - 1];
				local74 = this.anIntArrayArray23[local34];
				local83 = this.method4175(local34 - 2)[1];
				local87 = local69[1];
				local91 = local74[1];
				local100 = this.method4175(local34 + 1)[1];
				@Pc(118) int local118 = (local32 - local69[0] << 12) / (local74[0] - local69[0]);
				@Pc(124) int local124 = local118 * local118 >> 12;
				@Pc(134) int local134 = local100 + local87 - local83 - local91;
				@Pc(142) int local142 = local83 - local87 - local134;
				@Pc(147) int local147 = local91 - local83;
				@Pc(159) int local159 = local124 * (local134 * local118 >> 12) >> 12;
				@Pc(165) int local165 = local124 * local142 >> 12;
				@Pc(171) int local171 = local118 * local147 >> 12;
				@Pc(179) int local179 = local171 + local165 + local159 + local87;
				if (local179 <= -32768) {
					local179 = -32767;
				}
				if (local179 >= 32768) {
					local179 = 32767;
				}
				this.aShortArray48[local8] = (short) local179;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local32 = local8 << 4;
				for (local34 = 1; local34 < this.anIntArrayArray23.length - 1 && local32 >= this.anIntArrayArray23[local34][0]; local34++) {
				}
				local69 = this.anIntArrayArray23[local34 - 1];
				local74 = this.anIntArrayArray23[local34];
				local83 = (local32 - local69[0] << 12) / (local74[0] - local69[0]);
				local87 = 4096 - Static510.anIntArray636[local83 >> 5 & 0xFF] >> 1;
				local91 = 4096 - local87;
				local100 = local87 * local74[1] + local91 * local69[1] >> 12;
				if (local100 <= -32768) {
					local100 = -32767;
				}
				if (local100 >= 32768) {
					local100 = 32767;
				}
				this.aShortArray48[local8] = (short) local100;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local32 = local8 << 2085635396;
				for (local34 = 1; local34 < this.anIntArrayArray23.length - 1 && local32 >= this.anIntArrayArray23[local34][0]; local34++) {
				}
				local69 = this.anIntArrayArray23[local34 - 1];
				local74 = this.anIntArrayArray23[local34];
				local83 = (local32 - local69[0] << 12) / (local74[0] - local69[0]);
				local87 = 4096 - local83;
				local91 = local69[1] * local87 + local74[1] * local83 >> 12;
				if (local91 <= -32768) {
					local91 = -32767;
				}
				if (local91 >= 32768) {
					local91 = 32767;
				}
				this.aShortArray48[local8] = (short) local91;
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(II)[I")
	private int[] method4175(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray234;
		} else if (arg0 >= this.anIntArrayArray23.length) {
			return this.anIntArray236;
		} else {
			return this.anIntArrayArray23[arg0];
		}
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			@Pc(21) int[] local21 = this.method8930(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static83.anInt1268; local23++) {
				@Pc(31) int local31 = local21[local23] >> 4;
				if (local31 < 0) {
					local31 = 0;
				}
				if (local31 > 256) {
					local31 = 256;
				}
				local11[local23] = this.aShortArray48[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V")
	@Override
	public void method8936() {
		if (this.anIntArrayArray23 == null) {
			this.anIntArrayArray23 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray23.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt4564 == 2) {
			this.method4177();
		}
		Static496.method7310();
		this.method4174();
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt4564 = arg1.method3030();
		this.anIntArrayArray23 = new int[arg1.method3030()][2];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArrayArray23.length; local28++) {
			this.anIntArrayArray23[local28][0] = arg1.method3018();
			this.anIntArrayArray23[local28][1] = arg1.method3018();
		}
	}

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "(I)V")
	private void method4177() {
		@Pc(13) int[] local13 = this.anIntArrayArray23[0];
		@Pc(18) int[] local18 = this.anIntArrayArray23[1];
		@Pc(27) int[] local27 = this.anIntArrayArray23[this.anIntArrayArray23.length - 2];
		@Pc(36) int[] local36 = this.anIntArrayArray23[this.anIntArrayArray23.length - 1];
		this.anIntArray236 = new int[] { local27[0] + local27[0] - local36[0], -local36[1] - (-local27[1] - local27[1]) };
		this.anIntArray234 = new int[] { local13[0] + local13[0] - local18[0], local13[1] - local18[1] + local13[1] };
	}
}
