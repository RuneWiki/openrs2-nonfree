import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fha")
public final class Class5_Sub6_Sub13 extends Class5_Sub6 {

	@OriginalMember(owner = "client!fha", name = "H", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!fha", name = "I", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!fha", name = "B", descriptor = "I")
	public int anInt2704 = 4;

	@OriginalMember(owner = "client!fha", name = "D", descriptor = "I")
	public int anInt2705 = 0;

	@OriginalMember(owner = "client!fha", name = "F", descriptor = "[B")
	private byte[] aByteArray19 = new byte[512];

	@OriginalMember(owner = "client!fha", name = "C", descriptor = "Z")
	public boolean aBoolean188 = true;

	@OriginalMember(owner = "client!fha", name = "P", descriptor = "I")
	public int anInt2714 = 4;

	@OriginalMember(owner = "client!fha", name = "N", descriptor = "I")
	public int anInt2712 = 4;

	@OriginalMember(owner = "client!fha", name = "J", descriptor = "I")
	public int anInt2708 = 1638;

	@OriginalMember(owner = "client!fha", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(B)V")
	@Override
	public void method8118() {
		this.aByteArray19 = Static297.method523(this.anInt2705);
		this.method2420();
		for (@Pc(23) int local23 = this.anInt2714 - 1; local23 >= 1; local23--) {
			@Pc(29) short local29 = this.aShortArray29[local23];
			if (local29 > 8) {
				return;
			}
			if (local29 < -8) {
				return;
			}
			this.anInt2714--;
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(BIIIIII)I")
	private int method2418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg0 >> 12;
		@Pc(11) int local11 = local7 + 1;
		if (local11 >= arg2) {
			local11 = 0;
		}
		local7 &= 0xFF;
		@Pc(24) int local24 = arg0 & 0xFFF;
		local11 &= 0xFF;
		@Pc(40) int local40 = arg1 - 4096;
		@Pc(44) int local44 = local24 - 4096;
		@Pc(53) int local53 = this.aByteArray19[local7 + arg3] & 0x3;
		@Pc(57) int local57 = Class177.anIntArray252[local24];
		@Pc(73) int local73;
		if (local53 <= 1) {
			local73 = local53 == 0 ? local24 + arg1 : arg1 + -local24;
		} else {
			local73 = local53 == 2 ? local24 - arg1 : -arg1 + -local24;
		}
		local53 = this.aByteArray19[arg3 + local11] & 0x3;
		@Pc(117) int local117;
		if (local53 > 1) {
			local117 = local53 == 2 ? local44 - arg1 : -arg1 + -local44;
		} else {
			local117 = local53 == 0 ? local44 + arg1 : arg1 - local44;
		}
		local53 = this.aByteArray19[local7 + arg4] & 0x3;
		@Pc(151) int local151 = local73 + ((local117 - local73) * local57 >> 12);
		if (local53 > 1) {
			local73 = local53 == 2 ? local24 - local40 : -local24 - local40;
		} else {
			local73 = local53 == 0 ? local24 + local40 : -local24 + local40;
		}
		local53 = this.aByteArray19[arg4 + local11] & 0x3;
		if (local53 <= 1) {
			local117 = local53 == 0 ? local40 + local44 : -local44 + local40;
		} else {
			local117 = local53 == 2 ? local44 - local40 : -local44 + -local40;
		}
		@Pc(234) int local234 = (local57 * (local117 - local73) >> 12) + local73;
		return local151 + (arg5 * (local234 - local151) >> 12);
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean188 = arg0.method3642() == 1;
		} else if (arg1 == 1) {
			this.anInt2714 = arg0.method3642();
		} else if (arg1 == 2) {
			this.anInt2708 = arg0.method3638();
			if (this.anInt2708 < 0) {
				this.aShortArray29 = new short[this.anInt2714];
				for (@Pc(77) int local77 = 0; local77 < this.anInt2714; local77++) {
					this.aShortArray29[local77] = (short) arg0.method3638();
				}
			}
		} else if (arg1 == 3) {
			this.anInt2712 = this.anInt2704 = arg0.method3642();
		} else if (arg1 == 4) {
			this.anInt2705 = arg0.method3642();
		} else if (arg1 == 5) {
			this.anInt2712 = arg0.method3642();
		} else if (arg1 == 6) {
			this.anInt2704 = arg0.method3642();
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(I[IB)V")
	public void method2419(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(10) int local10 = this.anInt2704 * Static508.anIntArray471[arg0];
		@Pc(113) int local113;
		@Pc(127) int local127;
		@Pc(40) int local40;
		@Pc(27) short local27;
		@Pc(105) int local105;
		@Pc(53) int local53;
		@Pc(47) int local47;
		@Pc(60) int local60;
		@Pc(85) int local85;
		@Pc(64) int local64;
		@Pc(68) int local68;
		@Pc(103) int local103;
		@Pc(94) int local94;
		if (this.anInt2714 == 1) {
			local27 = this.aShortArray29[0];
			local40 = this.aShortArray28[0] << 12;
			local60 = local40 * this.anInt2704 >> 12;
			local53 = local40 * local10 >> 12;
			local47 = local40 * this.anInt2712 >> 12;
			local64 = local53 >> 12;
			local68 = local64 + 1;
			if (local68 >= local60) {
				local68 = 0;
			}
			local53 &= 0xFFF;
			local103 = this.aByteArray19[local64 & 0xFF] & 0xFF;
			local85 = Class177.anIntArray252[local53];
			local94 = this.aByteArray19[local68 & 0xFF] & 0xFF;
			if (this.aBoolean188) {
				for (local105 = 0; local105 < Static421.anInt7443; local105++) {
					local113 = this.anInt2712 * Static207.anIntArray185[local105];
					local127 = this.method2418(local113 * local40 >> 12, local53, local47, local103, local94, local85);
					@Pc(475) int local475 = local27 * local127 >> 12;
					arg1[local105] = (local475 >> 1) + 2048;
				}
			} else {
				for (local105 = 0; local105 < Static421.anInt7443; local105++) {
					local113 = Static207.anIntArray185[local105] * this.anInt2712;
					local127 = this.method2418(local113 * local40 >> 12, local53, local47, local103, local94, local85);
					arg1[local105] = local127 * local27 >> 12;
				}
			}
			return;
		}
		local27 = this.aShortArray29[0];
		if (local27 > 8 || local27 < -8) {
			local40 = this.aShortArray28[0] << 12;
			local47 = this.anInt2712 * local40 >> 12;
			local53 = local40 * local10 >> 12;
			local60 = this.anInt2704 * local40 >> 12;
			local64 = local53 >> 12;
			local68 = local64 + 1;
			if (local60 <= local68) {
				local68 = 0;
			}
			local53 &= 0xFFF;
			local85 = Class177.anIntArray252[local53];
			local94 = this.aByteArray19[local68 & 0xFF] & 0xFF;
			local103 = this.aByteArray19[local64 & 0xFF] & 0xFF;
			for (local105 = 0; local105 < Static421.anInt7443; local105++) {
				local113 = Static207.anIntArray185[local105] * this.anInt2712;
				local127 = this.method2418(local40 * local113 >> 12, local53, local47, local103, local94, local85);
				arg1[local105] = local27 * local127 >> 12;
			}
		}
		for (@Pc(141) int local141 = 1; local141 < this.anInt2714; local141++) {
			local27 = this.aShortArray29[local141];
			if (local27 > 8 || local27 < -8) {
				local40 = this.aShortArray28[local141] << 12;
				local53 = local10 * local40 >> 12;
				local60 = local40 * this.anInt2704 >> 12;
				local47 = this.anInt2712 * local40 >> 12;
				local64 = local53 >> 12;
				local68 = local64 + 1;
				local53 &= 0xFFF;
				if (local68 >= local60) {
					local68 = 0;
				}
				local103 = this.aByteArray19[local64 & 0xFF] & 0xFF;
				local85 = Class177.anIntArray252[local53];
				local94 = this.aByteArray19[local68 & 0xFF] & 0xFF;
				if (this.aBoolean188 && this.anInt2714 - 1 == local141) {
					for (local105 = 0; local105 < Static421.anInt7443; local105++) {
						local113 = Static207.anIntArray185[local105] * this.anInt2712;
						local127 = this.method2418(local40 * local113 >> 12, local53, local47, local103, local94, local85);
						local127 = (local27 * local127 >> 12) + arg1[local105];
						arg1[local105] = (local127 >> 1) + 2048;
					}
				} else {
					for (local105 = 0; local105 < Static421.anInt7443; local105++) {
						local113 = this.anInt2712 * Static207.anIntArray185[local105];
						local127 = this.method2418(local40 * local113 >> 12, local53, local47, local103, local94, local85);
						arg1[local105] += local27 * local127 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fha", name = "e", descriptor = "(B)V")
	private void method2420() {
		@Pc(25) int local25;
		if (this.anInt2708 > 0) {
			this.aShortArray28 = new short[this.anInt2714];
			this.aShortArray29 = new short[this.anInt2714];
			for (local25 = 0; local25 < this.anInt2714; local25++) {
				this.aShortArray29[local25] = (short) (int) (Math.pow((double) ((float) this.anInt2708 / 4096.0F), (double) local25) * 4096.0D);
				this.aShortArray28[local25] = (short) (int) Math.pow(2.0D, (double) local25);
			}
		} else if (this.aShortArray29 != null && this.aShortArray29.length == this.anInt2714) {
			this.aShortArray28 = new short[this.anInt2714];
			for (local25 = 0; local25 < this.anInt2714; local25++) {
				this.aShortArray28[local25] = (short) (int) Math.pow(2.0D, (double) local25);
			}
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			this.method2419(arg0, local9);
		}
		return local9;
	}
}
