import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class3_Sub1_Sub15 extends Class3_Sub1 {

	@OriginalMember(owner = "client!r", name = "O", descriptor = "[I")
	public int[] anIntArray259;

	@OriginalMember(owner = "client!r", name = "gb", descriptor = "I")
	public int anInt2318;

	@OriginalMember(owner = "client!r", name = "ob", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!r", name = "Gb", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!r", name = "Mb", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!r", name = "Nb", descriptor = "[I")
	public int[] anIntArray263;

	@OriginalMember(owner = "client!r", name = "Yb", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!r", name = "cb", descriptor = "Z")
	public boolean aBoolean112 = true;

	@OriginalMember(owner = "client!r", name = "hb", descriptor = "Lclient!ae;")
	public Class5 aClass5_1058 = Static65.aClass5_1116;

	@OriginalMember(owner = "client!r", name = "rb", descriptor = "I")
	public int anInt2324 = -1;

	@OriginalMember(owner = "client!r", name = "eb", descriptor = "Z")
	public boolean aBoolean113 = false;

	@OriginalMember(owner = "client!r", name = "kb", descriptor = "I")
	private int anInt2321 = -1;

	@OriginalMember(owner = "client!r", name = "Ab", descriptor = "I")
	public int anInt2331 = 1;

	@OriginalMember(owner = "client!r", name = "mb", descriptor = "I")
	public int anInt2322 = 16;

	@OriginalMember(owner = "client!r", name = "S", descriptor = "I")
	private int anInt2309 = 0;

	@OriginalMember(owner = "client!r", name = "Eb", descriptor = "I")
	private int anInt2332 = 128;

	@OriginalMember(owner = "client!r", name = "Fb", descriptor = "Z")
	public boolean aBoolean117 = false;

	@OriginalMember(owner = "client!r", name = "pb", descriptor = "I")
	public int anInt2323 = -1;

	@OriginalMember(owner = "client!r", name = "wb", descriptor = "I")
	public int anInt2329 = -1;

	@OriginalMember(owner = "client!r", name = "fb", descriptor = "I")
	public int anInt2317 = 0;

	@OriginalMember(owner = "client!r", name = "Ib", descriptor = "I")
	public int anInt2334 = 0;

	@OriginalMember(owner = "client!r", name = "Lb", descriptor = "Z")
	public boolean aBoolean118 = true;

	@OriginalMember(owner = "client!r", name = "Db", descriptor = "Z")
	public boolean aBoolean116 = false;

	@OriginalMember(owner = "client!r", name = "ub", descriptor = "I")
	private int anInt2327 = 128;

	@OriginalMember(owner = "client!r", name = "Bb", descriptor = "Z")
	public boolean aBoolean114 = true;

	@OriginalMember(owner = "client!r", name = "Kb", descriptor = "I")
	public int anInt2335 = 0;

	@OriginalMember(owner = "client!r", name = "Hb", descriptor = "I")
	private int anInt2333 = 0;

	@OriginalMember(owner = "client!r", name = "Qb", descriptor = "[Lclient!ae;")
	public final Class5[] aClass5Array16 = new Class5[5];

	@OriginalMember(owner = "client!r", name = "tb", descriptor = "I")
	private int anInt2326 = 128;

	@OriginalMember(owner = "client!r", name = "U", descriptor = "I")
	public int anInt2311 = 0;

	@OriginalMember(owner = "client!r", name = "Rb", descriptor = "I")
	private int anInt2337 = 0;

	@OriginalMember(owner = "client!r", name = "Ob", descriptor = "I")
	public int anInt2336 = -1;

	@OriginalMember(owner = "client!r", name = "W", descriptor = "I")
	public int anInt2312 = 1;

	@OriginalMember(owner = "client!r", name = "Cb", descriptor = "Z")
	private boolean aBoolean115 = false;

	@OriginalMember(owner = "client!r", name = "Ub", descriptor = "I")
	public int anInt2339 = -1;

	@OriginalMember(owner = "client!r", name = "Vb", descriptor = "I")
	private int anInt2340 = -1;

	@OriginalMember(owner = "client!r", name = "Wb", descriptor = "Z")
	public boolean aBoolean119 = false;

	@OriginalMember(owner = "client!r", name = "Zb", descriptor = "Z")
	private boolean aBoolean120 = false;

	@OriginalMember(owner = "client!r", name = "ac", descriptor = "I")
	public int anInt2342 = -1;

	@OriginalMember(owner = "client!r", name = "cc", descriptor = "I")
	private int anInt2343 = 0;

	@OriginalMember(owner = "client!r", name = "jb", descriptor = "I")
	private int anInt2320 = 0;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(I)Z")
	public boolean method1520() {
		if (this.anIntArray261 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray261.length; local14++) {
			local12 &= Static2.aClass11_6.method1872(0, this.anIntArray261[local14] & 0xFFFF);
		}
		return local12;
	}

	@OriginalMember(owner = "client!r", name = "h", descriptor = "(I)Lclient!r;")
	public Class3_Sub1_Sub15 method1522() {
		@Pc(9) int local9 = -1;
		if (this.anInt2321 != -1) {
			local9 = Static73.method1216(this.anInt2321);
		} else if (this.anInt2340 != -1) {
			local9 = Static110.anIntArray373[this.anInt2340];
		}
		return local9 < 0 || local9 >= this.anIntArray263.length || this.anIntArray263[local9] == -1 ? null : Static72.method1211(this.anIntArray263[local9]);
	}

	@OriginalMember(owner = "client!r", name = "i", descriptor = "(I)Z")
	public boolean method1523() {
		if (this.anIntArray263 == null) {
			return this.anInt2329 != -1 || this.anIntArray259 != null;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anIntArray263.length; local27++) {
			if (this.anIntArray263[local27] != -1) {
				@Pc(42) Class3_Sub1_Sub15 local42 = Static72.method1211(this.anIntArray263[local27]);
				if (local42.anInt2329 != -1 || local42.anIntArray259 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLclient!m;I)V")
	private void method1524(@OriginalArg(1) Class3_Sub6 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8;
		@Pc(38) int local38;
		if (arg1 == 1) {
			local8 = arg0.method1587();
			if (local8 > 0) {
				if (this.anIntArray261 == null || Static64.aBoolean79) {
					this.anIntArray261 = new int[local8];
					this.anIntArray262 = new int[local8];
					for (local38 = 0; local38 < local8; local38++) {
						this.anIntArray261[local38] = arg0.method1603();
						this.anIntArray262[local38] = arg0.method1587();
					}
				} else {
					arg0.anInt2416 += local8 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass5_1058 = arg0.method1627();
		} else if (arg1 == 5) {
			local8 = arg0.method1587();
			if (local8 > 0) {
				if (this.anIntArray261 == null || Static64.aBoolean79) {
					this.anIntArray262 = null;
					this.anIntArray261 = new int[local8];
					for (local38 = 0; local38 < local8; local38++) {
						this.anIntArray261[local38] = arg0.method1603();
					}
				} else {
					arg0.anInt2416 += local8 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.anInt2312 = arg0.method1587();
		} else if (arg1 == 15) {
			this.anInt2331 = arg0.method1587();
		} else if (arg1 == 17) {
			this.aBoolean112 = false;
		} else if (arg1 == 18) {
			this.aBoolean114 = false;
		} else if (arg1 == 19) {
			this.anInt2324 = arg0.method1587();
		} else if (arg1 == 21) {
			this.aBoolean116 = true;
		} else if (arg1 == 22) {
			this.aBoolean120 = true;
		} else if (arg1 == 23) {
			this.aBoolean113 = true;
		} else if (arg1 == 24) {
			this.anInt2323 = arg0.method1603();
			if (this.anInt2323 == 65535) {
				this.anInt2323 = -1;
			}
		} else if (arg1 == 28) {
			this.anInt2322 = arg0.method1587();
		} else if (arg1 == 29) {
			this.anInt2343 = arg0.method1605();
		} else if (arg1 == 39) {
			this.anInt2337 = arg0.method1605() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass5Array16[arg1 - 30] = arg0.method1627();
			if (this.aClass5Array16[arg1 - 30].method171(Static108.aClass5_1282)) {
				this.aClass5Array16[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local8 = arg0.method1587();
			this.anIntArray264 = new int[local8];
			this.anIntArray260 = new int[local8];
			for (local38 = 0; local38 < local8; local38++) {
				this.anIntArray260[local38] = arg0.method1603();
				this.anIntArray264[local38] = arg0.method1603();
			}
		} else if (arg1 == 60) {
			this.anInt2336 = arg0.method1603();
		} else if (arg1 == 62) {
			this.aBoolean115 = true;
		} else if (arg1 == 64) {
			this.aBoolean118 = false;
		} else if (arg1 == 65) {
			this.anInt2326 = arg0.method1603();
		} else if (arg1 == 66) {
			this.anInt2332 = arg0.method1603();
		} else if (arg1 == 67) {
			this.anInt2327 = arg0.method1603();
		} else if (arg1 == 68) {
			this.anInt2342 = arg0.method1603();
		} else if (arg1 == 69) {
			this.anInt2335 = arg0.method1587();
		} else if (arg1 == 70) {
			this.anInt2320 = arg0.method1612();
		} else if (arg1 == 71) {
			this.anInt2333 = arg0.method1612();
		} else if (arg1 == 72) {
			this.anInt2309 = arg0.method1612();
		} else if (arg1 == 73) {
			this.aBoolean119 = true;
		} else if (arg1 == 74) {
			this.aBoolean117 = true;
		} else if (arg1 == 75) {
			this.anInt2339 = arg0.method1587();
		} else if (arg1 == 77) {
			this.anInt2321 = arg0.method1603();
			if (this.anInt2321 == 65535) {
				this.anInt2321 = -1;
			}
			this.anInt2340 = arg0.method1603();
			if (this.anInt2340 == 65535) {
				this.anInt2340 = -1;
			}
			local8 = arg0.method1587();
			this.anIntArray263 = new int[local8 + 1];
			for (local38 = 0; local38 <= local8; local38++) {
				this.anIntArray263[local38] = arg0.method1603();
				if (this.anIntArray263[local38] == 65535) {
					this.anIntArray263[local38] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.anInt2329 = arg0.method1603();
			this.anInt2311 = arg0.method1587();
		} else if (arg1 == 79) {
			this.anInt2334 = arg0.method1603();
			this.anInt2317 = arg0.method1603();
			this.anInt2311 = arg0.method1587();
			local8 = arg0.method1587();
			this.anIntArray259 = new int[local8];
			for (local38 = 0; local38 < local8; local38++) {
				this.anIntArray259[local38] = arg0.method1603();
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IZZBI)Lclient!v;")
	private Class3_Sub1_Sub1_Sub6 method1525(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class3_Sub1_Sub1_Sub6 local7 = null;
		@Pc(36) boolean local36;
		@Pc(26) int local26;
		@Pc(38) int local38;
		@Pc(44) int local44;
		if (this.anIntArray262 == null) {
			if (arg3 != 10) {
				return null;
			}
			if (this.anIntArray261 == null) {
				return null;
			}
			local26 = this.anIntArray261.length;
			local36 = arg0 > 3 ^ this.aBoolean115;
			for (local38 = 0; local38 < local26; local38++) {
				local44 = this.anIntArray261[local38];
				if (local36) {
					local44 += 65536;
				}
				local7 = (Class3_Sub1_Sub1_Sub6) Static70.aClass9_17.method282((long) local44);
				if (local7 == null) {
					local7 = Static107.method1799(Static2.aClass11_6, local44 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local36) {
						local7.method1801();
					}
					Static70.aClass9_17.method284(local7, (long) local44);
				}
				if (local26 > 1) {
					Static42.aClass3_Sub1_Sub1_Sub6Array1[local38] = local7;
				}
			}
			if (local26 > 1) {
				local7 = new Class3_Sub1_Sub1_Sub6(Static42.aClass3_Sub1_Sub1_Sub6Array1, local26);
			}
		} else {
			@Pc(111) int local111 = -1;
			for (local26 = 0; local26 < this.anIntArray262.length; local26++) {
				if (arg3 == this.anIntArray262[local26]) {
					local111 = local26;
					break;
				}
			}
			if (local111 == -1) {
				return null;
			}
			local38 = this.anIntArray261[local111];
			@Pc(158) boolean local158 = arg0 > 3 ^ this.aBoolean115;
			if (local158) {
				local38 += 65536;
			}
			local7 = (Class3_Sub1_Sub1_Sub6) Static70.aClass9_17.method282((long) local38);
			if (local7 == null) {
				local7 = Static107.method1799(Static2.aClass11_6, local38 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local158) {
					local7.method1801();
				}
				Static70.aClass9_17.method284(local7, (long) local38);
			}
		}
		@Pc(205) boolean local205;
		if (this.anInt2320 == 0 && this.anInt2333 == 0 && this.anInt2309 == 0) {
			local205 = false;
		} else {
			local205 = true;
		}
		if (this.anInt2326 == 128 && this.anInt2332 == 128 && this.anInt2327 == 128) {
			local36 = false;
		} else {
			local36 = true;
		}
		@Pc(257) Class3_Sub1_Sub1_Sub6 local257 = new Class3_Sub1_Sub1_Sub6(local7, arg0 == 0 && !local36 && !local205, this.anIntArray260 == null, true);
		@Pc(261) int local261 = arg0 & 0x3;
		if (local261 == 1) {
			local257.method1813();
		} else if (local261 == 2) {
			local257.method1820();
		} else if (local261 == 3) {
			local257.method1809();
		}
		if (this.anIntArray260 != null) {
			for (local44 = 0; local44 < this.anIntArray260.length; local44++) {
				local257.method1821(this.anIntArray260[local44], this.anIntArray264[local44]);
			}
		}
		if (local36) {
			local257.method1817(this.anInt2326, this.anInt2332, this.anInt2327);
		}
		if (local205) {
			local257.method1812(this.anInt2320, this.anInt2333, this.anInt2309);
		}
		if (arg1) {
			local257.method1811();
		}
		local257.method1806(this.anInt2343 + 64, this.anInt2337 * 5 + 768, -50, -10, -50, arg2);
		return local257;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIILclient!ne;I)Lclient!v;")
	public Class3_Sub1_Sub1_Sub6 method1526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class3_Sub1_Sub11 arg6, @OriginalArg(8) int arg7) {
		@Pc(13) long local13;
		if (this.anIntArray262 == null) {
			local13 = (this.anInt2318 << 10) + arg5;
		} else {
			local13 = arg5 + (this.anInt2318 << 10) + (arg3 << 3);
		}
		@Pc(44) Class3_Sub1_Sub1_Sub6 local44 = (Class3_Sub1_Sub1_Sub6) Static44.aClass9_14.method282(local13);
		if (local44 == null) {
			local44 = this.method1525(arg5, true, true, arg3);
			if (local44 == null) {
				return null;
			}
			Static44.aClass9_14.method284(local44, local13);
		}
		if (arg6 == null && !this.aBoolean116) {
			return local44;
		}
		if (arg6 == null) {
			local44 = local44.method1825(true);
		} else {
			local44 = arg6.method1260(local44, arg2, arg5);
		}
		if (this.aBoolean116) {
			@Pc(98) int local98 = (arg0 + arg4 + arg7 + arg1) / 4;
			for (@Pc(100) int local100 = 0; local100 < local44.anInt2771; local100++) {
				@Pc(107) int local107 = local44.anIntArray334[local100];
				@Pc(112) int local112 = local44.anIntArray324[local100];
				@Pc(125) int local125 = arg0 + (local107 + 64) * (arg1 + -arg0) / 128;
				@Pc(138) int local138 = (local107 + 64) * (-arg7 + arg4) / 128 + arg7;
				@Pc(150) int local150 = (local125 - local138) * (local112 + 64) / 128 + local138;
				local44.anIntArray322[local100] += local150 - local98;
			}
		}
		return local44;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(Z)V")
	public void method1528() {
		if (this.anInt2324 == -1) {
			this.anInt2324 = 0;
			if (this.anIntArray261 != null && (this.anIntArray262 == null || this.anIntArray262[0] == 10)) {
				this.anInt2324 = 1;
			}
			for (@Pc(37) int local37 = 0; local37 < 5; local37++) {
				if (this.aClass5Array16[local37] != null) {
					this.anInt2324 = 1;
				}
			}
		}
		if (this.anInt2339 == -1) {
			this.anInt2339 = this.aBoolean112 ? 1 : 0;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)Z")
	public boolean method1529(@OriginalArg(1) int arg0) {
		if (this.anIntArray262 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray262.length; local18++) {
				if (arg0 == this.anIntArray262[local18]) {
					return Static2.aClass11_6.method1872(0, this.anIntArray261[local18] & 0xFFFF);
				}
			}
			return true;
		} else if (this.anIntArray261 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(63) boolean local63 = true;
			for (@Pc(65) int local65 = 0; local65 < this.anIntArray261.length; local65++) {
				local63 &= Static2.aClass11_6.method1872(0, this.anIntArray261[local65] & 0xFFFF);
			}
			return local63;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!m;I)V")
	public void method1530(@OriginalArg(0) Class3_Sub6 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method1587();
			if (local17 == 0) {
				return;
			}
			this.method1524(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)Lclient!v;")
	public Class3_Sub1_Sub1_Sub6 method1531(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) long local16;
		if (this.anIntArray262 == null) {
			local16 = (this.anInt2318 << 10) + arg2;
		} else {
			local16 = (arg0 << 3) + (this.anInt2318 << 10) + arg2;
		}
		@Pc(36) Class3_Sub1_Sub1_Sub6 local36 = (Class3_Sub1_Sub1_Sub6) Static55.aClass9_15.method282(local16);
		if (local36 == null) {
			local36 = this.method1525(arg2, false, !this.aBoolean120, arg0);
			if (local36 == null) {
				return null;
			}
			Static55.aClass9_15.method284(local36, local16);
		}
		if (this.aBoolean116 || this.aBoolean120) {
			local36 = new Class3_Sub1_Sub1_Sub6(local36, this.aBoolean116, this.aBoolean120);
		}
		if (this.aBoolean116) {
			@Pc(89) int local89 = (arg1 + arg5 + arg4 + arg3) / 4;
			for (@Pc(91) int local91 = 0; local91 < local36.anInt2771; local91++) {
				@Pc(98) int local98 = local36.anIntArray334[local91];
				@Pc(103) int local103 = local36.anIntArray324[local91];
				@Pc(116) int local116 = (local98 + 64) * (arg5 - arg1) / 128 + arg1;
				@Pc(128) int local128 = (local98 + 64) * (arg4 - arg3) / 128 + arg3;
				@Pc(140) int local140 = local116 + (local128 - local116) * (local103 + 64) / 128;
				local36.anIntArray322[local91] += local140 - local89;
			}
		}
		return local36;
	}
}
