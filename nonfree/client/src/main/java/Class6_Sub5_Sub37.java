import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class6_Sub5_Sub37 extends Class6_Sub5 {

	@OriginalMember(owner = "client!vq", name = "R", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!vq", name = "bb", descriptor = "[S")
	private short[] aShortArray112;

	@OriginalMember(owner = "client!vq", name = "M", descriptor = "Z")
	public boolean aBoolean482 = true;

	@OriginalMember(owner = "client!vq", name = "S", descriptor = "I")
	public int anInt7653 = 4;

	@OriginalMember(owner = "client!vq", name = "O", descriptor = "[B")
	private byte[] aByteArray94 = new byte[512];

	@OriginalMember(owner = "client!vq", name = "N", descriptor = "I")
	public int anInt7650 = 0;

	@OriginalMember(owner = "client!vq", name = "X", descriptor = "I")
	public int anInt7657 = 4;

	@OriginalMember(owner = "client!vq", name = "Y", descriptor = "I")
	public int anInt7658 = 1638;

	@OriginalMember(owner = "client!vq", name = "P", descriptor = "I")
	public int anInt7651 = 4;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			this.method6263(arg0, local9);
		}
		return local9;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I[IB)V")
	public void method6263(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(12) int local12 = Static247.anIntArray318[arg0] * this.anInt7653;
		@Pc(105) int local105;
		@Pc(119) int local119;
		@Pc(27) int local27;
		@Pc(32) short local32;
		@Pc(96) int local96;
		@Pc(52) int local52;
		@Pc(46) int local46;
		@Pc(39) int local39;
		@Pc(91) int local91;
		@Pc(56) int local56;
		@Pc(60) int local60;
		@Pc(87) int local87;
		@Pc(78) int local78;
		if (this.anInt7657 == 1) {
			local27 = this.aShortArray111[0] << 12;
			local32 = this.aShortArray112[0];
			local39 = this.anInt7653 * local27 >> 12;
			local46 = local27 * this.anInt7651 >> 12;
			local52 = local12 * local27 >> 12;
			local56 = local52 >> 12;
			local60 = local56 + 1;
			local52 &= 0xFFF;
			if (local39 <= local60) {
				local60 = 0;
			}
			local78 = this.aByteArray94[local60 & 0xFF] & 0xFF;
			local87 = this.aByteArray94[local56 & 0xFF] & 0xFF;
			local91 = Class6_Sub37.anIntArray410[local52];
			if (this.aBoolean482) {
				for (local96 = 0; local96 < Static240.anInt4386; local96++) {
					local105 = Static80.anIntArray117[local96] * this.anInt7651;
					local119 = this.method6265(local46, local91, local87, local78, local52, local105 * local27 >> 12);
					local119 = local119 * local32 >> 12;
					arg1[local96] = (local119 >> 1) + 2048;
				}
			} else {
				for (local96 = 0; local96 < Static240.anInt4386; local96++) {
					local105 = this.anInt7651 * Static80.anIntArray117[local96];
					local119 = this.method6265(local46, local91, local87, local78, local52, local105 * local27 >> 12);
					arg1[local96] = local119 * local32 >> 12;
				}
			}
			return;
		}
		local32 = this.aShortArray112[0];
		if (local32 > 8 || local32 < -8) {
			local27 = this.aShortArray111[0] << 12;
			local39 = this.anInt7653 * local27 >> 12;
			local46 = this.anInt7651 * local27 >> 12;
			local52 = local27 * local12 >> 12;
			local56 = local52 >> 12;
			local60 = local56 + 1;
			if (local60 >= local39) {
				local60 = 0;
			}
			local52 &= 0xFFF;
			local78 = this.aByteArray94[local60 & 0xFF] & 0xFF;
			local91 = Class6_Sub37.anIntArray410[local52];
			local87 = this.aByteArray94[local56 & 0xFF] & 0xFF;
			for (local96 = 0; local96 < Static240.anInt4386; local96++) {
				local105 = Static80.anIntArray117[local96] * this.anInt7651;
				local119 = this.method6265(local46, local91, local87, local78, local52, local105 * local27 >> 12);
				arg1[local96] = local32 * local119 >> 12;
			}
		}
		for (@Pc(298) int local298 = 1; local298 < this.anInt7657; local298++) {
			local32 = this.aShortArray112[local298];
			if (local32 > 8 || local32 < -8) {
				local27 = this.aShortArray111[local298] << 12;
				local39 = local27 * this.anInt7653 >> 12;
				local52 = local27 * local12 >> 12;
				local46 = local27 * this.anInt7651 >> 12;
				local56 = local52 >> 12;
				local60 = local56 + 1;
				local52 &= 0xFFF;
				if (local39 <= local60) {
					local60 = 0;
				}
				local78 = this.aByteArray94[local60 & 0xFF] & 0xFF;
				local87 = this.aByteArray94[local56 & 0xFF] & 0xFF;
				local91 = Class6_Sub37.anIntArray410[local52];
				if (this.aBoolean482 && this.anInt7657 - 1 == local298) {
					for (local96 = 0; local96 < Static240.anInt4386; local96++) {
						local105 = Static80.anIntArray117[local96] * this.anInt7651;
						local119 = this.method6265(local46, local91, local87, local78, local52, local105 * local27 >> 12);
						local119 = (local32 * local119 >> 12) + arg1[local96];
						arg1[local96] = (local119 >> 1) + 2048;
					}
				} else {
					for (local96 = 0; local96 < Static240.anInt4386; local96++) {
						local105 = this.anInt7651 * Static80.anIntArray117[local96];
						local119 = this.method6265(local46, local91, local87, local78, local52, local105 * local27 >> 12);
						arg1[local96] += local32 * local119 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.aBoolean482 = arg1.method6433() == 1;
		} else if (arg0 == 1) {
			this.anInt7657 = arg1.method6433();
		} else if (arg0 == 2) {
			this.anInt7658 = arg1.method6428();
			if (this.anInt7658 < 0) {
				this.aShortArray112 = new short[this.anInt7657];
				for (@Pc(65) int local65 = 0; local65 < this.anInt7657; local65++) {
					this.aShortArray112[local65] = (short) arg1.method6428();
				}
			}
		} else if (arg0 == 3) {
			this.anInt7651 = this.anInt7653 = arg1.method6433();
		} else if (arg0 == 4) {
			this.anInt7650 = arg1.method6433();
		} else if (arg0 == 5) {
			this.anInt7651 = arg1.method6433();
		} else if (arg0 == 6) {
			this.anInt7653 = arg1.method6433();
		}
	}

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "(I)V")
	private void method6264() {
		@Pc(40) int local40;
		if (this.anInt7658 > 0) {
			this.aShortArray112 = new short[this.anInt7657];
			this.aShortArray111 = new short[this.anInt7657];
			for (local40 = 0; local40 < this.anInt7657; local40++) {
				this.aShortArray112[local40] = (short) (Math.pow((double) ((float) this.anInt7658 / 4096.0F), (double) local40) * 4096.0D);
				this.aShortArray111[local40] = (short) Math.pow(2.0D, (double) local40);
			}
		} else if (this.aShortArray112 != null && this.anInt7657 == this.aShortArray112.length) {
			this.aShortArray111 = new short[this.anInt7657];
			for (local40 = 0; local40 < this.anInt7657; local40++) {
				this.aShortArray111[local40] = (short) Math.pow(2.0D, (double) local40);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
	@Override
	public void method6533() {
		this.aByteArray94 = Static75.method1488(this.anInt7650);
		this.method6264();
		for (@Pc(19) int local19 = this.anInt7657 - 1; local19 >= 1; local19--) {
			@Pc(26) short local26 = this.aShortArray112[local19];
			if (local26 > 8 || local26 < -8) {
				break;
			}
			this.anInt7657--;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIBII)I")
	private int method6265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg5 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (arg0 <= local13) {
			local13 = 0;
		}
		local9 &= 0xFF;
		@Pc(26) int local26 = arg5 & 0xFFF;
		@Pc(30) int local30 = arg4 - 4096;
		@Pc(40) int local40 = local26 - 4096;
		local13 &= 0xFF;
		@Pc(48) int local48 = Class6_Sub37.anIntArray410[local26];
		@Pc(57) int local57 = this.aByteArray94[local9 + arg2] & 0x3;
		@Pc(71) int local71;
		if (local57 <= 1) {
			local71 = local57 == 0 ? local26 + arg4 : -local26 + arg4;
		} else {
			local71 = local57 == 2 ? local26 - arg4 : -arg4 + -local26;
		}
		local57 = this.aByteArray94[local13 + arg2] & 0x3;
		@Pc(114) int local114;
		if (local57 > 1) {
			local114 = local57 == 2 ? local40 - arg4 : -local40 + -arg4;
		} else {
			local114 = local57 == 0 ? arg4 + local40 : arg4 + -local40;
		}
		@Pc(141) int local141 = (local48 * (local114 - local71) >> 12) + local71;
		local57 = this.aByteArray94[arg3 + local9] & 0x3;
		if (local57 <= 1) {
			local71 = local57 == 0 ? local26 + local30 : local30 + -local26;
		} else {
			local71 = local57 == 2 ? local26 - local30 : -local26 + -local30;
		}
		local57 = this.aByteArray94[local13 + arg3] & 0x3;
		if (local57 > 1) {
			local114 = local57 == 2 ? local40 - local30 : -local30 + -local40;
		} else {
			local114 = local57 == 0 ? local40 + local30 : local30 - local40;
		}
		@Pc(239) int local239 = (local48 * (local114 - local71) >> 12) + local71;
		return local141 + ((local239 - local141) * arg1 >> 12);
	}
}
