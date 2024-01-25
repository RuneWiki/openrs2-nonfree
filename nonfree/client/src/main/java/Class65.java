import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class65 {

	@OriginalMember(owner = "client!co", name = "a", descriptor = "Lclient!gf;")
	public Class128 aClass128_1;

	@OriginalMember(owner = "client!co", name = "d", descriptor = "[I")
	public int[] anIntArray71;

	@OriginalMember(owner = "client!co", name = "f", descriptor = "[[I")
	public int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!co", name = "n", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!co", name = "r", descriptor = "[I")
	public int[] anIntArray73;

	@OriginalMember(owner = "client!co", name = "s", descriptor = "[I")
	public int[] anIntArray74;

	@OriginalMember(owner = "client!co", name = "t", descriptor = "[I")
	public int[] anIntArray75;

	@OriginalMember(owner = "client!co", name = "w", descriptor = "[Z")
	public boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!co", name = "z", descriptor = "I")
	public int anInt1431;

	@OriginalMember(owner = "client!co", name = "A", descriptor = "[I")
	public int[] anIntArray76;

	@OriginalMember(owner = "client!co", name = "b", descriptor = "Z")
	public boolean aBoolean104 = false;

	@OriginalMember(owner = "client!co", name = "c", descriptor = "I")
	public int anInt1419 = 5;

	@OriginalMember(owner = "client!co", name = "l", descriptor = "I")
	public int anInt1423 = -1;

	@OriginalMember(owner = "client!co", name = "h", descriptor = "Z")
	public boolean aBoolean105 = false;

	@OriginalMember(owner = "client!co", name = "j", descriptor = "Z")
	public boolean aBoolean106 = false;

	@OriginalMember(owner = "client!co", name = "u", descriptor = "I")
	public int anInt1428 = -1;

	@OriginalMember(owner = "client!co", name = "i", descriptor = "I")
	public int anInt1422 = -1;

	@OriginalMember(owner = "client!co", name = "o", descriptor = "I")
	public int anInt1425 = 2;

	@OriginalMember(owner = "client!co", name = "x", descriptor = "I")
	public int anInt1429 = 99;

	@OriginalMember(owner = "client!co", name = "B", descriptor = "I")
	public int anInt1432 = -1;

	@OriginalMember(owner = "client!co", name = "E", descriptor = "I")
	public int anInt1433 = -1;

	@OriginalMember(owner = "client!co", name = "v", descriptor = "Z")
	public boolean aBoolean107 = false;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILclient!ka;IIII)Lclient!ka;")
	public Class114 method1295(@OriginalArg(1) Class114 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray71[arg4];
		@Pc(13) int local13 = this.anIntArray75[arg4];
		@Pc(21) Class5_Sub2_Sub20 local21 = this.aClass128_1.method2690(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg0.method8810((byte) 1, arg1, true);
		}
		@Pc(35) Class5_Sub2_Sub20 local35 = null;
		if ((this.aBoolean107 || Static67.aBoolean65) && arg2 != -1 && this.anIntArray75.length > arg2) {
			@Pc(53) int local53 = this.anIntArray75[arg2];
			local35 = this.aClass128_1.method2690(local53 >> 16);
			arg2 = local53 & 0xFFFF;
		}
		@Pc(67) Class5_Sub2_Sub20 local67 = null;
		@Pc(69) Class5_Sub2_Sub20 local69 = null;
		@Pc(71) int local71 = 0;
		@Pc(73) int local73 = 0;
		if (this.anIntArray72 != null) {
			if (this.anIntArray72.length > arg4) {
				local71 = this.anIntArray72[arg4];
				if (local71 != 65535) {
					local67 = this.aClass128_1.method2690(local71 >> 16);
					local71 &= 0xFFFF;
				}
			}
			if ((this.aBoolean107 || Static67.aBoolean65) && arg2 != -1 && this.anIntArray72.length > arg2) {
				local73 = this.anIntArray72[arg2];
				if (local73 != 65535) {
					local69 = this.aClass128_1.method2690(local73 >> 16);
					local73 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean106) {
			arg1 |= 0x200;
		}
		if (local21.method8287(local25)) {
			arg1 |= 0x80;
		}
		if (local21.method8283(local25)) {
			arg1 |= 0x100;
		}
		if (local21.method8288(local25)) {
			arg1 |= 0x400;
		}
		if (local67 != null) {
			if (local67.method8287(local71)) {
				arg1 |= 0x80;
			}
			if (local67.method8283(local71)) {
				arg1 |= 0x100;
			}
			if (local67.method8288(local71)) {
				arg1 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method8287(arg2)) {
				arg1 |= 0x80;
			}
			if (local35.method8283(arg2)) {
				arg1 |= 0x100;
			}
			if (local35.method8288(arg2)) {
				arg1 |= 0x400;
			}
		}
		if (local69 != null) {
			if (local69.method8287(local73)) {
				arg1 |= 0x80;
			}
			if (local69.method8283(local73)) {
				arg1 |= 0x100;
			}
			if (local69.method8288(local73)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(271) Class114 local271 = arg0.method8810((byte) 1, arg1, true);
		local271.method8794(local8, arg2, local21, local35, this.aBoolean106, 0, local25, arg3 - 1);
		if (local67 != null) {
			local271.method8794(local8, local73, local67, local69, this.aBoolean106, 0, local71, arg3 - 1);
		}
		return local271;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
	public void method1296() {
		if (this.anInt1422 == -1) {
			if (this.aBooleanArray2 == null) {
				this.anInt1422 = 0;
			} else {
				this.anInt1422 = 2;
			}
		}
		if (this.anInt1428 != -1) {
			return;
		}
		if (this.aBooleanArray2 == null) {
			this.anInt1428 = 0;
		} else {
			this.anInt1428 = 2;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIZ)I")
	public int method1297(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) int local5 = 0;
		@Pc(19) int local19 = 0;
		@Pc(24) int local24 = this.anIntArray75[arg1];
		@Pc(26) Class5_Sub2_Sub20 local26 = null;
		@Pc(34) Class5_Sub2_Sub20 local34 = this.aClass128_1.method2690(local24 >> 16);
		@Pc(38) int local38 = local24 & 0xFFFF;
		if (local34 == null) {
			return 0;
		}
		if ((this.aBoolean107 || Static67.aBoolean65) && arg0 != -1 && this.anIntArray75.length > arg0) {
			local19 = this.anIntArray75[arg0];
			local26 = this.aClass128_1.method2690(local19 >> 16);
			local19 &= 0xFFFF;
		}
		if (this.aBoolean106) {
			local5 = 512;
		}
		if (local34.method8287(local38)) {
			local5 |= 0x80;
		}
		if (local34.method8283(local38)) {
			local5 |= 0x100;
		}
		if (local34.method8288(local38)) {
			local5 |= 0x400;
		}
		if (local26 != null) {
			if (local26.method8287(local19)) {
				local5 |= 0x80;
			}
			if (local26.method8283(local19)) {
				local5 |= 0x100;
			}
			if (local26.method8288(local19)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray72 != null && arg2) {
			@Pc(154) int local154;
			@Pc(167) Class5_Sub2_Sub20 local167;
			if (this.anIntArray72.length > arg1) {
				local154 = this.anIntArray72[arg1];
				if (local154 != 65535) {
					local167 = this.aClass128_1.method2690(local154 >> 16);
					local154 &= 0xFFFF;
					if (local167 != null) {
						if (local167.method8287(local154)) {
							local5 |= 0x80;
						}
						if (local167.method8283(local154)) {
							local5 |= 0x100;
						}
						if (local167.method8288(local154)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean107 || Static67.aBoolean65) && arg0 != -1 && arg0 < this.anIntArray72.length) {
				local154 = this.anIntArray72[arg0];
				if (local154 != 65535) {
					local167 = this.aClass128_1.method2690(local154 >> 16);
					local154 &= 0xFFFF;
					if (local167 != null) {
						if (local167.method8287(local154)) {
							local5 |= 0x80;
						}
						if (local167.method8283(local154)) {
							local5 |= 0x100;
						}
						if (local167.method8288(local154)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILclient!rv;)V")
	public void method1298(@OriginalArg(1) Class5_Sub15 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3642();
			if (local13 == 0) {
				return;
			}
			this.method1301(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIBILclient!ka;II)Lclient!ka;")
	public Class114 method1300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class114 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray71[arg5];
		@Pc(13) int local13 = this.anIntArray75[arg5];
		@Pc(21) Class5_Sub2_Sub20 local21 = this.aClass128_1.method2690(local13 >> 16);
		@Pc(31) int local31 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg4.method8810(arg2, arg3, true);
		}
		@Pc(41) Class5_Sub2_Sub20 local41 = null;
		if ((this.aBoolean107 || Static67.aBoolean65) && arg6 != -1 && this.anIntArray75.length > arg6) {
			@Pc(60) int local60 = this.anIntArray75[arg6];
			local41 = this.aClass128_1.method2690(local60 >> 16);
			arg6 = local60 & 0xFFFF;
		}
		if (this.aBoolean106) {
			arg3 |= 0x200;
		}
		if (local21.method8287(local31)) {
			arg3 |= 0x80;
		}
		if (local21.method8283(local31)) {
			arg3 |= 0x100;
		}
		if (local21.method8288(local31)) {
			arg3 |= 0x400;
		}
		if (local41 != null) {
			if (local41.method8287(arg6)) {
				arg3 |= 0x80;
			}
			if (local41.method8283(arg6)) {
				arg3 |= 0x100;
			}
			if (local41.method8288(arg6)) {
				arg3 |= 0x400;
			}
		}
		arg3 |= 0x20;
		@Pc(145) Class114 local145 = arg4.method8810(arg2, arg3, true);
		local145.method8794(local8, arg6, local21, local41, this.aBoolean106, arg0, local31, arg1 - 1);
		return local145;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!rv;IZ)V")
	private void method1301(@OriginalArg(0) Class5_Sub15 arg0, @OriginalArg(1) int arg1) {
		@Pc(22) int local22;
		@Pc(24) int local24;
		@Pc(109) int local109;
		@Pc(303) int local303;
		if (arg1 == 1) {
			local22 = arg0.method3698();
			this.anIntArray71 = new int[local22];
			for (local24 = 0; local24 < local22; local24++) {
				this.anIntArray71[local24] = arg0.method3698();
			}
			this.anIntArray75 = new int[local22];
			for (local109 = 0; local109 < local22; local109++) {
				this.anIntArray75[local109] = arg0.method3698();
			}
			for (local303 = 0; local303 < local22; local303++) {
				this.anIntArray75[local303] += arg0.method3698() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt1432 = arg0.method3698();
		} else if (arg1 == 3) {
			this.aBooleanArray2 = new boolean[256];
			local22 = arg0.method3642();
			for (local24 = 0; local24 < local22; local24++) {
				this.aBooleanArray2[arg0.method3642()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt1419 = arg0.method3642();
		} else if (arg1 == 6) {
			this.anInt1423 = arg0.method3698();
		} else if (arg1 == 7) {
			this.anInt1433 = arg0.method3698();
		} else if (arg1 == 8) {
			this.anInt1429 = arg0.method3642();
		} else if (arg1 == 9) {
			this.anInt1428 = arg0.method3642();
		} else if (arg1 == 10) {
			this.anInt1422 = arg0.method3642();
		} else if (arg1 == 11) {
			this.anInt1425 = arg0.method3642();
		} else if (arg1 == 12) {
			local22 = arg0.method3642();
			this.anIntArray72 = new int[local22];
			for (local24 = 0; local24 < local22; local24++) {
				this.anIntArray72[local24] = arg0.method3698();
			}
			for (local109 = 0; local109 < local22; local109++) {
				this.anIntArray72[local109] = (arg0.method3698() << 16) + this.anIntArray72[local109];
			}
		} else if (arg1 == 13) {
			local22 = arg0.method3698();
			this.anIntArrayArray7 = new int[local22][];
			for (local24 = 0; local24 < local22; local24++) {
				local109 = arg0.method3642();
				if (local109 > 0) {
					this.anIntArrayArray7[local24] = new int[local109];
					this.anIntArrayArray7[local24][0] = arg0.method3633();
					for (local303 = 1; local303 < local109; local303++) {
						this.anIntArrayArray7[local24][local303] = arg0.method3698();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean106 = true;
		} else if (arg1 == 15) {
			this.aBoolean107 = true;
		} else if (arg1 == 16) {
			this.aBoolean105 = true;
		} else if (arg1 == 18) {
			this.aBoolean104 = true;
		} else if (arg1 == 19) {
			if (this.anIntArray74 == null) {
				this.anIntArray74 = new int[this.anIntArrayArray7.length];
				for (local22 = 0; local22 < this.anIntArrayArray7.length; local22++) {
					this.anIntArray74[local22] = 255;
				}
			}
			this.anIntArray74[arg0.method3642()] = arg0.method3642();
		} else if (arg1 == 20) {
			if (this.anIntArray76 == null || this.anIntArray73 == null) {
				this.anIntArray76 = new int[this.anIntArrayArray7.length];
				this.anIntArray73 = new int[this.anIntArrayArray7.length];
				for (local22 = 0; local22 < this.anIntArrayArray7.length; local22++) {
					this.anIntArray76[local22] = 256;
					this.anIntArray73[local22] = 256;
				}
			}
			local22 = arg0.method3642();
			this.anIntArray76[local22] = arg0.method3698();
			this.anIntArray73[local22] = arg0.method3698();
		}
	}
}
