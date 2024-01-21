import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class26_Sub2_Sub1 extends Class26_Sub2 {

	@OriginalMember(owner = "client!ij", name = "Zb", descriptor = "I")
	public int anInt1949;

	@OriginalMember(owner = "client!ij", name = "ac", descriptor = "I")
	public int anInt1950;

	@OriginalMember(owner = "client!ij", name = "cc", descriptor = "I")
	public int anInt1951;

	@OriginalMember(owner = "client!ij", name = "dc", descriptor = "Lclient!wa;")
	public Class26_Sub6 aClass26_Sub6_1;

	@OriginalMember(owner = "client!ij", name = "fc", descriptor = "Lclient!oc;")
	public Class70 aClass70_952;

	@OriginalMember(owner = "client!ij", name = "hc", descriptor = "I")
	public int anInt1954;

	@OriginalMember(owner = "client!ij", name = "qc", descriptor = "I")
	public int anInt1960;

	@OriginalMember(owner = "client!ij", name = "sc", descriptor = "Lclient!wh;")
	public Class101 aClass101_1;

	@OriginalMember(owner = "client!ij", name = "tc", descriptor = "I")
	public int anInt1961;

	@OriginalMember(owner = "client!ij", name = "uc", descriptor = "I")
	public int anInt1962;

	@OriginalMember(owner = "client!ij", name = "Xb", descriptor = "I")
	public int anInt1947 = 0;

	@OriginalMember(owner = "client!ij", name = "Vb", descriptor = "I")
	public int anInt1945 = 0;

	@OriginalMember(owner = "client!ij", name = "kc", descriptor = "Z")
	public boolean aBoolean100 = false;

	@OriginalMember(owner = "client!ij", name = "pc", descriptor = "I")
	public int anInt1959 = -1;

	@OriginalMember(owner = "client!ij", name = "ic", descriptor = "I")
	public int anInt1955 = 0;

	@OriginalMember(owner = "client!ij", name = "bc", descriptor = "S")
	private short aShort1 = 0;

	@OriginalMember(owner = "client!ij", name = "Bc", descriptor = "S")
	private short aShort2 = 0;

	@OriginalMember(owner = "client!ij", name = "gc", descriptor = "I")
	public int anInt1953 = 0;

	@OriginalMember(owner = "client!ij", name = "Ub", descriptor = "I")
	public int anInt1944 = -1;

	@OriginalMember(owner = "client!ij", name = "Cc", descriptor = "I")
	public int anInt1963 = 0;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIIIIILclient!wa;III)V")
	private void method1354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class26_Sub6 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg0 * arg0 + arg6 * arg6 > 360000) {
			return;
		}
		@Pc(27) int local27 = (int) (Math.atan2((double) arg0, (double) arg6) * 325.949D) & 0x7FF;
		@Pc(45) Class26_Sub6 local45 = Static64.method988(super.anInt2611, arg7, local27, super.anInt2593, super.anInt2636, arg8);
		if (local45 != null) {
			local45.method2993(0, arg3, arg11, arg5, arg10, arg2, arg1, arg9, -1L);
		}
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method1861() {
		return this.aClass101_1 != null;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BLclient!ce;)V")
	public void method1356(@OriginalArg(1) Class3_Sub4 arg0) {
		arg0.anInt1758 = 0;
		@Pc(12) int local12 = arg0.method1278();
		if ((local12 & 0x2) == 2) {
			this.aShort1 = (short) (arg0.method1278() << 2);
			this.aShort2 = (short) (arg0.method1278() << 2);
		} else {
			this.aShort1 = 0;
			this.aShort2 = 0;
		}
		super.anInt2604 = (local12 >> 3) + 1;
		@Pc(54) int local54 = local12 & 0x1;
		this.anInt1944 = arg0.method1248();
		@Pc(70) boolean local70 = (local12 & 0x4) != 0;
		this.anInt1959 = arg0.method1248();
		@Pc(77) int local77 = -1;
		this.anInt1955 = 0;
		@Pc(83) int[] local83 = new int[12];
		@Pc(115) int local115;
		@Pc(121) int local121;
		for (@Pc(93) int local93 = 0; local93 < 12; local93++) {
			@Pc(101) int local101 = arg0.method1278();
			if (local101 == 0) {
				local83[local93] = 0;
			} else {
				local115 = arg0.method1278();
				local121 = (local101 << 8) + local115;
				if (local93 == 0 && local121 == 65535) {
					local77 = arg0.method1270();
					break;
				}
				if (local121 >= 32768) {
					local121 = Static15.anIntArray25[local121 - 32768];
					local83[local93] = local121 | 0x40000000;
					@Pc(157) int local157 = Static14.method275(local121).anInt1265;
					if (local157 != 0) {
						this.anInt1955 = local157;
					}
				} else {
					local83[local93] = local121 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(181) int[] local181 = new int[5];
		for (local115 = 0; local115 < 5; local115++) {
			local121 = arg0.method1278();
			if (local121 < 0 || Static4.aShortArrayArray1[local115].length <= local121) {
				local121 = 0;
			}
			local181[local115] = local121;
		}
		super.anInt2594 = arg0.method1270();
		if (super.anInt2594 == 65535) {
			super.anInt2594 = -1;
		}
		super.anInt2609 = arg0.method1270();
		if (super.anInt2609 == 65535) {
			super.anInt2609 = -1;
		}
		super.anInt2633 = super.anInt2609;
		super.anInt2603 = arg0.method1270();
		if (super.anInt2603 == 65535) {
			super.anInt2603 = -1;
		}
		super.anInt2625 = arg0.method1270();
		if (super.anInt2625 == 65535) {
			super.anInt2625 = -1;
		}
		super.anInt2617 = arg0.method1270();
		if (super.anInt2617 == 65535) {
			super.anInt2617 = -1;
		}
		super.anInt2590 = arg0.method1270();
		if (super.anInt2590 == 65535) {
			super.anInt2590 = -1;
		}
		super.anInt2628 = arg0.method1270();
		if (super.anInt2628 == 65535) {
			super.anInt2628 = -1;
		}
		this.aClass70_952 = Static113.method1641(arg0.method1272()).method2033();
		this.anInt1947 = arg0.method1278();
		if (local70) {
			this.anInt1945 = arg0.method1270();
		} else {
			this.anInt1945 = 0;
		}
		if (this.aClass101_1 == null) {
			this.aClass101_1 = new Class101();
		}
		this.aClass101_1.method3308(local54 == 1, local77, local181, local83);
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "()I")
	@Override
	public int method2995() {
		return super.anInt2600;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass101_1 == null) {
			return;
		}
		@Pc(26) Class3_Sub3_Sub17 local26 = super.anInt2599 != -1 && super.anInt2610 == 0 ? Static11.method254(super.anInt2599) : null;
		@Pc(52) Class3_Sub3_Sub17 local52 = super.anInt2596 == -1 || this.aBoolean100 || super.anInt2596 == super.anInt2594 && local26 != null ? null : Static11.method254(super.anInt2596);
		@Pc(63) Class26_Sub6 local63 = this.aClass101_1.method3316(super.anInt2623, super.anInt2621, local52, local26);
		if (local63 == null) {
			return;
		}
		super.anInt2600 = local63.method2995();
		@Pc(78) int local78;
		@Pc(126) int local126;
		@Pc(137) int local137;
		@Pc(173) int local173;
		if (Static144.aClass26_Sub2_Sub1_1 == this) {
			for (local78 = Static192.aClass42Array1.length - 1; local78 >= 0; local78--) {
				@Pc(84) Class42 local84 = Static192.aClass42Array1[local78];
				if (local84 != null && local84.anInt1604 != -1) {
					if (local84.anInt1605 == 1 && local84.anInt1602 >= 0 && local84.anInt1602 < Static8.aClass26_Sub2_Sub2Array1.length) {
						@Pc(113) Class26_Sub2_Sub2 local113 = Static8.aClass26_Sub2_Sub2Array1[local84.anInt1602];
						if (local113 != null) {
							local126 = local113.anInt2593 / 32 - Static144.aClass26_Sub2_Sub1_1.anInt2593 / 32;
							local137 = local113.anInt2611 / 32 - Static144.aClass26_Sub2_Sub1_1.anInt2611 / 32;
							this.method1354(local126, arg6, arg5, arg1, arg0, arg3, local137, local84.anInt1604, local63, arg7, arg4, arg2);
						}
					}
					if (local84.anInt1605 == 2) {
						local173 = (local84.anInt1601 + -Static30.anInt695) * 4 + 2 - Static144.aClass26_Sub2_Sub1_1.anInt2593 / 32;
						local126 = (local84.anInt1606 - Static55.anInt1184) * 4 + 2 - Static144.aClass26_Sub2_Sub1_1.anInt2611 / 32;
						this.method1354(local173, arg6, arg5, arg1, arg0, arg3, local126, local84.anInt1604, local63, arg7, arg4, arg2);
					}
					if (local84.anInt1605 == 10 && local84.anInt1602 >= 0 && Static146.aClass26_Sub2_Sub1Array1.length > local84.anInt1602) {
						@Pc(226) Class26_Sub2_Sub1 local226 = Static146.aClass26_Sub2_Sub1Array1[local84.anInt1602];
						if (local226 != null) {
							local126 = local226.anInt2593 / 32 - Static144.aClass26_Sub2_Sub1_1.anInt2593 / 32;
							local137 = local226.anInt2611 / 32 - Static144.aClass26_Sub2_Sub1_1.anInt2611 / 32;
							this.method1354(local126, arg6, arg5, arg1, arg0, arg3, local137, local84.anInt1604, local63, arg7, arg4, arg2);
						}
					}
				}
			}
		}
		@Pc(271) int local271 = 0;
		local173 = 0;
		local78 = 0;
		if (this.aShort1 != 0 && this.aShort2 != 0) {
			local126 = Class3_Sub3_Sub2_Sub5.anIntArray300[arg0];
			local137 = Class3_Sub3_Sub2_Sub5.anIntArray303[arg0];
			@Pc(295) short local295 = this.aShort1;
			@Pc(298) short local298 = this.aShort2;
			@Pc(303) int local303 = -local295 / 2;
			@Pc(308) int local308 = -local298 / 2;
			@Pc(319) int local319 = local137 * local308 - local126 * local303 >> 16;
			@Pc(324) int local324 = -local298 / 2;
			@Pc(334) int local334 = local137 * local303 + local126 * local308 >> 16;
			@Pc(338) int local338 = local295 / 2;
			@Pc(349) int local349 = local137 * local324 - local126 * local338 >> 16;
			@Pc(362) int local362 = Static107.method2399(super.anInt2611 + local319, super.anInt2593 - -local334, Static137.anInt2795);
			@Pc(366) int local366 = local298 / 2;
			@Pc(376) int local376 = local137 * local338 + local126 * local324 >> 16;
			@Pc(390) int local390 = Static107.method2399(super.anInt2611 + local349, super.anInt2593 - -local376, Static137.anInt2795);
			@Pc(395) int local395 = -local295 / 2;
			@Pc(406) int local406 = local366 * local126 + local137 * local395 >> 16;
			@Pc(416) int local416 = local366 * local137 - local395 * local126 >> 16;
			@Pc(428) int local428 = Static107.method2399(local416 + super.anInt2611, super.anInt2593 + local406, Static137.anInt2795);
			@Pc(432) int local432 = local298 / 2;
			@Pc(436) int local436 = local295 / 2;
			@Pc(446) int local446 = local436 * local137 + local126 * local432 >> 16;
			@Pc(457) int local457 = local432 * local137 - local436 * local126 >> 16;
			@Pc(464) int local464 = local390 > local362 ? local362 : local390;
			@Pc(477) int local477 = Static107.method2399(super.anInt2611 + local457, local446 + super.anInt2593, Static137.anInt2795);
			@Pc(484) int local484 = local477 <= local428 ? local477 : local428;
			local78 = (int) (Math.atan2((double) (local464 - local484), (double) local298) * 325.95D) & 0x7FF;
			if (local78 != 0) {
				local63.method2532(local78);
			}
			local173 = local477 + local362;
			if (local428 + local390 < local173) {
				local173 = local428 + local390;
			}
			@Pc(523) int local523 = local428 > local362 ? local362 : local428;
			@Pc(530) int local530 = local477 <= local390 ? local477 : local390;
			local271 = (int) (Math.atan2((double) (local523 - local530), (double) local295) * 325.95D) & 0x7FF;
			if (local271 != 0) {
				local63.method2522(local271);
			}
			local173 = (local173 >> 1) - super.anInt2636;
			if (local173 != 0) {
				local63.method2534(0, local173, 0);
			}
		}
		@Pc(569) Class26_Sub6 local569 = null;
		if (!this.aBoolean100 && super.anInt2608 != -1 && super.anInt2592 != -1) {
			@Pc(586) Class3_Sub3_Sub1 local586 = Static78.method1141(super.anInt2608);
			local569 = local586.method89(super.anInt2592);
			if (local569 != null) {
				local569.method2534(0, -super.anInt2589, 0);
				if (local586.aBoolean8) {
					if (local78 != 0) {
						local569.method2532(local78);
					}
					if (local271 != 0) {
						local569.method2522(local271);
					}
					if (local173 != 0) {
						local569.method2534(0, local173, 0);
					}
				}
			}
		}
		@Pc(626) Class26_Sub6 local626 = null;
		if (!this.aBoolean100 && this.aClass26_Sub6_1 != null) {
			if (this.anInt1963 <= Static184.anInt3760) {
				this.aClass26_Sub6_1 = null;
			}
			if (Static184.anInt3760 >= this.anInt1953 && Static184.anInt3760 < this.anInt1963) {
				local626 = this.aClass26_Sub6_1;
				local626.method2534(this.anInt1949 - super.anInt2593, this.anInt1950 - super.anInt2636, this.anInt1960 - super.anInt2611);
				if (super.anInt2644 == 512) {
					local626.method2526();
				} else if (super.anInt2644 == 1024) {
					local626.method2528();
				} else if (super.anInt2644 == 1536) {
					local626.method2531();
				}
			}
		}
		if (local569 != null) {
			local63 = ((Class26_Sub6_Sub1) local63).method2549(local569);
		}
		if (local626 != null) {
			local63 = ((Class26_Sub6_Sub1) local63).method2549(local626);
		}
		local63.aBoolean154 = true;
		local63.method2993(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local626 == null) {
			return;
		}
		if (super.anInt2644 == 512) {
			local626.method2531();
		} else if (super.anInt2644 == 1024) {
			local626.method2528();
		} else if (super.anInt2644 == 1536) {
			local626.method2526();
		}
		local626.method2534(super.anInt2593 - this.anInt1949, -this.anInt1950 + super.anInt2636, super.anInt2611 - this.anInt1960);
	}
}
