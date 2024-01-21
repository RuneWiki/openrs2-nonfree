import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class2_Sub4_Sub12 extends Class2_Sub4 {

	@OriginalMember(owner = "client!kb", name = "L", descriptor = "[I")
	public int[] anIntArray217;

	@OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
	public int anInt2201;

	@OriginalMember(owner = "client!kb", name = "V", descriptor = "[I")
	public int[] anIntArray218;

	@OriginalMember(owner = "client!kb", name = "fb", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!kb", name = "ob", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!kb", name = "ub", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!kb", name = "vb", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!kb", name = "wb", descriptor = "I")
	private int anInt2224;

	@OriginalMember(owner = "client!kb", name = "W", descriptor = "I")
	public int anInt2207 = 0;

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
	private int anInt2195 = -1;

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
	private int anInt2198 = -1;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
	private int anInt2193 = -1;

	@OriginalMember(owner = "client!kb", name = "ab", descriptor = "I")
	private int anInt2209 = 128;

	@OriginalMember(owner = "client!kb", name = "Z", descriptor = "I")
	private int anInt2208 = 0;

	@OriginalMember(owner = "client!kb", name = "kb", descriptor = "I")
	private int anInt2216 = -1;

	@OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
	public int anInt2202 = -1;

	@OriginalMember(owner = "client!kb", name = "db", descriptor = "Z")
	public boolean aBoolean109 = false;

	@OriginalMember(owner = "client!kb", name = "pb", descriptor = "I")
	public int anInt2220 = -1;

	@OriginalMember(owner = "client!kb", name = "nb", descriptor = "I")
	private int anInt2219 = 0;

	@OriginalMember(owner = "client!kb", name = "T", descriptor = "I")
	public int anInt2205 = -1;

	@OriginalMember(owner = "client!kb", name = "sb", descriptor = "[Lclient!gg;")
	public Class28[] aClass28Array32 = new Class28[] { null, null, Static96.aClass28_1421, null, null };

	@OriginalMember(owner = "client!kb", name = "mb", descriptor = "I")
	private int anInt2218 = 0;

	@OriginalMember(owner = "client!kb", name = "cb", descriptor = "I")
	public int anInt2211 = 0;

	@OriginalMember(owner = "client!kb", name = "yb", descriptor = "I")
	private int anInt2225 = 128;

	@OriginalMember(owner = "client!kb", name = "Y", descriptor = "Lclient!gg;")
	public Class28 aClass28_1344 = Static56.aClass28_854;

	@OriginalMember(owner = "client!kb", name = "Bb", descriptor = "I")
	public int anInt2227 = 1;

	@OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
	public int anInt2204 = -1;

	@OriginalMember(owner = "client!kb", name = "gb", descriptor = "I")
	private int anInt2213 = 0;

	@OriginalMember(owner = "client!kb", name = "Eb", descriptor = "Z")
	public boolean aBoolean110 = false;

	@OriginalMember(owner = "client!kb", name = "jb", descriptor = "[Lclient!gg;")
	public Class28[] aClass28Array31 = new Class28[] { null, null, null, null, Static128.aClass28_1771 };

	@OriginalMember(owner = "client!kb", name = "Hb", descriptor = "I")
	public int anInt2232 = 0;

	@OriginalMember(owner = "client!kb", name = "Cb", descriptor = "I")
	public int anInt2228 = 0;

	@OriginalMember(owner = "client!kb", name = "Gb", descriptor = "I")
	private int anInt2231 = 128;

	@OriginalMember(owner = "client!kb", name = "hb", descriptor = "I")
	public int anInt2214 = 0;

	@OriginalMember(owner = "client!kb", name = "Nb", descriptor = "I")
	private int anInt2238 = -1;

	@OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
	public int anInt2210 = 2000;

	@OriginalMember(owner = "client!kb", name = "Jb", descriptor = "I")
	private int anInt2234 = -1;

	@OriginalMember(owner = "client!kb", name = "Mb", descriptor = "I")
	public int anInt2237 = 0;

	@OriginalMember(owner = "client!kb", name = "Fb", descriptor = "I")
	public int anInt2230 = 0;

	@OriginalMember(owner = "client!kb", name = "Pb", descriptor = "I")
	private int anInt2240 = -1;

	@OriginalMember(owner = "client!kb", name = "Ob", descriptor = "I")
	private int anInt2239 = -1;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!ah;BI)Lclient!df;")
	public Class2_Sub4_Sub1_Sub3 method1557(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (this.anIntArray218 != null && arg2 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (arg2 >= this.anIntArray217[local15] && this.anIntArray217[local15] != 0) {
					local13 = this.anIntArray218[local15];
				}
			}
			if (local13 != -1) {
				return Static58.method1034(local13).method1557(arg0, arg1, 1);
			}
		}
		@Pc(65) Class2_Sub4_Sub1_Sub3 local65 = (Class2_Sub4_Sub1_Sub3) Static118.aClass14_204.method603((long) this.anInt2201);
		if (local65 == null) {
			@Pc(73) Class2_Sub4_Sub1_Sub5 local73 = Static86.method1530(Static5.aClass40_1, this.anInt2224);
			if (local73 == null) {
				return null;
			}
			@Pc(82) int local82;
			if (this.aShortArray29 != null) {
				for (local82 = 0; local82 < this.aShortArray29.length; local82++) {
					local73.method1531(this.aShortArray29[local82], this.aShortArray28[local82]);
				}
			}
			if (this.aShortArray30 != null) {
				for (local82 = 0; local82 < this.aShortArray30.length; local82++) {
					local73.method1537(this.aShortArray30[local82], this.aShortArray27[local82]);
				}
			}
			local65 = local73.method1544(this.anInt2218 + 64, this.anInt2208 + 768, -50, -10, -50, false);
			if (this.anInt2231 != 128 || this.anInt2225 != 128 || this.anInt2209 != 128) {
				local65.method1189(this.anInt2231, this.anInt2225, this.anInt2209);
			}
			Static118.aClass14_204.method607((long) this.anInt2201, local65);
		}
		if (arg1 != null) {
			local65 = arg1.method311(arg0, local65);
		}
		return local65;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!ab;ZI)V")
	private void method1558(@OriginalArg(0) Class2_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2224 = arg0.method1680();
		} else if (arg1 == 2) {
			this.aClass28_1344 = arg0.method1662();
		} else if (arg1 == 4) {
			this.anInt2210 = arg0.method1680();
		} else if (arg1 == 5) {
			this.anInt2230 = arg0.method1680();
		} else if (arg1 == 6) {
			this.anInt2214 = arg0.method1680();
		} else if (arg1 == 7) {
			this.anInt2232 = arg0.method1680();
			if (this.anInt2232 > 32767) {
				this.anInt2232 -= 65536;
			}
		} else if (arg1 == 8) {
			this.anInt2207 = arg0.method1680();
			if (this.anInt2207 > 32767) {
				this.anInt2207 -= 65536;
			}
		} else if (arg1 == 11) {
			this.anInt2237 = 1;
		} else if (arg1 == 12) {
			this.anInt2227 = arg0.method1690();
		} else if (arg1 == 16) {
			this.aBoolean110 = true;
		} else if (arg1 == 23) {
			this.anInt2220 = arg0.method1680();
			this.anInt2219 = arg0.method1698();
		} else if (arg1 == 24) {
			this.anInt2238 = arg0.method1680();
		} else if (arg1 == 25) {
			this.anInt2202 = arg0.method1680();
			this.anInt2213 = arg0.method1698();
		} else if (arg1 == 26) {
			this.anInt2240 = arg0.method1680();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass28Array32[arg1 - 30] = arg0.method1662();
			if (this.aClass28Array32[arg1 - 30].method1140(Static90.aClass28_1388)) {
				this.aClass28Array32[arg1 - 30] = null;
			}
		} else if (arg1 >= 35 && arg1 < 40) {
			this.aClass28Array31[arg1 - 35] = arg0.method1662();
		} else {
			@Pc(141) int local141;
			@Pc(151) int local151;
			if (arg1 == 40) {
				local141 = arg0.method1698();
				this.aShortArray28 = new short[local141];
				this.aShortArray29 = new short[local141];
				for (local151 = 0; local151 < local141; local151++) {
					this.aShortArray29[local151] = (short) arg0.method1680();
					this.aShortArray28[local151] = (short) arg0.method1680();
				}
			} else if (arg1 == 41) {
				local141 = arg0.method1698();
				this.aShortArray30 = new short[local141];
				this.aShortArray27 = new short[local141];
				for (local151 = 0; local151 < local141; local151++) {
					this.aShortArray30[local151] = (short) arg0.method1680();
					this.aShortArray27[local151] = (short) arg0.method1680();
				}
			} else if (arg1 == 65) {
				this.aBoolean109 = true;
			} else if (arg1 == 78) {
				this.anInt2216 = arg0.method1680();
			} else if (arg1 == 79) {
				this.anInt2239 = arg0.method1680();
			} else if (arg1 == 90) {
				this.anInt2234 = arg0.method1680();
			} else if (arg1 == 91) {
				this.anInt2195 = arg0.method1680();
			} else if (arg1 == 92) {
				this.anInt2198 = arg0.method1680();
			} else if (arg1 == 93) {
				this.anInt2193 = arg0.method1680();
			} else if (arg1 == 95) {
				this.anInt2211 = arg0.method1680();
			} else if (arg1 == 97) {
				this.anInt2205 = arg0.method1680();
			} else if (arg1 == 98) {
				this.anInt2204 = arg0.method1680();
			} else if (arg1 >= 100 && arg1 < 110) {
				if (this.anIntArray218 == null) {
					this.anIntArray217 = new int[10];
					this.anIntArray218 = new int[10];
				}
				this.anIntArray218[arg1 - 100] = arg0.method1680();
				this.anIntArray217[arg1 - 100] = arg0.method1680();
			} else if (arg1 == 110) {
				this.anInt2231 = arg0.method1680();
			} else if (arg1 == 111) {
				this.anInt2225 = arg0.method1680();
			} else if (arg1 == 112) {
				this.anInt2209 = arg0.method1680();
			} else if (arg1 == 113) {
				this.anInt2218 = arg0.method1707();
			} else if (arg1 == 114) {
				this.anInt2208 = arg0.method1707() * 5;
			} else if (arg1 == 115) {
				this.anInt2228 = arg0.method1698();
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)Z")
	public boolean method1559(@OriginalArg(1) boolean arg0) {
		@Pc(12) int local12 = this.anInt2234;
		@Pc(15) int local15 = this.anInt2198;
		if (arg0) {
			local12 = this.anInt2195;
			local15 = this.anInt2193;
		}
		if (local12 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static5.aClass40_1.method1783(local12, 0)) {
			local30 = false;
		}
		if (local15 != -1 && !Static5.aClass40_1.method1783(local15, 0)) {
			local30 = false;
		}
		return local30;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)Lclient!kb;")
	public Class2_Sub4_Sub12 method1561(@OriginalArg(1) int arg0) {
		if (this.anIntArray218 != null && arg0 > 1) {
			@Pc(21) int local21 = -1;
			for (@Pc(23) int local23 = 0; local23 < 10; local23++) {
				if (arg0 >= this.anIntArray217[local23] && this.anIntArray217[local23] != 0) {
					local21 = this.anIntArray218[local23];
				}
			}
			if (local21 != -1) {
				return Static58.method1034(local21);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)Lclient!ha;")
	public Class2_Sub4_Sub1_Sub3_Sub1 method1562() {
		@Pc(11) Class2_Sub4_Sub1_Sub5 local11 = Static86.method1530(Static5.aClass40_1, this.anInt2224);
		if (local11 == null) {
			return null;
		}
		@Pc(20) int local20;
		if (this.aShortArray29 != null) {
			for (local20 = 0; local20 < this.aShortArray29.length; local20++) {
				local11.method1531(this.aShortArray29[local20], this.aShortArray28[local20]);
			}
		}
		if (this.aShortArray30 != null) {
			for (local20 = 0; local20 < this.aShortArray30.length; local20++) {
				local11.method1537(this.aShortArray30[local20], this.aShortArray27[local20]);
			}
		}
		@Pc(84) Class2_Sub4_Sub1_Sub3_Sub1 local84 = local11.method1546(this.anInt2218 + 64, this.anInt2208 + 768);
		local84.aBoolean90 = true;
		if (this.anInt2231 != 128 || this.anInt2225 != 128 || this.anInt2209 != 128) {
			local84.method1189(this.anInt2231, this.anInt2225, this.anInt2209);
		}
		return local84;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BZ)Lclient!ka;")
	public Class2_Sub4_Sub1_Sub5 method1565(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt2220;
		@Pc(11) int local11 = this.anInt2216;
		@Pc(14) int local14 = this.anInt2238;
		if (arg0) {
			local8 = this.anInt2202;
			local11 = this.anInt2239;
			local14 = this.anInt2240;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(36) Class2_Sub4_Sub1_Sub5 local36 = Static86.method1530(Static5.aClass40_1, local8);
		if (local14 != -1) {
			@Pc(44) Class2_Sub4_Sub1_Sub5 local44 = Static86.method1530(Static5.aClass40_1, local14);
			if (local11 == -1) {
				@Pc(87) Class2_Sub4_Sub1_Sub5[] local87 = new Class2_Sub4_Sub1_Sub5[] { local36, local44 };
				local36 = new Class2_Sub4_Sub1_Sub5(local87, 2);
			} else {
				@Pc(53) Class2_Sub4_Sub1_Sub5 local53 = Static86.method1530(Static5.aClass40_1, local11);
				@Pc(68) Class2_Sub4_Sub1_Sub5[] local68 = new Class2_Sub4_Sub1_Sub5[] { local36, local44, local53 };
				local36 = new Class2_Sub4_Sub1_Sub5(local68, 3);
			}
		}
		if (!arg0 && this.anInt2219 != 0) {
			local36.method1548(0, this.anInt2219, 0);
		}
		if (arg0 && this.anInt2213 != 0) {
			local36.method1548(0, this.anInt2213, 0);
		}
		@Pc(128) int local128;
		if (this.aShortArray29 != null) {
			for (local128 = 0; local128 < this.aShortArray29.length; local128++) {
				local36.method1531(this.aShortArray29[local128], this.aShortArray28[local128]);
			}
		}
		if (this.aShortArray30 != null) {
			for (local128 = 0; local128 < this.aShortArray30.length; local128++) {
				local36.method1537(this.aShortArray30[local128], this.aShortArray27[local128]);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!ab;)V")
	public void method1566(@OriginalArg(1) Class2_Sub2 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1698();
			if (local5 == 0) {
				return;
			}
			this.method1558(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZLclient!kb;Lclient!kb;)V")
	public void method1567(@OriginalArg(1) Class2_Sub4_Sub12 arg0, @OriginalArg(2) Class2_Sub4_Sub12 arg1) {
		this.anInt2214 = arg0.anInt2214;
		this.anInt2207 = arg0.anInt2207;
		this.aShortArray30 = arg0.aShortArray30;
		this.anInt2232 = arg0.anInt2232;
		this.anInt2230 = arg0.anInt2230;
		this.anInt2224 = arg0.anInt2224;
		this.anInt2211 = arg0.anInt2211;
		this.aClass28_1344 = arg1.aClass28_1344;
		this.aShortArray27 = arg0.aShortArray27;
		this.aShortArray29 = arg0.aShortArray29;
		this.anInt2227 = arg1.anInt2227;
		this.aBoolean110 = arg1.aBoolean110;
		this.anInt2210 = arg0.anInt2210;
		this.anInt2237 = 1;
		this.aShortArray28 = arg0.aShortArray28;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(IZ)Z")
	public boolean method1568(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt2220;
		@Pc(9) int local9 = this.anInt2238;
		@Pc(12) int local12 = this.anInt2216;
		if (arg0) {
			local12 = this.anInt2239;
			local6 = this.anInt2202;
			local9 = this.anInt2240;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(31) boolean local31 = true;
		if (!Static5.aClass40_1.method1783(local6, 0)) {
			local31 = false;
		}
		if (local9 != -1 && !Static5.aClass40_1.method1783(local9, 0)) {
			local31 = false;
		}
		if (local12 != -1 && !Static5.aClass40_1.method1783(local12, 0)) {
			local31 = false;
		}
		return local31;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(Z)V")
	public void method1571() {
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZB)Lclient!ka;")
	public Class2_Sub4_Sub1_Sub5 method1572(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.anInt2198;
		@Pc(11) int local11 = this.anInt2234;
		if (arg0) {
			local11 = this.anInt2195;
			local8 = this.anInt2193;
		}
		if (local11 == -1) {
			return null;
		}
		@Pc(30) Class2_Sub4_Sub1_Sub5 local30 = Static86.method1530(Static5.aClass40_1, local11);
		if (local8 != -1) {
			@Pc(44) Class2_Sub4_Sub1_Sub5 local44 = Static86.method1530(Static5.aClass40_1, local8);
			@Pc(55) Class2_Sub4_Sub1_Sub5[] local55 = new Class2_Sub4_Sub1_Sub5[] { local30, local44 };
			local30 = new Class2_Sub4_Sub1_Sub5(local55, 2);
		}
		@Pc(66) int local66;
		if (this.aShortArray29 != null) {
			for (local66 = 0; local66 < this.aShortArray29.length; local66++) {
				local30.method1531(this.aShortArray29[local66], this.aShortArray28[local66]);
			}
		}
		if (this.aShortArray30 != null) {
			for (local66 = 0; local66 < this.aShortArray30.length; local66++) {
				local30.method1537(this.aShortArray30[local66], this.aShortArray27[local66]);
			}
		}
		return local30;
	}
}
