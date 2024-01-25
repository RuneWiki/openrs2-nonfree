import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class4_Sub4_Sub10 extends Class4_Sub4 {

	@OriginalMember(owner = "client!fj", name = "D", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!fj", name = "G", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
	public int anInt2073 = 4;

	@OriginalMember(owner = "client!fj", name = "N", descriptor = "Z")
	public boolean aBoolean144 = true;

	@OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
	public int anInt2076 = 0;

	@OriginalMember(owner = "client!fj", name = "L", descriptor = "I")
	public int anInt2077 = 4;

	@OriginalMember(owner = "client!fj", name = "W", descriptor = "I")
	public int anInt2084 = 4;

	@OriginalMember(owner = "client!fj", name = "H", descriptor = "[B")
	private byte[] aByteArray14 = new byte[512];

	@OriginalMember(owner = "client!fj", name = "V", descriptor = "I")
	public int anInt2083 = 1638;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)V")
	@Override
	public void method6038() {
		this.aByteArray14 = Static412.method5612(this.anInt2076);
		this.method1654();
		for (@Pc(27) int local27 = this.anInt2084 - 1; local27 >= 1; local27--) {
			@Pc(34) short local34 = this.aShortArray26[local27];
			if (local34 > 8) {
				return;
			}
			if (local34 < -8) {
				return;
			}
			this.anInt2084--;
		}
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V")
	private void method1654() {
		@Pc(27) int local27;
		if (this.anInt2083 > 0) {
			this.aShortArray25 = new short[this.anInt2084];
			this.aShortArray26 = new short[this.anInt2084];
			for (local27 = 0; local27 < this.anInt2084; local27++) {
				this.aShortArray26[local27] = (short) (Math.pow((double) ((float) this.anInt2083 / 4096.0F), (double) local27) * 4096.0D);
				this.aShortArray25[local27] = (short) Math.pow(2.0D, (double) local27);
			}
		} else if (this.aShortArray26 != null && this.anInt2084 == this.aShortArray26.length) {
			this.aShortArray25 = new short[this.anInt2084];
			for (local27 = 0; local27 < this.anInt2084; local27++) {
				this.aShortArray25[local27] = (short) Math.pow(2.0D, (double) local27);
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.aBoolean144 = arg1.method5007() == 1;
		} else if (arg0 == 1) {
			this.anInt2084 = arg1.method5007();
		} else if (arg0 == 2) {
			this.anInt2083 = arg1.method5061();
			if (this.anInt2083 < 0) {
				this.aShortArray26 = new short[this.anInt2084];
				for (@Pc(70) int local70 = 0; local70 < this.anInt2084; local70++) {
					this.aShortArray26[local70] = (short) arg1.method5061();
				}
			}
		} else if (arg0 == 3) {
			this.anInt2073 = this.anInt2077 = arg1.method5007();
		} else if (arg0 == 4) {
			this.anInt2076 = arg1.method5007();
		} else if (arg0 == 5) {
			this.anInt2073 = arg1.method5007();
		} else if (arg0 == 6) {
			this.anInt2077 = arg1.method5007();
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(24) int[] local24 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			this.method1656(arg0, local24);
		}
		return local24;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIIII)I")
	private int method1655(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg5 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (local13 >= arg0) {
			local13 = 0;
		}
		@Pc(26) int local26 = arg5 & 0xFFF;
		local9 &= 0xFF;
		local13 &= 0xFF;
		@Pc(38) int local38 = arg1 - 4096;
		@Pc(42) int local42 = local26 - 4096;
		@Pc(46) int local46 = Class4_Sub39.anIntArray494[local26];
		@Pc(56) int local56 = this.aByteArray14[local9 + arg2] & 0x3;
		@Pc(75) int local75;
		if (local56 > 1) {
			local75 = local56 == 2 ? local26 - arg1 : -arg1 + -local26;
		} else {
			local75 = local56 == 0 ? local26 + arg1 : arg1 - local26;
		}
		local56 = this.aByteArray14[local13 + arg2] & 0x3;
		@Pc(126) int local126;
		if (local56 <= 1) {
			local126 = local56 == 0 ? local42 + arg1 : -local42 + arg1;
		} else {
			local126 = local56 == 2 ? local42 - arg1 : -local42 + -arg1;
		}
		local56 = this.aByteArray14[arg4 + local9] & 0x3;
		@Pc(164) int local164 = (local46 * (local126 - local75) >> 12) + local75;
		if (local56 > 1) {
			local75 = local56 == 2 ? local26 - local38 : -local38 + -local26;
		} else {
			local75 = local56 == 0 ? local26 + local38 : local38 + -local26;
		}
		local56 = this.aByteArray14[arg4 + local13] & 0x3;
		if (local56 <= 1) {
			local126 = local56 == 0 ? local42 + local38 : local38 - local42;
		} else {
			local126 = local56 == 2 ? local42 - local38 : -local38 + -local42;
		}
		@Pc(247) int local247 = ((local126 - local75) * local46 >> 12) + local75;
		return (arg3 * (local247 - local164) >> 12) + local164;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI[I)V")
	public void method1656(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = this.anInt2077 * Static334.anIntArray437[arg0];
		@Pc(110) int local110;
		@Pc(124) int local124;
		@Pc(40) int local40;
		@Pc(27) short local27;
		@Pc(101) int local101;
		@Pc(53) int local53;
		@Pc(47) int local47;
		@Pc(60) int local60;
		@Pc(99) int local99;
		@Pc(64) int local64;
		@Pc(68) int local68;
		@Pc(95) int local95;
		@Pc(86) int local86;
		if (this.anInt2084 == 1) {
			local40 = this.aShortArray25[0] << 12;
			local27 = this.aShortArray26[0];
			local53 = local40 * local12 >> 12;
			local47 = local40 * this.anInt2073 >> 12;
			local60 = local40 * this.anInt2077 >> 12;
			local64 = local53 >> 12;
			local68 = local64 + 1;
			if (local68 >= local60) {
				local68 = 0;
			}
			local53 &= 0xFFF;
			local99 = Class4_Sub39.anIntArray494[local53];
			local86 = this.aByteArray14[local68 & 0xFF] & 0xFF;
			local95 = this.aByteArray14[local64 & 0xFF] & 0xFF;
			if (this.aBoolean144) {
				for (local101 = 0; local101 < Static419.anInt6404; local101++) {
					local110 = Static226.anIntArray284[local101] * this.anInt2073;
					local124 = this.method1655(local47, local53, local95, local99, local86, local40 * local110 >> 12);
					local124 = local27 * local124 >> 12;
					arg1[local101] = (local124 >> 1) + 2048;
				}
			} else {
				for (local101 = 0; local101 < Static419.anInt6404; local101++) {
					local110 = this.anInt2073 * Static226.anIntArray284[local101];
					local124 = this.method1655(local47, local53, local95, local99, local86, local110 * local40 >> 12);
					arg1[local101] = local124 * local27 >> 12;
				}
			}
			return;
		}
		local27 = this.aShortArray26[0];
		if (local27 > 8 || local27 < -8) {
			local40 = this.aShortArray25[0] << 12;
			local47 = local40 * this.anInt2073 >> 12;
			local53 = local12 * local40 >> 12;
			local60 = local40 * this.anInt2077 >> 12;
			local64 = local53 >> 12;
			local68 = local64 + 1;
			if (local68 >= local60) {
				local68 = 0;
			}
			local53 &= 0xFFF;
			local86 = this.aByteArray14[local68 & 0xFF] & 0xFF;
			local95 = this.aByteArray14[local64 & 0xFF] & 0xFF;
			local99 = Class4_Sub39.anIntArray494[local53];
			for (local101 = 0; local101 < Static419.anInt6404; local101++) {
				local110 = this.anInt2073 * Static226.anIntArray284[local101];
				local124 = this.method1655(local47, local53, local95, local99, local86, local110 * local40 >> 12);
				arg1[local101] = local124 * local27 >> 12;
			}
		}
		for (@Pc(138) int local138 = 1; local138 < this.anInt2084; local138++) {
			local27 = this.aShortArray26[local138];
			if (local27 > 8 || local27 < -8) {
				local40 = this.aShortArray25[local138] << 12;
				local47 = this.anInt2073 * local40 >> 12;
				local53 = local12 * local40 >> 12;
				local60 = local40 * this.anInt2077 >> 12;
				local64 = local53 >> 12;
				local68 = local64 + 1;
				local53 &= 0xFFF;
				if (local68 >= local60) {
					local68 = 0;
				}
				local99 = Class4_Sub39.anIntArray494[local53];
				local95 = this.aByteArray14[local64 & 0xFF] & 0xFF;
				local86 = this.aByteArray14[local68 & 0xFF] & 0xFF;
				if (this.aBoolean144 && this.anInt2084 - 1 == local138) {
					for (local101 = 0; local101 < Static419.anInt6404; local101++) {
						local110 = this.anInt2073 * Static226.anIntArray284[local101];
						local124 = this.method1655(local47, local53, local95, local99, local86, local110 * local40 >> 12);
						local124 = (local27 * local124 >> 12) + arg1[local101];
						arg1[local101] = (local124 >> 1) + 2048;
					}
				} else {
					for (local101 = 0; local101 < Static419.anInt6404; local101++) {
						local110 = Static226.anIntArray284[local101] * this.anInt2073;
						local124 = this.method1655(local47, local53, local95, local99, local86, local110 * local40 >> 12);
						arg1[local101] += local124 * local27 >> 12;
					}
				}
			}
		}
	}
}
