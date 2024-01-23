import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class8_Sub3_Sub35 extends Class8_Sub3 {

	@OriginalMember(owner = "client!ti", name = "K", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!ti", name = "Q", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!ti", name = "U", descriptor = "[B")
	private byte[] aByteArray48 = new byte[512];

	@OriginalMember(owner = "client!ti", name = "Y", descriptor = "I")
	public int anInt5064 = 4;

	@OriginalMember(owner = "client!ti", name = "cb", descriptor = "I")
	public int anInt5068 = 4;

	@OriginalMember(owner = "client!ti", name = "X", descriptor = "I")
	public int anInt5063 = 4;

	@OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
	public int anInt5054 = 1638;

	@OriginalMember(owner = "client!ti", name = "W", descriptor = "I")
	public int anInt5062 = 0;

	@OriginalMember(owner = "client!ti", name = "ib", descriptor = "Z")
	public boolean aBoolean409 = true;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			this.method3848(local15, arg0);
		}
		return local15;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.aBoolean409 = arg1.method2334() == 1;
		} else if (arg0 == 1) {
			this.anInt5068 = arg1.method2334();
		} else if (arg0 == 2) {
			this.anInt5054 = arg1.method2360();
			if (this.anInt5054 < 0) {
				this.aShortArray54 = new short[this.anInt5068];
				for (@Pc(84) int local84 = 0; local84 < this.anInt5068; local84++) {
					this.aShortArray54[local84] = (short) arg1.method2360();
				}
			}
		} else if (arg0 == 3) {
			this.anInt5063 = this.anInt5064 = arg1.method2334();
		} else if (arg0 == 4) {
			this.anInt5062 = arg1.method2334();
		} else if (arg0 == 5) {
			this.anInt5063 = arg1.method2334();
		} else if (arg0 == 6) {
			this.anInt5064 = arg1.method2334();
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIIZ)I")
	private int method3847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) int local9 = arg5 - 4096;
		@Pc(13) int local13 = arg1 >> 12;
		@Pc(17) int local17 = local13 + 1;
		@Pc(26) int local26 = local13 & 0xFF;
		@Pc(35) int local35 = this.aByteArray48[arg0 + local26] & 0x3;
		@Pc(39) int local39 = arg1 & 0xFFF;
		if (local17 >= arg4) {
			local17 = 0;
		}
		@Pc(53) int local53 = local39 - 4096;
		local17 &= 0xFF;
		@Pc(61) int local61 = Class23.anIntArray52[local39];
		@Pc(81) int local81;
		if (local35 <= 1) {
			local81 = local35 == 0 ? local39 + arg5 : -local39 + arg5;
		} else {
			local81 = local35 == 2 ? local39 - arg5 : -local39 - arg5;
		}
		local35 = this.aByteArray48[local17 + arg0] & 0x3;
		@Pc(124) int local124;
		if (local35 > 1) {
			local124 = local35 == 2 ? local53 - arg5 : -arg5 + -local53;
		} else {
			local124 = local35 == 0 ? local53 + arg5 : arg5 + -local53;
		}
		@Pc(152) int local152 = local81 + ((local124 - local81) * local61 >> 12);
		local35 = this.aByteArray48[local26 + arg3] & 0x3;
		if (local35 > 1) {
			local81 = local35 == 2 ? local39 - local9 : -local9 + -local39;
		} else {
			local81 = local35 == 0 ? local39 + local9 : -local39 + local9;
		}
		local35 = this.aByteArray48[arg3 + local17] & 0x3;
		if (local35 <= 1) {
			local124 = local35 == 0 ? local9 + local53 : local9 - local53;
		} else {
			local124 = local35 == 2 ? local53 - local9 : -local9 + -local53;
		}
		@Pc(250) int local250 = (local61 * (local124 - local81) >> 12) + local81;
		return (arg2 * (local250 - local152) >> 12) + local152;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I[II)V")
	public void method3848(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = Static33.anIntArray50[arg1] * this.anInt5064;
		@Pc(122) int local122;
		@Pc(136) int local136;
		@Pc(39) int local39;
		@Pc(32) short local32;
		@Pc(108) int local108;
		@Pc(45) int local45;
		@Pc(60) int local60;
		@Pc(84) int local84;
		@Pc(68) int local68;
		@Pc(49) int local49;
		@Pc(64) int local64;
		@Pc(77) int local77;
		@Pc(103) int local103;
		if (this.anInt5068 == 1) {
			local32 = this.aShortArray54[0];
			local39 = this.aShortArray55[0] << 12;
			local45 = local39 * local12 >> 12;
			local49 = local45 >> 12;
			@Pc(53) int local53 = local45 & 0xFFF;
			local60 = this.anInt5063 * local39 >> 12;
			local64 = local49 + 1;
			local68 = Class23.anIntArray52[local53];
			local77 = this.aByteArray48[local49 & 0xFF] & 0xFF;
			local84 = this.anInt5064 * local39 >> 12;
			if (local64 >= local84) {
				local64 = 0;
			}
			local103 = this.aByteArray48[local64 & 0xFF] & 0xFF;
			if (this.aBoolean409) {
				for (local108 = 0; local108 < Static239.anInt4789; local108++) {
					local122 = Static171.anIntArray258[local108] * this.anInt5063;
					local136 = this.method3847(local77, local122 * local39 >> 12, local68, local103, local60, local53);
					local136 = local32 * local136 >> 12;
					arg0[local108] = (local136 >> 1) + 2048;
				}
			} else {
				for (local108 = 0; local108 < Static239.anInt4789; local108++) {
					local122 = this.anInt5063 * Static171.anIntArray258[local108];
					local136 = this.method3847(local77, local39 * local122 >> 12, local68, local103, local60, local53);
					arg0[local108] = local32 * local136 >> 12;
				}
			}
			return;
		}
		local32 = this.aShortArray54[0];
		if (local32 > 8 || local32 < -8) {
			local39 = this.aShortArray55[0] << 12;
			local84 = local39 * this.anInt5064 >> 12;
			local45 = local12 * local39 >> 12;
			local60 = this.anInt5063 * local39 >> 12;
			local49 = local45 >> 12;
			local45 &= 0xFFF;
			local64 = local49 + 1;
			local68 = Class23.anIntArray52[local45];
			local77 = this.aByteArray48[local49 & 0xFF] & 0xFF;
			if (local64 >= local84) {
				local64 = 0;
			}
			local103 = this.aByteArray48[local64 & 0xFF] & 0xFF;
			for (local108 = 0; local108 < Static239.anInt4789; local108++) {
				local122 = Static171.anIntArray258[local108] * this.anInt5063;
				local136 = this.method3847(local77, local39 * local122 >> 12, local68, local103, local60, local45);
				arg0[local108] = local32 * local136 >> 12;
			}
		}
		for (@Pc(320) int local320 = 1; local320 < this.anInt5068; local320++) {
			local32 = this.aShortArray54[local320];
			if (local32 > 8 || local32 < -8) {
				local39 = this.aShortArray55[local320] << 12;
				local45 = local12 * local39 >> 12;
				local60 = local39 * this.anInt5063 >> 12;
				local84 = this.anInt5064 * local39 >> 12;
				local49 = local45 >> 12;
				local77 = this.aByteArray48[local49 & 0xFF] & 0xFF;
				local64 = local49 + 1;
				local45 &= 0xFFF;
				local68 = Class23.anIntArray52[local45];
				if (local64 >= local84) {
					local64 = 0;
				}
				local103 = this.aByteArray48[local64 & 0xFF] & 0xFF;
				if (this.aBoolean409 && this.anInt5068 - 1 == local320) {
					for (local108 = 0; local108 < Static239.anInt4789; local108++) {
						local122 = Static171.anIntArray258[local108] * this.anInt5063;
						local136 = this.method3847(local77, local39 * local122 >> 12, local68, local103, local60, local45);
						local136 = (local136 * local32 >> 12) + arg0[local108];
						arg0[local108] = (local136 >> 1) + 2048;
					}
				} else {
					for (local108 = 0; local108 < Static239.anInt4789; local108++) {
						local122 = Static171.anIntArray258[local108] * this.anInt5063;
						local136 = this.method3847(local77, local122 * local39 >> 12, local68, local103, local60, local45);
						arg0[local108] += local136 * local32 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V")
	@Override
	public void method4220() {
		this.aByteArray48 = Static119.method1928(this.anInt5062);
		this.method3849();
		for (@Pc(23) int local23 = this.anInt5068 - 1; local23 >= 1; local23--) {
			@Pc(31) short local31 = this.aShortArray54[local23];
			if (local31 > 8 || local31 < -8) {
				break;
			}
			this.anInt5068--;
		}
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)V")
	private void method3849() {
		@Pc(25) int local25;
		if (this.anInt5054 > 0) {
			this.aShortArray54 = new short[this.anInt5068];
			this.aShortArray55 = new short[this.anInt5068];
			for (local25 = 0; local25 < this.anInt5068; local25++) {
				this.aShortArray54[local25] = (short) (Math.pow((double) ((float) this.anInt5054 / 4096.0F), (double) local25) * 4096.0D);
				this.aShortArray55[local25] = (short) Math.pow(2.0D, (double) local25);
			}
		} else if (this.aShortArray54 != null && this.anInt5068 == this.aShortArray54.length) {
			this.aShortArray55 = new short[this.anInt5068];
			for (local25 = 0; local25 < this.anInt5068; local25++) {
				this.aShortArray55[local25] = (short) Math.pow(2.0D, (double) local25);
			}
		}
	}
}
