import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class191 {

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "[Z")
	public boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "[I")
	public int[] anIntArray452;

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray165;

	@OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
	public int anInt5746;

	@OriginalMember(owner = "client!qp", name = "u", descriptor = "Lclient!bk;")
	public Class28 aClass28_2;

	@OriginalMember(owner = "client!qp", name = "z", descriptor = "[I")
	private int[] anIntArray453;

	@OriginalMember(owner = "client!qp", name = "A", descriptor = "[I")
	public int[] anIntArray454;

	@OriginalMember(owner = "client!qp", name = "l", descriptor = "Z")
	public boolean aBoolean373 = false;

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
	public int anInt5740 = 5;

	@OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
	public int anInt5741 = -1;

	@OriginalMember(owner = "client!qp", name = "t", descriptor = "I")
	public int anInt5748 = -1;

	@OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
	public int anInt5747 = -1;

	@OriginalMember(owner = "client!qp", name = "v", descriptor = "I")
	public int anInt5749 = -1;

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
	public int anInt5745 = -1;

	@OriginalMember(owner = "client!qp", name = "r", descriptor = "Z")
	public boolean aBoolean375 = false;

	@OriginalMember(owner = "client!qp", name = "y", descriptor = "I")
	public int anInt5752 = 99;

	@OriginalMember(owner = "client!qp", name = "n", descriptor = "Z")
	public boolean aBoolean374 = false;

	@OriginalMember(owner = "client!qp", name = "x", descriptor = "I")
	public int anInt5751 = 2;

	@OriginalMember(owner = "client!qp", name = "B", descriptor = "Z")
	public boolean aBoolean376 = false;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!lh;II)V")
	private void method4608(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(26) int local26;
		@Pc(28) int local28;
		@Pc(136) int local136;
		@Pc(226) int local226;
		if (arg1 == 1) {
			local26 = arg0.method4093();
			this.anIntArray454 = new int[local26];
			for (local28 = 0; local28 < local26; local28++) {
				this.anIntArray454[local28] = arg0.method4093();
			}
			this.anIntArray452 = new int[local26];
			for (local136 = 0; local136 < local26; local136++) {
				this.anIntArray452[local136] = arg0.method4093();
			}
			for (local226 = 0; local226 < local26; local226++) {
				this.anIntArray452[local226] += arg0.method4093() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt5747 = arg0.method4093();
		} else if (arg1 == 3) {
			this.aBooleanArray19 = new boolean[256];
			local26 = arg0.method4130();
			for (local28 = 0; local28 < local26; local28++) {
				this.aBooleanArray19[arg0.method4130()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean373 = true;
		} else if (arg1 == 5) {
			this.anInt5740 = arg0.method4130();
		} else if (arg1 == 6) {
			this.anInt5745 = arg0.method4093();
		} else if (arg1 == 7) {
			this.anInt5741 = arg0.method4093();
		} else if (arg1 == 8) {
			this.anInt5752 = arg0.method4130();
		} else if (arg1 == 9) {
			this.anInt5749 = arg0.method4130();
		} else if (arg1 == 10) {
			this.anInt5748 = arg0.method4130();
		} else if (arg1 == 11) {
			this.anInt5751 = arg0.method4130();
		} else if (arg1 == 12) {
			local26 = arg0.method4130();
			this.anIntArray453 = new int[local26];
			for (local28 = 0; local28 < local26; local28++) {
				this.anIntArray453[local28] = arg0.method4093();
			}
			for (local136 = 0; local136 < local26; local136++) {
				this.anIntArray453[local136] = (arg0.method4093() << 16) + this.anIntArray453[local136];
			}
		} else if (arg1 == 13) {
			local26 = arg0.method4093();
			this.anIntArrayArray165 = new int[local26][];
			for (local28 = 0; local28 < local26; local28++) {
				local136 = arg0.method4130();
				if (local136 > 0) {
					this.anIntArrayArray165[local28] = new int[local136];
					this.anIntArrayArray165[local28][0] = arg0.method4142();
					for (local226 = 1; local226 < local136; local226++) {
						this.anIntArrayArray165[local28][local226] = arg0.method4093();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean375 = true;
		} else if (arg1 == 15) {
			this.aBoolean374 = true;
		} else if (arg1 == 16) {
			this.aBoolean376 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILclient!lh;)V")
	public void method4610(@OriginalArg(1) Class1_Sub1 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4130();
			if (local17 == 0) {
				return;
			}
			this.method4608(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
	public void method4611() {
		if (this.anInt5749 == -1) {
			if (this.aBooleanArray19 == null) {
				this.anInt5749 = 0;
			} else {
				this.anInt5749 = 2;
			}
		}
		if (this.anInt5748 != -1) {
			return;
		}
		if (this.aBooleanArray19 == null) {
			this.anInt5748 = 0;
		} else {
			this.anInt5748 = 2;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZIII)I")
	public int method4612(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray452[arg2];
		@Pc(14) Class1_Sub2_Sub6 local14 = null;
		@Pc(28) Class1_Sub2_Sub6 local28 = this.aClass28_2.method571(local12 >> 16);
		@Pc(32) int local32 = local12 & 0xFFFF;
		if (local28 == null) {
			return 0;
		}
		if ((this.aBoolean374 || Static294.aBoolean385) && arg1 != -1 && this.anIntArray452.length > arg1) {
			local7 = this.anIntArray452[arg1];
			local14 = this.aClass28_2.method571(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean375) {
			local5 = 512;
		}
		if (local28.method1120(local32)) {
			local5 |= 0x80;
		}
		if (local28.method1121(local32)) {
			local5 |= 0x100;
		}
		if (local28.method1125(local32)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method1120(local7)) {
				local5 |= 0x80;
			}
			if (local14.method1121(local7)) {
				local5 |= 0x100;
			}
			if (local14.method1125(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray453 != null && arg0) {
			@Pc(152) int local152;
			@Pc(165) Class1_Sub2_Sub6 local165;
			if (this.anIntArray453.length > arg2) {
				local152 = this.anIntArray453[arg2];
				if (local152 != 65535) {
					local165 = this.aClass28_2.method571(local152 >> 16);
					local152 &= 0xFFFF;
					if (local165 != null) {
						if (local165.method1120(local152)) {
							local5 |= 0x80;
						}
						if (local165.method1121(local152)) {
							local5 |= 0x100;
						}
						if (local165.method1125(local152)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean374 || Static294.aBoolean385) && arg1 != -1 && this.anIntArray453.length > arg1) {
				local152 = this.anIntArray453[arg1];
				if (local152 != 65535) {
					local165 = this.aClass28_2.method571(local152 >> 16);
					local152 &= 0xFFFF;
					if (local165 != null) {
						if (local165.method1120(local152)) {
							local5 |= 0x80;
						}
						if (local165.method1121(local152)) {
							local5 |= 0x100;
						}
						if (local165.method1125(local152)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIIZLclient!c;)Lclient!c;")
	public Class37 method4614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class37 arg4) {
		@Pc(8) int local8 = this.anIntArray454[arg3];
		@Pc(13) int local13 = this.anIntArray452[arg3];
		@Pc(21) Class1_Sub2_Sub6 local21 = this.aClass28_2.method571(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg4.method4221((byte) 1, arg1, true);
		}
		@Pc(35) Class1_Sub2_Sub6 local35 = null;
		if ((this.aBoolean374 || Static294.aBoolean385) && arg0 != -1 && this.anIntArray452.length > arg0) {
			@Pc(54) int local54 = this.anIntArray452[arg0];
			local35 = this.aClass28_2.method571(local54 >> 16);
			arg0 = local54 & 0xFFFF;
		}
		@Pc(68) Class1_Sub2_Sub6 local68 = null;
		@Pc(70) Class1_Sub2_Sub6 local70 = null;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.anIntArray453 != null) {
			if (this.anIntArray453.length > arg3) {
				local72 = this.anIntArray453[arg3];
				if (local72 != 65535) {
					local68 = this.aClass28_2.method571(local72 >> 16);
					local72 &= 0xFFFF;
				}
			}
			if ((this.aBoolean374 || Static294.aBoolean385) && arg0 != -1 && this.anIntArray453.length > arg0) {
				local74 = this.anIntArray453[arg0];
				if (local74 != 65535) {
					local70 = this.aClass28_2.method571(local74 >> 16);
					local74 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean375) {
			arg1 |= 0x200;
		}
		if (local21.method1120(local25)) {
			arg1 |= 0x80;
		}
		if (local21.method1121(local25)) {
			arg1 |= 0x100;
		}
		if (local21.method1125(local25)) {
			arg1 |= 0x400;
		}
		if (local68 != null) {
			if (local68.method1120(local72)) {
				arg1 |= 0x80;
			}
			if (local68.method1121(local72)) {
				arg1 |= 0x100;
			}
			if (local68.method1125(local72)) {
				arg1 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method1120(arg0)) {
				arg1 |= 0x80;
			}
			if (local35.method1121(arg0)) {
				arg1 |= 0x100;
			}
			if (local35.method1125(arg0)) {
				arg1 |= 0x400;
			}
		}
		if (local70 != null) {
			if (local70.method1120(local74)) {
				arg1 |= 0x80;
			}
			if (local70.method1121(local74)) {
				arg1 |= 0x100;
			}
			if (local70.method1125(local74)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(274) Class37 local274 = arg4.method4221((byte) 1, arg1, true);
		local274.method4224(arg2 - 1, local25, 0, local35, this.aBoolean375, local21, arg0, local8);
		if (local68 != null) {
			local274.method4224(arg2 - 1, local72, 0, local70, this.aBoolean375, local68, local74, local8);
		}
		return local274;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(BILclient!c;IIIII)Lclient!c;")
	public Class37 method4615(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray454[arg1];
		@Pc(13) int local13 = this.anIntArray452[arg1];
		@Pc(21) Class1_Sub2_Sub6 local21 = this.aClass28_2.method571(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg2.method4221(arg0, arg3, true);
		}
		@Pc(35) Class1_Sub2_Sub6 local35 = null;
		if ((this.aBoolean374 || Static294.aBoolean385) && arg6 != -1 && this.anIntArray452.length > arg6) {
			@Pc(58) int local58 = this.anIntArray452[arg6];
			local35 = this.aClass28_2.method571(local58 >> 16);
			arg6 = local58 & 0xFFFF;
		}
		if (this.aBoolean375) {
			arg3 |= 0x200;
		}
		if (local21.method1120(local25)) {
			arg3 |= 0x80;
		}
		if (local21.method1121(local25)) {
			arg3 |= 0x100;
		}
		if (local21.method1125(local25)) {
			arg3 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method1120(arg6)) {
				arg3 |= 0x80;
			}
			if (local35.method1121(arg6)) {
				arg3 |= 0x100;
			}
			if (local35.method1125(arg6)) {
				arg3 |= 0x400;
			}
		}
		arg3 |= 0x20;
		@Pc(145) Class37 local145 = arg2.method4221(arg0, arg3, true);
		local145.method4224(arg4 - 1, local25, arg5, local35, this.aBoolean375, local21, arg6, local8);
		return local145;
	}
}
