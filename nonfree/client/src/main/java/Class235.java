import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class235 {

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "[Z")
	public boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "[[I")
	public int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
	public int anInt6847;

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "Lclient!tl;")
	public Class239 aClass239_2;

	@OriginalMember(owner = "client!sq", name = "v", descriptor = "[I")
	private int[] anIntArray631;

	@OriginalMember(owner = "client!sq", name = "w", descriptor = "[I")
	public int[] anIntArray632;

	@OriginalMember(owner = "client!sq", name = "y", descriptor = "[I")
	public int[] anIntArray633;

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
	public int anInt6849 = 0;

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "Z")
	public boolean aBoolean432 = false;

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "Z")
	public boolean aBoolean430 = false;

	@OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
	public int anInt6856 = 5;

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
	public int anInt6853 = -1;

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
	public int anInt6852 = 2;

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "Z")
	public boolean aBoolean431 = false;

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "I")
	public int anInt6850 = -1;

	@OriginalMember(owner = "client!sq", name = "x", descriptor = "I")
	public int anInt6858 = -1;

	@OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
	public int anInt6857 = -1;

	@OriginalMember(owner = "client!sq", name = "z", descriptor = "I")
	public int anInt6859 = 99;

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
	public int anInt6851 = -1;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZII)I")
	public int method5209(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray633[arg2];
		@Pc(14) Class1_Sub1_Sub8 local14 = null;
		@Pc(22) Class1_Sub1_Sub8 local22 = this.aClass239_2.method5423(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean431 || Static261.aBoolean314) && arg1 != -1 && arg1 < this.anIntArray633.length) {
			local7 = this.anIntArray633[arg1];
			local14 = this.aClass239_2.method5423(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean432) {
			local5 = 512;
		}
		if (local22.method1440(local26)) {
			local5 |= 0x80;
		}
		if (local22.method1446(local26)) {
			local5 |= 0x100;
		}
		if (local22.method1448(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method1440(local7)) {
				local5 |= 0x80;
			}
			if (local14.method1446(local7)) {
				local5 |= 0x100;
			}
			if (local14.method1448(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray631 != null && arg0) {
			@Pc(152) int local152;
			@Pc(165) Class1_Sub1_Sub8 local165;
			if (this.anIntArray631.length > arg2) {
				local152 = this.anIntArray631[arg2];
				if (local152 != 65535) {
					local165 = this.aClass239_2.method5423(local152 >> 16);
					local152 &= 0xFFFF;
					if (local165 != null) {
						if (local165.method1440(local152)) {
							local5 |= 0x80;
						}
						if (local165.method1446(local152)) {
							local5 |= 0x100;
						}
						if (local165.method1448(local152)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean431 || Static261.aBoolean314) && arg1 != -1 && arg1 < this.anIntArray631.length) {
				local152 = this.anIntArray631[arg1];
				if (local152 != 65535) {
					local165 = this.aClass239_2.method5423(local152 >> 16);
					local152 &= 0xFFFF;
					if (local165 != null) {
						if (local165.method1440(local152)) {
							local5 |= 0x80;
						}
						if (local165.method1446(local152)) {
							local5 |= 0x100;
						}
						if (local165.method1448(local152)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILclient!ia;)V")
	public void method5210(@OriginalArg(1) Class1_Sub3 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method1171();
			if (local11 == 0) {
				return;
			}
			this.method5213(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
	public void method5211() {
		if (this.anInt6850 == -1) {
			if (this.aBooleanArray22 == null) {
				this.anInt6850 = 0;
			} else {
				this.anInt6850 = 2;
			}
		}
		if (this.anInt6851 != -1) {
			return;
		}
		if (this.aBooleanArray22 == null) {
			this.anInt6851 = 0;
		} else {
			this.anInt6851 = 2;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!ia;II)V")
	private void method5213(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12;
		@Pc(18) int local18;
		@Pc(40) int local40;
		@Pc(54) int local54;
		if (arg1 == 1) {
			local12 = arg0.method1177();
			this.anIntArray632 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray632[local18] = arg0.method1177();
			}
			this.anIntArray633 = new int[local12];
			for (local40 = 0; local40 < local12; local40++) {
				this.anIntArray633[local40] = arg0.method1177();
			}
			for (local54 = 0; local54 < local12; local54++) {
				this.anIntArray633[local54] = (arg0.method1177() << 16) + this.anIntArray633[local54];
			}
		} else if (arg1 == 2) {
			this.anInt6857 = arg0.method1177();
		} else if (arg1 == 3) {
			this.aBooleanArray22 = new boolean[256];
			local12 = arg0.method1171();
			for (local18 = 0; local18 < local12; local18++) {
				this.aBooleanArray22[arg0.method1171()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt6856 = arg0.method1171();
		} else if (arg1 == 6) {
			this.anInt6853 = arg0.method1177();
		} else if (arg1 == 7) {
			this.anInt6858 = arg0.method1177();
		} else if (arg1 == 8) {
			this.anInt6859 = arg0.method1171();
		} else if (arg1 == 9) {
			this.anInt6851 = arg0.method1171();
		} else if (arg1 == 10) {
			this.anInt6850 = arg0.method1171();
		} else if (arg1 == 11) {
			this.anInt6852 = arg0.method1171();
		} else if (arg1 == 12) {
			local12 = arg0.method1171();
			this.anIntArray631 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray631[local18] = arg0.method1177();
			}
			for (local40 = 0; local40 < local12; local40++) {
				this.anIntArray631[local40] = (arg0.method1177() << 16) + this.anIntArray631[local40];
			}
		} else if (arg1 == 13) {
			local12 = arg0.method1177();
			this.anIntArrayArray56 = new int[local12][];
			for (local18 = 0; local18 < local12; local18++) {
				local40 = arg0.method1171();
				if (local40 > 0) {
					this.anIntArrayArray56[local18] = new int[local40];
					this.anIntArrayArray56[local18][0] = arg0.method1226();
					for (local54 = 1; local54 < local40; local54++) {
						this.anIntArrayArray56[local18][local54] = arg0.method1177();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean432 = true;
		} else if (arg1 == 15) {
			this.aBoolean431 = true;
		} else if (arg1 == 16) {
			this.aBoolean430 = true;
		} else if (arg1 == 17) {
			this.anInt6849 = arg0.method1171();
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!e;IIIIBBI)Lclient!e;")
	public Class17 method5214(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) int arg6) {
		@Pc(20) int local20 = this.anIntArray632[arg2];
		@Pc(25) int local25 = this.anIntArray633[arg2];
		@Pc(33) Class1_Sub1_Sub8 local33 = this.aClass239_2.method5423(local25 >> 16);
		@Pc(37) int local37 = local25 & 0xFFFF;
		if (local33 == null) {
			return arg0.method6202(arg5, arg6, true);
		}
		@Pc(47) Class1_Sub1_Sub8 local47 = null;
		if ((this.aBoolean431 || Static261.aBoolean314) && arg1 != -1 && arg1 < this.anIntArray633.length) {
			@Pc(69) int local69 = this.anIntArray633[arg1];
			local47 = this.aClass239_2.method5423(local69 >> 16);
			arg1 = local69 & 0xFFFF;
		}
		if (this.aBoolean432) {
			arg6 |= 0x200;
		}
		if (local33.method1440(local37)) {
			arg6 |= 0x80;
		}
		if (local33.method1446(local37)) {
			arg6 |= 0x100;
		}
		if (local33.method1448(local37)) {
			arg6 |= 0x400;
		}
		if (local47 != null) {
			if (local47.method1440(arg1)) {
				arg6 |= 0x80;
			}
			if (local47.method1446(arg1)) {
				arg6 |= 0x100;
			}
			if (local47.method1448(arg1)) {
				arg6 |= 0x400;
			}
		}
		arg6 |= 0x20;
		@Pc(156) Class17 local156 = arg0.method6202(arg5, arg6, true);
		local156.method6194(local33, local20, local37, arg1, this.aBoolean432, local47, arg3, arg4 - 1);
		return local156;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILclient!e;III)Lclient!e;")
	public Class17 method5215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) int local8 = this.anIntArray632[arg3];
		@Pc(13) int local13 = this.anIntArray633[arg3];
		@Pc(21) Class1_Sub1_Sub8 local21 = this.aClass239_2.method5423(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg2.method6202((byte) 1, arg4, true);
		}
		@Pc(35) Class1_Sub1_Sub8 local35 = null;
		if ((this.aBoolean431 || Static261.aBoolean314) && arg0 != -1 && this.anIntArray633.length > arg0) {
			@Pc(58) int local58 = this.anIntArray633[arg0];
			local35 = this.aClass239_2.method5423(local58 >> 16);
			arg0 = local58 & 0xFFFF;
		}
		@Pc(72) Class1_Sub1_Sub8 local72 = null;
		@Pc(74) Class1_Sub1_Sub8 local74 = null;
		@Pc(76) int local76 = 0;
		@Pc(78) int local78 = 0;
		if (this.anIntArray631 != null) {
			if (this.anIntArray631.length > arg3) {
				local76 = this.anIntArray631[arg3];
				if (local76 != 65535) {
					local72 = this.aClass239_2.method5423(local76 >> 16);
					local76 &= 0xFFFF;
				}
			}
			if ((this.aBoolean431 || Static261.aBoolean314) && arg0 != -1 && arg0 < this.anIntArray631.length) {
				local78 = this.anIntArray631[arg0];
				if (local78 != 65535) {
					local74 = this.aClass239_2.method5423(local78 >> 16);
					local78 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean432) {
			arg4 |= 0x200;
		}
		if (local21.method1440(local25)) {
			arg4 |= 0x80;
		}
		if (local21.method1446(local25)) {
			arg4 |= 0x100;
		}
		if (local21.method1448(local25)) {
			arg4 |= 0x400;
		}
		if (local72 != null) {
			if (local72.method1440(local76)) {
				arg4 |= 0x80;
			}
			if (local72.method1446(local76)) {
				arg4 |= 0x100;
			}
			if (local72.method1448(local76)) {
				arg4 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method1440(arg0)) {
				arg4 |= 0x80;
			}
			if (local35.method1446(arg0)) {
				arg4 |= 0x100;
			}
			if (local35.method1448(arg0)) {
				arg4 |= 0x400;
			}
		}
		if (local74 != null) {
			if (local74.method1440(local78)) {
				arg4 |= 0x80;
			}
			if (local74.method1446(local78)) {
				arg4 |= 0x100;
			}
			if (local74.method1448(local78)) {
				arg4 |= 0x400;
			}
		}
		arg4 |= 0x20;
		@Pc(294) Class17 local294 = arg2.method6202((byte) 1, arg4, true);
		local294.method6194(local21, local8, local25, arg0, this.aBoolean432, local35, 0, arg1 - 1);
		if (local72 != null) {
			local294.method6194(local72, local8, local76, local78, this.aBoolean432, local74, 0, arg1 - 1);
		}
		return local294;
	}
}
