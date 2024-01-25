import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class1_Sub3_Sub7 extends Class1_Sub3 {

	@OriginalMember(owner = "client!cj", name = "G", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!cj", name = "P", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
	public int anInt1703 = 1638;

	@OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
	public int anInt1702 = 0;

	@OriginalMember(owner = "client!cj", name = "H", descriptor = "I")
	public int anInt1704 = 4;

	@OriginalMember(owner = "client!cj", name = "E", descriptor = "[B")
	private byte[] aByteArray22 = new byte[512];

	@OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
	public int anInt1711 = 4;

	@OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
	public int anInt1709 = 4;

	@OriginalMember(owner = "client!cj", name = "M", descriptor = "Z")
	public boolean aBoolean121 = true;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
	private void method1681() {
		@Pc(25) int local25;
		if (this.anInt1703 > 0) {
			this.aShortArray22 = new short[this.anInt1709];
			this.aShortArray21 = new short[this.anInt1709];
			for (local25 = 0; local25 < this.anInt1709; local25++) {
				this.aShortArray22[local25] = (short) (Math.pow((double) ((float) this.anInt1703 / 4096.0F), (double) local25) * 4096.0D);
				this.aShortArray21[local25] = (short) Math.pow(2.0D, (double) local25);
			}
		} else if (this.aShortArray22 != null && this.anInt1709 == this.aShortArray22.length) {
			this.aShortArray21 = new short[this.anInt1709];
			for (local25 = 0; local25 < this.anInt1709; local25++) {
				this.aShortArray21[local25] = (short) Math.pow(2.0D, (double) local25);
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean121 = arg0.method3043() == 1;
		} else if (arg1 == 1) {
			this.anInt1709 = arg0.method3043();
		} else if (arg1 == 2) {
			this.anInt1703 = arg0.method3058();
			if (this.anInt1703 < 0) {
				this.aShortArray22 = new short[this.anInt1709];
				for (@Pc(69) int local69 = 0; local69 < this.anInt1709; local69++) {
					this.aShortArray22[local69] = (short) arg0.method3058();
				}
			}
		} else if (arg1 == 3) {
			this.anInt1711 = this.anInt1704 = arg0.method3043();
		} else if (arg1 == 4) {
			this.anInt1702 = arg0.method3043();
		} else if (arg1 == 5) {
			this.anInt1711 = arg0.method3043();
		} else if (arg1 == 6) {
			this.anInt1704 = arg0.method3043();
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I[II)V")
	public void method1682(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = Static305.anIntArray416[arg1] * this.anInt1704;
		@Pc(109) int local109;
		@Pc(123) int local123;
		@Pc(40) int local40;
		@Pc(25) short local25;
		@Pc(101) int local101;
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(47) int local47;
		@Pc(90) int local90;
		@Pc(64) int local64;
		@Pc(68) int local68;
		@Pc(86) int local86;
		@Pc(99) int local99;
		if (this.anInt1709 == 1) {
			local25 = this.aShortArray22[0];
			local40 = this.aShortArray21[0] << 12;
			local47 = this.anInt1704 * local40 >> 12;
			local60 = local40 * this.anInt1711 >> 12;
			local53 = local40 * local16 >> 12;
			local64 = local53 >> 12;
			local68 = local64 + 1;
			if (local68 >= local47) {
				local68 = 0;
			}
			local53 &= 0xFFF;
			local90 = Class253.anIntArray788[local53];
			local86 = this.aByteArray22[local64 & 0xFF] & 0xFF;
			local99 = this.aByteArray22[local68 & 0xFF] & 0xFF;
			if (this.aBoolean121) {
				for (local101 = 0; local101 < Static236.anInt4609; local101++) {
					local109 = this.anInt1711 * Static201.anIntArray324[local101];
					local123 = this.method1685(local86, local53, local60, local90, local99, local109 * local40 >> 12);
					local123 = local25 * local123 >> 12;
					arg0[local101] = (local123 >> 1) + 2048;
				}
			} else {
				for (local101 = 0; local101 < Static236.anInt4609; local101++) {
					local109 = Static201.anIntArray324[local101] * this.anInt1711;
					local123 = this.method1685(local86, local53, local60, local90, local99, local109 * local40 >> 12);
					arg0[local101] = local25 * local123 >> 12;
				}
			}
			return;
		}
		local25 = this.aShortArray22[0];
		if (local25 > 8 || local25 < -8) {
			local40 = this.aShortArray21[0] << 12;
			local47 = local40 * this.anInt1704 >> 12;
			local53 = local40 * local16 >> 12;
			local60 = this.anInt1711 * local40 >> 12;
			local64 = local53 >> 12;
			local68 = local64 + 1;
			if (local47 <= local68) {
				local68 = 0;
			}
			local53 &= 0xFFF;
			local86 = this.aByteArray22[local64 & 0xFF] & 0xFF;
			local90 = Class253.anIntArray788[local53];
			local99 = this.aByteArray22[local68 & 0xFF] & 0xFF;
			for (local101 = 0; local101 < Static236.anInt4609; local101++) {
				local109 = Static201.anIntArray324[local101] * this.anInt1711;
				local123 = this.method1685(local86, local53, local60, local90, local99, local109 * local40 >> 12);
				arg0[local101] = local123 * local25 >> 12;
			}
		}
		for (@Pc(137) int local137 = 1; local137 < this.anInt1709; local137++) {
			local25 = this.aShortArray22[local137];
			if (local25 > 8 || local25 < -8) {
				local40 = this.aShortArray21[local137] << 12;
				local53 = local40 * local16 >> 12;
				local47 = this.anInt1704 * local40 >> 12;
				local60 = this.anInt1711 * local40 >> 12;
				local64 = local53 >> 12;
				local68 = local64 + 1;
				local53 &= 0xFFF;
				if (local47 <= local68) {
					local68 = 0;
				}
				local86 = this.aByteArray22[local64 & 0xFF] & 0xFF;
				local90 = Class253.anIntArray788[local53];
				local99 = this.aByteArray22[local68 & 0xFF] & 0xFF;
				if (this.aBoolean121 && local137 == this.anInt1709 - 1) {
					for (local101 = 0; local101 < Static236.anInt4609; local101++) {
						local109 = this.anInt1711 * Static201.anIntArray324[local101];
						local123 = this.method1685(local86, local53, local60, local90, local99, local40 * local109 >> 12);
						local123 = arg0[local101] + (local25 * local123 >> 12);
						arg0[local101] = (local123 >> 1) + 2048;
					}
				} else {
					for (local101 = 0; local101 < Static236.anInt4609; local101++) {
						local109 = this.anInt1711 * Static201.anIntArray324[local101];
						local123 = this.method1685(local86, local53, local60, local90, local99, local109 * local40 >> 12);
						arg0[local101] += local123 * local25 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			this.method1682(local15, arg0);
		}
		return local15;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BIIIIII)I")
	private int method1685(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg5 >> 12;
		@Pc(11) int local11 = local7 + 1;
		@Pc(15) int local15 = arg5 & 0xFFF;
		@Pc(19) int local19 = local7 & 0xFF;
		if (arg2 <= local11) {
			local11 = 0;
		}
		local11 &= 0xFF;
		@Pc(32) int local32 = local15 - 4096;
		@Pc(36) int local36 = arg1 - 4096;
		@Pc(40) int local40 = Class253.anIntArray788[local15];
		@Pc(49) int local49 = this.aByteArray22[arg0 + local19] & 0x3;
		@Pc(76) int local76;
		if (local49 <= 1) {
			local76 = local49 == 0 ? local15 + arg1 : arg1 - local15;
		} else {
			local76 = local49 == 2 ? local15 - arg1 : -local15 + -arg1;
		}
		local49 = this.aByteArray22[arg0 + local11] & 0x3;
		@Pc(116) int local116;
		if (local49 <= 1) {
			local116 = local49 == 0 ? arg1 + local32 : arg1 + -local32;
		} else {
			local116 = local49 == 2 ? local32 - arg1 : -arg1 + -local32;
		}
		@Pc(144) int local144 = (local40 * (local116 - local76) >> 12) + local76;
		local49 = this.aByteArray22[local19 + arg4] & 0x3;
		if (local49 > 1) {
			local76 = local49 == 2 ? local15 - local36 : -local15 - local36;
		} else {
			local76 = local49 == 0 ? local36 + local15 : -local15 + local36;
		}
		local49 = this.aByteArray22[arg4 + local11] & 0x3;
		if (local49 <= 1) {
			local116 = local49 == 0 ? local36 + local32 : local36 - local32;
		} else {
			local116 = local49 == 2 ? local32 - local36 : -local36 + -local32;
		}
		@Pc(238) int local238 = local76 + ((local116 - local76) * local40 >> 12);
		return ((local238 - local144) * arg3 >> 12) + local144;
	}

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "(I)V")
	@Override
	public void method7912() {
		this.aByteArray22 = Static320.method5237(this.anInt1702);
		this.method1681();
		for (@Pc(23) int local23 = this.anInt1709 - 1; local23 >= 1; local23--) {
			@Pc(29) short local29 = this.aShortArray22[local23];
			if (local29 > 8 || local29 < -8) {
				return;
			}
			this.anInt1709--;
		}
	}
}
