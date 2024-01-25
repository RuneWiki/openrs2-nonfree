import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nia")
public final class Class246 {

	@OriginalMember(owner = "client!nia", name = "f", descriptor = "[Z")
	private boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!nia", name = "i", descriptor = "Lclient!pf;")
	private Class275 aClass275_2;

	@OriginalMember(owner = "client!nia", name = "j", descriptor = "Lclient!r;")
	private Class14_Sub3_Sub14 aClass14_Sub3_Sub14_5;

	@OriginalMember(owner = "client!nia", name = "k", descriptor = "Lclient!ka;")
	private Class80 aClass80_6;

	@OriginalMember(owner = "client!nia", name = "t", descriptor = "I")
	private int anInt7312;

	@OriginalMember(owner = "client!nia", name = "C", descriptor = "Lclient!mi;")
	private Class232 aClass232_2;

	@OriginalMember(owner = "client!nia", name = "G", descriptor = "Lclient!cv;")
	public Class12_Sub4 aClass12_Sub4_6;

	@OriginalMember(owner = "client!nia", name = "K", descriptor = "I")
	private int anInt7325;

	@OriginalMember(owner = "client!nia", name = "L", descriptor = "I")
	private int anInt7326;

	@OriginalMember(owner = "client!nia", name = "M", descriptor = "I")
	private int anInt7327;

	@OriginalMember(owner = "client!nia", name = "u", descriptor = "I")
	private int anInt7313 = -1;

	@OriginalMember(owner = "client!nia", name = "n", descriptor = "Z")
	private boolean aBoolean506 = false;

	@OriginalMember(owner = "client!nia", name = "D", descriptor = "I")
	private int anInt7321 = -1;

	@OriginalMember(owner = "client!nia", name = "w", descriptor = "I")
	private int anInt7315 = -1;

	@OriginalMember(owner = "client!nia", name = "H", descriptor = "I")
	private int anInt7322 = 0;

	@OriginalMember(owner = "client!nia", name = "A", descriptor = "I")
	private int anInt7319 = 0;

	@OriginalMember(owner = "client!nia", name = "F", descriptor = "Z")
	private boolean aBoolean508 = false;

	@OriginalMember(owner = "client!nia", name = "m", descriptor = "I")
	public final int anInt7308;

	@OriginalMember(owner = "client!nia", name = "g", descriptor = "B")
	private final byte aByte113;

	@OriginalMember(owner = "client!nia", name = "o", descriptor = "I")
	public final int anInt7309;

	@OriginalMember(owner = "client!nia", name = "q", descriptor = "Lclient!je;")
	private final Class12_Sub2 aClass12_Sub2_18;

	@OriginalMember(owner = "client!nia", name = "v", descriptor = "I")
	public final int anInt7314;

	@OriginalMember(owner = "client!nia", name = "l", descriptor = "B")
	private final byte aByte114;

	@OriginalMember(owner = "client!nia", name = "p", descriptor = "Z")
	private final boolean aBoolean507;

