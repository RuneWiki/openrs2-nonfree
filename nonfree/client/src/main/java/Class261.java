import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class261 {

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "[I")
	public int[] anIntArray493;

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "[I")
	public int[] anIntArray494;

	@OriginalMember(owner = "client!vr", name = "s", descriptor = "I")
	public int anInt7418;

	@OriginalMember(owner = "client!vr", name = "u", descriptor = "Lclient!eg;")
	public Class59 aClass59_4;

	@OriginalMember(owner = "client!vr", name = "y", descriptor = "[I")
	private int[] anIntArray495;

	@OriginalMember(owner = "client!vr", name = "z", descriptor = "[[I")
	public int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!vr", name = "E", descriptor = "[Z")
	public boolean[] aBooleanArray29;

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
	public int anInt7404 = -1;

	@OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
	public int anInt7413 = -1;

	@OriginalMember(owner = "client!vr", name = "n", descriptor = "I")
	public int anInt7414 = -1;

	@OriginalMember(owner = "client!vr", name = "t", descriptor = "I")
	public int anInt7419 = 5;

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
	public int anInt7412 = -1;

	@OriginalMember(owner = "client!vr", name = "x", descriptor = "Z")
	public boolean aBoolean501 = false;

	@OriginalMember(owner = "client!vr", name = "v", descriptor = "I")
	public int anInt7420 = -1;

	@OriginalMember(owner = "client!vr", name = "B", descriptor = "I")
	public int anInt7421 = 2;

	@OriginalMember(owner = "client!vr", name = "A", descriptor = "Z")
	public boolean aBoolean502 = false;

	@OriginalMember(owner = "client!vr", name = "o", descriptor = "Z")
	public boolean aBoolean500 = false;

	@OriginalMember(owner = "client!vr", name = "C", descriptor = "I")
	public int anInt7422 = 0;

	@OriginalMember(owner = "client!vr", name = "F", descriptor = "I")
	public int anInt7424 = 99;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V")
	public void method6047() {
		if (this.anInt7404 == -1) {
			if (this.aBooleanArray29 == null) {
				this.anInt7404 = 0;
			} else {
				this.anInt7404 = 2;
			}
		}
		if (this.anInt7420 != -1) {
			return;
		}
		if (this.aBooleanArray29 == null) {
			this.anInt7420 = 0;
		} else {
			this.anInt7420 = 2;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IILclient!nj;)V")
	private void method6048(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub25 arg1) {
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(43) int local43;
		@Pc(58) int local58;
		if (arg0 == 1) {
			local18 = arg1.method4083();
			this.anIntArray493 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray493[local24] = arg1.method4083();
			}
			this.anIntArray494 = new int[local18];
			for (local43 = 0; local43 < local18; local43++) {
				this.anIntArray494[local43] = arg1.method4083();
			}
			for (local58 = 0; local58 < local18; local58++) {
				this.anIntArray494[local58] += arg1.method4083() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt7413 = arg1.method4083();
		} else if (arg0 == 3) {
			this.aBooleanArray29 = new boolean[256];
			local18 = arg1.method4096();
			for (local24 = 0; local24 < local18; local24++) {
				this.aBooleanArray29[arg1.method4096()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt7419 = arg1.method4096();
		} else if (arg0 == 6) {
			this.anInt7414 = arg1.method4083();
		} else if (arg0 == 7) {
			this.anInt7412 = arg1.method4083();
		} else if (arg0 == 8) {
			this.anInt7424 = arg1.method4096();
		} else if (arg0 == 9) {
			this.anInt7420 = arg1.method4096();
		} else if (arg0 == 10) {
			this.anInt7404 = arg1.method4096();
		} else if (arg0 == 11) {
			this.anInt7421 = arg1.method4096();
		} else if (arg0 == 12) {
			local18 = arg1.method4096();
			this.anIntArray495 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray495[local24] = arg1.method4083();
			}
			for (local43 = 0; local43 < local18; local43++) {
				this.anIntArray495[local43] = (arg1.method4083() << 16) + this.anIntArray495[local43];
			}
		} else if (arg0 == 13) {
			local18 = arg1.method4083();
			this.anIntArrayArray62 = new int[local18][];
			for (local24 = 0; local24 < local18; local24++) {
				local43 = arg1.method4096();
				if (local43 > 0) {
					this.anIntArrayArray62[local24] = new int[local43];
					this.anIntArrayArray62[local24][0] = arg1.method4099();
					for (local58 = 1; local58 < local43; local58++) {
						this.anIntArrayArray62[local24][local58] = arg1.method4083();
					}
				}
			}
			return;
		} else if (arg0 == 14) {
			this.aBoolean501 = true;
			return;
		} else if (arg0 == 15) {
			this.aBoolean502 = true;
			return;
		} else if (arg0 == 16) {
			this.aBoolean500 = true;
			return;
		} else if (arg0 == 17) {
			this.anInt7422 = arg1.method4096();
			return;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!nj;I)V")
	public void method6049(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4096();
			if (local9 == 0) {
				return;
			}
			this.method6048(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIBIILclient!ka;II)Lclient!ka;")
	public Class108 method6050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class108 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray493[arg3];
		@Pc(13) int local13 = this.anIntArray494[arg3];
		@Pc(21) Class3_Sub3_Sub17 local21 = this.aClass59_4.method1548(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg4.method4930(arg2, arg6, true);
		}
		@Pc(35) Class3_Sub3_Sub17 local35 = null;
		if ((this.aBoolean502 || Static454.aBoolean509) && arg1 != -1 && this.anIntArray494.length > arg1) {
			@Pc(53) int local53 = this.anIntArray494[arg1];
			local35 = this.aClass59_4.method1548(local53 >> 16);
			arg1 = local53 & 0xFFFF;
		}
		if (this.aBoolean501) {
			arg6 |= 0x200;
		}
		if (local21.method6063(local25)) {
			arg6 |= 0x80;
		}
		if (local21.method6069(local25)) {
			arg6 |= 0x100;
		}
		if (local21.method6066(local25)) {
			arg6 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method6063(arg1)) {
				arg6 |= 0x80;
			}
			if (local35.method6069(arg1)) {
				arg6 |= 0x100;
			}
			if (local35.method6066(arg1)) {
				arg6 |= 0x400;
			}
		}
		arg6 |= 0x20;
		@Pc(142) Class108 local142 = arg4.method4930(arg2, arg6, true);
		local142.method4943(this.aBoolean501, local35, arg1, local21, local8, local25, arg0 - 1, arg5);
		return local142;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IZIB)I")
	public int method6051(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray494[arg2];
		@Pc(14) Class3_Sub3_Sub17 local14 = null;
		@Pc(22) Class3_Sub3_Sub17 local22 = this.aClass59_4.method1548(local12 >> 16);
		@Pc(34) int local34 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean502 || Static454.aBoolean509) && arg0 != -1 && this.anIntArray494.length > arg0) {
			local7 = this.anIntArray494[arg0];
			local14 = this.aClass59_4.method1548(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean501) {
			local5 = 512;
		}
		if (local22.method6063(local34)) {
			local5 |= 0x80;
		}
		if (local22.method6069(local34)) {
			local5 |= 0x100;
		}
		if (local22.method6066(local34)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method6063(local7)) {
				local5 |= 0x80;
			}
			if (local14.method6069(local7)) {
				local5 |= 0x100;
			}
			if (local14.method6066(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray495 != null && arg1) {
			@Pc(151) int local151;
			@Pc(162) Class3_Sub3_Sub17 local162;
			if (this.anIntArray495.length > arg2) {
				local151 = this.anIntArray495[arg2];
				if (local151 != 65535) {
					local162 = this.aClass59_4.method1548(local151 >> 16);
					local151 &= 0xFFFF;
					if (local162 != null) {
						if (local162.method6063(local151)) {
							local5 |= 0x80;
						}
						if (local162.method6069(local151)) {
							local5 |= 0x100;
						}
						if (local162.method6066(local151)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean502 || Static454.aBoolean509) && arg0 != -1 && arg0 < this.anIntArray495.length) {
				local151 = this.anIntArray495[arg0];
				if (local151 != 65535) {
					local162 = this.aClass59_4.method1548(local151 >> 16);
					local151 &= 0xFFFF;
					if (local162 != null) {
						if (local162.method6063(local151)) {
							local5 |= 0x80;
						}
						if (local162.method6069(local151)) {
							local5 |= 0x100;
						}
						if (local162.method6066(local151)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!ka;IIIII)Lclient!ka;")
	public Class108 method6052(@OriginalArg(0) Class108 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray493[arg3];
		@Pc(13) int local13 = this.anIntArray494[arg3];
		@Pc(21) Class3_Sub3_Sub17 local21 = this.aClass59_4.method1548(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg0.method4930((byte) 1, arg4, true);
		}
		@Pc(35) Class3_Sub3_Sub17 local35 = null;
		if ((this.aBoolean502 || Static454.aBoolean509) && arg1 != -1 && this.anIntArray494.length > arg1) {
			@Pc(58) int local58 = this.anIntArray494[arg1];
			local35 = this.aClass59_4.method1548(local58 >> 16);
			arg1 = local58 & 0xFFFF;
		}
		@Pc(74) Class3_Sub3_Sub17 local74 = null;
		@Pc(76) Class3_Sub3_Sub17 local76 = null;
		@Pc(78) int local78 = 0;
		@Pc(80) int local80 = 0;
		if (this.anIntArray495 != null) {
			if (arg3 < this.anIntArray495.length) {
				local78 = this.anIntArray495[arg3];
				if (local78 != 65535) {
					local74 = this.aClass59_4.method1548(local78 >> 16);
					local78 &= 0xFFFF;
				}
			}
			if ((this.aBoolean502 || Static454.aBoolean509) && arg1 != -1 && this.anIntArray495.length > arg1) {
				local80 = this.anIntArray495[arg1];
				if (local80 != 65535) {
					local76 = this.aClass59_4.method1548(local80 >> 16);
					local80 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean501) {
			arg4 |= 0x200;
		}
		if (local21.method6063(local25)) {
			arg4 |= 0x80;
		}
		if (local21.method6069(local25)) {
			arg4 |= 0x100;
		}
		if (local21.method6066(local25)) {
			arg4 |= 0x400;
		}
		if (local74 != null) {
			if (local74.method6063(local78)) {
				arg4 |= 0x80;
			}
			if (local74.method6069(local78)) {
				arg4 |= 0x100;
			}
			if (local74.method6066(local78)) {
				arg4 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method6063(arg1)) {
				arg4 |= 0x80;
			}
			if (local35.method6069(arg1)) {
				arg4 |= 0x100;
			}
			if (local35.method6066(arg1)) {
				arg4 |= 0x400;
			}
		}
		if (local76 != null) {
			if (local76.method6063(local80)) {
				arg4 |= 0x80;
			}
			if (local76.method6069(local80)) {
				arg4 |= 0x100;
			}
			if (local76.method6066(local80)) {
				arg4 |= 0x400;
			}
		}
		arg4 |= 0x20;
		@Pc(283) Class108 local283 = arg0.method4930((byte) 1, arg4, true);
		local283.method4943(this.aBoolean501, local35, arg1, local21, local8, local25, arg2 - 1, 0);
		if (local74 != null) {
			local283.method4943(this.aBoolean501, local76, local80, local74, local8, local78, arg2 - 1, 0);
		}
		return local283;
	}
}
