import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class116 {

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "[I")
	private int[] anIntArray328;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "[I")
	public int[] anIntArray329;

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "[I")
	public int[] anIntArray330;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "[[I")
	public int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "[Z")
	public boolean[] aBooleanArray21;

	@OriginalMember(owner = "client!lb", name = "J", descriptor = "I")
	public int anInt3756;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
	public int anInt3738 = -1;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "Z")
	public boolean aBoolean310 = false;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "Z")
	public boolean aBoolean311 = false;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
	public int anInt3739 = 2;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
	public int anInt3745 = 99;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
	public int anInt3751 = -1;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "Z")
	public boolean aBoolean312 = false;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
	public int anInt3752 = -1;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
	public int anInt3754 = -1;

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "Z")
	public boolean aBoolean313 = false;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
	public int anInt3749 = 5;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
	public int anInt3753 = -1;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILclient!tq;)V")
	private void method3174(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		@Pc(8) int local8;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(48) int local48;
		if (arg0 == 1) {
			local8 = arg1.method2404();
			this.anIntArray329 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray329[local14] = arg1.method2404();
			}
			this.anIntArray330 = new int[local8];
			for (local33 = 0; local33 < local8; local33++) {
				this.anIntArray330[local33] = arg1.method2404();
			}
			for (local48 = 0; local48 < local8; local48++) {
				this.anIntArray330[local48] += arg1.method2404() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt3753 = arg1.method2404();
		} else if (arg0 == 3) {
			this.aBooleanArray21 = new boolean[256];
			local8 = arg1.method2380();
			for (local14 = 0; local14 < local8; local14++) {
				this.aBooleanArray21[arg1.method2380()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean313 = true;
		} else if (arg0 == 5) {
			this.anInt3749 = arg1.method2380();
		} else if (arg0 == 6) {
			this.anInt3752 = arg1.method2404();
		} else if (arg0 == 7) {
			this.anInt3751 = arg1.method2404();
		} else if (arg0 == 8) {
			this.anInt3745 = arg1.method2380();
		} else if (arg0 == 9) {
			this.anInt3754 = arg1.method2380();
		} else if (arg0 == 10) {
			this.anInt3738 = arg1.method2380();
		} else if (arg0 == 11) {
			this.anInt3739 = arg1.method2380();
		} else if (arg0 == 12) {
			local8 = arg1.method2380();
			this.anIntArray328 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray328[local14] = arg1.method2404();
			}
			for (local33 = 0; local33 < local8; local33++) {
				this.anIntArray328[local33] += arg1.method2404() << 16;
			}
		} else if (arg0 == 13) {
			local8 = arg1.method2404();
			this.anIntArrayArray36 = new int[local8][];
			for (local14 = 0; local14 < local8; local14++) {
				local33 = arg1.method2380();
				if (local33 > 0) {
					this.anIntArrayArray36[local14] = new int[local33];
					this.anIntArrayArray36[local14][0] = arg1.method2402();
					for (local48 = 1; local48 < local33; local48++) {
						this.anIntArrayArray36[local14][local48] = arg1.method2404();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean311 = true;
		} else if (arg0 == 15) {
			this.aBoolean310 = true;
		} else if (arg0 == 16) {
			this.aBoolean312 = true;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!jn;IIIII)Lclient!jn;")
	public Class5 method3175(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray329[arg3];
		@Pc(13) int local13 = this.anIntArray330[arg3];
		@Pc(21) Class4_Sub1_Sub16 local21 = Static194.method3524(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg0.method4018((byte) 1, arg1, true);
		}
		@Pc(35) Class4_Sub1_Sub16 local35 = null;
		if ((this.aBoolean310 || Static199.aBoolean564) && arg2 != -1 && this.anIntArray330.length > arg2) {
			@Pc(53) int local53 = this.anIntArray330[arg2];
			local35 = Static194.method3524(local53 >> 16);
			arg2 = local53 & 0xFFFF;
		}
		@Pc(67) Class4_Sub1_Sub16 local67 = null;
		@Pc(69) Class4_Sub1_Sub16 local69 = null;
		@Pc(71) int local71 = 0;
		@Pc(73) int local73 = 0;
		if (this.anIntArray328 != null) {
			if (arg3 < this.anIntArray328.length) {
				local71 = this.anIntArray328[arg3];
				if (local71 != 65535) {
					local67 = Static194.method3524(local71 >> 16);
					local71 &= 0xFFFF;
				}
			}
			if ((this.aBoolean310 || Static199.aBoolean564) && arg2 != -1 && arg2 < this.anIntArray328.length) {
				local73 = this.anIntArray328[arg2];
				if (local73 != 65535) {
					local69 = Static194.method3524(local73 >> 16);
					local73 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean311) {
			arg1 |= 0x200;
		}
		if (local21.method3937(local25)) {
			arg1 |= 0x80;
		}
		if (local21.method3938(local25)) {
			arg1 |= 0x100;
		}
		if (local67 != null) {
			if (local67.method3937(local71)) {
				arg1 |= 0x80;
			}
			if (local67.method3938(local71)) {
				arg1 |= 0x100;
			}
		}
		if (local35 != null) {
			if (local35.method3937(arg2)) {
				arg1 |= 0x80;
			}
			if (local35.method3938(arg2)) {
				arg1 |= 0x100;
			}
		}
		if (local69 != null) {
			if (local69.method3937(local73)) {
				arg1 |= 0x80;
			}
			if (local69.method3938(local73)) {
				arg1 |= 0x100;
			}
		}
		arg1 |= 0x20;
		@Pc(236) Class5 local236 = arg0.method4018((byte) 1, arg1, true);
		local236.method3993(local35, arg4 - 1, local21, 0, this.aBoolean311, local25, local8, arg2);
		if (local67 != null) {
			local236.method3993(local69, arg4 - 1, local67, 0, this.aBoolean311, local71, local8, local73);
		}
		return local236;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZB)I")
	public int method3177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray330[arg0];
		@Pc(14) Class4_Sub1_Sub16 local14 = null;
		@Pc(22) Class4_Sub1_Sub16 local22 = Static194.method3524(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean310 || Static199.aBoolean564) && arg1 != -1 && arg1 < this.anIntArray330.length) {
			local7 = this.anIntArray330[arg1];
			local14 = Static194.method3524(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean311) {
			local5 = 512;
		}
		if (local22.method3937(local26)) {
			local5 |= 0x80;
		}
		if (local22.method3938(local26)) {
			local5 |= 0x100;
		}
		if (local14 != null) {
			if (local14.method3937(local7)) {
				local5 |= 0x80;
			}
			if (local14.method3938(local7)) {
				local5 |= 0x100;
			}
		}
		if (this.anIntArray328 != null && arg2) {
			@Pc(123) int local123;
			@Pc(134) Class4_Sub1_Sub16 local134;
			if (arg0 < this.anIntArray328.length) {
				local123 = this.anIntArray328[arg0];
				if (local123 != 65535) {
					local134 = Static194.method3524(local123 >> 16);
					local123 &= 0xFFFF;
					if (local134 != null) {
						if (local134.method3937(local123)) {
							local5 |= 0x80;
						}
						if (local134.method3938(local123)) {
							local5 |= 0x100;
						}
					}
				}
			}
			if ((this.aBoolean310 || Static199.aBoolean564) && arg1 != -1 && arg1 < this.anIntArray328.length) {
				local123 = this.anIntArray328[arg1];
				if (local123 != 65535) {
					local134 = Static194.method3524(local123 >> 16);
					local123 &= 0xFFFF;
					if (local134 != null) {
						if (local134.method3937(local123)) {
							local5 |= 0x80;
						}
						if (local134.method3938(local123)) {
							local5 |= 0x100;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!tq;)V")
	public void method3179(@OriginalArg(1) Class4_Sub7 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2380();
			if (local13 == 0) {
				return;
			}
			this.method3174(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public void method3180() {
		if (this.anInt3738 == -1) {
			if (this.aBooleanArray21 == null) {
				this.anInt3738 = 0;
			} else {
				this.anInt3738 = 2;
			}
		}
		if (this.anInt3754 != -1) {
			return;
		}
		if (this.aBooleanArray21 == null) {
			this.anInt3754 = 0;
		} else {
			this.anInt3754 = 2;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZIIILclient!jn;IB)Lclient!jn;")
	public Class5 method3181(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class5 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte arg6) {
		@Pc(8) int local8 = this.anIntArray329[arg3];
		@Pc(22) int local22 = this.anIntArray330[arg3];
		@Pc(28) Class4_Sub1_Sub16 local28 = Static194.method3524(local22 >> 16);
		@Pc(32) int local32 = local22 & 0xFFFF;
		if (local28 == null) {
			return arg4.method4018((byte) 1, arg2, true);
		}
		@Pc(42) Class4_Sub1_Sub16 local42 = null;
		if ((this.aBoolean310 || Static199.aBoolean564) && arg5 != -1 && this.anIntArray330.length > arg5) {
			@Pc(60) int local60 = this.anIntArray330[arg5];
			local42 = Static194.method3524(local60 >> 16);
			arg5 = local60 & 0xFFFF;
		}
		if (this.aBoolean311) {
			arg2 |= 0x200;
		}
		if (local28.method3937(local32)) {
			arg2 |= 0x80;
		}
		if (local28.method3938(local32)) {
			arg2 |= 0x100;
		}
		if (local42 != null) {
			if (local42.method3937(arg5)) {
				arg2 |= 0x80;
			}
			if (local42.method3938(arg5)) {
				arg2 |= 0x100;
			}
		}
		arg2 |= 0x20;
		@Pc(125) Class5 local125 = arg4.method4018(arg6, arg2, true);
		local125.method3993(local42, arg0 - 1, local28, arg1, this.aBoolean311, local32, local8, arg5);
		return local125;
	}
}
