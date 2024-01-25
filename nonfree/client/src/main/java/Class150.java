import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class150 {

	@OriginalMember(owner = "client!o", name = "f", descriptor = "[I")
	private int[] anIntArray369;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "I")
	public final int anInt4451;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "I")
	private final int anInt4452;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "[I")
	private final int[] anIntArray368;

	@OriginalMember(owner = "client!o", name = "c", descriptor = "[I")
	private int[] anIntArray367;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class150() {
		Static32.method840(24);
		this.anInt4451 = Static32.method840(16);
		this.anInt4452 = Static32.method840(24);
		this.anIntArray368 = new int[this.anInt4452];
		@Pc(23) boolean local23 = Static32.method833() != 0;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(43) int local43;
		if (local23) {
			local27 = 0;
			local32 = Static32.method840(5) + 1;
			while (local27 < this.anInt4452) {
				@Pc(41) int local41 = Static32.method840(Static96.method2070(this.anInt4452 - local27));
				for (local43 = 0; local43 < local41; local43++) {
					this.anIntArray368[local27++] = local32;
				}
				local32++;
			}
		} else {
			@Pc(66) boolean local66 = Static32.method833() != 0;
			for (local32 = 0; local32 < this.anInt4452; local32++) {
				if (local66 && Static32.method833() == 0) {
					this.anIntArray368[local32] = 0;
				} else {
					this.anIntArray368[local32] = Static32.method840(5) + 1;
				}
			}
		}
		this.method4120();
		local27 = Static32.method840(4);
		if (local27 > 0) {
			@Pc(103) float local103 = Static32.method841(Static32.method840(32));
			@Pc(107) float local107 = Static32.method841(Static32.method840(32));
			local43 = Static32.method840(4) + 1;
			@Pc(118) boolean local118 = Static32.method833() != 0;
			@Pc(127) int local127;
			if (local27 == 1) {
				local127 = Static378.method4118(this.anInt4452, this.anInt4451);
			} else {
				local127 = this.anInt4452 * this.anInt4451;
			}
			this.anIntArray367 = new int[local127];
			for (@Pc(140) int local140 = 0; local140 < local127; local140++) {
				this.anIntArray367[local140] = Static32.method840(local43);
			}
			this.aFloatArrayArray8 = new float[this.anInt4452][this.anInt4451];
			@Pc(163) int local163;
			@Pc(166) float local166;
			@Pc(168) int local168;
			@Pc(170) int local170;
			if (local27 == 1) {
				for (local163 = 0; local163 < this.anInt4452; local163++) {
					local166 = 0.0F;
					local168 = 1;
					for (local170 = 0; local170 < this.anInt4451; local170++) {
						@Pc(177) int local177 = local163 / local168 % local127;
						@Pc(189) float local189 = (float) this.anIntArray367[local177] * local107 + local103 + local166;
						this.aFloatArrayArray8[local163][local170] = local189;
						if (local118) {
							local166 = local189;
						}
						local168 *= local127;
					}
				}
				return;
			}
			for (local163 = 0; local163 < this.anInt4452; local163++) {
				local166 = 0.0F;
				local168 = local163 * this.anInt4451;
				for (local170 = 0; local170 < this.anInt4451; local170++) {
					@Pc(240) float local240 = (float) this.anIntArray367[local168] * local107 + local103 + local166;
					this.aFloatArrayArray8[local163][local170] = local240;
					if (local118) {
						local166 = local240;
					}
					local168++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "()I")
	public int method4117() {
		@Pc(1) int local1;
		for (local1 = 0; this.anIntArray369[local1] >= 0; local1 = Static32.method833() == 0 ? local1 + 1 : this.anIntArray369[local1]) {
		}
		return ~this.anIntArray369[local1];
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "()[F")
	public float[] method4119() {
		return this.aFloatArrayArray8[this.method4117()];
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "()V")
	private void method4120() {
		@Pc(3) int[] local3 = new int[this.anInt4452];
		@Pc(6) int[] local6 = new int[33];
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(26) int local26;
		@Pc(40) int local40;
		@Pc(49) int local49;
		@Pc(54) int local54;
		@Pc(63) int local63;
		for (@Pc(8) int local8 = 0; local8 < this.anInt4452; local8++) {
			local14 = this.anIntArray368[local8];
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
		this.anIntArray369 = new int[8];
		local14 = 0;
		for (local22 = 0; local22 < this.anInt4452; local22++) {
			local26 = this.anIntArray368[local22];
			if (local26 != 0) {
				local40 = local3[local22];
				local49 = 0;
				for (local54 = 0; local54 < local26; local54++) {
					local63 = Integer.MIN_VALUE >>> local54;
					if ((local40 & local63) == 0) {
						local49++;
					} else {
						if (this.anIntArray369[local49] == 0) {
							this.anIntArray369[local49] = local14;
						}
						local49 = this.anIntArray369[local49];
					}
					if (local49 >= this.anIntArray369.length) {
						@Pc(178) int[] local178 = new int[this.anIntArray369.length * 2];
						for (@Pc(180) int local180 = 0; local180 < this.anIntArray369.length; local180++) {
							local178[local180] = this.anIntArray369[local180];
						}
						this.anIntArray369 = local178;
					}
				}
				this.anIntArray369[local49] = ~local22;
				if (local49 >= local14) {
					local14 = local49 + 1;
				}
			}
		}
	}
}
