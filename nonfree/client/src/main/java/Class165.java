import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class165 {

	@OriginalMember(owner = "client!hs", name = "C", descriptor = "[[I")
	public int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!hs", name = "l", descriptor = "[I")
	public int[] anIntArray221;

	@OriginalMember(owner = "client!hs", name = "x", descriptor = "Lclient!sda;")
	public Class317 aClass317_2;

	@OriginalMember(owner = "client!hs", name = "A", descriptor = "[Z")
	public boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!hs", name = "m", descriptor = "[I")
	public int[] anIntArray222;

	@OriginalMember(owner = "client!hs", name = "h", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!hs", name = "F", descriptor = "[I")
	public int[] anIntArray224;

	@OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
	public int anInt3916;

	@OriginalMember(owner = "client!hs", name = "v", descriptor = "[I")
	public int[] anIntArray225;

	@OriginalMember(owner = "client!hs", name = "D", descriptor = "[I")
	public int[] anIntArray226;

	@OriginalMember(owner = "client!hs", name = "j", descriptor = "Z")
	public boolean aBoolean303 = false;

	@OriginalMember(owner = "client!hs", name = "p", descriptor = "I")
	public int anInt3910 = 5;

	@OriginalMember(owner = "client!hs", name = "G", descriptor = "Z")
	public boolean aBoolean304 = false;

	@OriginalMember(owner = "client!hs", name = "z", descriptor = "I")
	public int anInt3907 = -1;

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
	public int anInt3904 = -1;

	@OriginalMember(owner = "client!hs", name = "w", descriptor = "I")
	public int anInt3913 = 99;

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "Z")
	public boolean aBoolean305 = false;

	@OriginalMember(owner = "client!hs", name = "E", descriptor = "I")
	public int anInt3912 = -1;

	@OriginalMember(owner = "client!hs", name = "u", descriptor = "I")
	public int anInt3919 = 2;

	@OriginalMember(owner = "client!hs", name = "s", descriptor = "I")
	public int anInt3920 = -1;

	@OriginalMember(owner = "client!hs", name = "t", descriptor = "Z")
	public boolean aBoolean306 = false;

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
	public int anInt3921 = -1;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIZ)I")
	public int method3393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (arg0 != -1149698992) {
			Static234.method3394(85);
		}
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(19) int local19 = this.anIntArray226[arg2];
		@Pc(21) Class5_Sub5_Sub15 local21 = null;
		@Pc(29) Class5_Sub5_Sub15 local29 = this.aClass317_2.method7883(local19 >> 16, 64);
		@Pc(33) int local33 = local19 & 0xFFFF;
		if (local29 == null) {
			return 0;
		}
		if ((this.aBoolean303 || Static95.aBoolean147) && arg1 != -1 && this.anIntArray226.length > arg1) {
			local14 = this.anIntArray226[arg1];
			local21 = this.aClass317_2.method7883(local14 >> 16, 64);
			local14 &= 0xFFFF;
		}
		if (this.aBoolean306) {
			local12 = 512;
		}
		if (local29.method4805(local33, -25695)) {
			local12 |= 0x80;
		}
		if (local29.method4801(local33, (byte) 93)) {
			local12 |= 0x100;
		}
		if (local29.method4799(local33)) {
			local12 |= 0x400;
		}
		if (local21 != null) {
			if (local21.method4805(local14, -25695)) {
				local12 |= 0x80;
			}
			if (local21.method4801(local14, (byte) 93)) {
				local12 |= 0x100;
			}
			if (local21.method4799(local14)) {
				local12 |= 0x400;
			}
		}
		if (this.anIntArray223 != null && arg3) {
			@Pc(167) int local167;
			@Pc(180) Class5_Sub5_Sub15 local180;
			if (this.anIntArray223.length > arg2) {
				local167 = this.anIntArray223[arg2];
				if (local167 != 65535) {
					local180 = this.aClass317_2.method7883(local167 >> 16, 64);
					local167 &= 0xFFFF;
					if (local180 != null) {
						if (local180.method4805(local167, arg0 + 1149673297)) {
							local12 |= 0x80;
						}
						if (local180.method4801(local167, (byte) 93)) {
							local12 |= 0x100;
						}
						if (local180.method4799(local167)) {
							local12 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean303 || Static95.aBoolean147) && arg1 != -1 && arg1 < this.anIntArray223.length) {
				local167 = this.anIntArray223[arg1];
				if (local167 != 65535) {
					local180 = this.aClass317_2.method7883(local167 >> 16, 64);
					local167 &= 0xFFFF;
					if (local180 != null) {
						if (local180.method4805(local167, -25695)) {
							local12 |= 0x80;
						}
						if (local180.method4801(local167, (byte) 93)) {
							local12 |= 0x100;
						}
						if (local180.method4799(local167)) {
							local12 |= 0x400;
						}
					}
				}
			}
		}
		return local12 | 0x20;
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V")
	public void method3396() {
		if (this.anInt3912 == -1) {
			if (this.aBooleanArray6 == null) {
				this.anInt3912 = 0;
			} else {
				this.anInt3912 = 2;
			}
		}
		if (this.anInt3921 != -1) {
			return;
		}
		if (this.aBooleanArray6 == null) {
			this.anInt3921 = 0;
		} else {
			this.anInt3921 = 2;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!ka;IIII)Lclient!ka;")
	public Class164 method3397(@OriginalArg(0) int arg0, @OriginalArg(1) Class164 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) int local8 = this.anIntArray225[arg2];
		@Pc(13) int local13 = this.anIntArray226[arg2];
		@Pc(21) Class5_Sub5_Sub15 local21 = this.aClass317_2.method7883(local13 >> 16, 64);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg1.method9072((byte) 1, arg4, true);
		}
		@Pc(36) Class5_Sub5_Sub15 local36 = null;
		if ((this.aBoolean303 || Static95.aBoolean147) && arg0 != -1 && arg0 < this.anIntArray226.length) {
			@Pc(61) int local61 = this.anIntArray226[arg0];
			local36 = this.aClass317_2.method7883(local61 >> 16, 64);
			arg0 = local61 & 0xFFFF;
		}
		@Pc(77) Class5_Sub5_Sub15 local77 = null;
		@Pc(79) Class5_Sub5_Sub15 local79 = null;
		@Pc(81) int local81 = 0;
		@Pc(83) int local83 = 0;
		if (this.anIntArray223 != null) {
			if (arg2 < this.anIntArray223.length) {
				local81 = this.anIntArray223[arg2];
				if (local81 != 65535) {
					local77 = this.aClass317_2.method7883(local81 >> 16, 64);
					local81 &= 0xFFFF;
				}
			}
			if ((this.aBoolean303 || Static95.aBoolean147) && arg0 != -1 && this.anIntArray223.length > arg0) {
				local83 = this.anIntArray223[arg0];
				if (local83 != 65535) {
					local79 = this.aClass317_2.method7883(local83 >> 16, 64);
					local83 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean306) {
			arg4 |= 0x200;
		}
		if (local21.method4805(local25, -25695)) {
			arg4 |= 0x80;
		}
		if (local21.method4801(local25, (byte) 93)) {
			arg4 |= 0x100;
		}
		if (local21.method4799(local25)) {
			arg4 |= 0x400;
		}
		if (local77 != null) {
			if (local77.method4805(local81, -25695)) {
				arg4 |= 0x80;
			}
			if (local77.method4801(local81, (byte) 93)) {
				arg4 |= 0x100;
			}
			if (local77.method4799(local81)) {
				arg4 |= 0x400;
			}
		}
		if (local36 != null) {
			if (local36.method4805(arg0, -25695)) {
				arg4 |= 0x80;
			}
			if (local36.method4801(arg0, (byte) 93)) {
				arg4 |= 0x100;
			}
			if (local36.method4799(arg0)) {
				arg4 |= 0x400;
			}
		}
		if (local79 != null) {
			if (local79.method4805(local83, -25695)) {
				arg4 |= 0x80;
			}
			if (local79.method4801(local83, (byte) 93)) {
				arg4 |= 0x100;
			}
			if (local79.method4799(local83)) {
				arg4 |= 0x400;
			}
		}
		arg4 |= 0x20;
		@Pc(295) Class164 local295 = arg1.method9072((byte) 1, arg4, true);
		local295.method9094(local8, local36, arg0, local21, this.aBoolean306, local25, arg3 - 1, 0);
		if (local77 != null) {
			local295.method9094(local8, local79, local83, local77, this.aBoolean306, local81, arg3 - 1, 0);
		}
		return local295;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!ib;)V")
	public void method3398(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub23 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method8529();
			if (local5 == 0) {
				if (arg0 <= 84) {
					this.method3398(68, (Class5_Sub23) null);
					return;
				}
				return;
			}
			this.method3399(arg1, local5);
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!ib;IB)V")
	private void method3399(@OriginalArg(0) Class5_Sub23 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(43) int local43;
		@Pc(66) int local66;
		if (arg1 == 1) {
			local16 = arg0.method8519();
			this.anIntArray225 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray225[local22] = arg0.method8519();
			}
			this.anIntArray226 = new int[local16];
			for (local43 = 0; local43 < local16; local43++) {
				this.anIntArray226[local43] = arg0.method8519();
			}
			for (local66 = 0; local66 < local16; local66++) {
				this.anIntArray226[local66] = (arg0.method8519() << 16) + this.anIntArray226[local66];
			}
		} else if (arg1 == 2) {
			this.anInt3907 = arg0.method8519();
		} else if (arg1 == 3) {
			this.aBooleanArray6 = new boolean[256];
			local16 = arg0.method8529();
			for (local22 = 0; local22 < local16; local22++) {
				this.aBooleanArray6[arg0.method8529()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt3910 = arg0.method8529();
		} else if (arg1 == 6) {
			this.anInt3904 = arg0.method8519();
		} else if (arg1 == 7) {
			this.anInt3920 = arg0.method8519();
		} else if (arg1 == 8) {
			this.anInt3913 = arg0.method8529();
		} else if (arg1 == 9) {
			this.anInt3921 = arg0.method8529();
		} else if (arg1 == 10) {
			this.anInt3912 = arg0.method8529();
		} else if (arg1 == 11) {
			this.anInt3919 = arg0.method8529();
		} else if (arg1 == 12) {
			local16 = arg0.method8529();
			this.anIntArray223 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray223[local22] = arg0.method8519();
			}
			for (local43 = 0; local43 < local16; local43++) {
				this.anIntArray223[local43] += arg0.method8519() << 16;
			}
		} else if (arg1 == 13) {
			local16 = arg0.method8519();
			this.anIntArrayArray26 = new int[local16][];
			for (local22 = 0; local22 < local16; local22++) {
				local43 = arg0.method8529();
				if (local43 > 0) {
					this.anIntArrayArray26[local22] = new int[local43];
					this.anIntArrayArray26[local22][0] = arg0.method8510();
					for (local66 = 1; local66 < local43; local66++) {
						this.anIntArrayArray26[local22][local66] = arg0.method8519();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean306 = true;
		} else if (arg1 == 15) {
			this.aBoolean303 = true;
		} else if (arg1 == 16) {
			this.aBoolean304 = true;
		} else if (arg1 == 18) {
			this.aBoolean305 = true;
		} else if (arg1 == 19) {
			if (this.anIntArray221 == null) {
				this.anIntArray221 = new int[this.anIntArrayArray26.length];
				for (local16 = 0; local16 < this.anIntArrayArray26.length; local16++) {
					this.anIntArray221[local16] = 255;
				}
			}
			this.anIntArray221[arg0.method8529()] = arg0.method8529();
		} else if (arg1 == 20) {
			if (this.anIntArray224 == null || this.anIntArray222 == null) {
				this.anIntArray224 = new int[this.anIntArrayArray26.length];
				this.anIntArray222 = new int[this.anIntArrayArray26.length];
				for (local16 = 0; local16 < this.anIntArrayArray26.length; local16++) {
					this.anIntArray224[local16] = 256;
					this.anIntArray222[local16] = 256;
				}
			}
			local16 = arg0.method8529();
			this.anIntArray224[local16] = arg0.method8519();
			this.anIntArray222[local16] = arg0.method8519();
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIBIBILclient!ka;)Lclient!ka;")
	public Class164 method3400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class164 arg6) {
		@Pc(16) int local16 = this.anIntArray225[arg2];
		@Pc(21) int local21 = this.anIntArray226[arg2];
		@Pc(29) Class5_Sub5_Sub15 local29 = this.aClass317_2.method7883(local21 >> 16, 64);
		@Pc(33) int local33 = local21 & 0xFFFF;
		if (local29 == null) {
			return arg6.method9072(arg3, arg5, true);
		}
		@Pc(44) Class5_Sub5_Sub15 local44 = null;
		if ((this.aBoolean303 || Static95.aBoolean147) && arg4 != -1 && this.anIntArray226.length > arg4) {
			@Pc(69) int local69 = this.anIntArray226[arg4];
			local44 = this.aClass317_2.method7883(local69 >> 16, 64);
			arg4 = local69 & 0xFFFF;
		}
		if (this.aBoolean306) {
			arg5 |= 0x200;
		}
		if (local29.method4805(local33, -25695)) {
			arg5 |= 0x80;
		}
		if (local29.method4801(local33, (byte) 93)) {
			arg5 |= 0x100;
		}
		if (local29.method4799(local33)) {
			arg5 |= 0x400;
		}
		if (local44 != null) {
			if (local44.method4805(arg4, -25695)) {
				arg5 |= 0x80;
			}
			if (local44.method4801(arg4, (byte) 93)) {
				arg5 |= 0x100;
			}
			if (local44.method4799(arg4)) {
				arg5 |= 0x400;
			}
		}
		arg5 |= 0x20;
		@Pc(156) Class164 local156 = arg6.method9072(arg3, arg5, true);
		local156.method9094(local16, local44, arg4, local29, this.aBoolean306, local33, arg1 - 1, arg0);
		return local156;
	}
}