	@OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(Lclient!ha;Lclient!kv;IIIILclient!je;ZI)V")
	public Class246(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class12_Sub2 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.anInt7308 = arg1.anInt6014;
		this.aBoolean506 = arg7;
		this.aByte113 = (byte) arg5;
		this.anInt7309 = arg3;
		this.aClass12_Sub2_18 = arg6;
		this.anInt7314 = arg2;
		this.aByte114 = (byte) arg4;
		this.aBoolean507 = arg0.method7904() && arg1.aBoolean415 && !this.aBoolean506;
		if (arg8 != -1) {
			this.aBoolean508 = true;
		}
		this.method5945(arg8);
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lclient!ha;B)V")
	public void method5939(@OriginalArg(0) Class137 arg0) {
		if (this.aClass14_Sub3_Sub14_5 != null) {
			Static76.method1427(this.aClass14_Sub3_Sub14_5, this.aByte113, this.aClass12_Sub2_18.anInt10998, this.aClass12_Sub2_18.anInt11002, this.aBooleanArray17);
			this.aClass14_Sub3_Sub14_5 = null;
			this.aBooleanArray17 = null;
		}
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(B)I")
	public int method5940() {
		return this.anInt7319;
	}

	@OriginalMember(owner = "client!nia", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass12_Sub4_6 != null) {
			this.aClass12_Sub4_6.method1614();
		}
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lclient!je;I)V")
	private void method5942(@OriginalArg(0) Class12_Sub2 arg0) {
		label80: while (true) {
			if (this.aClass275_2 == null) {
				if (this.aBoolean508) {
					return;
				}
				this.method5945(-1);
				if (this.aClass275_2 == null) {
					return;
				}
			}
			@Pc(32) int local32 = Static87.anInt1951 - this.anInt7327;
			if (local32 > 100 && this.aClass275_2.anInt7916 > 0) {
				@Pc(49) int local49 = this.aClass275_2.anIntArray598.length - this.aClass275_2.anInt7916;
				while (local49 > this.anInt7312 && this.aClass275_2.anIntArray599[this.anInt7312] < local32) {
					local32 -= this.aClass275_2.anIntArray599[this.anInt7312];
					this.anInt7312++;
				}
				if (local49 <= this.anInt7312) {
					@Pc(92) int local92 = 0;
					for (@Pc(94) int local94 = local49; local94 < this.aClass275_2.anIntArray598.length; local94++) {
						local92 += this.aClass275_2.anIntArray599[local94];
					}
					local32 %= local92;
				}
				this.anInt7326 = this.anInt7312 + 1;
				if (this.aClass275_2.anIntArray598.length <= this.anInt7326) {
					this.anInt7326 -= this.aClass275_2.anInt7916;
					if (this.anInt7326 < 0 || this.aClass275_2.anIntArray598.length <= this.anInt7326) {
						this.anInt7326 = -1;
					}
				}
			}
			while (this.aClass275_2.anIntArray599[this.anInt7312] < local32) {
				Static51.method1064(arg0, this.aClass275_2, this.anInt7312);
				local32 -= this.aClass275_2.anIntArray599[this.anInt7312];
				this.anInt7312++;
				if (this.anInt7312 >= this.aClass275_2.anIntArray598.length) {
					this.anInt7312 -= this.aClass275_2.anInt7916;
					if (this.anInt7312 < 0 || this.anInt7312 >= this.aClass275_2.anIntArray598.length) {
						this.aClass275_2 = null;
						continue label80;
					}
				}
				this.anInt7326 = this.anInt7312 + 1;
				if (this.aClass275_2.anIntArray598.length <= this.anInt7326) {
					this.anInt7326 -= this.aClass275_2.anInt7916;
					if (this.anInt7326 < 0 || this.aClass275_2.anIntArray598.length <= this.anInt7326) {
						this.anInt7326 = -1;
					}
				}
			}
			this.anInt7327 = Static87.anInt1951 - local32;
			this.anInt7325 = local32;
			return;
		}
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(II)V")
	public void method5943(@OriginalArg(0) int arg0) {
		this.aBoolean508 = true;
		this.method5945(arg0);
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(IILclient!ha;ZZ)Lclient!ka;")
	public Class80 method5944(@OriginalArg(1) int arg0, @OriginalArg(2) Class137 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(11) Class203 local11 = Static511.aClass13_2.method86(this.anInt7308);
		if (local11.anIntArray440 != null) {
			local11 = local11.method5007(Static595.aClass241_1);
		}
		if (local11 == null) {
			this.method5939(arg1);
			this.anInt7315 = -1;
			this.anInt7321 = -1;
			this.anInt7313 = -1;
			return null;
		}
		if (!this.aBoolean508 && local11.anInt6014 != this.anInt7313) {
			this.aClass80_6 = null;
			this.method5945(-1);
		}
		this.method5942(this.aClass12_Sub2_18);
		if (arg2) {
			@Pc(80) boolean local80 = arg2 & this.aBoolean507 & Static56.aClass14_Sub22_5.aClass21_Sub1_1.method459() != 0;
			arg2 = local80 & (this.anInt7315 != local11.anInt6014 || this.aClass275_2 != null && Static56.aClass14_Sub22_5.aClass21_Sub1_1.method459() >= 2 && (this.anInt7312 != this.anInt7321 || (this.aClass275_2.aBoolean541 || Static394.aBoolean505) && this.anInt7312 != this.anInt7326));
		}
		if (arg3 && !arg2) {
			this.anInt7313 = local11.anInt6014;
			return null;
		}
		if (arg2) {
			Static76.method1427(this.aClass14_Sub3_Sub14_5, this.aByte113, this.aClass12_Sub2_18.anInt10998, this.aClass12_Sub2_18.anInt11002, this.aBooleanArray17);
			this.anInt7321 = -1;
			this.anInt7315 = -1;
		}
		@Pc(156) Class51 local156 = Static576.aClass51Array3[this.aByte113];
		@Pc(172) Class51 local172;
		if (this.aBoolean506) {
			local172 = Static343.aClass51Array1[0];
		} else {
			local172 = this.aByte113 < 3 ? Static576.aClass51Array3[this.aByte113 + 1] : null;
		}
		@Pc(180) Class80 local180 = null;
		if (this.aClass275_2 != null) {
			if (arg2) {
				arg0 |= 0x40000;
			}
			local180 = local11.method5024(local156.method7866(this.aClass12_Sub2_18.anInt10998, this.aClass12_Sub2_18.anInt11002), this.anInt7314 == 11 ? this.anInt7309 + 4 : this.anInt7309, this.aClass12_Sub2_18.anInt11002, arg0, local172, this.anInt7314 == 11 ? 10 : this.anInt7314, local156, this.aClass12_Sub2_18.anInt10998, this.anInt7326, this.aClass232_2, this.anInt7325, this.anInt7312, arg1, this.aClass275_2);
			if (local180 == null) {
				this.aClass14_Sub3_Sub14_5 = null;
				this.anInt7319 = 0;
				this.aBooleanArray17 = null;
				this.anInt7322 = 0;
			} else {
				if (arg2) {
					if (this.aBooleanArray17 == null) {
						this.aBooleanArray17 = new boolean[4];
					}
					this.aClass14_Sub3_Sub14_5 = local180.ba(this.aClass14_Sub3_Sub14_5);
					Static79.method1495(this.aClass14_Sub3_Sub14_5, this.aByte113, this.aClass12_Sub2_18.anInt10998, this.aClass12_Sub2_18.anInt11002, this.aBooleanArray17);
					this.anInt7321 = this.anInt7312;
					this.anInt7315 = local11.anInt6014;
				}
				this.anInt7319 = local180.fa();
				this.anInt7322 = local180.ma();
			}
			this.aClass80_6 = null;
		} else if (this.aClass80_6 != null && arg0 == (arg0 & this.aClass80_6.ua()) && this.anInt7313 == local11.anInt6014) {
			local180 = this.aClass80_6;
		} else {
			if (this.aClass80_6 != null) {
				arg0 |= this.aClass80_6.ua();
			}
			@Pc(254) Class25 local254 = local11.method5008(this.anInt7314 == 11 ? 10 : this.anInt7314, arg0, this.aClass232_2, arg1, local172, local156, arg2, this.aClass12_Sub2_18.anInt10998, local156.method7866(this.aClass12_Sub2_18.anInt10998, this.aClass12_Sub2_18.anInt11002), this.aClass12_Sub2_18.anInt11002, this.anInt7314 == 11 ? this.anInt7309 + 4 : this.anInt7309);
			if (local254 == null) {
				this.aBooleanArray17 = null;
				this.anInt7322 = 0;
				this.aClass80_6 = null;
				this.aClass14_Sub3_Sub14_5 = null;
				this.anInt7319 = 0;
			} else {
				local180 = local254.aClass80_2;
				this.aClass80_6 = local254.aClass80_2;
				if (arg2) {
					this.aBooleanArray17 = null;
					this.aClass14_Sub3_Sub14_5 = local254.aClass14_Sub3_Sub14_2;
					Static79.method1495(this.aClass14_Sub3_Sub14_5, this.aByte113, this.aClass12_Sub2_18.anInt10998, this.aClass12_Sub2_18.anInt11002, (boolean[]) null);
					this.anInt7315 = local11.anInt6014;
					this.anInt7321 = -1;
				}
				this.anInt7319 = local180.fa();
				this.anInt7322 = local180.ma();
			}
		}
		this.anInt7313 = local11.anInt6014;
		return local180;
	}

	@OriginalMember(owner = "client!nia", name = "b", descriptor = "(II)V")
	private void method5945(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class203 local19 = Static511.aClass13_2.method86(this.anInt7308);
			@Pc(21) Class203 local21 = local19;
			if (local19.anIntArray440 != null) {
				local19 = local19.method5007(Static595.aClass241_1);
			}
			if (local19 == null) {
				return;
			}
			if (local21 == local19) {
				local21 = null;
			}
			if (local19.anIntArray442 != null) {
				if (this.aClass275_2 != null && local19.method5022(this.aClass275_2.anInt7928)) {
					return;
				}
				local7 = local19.method5017();
				if (local19.anInt6014 != this.anInt7313) {
					local9 = local19.aBoolean423;
				}
			} else if (local19.anInt6039 == -1) {
				if (local21 != null && local21.anIntArray442 != null) {
					if (this.aClass275_2 != null && local21.method5022(this.aClass275_2.anInt7928)) {
						return;
					}
					local7 = local21.method5017();
					if (this.anInt7313 != local21.anInt6014) {
						local9 = local21.aBoolean423;
					}
				} else if (local21 != null && local21.anInt6039 != -1 && this.anInt7313 != local21.anInt6014) {
					local7 = local21.anInt6039;
					local9 = local21.aBoolean423;
				}
			} else if (local19.anInt6014 != this.anInt7313) {
				local7 = local19.anInt6039;
				local9 = local19.aBoolean423;
			}
		}
		if (local7 == -1) {
			this.aClass275_2 = null;
			return;
		}
		this.aClass80_6 = null;
		if (this.aClass275_2 == null || local7 != this.aClass275_2.anInt7928) {
			this.aClass275_2 = Static501.aClass191_2.method4322(local7);
		} else if (this.aClass275_2.anInt7920 == 0) {
			return;
		}
		if (this.aClass275_2.anIntArray598 == null) {
			this.aClass275_2 = null;
			return;
		}
		if (local9) {
			this.anInt7312 = (int) ((double) this.aClass275_2.anIntArray598.length * Math.random());
			this.anInt7325 = (int) (Math.random() * (double) this.aClass275_2.anIntArray599[this.anInt7312]) + 1;
		} else {
			this.anInt7325 = 1;
			this.anInt7312 = 0;
		}
		this.anInt7326 = this.anInt7312 + 1;
		if (this.anInt7326 < 0 || this.anInt7326 >= this.aClass275_2.anIntArray598.length) {
			this.anInt7326 = -1;
		}
		this.anInt7327 = Static87.anInt1951 - this.anInt7325;
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lclient!ha;Z)V")
	public void method5946(@OriginalArg(0) Class137 arg0) {
		this.method5944(262144, arg0, true, true);
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(ILclient!ka;IIIIZLclient!qja;Lclient!ha;)V")
	public void method5947(@OriginalArg(0) int arg0, @OriginalArg(1) Class80 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class26 arg6, @OriginalArg(8) Class137 arg7) {
		@Pc(6) Class136[] local6 = arg1.method6376();
		@Pc(9) Class265[] local9 = arg1.method6372();
		if ((this.aClass12_Sub4_6 == null || this.aClass12_Sub4_6.aBoolean155) && (local6 != null || local9 != null)) {
			@Pc(29) Class203 local29 = Static511.aClass13_2.method86(this.anInt7308);
			if (local29.anIntArray440 != null) {
				local29 = local29.method5007(Static595.aClass241_1);
			}
			if (local29 != null) {
				this.aClass12_Sub4_6 = Static86.method1612(Static87.anInt1951, true);
			}
		}
		if (this.aClass12_Sub4_6 == null) {
			return;
		}
		arg1.method6373(arg6);
		if (arg5) {
			this.aClass12_Sub4_6.method1620(arg7, (long) Static87.anInt1951, local6, local9);
		} else {
			this.aClass12_Sub4_6.method1609((long) Static87.anInt1951);
		}
		this.aClass12_Sub4_6.method1621(this.aByte114, arg3, arg4, arg0, arg2);
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lclient!mi;I)V")
	public void method5948(@OriginalArg(0) Class232 arg0) {
		this.aClass232_2 = arg0;
		this.aClass80_6 = null;
	}

	@OriginalMember(owner = "client!nia", name = "b", descriptor = "(B)Z")
	public boolean method5949() {
		return this.aBoolean507;
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(I)I")
	public int method5950(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			this.method5949();
		}
		return this.anInt7322;
	}
}
