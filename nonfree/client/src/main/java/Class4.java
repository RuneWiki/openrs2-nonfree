import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4 {

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "J")
	private long aLong5;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "[I")
	private int[] anIntArray19;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "Z")
	public boolean aBoolean10;

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
	private int anInt137;

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "J")
	private long aLong7;

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)I")
	public int method90() {
		return this.anInt137 == -1 ? (this.anIntArray21[11] << 5) + (this.anIntArray19[4] << 20) + (this.anIntArray19[0] << 25) + (this.anIntArray21[0] << 15) - (-(this.anIntArray21[8] << 10) - this.anIntArray21[1]) : Static79.method1443(this.anInt137).anInt1858 + 305419896;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([IIZ[IZ)V")
	public void method92(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3) {
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(18) int local18 = 0; local18 < 7; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static27.anInt1160; local22++) {
					@Pc(28) Class2_Sub1_Sub12 local28 = Static72.method864(local22);
					if (local28 != null && !local28.aBoolean124 && local28.anInt2418 == (arg3 ? 7 : 0) + local18) {
						arg2[Static60.anIntArray289[local18]] = local22 + 256;
						break;
					}
				}
			}
		}
		this.anIntArray19 = arg0;
		this.anInt137 = arg1;
		this.anIntArray21 = arg2;
		this.aBoolean10 = arg3;
		this.method98();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZII)V")
	public void method93(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray19[arg1];
		if (arg0) {
			local8++;
			if (local8 >= Static57.anIntArrayArray68[arg1].length) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static57.anIntArrayArray68[arg1].length - 1;
			}
		}
		this.anIntArray19[arg1] = local8;
		this.method98();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)Lclient!hb;")
	public Class2_Sub1_Sub4_Sub5 method94() {
		if (this.anInt137 != -1) {
			return Static79.method1443(this.anInt137).method1193();
		}
		@Pc(27) boolean local27 = false;
		for (@Pc(29) int local29 = 0; local29 < 12; local29++) {
			@Pc(36) int local36 = this.anIntArray21[local29];
			if (local36 >= 256 && local36 < 512 && !Static72.method864(local36 - 256).method1518()) {
				local27 = true;
			}
			if (local36 >= 512 && !Static7.method178(local36 - 512).method1540(this.aBoolean10)) {
				local27 = true;
			}
		}
		if (local27) {
			return null;
		}
		@Pc(84) Class2_Sub1_Sub4_Sub5[] local84 = new Class2_Sub1_Sub4_Sub5[12];
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < 12; local88++) {
			@Pc(95) int local95 = this.anIntArray21[local88];
			@Pc(111) Class2_Sub1_Sub4_Sub5 local111;
			if (local95 >= 256 && local95 < 512) {
				local111 = Static72.method864(local95 - 256).method1519();
				if (local111 != null) {
					local84[local86++] = local111;
				}
			}
			if (local95 >= 512) {
				local111 = Static7.method178(local95 - 512).method1551(this.aBoolean10);
				if (local111 != null) {
					local84[local86++] = local111;
				}
			}
		}
		@Pc(150) Class2_Sub1_Sub4_Sub5 local150 = new Class2_Sub1_Sub4_Sub5(local84, local86);
		for (@Pc(152) int local152 = 0; local152 < 5; local152++) {
			if (this.anIntArray19[local152] != 0) {
				local150.method924(Static57.anIntArrayArray68[local152][0], Static57.anIntArrayArray68[local152][this.anIntArray19[local152]]);
				if (local152 == 1) {
					local150.method924(Static24.anIntArray117[0], Static24.anIntArray117[this.anIntArray19[local152]]);
				}
			}
		}
		return local150;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBLclient!mb;Lclient!mb;I)Lclient!hb;")
	public Class2_Sub1_Sub4_Sub5 method96(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub10 arg1, @OriginalArg(3) Class2_Sub1_Sub10 arg2, @OriginalArg(4) int arg3) {
		if (this.anInt137 != -1) {
			return Static79.method1443(this.anInt137).method1191(arg0, arg1, arg2, arg3);
		}
		@Pc(23) long local23 = this.aLong7;
		@Pc(26) int[] local26 = this.anIntArray21;
		if (arg2 != null && (arg2.anInt2092 >= 0 || arg2.anInt2095 >= 0)) {
			local26 = new int[12];
			for (@Pc(39) int local39 = 0; local39 < 12; local39++) {
				local26[local39] = this.anIntArray21[local39];
			}
			if (arg2.anInt2092 >= 0) {
				local23 += arg2.anInt2092 - this.anIntArray21[5] << 8;
				local26[5] = arg2.anInt2092;
			}
			if (arg2.anInt2095 >= 0) {
				local23 += arg2.anInt2095 - this.anIntArray21[3] << 16;
				local26[3] = arg2.anInt2095;
			}
		}
		@Pc(101) Class2_Sub1_Sub4_Sub5 local101 = (Class2_Sub1_Sub4_Sub5) Static75.aClass17_82.method786(local23);
		if (local101 == null) {
			@Pc(105) boolean local105 = false;
			for (@Pc(107) int local107 = 0; local107 < 12; local107++) {
				@Pc(113) int local113 = local26[local107];
				if (local113 >= 256 && local113 < 512 && !Static72.method864(local113 - 256).method1517()) {
					local105 = true;
				}
				if (local113 >= 512 && !Static7.method178(local113 - 512).method1536(this.aBoolean10)) {
					local105 = true;
				}
			}
			if (local105) {
				if (this.aLong5 != -1L) {
					local101 = (Class2_Sub1_Sub4_Sub5) Static75.aClass17_82.method786(this.aLong5);
				}
				if (local101 == null) {
					return null;
				}
			}
			if (local101 == null) {
				@Pc(179) Class2_Sub1_Sub4_Sub5[] local179 = new Class2_Sub1_Sub4_Sub5[12];
				@Pc(181) int local181 = 0;
				@Pc(189) int local189;
				for (@Pc(183) int local183 = 0; local183 < 12; local183++) {
					local189 = local26[local183];
					@Pc(205) Class2_Sub1_Sub4_Sub5 local205;
					if (local189 >= 256 && local189 < 512) {
						local205 = Static72.method864(local189 - 256).method1514();
						if (local205 != null) {
							local179[local181++] = local205;
						}
					}
					if (local189 >= 512) {
						local205 = Static7.method178(local189 - 512).method1550(this.aBoolean10);
						if (local205 != null) {
							local179[local181++] = local205;
						}
					}
				}
				local101 = new Class2_Sub1_Sub4_Sub5(local179, local181);
				for (local189 = 0; local189 < 5; local189++) {
					if (this.anIntArray19[local189] != 0) {
						local101.method924(Static57.anIntArrayArray68[local189][0], Static57.anIntArrayArray68[local189][this.anIntArray19[local189]]);
						if (local189 == 1) {
							local101.method924(Static24.anIntArray117[0], Static24.anIntArray117[this.anIntArray19[local189]]);
						}
					}
				}
				local101.method897();
				local101.method904(64, 850, -30, -50, -30, true);
				Static75.aClass17_82.method783(local101, local23);
				this.aLong5 = local23;
			}
		}
		if (arg2 == null && arg1 == null) {
			return local101;
		}
		@Pc(338) Class2_Sub1_Sub4_Sub5 local338;
		if (arg2 != null && arg1 != null) {
			local338 = arg2.method1310(arg1, arg3, local101, arg0);
		} else if (arg2 == null) {
			local338 = arg1.method1309(arg3, local101);
		} else {
			local338 = arg2.method1309(arg0, local101);
		}
		return local338;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!pd;Z)V")
	public void method97(@OriginalArg(0) Class2_Sub6 arg0) {
		arg0.method637(this.aBoolean10 ? 1 : 0);
		@Pc(32) int local32;
		for (@Pc(23) int local23 = 0; local23 < 7; local23++) {
			local32 = this.anIntArray21[Static60.anIntArray289[local23]];
			if (local32 == 0) {
				arg0.method637(-1);
			} else {
				arg0.method637(local32 - 256);
			}
		}
		for (local32 = 0; local32 < 5; local32++) {
			arg0.method637(this.anIntArray19[local32]);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	private void method98() {
		@Pc(8) long local8 = this.aLong7;
		@Pc(13) int local13 = this.anIntArray21[9];
		@Pc(18) int local18 = this.anIntArray21[5];
		this.anIntArray21[5] = local13;
		this.anIntArray21[9] = local18;
		this.aLong7 = 0L;
		for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
			this.aLong7 <<= 0x4;
			if (this.anIntArray21[local33] >= 256) {
				this.aLong7 += this.anIntArray21[local33] - 256;
			}
		}
		if (this.anIntArray21[0] >= 256) {
			this.aLong7 += this.anIntArray21[0] - 256 >> 4;
		}
		if (this.anIntArray21[1] >= 256) {
			this.aLong7 += this.anIntArray21[1] - 256 >> 8;
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			this.aLong7 <<= 0x3;
			this.aLong7 += this.anIntArray19[local109];
		}
		this.aLong7 <<= 0x1;
		this.aLong7 += this.aBoolean10 ? 1 : 0;
		this.anIntArray21[5] = local18;
		this.anIntArray21[9] = local13;
		if (local8 != 0L && local8 != this.aLong7) {
			Static75.aClass17_82.method785(local8);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ)V")
	public void method99(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean10) {
			this.method92(this.anIntArray19, -1, null, arg0);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZIZ)V")
	public void method103(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 1 && this.aBoolean10) {
			return;
		}
		@Pc(19) int local19 = this.anIntArray21[Static60.anIntArray289[arg0]];
		if (local19 == 0) {
			return;
		}
		local19 -= 256;
		@Pc(54) Class2_Sub1_Sub12 local54;
		do {
			if (arg1) {
				local19++;
				if (local19 >= Static27.anInt1160) {
					local19 = 0;
				}
			} else {
				local19--;
				if (local19 < 0) {
					local19 = Static27.anInt1160 - 1;
				}
			}
			local54 = Static72.method864(local19);
		} while (local54 == null || local54.aBoolean124 || (this.aBoolean10 ? 7 : 0) + arg0 != local54.anInt2418);
		this.anIntArray21[Static60.anIntArray289[arg0]] = local19 + 256;
		this.method98();
	}
}
