import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class290 {

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "[I")
	private int[] anIntArray543;

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "[I")
	public int[] anIntArray544;

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "[I")
	public int[] anIntArray545;

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "[Z")
	public boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
	public int anInt8686;

	@OriginalMember(owner = "client!rj", name = "u", descriptor = "[[I")
	public int[][] anIntArrayArray87;

	@OriginalMember(owner = "client!rj", name = "w", descriptor = "[I")
	public int[] anIntArray548;

	@OriginalMember(owner = "client!rj", name = "A", descriptor = "[I")
	public int[] anIntArray549;

	@OriginalMember(owner = "client!rj", name = "B", descriptor = "[I")
	public int[] anIntArray550;

	@OriginalMember(owner = "client!rj", name = "F", descriptor = "Lclient!naa;")
	public Class222 aClass222_1;

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
	public int anInt8682 = 2;

	@OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
	public int anInt8684 = -1;

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
	public int anInt8681 = -1;

	@OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
	public int anInt8688 = 5;

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "Z")
	public boolean aBoolean737 = false;

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "Z")
	public boolean aBoolean736 = false;

	@OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
	public int anInt8693 = -1;

	@OriginalMember(owner = "client!rj", name = "r", descriptor = "Z")
	public boolean aBoolean738 = false;

	@OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
	public int anInt8694 = 99;

	@OriginalMember(owner = "client!rj", name = "C", descriptor = "Z")
	public boolean aBoolean739 = false;

	@OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
	public int anInt8695 = -1;

	@OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
	public int anInt8691 = -1;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!tn;IB)V")
	private void method7169(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8;
		@Pc(14) int local14;
		@Pc(37) int local37;
		@Pc(52) int local52;
		if (arg1 == 1) {
			local8 = arg0.method8414();
			this.anIntArray548 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray548[local14] = arg0.method8414();
			}
			this.anIntArray550 = new int[local8];
			for (local37 = 0; local37 < local8; local37++) {
				this.anIntArray550[local37] = arg0.method8414();
			}
			for (local52 = 0; local52 < local8; local52++) {
				this.anIntArray550[local52] = (arg0.method8414() << 16) + this.anIntArray550[local52];
			}
		} else if (arg1 == 2) {
			this.anInt8684 = arg0.method8414();
		} else if (arg1 == 3) {
			this.aBooleanArray22 = new boolean[256];
			local8 = arg0.method8401();
			for (local14 = 0; local14 < local8; local14++) {
				this.aBooleanArray22[arg0.method8401()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt8688 = arg0.method8401();
		} else if (arg1 == 6) {
			this.anInt8681 = arg0.method8414();
		} else if (arg1 == 7) {
			this.anInt8695 = arg0.method8414();
		} else if (arg1 == 8) {
			this.anInt8694 = arg0.method8401();
		} else if (arg1 == 9) {
			this.anInt8691 = arg0.method8401();
		} else if (arg1 == 10) {
			this.anInt8693 = arg0.method8401();
		} else if (arg1 == 11) {
			this.anInt8682 = arg0.method8401();
		} else if (arg1 == 12) {
			local8 = arg0.method8401();
			this.anIntArray543 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray543[local14] = arg0.method8414();
			}
			for (local37 = 0; local37 < local8; local37++) {
				this.anIntArray543[local37] = (arg0.method8414() << 16) + this.anIntArray543[local37];
			}
		} else if (arg1 == 13) {
			local8 = arg0.method8414();
			this.anIntArrayArray87 = new int[local8][];
			for (local14 = 0; local14 < local8; local14++) {
				local37 = arg0.method8401();
				if (local37 > 0) {
					this.anIntArrayArray87[local14] = new int[local37];
					this.anIntArrayArray87[local14][0] = arg0.method8421();
					for (local52 = 1; local52 < local37; local52++) {
						this.anIntArrayArray87[local14][local52] = arg0.method8414();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean739 = true;
		} else if (arg1 == 15) {
			this.aBoolean737 = true;
		} else if (arg1 == 16) {
			this.aBoolean738 = true;
		} else if (arg1 == 18) {
			this.aBoolean736 = true;
		} else if (arg1 == 19) {
			if (this.anIntArray545 == null) {
				this.anIntArray545 = new int[this.anIntArrayArray87.length];
				for (local8 = 0; local8 < this.anIntArrayArray87.length; local8++) {
					this.anIntArray545[local8] = 255;
				}
			}
			this.anIntArray545[arg0.method8401()] = arg0.method8401();
		} else if (arg1 == 20) {
			if (this.anIntArray544 == null || this.anIntArray549 == null) {
				this.anIntArray544 = new int[this.anIntArrayArray87.length];
				this.anIntArray549 = new int[this.anIntArrayArray87.length];
				for (local8 = 0; local8 < this.anIntArrayArray87.length; local8++) {
					this.anIntArray544[local8] = 256;
					this.anIntArray549[local8] = 256;
				}
			}
			local8 = arg0.method8401();
			this.anIntArray544[local8] = arg0.method8414();
			this.anIntArray549[local8] = arg0.method8414();
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!ka;IIII)Lclient!ka;")
	public Class128 method7171(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) int local8 = this.anIntArray548[arg0];
		@Pc(13) int local13 = this.anIntArray550[arg0];
		@Pc(21) Class3_Sub1_Sub12 local21 = this.aClass222_1.method5861(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg1.method6279((byte) 1, arg4, true);
		}
		@Pc(35) Class3_Sub1_Sub12 local35 = null;
		if ((this.aBoolean737 || Static433.aBoolean671) && arg3 != -1 && arg3 < this.anIntArray550.length) {
			@Pc(57) int local57 = this.anIntArray550[arg3];
			local35 = this.aClass222_1.method5861(local57 >> 16);
			arg3 = local57 & 0xFFFF;
		}
		@Pc(71) Class3_Sub1_Sub12 local71 = null;
		@Pc(73) Class3_Sub1_Sub12 local73 = null;
		@Pc(75) int local75 = 0;
		@Pc(77) int local77 = 0;
		if (this.anIntArray543 != null) {
			if (arg0 < this.anIntArray543.length) {
				local75 = this.anIntArray543[arg0];
				if (local75 != 65535) {
					local71 = this.aClass222_1.method5861(local75 >> 16);
					local75 &= 0xFFFF;
				}
			}
			if ((this.aBoolean737 || Static433.aBoolean671) && arg3 != -1 && arg3 < this.anIntArray543.length) {
				local77 = this.anIntArray543[arg3];
				if (local77 != 65535) {
					local73 = this.aClass222_1.method5861(local77 >> 16);
					local77 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean739) {
			arg4 |= 0x200;
		}
		if (local21.method5015(local25)) {
			arg4 |= 0x80;
		}
		if (local21.method5017(local25)) {
			arg4 |= 0x100;
		}
		if (local21.method5016(local25)) {
			arg4 |= 0x400;
		}
		if (local71 != null) {
			if (local71.method5015(local75)) {
				arg4 |= 0x80;
			}
			if (local71.method5017(local75)) {
				arg4 |= 0x100;
			}
			if (local71.method5016(local75)) {
				arg4 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method5015(arg3)) {
				arg4 |= 0x80;
			}
			if (local35.method5017(arg3)) {
				arg4 |= 0x100;
			}
			if (local35.method5016(arg3)) {
				arg4 |= 0x400;
			}
		}
		if (local73 != null) {
			if (local73.method5015(local77)) {
				arg4 |= 0x80;
			}
			if (local73.method5017(local77)) {
				arg4 |= 0x100;
			}
			if (local73.method5016(local77)) {
				arg4 |= 0x400;
			}
		}
		arg4 |= 0x20;
		@Pc(277) Class128 local277 = arg1.method6279((byte) 1, arg4, true);
		local277.method6284(0, local8, local35, this.aBoolean739, local25, arg3, local21, arg2 - 1);
		if (local71 != null) {
			local277.method6284(0, local8, local73, this.aBoolean739, local75, local77, local71, arg2 - 1);
		}
		return local277;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIILclient!ka;IIB)Lclient!ka;")
	public Class128 method7172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class128 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte arg6) {
		@Pc(8) int local8 = this.anIntArray548[arg4];
		@Pc(13) int local13 = this.anIntArray550[arg4];
		@Pc(21) Class3_Sub1_Sub12 local21 = this.aClass222_1.method5861(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg3.method6279(arg6, arg2, true);
		}
		@Pc(40) Class3_Sub1_Sub12 local40 = null;
		if ((this.aBoolean737 || Static433.aBoolean671) && arg0 != -1 && this.anIntArray550.length > arg0) {
			@Pc(63) int local63 = this.anIntArray550[arg0];
			local40 = this.aClass222_1.method5861(local63 >> 16);
			arg0 = local63 & 0xFFFF;
		}
		if (this.aBoolean739) {
			arg2 |= 0x200;
		}
		if (local21.method5015(local25)) {
			arg2 |= 0x80;
		}
		if (local21.method5017(local25)) {
			arg2 |= 0x100;
		}
		if (local21.method5016(local25)) {
			arg2 |= 0x400;
		}
		if (local40 != null) {
			if (local40.method5015(arg0)) {
				arg2 |= 0x80;
			}
			if (local40.method5017(arg0)) {
				arg2 |= 0x100;
			}
			if (local40.method5016(arg0)) {
				arg2 |= 0x400;
			}
		}
		arg2 |= 0x20;
		@Pc(148) Class128 local148 = arg3.method6279(arg6, arg2, true);
		local148.method6284(arg1, local8, local40, this.aBoolean739, local25, arg0, local21, arg5 - 1);
		return local148;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!tn;B)V")
	public void method7173(@OriginalArg(0) Class3_Sub15 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method8401();
			if (local17 == 0) {
				return;
			}
			this.method7169(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIZ)I")
	public int method7174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) int local5 = 0;
		@Pc(14) int local14 = 0;
		@Pc(19) int local19 = this.anIntArray550[arg0];
		@Pc(21) Class3_Sub1_Sub12 local21 = null;
		@Pc(29) Class3_Sub1_Sub12 local29 = this.aClass222_1.method5861(local19 >> 16);
		@Pc(33) int local33 = local19 & 0xFFFF;
		if (local29 == null) {
			return 0;
		}
		if ((this.aBoolean737 || Static433.aBoolean671) && arg1 != -1 && arg1 < this.anIntArray550.length) {
			local14 = this.anIntArray550[arg1];
			local21 = this.aClass222_1.method5861(local14 >> 16);
			local14 &= 0xFFFF;
		}
		if (this.aBoolean739) {
			local5 = 512;
		}
		if (local29.method5015(local33)) {
			local5 |= 0x80;
		}
		if (local29.method5017(local33)) {
			local5 |= 0x100;
		}
		if (local29.method5016(local33)) {
			local5 |= 0x400;
		}
		if (local21 != null) {
			if (local21.method5015(local14)) {
				local5 |= 0x80;
			}
			if (local21.method5017(local14)) {
				local5 |= 0x100;
			}
			if (local21.method5016(local14)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray543 != null && arg2) {
			@Pc(150) int local150;
			@Pc(163) Class3_Sub1_Sub12 local163;
			if (this.anIntArray543.length > arg0) {
				local150 = this.anIntArray543[arg0];
				if (local150 != 65535) {
					local163 = this.aClass222_1.method5861(local150 >> 16);
					local150 &= 0xFFFF;
					if (local163 != null) {
						if (local163.method5015(local150)) {
							local5 |= 0x80;
						}
						if (local163.method5017(local150)) {
							local5 |= 0x100;
						}
						if (local163.method5016(local150)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean737 || Static433.aBoolean671) && arg1 != -1 && arg1 < this.anIntArray543.length) {
				local150 = this.anIntArray543[arg1];
				if (local150 != 65535) {
					local163 = this.aClass222_1.method5861(local150 >> 16);
					local150 &= 0xFFFF;
					if (local163 != null) {
						if (local163.method5015(local150)) {
							local5 |= 0x80;
						}
						if (local163.method5017(local150)) {
							local5 |= 0x100;
						}
						if (local163.method5016(local150)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V")
	public void method7175() {
		if (this.anInt8691 == -1) {
			if (this.aBooleanArray22 == null) {
				this.anInt8691 = 0;
			} else {
				this.anInt8691 = 2;
			}
		}
		if (this.anInt8693 != -1) {
			return;
		}
		if (this.aBooleanArray22 == null) {
			this.anInt8693 = 0;
		} else {
			this.anInt8693 = 2;
		}
	}
}
