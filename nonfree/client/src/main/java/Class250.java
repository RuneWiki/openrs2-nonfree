import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class250 {

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "[I")
	public int[] anIntArray592;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
	public int anInt7008;

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "[I")
	private int[] anIntArray593;

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "[Z")
	public boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!vf", name = "x", descriptor = "Lclient!an;")
	public Class12 aClass12_3;

	@OriginalMember(owner = "client!vf", name = "B", descriptor = "[I")
	public int[] anIntArray594;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "Z")
	public boolean aBoolean464 = false;

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "Z")
	public boolean aBoolean466 = false;

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "Z")
	public boolean aBoolean465 = false;

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "Z")
	public boolean aBoolean467 = false;

	@OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
	public int anInt7015 = 2;

	@OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
	public int anInt7016 = -1;

	@OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
	public int anInt7019 = 5;

	@OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
	public int anInt7017 = 99;

	@OriginalMember(owner = "client!vf", name = "A", descriptor = "I")
	public int anInt7021 = -1;

	@OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
	public int anInt7020 = -1;

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
	public int anInt7013 = -1;

	@OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
	public int anInt7024 = -1;

	static {
		new Class209("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!si;I)V")
	public void method5541(@OriginalArg(0) Class2_Sub23 arg0) {
		while (true) {
			@Pc(23) int local23 = arg0.method5495();
			if (local23 == 0) {
				return;
			}
			this.method5546(local23, arg0);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!t;IBIII)Lclient!t;")
	public Class91 method5542(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray594[arg4];
		@Pc(13) int local13 = this.anIntArray592[arg4];
		@Pc(21) Class2_Sub5_Sub3 local21 = this.aClass12_3.method257(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg0.method3285((byte) 1, arg1, true);
		}
		@Pc(35) Class2_Sub5_Sub3 local35 = null;
		if ((this.aBoolean466 || Static133.aBoolean221) && arg3 != -1 && this.anIntArray592.length > arg3) {
			@Pc(57) int local57 = this.anIntArray592[arg3];
			local35 = this.aClass12_3.method257(local57 >> 16);
			arg3 = local57 & 0xFFFF;
		}
		@Pc(71) Class2_Sub5_Sub3 local71 = null;
		@Pc(73) Class2_Sub5_Sub3 local73 = null;
		@Pc(75) int local75 = 0;
		@Pc(77) int local77 = 0;
		if (this.anIntArray593 != null) {
			if (arg4 < this.anIntArray593.length) {
				local75 = this.anIntArray593[arg4];
				if (local75 != 65535) {
					local71 = this.aClass12_3.method257(local75 >> 16);
					local75 &= 0xFFFF;
				}
			}
			if ((this.aBoolean466 || Static133.aBoolean221) && arg3 != -1 && this.anIntArray593.length > arg3) {
				local77 = this.anIntArray593[arg3];
				if (local77 != 65535) {
					local73 = this.aClass12_3.method257(local77 >> 16);
					local77 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean464) {
			arg1 |= 0x200;
		}
		if (local21.method888(local25)) {
			arg1 |= 0x80;
		}
		if (local21.method889(local25)) {
			arg1 |= 0x100;
		}
		if (local21.method885(local25)) {
			arg1 |= 0x400;
		}
		if (local71 != null) {
			if (local71.method888(local75)) {
				arg1 |= 0x80;
			}
			if (local71.method889(local75)) {
				arg1 |= 0x100;
			}
			if (local71.method885(local75)) {
				arg1 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method888(arg3)) {
				arg1 |= 0x80;
			}
			if (local35.method889(arg3)) {
				arg1 |= 0x100;
			}
			if (local35.method885(arg3)) {
				arg1 |= 0x400;
			}
		}
		if (local73 != null) {
			if (local73.method888(local77)) {
				arg1 |= 0x80;
			}
			if (local73.method889(local77)) {
				arg1 |= 0x100;
			}
			if (local73.method885(local77)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(286) Class91 local286 = arg0.method3285((byte) 1, arg1, true);
		local286.method3294(local21, local8, this.aBoolean464, local25, local35, arg3, arg2 - 1, 0);
		if (local71 != null) {
			local286.method3294(local71, local8, this.aBoolean464, local75, local73, local77, arg2 - 1, 0);
		}
		return local286;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
	public void method5544() {
		if (this.anInt7021 == -1) {
			if (this.aBooleanArray25 == null) {
				this.anInt7021 = 0;
			} else {
				this.anInt7021 = 2;
			}
		}
		if (this.anInt7013 != -1) {
			return;
		}
		if (this.aBooleanArray25 == null) {
			this.anInt7013 = 0;
		} else {
			this.anInt7013 = 2;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBLclient!si;)V")
	private void method5546(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub23 arg1) {
		@Pc(10) int local10;
		@Pc(16) int local16;
		@Pc(35) int local35;
		@Pc(50) int local50;
		if (arg0 == 1) {
			local10 = arg1.method5500();
			this.anIntArray594 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray594[local16] = arg1.method5500();
			}
			this.anIntArray592 = new int[local10];
			for (local35 = 0; local35 < local10; local35++) {
				this.anIntArray592[local35] = arg1.method5500();
			}
			for (local50 = 0; local50 < local10; local50++) {
				this.anIntArray592[local50] = (arg1.method5500() << 16) + this.anIntArray592[local50];
			}
		} else if (arg0 == 2) {
			this.anInt7016 = arg1.method5500();
		} else if (arg0 == 3) {
			this.aBooleanArray25 = new boolean[256];
			local10 = arg1.method5495();
			for (local16 = 0; local16 < local10; local16++) {
				this.aBooleanArray25[arg1.method5495()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean465 = true;
		} else if (arg0 == 5) {
			this.anInt7019 = arg1.method5495();
		} else if (arg0 == 6) {
			this.anInt7024 = arg1.method5500();
		} else if (arg0 == 7) {
			this.anInt7020 = arg1.method5500();
		} else if (arg0 == 8) {
			this.anInt7017 = arg1.method5495();
		} else if (arg0 == 9) {
			this.anInt7013 = arg1.method5495();
		} else if (arg0 == 10) {
			this.anInt7021 = arg1.method5495();
		} else if (arg0 == 11) {
			this.anInt7015 = arg1.method5495();
		} else if (arg0 == 12) {
			local10 = arg1.method5495();
			this.anIntArray593 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray593[local16] = arg1.method5500();
			}
			for (local35 = 0; local35 < local10; local35++) {
				this.anIntArray593[local35] = (arg1.method5500() << 16) + this.anIntArray593[local35];
			}
		} else if (arg0 == 13) {
			local10 = arg1.method5500();
			this.anIntArrayArray60 = new int[local10][];
			for (local16 = 0; local16 < local10; local16++) {
				local35 = arg1.method5495();
				if (local35 > 0) {
					this.anIntArrayArray60[local16] = new int[local35];
					this.anIntArrayArray60[local16][0] = arg1.method5485();
					for (local50 = 1; local50 < local35; local50++) {
						this.anIntArrayArray60[local16][local50] = arg1.method5500();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean464 = true;
		} else if (arg0 == 15) {
			this.aBoolean466 = true;
		} else if (arg0 == 16) {
			this.aBoolean467 = true;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZIII)I")
	public int method5547(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray592[arg2];
		@Pc(14) Class2_Sub5_Sub3 local14 = null;
		@Pc(22) Class2_Sub5_Sub3 local22 = this.aClass12_3.method257(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean466 || Static133.aBoolean221) && arg1 != -1 && arg1 < this.anIntArray592.length) {
			local7 = this.anIntArray592[arg1];
			local14 = this.aClass12_3.method257(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean464) {
			local5 = 512;
		}
		if (local22.method888(local26)) {
			local5 |= 0x80;
		}
		if (local22.method889(local26)) {
			local5 |= 0x100;
		}
		if (local22.method885(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method888(local7)) {
				local5 |= 0x80;
			}
			if (local14.method889(local7)) {
				local5 |= 0x100;
			}
			if (local14.method885(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray593 != null && arg0) {
			@Pc(154) int local154;
			@Pc(167) Class2_Sub5_Sub3 local167;
			if (arg2 < this.anIntArray593.length) {
				local154 = this.anIntArray593[arg2];
				if (local154 != 65535) {
					local167 = this.aClass12_3.method257(local154 >> 16);
					local154 &= 0xFFFF;
					if (local167 != null) {
						if (local167.method888(local154)) {
							local5 |= 0x80;
						}
						if (local167.method889(local154)) {
							local5 |= 0x100;
						}
						if (local167.method885(local154)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean466 || Static133.aBoolean221) && arg1 != -1 && arg1 < this.anIntArray593.length) {
				local154 = this.anIntArray593[arg1];
				if (local154 != 65535) {
					local167 = this.aClass12_3.method257(local154 >> 16);
					local154 &= 0xFFFF;
					if (local167 != null) {
						if (local167.method888(local154)) {
							local5 |= 0x80;
						}
						if (local167.method889(local154)) {
							local5 |= 0x100;
						}
						if (local167.method885(local154)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BIIILclient!t;IIB)Lclient!t;")
	public Class91 method5548(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class91 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte arg6) {
		@Pc(8) int local8 = this.anIntArray594[arg4];
		@Pc(13) int local13 = this.anIntArray592[arg4];
		@Pc(21) Class2_Sub5_Sub3 local21 = this.aClass12_3.method257(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg3.method3285(arg6, arg0, true);
		}
		@Pc(35) Class2_Sub5_Sub3 local35 = null;
		if ((this.aBoolean466 || Static133.aBoolean221) && arg5 != -1 && this.anIntArray592.length > arg5) {
			@Pc(58) int local58 = this.anIntArray592[arg5];
			local35 = this.aClass12_3.method257(local58 >> 16);
			arg5 = local58 & 0xFFFF;
		}
		if (this.aBoolean464) {
			arg0 |= 0x200;
		}
		if (local21.method888(local25)) {
			arg0 |= 0x80;
		}
		if (local21.method889(local25)) {
			arg0 |= 0x100;
		}
		if (local21.method885(local25)) {
			arg0 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method888(arg5)) {
				arg0 |= 0x80;
			}
			if (local35.method889(arg5)) {
				arg0 |= 0x100;
			}
			if (local35.method885(arg5)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(143) Class91 local143 = arg3.method3285(arg6, arg0, true);
		local143.method3294(local21, local8, this.aBoolean464, local25, local35, arg5, arg1 - 1, arg2);
		return local143;
	}
}
