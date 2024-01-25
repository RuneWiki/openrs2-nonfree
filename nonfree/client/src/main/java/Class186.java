import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class186 {

	@OriginalMember(owner = "client!si", name = "f", descriptor = "[I")
	private int[] anIntArray512;

	@OriginalMember(owner = "client!si", name = "c", descriptor = "I")
	public final int anInt5626;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "I")
	private final int anInt5625;

	@OriginalMember(owner = "client!si", name = "b", descriptor = "[I")
	private final int[] anIntArray510;

	@OriginalMember(owner = "client!si", name = "d", descriptor = "[I")
	private int[] anIntArray511;

	@OriginalMember(owner = "client!si", name = "e", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
	public Class186() {
		Static268.method4574(24);
		this.anInt5626 = Static268.method4574(16);
		this.anInt5625 = Static268.method4574(24);
		this.anIntArray510 = new int[this.anInt5625];
		@Pc(23) boolean local23 = Static268.method4578() != 0;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(43) int local43;
		if (local23) {
			local27 = 0;
			local32 = Static268.method4574(5) + 1;
			while (local27 < this.anInt5625) {
				@Pc(41) int local41 = Static268.method4574(Static18.method431(this.anInt5625 - local27));
				for (local43 = 0; local43 < local41; local43++) {
					this.anIntArray510[local27++] = local32;
				}
				local32++;
			}
		} else {
			@Pc(66) boolean local66 = Static268.method4578() != 0;
			for (local32 = 0; local32 < this.anInt5625; local32++) {
				if (local66 && Static268.method4578() == 0) {
					this.anIntArray510[local32] = 0;
				} else {
					this.anIntArray510[local32] = Static268.method4574(5) + 1;
				}
			}
		}
		this.method5006();
		local27 = Static268.method4574(4);
		if (local27 > 0) {
			@Pc(103) float local103 = Static268.method4576(Static268.method4574(32));
			@Pc(107) float local107 = Static268.method4576(Static268.method4574(32));
			local43 = Static268.method4574(4) + 1;
			@Pc(118) boolean local118 = Static268.method4578() != 0;
			@Pc(127) int local127;
			if (local27 == 1) {
				local127 = Static366.method5005(this.anInt5625, this.anInt5626);
			} else {
				local127 = this.anInt5625 * this.anInt5626;
			}
			this.anIntArray511 = new int[local127];
			for (@Pc(140) int local140 = 0; local140 < local127; local140++) {
				this.anIntArray511[local140] = Static268.method4574(local43);
			}
			this.aFloatArrayArray8 = new float[this.anInt5625][this.anInt5626];
			@Pc(163) int local163;
			@Pc(166) float local166;
			@Pc(168) int local168;
			@Pc(170) int local170;
			if (local27 == 1) {
				for (local163 = 0; local163 < this.anInt5625; local163++) {
					local166 = 0.0F;
					local168 = 1;
					for (local170 = 0; local170 < this.anInt5626; local170++) {
						@Pc(177) int local177 = local163 / local168 % local127;
						@Pc(189) float local189 = (float) this.anIntArray511[local177] * local107 + local103 + local166;
						this.aFloatArrayArray8[local163][local170] = local189;
						if (local118) {
							local166 = local189;
						}
						local168 *= local127;
					}
				}
				return;
			}
			for (local163 = 0; local163 < this.anInt5625; local163++) {
				local166 = 0.0F;
				local168 = local163 * this.anInt5626;
				for (local170 = 0; local170 < this.anInt5626; local170++) {
					@Pc(240) float local240 = (float) this.anIntArray511[local168] * local107 + local103 + local166;
					this.aFloatArrayArray8[local163][local170] = local240;
					if (local118) {
						local166 = local240;
					}
					local168++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "()I")
	public int method5004() {
		@Pc(1) int local1;
		for (local1 = 0; this.anIntArray512[local1] >= 0; local1 = Static268.method4578() == 0 ? local1 + 1 : this.anIntArray512[local1]) {
		}
		return ~this.anIntArray512[local1];
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "()V")
	private void method5006() {
		@Pc(3) int[] local3 = new int[this.anInt5625];
		@Pc(6) int[] local6 = new int[33];
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(26) int local26;
		@Pc(40) int local40;
		@Pc(49) int local49;
		@Pc(54) int local54;
		@Pc(63) int local63;
		for (@Pc(8) int local8 = 0; local8 < this.anInt5625; local8++) {
			local14 = this.anIntArray510[local8];
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
		this.anIntArray512 = new int[8];
		local14 = 0;
		for (local22 = 0; local22 < this.anInt5625; local22++) {
			local26 = this.anIntArray510[local22];
			if (local26 != 0) {
				local40 = local3[local22];
				local49 = 0;
				for (local54 = 0; local54 < local26; local54++) {
					local63 = Integer.MIN_VALUE >>> local54;
					if ((local40 & local63) == 0) {
						local49++;
					} else {
						if (this.anIntArray512[local49] == 0) {
							this.anIntArray512[local49] = local14;
						}
						local49 = this.anIntArray512[local49];
					}
					if (local49 >= this.anIntArray512.length) {
						@Pc(178) int[] local178 = new int[this.anIntArray512.length * 2];
						for (@Pc(180) int local180 = 0; local180 < this.anIntArray512.length; local180++) {
							local178[local180] = this.anIntArray512[local180];
						}
						this.anIntArray512 = local178;
					}
				}
				this.anIntArray512[local49] = ~local22;
				if (local49 >= local14) {
					local14 = local49 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "()[F")
	public float[] method5007() {
		return this.aFloatArrayArray8[this.method5004()];
	}
}
