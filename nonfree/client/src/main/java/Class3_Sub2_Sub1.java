import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "[I")
	private int[] anIntArray1;

	@OriginalMember(owner = "client!ac", name = "L", descriptor = "[I")
	private int[] anIntArray2;

	@OriginalMember(owner = "client!ac", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ac", name = "R", descriptor = "I")
	private int anInt77 = 0;

	@OriginalMember(owner = "client!ac", name = "E", descriptor = "[S")
	private final short[] aShortArray1 = new short[257];

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub1() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt77 = arg1.method5322(-110);
		this.anIntArrayArray1 = new int[arg1.method5322(-32)][2];
		for (@Pc(22) int local22 = 0; local22 < this.anIntArrayArray1.length; local22++) {
			this.anIntArrayArray1[local22][0] = arg1.method5272();
			this.anIntArrayArray1[local22][1] = arg1.method5272();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	@Override
	public void method9205() {
		if (this.anIntArrayArray1 == null) {
			this.anIntArrayArray1 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray1.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt77 == 2) {
			this.method86();
		}
		Static333.method4978();
		this.method87();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			@Pc(28) int[] local28 = this.method9204(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static636.anInt10302; local30++) {
				@Pc(38) int local38 = local28[local30] >> 4;
				if (local38 < 0) {
					local38 = 0;
				}
				if (local38 > 256) {
					local38 = 256;
				}
				local11[local30] = this.aShortArray1[local38];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ)[I")
	private int[] method82(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray2;
		} else if (this.anIntArrayArray1.length <= arg0) {
			return this.anIntArray1;
		} else {
			return this.anIntArrayArray1[arg0];
		}
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(Z)V")
	private void method86() {
		@Pc(8) int[] local8 = this.anIntArrayArray1[0];
		@Pc(21) int[] local21 = this.anIntArrayArray1[1];
		@Pc(30) int[] local30 = this.anIntArrayArray1[this.anIntArrayArray1.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray1[this.anIntArrayArray1.length - 1];
		this.anIntArray2 = new int[] { local8[0] + local8[0] - local21[0], local8[1] - (local21[1] + -local8[1]) };
		this.anIntArray1 = new int[] { local30[0] + local30[0] - local39[0], -local39[1] + local30[1] + local30[1] };
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(Z)V")
	private void method87() {
		@Pc(16) int local16 = this.anInt77;
		@Pc(40) int local40;
		@Pc(38) int local38;
		@Pc(75) int[] local75;
		@Pc(80) int[] local80;
		@Pc(89) int local89;
		@Pc(93) int local93;
		@Pc(97) int local97;
		@Pc(113) int local113;
		if (local16 == 2) {
			for (local16 = 0; local16 < 257; local16++) {
				local38 = local16 << 4;
				for (local40 = 1; local40 < this.anIntArrayArray1.length - 1 && this.anIntArrayArray1[local40][0] <= local38; local40++) {
				}
				local75 = this.anIntArrayArray1[local40 - 1];
				local80 = this.anIntArrayArray1[local40];
				local89 = this.method82(local40 - 2)[1];
				local93 = local75[1];
				local97 = local80[1];
				local113 = this.method82(local40 + 1)[1];
				@Pc(131) int local131 = (local38 - local75[0] << 12) / (local80[0] - local75[0]);
				@Pc(137) int local137 = local131 * local131 >> 12;
				@Pc(147) int local147 = local93 + local113 - local97 - local89;
				@Pc(154) int local154 = local89 - local93 - local147;
				@Pc(159) int local159 = local97 - local89;
				@Pc(171) int local171 = (local131 * local147 >> 12) * local137 >> 12;
				@Pc(177) int local177 = local137 * local154 >> 12;
				@Pc(183) int local183 = local159 * local131 >> 12;
				@Pc(191) int local191 = local93 + local183 + local177 + local171;
				if (local191 <= -32768) {
					local191 = -32767;
				}
				if (local191 >= 32768) {
					local191 = 32767;
				}
				this.aShortArray1[local16] = (short) local191;
			}
		} else if (local16 == 1) {
			for (local16 = 0; local16 < 257; local16++) {
				local38 = local16 << 4;
				for (local40 = 1; this.anIntArrayArray1.length - 1 > local40 && local38 >= this.anIntArrayArray1[local40][0]; local40++) {
				}
				local75 = this.anIntArrayArray1[local40 - 1];
				local80 = this.anIntArrayArray1[local40];
				local89 = (local38 - local75[0] << 12) / (local80[0] - local75[0]);
				local93 = 4096 - Static263.anIntArray275[local89 >> 5 & 0xFF] >> 1;
				local97 = 4096 - local93;
				local113 = local75[1] * local97 + local80[1] * local93 >> 12;
				if (local113 <= -32768) {
					local113 = -32767;
				}
				if (local113 >= 32768) {
					local113 = 32767;
				}
				this.aShortArray1[local16] = (short) local113;
			}
		} else {
			for (local16 = 0; local16 < 257; local16++) {
				local38 = local16 << 4;
				for (local40 = 1; this.anIntArrayArray1.length - 1 > local40 && local38 >= this.anIntArrayArray1[local40][0]; local40++) {
				}
				local75 = this.anIntArrayArray1[local40 - 1];
				local80 = this.anIntArrayArray1[local40];
				local89 = (local38 - local75[0] << 12) / (local80[0] - local75[0]);
				local93 = 4096 - local89;
				local97 = local75[1] * local93 + local89 * local80[1] >> 12;
				if (local97 <= -32768) {
					local97 = -32767;
				}
				if (local97 >= 32768) {
					local97 = 32767;
				}
				this.aShortArray1[local16] = (short) local97;
			}
		}
	}
}
