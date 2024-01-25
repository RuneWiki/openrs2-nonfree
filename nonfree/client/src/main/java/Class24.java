import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class24 {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
	public int anInt1041;

	@OriginalMember(owner = "client!bo", name = "s", descriptor = "[I")
	public int[] anIntArray89;

	@OriginalMember(owner = "client!bo", name = "t", descriptor = "[[I")
	public int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!bo", name = "w", descriptor = "[I")
	public int[] anIntArray90;

	@OriginalMember(owner = "client!bo", name = "z", descriptor = "[Z")
	public boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
	public int anInt1034 = -1;

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "Z")
	public boolean aBoolean98 = false;

	@OriginalMember(owner = "client!bo", name = "o", descriptor = "I")
	public int anInt1045 = -1;

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
	public int anInt1038 = 99;

	@OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
	public int anInt1046 = -1;

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "Z")
	public boolean aBoolean97 = false;

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
	public int anInt1037 = 2;

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
	public int anInt1035 = -1;

	@OriginalMember(owner = "client!bo", name = "u", descriptor = "Z")
	public boolean aBoolean100 = false;

	@OriginalMember(owner = "client!bo", name = "x", descriptor = "I")
	public int anInt1048 = -1;

	@OriginalMember(owner = "client!bo", name = "r", descriptor = "Z")
	public boolean aBoolean99 = false;

	@OriginalMember(owner = "client!bo", name = "C", descriptor = "I")
	public int anInt1051 = 5;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	public void method761() {
		if (this.anInt1035 == -1) {
			if (this.aBooleanArray4 == null) {
				this.anInt1035 = 0;
			} else {
				this.anInt1035 = 2;
			}
		}
		if (this.anInt1046 != -1) {
			return;
		}
		if (this.aBooleanArray4 == null) {
			this.anInt1046 = 0;
		} else {
			this.anInt1046 = 2;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLclient!bg;)V")
	public void method764(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4532();
			if (local9 == 0) {
				return;
			}
			this.method767(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIBIILclient!ge;)Lclient!ge;")
	public Class73 method766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class73 arg4) {
		@Pc(8) int local8 = this.anIntArray89[arg2];
		@Pc(13) int local13 = this.anIntArray90[arg2];
		@Pc(19) Class1_Sub4_Sub19 local19 = Static115.method2445(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg4.method3306((byte) 1, arg1, true);
		}
		@Pc(33) Class1_Sub4_Sub19 local33 = null;
		if ((this.aBoolean99 || Static159.aBoolean329) && arg3 != -1 && arg3 < this.anIntArray90.length) {
			@Pc(55) int local55 = this.anIntArray90[arg3];
			local33 = Static115.method2445(local55 >> 16);
			arg3 = local55 & 0xFFFF;
		}
		@Pc(67) Class1_Sub4_Sub19 local67 = null;
		@Pc(69) Class1_Sub4_Sub19 local69 = null;
		@Pc(71) int local71 = 0;
		@Pc(73) int local73 = 0;
		if (this.anIntArray88 != null) {
			if (this.anIntArray88.length > arg2) {
				local71 = this.anIntArray88[arg2];
				if (local71 != 65535) {
					local67 = Static115.method2445(local71 >> 16);
					local71 &= 0xFFFF;
				}
			}
			if ((this.aBoolean99 || Static159.aBoolean329) && arg3 != -1 && this.anIntArray88.length > arg3) {
				local73 = this.anIntArray88[arg3];
				if (local73 != 65535) {
					local69 = Static115.method2445(local73 >> 16);
					local73 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean98) {
			arg1 |= 0x200;
		}
		if (local19.method4587(local23)) {
			arg1 |= 0x80;
		}
		if (local19.method4593(local23)) {
			arg1 |= 0x100;
		}
		if (local67 != null) {
			if (local67.method4587(local71)) {
				arg1 |= 0x80;
			}
			if (local67.method4593(local71)) {
				arg1 |= 0x100;
			}
		}
		if (local33 != null) {
			if (local33.method4587(arg3)) {
				arg1 |= 0x80;
			}
			if (local33.method4593(arg3)) {
				arg1 |= 0x100;
			}
		}
		if (local69 != null) {
			if (local69.method4587(local73)) {
				arg1 |= 0x80;
			}
			if (local69.method4593(local73)) {
				arg1 |= 0x100;
			}
		}
		arg1 |= 0x20;
		@Pc(238) Class73 local238 = arg4.method3306((byte) 1, arg1, true);
		local238.method3309(local8, this.aBoolean98, local19, 0, local33, arg3, local23, arg0 - 1);
		if (local67 != null) {
			local238.method3309(local8, this.aBoolean98, local67, 0, local69, local73, local71, arg0 - 1);
		}
		return local238;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!bg;I)V")
	private void method767(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8 arg1) {
		@Pc(27) int local27;
		@Pc(29) int local29;
		@Pc(149) int local149;
		@Pc(240) int local240;
		if (arg0 == 1) {
			local27 = arg1.method4556();
			this.anIntArray89 = new int[local27];
			for (local29 = 0; local29 < local27; local29++) {
				this.anIntArray89[local29] = arg1.method4556();
			}
			this.anIntArray90 = new int[local27];
			for (local149 = 0; local149 < local27; local149++) {
				this.anIntArray90[local149] = arg1.method4556();
			}
			for (local240 = 0; local240 < local27; local240++) {
				this.anIntArray90[local240] += arg1.method4556() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt1034 = arg1.method4556();
		} else if (arg0 == 3) {
			this.aBooleanArray4 = new boolean[256];
			local27 = arg1.method4532();
			for (local29 = 0; local29 < local27; local29++) {
				this.aBooleanArray4[arg1.method4532()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean100 = true;
		} else if (arg0 == 5) {
			this.anInt1051 = arg1.method4532();
		} else if (arg0 == 6) {
			this.anInt1048 = arg1.method4556();
		} else if (arg0 == 7) {
			this.anInt1045 = arg1.method4556();
		} else if (arg0 == 8) {
			this.anInt1038 = arg1.method4532();
		} else if (arg0 == 9) {
			this.anInt1046 = arg1.method4532();
		} else if (arg0 == 10) {
			this.anInt1035 = arg1.method4532();
		} else if (arg0 == 11) {
			this.anInt1037 = arg1.method4532();
		} else if (arg0 == 12) {
			local27 = arg1.method4532();
			this.anIntArray88 = new int[local27];
			for (local29 = 0; local29 < local27; local29++) {
				this.anIntArray88[local29] = arg1.method4556();
			}
			for (local149 = 0; local149 < local27; local149++) {
				this.anIntArray88[local149] = (arg1.method4556() << 16) + this.anIntArray88[local149];
			}
		} else if (arg0 == 13) {
			local27 = arg1.method4556();
			this.anIntArrayArray8 = new int[local27][];
			for (local29 = 0; local29 < local27; local29++) {
				local149 = arg1.method4532();
				if (local149 > 0) {
					this.anIntArrayArray8[local29] = new int[local149];
					this.anIntArrayArray8[local29][0] = arg1.method4514();
					for (local240 = 1; local240 < local149; local240++) {
						this.anIntArrayArray8[local29][local240] = arg1.method4556();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean98 = true;
		} else if (arg0 == 15) {
			this.aBoolean99 = true;
		} else if (arg0 == 16) {
			this.aBoolean97 = true;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIBIIILclient!ge;I)Lclient!ge;")
	public Class73 method769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class73 arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray89[arg0];
		@Pc(13) int local13 = this.anIntArray90[arg0];
		@Pc(19) Class1_Sub4_Sub19 local19 = Static115.method2445(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg5.method3306(arg2, arg6, true);
		}
		@Pc(38) Class1_Sub4_Sub19 local38 = null;
		if ((this.aBoolean99 || Static159.aBoolean329) && arg4 != -1 && arg4 < this.anIntArray90.length) {
			@Pc(56) int local56 = this.anIntArray90[arg4];
			local38 = Static115.method2445(local56 >> 16);
			arg4 = local56 & 0xFFFF;
		}
		if (this.aBoolean98) {
			arg6 |= 0x200;
		}
		if (local19.method4587(local23)) {
			arg6 |= 0x80;
		}
		if (local19.method4593(local23)) {
			arg6 |= 0x100;
		}
		if (local38 != null) {
			if (local38.method4587(arg4)) {
				arg6 |= 0x80;
			}
			if (local38.method4593(arg4)) {
				arg6 |= 0x100;
			}
		}
		arg6 |= 0x20;
		@Pc(121) Class73 local121 = arg5.method3306(arg2, arg6, true);
		local121.method3309(local8, this.aBoolean98, local19, arg3, local38, arg4, local23, arg1 - 1);
		return local121;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IZIZ)I")
	public int method770(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray90[arg0];
		@Pc(14) Class1_Sub4_Sub19 local14 = null;
		@Pc(20) Class1_Sub4_Sub19 local20 = Static115.method2445(local12 >> 16);
		@Pc(24) int local24 = local12 & 0xFFFF;
		if (local20 == null) {
			return 0;
		}
		if ((this.aBoolean99 || Static159.aBoolean329) && arg2 != -1 && arg2 < this.anIntArray90.length) {
			local7 = this.anIntArray90[arg2];
			local14 = Static115.method2445(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean98) {
			local5 = 512;
		}
		if (local20.method4587(local24)) {
			local5 |= 0x80;
		}
		if (local20.method4593(local24)) {
			local5 |= 0x100;
		}
		if (local14 != null) {
			if (local14.method4587(local7)) {
				local5 |= 0x80;
			}
			if (local14.method4593(local7)) {
				local5 |= 0x100;
			}
		}
		if (this.anIntArray88 != null && arg1) {
			@Pc(120) int local120;
			@Pc(129) Class1_Sub4_Sub19 local129;
			if (arg0 < this.anIntArray88.length) {
				local120 = this.anIntArray88[arg0];
				if (local120 != 65535) {
					local129 = Static115.method2445(local120 >> 16);
					local120 &= 0xFFFF;
					if (local129 != null) {
						if (local129.method4587(local120)) {
							local5 |= 0x80;
						}
						if (local129.method4593(local120)) {
							local5 |= 0x100;
						}
					}
				}
			}
			if ((this.aBoolean99 || Static159.aBoolean329) && arg2 != -1 && this.anIntArray88.length > arg2) {
				local120 = this.anIntArray88[arg2];
				if (local120 != 65535) {
					local129 = Static115.method2445(local120 >> 16);
					local120 &= 0xFFFF;
					if (local129 != null) {
						if (local129.method4587(local120)) {
							local5 |= 0x80;
						}
						if (local129.method4593(local120)) {
							local5 |= 0x100;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}
}
