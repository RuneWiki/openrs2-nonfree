import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class5_Sub2_Sub38 extends Class5_Sub2 {

	@OriginalMember(owner = "client!we", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray63;

	@OriginalMember(owner = "client!we", name = "H", descriptor = "[I")
	private int[] anIntArray816;

	@OriginalMember(owner = "client!we", name = "P", descriptor = "[I")
	private int[] anIntArray817;

	@OriginalMember(owner = "client!we", name = "I", descriptor = "[S")
	private final short[] aShortArray189 = new short[257];

	@OriginalMember(owner = "client!we", name = "N", descriptor = "I")
	private int anInt10235 = 0;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub38() {
		super(1, true);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)[I")
	private int[] method8693(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray817;
		} else if (arg0 >= this.anIntArrayArray63.length) {
			return this.anIntArray816;
		} else {
			return this.anIntArrayArray63[arg0];
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			@Pc(26) int[] local26 = this.method8821(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static314.anInt6320; local28++) {
				@Pc(36) int local36 = local26[local28] >> 4;
				if (local36 < 0) {
					local36 = 0;
				}
				if (local36 > 256) {
					local36 = 256;
				}
				local16[local28] = this.aShortArray189[local36];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	@Override
	public void method8819() {
		if (this.anIntArrayArray63 == null) {
			this.anIntArrayArray63 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray63.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt10235 == 2) {
			this.method8694();
		}
		Static606.method8449();
		this.method8695();
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(Z)V")
	private void method8694() {
		@Pc(8) int[] local8 = this.anIntArrayArray63[0];
		@Pc(13) int[] local13 = this.anIntArrayArray63[1];
		@Pc(28) int[] local28 = this.anIntArrayArray63[this.anIntArrayArray63.length - 2];
		@Pc(37) int[] local37 = this.anIntArrayArray63[this.anIntArrayArray63.length - 1];
		this.anIntArray816 = new int[] { local28[0] + local28[0] - local37[0], local28[1] + local28[1] - local37[1] };
		this.anIntArray817 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - (local13[1] - local8[1]) };
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
	private void method8695() {
		@Pc(7) int local7 = this.anInt10235;
		@Pc(27) int local27;
		@Pc(25) int local25;
		@Pc(54) int[] local54;
		@Pc(59) int[] local59;
		@Pc(68) int local68;
		@Pc(72) int local72;
		@Pc(76) int local76;
		@Pc(85) int local85;
		if (local7 == 2) {
			for (local7 = 0; local7 < 257; local7++) {
				local25 = local7 << 4;
				for (local27 = 1; local27 < this.anIntArrayArray63.length - 1 && this.anIntArrayArray63[local27][0] <= local25; local27++) {
				}
				local54 = this.anIntArrayArray63[local27 - 1];
				local59 = this.anIntArrayArray63[local27];
				local68 = this.method8693(local27 - 2)[1];
				local72 = local54[1];
				local76 = local59[1];
				local85 = this.method8693(local27 + 1)[1];
				@Pc(103) int local103 = (local25 - local54[0] << 12) / (local59[0] - local54[0]);
				@Pc(109) int local109 = local103 * local103 >> 12;
				@Pc(118) int local118 = local72 + local85 - local68 - local76;
				@Pc(126) int local126 = local68 - local72 - local118;
				@Pc(131) int local131 = local76 - local68;
				@Pc(143) int local143 = (local118 * local103 >> 12) * local109 >> 12;
				@Pc(149) int local149 = local109 * local126 >> 12;
				@Pc(155) int local155 = local103 * local131 >> 12;
				@Pc(163) int local163 = local72 + local155 + local143 + local149;
				if (local163 <= -32768) {
					local163 = -32767;
				}
				if (local163 >= 32768) {
					local163 = 32767;
				}
				this.aShortArray189[local7] = (short) local163;
			}
		} else if (local7 == 1) {
			for (local7 = 0; local7 < 257; local7++) {
				local25 = local7 << 4;
				for (local27 = 1; this.anIntArrayArray63.length - 1 > local27 && this.anIntArrayArray63[local27][0] <= local25; local27++) {
				}
				local54 = this.anIntArrayArray63[local27 - 1];
				local59 = this.anIntArrayArray63[local27];
				local68 = (local25 - local54[0] << 12) / (local59[0] - local54[0]);
				local72 = 4096 - Static46.anIntArray61[local68 >> 5 & 0xFF] >> 1;
				local76 = 4096 - local72;
				local85 = local59[1] * local72 + local76 * local54[1] >> 12;
				if (local85 <= -32768) {
					local85 = -32767;
				}
				if (local85 >= 32768) {
					local85 = 32767;
				}
				this.aShortArray189[local7] = (short) local85;
			}
		} else {
			for (local7 = 0; local7 < 257; local7++) {
				local25 = local7 << 4;
				for (local27 = 1; this.anIntArrayArray63.length - 1 > local27 && this.anIntArrayArray63[local27][0] <= local25; local27++) {
				}
				local54 = this.anIntArrayArray63[local27 - 1];
				local59 = this.anIntArrayArray63[local27];
				local68 = (local25 - local54[0] << 12) / (local59[0] - local54[0]);
				local72 = 4096 - local68;
				local76 = local72 * local54[1] + local59[1] * local68 >> 12;
				if (local76 <= -32768) {
					local76 = -32767;
				}
				if (local76 >= 32768) {
					local76 = 32767;
				}
				this.aShortArray189[local7] = (short) local76;
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt10235 = arg0.method8645();
		this.anIntArrayArray63 = new int[arg0.method8645()][2];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArrayArray63.length; local17++) {
			this.anIntArrayArray63[local17][0] = arg0.method8631();
			this.anIntArrayArray63[local17][1] = arg0.method8631();
		}
	}
}
