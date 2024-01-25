import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class111 {

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "[I")
	public int[] anIntArray150;

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "[I")
	public int[] anIntArray151;

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "[Z")
	public boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "[I")
	public int[] anIntArray152;

	@OriginalMember(owner = "client!fo", name = "j", descriptor = "[I")
	public int[] anIntArray153;

	@OriginalMember(owner = "client!fo", name = "l", descriptor = "[I")
	public int[] anIntArray154;

	@OriginalMember(owner = "client!fo", name = "o", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!fo", name = "u", descriptor = "Lclient!oq;")
	public Class254 aClass254_2;

	@OriginalMember(owner = "client!fo", name = "z", descriptor = "[[I")
	public int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!fo", name = "B", descriptor = "I")
	public int anInt3157;

	@OriginalMember(owner = "client!fo", name = "k", descriptor = "I")
	public int anInt3147 = -1;

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "I")
	public int anInt3149 = -1;

	@OriginalMember(owner = "client!fo", name = "m", descriptor = "I")
	public int anInt3148 = 2;

	@OriginalMember(owner = "client!fo", name = "r", descriptor = "Z")
	public boolean aBoolean233 = false;

	@OriginalMember(owner = "client!fo", name = "t", descriptor = "Z")
	public boolean aBoolean234 = false;

	@OriginalMember(owner = "client!fo", name = "s", descriptor = "I")
	public int anInt3152 = 5;

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "Z")
	public boolean aBoolean232 = false;

	@OriginalMember(owner = "client!fo", name = "p", descriptor = "I")
	public int anInt3150 = -1;

	@OriginalMember(owner = "client!fo", name = "A", descriptor = "I")
	public int anInt3156 = 99;

	@OriginalMember(owner = "client!fo", name = "x", descriptor = "I")
	public int anInt3155 = -1;

	@OriginalMember(owner = "client!fo", name = "C", descriptor = "Z")
	public boolean aBoolean235 = false;

	@OriginalMember(owner = "client!fo", name = "D", descriptor = "I")
	public int anInt3158 = -1;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIILclient!da;I)Lclient!da;")
	public Class65 method2546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class65 arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray150[arg2];
		@Pc(13) int local13 = this.anIntArray153[arg2];
		@Pc(21) Class4_Sub6_Sub8 local21 = this.aClass254_2.method5940(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg3.method7682((byte) 1, arg0, true);
		}
		@Pc(35) Class4_Sub6_Sub8 local35 = null;
		if ((this.aBoolean232 || Static165.aBoolean248) && arg1 != -1 && this.anIntArray153.length > arg1) {
			@Pc(57) int local57 = this.anIntArray153[arg1];
			local35 = this.aClass254_2.method5940(local57 >> 16);
			arg1 = local57 & 0xFFFF;
		}
		@Pc(71) Class4_Sub6_Sub8 local71 = null;
		@Pc(73) Class4_Sub6_Sub8 local73 = null;
		@Pc(75) int local75 = 0;
		@Pc(77) int local77 = 0;
		if (this.anIntArray155 != null) {
			if (arg2 < this.anIntArray155.length) {
				local75 = this.anIntArray155[arg2];
				if (local75 != 65535) {
					local71 = this.aClass254_2.method5940(local75 >> 16);
					local75 &= 0xFFFF;
				}
			}
			if ((this.aBoolean232 || Static165.aBoolean248) && arg1 != -1 && this.anIntArray155.length > arg1) {
				local77 = this.anIntArray155[arg1];
				if (local77 != 65535) {
					local73 = this.aClass254_2.method5940(local77 >> 16);
					local77 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean234) {
			arg0 |= 0x200;
		}
		if (local21.method3080(local25)) {
			arg0 |= 0x80;
		}
		if (local21.method3076(local25)) {
			arg0 |= 0x100;
		}
		if (local21.method3077(local25)) {
			arg0 |= 0x400;
		}
		if (local71 != null) {
			if (local71.method3080(local75)) {
				arg0 |= 0x80;
			}
			if (local71.method3076(local75)) {
				arg0 |= 0x100;
			}
			if (local71.method3077(local75)) {
				arg0 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method3080(arg1)) {
				arg0 |= 0x80;
			}
			if (local35.method3076(arg1)) {
				arg0 |= 0x100;
			}
			if (local35.method3077(arg1)) {
				arg0 |= 0x400;
			}
		}
		if (local73 != null) {
			if (local73.method3080(local77)) {
				arg0 |= 0x80;
			}
			if (local73.method3076(local77)) {
				arg0 |= 0x100;
			}
			if (local73.method3077(local77)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(290) Class65 local290 = arg3.method7682((byte) 1, arg0, true);
		local290.method7689(0, this.aBoolean234, local8, local35, arg1, arg4 - 1, local25, local21);
		if (local71 != null) {
			local290.method7689(0, this.aBoolean234, local8, local73, local77, arg4 - 1, local75, local71);
		}
		return local290;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V")
	public void method2547() {
		if (this.anInt3150 == -1) {
			if (this.aBooleanArray5 == null) {
				this.anInt3150 = 0;
			} else {
				this.anInt3150 = 2;
			}
		}
		if (this.anInt3147 != -1) {
			return;
		}
		if (this.aBooleanArray5 == null) {
			this.anInt3147 = 0;
		} else {
			this.anInt3147 = 2;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!da;BIIIII)Lclient!da;")
	public Class65 method2548(@OriginalArg(0) int arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray150[arg3];
		@Pc(19) int local19 = this.anIntArray153[arg3];
		@Pc(27) Class4_Sub6_Sub8 local27 = this.aClass254_2.method5940(local19 >> 16);
		@Pc(31) int local31 = local19 & 0xFFFF;
		if (local27 == null) {
			return arg1.method7682(arg2, arg4, true);
		}
		@Pc(41) Class4_Sub6_Sub8 local41 = null;
		if ((this.aBoolean232 || Static165.aBoolean248) && arg6 != -1 && arg6 < this.anIntArray153.length) {
			@Pc(59) int local59 = this.anIntArray153[arg6];
			local41 = this.aClass254_2.method5940(local59 >> 16);
			arg6 = local59 & 0xFFFF;
		}
		if (this.aBoolean234) {
			arg4 |= 0x200;
		}
		if (local27.method3080(local31)) {
			arg4 |= 0x80;
		}
		if (local27.method3076(local31)) {
			arg4 |= 0x100;
		}
		if (local27.method3077(local31)) {
			arg4 |= 0x400;
		}
		if (local41 != null) {
			if (local41.method3080(arg6)) {
				arg4 |= 0x80;
			}
			if (local41.method3076(arg6)) {
				arg4 |= 0x100;
			}
			if (local41.method3077(arg6)) {
				arg4 |= 0x400;
			}
		}
		arg4 |= 0x20;
		@Pc(146) Class65 local146 = arg1.method7682(arg2, arg4, true);
		local146.method7689(arg5, this.aBoolean234, local8, local41, arg6, arg0 - 1, local31, local27);
		return local146;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!ek;)V")
	public void method2549(@OriginalArg(1) Class4_Sub13 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method7004();
			if (local13 == 0) {
				return;
			}
			this.method2550(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!ek;I)V")
	private void method2550(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub13 arg1) {
		@Pc(10) int local10;
		@Pc(16) int local16;
		@Pc(39) int local39;
		@Pc(58) int local58;
		if (arg0 == 1) {
			local10 = arg1.method7054();
			this.anIntArray150 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray150[local16] = arg1.method7054();
			}
			this.anIntArray153 = new int[local10];
			for (local39 = 0; local39 < local10; local39++) {
				this.anIntArray153[local39] = arg1.method7054();
			}
			for (local58 = 0; local58 < local10; local58++) {
				this.anIntArray153[local58] = (arg1.method7054() << 16) + this.anIntArray153[local58];
			}
		} else if (arg0 == 2) {
			this.anInt3155 = arg1.method7054();
		} else if (arg0 == 3) {
			this.aBooleanArray5 = new boolean[256];
			local10 = arg1.method7004();
			for (local16 = 0; local16 < local10; local16++) {
				this.aBooleanArray5[arg1.method7004()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt3152 = arg1.method7004();
		} else if (arg0 == 6) {
			this.anInt3149 = arg1.method7054();
		} else if (arg0 == 7) {
			this.anInt3158 = arg1.method7054();
		} else if (arg0 == 8) {
			this.anInt3156 = arg1.method7004();
		} else if (arg0 == 9) {
			this.anInt3147 = arg1.method7004();
		} else if (arg0 == 10) {
			this.anInt3150 = arg1.method7004();
		} else if (arg0 == 11) {
			this.anInt3148 = arg1.method7004();
		} else if (arg0 == 12) {
			local10 = arg1.method7004();
			this.anIntArray155 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray155[local16] = arg1.method7054();
			}
			for (local39 = 0; local39 < local10; local39++) {
				this.anIntArray155[local39] += arg1.method7054() << 16;
			}
		} else if (arg0 == 13) {
			local10 = arg1.method7054();
			this.anIntArrayArray14 = new int[local10][];
			for (local16 = 0; local16 < local10; local16++) {
				local39 = arg1.method7004();
				if (local39 > 0) {
					this.anIntArrayArray14[local16] = new int[local39];
					this.anIntArrayArray14[local16][0] = arg1.method7013();
					for (local58 = 1; local58 < local39; local58++) {
						this.anIntArrayArray14[local16][local58] = arg1.method7054();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean234 = true;
		} else if (arg0 == 15) {
			this.aBoolean232 = true;
		} else if (arg0 == 16) {
			this.aBoolean235 = true;
		} else if (arg0 == 18) {
			this.aBoolean233 = true;
		} else if (arg0 == 19) {
			if (this.anIntArray152 == null) {
				this.anIntArray152 = new int[this.anIntArrayArray14.length];
				for (local10 = 0; local10 < this.anIntArrayArray14.length; local10++) {
					this.anIntArray152[local10] = 255;
				}
			}
			this.anIntArray152[arg1.method7004()] = arg1.method7004();
		} else if (arg0 == 20) {
			if (this.anIntArray151 == null || this.anIntArray154 == null) {
				this.anIntArray151 = new int[this.anIntArrayArray14.length];
				this.anIntArray154 = new int[this.anIntArrayArray14.length];
				for (local10 = 0; local10 < this.anIntArrayArray14.length; local10++) {
					this.anIntArray151[local10] = 256;
					this.anIntArray154[local10] = 256;
				}
			}
			local10 = arg1.method7004();
			this.anIntArray151[local10] = arg1.method7054();
			this.anIntArray154[local10] = arg1.method7054();
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BIIZ)I")
	public int method2551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) int local5 = 0;
		@Pc(13) int local13 = 0;
		@Pc(18) int local18 = this.anIntArray153[arg1];
		@Pc(20) Class4_Sub6_Sub8 local20 = null;
		@Pc(28) Class4_Sub6_Sub8 local28 = this.aClass254_2.method5940(local18 >> 16);
		@Pc(32) int local32 = local18 & 0xFFFF;
		if (local28 == null) {
			return 0;
		}
		if ((this.aBoolean232 || Static165.aBoolean248) && arg0 != -1 && arg0 < this.anIntArray153.length) {
			local13 = this.anIntArray153[arg0];
			local20 = this.aClass254_2.method5940(local13 >> 16);
			local13 &= 0xFFFF;
		}
		if (this.aBoolean234) {
			local5 = 512;
		}
		if (local28.method3080(local32)) {
			local5 |= 0x80;
		}
		if (local28.method3076(local32)) {
			local5 |= 0x100;
		}
		if (local28.method3077(local32)) {
			local5 |= 0x400;
		}
		if (local20 != null) {
			if (local20.method3080(local13)) {
				local5 |= 0x80;
			}
			if (local20.method3076(local13)) {
				local5 |= 0x100;
			}
			if (local20.method3077(local13)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray155 != null && arg2) {
			@Pc(144) int local144;
			@Pc(157) Class4_Sub6_Sub8 local157;
			if (this.anIntArray155.length > arg1) {
				local144 = this.anIntArray155[arg1];
				if (local144 != 65535) {
					local157 = this.aClass254_2.method5940(local144 >> 16);
					local144 &= 0xFFFF;
					if (local157 != null) {
						if (local157.method3080(local144)) {
							local5 |= 0x80;
						}
						if (local157.method3076(local144)) {
							local5 |= 0x100;
						}
						if (local157.method3077(local144)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean232 || Static165.aBoolean248) && arg0 != -1 && arg0 < this.anIntArray155.length) {
				local144 = this.anIntArray155[arg0];
				if (local144 != 65535) {
					local157 = this.aClass254_2.method5940(local144 >> 16);
					local144 &= 0xFFFF;
					if (local157 != null) {
						if (local157.method3080(local144)) {
							local5 |= 0x80;
						}
						if (local157.method3076(local144)) {
							local5 |= 0x100;
						}
						if (local157.method3077(local144)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}
}
