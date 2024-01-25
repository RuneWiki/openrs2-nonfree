import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class228 {

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "[I")
	public int[] anIntArray402;

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "[I")
	public int[] anIntArray403;

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "[I")
	public int[] anIntArray404;

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "[I")
	public int[] anIntArray405;

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "[I")
	private int[] anIntArray406;

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "Lclient!ru;")
	public Class308 aClass308_1;

	@OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
	public int anInt6230;

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "[[I")
	public int[][] anIntArrayArray73;

	@OriginalMember(owner = "client!mk", name = "A", descriptor = "[I")
	public int[] anIntArray407;

	@OriginalMember(owner = "client!mk", name = "C", descriptor = "[Z")
	public boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "Z")
	public boolean aBoolean451 = false;

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
	public int anInt6225 = -1;

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
	public int anInt6220 = 2;

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "Z")
	public boolean aBoolean450 = false;

	@OriginalMember(owner = "client!mk", name = "q", descriptor = "Z")
	public boolean aBoolean452 = false;

	@OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
	public int anInt6222 = -1;

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
	public int anInt6221 = -1;

	@OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
	public int anInt6226 = 99;

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
	public int anInt6227 = 5;

	@OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
	public int anInt6231 = -1;

	@OriginalMember(owner = "client!mk", name = "z", descriptor = "Z")
	public boolean aBoolean453 = false;

	@OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
	public int anInt6232 = -1;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
	public void method5352() {
		if (this.anInt6221 == -1) {
			if (this.aBooleanArray12 == null) {
				this.anInt6221 = 0;
			} else {
				this.anInt6221 = 2;
			}
		}
		if (this.anInt6222 != -1) {
			return;
		}
		if (this.aBooleanArray12 == null) {
			this.anInt6222 = 0;
		} else {
			this.anInt6222 = 2;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!sl;BI)V")
	private void method5353(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(42) int local42;
		@Pc(56) int local56;
		if (arg1 == 1) {
			local18 = arg0.method2825();
			this.anIntArray404 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray404[local24] = arg0.method2825();
			}
			this.anIntArray403 = new int[local18];
			for (local42 = 0; local42 < local18; local42++) {
				this.anIntArray403[local42] = arg0.method2825();
			}
			for (local56 = 0; local56 < local18; local56++) {
				this.anIntArray403[local56] += arg0.method2825() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt6231 = arg0.method2825();
		} else if (arg1 == 3) {
			this.aBooleanArray12 = new boolean[256];
			local18 = arg0.method2859();
			for (local24 = 0; local24 < local18; local24++) {
				this.aBooleanArray12[arg0.method2859()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt6227 = arg0.method2859();
		} else if (arg1 == 6) {
			this.anInt6225 = arg0.method2825();
		} else if (arg1 == 7) {
			this.anInt6232 = arg0.method2825();
		} else if (arg1 == 8) {
			this.anInt6226 = arg0.method2859();
		} else if (arg1 == 9) {
			this.anInt6222 = arg0.method2859();
		} else if (arg1 == 10) {
			this.anInt6221 = arg0.method2859();
		} else if (arg1 == 11) {
			this.anInt6220 = arg0.method2859();
		} else if (arg1 == 12) {
			local18 = arg0.method2859();
			this.anIntArray406 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray406[local24] = arg0.method2825();
			}
			for (local42 = 0; local42 < local18; local42++) {
				this.anIntArray406[local42] = (arg0.method2825() << 16) + this.anIntArray406[local42];
			}
		} else if (arg1 == 13) {
			local18 = arg0.method2825();
			this.anIntArrayArray73 = new int[local18][];
			for (local24 = 0; local24 < local18; local24++) {
				local42 = arg0.method2859();
				if (local42 > 0) {
					this.anIntArrayArray73[local24] = new int[local42];
					this.anIntArrayArray73[local24][0] = arg0.method2835();
					for (local56 = 1; local56 < local42; local56++) {
						this.anIntArrayArray73[local24][local56] = arg0.method2825();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean453 = true;
		} else if (arg1 == 15) {
			this.aBoolean451 = true;
		} else if (arg1 == 16) {
			this.aBoolean450 = true;
		} else if (arg1 == 18) {
			this.aBoolean452 = true;
		} else if (arg1 == 19) {
			if (this.anIntArray407 == null) {
				this.anIntArray407 = new int[this.anIntArrayArray73.length];
				for (local18 = 0; local18 < this.anIntArrayArray73.length; local18++) {
					this.anIntArray407[local18] = 255;
				}
			}
			this.anIntArray407[arg0.method2859()] = arg0.method2859();
		} else if (arg1 == 20) {
			if (this.anIntArray402 == null || this.anIntArray405 == null) {
				this.anIntArray402 = new int[this.anIntArrayArray73.length];
				this.anIntArray405 = new int[this.anIntArrayArray73.length];
				for (local18 = 0; local18 < this.anIntArrayArray73.length; local18++) {
					this.anIntArray402[local18] = 256;
					this.anIntArray405[local18] = 256;
				}
			}
			local18 = arg0.method2859();
			this.anIntArray402[local18] = arg0.method2825();
			this.anIntArray405[local18] = arg0.method2825();
			return;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIBILclient!ka;)Lclient!ka;")
	public Class193 method5354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class193 arg4) {
		@Pc(8) int local8 = this.anIntArray404[arg2];
		@Pc(13) int local13 = this.anIntArray403[arg2];
		@Pc(21) Class2_Sub7_Sub6 local21 = this.aClass308_1.method7074(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg4.method6609((byte) 1, arg1, true);
		}
		@Pc(35) Class2_Sub7_Sub6 local35 = null;
		if ((this.aBoolean451 || Static462.aBoolean531) && arg0 != -1 && arg0 < this.anIntArray403.length) {
			@Pc(62) int local62 = this.anIntArray403[arg0];
			local35 = this.aClass308_1.method7074(local62 >> 16);
			arg0 = local62 & 0xFFFF;
		}
		@Pc(76) Class2_Sub7_Sub6 local76 = null;
		@Pc(78) Class2_Sub7_Sub6 local78 = null;
		@Pc(80) int local80 = 0;
		@Pc(82) int local82 = 0;
		if (this.anIntArray406 != null) {
			if (this.anIntArray406.length > arg2) {
				local80 = this.anIntArray406[arg2];
				if (local80 != 65535) {
					local76 = this.aClass308_1.method7074(local80 >> 16);
					local80 &= 0xFFFF;
				}
			}
			if ((this.aBoolean451 || Static462.aBoolean531) && arg0 != -1 && arg0 < this.anIntArray406.length) {
				local82 = this.anIntArray406[arg0];
				if (local82 != 65535) {
					local78 = this.aClass308_1.method7074(local82 >> 16);
					local82 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean453) {
			arg1 |= 0x200;
		}
		if (local21.method3717(local25)) {
			arg1 |= 0x80;
		}
		if (local21.method3713(local25)) {
			arg1 |= 0x100;
		}
		if (local21.method3712(local25)) {
			arg1 |= 0x400;
		}
		if (local76 != null) {
			if (local76.method3717(local80)) {
				arg1 |= 0x80;
			}
			if (local76.method3713(local80)) {
				arg1 |= 0x100;
			}
			if (local76.method3712(local80)) {
				arg1 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method3717(arg0)) {
				arg1 |= 0x80;
			}
			if (local35.method3713(arg0)) {
				arg1 |= 0x100;
			}
			if (local35.method3712(arg0)) {
				arg1 |= 0x400;
			}
		}
		if (local78 != null) {
			if (local78.method3717(local82)) {
				arg1 |= 0x80;
			}
			if (local78.method3713(local82)) {
				arg1 |= 0x100;
			}
			if (local78.method3712(local82)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(281) Class193 local281 = arg4.method6609((byte) 1, arg1, true);
		local281.method6614(this.aBoolean453, local35, 0, local25, local21, arg0, local8, arg3 - 1);
		if (local76 != null) {
			local281.method6614(this.aBoolean453, local78, 0, local80, local76, local82, local8, arg3 - 1);
		}
		return local281;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILclient!ka;BIIIIB)Lclient!ka;")
	public Class193 method5355(@OriginalArg(0) int arg0, @OriginalArg(1) Class193 arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) int local8 = this.anIntArray404[arg3];
		@Pc(13) int local13 = this.anIntArray403[arg3];
		@Pc(23) Class2_Sub7_Sub6 local23 = this.aClass308_1.method7074(local13 >> 16);
		@Pc(27) int local27 = local13 & 0xFFFF;
		if (local23 == null) {
			return arg1.method6609(arg2, arg4, true);
		}
		@Pc(37) Class2_Sub7_Sub6 local37 = null;
		if ((this.aBoolean451 || Static462.aBoolean531) && arg0 != -1 && arg0 < this.anIntArray403.length) {
			@Pc(55) int local55 = this.anIntArray403[arg0];
			local37 = this.aClass308_1.method7074(local55 >> 16);
			arg0 = local55 & 0xFFFF;
		}
		if (this.aBoolean453) {
			arg4 |= 0x200;
		}
		if (local23.method3717(local27)) {
			arg4 |= 0x80;
		}
		if (local23.method3713(local27)) {
			arg4 |= 0x100;
		}
		if (local23.method3712(local27)) {
			arg4 |= 0x400;
		}
		if (local37 != null) {
			if (local37.method3717(arg0)) {
				arg4 |= 0x80;
			}
			if (local37.method3713(arg0)) {
				arg4 |= 0x100;
			}
			if (local37.method3712(arg0)) {
				arg4 |= 0x400;
			}
		}
		arg4 |= 0x20;
		@Pc(147) Class193 local147 = arg1.method6609(arg2, arg4, true);
		local147.method6614(this.aBoolean453, local37, arg6, local27, local23, arg0, local8, arg5 - 1);
		return local147;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIBZ)I")
	public int method5358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray403[arg0];
		@Pc(14) Class2_Sub7_Sub6 local14 = null;
		@Pc(27) Class2_Sub7_Sub6 local27 = this.aClass308_1.method7074(local12 >> 16);
		@Pc(31) int local31 = local12 & 0xFFFF;
		if (local27 == null) {
			return 0;
		}
		if ((this.aBoolean451 || Static462.aBoolean531) && arg1 != -1 && this.anIntArray403.length > arg1) {
			local7 = this.anIntArray403[arg1];
			local14 = this.aClass308_1.method7074(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean453) {
			local5 = 512;
		}
		if (local27.method3717(local31)) {
			local5 |= 0x80;
		}
		if (local27.method3713(local31)) {
			local5 |= 0x100;
		}
		if (local27.method3712(local31)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method3717(local7)) {
				local5 |= 0x80;
			}
			if (local14.method3713(local7)) {
				local5 |= 0x100;
			}
			if (local14.method3712(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray406 != null && arg2) {
			@Pc(147) int local147;
			@Pc(160) Class2_Sub7_Sub6 local160;
			if (arg0 < this.anIntArray406.length) {
				local147 = this.anIntArray406[arg0];
				if (local147 != 65535) {
					local160 = this.aClass308_1.method7074(local147 >> 16);
					local147 &= 0xFFFF;
					if (local160 != null) {
						if (local160.method3717(local147)) {
							local5 |= 0x80;
						}
						if (local160.method3713(local147)) {
							local5 |= 0x100;
						}
						if (local160.method3712(local147)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean451 || Static462.aBoolean531) && arg1 != -1 && arg1 < this.anIntArray406.length) {
				local147 = this.anIntArray406[arg1];
				if (local147 != 65535) {
					local160 = this.aClass308_1.method7074(local147 >> 16);
					local147 &= 0xFFFF;
					if (local160 != null) {
						if (local160.method3717(local147)) {
							local5 |= 0x80;
						}
						if (local160.method3713(local147)) {
							local5 |= 0x100;
						}
						if (local160.method3712(local147)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLclient!sl;)V")
	public void method5359(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2859();
			if (local13 == 0) {
				return;
			}
			this.method5353(arg0, local13);
		}
	}
}
