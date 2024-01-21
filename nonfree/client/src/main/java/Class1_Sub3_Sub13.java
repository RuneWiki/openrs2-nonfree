import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class1_Sub3_Sub13 extends Class1_Sub3 {

	@OriginalMember(owner = "client!kf", name = "O", descriptor = "[I")
	private int[] anIntArray168;

	@OriginalMember(owner = "client!kf", name = "P", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!kf", name = "W", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!kf", name = "jb", descriptor = "[I")
	public int[] anIntArray169;

	@OriginalMember(owner = "client!kf", name = "mb", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!kf", name = "nb", descriptor = "[I")
	private int[] anIntArray171;

	@OriginalMember(owner = "client!kf", name = "qb", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!kf", name = "Bb", descriptor = "I")
	public int anInt2268;

	@OriginalMember(owner = "client!kf", name = "L", descriptor = "S")
	public short aShort3 = 0;

	@OriginalMember(owner = "client!kf", name = "Q", descriptor = "I")
	private int anInt2247 = 128;

	@OriginalMember(owner = "client!kf", name = "R", descriptor = "I")
	public int anInt2248 = 32;

	@OriginalMember(owner = "client!kf", name = "gb", descriptor = "Z")
	public boolean aBoolean131 = true;

	@OriginalMember(owner = "client!kf", name = "eb", descriptor = "I")
	public int anInt2256 = 1;

	@OriginalMember(owner = "client!kf", name = "bb", descriptor = "I")
	private int anInt2254 = 0;

	@OriginalMember(owner = "client!kf", name = "tb", descriptor = "Z")
	public boolean aBoolean132 = false;

	@OriginalMember(owner = "client!kf", name = "cb", descriptor = "I")
	private int anInt2255 = -1;

	@OriginalMember(owner = "client!kf", name = "ub", descriptor = "I")
	public int anInt2262 = -1;

	@OriginalMember(owner = "client!kf", name = "ab", descriptor = "I")
	public int anInt2253 = -1;

	@OriginalMember(owner = "client!kf", name = "xb", descriptor = "I")
	private int anInt2265 = 128;

	@OriginalMember(owner = "client!kf", name = "yb", descriptor = "Z")
	public boolean aBoolean133 = true;

	@OriginalMember(owner = "client!kf", name = "S", descriptor = "S")
	public short aShort4 = 0;

	@OriginalMember(owner = "client!kf", name = "fb", descriptor = "I")
	private int anInt2257 = -1;

	@OriginalMember(owner = "client!kf", name = "wb", descriptor = "I")
	private int anInt2264 = 0;

	@OriginalMember(owner = "client!kf", name = "ib", descriptor = "I")
	public int anInt2258 = -1;

	@OriginalMember(owner = "client!kf", name = "V", descriptor = "I")
	public int anInt2251 = -1;

	@OriginalMember(owner = "client!kf", name = "vb", descriptor = "I")
	public int anInt2263 = -1;

	@OriginalMember(owner = "client!kf", name = "U", descriptor = "I")
	public int anInt2250 = -1;

	@OriginalMember(owner = "client!kf", name = "hb", descriptor = "[Lclient!vd;")
	public final Class92[] aClass92Array15 = new Class92[5];

	@OriginalMember(owner = "client!kf", name = "Hb", descriptor = "I")
	public int anInt2272 = -1;

	@OriginalMember(owner = "client!kf", name = "Gb", descriptor = "I")
	public int anInt2271 = -1;

	@OriginalMember(owner = "client!kf", name = "Z", descriptor = "Z")
	public boolean aBoolean130 = true;

	@OriginalMember(owner = "client!kf", name = "rb", descriptor = "I")
	public int anInt2260 = -1;

	@OriginalMember(owner = "client!kf", name = "Ib", descriptor = "Lclient!vd;")
	public Class92 aClass92_1017 = Static8.aClass92_73;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBLclient!re;)Lclient!ee;")
	public Class8_Sub5 method1575(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3_Sub20 arg1) {
		if (this.anIntArray169 != null) {
			@Pc(12) Class1_Sub3_Sub13 local12 = this.method1581();
			return local12 == null ? null : local12.method1575(arg0, arg1);
		} else if (this.anIntArray171 == null) {
			return null;
		} else {
			@Pc(35) Class8_Sub5 local35 = (Class8_Sub5) Static133.aClass77_8.method2259((long) this.anInt2268);
			if (local35 == null) {
				@Pc(39) boolean local39 = false;
				for (@Pc(41) int local41 = 0; local41 < this.anIntArray171.length; local41++) {
					if (!Static116.aClass3_22.method3247(0, this.anIntArray171[local41])) {
						local39 = true;
					}
				}
				if (local39) {
					return null;
				}
				@Pc(73) Class8_Sub7[] local73 = new Class8_Sub7[this.anIntArray171.length];
				for (@Pc(75) int local75 = 0; local75 < this.anIntArray171.length; local75++) {
					local73[local75] = Static135.method1997(Static116.aClass3_22, this.anIntArray171[local75]);
				}
				@Pc(105) Class8_Sub7 local105;
				if (local73.length == 1) {
					local105 = local73[0];
				} else {
					local105 = new Class8_Sub7(local73, local73.length);
				}
				@Pc(119) int local119;
				if (this.aShortArray15 != null) {
					for (local119 = 0; local119 < this.aShortArray15.length; local119++) {
						local105.method2006(this.aShortArray15[local119], this.aShortArray18[local119]);
					}
				}
				if (this.aShortArray16 != null) {
					for (local119 = 0; local119 < this.aShortArray16.length; local119++) {
						local105.method2010(this.aShortArray16[local119], this.aShortArray17[local119]);
					}
				}
				local35 = local105.method2007(64, 768, -50, -10, -50);
				Static133.aClass77_8.method2257(local35, (long) this.anInt2268);
			}
			if (arg1 != null) {
				local35 = arg1.method2555(arg0, local35);
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLclient!ka;)V")
	public void method1576(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3010();
			if (local5 == 0) {
				return;
			}
			this.method1579(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
	public void method1577() {
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!ka;I)V")
	private void method1579(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12;
		@Pc(18) int local18;
		if (arg1 == 1) {
			local12 = arg0.method3010();
			this.anIntArray168 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray168[local18] = arg0.method3023();
			}
		} else if (arg1 == 2) {
			this.aClass92_1017 = arg0.method3022();
		} else if (arg1 == 12) {
			this.anInt2256 = arg0.method3010();
		} else if (arg1 == 13) {
			this.anInt2263 = arg0.method3023();
		} else if (arg1 == 14) {
			this.anInt2258 = arg0.method3023();
		} else if (arg1 == 15) {
			this.anInt2250 = arg0.method3023();
		} else if (arg1 == 16) {
			this.anInt2253 = arg0.method3023();
		} else if (arg1 == 17) {
			this.anInt2258 = arg0.method3023();
			this.anInt2260 = arg0.method3023();
			this.anInt2251 = arg0.method3023();
			this.anInt2262 = arg0.method3023();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass92Array15[arg1 - 30] = arg0.method3022();
			if (this.aClass92Array15[arg1 - 30].method3241(Static42.aClass92_427)) {
				this.aClass92Array15[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local12 = arg0.method3010();
			this.aShortArray18 = new short[local12];
			this.aShortArray15 = new short[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.aShortArray15[local18] = (short) arg0.method3023();
				this.aShortArray18[local18] = (short) arg0.method3023();
			}
		} else if (arg1 == 41) {
			local12 = arg0.method3010();
			this.aShortArray16 = new short[local12];
			this.aShortArray17 = new short[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.aShortArray16[local18] = (short) arg0.method3023();
				this.aShortArray17[local18] = (short) arg0.method3023();
			}
		} else if (arg1 == 60) {
			local12 = arg0.method3010();
			this.anIntArray171 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray171[local18] = arg0.method3023();
			}
		} else if (arg1 == 93) {
			this.aBoolean130 = false;
		} else if (arg1 == 95) {
			this.anInt2271 = arg0.method3023();
		} else if (arg1 == 97) {
			this.anInt2247 = arg0.method3023();
		} else if (arg1 == 98) {
			this.anInt2265 = arg0.method3023();
		} else if (arg1 == 99) {
			this.aBoolean132 = true;
		} else if (arg1 == 100) {
			this.anInt2254 = arg0.method3009();
		} else if (arg1 == 101) {
			this.anInt2264 = arg0.method3009() * 5;
		} else if (arg1 == 102) {
			this.anInt2272 = arg0.method3023();
		} else if (arg1 == 103) {
			this.anInt2248 = arg0.method3023();
		} else if (arg1 == 106) {
			this.anInt2255 = arg0.method3023();
			if (this.anInt2255 == 65535) {
				this.anInt2255 = -1;
			}
			this.anInt2257 = arg0.method3023();
			if (this.anInt2257 == 65535) {
				this.anInt2257 = -1;
			}
			local12 = arg0.method3010();
			this.anIntArray169 = new int[local12 + 1];
			for (local18 = 0; local18 <= local12; local18++) {
				this.anIntArray169[local18] = arg0.method3023();
				if (this.anIntArray169[local18] == 65535) {
					this.anIntArray169[local18] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean131 = false;
		} else if (arg1 == 109) {
			this.aBoolean133 = false;
		} else if (arg1 != 111) {
			if (arg1 == 113) {
				arg0.method3023();
				arg0.method3023();
			} else if (arg1 == 114) {
				arg0.method3009();
				arg0.method3009();
			} else if (arg1 == 115) {
				this.aShort3 = (short) (arg0.method3010() * 4);
				this.aShort4 = (short) (arg0.method3010() * 4);
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!re;Lclient!re;IB)Lclient!ee;")
	public Class8_Sub5 method1580(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub20 arg1, @OriginalArg(2) Class1_Sub3_Sub20 arg2, @OriginalArg(3) int arg3) {
		if (this.anIntArray169 != null) {
			@Pc(12) Class1_Sub3_Sub13 local12 = this.method1581();
			return local12 == null ? null : local12.method1580(arg0, arg1, arg2, arg3);
		}
		@Pc(38) Class8_Sub5 local38 = (Class8_Sub5) Static106.aClass77_6.method2259((long) this.anInt2268);
		if (local38 == null) {
			@Pc(42) boolean local42 = false;
			for (@Pc(44) int local44 = 0; local44 < this.anIntArray168.length; local44++) {
				if (!Static116.aClass3_22.method3247(0, this.anIntArray168[local44])) {
					local42 = true;
				}
			}
			if (local42) {
				return null;
			}
			@Pc(72) Class8_Sub7[] local72 = new Class8_Sub7[this.anIntArray168.length];
			for (@Pc(74) int local74 = 0; local74 < this.anIntArray168.length; local74++) {
				local72[local74] = Static135.method1997(Static116.aClass3_22, this.anIntArray168[local74]);
			}
			@Pc(102) Class8_Sub7 local102;
			if (local72.length == 1) {
				local102 = local72[0];
			} else {
				local102 = new Class8_Sub7(local72, local72.length);
			}
			@Pc(116) int local116;
			if (this.aShortArray15 != null) {
				for (local116 = 0; local116 < this.aShortArray15.length; local116++) {
					local102.method2006(this.aShortArray15[local116], this.aShortArray18[local116]);
				}
			}
			if (this.aShortArray16 != null) {
				for (local116 = 0; local116 < this.aShortArray16.length; local116++) {
					local102.method2010(this.aShortArray16[local116], this.aShortArray17[local116]);
				}
			}
			local38 = local102.method2007(this.anInt2254 + 64, this.anInt2264 + 850, -30, -50, -30);
			Static106.aClass77_6.method2257(local38, (long) this.anInt2268);
		}
		@Pc(198) Class8_Sub5 local198;
		if (arg1 != null && arg2 != null) {
			local198 = arg1.method2547(arg3, local38, arg2, arg0);
		} else if (arg1 != null) {
			local198 = arg1.method2556(arg3, local38);
		} else if (arg2 == null) {
			local198 = local38.method2052(true);
		} else {
			local198 = arg2.method2556(arg0, local38);
		}
		if (this.anInt2247 != 128 || this.anInt2265 != 128) {
			local198.method2038(this.anInt2247, this.anInt2265, this.anInt2247);
		}
		return local198;
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)Lclient!kf;")
	public Class1_Sub3_Sub13 method1581() {
		@Pc(5) int local5 = -1;
		if (this.anInt2255 != -1) {
			local5 = Static83.method1267(this.anInt2255);
		} else if (this.anInt2257 != -1) {
			local5 = Static84.anIntArray156[this.anInt2257];
		}
		return local5 < 0 || local5 >= this.anIntArray169.length || this.anIntArray169[local5] == -1 ? null : Static27.method494(this.anIntArray169[local5]);
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(B)Z")
	public boolean method1582() {
		if (this.anIntArray169 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt2255 != -1) {
			local10 = Static83.method1267(this.anInt2255);
		} else if (this.anInt2257 != -1) {
			local10 = Static84.anIntArray156[this.anInt2257];
		}
		return local10 >= 0 && local10 < this.anIntArray169.length && this.anIntArray169[local10] != -1;
	}
}
