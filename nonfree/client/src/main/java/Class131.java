import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hca")
public final class Class131 {

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "[Z")
	public boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!hca", name = "d", descriptor = "[I")
	public int[] anIntArray202;

	@OriginalMember(owner = "client!hca", name = "j", descriptor = "I")
	public int anInt3737;

	@OriginalMember(owner = "client!hca", name = "k", descriptor = "Lclient!tfa;")
	public Class311 aClass311_1;

	@OriginalMember(owner = "client!hca", name = "w", descriptor = "[[I")
	public int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!hca", name = "x", descriptor = "[I")
	private int[] anIntArray203;

	@OriginalMember(owner = "client!hca", name = "C", descriptor = "[I")
	public int[] anIntArray204;

	@OriginalMember(owner = "client!hca", name = "g", descriptor = "I")
	public int anInt3735 = -1;

	@OriginalMember(owner = "client!hca", name = "h", descriptor = "Z")
	public boolean aBoolean304 = false;

	@OriginalMember(owner = "client!hca", name = "s", descriptor = "Z")
	public boolean aBoolean306 = false;

	@OriginalMember(owner = "client!hca", name = "f", descriptor = "I")
	public int anInt3734 = 5;

	@OriginalMember(owner = "client!hca", name = "l", descriptor = "Z")
	public boolean aBoolean305 = false;

	@OriginalMember(owner = "client!hca", name = "p", descriptor = "I")
	public int anInt3740 = -1;

	@OriginalMember(owner = "client!hca", name = "r", descriptor = "I")
	public int anInt3742 = 2;

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "I")
	public int anInt3732 = -1;

	@OriginalMember(owner = "client!hca", name = "t", descriptor = "I")
	public int anInt3743 = 99;

	@OriginalMember(owner = "client!hca", name = "y", descriptor = "Z")
	public boolean aBoolean307 = false;

	@OriginalMember(owner = "client!hca", name = "u", descriptor = "I")
	public int anInt3744 = -1;

	@OriginalMember(owner = "client!hca", name = "A", descriptor = "I")
	public int anInt3747 = -1;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!io;IZ)V")
	private void method3233(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		@Pc(43) int local43;
		@Pc(62) int local62;
		if (arg1 == 1) {
			local14 = arg0.method4426();
			this.anIntArray204 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray204[local20] = arg0.method4426();
			}
			this.anIntArray202 = new int[local14];
			for (local43 = 0; local43 < local14; local43++) {
				this.anIntArray202[local43] = arg0.method4426();
			}
			for (local62 = 0; local62 < local14; local62++) {
				this.anIntArray202[local62] = (arg0.method4426() << 16) + this.anIntArray202[local62];
			}
		} else if (arg1 == 2) {
			this.anInt3744 = arg0.method4426();
		} else if (arg1 == 3) {
			this.aBooleanArray9 = new boolean[256];
			local14 = arg0.method4393();
			for (local20 = 0; local20 < local14; local20++) {
				this.aBooleanArray9[arg0.method4393()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt3734 = arg0.method4393();
		} else if (arg1 == 6) {
			this.anInt3740 = arg0.method4426();
		} else if (arg1 == 7) {
			this.anInt3747 = arg0.method4426();
		} else if (arg1 == 8) {
			this.anInt3743 = arg0.method4393();
		} else if (arg1 == 9) {
			this.anInt3732 = arg0.method4393();
		} else if (arg1 == 10) {
			this.anInt3735 = arg0.method4393();
		} else if (arg1 == 11) {
			this.anInt3742 = arg0.method4393();
		} else if (arg1 == 12) {
			local14 = arg0.method4393();
			this.anIntArray203 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray203[local20] = arg0.method4426();
			}
			for (local43 = 0; local43 < local14; local43++) {
				this.anIntArray203[local43] += arg0.method4426() << 16;
			}
		} else if (arg1 == 13) {
			local14 = arg0.method4426();
			this.anIntArrayArray25 = new int[local14][];
			for (local20 = 0; local20 < local14; local20++) {
				local43 = arg0.method4393();
				if (local43 > 0) {
					this.anIntArrayArray25[local20] = new int[local43];
					this.anIntArrayArray25[local20][0] = arg0.method4396();
					for (local62 = 1; local62 < local43; local62++) {
						this.anIntArrayArray25[local20][local62] = arg0.method4426();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean307 = true;
		} else if (arg1 == 15) {
			this.aBoolean306 = true;
		} else if (arg1 == 16) {
			this.aBoolean304 = true;
		} else if (arg1 == 18) {
			this.aBoolean305 = true;
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z)V")
	public void method3234() {
		if (this.anInt3732 == -1) {
			if (this.aBooleanArray9 == null) {
				this.anInt3732 = 0;
			} else {
				this.anInt3732 = 2;
			}
		}
		if (this.anInt3735 != -1) {
			return;
		}
		if (this.aBooleanArray9 == null) {
			this.anInt3735 = 0;
		} else {
			this.anInt3735 = 2;
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIIIBLclient!da;ZI)Lclient!da;")
	public Class61 method3237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) Class61 arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray204[arg3];
		@Pc(13) int local13 = this.anIntArray202[arg3];
		@Pc(21) Class1_Sub3_Sub13 local21 = this.aClass311_1.method7006(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg5.method7591(arg4, arg0, true);
		}
		@Pc(35) Class1_Sub3_Sub13 local35 = null;
		if ((this.aBoolean306 || Static153.aBoolean202) && arg6 != -1 && arg6 < this.anIntArray202.length) {
			@Pc(54) int local54 = this.anIntArray202[arg6];
			local35 = this.aClass311_1.method7006(local54 >> 16);
			arg6 = local54 & 0xFFFF;
		}
		if (this.aBoolean307) {
			arg0 |= 0x200;
		}
		if (local21.method5310(local25)) {
			arg0 |= 0x80;
		}
		if (local21.method5313(local25)) {
			arg0 |= 0x100;
		}
		if (local21.method5311(local25)) {
			arg0 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method5310(arg6)) {
				arg0 |= 0x80;
			}
			if (local35.method5313(arg6)) {
				arg0 |= 0x100;
			}
			if (local35.method5311(arg6)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(143) Class61 local143 = arg5.method7591(arg4, arg0, true);
		local143.method7611(this.aBoolean307, arg1 - 1, local25, arg2, local35, local21, arg6, local8);
		return local143;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILclient!da;IIII)Lclient!da;")
	public Class61 method3238(@OriginalArg(0) int arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray204[arg2];
		@Pc(13) int local13 = this.anIntArray202[arg2];
		@Pc(23) Class1_Sub3_Sub13 local23 = this.aClass311_1.method7006(local13 >> 16);
		@Pc(27) int local27 = local13 & 0xFFFF;
		if (local23 == null) {
			return arg1.method7591((byte) 1, arg0, true);
		}
		@Pc(37) Class1_Sub3_Sub13 local37 = null;
		if ((this.aBoolean306 || Static153.aBoolean202) && arg4 != -1 && this.anIntArray202.length > arg4) {
			@Pc(59) int local59 = this.anIntArray202[arg4];
			local37 = this.aClass311_1.method7006(local59 >> 16);
			arg4 = local59 & 0xFFFF;
		}
		@Pc(79) Class1_Sub3_Sub13 local79 = null;
		@Pc(81) Class1_Sub3_Sub13 local81 = null;
		@Pc(83) int local83 = 0;
		@Pc(85) int local85 = 0;
		if (this.anIntArray203 != null) {
			if (arg2 < this.anIntArray203.length) {
				local83 = this.anIntArray203[arg2];
				if (local83 != 65535) {
					local79 = this.aClass311_1.method7006(local83 >> 16);
					local83 &= 0xFFFF;
				}
			}
			if ((this.aBoolean306 || Static153.aBoolean202) && arg4 != -1 && this.anIntArray203.length > arg4) {
				local85 = this.anIntArray203[arg4];
				if (local85 != 65535) {
					local81 = this.aClass311_1.method7006(local85 >> 16);
					local85 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean307) {
			arg0 |= 0x200;
		}
		if (local23.method5310(local27)) {
			arg0 |= 0x80;
		}
		if (local23.method5313(local27)) {
			arg0 |= 0x100;
		}
		if (local23.method5311(local27)) {
			arg0 |= 0x400;
		}
		if (local79 != null) {
			if (local79.method5310(local83)) {
				arg0 |= 0x80;
			}
			if (local79.method5313(local83)) {
				arg0 |= 0x100;
			}
			if (local79.method5311(local83)) {
				arg0 |= 0x400;
			}
		}
		if (local37 != null) {
			if (local37.method5310(arg4)) {
				arg0 |= 0x80;
			}
			if (local37.method5313(arg4)) {
				arg0 |= 0x100;
			}
			if (local37.method5311(arg4)) {
				arg0 |= 0x400;
			}
		}
		if (local81 != null) {
			if (local81.method5310(local85)) {
				arg0 |= 0x80;
			}
			if (local81.method5313(local85)) {
				arg0 |= 0x100;
			}
			if (local81.method5311(local85)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(287) Class61 local287 = arg1.method7591((byte) 1, arg0, true);
		local287.method7611(this.aBoolean307, arg3 - 1, local27, 0, local37, local23, arg4, local8);
		if (local79 != null) {
			local287.method7611(this.aBoolean307, arg3 - 1, local83, 0, local81, local79, local85, local8);
		}
		return local287;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILclient!io;)V")
	public void method3242(@OriginalArg(1) Class1_Sub20 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4393();
			if (local11 == 0) {
				return;
			}
			this.method3233(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IBZI)I")
	public int method3243(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray202[arg0];
		@Pc(14) Class1_Sub3_Sub13 local14 = null;
		@Pc(30) Class1_Sub3_Sub13 local30 = this.aClass311_1.method7006(local12 >> 16);
		@Pc(34) int local34 = local12 & 0xFFFF;
		if (local30 == null) {
			return 0;
		}
		if ((this.aBoolean306 || Static153.aBoolean202) && arg2 != -1 && arg2 < this.anIntArray202.length) {
			local7 = this.anIntArray202[arg2];
			local14 = this.aClass311_1.method7006(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean307) {
			local5 = 512;
		}
		if (local30.method5310(local34)) {
			local5 |= 0x80;
		}
		if (local30.method5313(local34)) {
			local5 |= 0x100;
		}
		if (local30.method5311(local34)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method5310(local7)) {
				local5 |= 0x80;
			}
			if (local14.method5313(local7)) {
				local5 |= 0x100;
			}
			if (local14.method5311(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray203 != null && arg1) {
			@Pc(150) int local150;
			@Pc(163) Class1_Sub3_Sub13 local163;
			if (arg0 < this.anIntArray203.length) {
				local150 = this.anIntArray203[arg0];
				if (local150 != 65535) {
					local163 = this.aClass311_1.method7006(local150 >> 16);
					local150 &= 0xFFFF;
					if (local163 != null) {
						if (local163.method5310(local150)) {
							local5 |= 0x80;
						}
						if (local163.method5313(local150)) {
							local5 |= 0x100;
						}
						if (local163.method5311(local150)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean306 || Static153.aBoolean202) && arg2 != -1 && arg2 < this.anIntArray203.length) {
				local150 = this.anIntArray203[arg2];
				if (local150 != 65535) {
					local163 = this.aClass311_1.method7006(local150 >> 16);
					local150 &= 0xFFFF;
					if (local163 != null) {
						if (local163.method5310(local150)) {
							local5 |= 0x80;
						}
						if (local163.method5313(local150)) {
							local5 |= 0x100;
						}
						if (local163.method5311(local150)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}
}
