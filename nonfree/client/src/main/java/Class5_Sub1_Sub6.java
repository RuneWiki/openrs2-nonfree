import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class5_Sub1_Sub6 extends Class5_Sub1 {

	@OriginalMember(owner = "client!fd", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!fd", name = "P", descriptor = "[I")
	private int[] anIntArray140;

	@OriginalMember(owner = "client!fd", name = "O", descriptor = "[I")
	private int[] anIntArray141;

	@OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
	private int anInt2497 = 0;

	@OriginalMember(owner = "client!fd", name = "F", descriptor = "[S")
	private final short[] aShortArray17 = new short[257];

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub6() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
	private void method2189() {
		@Pc(8) int local8 = this.anInt2497;
		@Pc(34) int local34;
		@Pc(32) int local32;
		@Pc(65) int[] local65;
		@Pc(70) int[] local70;
		@Pc(79) int local79;
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(96) int local96;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local32 = local8 << 4;
				for (local34 = 1; local34 < this.anIntArrayArray18.length - 1 && this.anIntArrayArray18[local34][0] <= local32; local34++) {
				}
				local65 = this.anIntArrayArray18[local34 - 1];
				local70 = this.anIntArrayArray18[local34];
				local79 = this.method2192(local34 - 2)[1];
				local83 = local65[1];
				local87 = local70[1];
				local96 = this.method2192(local34 + 1)[1];
				@Pc(114) int local114 = (local32 - local65[0] << 12) / (local70[0] - local65[0]);
				@Pc(120) int local120 = local114 * local114 >> 12;
				@Pc(129) int local129 = local83 + local96 - local79 - local87;
				@Pc(137) int local137 = local79 - local83 - local129;
				@Pc(142) int local142 = local87 - local79;
				@Pc(154) int local154 = (local129 * local114 >> 12) * local120 >> 12;
				@Pc(160) int local160 = local120 * local137 >> 12;
				@Pc(166) int local166 = local114 * local142 >> 12;
				@Pc(176) int local176 = local154 + local160 + local166 + local83;
				if (local176 <= -32768) {
					local176 = -32767;
				}
				if (local176 >= 32768) {
					local176 = 32767;
				}
				this.aShortArray17[local8] = (short) local176;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local32 = local8 << 4;
				for (local34 = 1; this.anIntArrayArray18.length - 1 > local34 && this.anIntArrayArray18[local34][0] <= local32; local34++) {
				}
				local65 = this.anIntArrayArray18[local34 - 1];
				local70 = this.anIntArrayArray18[local34];
				local79 = (local32 - local65[0] << 12) / (local70[0] - local65[0]);
				local83 = 4096 - Static633.anIntArray577[local79 >> 5 & 0xFF] >> 1;
				local87 = 4096 - local83;
				local96 = local87 * local65[1] + local83 * local70[1] >> 12;
				if (local96 <= -32768) {
					local96 = -32767;
				}
				if (local96 >= 32768) {
					local96 = 32767;
				}
				this.aShortArray17[local8] = (short) local96;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local32 = local8 << 936943268;
				for (local34 = 1; this.anIntArrayArray18.length - 1 > local34 && this.anIntArrayArray18[local34][0] <= local32; local34++) {
				}
				local65 = this.anIntArrayArray18[local34 - 1];
				local70 = this.anIntArrayArray18[local34];
				local79 = (local32 - local65[0] << 12) / (local70[0] - local65[0]);
				local83 = 4096 - local79;
				local87 = local83 * local65[1] + local70[1] * local79 >> 12;
				if (local87 <= -32768) {
					local87 = -32767;
				}
				if (local87 >= 32768) {
					local87 = 32767;
				}
				this.aShortArray17[local8] = (short) local87;
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	@Override
	public void method9204() {
		if (this.anIntArrayArray18 == null) {
			this.anIntArrayArray18 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray18.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2497 == 2) {
			this.method2190();
		}
		Static19.method298();
		this.method2189();
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)V")
	private void method2190() {
		@Pc(8) int[] local8 = this.anIntArrayArray18[0];
		@Pc(23) int[] local23 = this.anIntArrayArray18[1];
		@Pc(32) int[] local32 = this.anIntArrayArray18[this.anIntArrayArray18.length - 2];
		@Pc(41) int[] local41 = this.anIntArrayArray18[this.anIntArrayArray18.length - 1];
		this.anIntArray140 = new int[] { local32[0] + local32[0] - local41[0], -local41[1] - (-local32[1] - local32[1]) };
		this.anIntArray141 = new int[] { local8[0] + local8[0] - local23[0], local8[1] - (local23[1] + -local8[1]) };
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)[I")
	private int[] method2192(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray141;
		} else if (arg0 >= this.anIntArrayArray18.length) {
			return this.anIntArray140;
		} else {
			return this.anIntArrayArray18[arg0];
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt2497 = arg1.method8529();
		this.anIntArrayArray18 = new int[arg1.method8529()][2];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArrayArray18.length; local28++) {
			this.anIntArrayArray18[local28][0] = arg1.method8519();
			this.anIntArrayArray18[local28][1] = arg1.method8519();
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			@Pc(29) int[] local29 = this.method9210(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static648.anInt9588; local31++) {
				@Pc(39) int local39 = local29[local31] >> 4;
				if (local39 < 0) {
					local39 = 0;
				}
				if (local39 > 256) {
					local39 = 256;
				}
				local19[local31] = this.aShortArray17[local39];
			}
		}
		return local19;
	}
}
