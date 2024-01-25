import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class375 {

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "[I")
	private int[] anIntArray564;

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
	public final int anInt10549;

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
	private final int anInt10550;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "[I")
	private final int[] anIntArray563;

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "[I")
	private int[] anIntArray562;

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "[[F")
	private float[][] aFloatArrayArray18;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
	public Class375() {
		Static659.method9193(24);
		this.anInt10549 = Static659.method9193(16);
		this.anInt10550 = Static659.method9193(24);
		this.anIntArray563 = new int[this.anInt10550];
		@Pc(23) boolean local23 = Static659.method9189() != 0;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(43) int local43;
		if (local23) {
			local27 = 0;
			local32 = Static659.method9193(5) + 1;
			while (local27 < this.anInt10550) {
				@Pc(41) int local41 = Static659.method9193(Static220.method3803(this.anInt10550 - local27));
				for (local43 = 0; local43 < local41; local43++) {
					this.anIntArray563[local27++] = local32;
				}
				local32++;
			}
		} else {
			@Pc(66) boolean local66 = Static659.method9189() != 0;
			for (local32 = 0; local32 < this.anInt10550; local32++) {
				if (local66 && Static659.method9189() == 0) {
					this.anIntArray563[local32] = 0;
				} else {
					this.anIntArray563[local32] = Static659.method9193(5) + 1;
				}
			}
		}
		this.method9030();
		local27 = Static659.method9193(4);
		if (local27 > 0) {
			@Pc(103) float local103 = Static659.method9196(Static659.method9193(32));
			@Pc(107) float local107 = Static659.method9196(Static659.method9193(32));
			local43 = Static659.method9193(4) + 1;
			@Pc(118) boolean local118 = Static659.method9189() != 0;
			@Pc(127) int local127;
			if (local27 == 1) {
				local127 = Static699.method9028(this.anInt10550, this.anInt10549);
			} else {
				local127 = this.anInt10550 * this.anInt10549;
			}
			this.anIntArray562 = new int[local127];
			for (@Pc(140) int local140 = 0; local140 < local127; local140++) {
				this.anIntArray562[local140] = Static659.method9193(local43);
			}
			this.aFloatArrayArray18 = new float[this.anInt10550][this.anInt10549];
			@Pc(163) int local163;
			@Pc(166) float local166;
			@Pc(168) int local168;
			@Pc(170) int local170;
			if (local27 == 1) {
				for (local163 = 0; local163 < this.anInt10550; local163++) {
					local166 = 0.0F;
					local168 = 1;
					for (local170 = 0; local170 < this.anInt10549; local170++) {
						@Pc(177) int local177 = local163 / local168 % local127;
						@Pc(189) float local189 = (float) this.anIntArray562[local177] * local107 + local103 + local166;
						this.aFloatArrayArray18[local163][local170] = local189;
						if (local118) {
							local166 = local189;
						}
						local168 *= local127;
					}
				}
				return;
			}
			for (local163 = 0; local163 < this.anInt10550; local163++) {
				local166 = 0.0F;
				local168 = local163 * this.anInt10549;
				for (local170 = 0; local170 < this.anInt10549; local170++) {
					@Pc(240) float local240 = (float) this.anIntArray562[local168] * local107 + local103 + local166;
					this.aFloatArrayArray18[local163][local170] = local240;
					if (local118) {
						local166 = local240;
					}
					local168++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "()I")
	public int method9029() {
		@Pc(1) int local1;
		for (local1 = 0; this.anIntArray564[local1] >= 0; local1 = Static659.method9189() == 0 ? local1 + 1 : this.anIntArray564[local1]) {
		}
		return ~this.anIntArray564[local1];
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "()V")
	private void method9030() {
		@Pc(3) int[] local3 = new int[this.anInt10550];
		@Pc(6) int[] local6 = new int[33];
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(26) int local26;
		@Pc(40) int local40;
		@Pc(49) int local49;
		@Pc(54) int local54;
		@Pc(63) int local63;
		for (@Pc(8) int local8 = 0; local8 < this.anInt10550; local8++) {
			local14 = this.anIntArray563[local8];
			if (local14 != 0) {
				local22 = 0x1 << 32 - local14;
				local26 = local6[local14];
				local3[local8] = local26;
				if ((local26 & local22) == 0) {
					local40 = local26 | local22;
					for (local49 = local14 - 1; local49 >= 1; local49--) {
						local54 = local6[local49];
						if (local54 != local26) {
							break;
						}
						local63 = 0x1 << 32 - local49;
						if ((local54 & local63) != 0) {
							local6[local49] = local6[local49 - 1];
							break;
						}
						local6[local49] = local54 | local63;
					}
				} else {
					local40 = local6[local14 - 1];
				}
				local6[local14] = local40;
				for (local49 = local14 + 1; local49 <= 32; local49++) {
					local54 = local6[local49];
					if (local54 == local26) {
						local6[local49] = local40;
					}
				}
			}
		}
		this.anIntArray564 = new int[8];
		local14 = 0;
		for (local22 = 0; local22 < this.anInt10550; local22++) {
			local26 = this.anIntArray563[local22];
			if (local26 != 0) {
				local40 = local3[local22];
				local49 = 0;
				for (local54 = 0; local54 < local26; local54++) {
					local63 = Integer.MIN_VALUE >>> local54;
					if ((local40 & local63) == 0) {
						local49++;
					} else {
						if (this.anIntArray564[local49] == 0) {
							this.anIntArray564[local49] = local14;
						}
						local49 = this.anIntArray564[local49];
					}
					if (local49 >= this.anIntArray564.length) {
						@Pc(178) int[] local178 = new int[this.anIntArray564.length * 2];
						for (@Pc(180) int local180 = 0; local180 < this.anIntArray564.length; local180++) {
							local178[local180] = this.anIntArray564[local180];
						}
						this.anIntArray564 = local178;
					}
				}
				this.anIntArray564[local49] = ~local22;
				if (local49 >= local14) {
					local14 = local49 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "()[F")
	public float[] method9031() {
		return this.aFloatArrayArray18[this.method9029()];
	}
}
