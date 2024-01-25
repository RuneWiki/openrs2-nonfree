import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class128 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "[I")
	public int[] anIntArray252;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "[[I")
	public int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
	public int anInt3967;

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "Lclient!nt;")
	public Class170 aClass170_4;

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "[Z")
	public boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!kf", name = "z", descriptor = "[I")
	public int[] anIntArray254;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
	public int anInt3968 = 99;

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
	public int anInt3975 = -1;

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
	public int anInt3977 = 5;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "Z")
	public boolean aBoolean341 = false;

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "Z")
	public boolean aBoolean344 = false;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
	public int anInt3973 = 2;

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "Z")
	public boolean aBoolean343 = false;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
	public int anInt3971 = -1;

	@OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
	public int anInt3980 = -1;

	@OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
	public int anInt3981 = -1;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "Z")
	public boolean aBoolean342 = false;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
	public int anInt3970 = -1;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BZII)I")
	public int method3181(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray252[arg1];
		@Pc(14) Class3_Sub4_Sub16 local14 = null;
		@Pc(22) Class3_Sub4_Sub16 local22 = this.aClass170_4.method3928(local12 >> 16);
		@Pc(31) int local31 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean342 || Static262.aBoolean439) && arg2 != -1 && arg2 < this.anIntArray252.length) {
			local7 = this.anIntArray252[arg2];
			local14 = this.aClass170_4.method3928(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean343) {
			local5 = 512;
		}
		if (local22.method5870(local31)) {
			local5 |= 0x80;
		}
		if (local22.method5872(local31)) {
			local5 |= 0x100;
		}
		if (local22.method5868(local31)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method5870(local7)) {
				local5 |= 0x80;
			}
			if (local14.method5872(local7)) {
				local5 |= 0x100;
			}
			if (local14.method5868(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray253 != null && arg0) {
			@Pc(152) int local152;
			@Pc(165) Class3_Sub4_Sub16 local165;
			if (arg1 < this.anIntArray253.length) {
				local152 = this.anIntArray253[arg1];
				if (local152 != 65535) {
					local165 = this.aClass170_4.method3928(local152 >> 16);
					local152 &= 0xFFFF;
					if (local165 != null) {
						if (local165.method5870(local152)) {
							local5 |= 0x80;
						}
						if (local165.method5872(local152)) {
							local5 |= 0x100;
						}
						if (local165.method5868(local152)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean342 || Static262.aBoolean439) && arg2 != -1 && this.anIntArray253.length > arg2) {
				local152 = this.anIntArray253[arg2];
				if (local152 != 65535) {
					local165 = this.aClass170_4.method3928(local152 >> 16);
					local152 &= 0xFFFF;
					if (local165 != null) {
						if (local165.method5870(local152)) {
							local5 |= 0x80;
						}
						if (local165.method5872(local152)) {
							local5 |= 0x100;
						}
						if (local165.method5868(local152)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
	public void method3182() {
		if (this.anInt3980 == -1) {
			if (this.aBooleanArray14 == null) {
				this.anInt3980 = 0;
			} else {
				this.anInt3980 = 2;
			}
		}
		if (this.anInt3975 != -1) {
			return;
		}
		if (this.aBooleanArray14 == null) {
			this.anInt3975 = 0;
		} else {
			this.anInt3975 = 2;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIILclient!c;IIIB)Lclient!c;")
	public Class9 method3183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class9 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte arg6) {
		@Pc(8) int local8 = this.anIntArray254[arg0];
		@Pc(13) int local13 = this.anIntArray252[arg0];
		@Pc(21) Class3_Sub4_Sub16 local21 = this.aClass170_4.method3928(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg3.method5699(arg6, arg5, true);
		}
		@Pc(35) Class3_Sub4_Sub16 local35 = null;
		if ((this.aBoolean342 || Static262.aBoolean439) && arg1 != -1 && this.anIntArray252.length > arg1) {
			@Pc(53) int local53 = this.anIntArray252[arg1];
			local35 = this.aClass170_4.method3928(local53 >> 16);
			arg1 = local53 & 0xFFFF;
		}
		if (this.aBoolean343) {
			arg5 |= 0x200;
		}
		if (local21.method5870(local25)) {
			arg5 |= 0x80;
		}
		if (local21.method5872(local25)) {
			arg5 |= 0x100;
		}
		if (local21.method5868(local25)) {
			arg5 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method5870(arg1)) {
				arg5 |= 0x80;
			}
			if (local35.method5872(arg1)) {
				arg5 |= 0x100;
			}
			if (local35.method5868(arg1)) {
				arg5 |= 0x400;
			}
		}
		arg5 |= 0x20;
		@Pc(142) Class9 local142 = arg3.method5699(arg6, arg5, true);
		local142.method5691(local21, this.aBoolean343, local35, local8, local25, arg4 - 1, arg2, arg1);
		return local142;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLclient!cu;I)V")
	private void method3185(@OriginalArg(1) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		@Pc(110) int local110;
		@Pc(116) int local116;
		@Pc(121) int local121;
		@Pc(143) int local143;
		if (arg1 == 1) {
			local110 = arg0.method2588();
			this.anIntArray254 = new int[local110];
			for (local116 = 0; local116 < local110; local116++) {
				this.anIntArray254[local116] = arg0.method2588();
			}
			this.anIntArray252 = new int[local110];
			for (local121 = 0; local121 < local110; local121++) {
				this.anIntArray252[local121] = arg0.method2588();
			}
			for (local143 = 0; local143 < local110; local143++) {
				this.anIntArray252[local143] = (arg0.method2588() << 16) + this.anIntArray252[local143];
			}
		} else if (arg1 == 2) {
			this.anInt3970 = arg0.method2588();
		} else if (arg1 == 3) {
			this.aBooleanArray14 = new boolean[256];
			local110 = arg0.method2582();
			for (local116 = 0; local116 < local110; local116++) {
				this.aBooleanArray14[arg0.method2582()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean344 = true;
		} else if (arg1 == 5) {
			this.anInt3977 = arg0.method2582();
		} else if (arg1 == 6) {
			this.anInt3971 = arg0.method2588();
		} else if (arg1 == 7) {
			this.anInt3981 = arg0.method2588();
		} else if (arg1 == 8) {
			this.anInt3968 = arg0.method2582();
		} else if (arg1 == 9) {
			this.anInt3980 = arg0.method2582();
		} else if (arg1 == 10) {
			this.anInt3975 = arg0.method2582();
		} else if (arg1 == 11) {
			this.anInt3973 = arg0.method2582();
		} else if (arg1 == 12) {
			local110 = arg0.method2582();
			this.anIntArray253 = new int[local110];
			for (local116 = 0; local116 < local110; local116++) {
				this.anIntArray253[local116] = arg0.method2588();
			}
			for (local121 = 0; local121 < local110; local121++) {
				this.anIntArray253[local121] += arg0.method2588() << 16;
			}
		} else if (arg1 == 13) {
			local110 = arg0.method2588();
			this.anIntArrayArray26 = new int[local110][];
			for (local116 = 0; local116 < local110; local116++) {
				local121 = arg0.method2582();
				if (local121 > 0) {
					this.anIntArrayArray26[local116] = new int[local121];
					this.anIntArrayArray26[local116][0] = arg0.method2604();
					for (local143 = 1; local143 < local121; local143++) {
						this.anIntArrayArray26[local116][local143] = arg0.method2588();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean343 = true;
		} else if (arg1 == 15) {
			this.aBoolean342 = true;
		} else if (arg1 == 16) {
			this.aBoolean341 = true;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIILclient!c;I)Lclient!c;")
	public Class9 method3188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class9 arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray254[arg1];
		@Pc(13) int local13 = this.anIntArray252[arg1];
		@Pc(21) Class3_Sub4_Sub16 local21 = this.aClass170_4.method3928(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg3.method5699((byte) 1, arg0, true);
		}
		@Pc(41) Class3_Sub4_Sub16 local41 = null;
		if ((this.aBoolean342 || Static262.aBoolean439) && arg4 != -1 && this.anIntArray252.length > arg4) {
			@Pc(59) int local59 = this.anIntArray252[arg4];
			local41 = this.aClass170_4.method3928(local59 >> 16);
			arg4 = local59 & 0xFFFF;
		}
		@Pc(73) Class3_Sub4_Sub16 local73 = null;
		@Pc(75) Class3_Sub4_Sub16 local75 = null;
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		if (this.anIntArray253 != null) {
			if (arg1 < this.anIntArray253.length) {
				local77 = this.anIntArray253[arg1];
				if (local77 != 65535) {
					local73 = this.aClass170_4.method3928(local77 >> 16);
					local77 &= 0xFFFF;
				}
			}
			if ((this.aBoolean342 || Static262.aBoolean439) && arg4 != -1 && arg4 < this.anIntArray253.length) {
				local79 = this.anIntArray253[arg4];
				if (local79 != 65535) {
					local75 = this.aClass170_4.method3928(local79 >> 16);
					local79 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean343) {
			arg0 |= 0x200;
		}
		if (local21.method5870(local25)) {
			arg0 |= 0x80;
		}
		if (local21.method5872(local25)) {
			arg0 |= 0x100;
		}
		if (local21.method5868(local25)) {
			arg0 |= 0x400;
		}
		if (local73 != null) {
			if (local73.method5870(local77)) {
				arg0 |= 0x80;
			}
			if (local73.method5872(local77)) {
				arg0 |= 0x100;
			}
			if (local73.method5868(local77)) {
				arg0 |= 0x400;
			}
		}
		if (local41 != null) {
			if (local41.method5870(arg4)) {
				arg0 |= 0x80;
			}
			if (local41.method5872(arg4)) {
				arg0 |= 0x100;
			}
			if (local41.method5868(arg4)) {
				arg0 |= 0x400;
			}
		}
		if (local75 != null) {
			if (local75.method5870(local79)) {
				arg0 |= 0x80;
			}
			if (local75.method5872(local79)) {
				arg0 |= 0x100;
			}
			if (local75.method5868(local79)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(283) Class9 local283 = arg3.method5699((byte) 1, arg0, true);
		local283.method5691(local21, this.aBoolean343, local41, local8, local25, arg2 - 1, 0, arg4);
		if (local73 != null) {
			local283.method5691(local73, this.aBoolean343, local75, local8, local77, arg2 - 1, 0, local79);
		}
		return local283;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!cu;I)V")
	public void method3189(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2582();
			if (local3 == 0) {
				return;
			}
			this.method3185(arg0, local3);
		}
	}
}
