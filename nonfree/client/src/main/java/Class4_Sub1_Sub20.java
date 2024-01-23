import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class4_Sub1_Sub20 extends Class4_Sub1 {

	@OriginalMember(owner = "client!of", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!of", name = "X", descriptor = "[I")
	private int[] anIntArray410;

	@OriginalMember(owner = "client!of", name = "hb", descriptor = "[I")
	private int[] anIntArray411;

	@OriginalMember(owner = "client!of", name = "cb", descriptor = "[S")
	private short[] aShortArray73 = new short[257];

	@OriginalMember(owner = "client!of", name = "db", descriptor = "I")
	private int anInt3819 = 0;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub20() {
		super(1, true);
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(II)[I")
	private int[] method3194(@OriginalArg(0) int arg0) {
		if (arg0 >= 0) {
			return this.anIntArrayArray34.length > arg0 ? this.anIntArrayArray34[arg0] : this.anIntArray411;
		} else {
			return this.anIntArray410;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4731(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(28) int[] local28 = this.method4736(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static73.anInt1626; local30++) {
				@Pc(43) int local43 = local28[local30] >> 4;
				if (local43 < 0) {
					local43 = 0;
				}
				if (local43 > 256) {
					local43 = 256;
				}
				local11[local30] = this.aShortArray73[local43];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(I)V")
	private void method3195() {
		@Pc(13) int local13 = this.anInt3819;
		@Pc(37) int local37;
		@Pc(35) int local35;
		@Pc(69) int[] local69;
		@Pc(62) int[] local62;
		@Pc(78) int local78;
		@Pc(86) int local86;
		@Pc(82) int local82;
		@Pc(101) int local101;
		if (local13 == 2) {
			for (local13 = 0; local13 < 257; local13++) {
				local35 = local13 << 4;
				for (local37 = 1; local37 < this.anIntArrayArray34.length - 1 && local35 >= this.anIntArrayArray34[local37][0]; local37++) {
				}
				local62 = this.anIntArrayArray34[local37];
				local69 = this.anIntArrayArray34[local37 - 1];
				local78 = this.method3194(local37 - 2)[1];
				local82 = local62[1];
				local86 = local69[1];
				@Pc(92) int local92 = local82 - local78;
				local101 = this.method3194(local37 + 1)[1];
				@Pc(118) int local118 = (local35 - local69[0] << 12) / (local62[0] - local69[0]);
				@Pc(128) int local128 = local101 + local86 - local78 - local82;
				@Pc(135) int local135 = local78 - local86 - local128;
				@Pc(141) int local141 = local118 * local118 >> 12;
				@Pc(147) int local147 = local118 * local92 >> 12;
				@Pc(157) int local157 = (local118 * local128 >> 12) * local141 >> 12;
				@Pc(163) int local163 = local141 * local135 >> 12;
				@Pc(172) int local172 = local157 + local163 + local147 + local86;
				if (local172 <= -32768) {
					local172 = -32767;
				}
				if (local172 >= 32768) {
					local172 = 32767;
				}
				this.aShortArray73[local13] = (short) local172;
			}
		} else if (local13 == 1) {
			for (local13 = 0; local13 < 257; local13++) {
				local35 = local13 << 4;
				for (local37 = 1; this.anIntArrayArray34.length - 1 > local37 && this.anIntArrayArray34[local37][0] <= local35; local37++) {
				}
				local69 = this.anIntArrayArray34[local37 - 1];
				local62 = this.anIntArrayArray34[local37];
				local78 = (local35 - local69[0] << 12) / (local62[0] - local69[0]);
				local86 = 4096 - Static129.anIntArray222[local78 >> 5 & 0xFF] >> 1;
				local82 = 4096 - local86;
				local101 = local86 * local62[1] + local82 * local69[1] >> 12;
				if (local101 <= -32768) {
					local101 = -32767;
				}
				if (local101 >= 32768) {
					local101 = 32767;
				}
				this.aShortArray73[local13] = (short) local101;
			}
		} else {
			for (local13 = 0; local13 < 257; local13++) {
				local35 = local13 << 4;
				for (local37 = 1; this.anIntArrayArray34.length - 1 > local37 && local35 >= this.anIntArrayArray34[local37][0]; local37++) {
				}
				local69 = this.anIntArrayArray34[local37 - 1];
				local62 = this.anIntArrayArray34[local37];
				local78 = (local35 - local69[0] << 12) / (local62[0] - local69[0]);
				local86 = 4096 - local78;
				local82 = local62[1] * local78 + local86 * local69[1] >> 12;
				if (local82 <= -32768) {
					local82 = -32767;
				}
				if (local82 >= 32768) {
					local82 = 32767;
				}
				this.aShortArray73[local13] = (short) local82;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "g", descriptor = "(I)V")
	private void method3196() {
		@Pc(8) int[] local8 = this.anIntArrayArray34[0];
		@Pc(13) int[] local13 = this.anIntArrayArray34[1];
		@Pc(22) int[] local22 = this.anIntArrayArray34[this.anIntArrayArray34.length - 1];
		@Pc(31) int[] local31 = this.anIntArrayArray34[this.anIntArrayArray34.length - 2];
		this.anIntArray411 = new int[] { local31[0] + local31[0] - local22[0], local31[1] - -local31[1] - local22[1] };
		this.anIntArray410 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + -local13[1] + local8[1] };
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(B)V")
	@Override
	public void method4737() {
		if (this.anIntArrayArray34 == null) {
			this.anIntArrayArray34 = new int[][] { { 0, 0 }, { 4096, 4096 } };
		}
		if (this.anIntArrayArray34.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3819 == 2) {
			this.method3196();
		}
		Static303.method4682();
		this.method3195();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt3819 = arg0.method4666();
		this.anIntArrayArray34 = new int[arg0.method4666()][2];
		for (@Pc(26) int local26 = 0; local26 < this.anIntArrayArray34.length; local26++) {
			this.anIntArrayArray34[local26][0] = arg0.method4653();
			this.anIntArrayArray34[local26][1] = arg0.method4653();
		}
	}
}
