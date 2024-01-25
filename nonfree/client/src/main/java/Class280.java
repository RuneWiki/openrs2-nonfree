import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class280 {

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "[Z")
	public boolean[] aBooleanArray31;

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "[I")
	public int[] anIntArray629;

	@OriginalMember(owner = "client!tt", name = "m", descriptor = "Lclient!ht;")
	public Class126 aClass126_2;

	@OriginalMember(owner = "client!tt", name = "r", descriptor = "[I")
	public int[] anIntArray630;

	@OriginalMember(owner = "client!tt", name = "s", descriptor = "I")
	public int anInt8107;

	@OriginalMember(owner = "client!tt", name = "w", descriptor = "[[I")
	public int[][] anIntArrayArray75;

	@OriginalMember(owner = "client!tt", name = "z", descriptor = "[I")
	private int[] anIntArray631;

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
	public int anInt8098 = 0;

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "Z")
	public boolean aBoolean546 = false;

	@OriginalMember(owner = "client!tt", name = "t", descriptor = "I")
	public int anInt8108 = -1;

	@OriginalMember(owner = "client!tt", name = "q", descriptor = "Z")
	public boolean aBoolean547 = false;

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "I")
	public int anInt8099 = -1;

	@OriginalMember(owner = "client!tt", name = "v", descriptor = "I")
	public int anInt8109 = 99;

	@OriginalMember(owner = "client!tt", name = "y", descriptor = "I")
	public int anInt8110 = 2;

	@OriginalMember(owner = "client!tt", name = "o", descriptor = "I")
	public int anInt8105 = -1;

	@OriginalMember(owner = "client!tt", name = "k", descriptor = "I")
	public int anInt8103 = 5;

	@OriginalMember(owner = "client!tt", name = "u", descriptor = "Z")
	public boolean aBoolean548 = false;

	@OriginalMember(owner = "client!tt", name = "C", descriptor = "I")
	public int anInt8112 = -1;

	@OriginalMember(owner = "client!tt", name = "B", descriptor = "I")
	public int anInt8111 = -1;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IILclient!r;III)Lclient!r;")
	public Class19 method6873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray630[arg3];
		@Pc(13) int local13 = this.anIntArray629[arg3];
		@Pc(21) Class1_Sub1_Sub8 local21 = this.aClass126_2.method3573(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg2.method7260((byte) 1, arg1, true);
		}
		@Pc(35) Class1_Sub1_Sub8 local35 = null;
		if ((this.aBoolean547 || Static306.aBoolean405) && arg0 != -1 && this.anIntArray629.length > arg0) {
			@Pc(57) int local57 = this.anIntArray629[arg0];
			local35 = this.aClass126_2.method3573(local57 >> 16);
			arg0 = local57 & 0xFFFF;
		}
		@Pc(71) Class1_Sub1_Sub8 local71 = null;
		@Pc(73) Class1_Sub1_Sub8 local73 = null;
		@Pc(75) int local75 = 0;
		@Pc(77) int local77 = 0;
		if (this.anIntArray631 != null) {
			if (arg3 < this.anIntArray631.length) {
				local75 = this.anIntArray631[arg3];
				if (local75 != 65535) {
					local71 = this.aClass126_2.method3573(local75 >> 16);
					local75 &= 0xFFFF;
				}
			}
			if ((this.aBoolean547 || Static306.aBoolean405) && arg0 != -1 && arg0 < this.anIntArray631.length) {
				local77 = this.anIntArray631[arg0];
				if (local77 != 65535) {
					local73 = this.aClass126_2.method3573(local77 >> 16);
					local77 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean548) {
			arg1 |= 0x200;
		}
		if (local21.method3251(local25)) {
			arg1 |= 0x80;
		}
		if (local21.method3247(local25)) {
			arg1 |= 0x100;
		}
		if (local21.method3245(local25)) {
			arg1 |= 0x400;
		}
		if (local71 != null) {
			if (local71.method3251(local75)) {
				arg1 |= 0x80;
			}
			if (local71.method3247(local75)) {
				arg1 |= 0x100;
			}
			if (local71.method3245(local75)) {
				arg1 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method3251(arg0)) {
				arg1 |= 0x80;
			}
			if (local35.method3247(arg0)) {
				arg1 |= 0x100;
			}
			if (local35.method3245(arg0)) {
				arg1 |= 0x400;
			}
		}
		if (local73 != null) {
			if (local73.method3251(local77)) {
				arg1 |= 0x80;
			}
			if (local73.method3247(local77)) {
				arg1 |= 0x100;
			}
			if (local73.method3245(local77)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(280) Class19 local280 = arg2.method7260((byte) 1, arg1, true);
		local280.method7250(local21, local35, local8, arg0, 0, local25, arg4 - 1, this.aBoolean548);
		if (local71 != null) {
			local280.method7250(local71, local73, local8, local77, 0, local75, arg4 - 1, this.aBoolean548);
		}
		return local280;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIBILclient!r;BII)Lclient!r;")
	public Class19 method6875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class19 arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray630[arg2];
		@Pc(13) int local13 = this.anIntArray629[arg2];
		@Pc(21) Class1_Sub1_Sub8 local21 = this.aClass126_2.method3573(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg3.method7260(arg4, arg0, true);
		}
		@Pc(35) Class1_Sub1_Sub8 local35 = null;
		if ((this.aBoolean547 || Static306.aBoolean405) && arg1 != -1 && this.anIntArray629.length > arg1) {
			@Pc(57) int local57 = this.anIntArray629[arg1];
			local35 = this.aClass126_2.method3573(local57 >> 16);
			arg1 = local57 & 0xFFFF;
		}
		if (this.aBoolean548) {
			arg0 |= 0x200;
		}
		if (local21.method3251(local25)) {
			arg0 |= 0x80;
		}
		if (local21.method3247(local25)) {
			arg0 |= 0x100;
		}
		if (local21.method3245(local25)) {
			arg0 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method3251(arg1)) {
				arg0 |= 0x80;
			}
			if (local35.method3247(arg1)) {
				arg0 |= 0x100;
			}
			if (local35.method3245(arg1)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(152) Class19 local152 = arg3.method7260(arg4, arg0, true);
		local152.method7250(local21, local35, local8, arg1, arg6, local25, arg5 - 1, this.aBoolean548);
		return local152;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZIIZ)I")
	public int method6876(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) int local5 = 0;
		@Pc(12) int local12 = 0;
		@Pc(17) int local17 = this.anIntArray629[arg1];
		@Pc(19) Class1_Sub1_Sub8 local19 = null;
		@Pc(27) Class1_Sub1_Sub8 local27 = this.aClass126_2.method3573(local17 >> 16);
		@Pc(31) int local31 = local17 & 0xFFFF;
		if (local27 == null) {
			return 0;
		}
		if ((this.aBoolean547 || Static306.aBoolean405) && arg0 != -1 && this.anIntArray629.length > arg0) {
			local12 = this.anIntArray629[arg0];
			local19 = this.aClass126_2.method3573(local12 >> 16);
			local12 &= 0xFFFF;
		}
		if (this.aBoolean548) {
			local5 = 512;
		}
		if (local27.method3251(local31)) {
			local5 |= 0x80;
		}
		if (local27.method3247(local31)) {
			local5 |= 0x100;
		}
		if (local27.method3245(local31)) {
			local5 |= 0x400;
		}
		if (local19 != null) {
			if (local19.method3251(local12)) {
				local5 |= 0x80;
			}
			if (local19.method3247(local12)) {
				local5 |= 0x100;
			}
			if (local19.method3245(local12)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray631 != null && arg2) {
			@Pc(147) int local147;
			@Pc(158) Class1_Sub1_Sub8 local158;
			if (arg1 < this.anIntArray631.length) {
				local147 = this.anIntArray631[arg1];
				if (local147 != 65535) {
					local158 = this.aClass126_2.method3573(local147 >> 16);
					local147 &= 0xFFFF;
					if (local158 != null) {
						if (local158.method3251(local147)) {
							local5 |= 0x80;
						}
						if (local158.method3247(local147)) {
							local5 |= 0x100;
						}
						if (local158.method3245(local147)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean547 || Static306.aBoolean405) && arg0 != -1 && this.anIntArray631.length > arg0) {
				local147 = this.anIntArray631[arg0];
				if (local147 != 65535) {
					local158 = this.aClass126_2.method3573(local147 >> 16);
					local147 &= 0xFFFF;
					if (local158 != null) {
						if (local158.method3251(local147)) {
							local5 |= 0x80;
						}
						if (local158.method3247(local147)) {
							local5 |= 0x100;
						}
						if (local158.method3245(local147)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V")
	public void method6877() {
		if (this.anInt8112 == -1) {
			if (this.aBooleanArray31 == null) {
				this.anInt8112 = 0;
			} else {
				this.anInt8112 = 2;
			}
		}
		if (this.anInt8111 != -1) {
			return;
		}
		if (this.aBooleanArray31 == null) {
			this.anInt8111 = 0;
		} else {
			this.anInt8111 = 2;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLclient!gw;I)V")
	private void method6878(@OriginalArg(1) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		@Pc(62) int local62;
		@Pc(68) int local68;
		@Pc(86) int local86;
		@Pc(149) int local149;
		if (arg1 == 1) {
			local62 = arg0.method3056();
			this.anIntArray630 = new int[local62];
			for (local68 = 0; local68 < local62; local68++) {
				this.anIntArray630[local68] = arg0.method3056();
			}
			this.anIntArray629 = new int[local62];
			for (local86 = 0; local86 < local62; local86++) {
				this.anIntArray629[local86] = arg0.method3056();
			}
			for (local149 = 0; local149 < local62; local149++) {
				this.anIntArray629[local149] += arg0.method3056() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt8105 = arg0.method3056();
		} else if (arg1 == 3) {
			this.aBooleanArray31 = new boolean[256];
			local62 = arg0.method3043();
			for (local68 = 0; local68 < local62; local68++) {
				this.aBooleanArray31[arg0.method3043()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt8103 = arg0.method3043();
		} else if (arg1 == 6) {
			this.anInt8099 = arg0.method3056();
		} else if (arg1 == 7) {
			this.anInt8108 = arg0.method3056();
		} else if (arg1 == 8) {
			this.anInt8109 = arg0.method3043();
		} else if (arg1 == 9) {
			this.anInt8111 = arg0.method3043();
		} else if (arg1 == 10) {
			this.anInt8112 = arg0.method3043();
		} else if (arg1 == 11) {
			this.anInt8110 = arg0.method3043();
		} else if (arg1 == 12) {
			local62 = arg0.method3043();
			this.anIntArray631 = new int[local62];
			for (local68 = 0; local68 < local62; local68++) {
				this.anIntArray631[local68] = arg0.method3056();
			}
			for (local86 = 0; local86 < local62; local86++) {
				this.anIntArray631[local86] += arg0.method3056() << 16;
			}
		} else if (arg1 == 13) {
			local62 = arg0.method3056();
			this.anIntArrayArray75 = new int[local62][];
			for (local68 = 0; local68 < local62; local68++) {
				local86 = arg0.method3043();
				if (local86 > 0) {
					this.anIntArrayArray75[local68] = new int[local86];
					this.anIntArrayArray75[local68][0] = arg0.method3039();
					for (local149 = 1; local149 < local86; local149++) {
						this.anIntArrayArray75[local68][local149] = arg0.method3056();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean548 = true;
		} else if (arg1 == 15) {
			this.aBoolean547 = true;
		} else if (arg1 == 16) {
			this.aBoolean546 = true;
		} else if (arg1 == 17) {
			this.anInt8098 = arg0.method3043();
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!gw;Z)V")
	public void method6880(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3043();
			if (local15 == 0) {
				return;
			}
			this.method6878(arg0, local15);
		}
	}
}
