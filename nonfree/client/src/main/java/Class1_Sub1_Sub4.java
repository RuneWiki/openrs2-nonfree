import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cb", name = "Z", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!cb", name = "ab", descriptor = "[I")
	public int[] anIntArray53;

	@OriginalMember(owner = "client!cb", name = "lb", descriptor = "[I")
	public int[] anIntArray54;

	@OriginalMember(owner = "client!cb", name = "xb", descriptor = "[I")
	private int[] anIntArray55;

	@OriginalMember(owner = "client!cb", name = "Ib", descriptor = "[I")
	private int[] anIntArray56;

	@OriginalMember(owner = "client!cb", name = "bc", descriptor = "[I")
	private int[] anIntArray57;

	@OriginalMember(owner = "client!cb", name = "hc", descriptor = "I")
	public int anInt330;

	@OriginalMember(owner = "client!cb", name = "db", descriptor = "Z")
	public boolean aBoolean12 = false;

	@OriginalMember(owner = "client!cb", name = "kb", descriptor = "I")
	public int anInt298 = -1;

	@OriginalMember(owner = "client!cb", name = "rb", descriptor = "I")
	private int anInt303 = 0;

	@OriginalMember(owner = "client!cb", name = "qb", descriptor = "I")
	public int anInt302 = 0;

	@OriginalMember(owner = "client!cb", name = "hb", descriptor = "I")
	public int anInt296 = 0;

	@OriginalMember(owner = "client!cb", name = "Y", descriptor = "Lclient!gd;")
	public Class23 aClass23_232 = Static31.aClass23_526;

	@OriginalMember(owner = "client!cb", name = "yb", descriptor = "I")
	public int anInt307 = -1;

	@OriginalMember(owner = "client!cb", name = "Hb", descriptor = "Z")
	public boolean aBoolean15 = false;

	@OriginalMember(owner = "client!cb", name = "sb", descriptor = "Z")
	public boolean aBoolean13 = false;

	@OriginalMember(owner = "client!cb", name = "Db", descriptor = "Z")
	public boolean aBoolean14 = true;

	@OriginalMember(owner = "client!cb", name = "Fb", descriptor = "I")
	public int anInt313 = -1;

	@OriginalMember(owner = "client!cb", name = "Pb", descriptor = "I")
	public int anInt318 = -1;

	@OriginalMember(owner = "client!cb", name = "Ab", descriptor = "I")
	private int anInt309 = 128;

	@OriginalMember(owner = "client!cb", name = "bb", descriptor = "[Lclient!gd;")
	public final Class23[] aClass23Array7 = new Class23[5];

	@OriginalMember(owner = "client!cb", name = "ub", descriptor = "I")
	public int anInt305 = 1;

	@OriginalMember(owner = "client!cb", name = "gb", descriptor = "I")
	public int anInt295 = -1;

	@OriginalMember(owner = "client!cb", name = "Rb", descriptor = "I")
	private int anInt319 = -1;

	@OriginalMember(owner = "client!cb", name = "pb", descriptor = "I")
	public int anInt301 = 16;

	@OriginalMember(owner = "client!cb", name = "Tb", descriptor = "I")
	private int anInt320 = 0;

	@OriginalMember(owner = "client!cb", name = "nb", descriptor = "I")
	public int anInt299 = 1;

	@OriginalMember(owner = "client!cb", name = "Sb", descriptor = "Z")
	public boolean aBoolean18 = false;

	@OriginalMember(owner = "client!cb", name = "Bb", descriptor = "I")
	private int anInt310 = 128;

	@OriginalMember(owner = "client!cb", name = "Wb", descriptor = "Z")
	public boolean aBoolean19 = true;

	@OriginalMember(owner = "client!cb", name = "cb", descriptor = "I")
	private int anInt292 = 128;

	@OriginalMember(owner = "client!cb", name = "Qb", descriptor = "Z")
	private boolean aBoolean17 = false;

	@OriginalMember(owner = "client!cb", name = "Zb", descriptor = "I")
	public int anInt325 = 0;

	@OriginalMember(owner = "client!cb", name = "Xb", descriptor = "I")
	public int anInt323 = 0;

	@OriginalMember(owner = "client!cb", name = "fc", descriptor = "Z")
	private boolean aBoolean20 = false;

	@OriginalMember(owner = "client!cb", name = "Ub", descriptor = "I")
	private int anInt321 = 0;

	@OriginalMember(owner = "client!cb", name = "ec", descriptor = "I")
	public int anInt328 = -1;

	@OriginalMember(owner = "client!cb", name = "fb", descriptor = "I")
	private int anInt294 = -1;

	@OriginalMember(owner = "client!cb", name = "dc", descriptor = "I")
	private int anInt327 = 0;

	@OriginalMember(owner = "client!cb", name = "Vb", descriptor = "I")
	private int anInt322 = 0;

	@OriginalMember(owner = "client!cb", name = "ic", descriptor = "Z")
	public boolean aBoolean21 = true;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!rc;B)V")
	public void method170(@OriginalArg(0) Class1_Sub5 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method716();
			if (local11 == 0) {
				return;
			}
			this.method175(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)Z")
	public boolean method171() {
		if (this.anIntArray55 == null) {
			return true;
		}
		@Pc(10) boolean local10 = true;
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray55.length; local18++) {
			local10 &= Static98.aClass55_40.method1886(this.anIntArray55[local18] & 0xFFFF, 0);
		}
		return local10;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIII)Lclient!qb;")
	public Class1_Sub1_Sub2_Sub6 method173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(20) long local20;
		if (this.anIntArray52 == null) {
			local20 = arg5 + (this.anInt330 << 10);
		} else {
			local20 = arg5 + (this.anInt330 << 10) + (arg1 << 3);
		}
		@Pc(39) Class1_Sub1_Sub2_Sub6 local39 = (Class1_Sub1_Sub2_Sub6) Static1.aClass5_3.method98(local20);
		if (local39 == null) {
			local39 = this.method181(false, !this.aBoolean20, arg1, arg5);
			if (local39 == null) {
				return null;
			}
			Static1.aClass5_3.method97(local39, local20);
		}
		if (this.aBoolean12 || this.aBoolean20) {
			local39 = new Class1_Sub1_Sub2_Sub6(local39, this.aBoolean12, this.aBoolean20);
		}
		if (this.aBoolean12) {
			@Pc(92) int local92 = (arg0 + arg2 + arg3 + arg4) / 4;
			for (@Pc(94) int local94 = 0; local94 < local39.anInt2299; local94++) {
				@Pc(100) int local100 = local39.anIntArray290[local94];
				@Pc(113) int local113 = (arg3 - arg2) * (local100 + 64) / 128 + arg2;
				@Pc(118) int local118 = local39.anIntArray282[local94];
				@Pc(130) int local130 = (arg0 - arg4) * (local100 + 64) / 128 + arg4;
				@Pc(143) int local143 = (local130 - local113) * (local118 + 64) / 128 + local113;
				local39.anIntArray279[local94] += local143 - local92;
			}
		}
		return local39;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!rc;B)V")
	private void method175(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5 arg1) {
		@Pc(10) int local10;
		@Pc(39) int local39;
		if (arg0 == 1) {
			local10 = arg1.method716();
			if (local10 > 0) {
				if (this.anIntArray55 == null || Static36.aBoolean67) {
					this.anIntArray55 = new int[local10];
					this.anIntArray52 = new int[local10];
					for (local39 = 0; local39 < local10; local39++) {
						this.anIntArray55[local39] = arg1.method715();
						this.anIntArray52[local39] = arg1.method716();
					}
				} else {
					arg1.anInt1266 += local10 * 3;
				}
			}
		} else if (arg0 == 2) {
			this.aClass23_232 = arg1.method683();
		} else if (arg0 == 5) {
			local10 = arg1.method716();
			if (local10 > 0) {
				if (this.anIntArray55 == null || Static36.aBoolean67) {
					this.anIntArray52 = null;
					this.anIntArray55 = new int[local10];
					for (local39 = 0; local39 < local10; local39++) {
						this.anIntArray55[local39] = arg1.method715();
					}
				} else {
					arg1.anInt1266 += local10 * 2;
				}
			}
		} else if (arg0 == 14) {
			this.anInt299 = arg1.method716();
		} else if (arg0 == 15) {
			this.anInt305 = arg1.method716();
		} else if (arg0 == 17) {
			this.aBoolean21 = false;
		} else if (arg0 == 18) {
			this.aBoolean14 = false;
		} else if (arg0 == 19) {
			this.anInt298 = arg1.method716();
		} else if (arg0 == 21) {
			this.aBoolean12 = true;
		} else if (arg0 == 22) {
			this.aBoolean20 = true;
		} else if (arg0 == 23) {
			this.aBoolean13 = true;
		} else if (arg0 == 24) {
			this.anInt313 = arg1.method715();
			if (this.anInt313 == 65535) {
				this.anInt313 = -1;
			}
		} else if (arg0 == 28) {
			this.anInt301 = arg1.method716();
		} else if (arg0 == 29) {
			this.anInt320 = arg1.method699();
		} else if (arg0 == 39) {
			this.anInt321 = arg1.method699() * 5;
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass23Array7[arg0 - 30] = arg1.method683();
			if (this.aClass23Array7[arg0 - 30].method530(Static76.aClass23_1220)) {
				this.aClass23Array7[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local10 = arg1.method716();
			this.anIntArray57 = new int[local10];
			this.anIntArray56 = new int[local10];
			for (local39 = 0; local39 < local10; local39++) {
				this.anIntArray56[local39] = arg1.method715();
				this.anIntArray57[local39] = arg1.method715();
			}
		} else if (arg0 == 60) {
			this.anInt328 = arg1.method715();
		} else if (arg0 == 62) {
			this.aBoolean17 = true;
		} else if (arg0 == 64) {
			this.aBoolean19 = false;
		} else if (arg0 == 65) {
			this.anInt309 = arg1.method715();
		} else if (arg0 == 66) {
			this.anInt310 = arg1.method715();
		} else if (arg0 == 67) {
			this.anInt292 = arg1.method715();
		} else if (arg0 == 68) {
			this.anInt307 = arg1.method715();
		} else if (arg0 == 69) {
			this.anInt325 = arg1.method716();
		} else if (arg0 == 70) {
			this.anInt322 = arg1.method691();
		} else if (arg0 == 71) {
			this.anInt327 = arg1.method691();
		} else if (arg0 == 72) {
			this.anInt303 = arg1.method691();
		} else if (arg0 == 73) {
			this.aBoolean18 = true;
		} else if (arg0 == 74) {
			this.aBoolean15 = true;
		} else if (arg0 == 75) {
			this.anInt318 = arg1.method716();
		} else if (arg0 == 77) {
			this.anInt319 = arg1.method715();
			if (this.anInt319 == 65535) {
				this.anInt319 = -1;
			}
			this.anInt294 = arg1.method715();
			if (this.anInt294 == 65535) {
				this.anInt294 = -1;
			}
			local10 = arg1.method716();
			this.anIntArray54 = new int[local10 + 1];
			for (local39 = 0; local39 <= local10; local39++) {
				this.anIntArray54[local39] = arg1.method715();
				if (this.anIntArray54[local39] == 65535) {
					this.anIntArray54[local39] = -1;
				}
			}
		} else if (arg0 == 78) {
			this.anInt295 = arg1.method715();
			this.anInt323 = arg1.method716();
		} else if (arg0 == 79) {
			this.anInt302 = arg1.method715();
			this.anInt296 = arg1.method715();
			this.anInt323 = arg1.method716();
			local10 = arg1.method716();
			this.anIntArray53 = new int[local10];
			for (local39 = 0; local39 < local10; local39++) {
				this.anIntArray53[local39] = arg1.method715();
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)Lclient!cb;")
	public Class1_Sub1_Sub4 method176() {
		@Pc(5) int local5 = -1;
		if (this.anInt319 != -1) {
			local5 = Static1.method44(this.anInt319);
		} else if (this.anInt294 != -1) {
			local5 = Static40.anIntArray164[this.anInt294];
		}
		return local5 < 0 || this.anIntArray54.length <= local5 || this.anIntArray54[local5] == -1 ? null : Static97.method1645(this.anIntArray54[local5]);
	}

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)V")
	public void method177() {
		if (this.anInt298 == -1) {
			this.anInt298 = 0;
			if (this.anIntArray55 != null && (this.anIntArray52 == null || this.anIntArray52[0] == 10)) {
				this.anInt298 = 1;
			}
			for (@Pc(45) int local45 = 0; local45 < 5; local45++) {
				if (this.aClass23Array7[local45] != null) {
					this.anInt298 = 1;
				}
			}
		}
		if (this.anInt318 == -1) {
			this.anInt318 = this.aBoolean21 ? 1 : 0;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIILclient!h;II)Lclient!qb;")
	public Class1_Sub1_Sub2_Sub6 method179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1_Sub1_Sub8 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(14) long local14;
		if (this.anIntArray52 == null) {
			local14 = arg2 + (this.anInt330 << 10);
		} else {
			local14 = arg2 + (this.anInt330 << 10) + (arg0 << 3);
		}
		@Pc(33) Class1_Sub1_Sub2_Sub6 local33 = (Class1_Sub1_Sub2_Sub6) Static42.aClass5_36.method98(local14);
		if (local33 == null) {
			local33 = this.method181(true, true, arg0, arg2);
			if (local33 == null) {
				return null;
			}
			Static42.aClass5_36.method97(local33, local14);
		}
		if (arg5 == null && !this.aBoolean12) {
			return local33;
		}
		if (arg5 == null) {
			local33 = local33.method1439(true);
		} else {
			local33 = arg5.method582(arg1, arg2, local33);
		}
		if (this.aBoolean12) {
			@Pc(94) int local94 = (arg6 + arg3 + arg4 + arg7) / 4;
			for (@Pc(96) int local96 = 0; local96 < local33.anInt2299; local96++) {
				@Pc(102) int local102 = local33.anIntArray282[local96];
				@Pc(107) int local107 = local33.anIntArray290[local96];
				@Pc(120) int local120 = arg4 + (local107 + 64) * (-arg4 + arg3) / 128;
				@Pc(133) int local133 = arg7 + (arg6 - arg7) * (local107 + 64) / 128;
				@Pc(146) int local146 = local120 + (local102 + 64) * (-local120 + local133) / 128;
				local33.anIntArray279[local96] += local146 - local94;
			}
		}
		return local33;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(Z)Z")
	public boolean method180() {
		if (this.anIntArray54 == null) {
			return this.anInt295 != -1 || this.anIntArray53 != null;
		}
		for (@Pc(31) int local31 = 0; local31 < this.anIntArray54.length; local31++) {
			if (this.anIntArray54[local31] != -1) {
				@Pc(45) Class1_Sub1_Sub4 local45 = Static97.method1645(this.anIntArray54[local31]);
				if (local45.anInt295 != -1 || local45.anIntArray53 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZZIBI)Lclient!qb;")
	private Class1_Sub1_Sub2_Sub6 method181(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Class1_Sub1_Sub2_Sub6 local5 = null;
		@Pc(36) boolean local36;
		@Pc(24) int local24;
		@Pc(38) int local38;
		@Pc(44) int local44;
		if (this.anIntArray52 == null) {
			if (arg2 != 10) {
				return null;
			}
			if (this.anIntArray55 == null) {
				return null;
			}
			local24 = this.anIntArray55.length;
			local36 = this.aBoolean17 ^ arg3 > 3;
			for (local38 = 0; local38 < local24; local38++) {
				local44 = this.anIntArray55[local38];
				if (local36) {
					local44 += 65536;
				}
				local5 = (Class1_Sub1_Sub2_Sub6) Static11.aClass5_9.method98((long) local44);
				if (local5 == null) {
					local5 = Static81.method1442(Static98.aClass55_40, local44 & 0xFFFF);
					if (local5 == null) {
						return null;
					}
					if (local36) {
						local5.method1433();
					}
					Static11.aClass5_9.method97(local5, (long) local44);
				}
				if (local24 > 1) {
					Static52.aClass1_Sub1_Sub2_Sub6Array1[local38] = local5;
				}
			}
			if (local24 > 1) {
				local5 = new Class1_Sub1_Sub2_Sub6(Static52.aClass1_Sub1_Sub2_Sub6Array1, local24);
			}
		} else {
			@Pc(109) int local109 = -1;
			for (local24 = 0; local24 < this.anIntArray52.length; local24++) {
				if (arg2 == this.anIntArray52[local24]) {
					local109 = local24;
					break;
				}
			}
			if (local109 == -1) {
				return null;
			}
			@Pc(148) boolean local148 = arg3 > 3 ^ this.aBoolean17;
			local38 = this.anIntArray55[local109];
			if (local148) {
				local38 += 65536;
			}
			local5 = (Class1_Sub1_Sub2_Sub6) Static11.aClass5_9.method98((long) local38);
			if (local5 == null) {
				local5 = Static81.method1442(Static98.aClass55_40, local38 & 0xFFFF);
				if (local5 == null) {
					return null;
				}
				if (local148) {
					local5.method1433();
				}
				Static11.aClass5_9.method97(local5, (long) local38);
			}
		}
		if (this.anInt309 == 128 && this.anInt310 == 128 && this.anInt292 == 128) {
			local36 = false;
		} else {
			local36 = true;
		}
		@Pc(224) boolean local224;
		if (this.anInt322 == 0 && this.anInt327 == 0 && this.anInt303 == 0) {
			local224 = false;
		} else {
			local224 = true;
		}
		@Pc(251) Class1_Sub1_Sub2_Sub6 local251 = new Class1_Sub1_Sub2_Sub6(local5, arg3 == 0 && !local36 && !local224, this.anIntArray56 == null, true);
		@Pc(255) int local255 = arg3 & 0x3;
		if (local255 == 1) {
			local251.method1450();
		} else if (local255 == 2) {
			local251.method1429();
		} else if (local255 == 3) {
			local251.method1444();
		}
		if (this.anIntArray56 != null) {
			for (local44 = 0; local44 < this.anIntArray56.length; local44++) {
				local251.method1427(this.anIntArray56[local44], this.anIntArray57[local44]);
			}
		}
		if (local36) {
			local251.method1428(this.anInt309, this.anInt310, this.anInt292);
		}
		if (local224) {
			local251.method1424(this.anInt322, this.anInt327, this.anInt303);
		}
		if (arg0) {
			local251.method1426();
		}
		local251.method1437(this.anInt320 + 64, this.anInt321 * 5 + 768, -50, -10, -50, arg1);
		return local251;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)Z")
	public boolean method182(@OriginalArg(0) int arg0) {
		if (this.anIntArray52 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray52.length; local14++) {
				if (this.anIntArray52[local14] == arg0) {
					return Static98.aClass55_40.method1886(this.anIntArray55[local14] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray55 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(58) boolean local58 = true;
			for (@Pc(60) int local60 = 0; local60 < this.anIntArray55.length; local60++) {
				local58 &= Static98.aClass55_40.method1886(this.anIntArray55[local60] & 0xFFFF, 0);
			}
			return local58;
		} else {
			return true;
		}
	}
}
