import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class56 {

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "J")
	private long aLong125;

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "J")
	private long aLong126;

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "Z")
	public boolean aBoolean93;

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "[I")
	private int[] anIntArray215;

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
	private int anInt2166;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!ta;II)Lclient!a;")
	public Class1_Sub1 method1693(@OriginalArg(0) Class5_Sub2_Sub22 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2166 != -1) {
			return Static50.method887(this.anInt2166).method2728(arg1, arg0);
		}
		@Pc(26) Class1_Sub1 local26 = (Class1_Sub1) Static202.aClass84_21.method2332(this.aLong126);
		if (local26 == null) {
			@Pc(30) boolean local30 = false;
			for (@Pc(32) int local32 = 0; local32 < 12; local32++) {
				@Pc(39) int local39 = this.anIntArray214[local32];
				if ((local39 & 0x40000000) == 0) {
					if ((local39 & Integer.MIN_VALUE) != 0 && !Static71.method1174(local39 & 0x3FFFFFFF).method2577()) {
						local30 = true;
					}
				} else if (!Static196.method2908(local39 & 0x3FFFFFFF).method1780(this.aBoolean93)) {
					local30 = true;
				}
			}
			if (local30) {
				return null;
			}
			@Pc(92) Class1_Sub5[] local92 = new Class1_Sub5[12];
			@Pc(94) int local94 = 0;
			for (@Pc(96) int local96 = 0; local96 < 12; local96++) {
				@Pc(103) int local103 = this.anIntArray214[local96];
				@Pc(120) Class1_Sub5 local120;
				if ((local103 & 0x40000000) != 0) {
					local120 = Static196.method2908(local103 & 0x3FFFFFFF).method1769(this.aBoolean93);
					if (local120 != null) {
						local92[local94++] = local120;
					}
				} else if ((local103 & Integer.MIN_VALUE) != 0) {
					local120 = Static71.method1174(local103 & 0x3FFFFFFF).method2568();
					if (local120 != null) {
						local92[local94++] = local120;
					}
				}
			}
			@Pc(162) Class1_Sub5 local162 = new Class1_Sub5(local92, local94);
			for (@Pc(164) int local164 = 0; local164 < 5; local164++) {
				if (Static88.aShortArrayArray6[local164].length > this.anIntArray215[local164]) {
					local162.method1819(Static171.aShortArray52[local164], Static88.aShortArrayArray6[local164][this.anIntArray215[local164]]);
				}
				if (Static129.aShortArrayArray8[local164].length > this.anIntArray215[local164]) {
					local162.method1819(Static86.aShortArray25[local164], Static129.aShortArrayArray8[local164][this.anIntArray215[local164]]);
				}
			}
			local26 = local162.method1818(64, 768, -50, -10, -50);
			Static202.aClass84_21.method2331(this.aLong126, local26);
		}
		if (arg0 != null) {
			local26 = arg0.method2759(local26, arg1);
		}
		return local26;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
	private void method1695() {
		@Pc(8) long local8 = this.aLong126;
		@Pc(10) long[] local10 = Class51.aLongArray25;
		this.aLong126 = -1L;
		for (@Pc(15) int local15 = 0; local15 < 12; local15++) {
			this.aLong126 = local10[(int) (((long) (this.anIntArray214[local15] >> 24) ^ this.aLong126) & 0xFFL)] ^ this.aLong126 >>> 8;
			this.aLong126 = local10[(int) ((this.aLong126 ^ (long) (this.anIntArray214[local15] >> 16)) & 0xFFL)] ^ this.aLong126 >>> 8;
			this.aLong126 = this.aLong126 >>> 8 ^ local10[(int) ((this.aLong126 ^ (long) (this.anIntArray214[local15] >> 8)) & 0xFFL)];
			this.aLong126 = local10[(int) ((this.aLong126 ^ (long) this.anIntArray214[local15]) & 0xFFL)] ^ this.aLong126 >>> 8;
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			this.aLong126 = local10[(int) ((this.aLong126 ^ (long) this.anIntArray215[local109]) & 0xFFL)] ^ this.aLong126 >>> 8;
		}
		this.aLong126 = local10[(int) ((this.aLong126 ^ (long) (this.aBoolean93 ? 1 : 0)) & 0xFFL)] ^ this.aLong126 >>> 8;
		if (local8 != 0L && local8 != this.aLong126) {
			Static14.aClass84_4.method2336(local8);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZI[II[I)V")
	public void method1697(@OriginalArg(0) boolean arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg3 == null) {
			arg3 = new int[12];
			for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
				for (@Pc(20) int local20 = 0; local20 < Static65.anInt1413; local20++) {
					@Pc(26) Class5_Sub2_Sub18 local26 = Static71.method1174(local20);
					if (local26 != null && !local26.aBoolean151 && local26.anInt3396 == (arg0 ? 7 : 0) + local16) {
						arg3[Static84.anIntArray182[local16]] = local20 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anIntArray214 = arg3;
		this.anIntArray215 = arg1;
		this.aBoolean93 = arg0;
		this.anInt2166 = arg2;
		this.method1695();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V")
	public void method1698(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static84.anIntArray182[arg1];
		if (0 != this.anIntArray214[local7] && Static71.method1174(arg0) != null) {
			this.anIntArray214[local7] = arg0 | Integer.MIN_VALUE;
			this.method1695();
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIBLclient!ta;Lclient!ta;)Lclient!a;")
	public Class1_Sub1 method1699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5_Sub2_Sub22 arg2, @OriginalArg(4) Class5_Sub2_Sub22 arg3) {
		if (this.anInt2166 != -1) {
			return Static50.method887(this.anInt2166).method2719(arg3, arg0, arg1, arg2);
		}
		@Pc(32) long local32 = this.aLong126;
		@Pc(35) int[] local35 = this.anIntArray214;
		if (arg3 != null && (arg3.anInt3644 >= 0 || arg3.anInt3646 >= 0)) {
			local35 = new int[12];
			for (@Pc(51) int local51 = 0; local51 < 12; local51++) {
				local35[local51] = this.anIntArray214[local51];
			}
			if (arg3.anInt3644 >= 0) {
				if (arg3.anInt3644 == 65535) {
					local32 ^= 0xFFFFFFFF00000000L;
					local35[5] = 0;
				} else {
					local35[5] = arg3.anInt3644 | 0x40000000;
					local32 ^= (long) local35[5] << 32;
				}
			}
			if (arg3.anInt3646 >= 0) {
				if (arg3.anInt3646 == 65535) {
					local35[3] = 0;
					local32 ^= 0xFFFFFFFFL;
				} else {
					local35[3] = arg3.anInt3646 | 0x40000000;
					local32 ^= local35[3];
				}
			}
		}
		@Pc(141) Class1_Sub1 local141 = (Class1_Sub1) Static14.aClass84_4.method2332(local32);
		if (local141 == null) {
			@Pc(145) boolean local145 = false;
			for (@Pc(147) int local147 = 0; local147 < 12; local147++) {
				@Pc(153) int local153 = local35[local147];
				if ((local153 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local153) != 0 && !Static71.method1174(local153 & 0x3FFFFFFF).method2570()) {
						local145 = true;
					}
				} else if (!Static196.method2908(local153 & 0x3FFFFFFF).method1771(this.aBoolean93)) {
					local145 = true;
				}
			}
			if (local145) {
				if (this.aLong125 != -1L) {
					local141 = (Class1_Sub1) Static14.aClass84_4.method2332(this.aLong125);
				}
				if (local141 == null) {
					return null;
				}
			}
			if (local141 == null) {
				@Pc(220) Class1_Sub5[] local220 = new Class1_Sub5[12];
				@Pc(222) int local222 = 0;
				@Pc(230) int local230;
				@Pc(254) Class1_Sub5 local254;
				for (@Pc(224) int local224 = 0; local224 < 12; local224++) {
					local230 = local35[local224];
					if ((local230 & 0x40000000) != 0) {
						local254 = Static196.method2908(local230 & 0x3FFFFFFF).method1773(this.aBoolean93);
						if (local254 != null) {
							local220[local222++] = local254;
						}
					} else if ((Integer.MIN_VALUE & local230) != 0) {
						local254 = Static71.method1174(local230 & 0x3FFFFFFF).method2572();
						if (local254 != null) {
							local220[local222++] = local254;
						}
					}
				}
				local230 = local35[0];
				@Pc(303) int local303;
				if ((local230 & 0x40000000) != 0) {
					@Pc(298) Class5_Sub2_Sub11 local298 = Static196.method2908(local230 & 0x3FFFFFFF);
					if (local298.anIntArrayArray23 != null) {
						for (local303 = 0; local303 < local298.anIntArrayArray23.length; local303++) {
							@Pc(312) int local312 = local298.anIntArrayArray23[local303][0];
							@Pc(319) int local319 = local298.anIntArrayArray23[local303][1];
							@Pc(326) int local326 = local298.anIntArrayArray23[local303][2];
							@Pc(333) int local333 = local298.anIntArrayArray23[local303][3];
							@Pc(340) int local340 = local298.anIntArrayArray23[local303][4];
							@Pc(347) int local347 = local298.anIntArrayArray23[local303][5];
							local220[local303 + 1].method1796(local312, local319, local326);
							local220[local303 + 1].method1809(local333, local340, local347);
						}
					}
				}
				local254 = new Class1_Sub5(local220, local222);
				for (local303 = 0; local303 < 5; local303++) {
					if (this.anIntArray215[local303] < Static88.aShortArrayArray6[local303].length) {
						local254.method1819(Static171.aShortArray52[local303], Static88.aShortArrayArray6[local303][this.anIntArray215[local303]]);
					}
					if (Static129.aShortArrayArray8[local303].length > this.anIntArray215[local303]) {
						local254.method1819(Static86.aShortArray25[local303], Static129.aShortArrayArray8[local303][this.anIntArray215[local303]]);
					}
				}
				local141 = local254.method1818(64, 850, -30, -50, -30);
				Static14.aClass84_4.method2331(local32, local141);
				this.aLong125 = local32;
			}
		}
		if (arg3 == null && arg2 == null) {
			return local141;
		}
		@Pc(471) Class1_Sub1 local471;
		if (arg3 != null && arg2 != null) {
			local471 = arg3.method2762(arg2, arg1, local141, arg0);
		} else if (arg3 == null) {
			local471 = arg2.method2755(arg1, local141);
		} else {
			local471 = arg3.method2755(arg0, local141);
		}
		return local471;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)I")
	public int method1700() {
		return this.anInt2166 == -1 ? this.anIntArray214[1] + (this.anIntArray214[11] << 5) + (this.anIntArray215[0] << 25) - (-(this.anIntArray215[4] << 20) + -(this.anIntArray214[0] << 15) - (this.anIntArray214[8] << 10)) : Static50.method887(this.anInt2166).anInt3602 + 305419896;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIB)V")
	public void method1701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray215[arg0] = arg1;
		this.method1695();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZZ)V")
	public void method1702(@OriginalArg(1) boolean arg0) {
		this.aBoolean93 = arg0;
		this.method1695();
	}
}
