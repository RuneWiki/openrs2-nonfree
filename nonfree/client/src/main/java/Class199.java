import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class199 {

	@OriginalMember(owner = "client!na", name = "e", descriptor = "Lclient!ok;")
	public Class218 aClass218_2;

	@OriginalMember(owner = "client!na", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray74;

	@OriginalMember(owner = "client!na", name = "q", descriptor = "[I")
	private int[] anIntArray573;

	@OriginalMember(owner = "client!na", name = "s", descriptor = "[Z")
	public boolean[] aBooleanArray40;

	@OriginalMember(owner = "client!na", name = "v", descriptor = "I")
	public int anInt5749;

	@OriginalMember(owner = "client!na", name = "y", descriptor = "[I")
	public int[] anIntArray574;

	@OriginalMember(owner = "client!na", name = "z", descriptor = "[I")
	public int[] anIntArray575;

	@OriginalMember(owner = "client!na", name = "b", descriptor = "I")
	public int anInt5736 = -1;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "Z")
	public boolean aBoolean417 = false;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "I")
	public int anInt5740 = 0;

	@OriginalMember(owner = "client!na", name = "i", descriptor = "I")
	public int anInt5741 = -1;

	@OriginalMember(owner = "client!na", name = "n", descriptor = "I")
	public int anInt5745 = -1;

	@OriginalMember(owner = "client!na", name = "o", descriptor = "I")
	public int anInt5746 = -1;

	@OriginalMember(owner = "client!na", name = "m", descriptor = "I")
	public int anInt5744 = 2;

	@OriginalMember(owner = "client!na", name = "p", descriptor = "Z")
	public boolean aBoolean418 = false;

	@OriginalMember(owner = "client!na", name = "x", descriptor = "I")
	public int anInt5750 = 5;

	@OriginalMember(owner = "client!na", name = "w", descriptor = "Z")
	public boolean aBoolean419 = false;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "I")
	public int anInt5737 = -1;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "I")
	public int anInt5735 = 99;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IZII)I")
	public int method4874(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray574[arg0];
		@Pc(14) Class1_Sub1_Sub6 local14 = null;
		@Pc(22) Class1_Sub1_Sub6 local22 = this.aClass218_2.method5222(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean417 || Static157.aBoolean315) && arg2 != -1 && arg2 < this.anIntArray574.length) {
			local7 = this.anIntArray574[arg2];
			local14 = this.aClass218_2.method5222(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean418) {
			local5 = 512;
		}
		if (local22.method2962(local26)) {
			local5 |= 0x80;
		}
		if (local22.method2963(local26)) {
			local5 |= 0x100;
		}
		if (local22.method2965(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method2962(local7)) {
				local5 |= 0x80;
			}
			if (local14.method2963(local7)) {
				local5 |= 0x100;
			}
			if (local14.method2965(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray573 != null && arg1) {
			@Pc(145) int local145;
			@Pc(156) Class1_Sub1_Sub6 local156;
			if (this.anIntArray573.length > arg0) {
				local145 = this.anIntArray573[arg0];
				if (local145 != 65535) {
					local156 = this.aClass218_2.method5222(local145 >> 16);
					local145 &= 0xFFFF;
					if (local156 != null) {
						if (local156.method2962(local145)) {
							local5 |= 0x80;
						}
						if (local156.method2963(local145)) {
							local5 |= 0x100;
						}
						if (local156.method2965(local145)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean417 || Static157.aBoolean315) && arg2 != -1 && arg2 < this.anIntArray573.length) {
				local145 = this.anIntArray573[arg2];
				if (local145 != 65535) {
					local156 = this.aClass218_2.method5222(local145 >> 16);
					local145 &= 0xFFFF;
					if (local156 != null) {
						if (local156.method2962(local145)) {
							local5 |= 0x80;
						}
						if (local156.method2963(local145)) {
							local5 |= 0x100;
						}
						if (local156.method2965(local145)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIBLclient!r;I)Lclient!r;")
	public Class145 method4876(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) Class145 arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray575[arg0];
		@Pc(13) int local13 = this.anIntArray574[arg0];
		@Pc(21) Class1_Sub1_Sub6 local21 = this.aClass218_2.method5222(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg5.method6672(arg4, arg2, true);
		}
		@Pc(35) Class1_Sub1_Sub6 local35 = null;
		if ((this.aBoolean417 || Static157.aBoolean315) && arg3 != -1 && arg3 < this.anIntArray574.length) {
			@Pc(53) int local53 = this.anIntArray574[arg3];
			local35 = this.aClass218_2.method5222(local53 >> 16);
			arg3 = local53 & 0xFFFF;
		}
		if (this.aBoolean418) {
			arg2 |= 0x200;
		}
		if (local21.method2962(local25)) {
			arg2 |= 0x80;
		}
		if (local21.method2963(local25)) {
			arg2 |= 0x100;
		}
		if (local21.method2965(local25)) {
			arg2 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method2962(arg3)) {
				arg2 |= 0x80;
			}
			if (local35.method2963(arg3)) {
				arg2 |= 0x100;
			}
			if (local35.method2965(arg3)) {
				arg2 |= 0x400;
			}
		}
		arg2 |= 0x20;
		@Pc(142) Class145 local142 = arg5.method6672(arg4, arg2, true);
		local142.method6687(local21, local8, arg1 - 1, local35, arg3, arg6, local25, this.aBoolean418);
		return local142;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IILclient!r;III)Lclient!r;")
	public Class145 method4877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray575[arg4];
		@Pc(13) int local13 = this.anIntArray574[arg4];
		@Pc(21) Class1_Sub1_Sub6 local21 = this.aClass218_2.method5222(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg2.method6672((byte) 1, arg3, true);
		}
		@Pc(35) Class1_Sub1_Sub6 local35 = null;
		if ((this.aBoolean417 || Static157.aBoolean315) && arg0 != -1 && this.anIntArray574.length > arg0) {
			@Pc(53) int local53 = this.anIntArray574[arg0];
			local35 = this.aClass218_2.method5222(local53 >> 16);
			arg0 = local53 & 0xFFFF;
		}
		@Pc(79) Class1_Sub1_Sub6 local79 = null;
		@Pc(81) Class1_Sub1_Sub6 local81 = null;
		@Pc(83) int local83 = 0;
		@Pc(85) int local85 = 0;
		if (this.anIntArray573 != null) {
			if (this.anIntArray573.length > arg4) {
				local83 = this.anIntArray573[arg4];
				if (local83 != 65535) {
					local79 = this.aClass218_2.method5222(local83 >> 16);
					local83 &= 0xFFFF;
				}
			}
			if ((this.aBoolean417 || Static157.aBoolean315) && arg0 != -1 && arg0 < this.anIntArray573.length) {
				local85 = this.anIntArray573[arg0];
				if (local85 != 65535) {
					local81 = this.aClass218_2.method5222(local85 >> 16);
					local85 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean418) {
			arg3 |= 0x200;
		}
		if (local21.method2962(local25)) {
			arg3 |= 0x80;
		}
		if (local21.method2963(local25)) {
			arg3 |= 0x100;
		}
		if (local21.method2965(local25)) {
			arg3 |= 0x400;
		}
		if (local79 != null) {
			if (local79.method2962(local83)) {
				arg3 |= 0x80;
			}
			if (local79.method2963(local83)) {
				arg3 |= 0x100;
			}
			if (local79.method2965(local83)) {
				arg3 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method2962(arg0)) {
				arg3 |= 0x80;
			}
			if (local35.method2963(arg0)) {
				arg3 |= 0x100;
			}
			if (local35.method2965(arg0)) {
				arg3 |= 0x400;
			}
		}
		if (local81 != null) {
			if (local81.method2962(local85)) {
				arg3 |= 0x80;
			}
			if (local81.method2963(local85)) {
				arg3 |= 0x100;
			}
			if (local81.method2965(local85)) {
				arg3 |= 0x400;
			}
		}
		arg3 |= 0x20;
		@Pc(289) Class145 local289 = arg2.method6672((byte) 1, arg3, true);
		local289.method6687(local21, local8, arg1 - 1, local35, arg0, 0, local25, this.aBoolean418);
		if (local79 != null) {
			local289.method6687(local79, local8, arg1 - 1, local81, local85, 0, local83, this.aBoolean418);
		}
		return local289;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IILclient!ge;)V")
	private void method4878(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		@Pc(28) int local28;
		@Pc(30) int local30;
		@Pc(136) int local136;
		@Pc(236) int local236;
		if (arg0 == 1) {
			local28 = arg1.method3967();
			this.anIntArray575 = new int[local28];
			for (local30 = 0; local30 < local28; local30++) {
				this.anIntArray575[local30] = arg1.method3967();
			}
			this.anIntArray574 = new int[local28];
			for (local136 = 0; local136 < local28; local136++) {
				this.anIntArray574[local136] = arg1.method3967();
			}
			for (local236 = 0; local236 < local28; local236++) {
				this.anIntArray574[local236] = (arg1.method3967() << 16) + this.anIntArray574[local236];
			}
		} else if (arg0 == 2) {
			this.anInt5746 = arg1.method3967();
		} else if (arg0 == 3) {
			this.aBooleanArray40 = new boolean[256];
			local28 = arg1.method3922();
			for (local30 = 0; local30 < local28; local30++) {
				this.aBooleanArray40[arg1.method3922()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt5750 = arg1.method3922();
		} else if (arg0 == 6) {
			this.anInt5745 = arg1.method3967();
		} else if (arg0 == 7) {
			this.anInt5737 = arg1.method3967();
		} else if (arg0 == 8) {
			this.anInt5735 = arg1.method3922();
		} else if (arg0 == 9) {
			this.anInt5741 = arg1.method3922();
		} else if (arg0 == 10) {
			this.anInt5736 = arg1.method3922();
		} else if (arg0 == 11) {
			this.anInt5744 = arg1.method3922();
		} else if (arg0 == 12) {
			local28 = arg1.method3922();
			this.anIntArray573 = new int[local28];
			for (local30 = 0; local30 < local28; local30++) {
				this.anIntArray573[local30] = arg1.method3967();
			}
			for (local136 = 0; local136 < local28; local136++) {
				this.anIntArray573[local136] += arg1.method3967() << 16;
			}
		} else if (arg0 == 13) {
			local28 = arg1.method3967();
			this.anIntArrayArray74 = new int[local28][];
			for (local30 = 0; local30 < local28; local30++) {
				local136 = arg1.method3922();
				if (local136 > 0) {
					this.anIntArrayArray74[local30] = new int[local136];
					this.anIntArrayArray74[local30][0] = arg1.method3920();
					for (local236 = 1; local236 < local136; local236++) {
						this.anIntArrayArray74[local30][local236] = arg1.method3967();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean418 = true;
		} else if (arg0 == 15) {
			this.aBoolean417 = true;
		} else if (arg0 == 16) {
			this.aBoolean419 = true;
		} else if (arg0 == 17) {
			this.anInt5740 = arg1.method3922();
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!ge;)V")
	public void method4879(@OriginalArg(1) Class1_Sub6 arg0) {
		while (true) {
			@Pc(19) int local19 = arg0.method3922();
			if (local19 == 0) {
				return;
			}
			this.method4878(local19, arg0);
		}
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
	public void method4880() {
		if (this.anInt5736 == -1) {
			if (this.aBooleanArray40 == null) {
				this.anInt5736 = 0;
			} else {
				this.anInt5736 = 2;
			}
		}
		if (this.anInt5741 != -1) {
			return;
		}
		if (this.aBooleanArray40 == null) {
			this.anInt5741 = 0;
		} else {
			this.anInt5741 = 2;
		}
	}
}
