import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class264 {

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
	public int anInt7034;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "[I")
	public int[] anIntArray420;

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "[I")
	public int[] anIntArray421;

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "[I")
	private int[] anIntArray422;

	@OriginalMember(owner = "client!oe", name = "F", descriptor = "[[I")
	public int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "[I")
	public int[] anIntArray423;

	@OriginalMember(owner = "client!oe", name = "t", descriptor = "[Z")
	public boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "[I")
	public int[] anIntArray424;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "[I")
	public int[] anIntArray425;

	@OriginalMember(owner = "client!oe", name = "z", descriptor = "Lclient!aia;")
	public Class14 aClass14_2;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "Z")
	public boolean aBoolean469 = false;

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
	public int anInt7036 = -1;

	@OriginalMember(owner = "client!oe", name = "B", descriptor = "I")
	public int anInt7033 = 99;

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "Z")
	public boolean aBoolean468 = false;

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
	public int anInt7041 = -1;

	@OriginalMember(owner = "client!oe", name = "A", descriptor = "Z")
	public boolean aBoolean467 = false;

	@OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
	public int anInt7045 = -1;

	@OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
	public int anInt7047 = 2;

	@OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
	public int anInt7043 = 5;

	@OriginalMember(owner = "client!oe", name = "v", descriptor = "I")
	public int anInt7035 = -1;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "Z")
	public boolean aBoolean470 = false;

	@OriginalMember(owner = "client!oe", name = "G", descriptor = "I")
	public int anInt7050 = -1;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
	public void method6125() {
		if (this.anInt7035 == -1) {
			if (this.aBooleanArray20 == null) {
				this.anInt7035 = 0;
			} else {
				this.anInt7035 = 2;
			}
		}
		if (this.anInt7041 != -1) {
			return;
		}
		if (this.aBooleanArray20 == null) {
			this.anInt7041 = 0;
		} else {
			this.anInt7041 = 2;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!ka;BIIIBII)Lclient!ka;")
	public Class43 method6126(@OriginalArg(0) Class43 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray425[arg3];
		@Pc(13) int local13 = this.anIntArray423[arg3];
		@Pc(21) Class5_Sub1_Sub21 local21 = this.aClass14_2.method221(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg0.method8840(arg4, arg2, true);
		}
		@Pc(36) Class5_Sub1_Sub21 local36 = null;
		if ((this.aBoolean467 || Static54.aBoolean77) && arg1 != -1 && this.anIntArray423.length > arg1) {
			@Pc(61) int local61 = this.anIntArray423[arg1];
			local36 = this.aClass14_2.method221(local61 >> 16);
			arg1 = local61 & 0xFFFF;
		}
		if (this.aBoolean468) {
			arg2 |= 0x200;
		}
		if (local21.method8958(local25)) {
			arg2 |= 0x80;
		}
		if (local21.method8965(local25)) {
			arg2 |= 0x100;
		}
		if (local21.method8962(local25)) {
			arg2 |= 0x400;
		}
		if (local36 != null) {
			if (local36.method8958(arg1)) {
				arg2 |= 0x80;
			}
			if (local36.method8965(arg1)) {
				arg2 |= 0x100;
			}
			if (local36.method8962(arg1)) {
				arg2 |= 0x400;
			}
		}
		arg2 |= 0x20;
		@Pc(156) Class43 local156 = arg0.method8840(arg4, arg2, true);
		local156.method8841(local36, local8, local21, this.aBoolean468, local25, arg5, arg6 - 1, arg1);
		return local156;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BILclient!wq;)V")
	private void method6127(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub36 arg1) {
		@Pc(170) int local170;
		@Pc(285) int local285;
		@Pc(291) int local291;
		@Pc(313) int local313;
		if (arg0 == 1) {
			local170 = arg1.method7333();
			this.anIntArray425 = new int[local170];
			for (local285 = 0; local285 < local170; local285++) {
				this.anIntArray425[local285] = arg1.method7333();
			}
			this.anIntArray423 = new int[local170];
			for (local291 = 0; local291 < local170; local291++) {
				this.anIntArray423[local291] = arg1.method7333();
			}
			for (local313 = 0; local313 < local170; local313++) {
				this.anIntArray423[local313] = (arg1.method7333() << 16) + this.anIntArray423[local313];
			}
		} else if (arg0 == 2) {
			this.anInt7050 = arg1.method7333();
		} else if (arg0 == 3) {
			this.aBooleanArray20 = new boolean[256];
			local170 = arg1.method7291();
			for (local285 = 0; local285 < local170; local285++) {
				this.aBooleanArray20[arg1.method7291()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt7043 = arg1.method7291();
		} else if (arg0 == 6) {
			this.anInt7036 = arg1.method7333();
		} else if (arg0 == 7) {
			this.anInt7045 = arg1.method7333();
		} else if (arg0 == 8) {
			this.anInt7033 = arg1.method7291();
		} else if (arg0 == 9) {
			this.anInt7041 = arg1.method7291();
		} else if (arg0 == 10) {
			this.anInt7035 = arg1.method7291();
		} else if (arg0 == 11) {
			this.anInt7047 = arg1.method7291();
		} else if (arg0 == 12) {
			local170 = arg1.method7291();
			this.anIntArray422 = new int[local170];
			for (local285 = 0; local285 < local170; local285++) {
				this.anIntArray422[local285] = arg1.method7333();
			}
			for (local291 = 0; local291 < local170; local291++) {
				this.anIntArray422[local291] = (arg1.method7333() << 16) + this.anIntArray422[local291];
			}
		} else if (arg0 == 13) {
			local170 = arg1.method7333();
			this.anIntArrayArray46 = new int[local170][];
			for (local285 = 0; local285 < local170; local285++) {
				local291 = arg1.method7291();
				if (local291 > 0) {
					this.anIntArrayArray46[local285] = new int[local291];
					this.anIntArrayArray46[local285][0] = arg1.method7331();
					for (local313 = 1; local313 < local291; local313++) {
						this.anIntArrayArray46[local285][local313] = arg1.method7333();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean468 = true;
		} else if (arg0 == 15) {
			this.aBoolean467 = true;
		} else if (arg0 == 16) {
			this.aBoolean470 = true;
		} else if (arg0 == 18) {
			this.aBoolean469 = true;
		} else if (arg0 == 19) {
			if (this.anIntArray420 == null) {
				this.anIntArray420 = new int[this.anIntArrayArray46.length];
				for (local170 = 0; local170 < this.anIntArrayArray46.length; local170++) {
					this.anIntArray420[local170] = 255;
				}
			}
			this.anIntArray420[arg1.method7291()] = arg1.method7291();
		} else if (arg0 == 20) {
			if (this.anIntArray424 == null || this.anIntArray421 == null) {
				this.anIntArray424 = new int[this.anIntArrayArray46.length];
				this.anIntArray421 = new int[this.anIntArrayArray46.length];
				for (local170 = 0; local170 < this.anIntArrayArray46.length; local170++) {
					this.anIntArray424[local170] = 256;
					this.anIntArray421[local170] = 256;
				}
			}
			local170 = arg1.method7291();
			this.anIntArray424[local170] = arg1.method7333();
			this.anIntArray421[local170] = arg1.method7333();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!wq;B)V")
	public void method6128(@OriginalArg(0) Class5_Sub36 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method7291();
			if (local17 == 0) {
				return;
			}
			this.method6127(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILclient!ka;IIB)Lclient!ka;")
	public Class43 method6130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class43 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) int local8 = this.anIntArray425[arg1];
		@Pc(13) int local13 = this.anIntArray423[arg1];
		@Pc(21) Class5_Sub1_Sub21 local21 = this.aClass14_2.method221(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg2.method8840((byte) 1, arg4, true);
		}
		@Pc(36) Class5_Sub1_Sub21 local36 = null;
		if ((this.aBoolean467 || Static54.aBoolean77) && arg0 != -1 && arg0 < this.anIntArray423.length) {
			@Pc(64) int local64 = this.anIntArray423[arg0];
			local36 = this.aClass14_2.method221(local64 >> 16);
			arg0 = local64 & 0xFFFF;
		}
		@Pc(86) Class5_Sub1_Sub21 local86 = null;
		@Pc(88) Class5_Sub1_Sub21 local88 = null;
		@Pc(90) int local90 = 0;
		@Pc(92) int local92 = 0;
		if (this.anIntArray422 != null) {
			if (arg1 < this.anIntArray422.length) {
				local90 = this.anIntArray422[arg1];
				if (local90 != 65535) {
					local86 = this.aClass14_2.method221(local90 >> 16);
					local90 &= 0xFFFF;
				}
			}
			if ((this.aBoolean467 || Static54.aBoolean77) && arg0 != -1 && this.anIntArray422.length > arg0) {
				local92 = this.anIntArray422[arg0];
				if (local92 != 65535) {
					local88 = this.aClass14_2.method221(local92 >> 16);
					local92 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean468) {
			arg4 |= 0x200;
		}
		if (local21.method8958(local25)) {
			arg4 |= 0x80;
		}
		if (local21.method8965(local25)) {
			arg4 |= 0x100;
		}
		if (local21.method8962(local25)) {
			arg4 |= 0x400;
		}
		if (local86 != null) {
			if (local86.method8958(local90)) {
				arg4 |= 0x80;
			}
			if (local86.method8965(local90)) {
				arg4 |= 0x100;
			}
			if (local86.method8962(local90)) {
				arg4 |= 0x400;
			}
		}
		if (local36 != null) {
			if (local36.method8958(arg0)) {
				arg4 |= 0x80;
			}
			if (local36.method8965(arg0)) {
				arg4 |= 0x100;
			}
			if (local36.method8962(arg0)) {
				arg4 |= 0x400;
			}
		}
		if (local88 != null) {
			if (local88.method8958(local92)) {
				arg4 |= 0x80;
			}
			if (local88.method8965(local92)) {
				arg4 |= 0x100;
			}
			if (local88.method8962(local92)) {
				arg4 |= 0x400;
			}
		}
		arg4 |= 0x20;
		@Pc(302) Class43 local302 = arg2.method8840((byte) 1, arg4, true);
		local302.method8841(local36, local8, local21, this.aBoolean468, local25, 0, arg3 - 1, arg0);
		if (local86 != null) {
			local302.method8841(local88, local8, local86, this.aBoolean468, local90, 0, arg3 - 1, local92);
		}
		return local302;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BZII)I")
	public int method6131(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(20) int local20 = this.anIntArray423[arg2];
		@Pc(22) Class5_Sub1_Sub21 local22 = null;
		@Pc(30) Class5_Sub1_Sub21 local30 = this.aClass14_2.method221(local20 >> 16);
		@Pc(34) int local34 = local20 & 0xFFFF;
		if (local30 == null) {
			return 0;
		}
		if ((this.aBoolean467 || Static54.aBoolean77) && arg1 != -1 && this.anIntArray423.length > arg1) {
			local15 = this.anIntArray423[arg1];
			local22 = this.aClass14_2.method221(local15 >> 16);
			local15 &= 0xFFFF;
		}
		if (this.aBoolean468) {
			local13 = 512;
		}
		if (local30.method8958(local34)) {
			local13 |= 0x80;
		}
		if (local30.method8965(local34)) {
			local13 |= 0x100;
		}
		if (local30.method8962(local34)) {
			local13 |= 0x400;
		}
		if (local22 != null) {
			if (local22.method8958(local15)) {
				local13 |= 0x80;
			}
			if (local22.method8965(local15)) {
				local13 |= 0x100;
			}
			if (local22.method8962(local15)) {
				local13 |= 0x400;
			}
		}
		if (this.anIntArray422 != null && arg0) {
			@Pc(160) int local160;
			@Pc(173) Class5_Sub1_Sub21 local173;
			if (arg2 < this.anIntArray422.length) {
				local160 = this.anIntArray422[arg2];
				if (local160 != 65535) {
					local173 = this.aClass14_2.method221(local160 >> 16);
					local160 &= 0xFFFF;
					if (local173 != null) {
						if (local173.method8958(local160)) {
							local13 |= 0x80;
						}
						if (local173.method8965(local160)) {
							local13 |= 0x100;
						}
						if (local173.method8962(local160)) {
							local13 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean467 || Static54.aBoolean77) && arg1 != -1 && this.anIntArray422.length > arg1) {
				local160 = this.anIntArray422[arg1];
				if (local160 != 65535) {
					local173 = this.aClass14_2.method221(local160 >> 16);
					local160 &= 0xFFFF;
					if (local173 != null) {
						if (local173.method8958(local160)) {
							local13 |= 0x80;
						}
						if (local173.method8965(local160)) {
							local13 |= 0x100;
						}
						if (local173.method8962(local160)) {
							local13 |= 0x400;
						}
					}
				}
			}
		}
		return local13 | 0x20;
	}
}
