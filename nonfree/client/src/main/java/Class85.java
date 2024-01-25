import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class85 {

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "[I")
	private int[] anIntArray148;

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
	public final int anInt2038;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
	private final int anInt2037;

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "[I")
	private final int[] anIntArray146;

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "[I")
	private int[] anIntArray147;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V")
	public Class85() {
		Static127.method1939(24);
		this.anInt2038 = Static127.method1939(16);
		this.anInt2037 = Static127.method1939(24);
		this.anIntArray146 = new int[this.anInt2037];
		@Pc(23) boolean local23 = Static127.method1940() != 0;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(43) int local43;
		if (local23) {
			local27 = 0;
			local32 = Static127.method1939(5) + 1;
			while (local27 < this.anInt2037) {
				@Pc(41) int local41 = Static127.method1939(Static184.method3190(this.anInt2037 - local27));
				for (local43 = 0; local43 < local41; local43++) {
					this.anIntArray146[local27++] = local32;
				}
				local32++;
			}
		} else {
			@Pc(66) boolean local66 = Static127.method1940() != 0;
			for (local32 = 0; local32 < this.anInt2037; local32++) {
				if (local66 && Static127.method1940() == 0) {
					this.anIntArray146[local32] = 0;
				} else {
					this.anIntArray146[local32] = Static127.method1939(5) + 1;
				}
			}
		}
		this.method1647();
		local27 = Static127.method1939(4);
		if (local27 > 0) {
			@Pc(103) float local103 = Static127.method1930(Static127.method1939(32));
			@Pc(107) float local107 = Static127.method1930(Static127.method1939(32));
			local43 = Static127.method1939(4) + 1;
			@Pc(118) boolean local118 = Static127.method1940() != 0;
			@Pc(127) int local127;
			if (local27 == 1) {
				local127 = Static362.method1648(this.anInt2037, this.anInt2038);
			} else {
				local127 = this.anInt2037 * this.anInt2038;
			}
			this.anIntArray147 = new int[local127];
			for (@Pc(140) int local140 = 0; local140 < local127; local140++) {
				this.anIntArray147[local140] = Static127.method1939(local43);
			}
			this.aFloatArrayArray4 = new float[this.anInt2037][this.anInt2038];
			@Pc(163) int local163;
			@Pc(166) float local166;
			@Pc(168) int local168;
			@Pc(170) int local170;
			if (local27 == 1) {
				for (local163 = 0; local163 < this.anInt2037; local163++) {
					local166 = 0.0F;
					local168 = 1;
					for (local170 = 0; local170 < this.anInt2038; local170++) {
						@Pc(177) int local177 = local163 / local168 % local127;
						@Pc(189) float local189 = (float) this.anIntArray147[local177] * local107 + local103 + local166;
						this.aFloatArrayArray4[local163][local170] = local189;
						if (local118) {
							local166 = local189;
						}
						local168 *= local127;
					}
				}
				return;
			}
			for (local163 = 0; local163 < this.anInt2037; local163++) {
				local166 = 0.0F;
				local168 = local163 * this.anInt2038;
				for (local170 = 0; local170 < this.anInt2038; local170++) {
					@Pc(240) float local240 = (float) this.anIntArray147[local168] * local107 + local103 + local166;
					this.aFloatArrayArray4[local163][local170] = local240;
					if (local118) {
						local166 = local240;
					}
					local168++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "()[F")
	public float[] method1646() {
		return this.aFloatArrayArray4[this.method1649()];
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "()V")
	private void method1647() {
		@Pc(3) int[] local3 = new int[this.anInt2037];
		@Pc(6) int[] local6 = new int[33];
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(26) int local26;
		@Pc(40) int local40;
		@Pc(49) int local49;
		@Pc(54) int local54;
		@Pc(63) int local63;
		for (@Pc(8) int local8 = 0; local8 < this.anInt2037; local8++) {
			local14 = this.anIntArray146[local8];
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
		this.anIntArray148 = new int[8];
		local14 = 0;
		for (local22 = 0; local22 < this.anInt2037; local22++) {
			local26 = this.anIntArray146[local22];
			if (local26 != 0) {
				local40 = local3[local22];
				local49 = 0;
				for (local54 = 0; local54 < local26; local54++) {
					local63 = Integer.MIN_VALUE >>> local54;
					if ((local40 & local63) == 0) {
						local49++;
					} else {
						if (this.anIntArray148[local49] == 0) {
							this.anIntArray148[local49] = local14;
						}
						local49 = this.anIntArray148[local49];
					}
					if (local49 >= this.anIntArray148.length) {
						@Pc(178) int[] local178 = new int[this.anIntArray148.length * 2];
						for (@Pc(180) int local180 = 0; local180 < this.anIntArray148.length; local180++) {
							local178[local180] = this.anIntArray148[local180];
						}
						this.anIntArray148 = local178;
					}
				}
				this.anIntArray148[local49] = ~local22;
				if (local49 >= local14) {
					local14 = local49 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "()I")
	public int method1649() {
		@Pc(1) int local1;
		for (local1 = 0; this.anIntArray148[local1] >= 0; local1 = Static127.method1940() == 0 ? local1 + 1 : this.anIntArray148[local1]) {
		}
		return ~this.anIntArray148[local1];
	}
}
