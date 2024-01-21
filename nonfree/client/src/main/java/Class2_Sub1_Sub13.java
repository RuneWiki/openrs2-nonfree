import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class2_Sub1_Sub13 extends Class2_Sub1 {

	@OriginalMember(owner = "client!r", name = "ub", descriptor = "[I")
	public int[] anIntArray269;

	@OriginalMember(owner = "client!r", name = "Nb", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!r", name = "Pb", descriptor = "I")
	public int anInt2317;

	@OriginalMember(owner = "client!r", name = "Qb", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!r", name = "Rb", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!r", name = "Wb", descriptor = "[I")
	private int[] anIntArray274;

	@OriginalMember(owner = "client!r", name = "ic", descriptor = "[I")
	public int[] anIntArray275;

	@OriginalMember(owner = "client!r", name = "cb", descriptor = "I")
	public int anInt2292 = -1;

	@OriginalMember(owner = "client!r", name = "rb", descriptor = "Z")
	public boolean aBoolean95 = true;

	@OriginalMember(owner = "client!r", name = "Y", descriptor = "I")
	private int anInt2290 = -1;

	@OriginalMember(owner = "client!r", name = "sb", descriptor = "[Lclient!kc;")
	public final Class36[] aClass36Array39 = new Class36[5];

	@OriginalMember(owner = "client!r", name = "zb", descriptor = "I")
	private int anInt2307 = -1;

	@OriginalMember(owner = "client!r", name = "fb", descriptor = "I")
	public int anInt2295 = -1;

	@OriginalMember(owner = "client!r", name = "nb", descriptor = "I")
	public int anInt2301 = 0;

	@OriginalMember(owner = "client!r", name = "Ab", descriptor = "I")
	private int anInt2308 = 0;

	@OriginalMember(owner = "client!r", name = "lb", descriptor = "Z")
	public boolean aBoolean94 = false;

	@OriginalMember(owner = "client!r", name = "eb", descriptor = "I")
	private int anInt2294 = 0;

	@OriginalMember(owner = "client!r", name = "qb", descriptor = "I")
	public int anInt2303 = -1;

	@OriginalMember(owner = "client!r", name = "mb", descriptor = "I")
	public int anInt2300 = -1;

	@OriginalMember(owner = "client!r", name = "Bb", descriptor = "Lclient!kc;")
	public Class36 aClass36_1077 = Static88.aClass36_1072;

	@OriginalMember(owner = "client!r", name = "kb", descriptor = "I")
	private int anInt2299 = 128;

	@OriginalMember(owner = "client!r", name = "ob", descriptor = "I")
	public int anInt2302 = 16;

	@OriginalMember(owner = "client!r", name = "Mb", descriptor = "Z")
	public boolean aBoolean98 = true;

	@OriginalMember(owner = "client!r", name = "ab", descriptor = "I")
	public int anInt2291 = 0;

	@OriginalMember(owner = "client!r", name = "bc", descriptor = "Z")
	private boolean aBoolean102 = false;

	@OriginalMember(owner = "client!r", name = "Jb", descriptor = "I")
	public int anInt2314 = -1;

	@OriginalMember(owner = "client!r", name = "Ib", descriptor = "I")
	private int anInt2313 = 128;

	@OriginalMember(owner = "client!r", name = "Tb", descriptor = "I")
	private int anInt2319 = 0;

	@OriginalMember(owner = "client!r", name = "W", descriptor = "I")
	public int anInt2288 = 1;

	@OriginalMember(owner = "client!r", name = "ec", descriptor = "Z")
	public boolean aBoolean103 = true;

	@OriginalMember(owner = "client!r", name = "Eb", descriptor = "Z")
	private boolean aBoolean97 = false;

	@OriginalMember(owner = "client!r", name = "gb", descriptor = "I")
	public int anInt2296 = -1;

	@OriginalMember(owner = "client!r", name = "Db", descriptor = "Z")
	public boolean aBoolean96 = false;

	@OriginalMember(owner = "client!r", name = "Ub", descriptor = "Z")
	public boolean aBoolean99 = false;

	@OriginalMember(owner = "client!r", name = "cc", descriptor = "I")
	public int anInt2322 = 0;

	@OriginalMember(owner = "client!r", name = "Zb", descriptor = "Z")
	public boolean aBoolean101 = false;

	@OriginalMember(owner = "client!r", name = "hc", descriptor = "I")
	public int anInt2326 = 1;

	@OriginalMember(owner = "client!r", name = "ac", descriptor = "I")
	private int anInt2321 = 128;

	@OriginalMember(owner = "client!r", name = "vb", descriptor = "I")
	public int anInt2304 = 0;

	@OriginalMember(owner = "client!r", name = "gc", descriptor = "I")
	private int anInt2325 = 0;

	@OriginalMember(owner = "client!r", name = "jc", descriptor = "I")
	private int anInt2327 = 0;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(B)Z")
	public boolean method1626() {
		if (this.anIntArray275 == null) {
			return this.anInt2295 != -1 || this.anIntArray269 != null;
		}
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray275.length; local30++) {
			if (this.anIntArray275[local30] != -1) {
				@Pc(46) Class2_Sub1_Sub13 local46 = Static2.method2072(this.anIntArray275[local30]);
				if (local46.anInt2295 != -1 || local46.anIntArray269 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BLclient!wd;)V")
	public void method1627(@OriginalArg(1) Class2_Sub12 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1399();
			if (local15 == 0) {
				return;
			}
			this.method1631(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZIIIIII)Lclient!fd;")
	public Class2_Sub1_Sub4_Sub1 method1629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) long local16;
		if (this.anIntArray272 == null) {
			local16 = (this.anInt2317 << 10) + arg1;
		} else {
			local16 = (arg4 << 3) + (this.anInt2317 << 10) + arg1;
		}
		@Pc(41) Class2_Sub1_Sub4_Sub1 local41 = (Class2_Sub1_Sub4_Sub1) Static103.aClass22_33.method711(local16);
		if (local41 == null) {
			local41 = this.method1634(arg4, arg1, false, !this.aBoolean97);
			if (local41 == null) {
				return null;
			}
			Static103.aClass22_33.method712(local41, local16);
		}
		if (this.aBoolean101 || this.aBoolean97) {
			local41 = new Class2_Sub1_Sub4_Sub1(local41, this.aBoolean101, this.aBoolean97);
		}
		if (this.aBoolean101) {
			@Pc(94) int local94 = (arg0 + arg2 + arg3 + arg5) / 4;
			for (@Pc(96) int local96 = 0; local96 < local41.anInt862; local96++) {
				@Pc(103) int local103 = local41.anIntArray74[local96];
				@Pc(108) int local108 = local41.anIntArray82[local96];
				@Pc(121) int local121 = (local103 + 64) * (arg2 - arg3) / 128 + arg3;
				@Pc(135) int local135 = arg5 + (arg0 - arg5) * (local103 + 64) / 128;
				@Pc(148) int local148 = (local135 - local121) * (local108 + 64) / 128 + local121;
				local41.anIntArray92[local96] += local148 - local94;
			}
		}
		return local41;
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(B)Lclient!r;")
	public Class2_Sub1_Sub13 method1630() {
		@Pc(6) int local6 = -1;
		if (this.anInt2290 != -1) {
			local6 = Static4.method133(this.anInt2290);
		} else if (this.anInt2307 != -1) {
			local6 = Static4.anIntArray14[this.anInt2307];
		}
		return local6 < 0 || this.anIntArray275.length <= local6 || this.anIntArray275[local6] == -1 ? null : Static2.method2072(this.anIntArray275[local6]);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!wd;II)V")
	private void method1631(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(2) int arg1) {
		@Pc(24) int local24;
		@Pc(53) int local53;
		if (arg1 == 1) {
			local24 = arg0.method1399();
			if (local24 > 0) {
				if (this.anIntArray274 == null || Static101.aBoolean121) {
					this.anIntArray274 = new int[local24];
					this.anIntArray272 = new int[local24];
					for (local53 = 0; local53 < local24; local53++) {
						this.anIntArray274[local53] = arg0.method1366();
						this.anIntArray272[local53] = arg0.method1399();
					}
				} else {
					arg0.anInt1939 += local24 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass36_1077 = arg0.method1404();
		} else if (arg1 == 5) {
			local24 = arg0.method1399();
			if (local24 > 0) {
				if (this.anIntArray274 == null || Static101.aBoolean121) {
					this.anIntArray272 = null;
					this.anIntArray274 = new int[local24];
					for (local53 = 0; local53 < local24; local53++) {
						this.anIntArray274[local53] = arg0.method1366();
					}
				} else {
					arg0.anInt1939 += local24 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.anInt2326 = arg0.method1399();
		} else if (arg1 == 15) {
			this.anInt2288 = arg0.method1399();
		} else if (arg1 == 17) {
			this.aBoolean95 = false;
		} else if (arg1 == 18) {
			this.aBoolean103 = false;
		} else if (arg1 == 19) {
			this.anInt2303 = arg0.method1399();
		} else if (arg1 == 21) {
			this.aBoolean101 = true;
		} else if (arg1 == 22) {
			this.aBoolean97 = true;
		} else if (arg1 == 23) {
			this.aBoolean96 = true;
		} else if (arg1 == 24) {
			this.anInt2300 = arg0.method1366();
			if (this.anInt2300 == 65535) {
				this.anInt2300 = -1;
			}
		} else if (arg1 == 28) {
			this.anInt2302 = arg0.method1399();
		} else if (arg1 == 29) {
			this.anInt2319 = arg0.method1406();
		} else if (arg1 == 39) {
			this.anInt2325 = arg0.method1406() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass36Array39[arg1 - 30] = arg0.method1404();
			if (this.aClass36Array39[arg1 - 30].method1024(Static59.aClass36_761)) {
				this.aClass36Array39[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local24 = arg0.method1399();
			this.anIntArray273 = new int[local24];
			this.anIntArray271 = new int[local24];
			for (local53 = 0; local53 < local24; local53++) {
				this.anIntArray273[local53] = arg0.method1366();
				this.anIntArray271[local53] = arg0.method1366();
			}
		} else if (arg1 == 60) {
			this.anInt2292 = arg0.method1366();
		} else if (arg1 == 62) {
			this.aBoolean102 = true;
		} else if (arg1 == 64) {
			this.aBoolean98 = false;
		} else if (arg1 == 65) {
			this.anInt2299 = arg0.method1366();
		} else if (arg1 == 66) {
			this.anInt2321 = arg0.method1366();
		} else if (arg1 == 67) {
			this.anInt2313 = arg0.method1366();
		} else if (arg1 == 68) {
			this.anInt2296 = arg0.method1366();
		} else if (arg1 == 69) {
			this.anInt2304 = arg0.method1399();
		} else if (arg1 == 70) {
			this.anInt2294 = arg0.method1385();
		} else if (arg1 == 71) {
			this.anInt2308 = arg0.method1385();
		} else if (arg1 == 72) {
			this.anInt2327 = arg0.method1385();
		} else if (arg1 == 73) {
			this.aBoolean94 = true;
		} else if (arg1 == 74) {
			this.aBoolean99 = true;
		} else if (arg1 == 75) {
			this.anInt2314 = arg0.method1399();
		} else if (arg1 == 77) {
			this.anInt2290 = arg0.method1366();
			if (this.anInt2290 == 65535) {
				this.anInt2290 = -1;
			}
			this.anInt2307 = arg0.method1366();
			if (this.anInt2307 == 65535) {
				this.anInt2307 = -1;
			}
			local24 = arg0.method1399();
			this.anIntArray275 = new int[local24 + 1];
			for (local53 = 0; local53 <= local24; local53++) {
				this.anIntArray275[local53] = arg0.method1366();
				if (this.anIntArray275[local53] == 65535) {
					this.anIntArray275[local53] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.anInt2295 = arg0.method1366();
			this.anInt2301 = arg0.method1399();
		} else if (arg1 == 79) {
			this.anInt2291 = arg0.method1366();
			this.anInt2322 = arg0.method1366();
			this.anInt2301 = arg0.method1399();
			local24 = arg0.method1399();
			this.anIntArray269 = new int[local24];
			for (local53 = 0; local53 < local24; local53++) {
				this.anIntArray269[local53] = arg0.method1366();
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)Z")
	public boolean method1632(@OriginalArg(0) int arg0) {
		if (this.anIntArray272 != null) {
			for (@Pc(59) int local59 = 0; local59 < this.anIntArray272.length; local59++) {
				if (this.anIntArray272[local59] == arg0) {
					return Static117.aClass3_19.method934(this.anIntArray274[local59] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray274 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(28) boolean local28 = true;
			for (@Pc(30) int local30 = 0; local30 < this.anIntArray274.length; local30++) {
				local28 &= Static117.aClass3_19.method934(this.anIntArray274[local30] & 0xFFFF, 0);
			}
			return local28;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(B)Z")
	public boolean method1633() {
		if (this.anIntArray274 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray274.length; local14++) {
			local12 &= Static117.aClass3_19.method934(this.anIntArray274[local14] & 0xFFFF, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIZZ)Lclient!fd;")
	private Class2_Sub1_Sub4_Sub1 method1634(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(3) Class2_Sub1_Sub4_Sub1 local3 = null;
		@Pc(30) boolean local30;
		@Pc(34) int local34;
		@Pc(36) int local36;
		@Pc(42) int local42;
		if (this.anIntArray272 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.anIntArray274 == null) {
				return null;
			}
			local30 = this.aBoolean102 ^ arg1 > 3;
			local34 = this.anIntArray274.length;
			for (local36 = 0; local36 < local34; local36++) {
				local42 = this.anIntArray274[local36];
				if (local30) {
					local42 += 65536;
				}
				local3 = (Class2_Sub1_Sub4_Sub1) Static55.aClass22_37.method711((long) local42);
				if (local3 == null) {
					local3 = Static30.method669(Static117.aClass3_19, local42 & 0xFFFF);
					if (local3 == null) {
						return null;
					}
					if (local30) {
						local3.method682();
					}
					Static55.aClass22_37.method712(local3, (long) local42);
				}
				if (local34 > 1) {
					Static33.aClass2_Sub1_Sub4_Sub1Array2[local36] = local3;
				}
			}
			if (local34 > 1) {
				local3 = new Class2_Sub1_Sub4_Sub1(Static33.aClass2_Sub1_Sub4_Sub1Array2, local34);
			}
		} else {
			@Pc(103) int local103 = -1;
			for (local34 = 0; local34 < this.anIntArray272.length; local34++) {
				if (arg0 == this.anIntArray272[local34]) {
					local103 = local34;
					break;
				}
			}
			if (local103 == -1) {
				return null;
			}
			@Pc(146) boolean local146 = arg1 > 3 ^ this.aBoolean102;
			local36 = this.anIntArray274[local103];
			if (local146) {
				local36 += 65536;
			}
			local3 = (Class2_Sub1_Sub4_Sub1) Static55.aClass22_37.method711((long) local36);
			if (local3 == null) {
				local3 = Static30.method669(Static117.aClass3_19, local36 & 0xFFFF);
				if (local3 == null) {
					return null;
				}
				if (local146) {
					local3.method682();
				}
				Static55.aClass22_37.method712(local3, (long) local36);
			}
		}
		if (this.anInt2299 == 128 && this.anInt2321 == 128 && this.anInt2313 == 128) {
			local30 = false;
		} else {
			local30 = true;
		}
		@Pc(223) boolean local223;
		if (this.anInt2294 == 0 && this.anInt2308 == 0 && this.anInt2327 == 0) {
			local223 = false;
		} else {
			local223 = true;
		}
		@Pc(248) Class2_Sub1_Sub4_Sub1 local248 = new Class2_Sub1_Sub4_Sub1(local3, arg1 == 0 && !local30 && !local223, this.anIntArray273 == null, true);
		@Pc(252) int local252 = arg1 & 0x3;
		if (local252 == 1) {
			local248.method684();
		} else if (local252 == 2) {
			local248.method658();
		} else if (local252 == 3) {
			local248.method661();
		}
		if (this.anIntArray273 != null) {
			for (local42 = 0; local42 < this.anIntArray273.length; local42++) {
				local248.method674(this.anIntArray273[local42], this.anIntArray271[local42]);
			}
		}
		if (local30) {
			local248.method665(this.anInt2299, this.anInt2321, this.anInt2313);
		}
		if (local223) {
			local248.method677(this.anInt2294, this.anInt2308, this.anInt2327);
		}
		if (arg2) {
			local248.method681();
		}
		local248.method655(this.anInt2319 + 64, this.anInt2325 * 5 + 768, -50, -10, -50, arg3);
		return local248;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!s;IIIIII)Lclient!fd;")
	public Class2_Sub1_Sub4_Sub1 method1635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub14 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(17) long local17;
		if (this.anIntArray272 == null) {
			local17 = arg5 + (this.anInt2317 << 10);
		} else {
			local17 = (arg7 << 3) + ((this.anInt2317 << 10) + arg5);
		}
		@Pc(37) Class2_Sub1_Sub4_Sub1 local37 = (Class2_Sub1_Sub4_Sub1) Static118.aClass22_40.method711(local17);
		if (local37 == null) {
			local37 = this.method1634(arg7, arg5, true, true);
			if (local37 == null) {
				return null;
			}
			Static118.aClass22_40.method712(local37, local17);
		}
		if (arg2 == null && !this.aBoolean101) {
			return local37;
		}
		if (arg2 == null) {
			local37 = local37.method657(true);
		} else {
			local37 = arg2.method1687(local37, arg5, arg3);
		}
		if (this.aBoolean101) {
			@Pc(92) int local92 = (arg0 + arg4 + arg1 + arg6) / 4;
			for (@Pc(94) int local94 = 0; local94 < local37.anInt862; local94++) {
				@Pc(101) int local101 = local37.anIntArray74[local94];
				@Pc(106) int local106 = local37.anIntArray82[local94];
				@Pc(120) int local120 = arg4 + (arg1 - arg4) * (local101 + 64) / 128;
				@Pc(134) int local134 = arg6 + (local101 + 64) * (-arg6 + arg0) / 128;
				@Pc(148) int local148 = local120 + (local106 + 64) * (-local120 + local134) / 128;
				local37.anIntArray92[local94] += local148 - local92;
			}
		}
		return local37;
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(B)V")
	public void method1637() {
		if (this.anInt2303 == -1) {
			this.anInt2303 = 0;
			if (this.anIntArray274 != null && (this.anIntArray272 == null || this.anIntArray272[0] == 10)) {
				this.anInt2303 = 1;
			}
			for (@Pc(30) int local30 = 0; local30 < 5; local30++) {
				if (this.aClass36Array39[local30] != null) {
					this.anInt2303 = 1;
				}
			}
		}
		if (this.anInt2314 == -1) {
			this.anInt2314 = this.aBoolean95 ? 1 : 0;
		}
	}
}
