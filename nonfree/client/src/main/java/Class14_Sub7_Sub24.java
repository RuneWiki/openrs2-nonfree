import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lea")
public final class Class14_Sub7_Sub24 extends Class14_Sub7 {

	@OriginalMember(owner = "client!lea", name = "T", descriptor = "[I")
	private int[] anIntArray322;

	@OriginalMember(owner = "client!lea", name = "J", descriptor = "[I")
	private int[] anIntArray323;

	@OriginalMember(owner = "client!lea", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!lea", name = "R", descriptor = "I")
	private int anInt5800 = 0;

	@OriginalMember(owner = "client!lea", name = "N", descriptor = "[S")
	private final short[] aShortArray73 = new short[257];

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub24() {
		super(1, true);
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(B)V")
	private void method5214() {
		@Pc(16) int[] local16 = this.anIntArrayArray39[0];
		@Pc(21) int[] local21 = this.anIntArrayArray39[1];
		@Pc(30) int[] local30 = this.anIntArrayArray39[this.anIntArrayArray39.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray39[this.anIntArrayArray39.length - 1];
		this.anIntArray322 = new int[] { local30[0] + local30[0] - local39[0], -local39[1] + local30[1] + local30[1] };
		this.anIntArray323 = new int[] { local16[0] + local16[0] - local21[0], local16[1] + -local21[1] + local16[1] };
	}

	@OriginalMember(owner = "client!lea", name = "i", descriptor = "(I)V")
	private void method5215() {
		@Pc(12) int local12 = this.anInt5800;
		@Pc(36) int local36;
		@Pc(34) int local34;
		@Pc(71) int[] local71;
		@Pc(76) int[] local76;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(93) int local93;
		@Pc(102) int local102;
		if (local12 == 2) {
			for (local12 = 0; local12 < 257; local12++) {
				local34 = local12 << 4;
				for (local36 = 1; local36 < this.anIntArrayArray39.length - 1 && this.anIntArrayArray39[local36][0] <= local34; local36++) {
				}
				local71 = this.anIntArrayArray39[local36 - 1];
				local76 = this.anIntArrayArray39[local36];
				local85 = this.method5219(local36 - 2)[1];
				local89 = local71[1];
				local93 = local76[1];
				local102 = this.method5219(local36 + 1)[1];
				@Pc(120) int local120 = (local34 - local71[0] << 12) / (local76[0] - local71[0]);
				@Pc(126) int local126 = local120 * local120 >> 12;
				@Pc(137) int local137 = local102 + local89 - local85 - local93;
				@Pc(143) int local143 = local85 - local89 - local137;
				@Pc(147) int local147 = local93 - local85;
				@Pc(159) int local159 = local126 * (local137 * local120 >> 12) >> 12;
				@Pc(165) int local165 = local143 * local126 >> 12;
				@Pc(171) int local171 = local147 * local120 >> 12;
				@Pc(179) int local179 = local89 + local171 + local159 + local165;
				if (local179 <= -32768) {
					local179 = -32767;
				}
				if (local179 >= 32768) {
					local179 = 32767;
				}
				this.aShortArray73[local12] = (short) local179;
			}
		} else if (local12 == 1) {
			for (local12 = 0; local12 < 257; local12++) {
				local34 = local12 << 4;
				for (local36 = 1; this.anIntArrayArray39.length - 1 > local36 && local34 >= this.anIntArrayArray39[local36][0]; local36++) {
				}
				local71 = this.anIntArrayArray39[local36 - 1];
				local76 = this.anIntArrayArray39[local36];
				local85 = (local34 - local71[0] << 12) / (local76[0] - local71[0]);
				local89 = 4096 - Static79.anIntArray75[local85 >> 5 & 0xFF] >> 1;
				local93 = 4096 - local89;
				local102 = local71[1] * local93 + local76[1] * local89 >> 12;
				if (local102 <= -32768) {
					local102 = -32767;
				}
				if (local102 >= 32768) {
					local102 = 32767;
				}
				this.aShortArray73[local12] = (short) local102;
			}
		} else {
			for (local12 = 0; local12 < 257; local12++) {
				local34 = local12 << 4;
				for (local36 = 1; local36 < this.anIntArrayArray39.length - 1 && this.anIntArrayArray39[local36][0] <= local34; local36++) {
				}
				local71 = this.anIntArrayArray39[local36 - 1];
				local76 = this.anIntArrayArray39[local36];
				local85 = (local34 - local71[0] << 12) / (local76[0] - local71[0]);
				local89 = 4096 - local85;
				local93 = local89 * local71[1] + local85 * local76[1] >> 12;
				if (local93 <= -32768) {
					local93 = -32767;
				}
				if (local93 >= 32768) {
					local93 = 32767;
				}
				this.aShortArray73[local12] = (short) local93;
			}
		}
	}

	@OriginalMember(owner = "client!lea", name = "e", descriptor = "(I)V")
	@Override
	public void method9386() {
		if (this.anIntArrayArray39 == null) {
			this.anIntArrayArray39 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray39.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt5800 == 2) {
			this.method5214();
		}
		Static678.method9367();
		this.method5215();
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			@Pc(27) int[] local27 = this.method9379(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static613.anInt10114; local29++) {
				@Pc(37) int local37 = local27[local29] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local11[local29] = this.aShortArray73[local37];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt5800 = arg1.method7695(96);
		this.anIntArrayArray39 = new int[arg1.method7695(126)][2];
		for (@Pc(22) int local22 = 0; local22 < this.anIntArrayArray39.length; local22++) {
			this.anIntArrayArray39[local22][0] = arg1.method7717(-1978450544);
			this.anIntArrayArray39[local22][1] = arg1.method7717(-1978450544);
		}
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(II)[I")
	private int[] method5219(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray323;
		} else if (arg0 >= this.anIntArrayArray39.length) {
			return this.anIntArray322;
		} else {
			return this.anIntArrayArray39[arg0];
		}
	}
}
