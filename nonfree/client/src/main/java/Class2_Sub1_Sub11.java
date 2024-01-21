import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class2_Sub1_Sub11 extends Class2_Sub1 {

	@OriginalMember(owner = "client!qa", name = "Q", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!qa", name = "eb", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!qa", name = "yb", descriptor = "I")
	private int anInt2086;

	@OriginalMember(owner = "client!qa", name = "Bb", descriptor = "[I")
	public int[] anIntArray278;

	@OriginalMember(owner = "client!qa", name = "Cb", descriptor = "[I")
	public int[] anIntArray279;

	@OriginalMember(owner = "client!qa", name = "Db", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!qa", name = "Jb", descriptor = "I")
	public int anInt2093;

	@OriginalMember(owner = "client!qa", name = "Nb", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!qa", name = "Z", descriptor = "I")
	public int anInt2067 = 0;

	@OriginalMember(owner = "client!qa", name = "hb", descriptor = "Z")
	public boolean aBoolean80 = false;

	@OriginalMember(owner = "client!qa", name = "O", descriptor = "I")
	private int anInt2062 = -1;

	@OriginalMember(owner = "client!qa", name = "Y", descriptor = "I")
	private int anInt2066 = 128;

	@OriginalMember(owner = "client!qa", name = "N", descriptor = "Lclient!pe;")
	public Class65 aClass65_870 = Static30.aClass65_346;

	@OriginalMember(owner = "client!qa", name = "fb", descriptor = "I")
	public int anInt2071 = 0;

	@OriginalMember(owner = "client!qa", name = "pb", descriptor = "I")
	private int anInt2079 = -1;

	@OriginalMember(owner = "client!qa", name = "bb", descriptor = "I")
	public int anInt2069 = 0;

	@OriginalMember(owner = "client!qa", name = "cb", descriptor = "I")
	private int anInt2070 = -1;

	@OriginalMember(owner = "client!qa", name = "K", descriptor = "I")
	public int anInt2060 = 0;

	@OriginalMember(owner = "client!qa", name = "L", descriptor = "I")
	public int anInt2061 = 0;

	@OriginalMember(owner = "client!qa", name = "zb", descriptor = "[Lclient!pe;")
	public Class65[] aClass65Array48 = new Class65[] { null, null, Static93.aClass65_875, null, null };

	@OriginalMember(owner = "client!qa", name = "rb", descriptor = "I")
	private int anInt2081 = -1;

	@OriginalMember(owner = "client!qa", name = "jb", descriptor = "I")
	private int anInt2073 = -1;

	@OriginalMember(owner = "client!qa", name = "kb", descriptor = "I")
	private int anInt2074 = -1;

	@OriginalMember(owner = "client!qa", name = "sb", descriptor = "I")
	public int anInt2082 = 0;

	@OriginalMember(owner = "client!qa", name = "Ob", descriptor = "I")
	private int anInt2096 = 0;

	@OriginalMember(owner = "client!qa", name = "wb", descriptor = "I")
	private int anInt2085 = -1;

	@OriginalMember(owner = "client!qa", name = "Sb", descriptor = "I")
	private int anInt2100 = -1;

	@OriginalMember(owner = "client!qa", name = "Hb", descriptor = "I")
	public int anInt2091 = -1;

	@OriginalMember(owner = "client!qa", name = "Fb", descriptor = "I")
	private int anInt2089 = 128;

	@OriginalMember(owner = "client!qa", name = "U", descriptor = "I")
	private int anInt2065 = 0;

	@OriginalMember(owner = "client!qa", name = "Pb", descriptor = "I")
	private int anInt2097 = 128;

	@OriginalMember(owner = "client!qa", name = "Wb", descriptor = "[Lclient!pe;")
	public Class65[] aClass65Array49 = new Class65[] { null, null, null, null, Static38.aClass65_402 };

	@OriginalMember(owner = "client!qa", name = "Ib", descriptor = "I")
	public int anInt2092 = 0;

	@OriginalMember(owner = "client!qa", name = "qb", descriptor = "I")
	public int anInt2080 = 0;

	@OriginalMember(owner = "client!qa", name = "mb", descriptor = "I")
	public int anInt2076 = 2000;

	@OriginalMember(owner = "client!qa", name = "Tb", descriptor = "I")
	public int anInt2101 = -1;

	@OriginalMember(owner = "client!qa", name = "Gb", descriptor = "I")
	private int anInt2090 = -1;

	@OriginalMember(owner = "client!qa", name = "Rb", descriptor = "I")
	private int anInt2099 = -1;

	@OriginalMember(owner = "client!qa", name = "Mb", descriptor = "I")
	public int anInt2095 = 1;

	@OriginalMember(owner = "client!qa", name = "ab", descriptor = "I")
	public int anInt2068 = 0;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)Lclient!ed;")
	public Class2_Sub1_Sub1_Sub2 method1532(@OriginalArg(0) int arg0) {
		@Pc(15) int local15;
		if (this.anIntArray279 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (local15 = 0; local15 < 10; local15++) {
				if (arg0 >= this.anIntArray278[local15] && this.anIntArray278[local15] != 0) {
					local13 = this.anIntArray279[local15];
				}
			}
			if (local13 != -1) {
				return Static4.method872(local13).method1532(1);
			}
		}
		@Pc(62) Class2_Sub1_Sub1_Sub2 local62 = Static27.method559(Static115.aClass56_35, this.anInt2086);
		if (local62 == null) {
			return null;
		}
		if (this.anInt2066 != 128 || this.anInt2097 != 128 || this.anInt2089 != 128) {
			local62.method545(this.anInt2066, this.anInt2097, this.anInt2089);
		}
		if (this.aShortArray24 != null) {
			for (local15 = 0; local15 < this.aShortArray24.length; local15++) {
				local62.method544(this.aShortArray24[local15], this.aShortArray27[local15]);
			}
		}
		if (this.aShortArray26 != null) {
			for (local15 = 0; local15 < this.aShortArray26.length; local15++) {
				local62.method555(this.aShortArray26[local15], this.aShortArray25[local15]);
			}
		}
		return local62;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
	public void method1533() {
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILclient!be;)V")
	private void method1534(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt2086 = arg1.method896();
		} else if (arg0 == 2) {
			this.aClass65_870 = arg1.method931();
		} else if (arg0 == 4) {
			this.anInt2076 = arg1.method896();
		} else if (arg0 == 5) {
			this.anInt2069 = arg1.method896();
		} else if (arg0 == 6) {
			this.anInt2080 = arg1.method896();
		} else if (arg0 == 7) {
			this.anInt2068 = arg1.method896();
			if (this.anInt2068 > 32767) {
				this.anInt2068 -= 65536;
				return;
			}
		} else if (arg0 == 8) {
			this.anInt2061 = arg1.method896();
			if (this.anInt2061 > 32767) {
				this.anInt2061 -= 65536;
				return;
			}
		} else if (arg0 == 11) {
			this.anInt2071 = 1;
			return;
		} else if (arg0 == 12) {
			this.anInt2095 = arg1.method903();
			return;
		} else if (arg0 == 16) {
			this.aBoolean80 = true;
			return;
		} else if (arg0 == 23) {
			this.anInt2062 = arg1.method896();
			this.anInt2065 = arg1.method933();
			return;
		} else if (arg0 == 24) {
			this.anInt2070 = arg1.method896();
			return;
		} else if (arg0 == 25) {
			this.anInt2073 = arg1.method896();
			this.anInt2096 = arg1.method933();
			return;
		} else if (arg0 == 26) {
			this.anInt2100 = arg1.method896();
		} else {
			if (arg0 >= 30 && arg0 < 35) {
				this.aClass65Array48[arg0 - 30] = arg1.method931();
				if (this.aClass65Array48[arg0 - 30].method1488(Static18.aClass65_140)) {
					this.aClass65Array48[arg0 - 30] = null;
					return;
				}
			} else if (arg0 < 35 || arg0 >= 40) {
				@Pc(423) int local423;
				@Pc(433) int local433;
				if (arg0 != 40) {
					if (arg0 != 41) {
						if (arg0 == 78) {
							this.anInt2079 = arg1.method896();
							return;
						}
						if (arg0 == 79) {
							this.anInt2074 = arg1.method896();
							return;
						}
						if (arg0 == 90) {
							this.anInt2085 = arg1.method896();
							return;
						}
						if (arg0 == 91) {
							this.anInt2099 = arg1.method896();
							return;
						}
						if (arg0 == 92) {
							this.anInt2081 = arg1.method896();
							return;
						}
						if (arg0 != 93) {
							if (arg0 != 95) {
								if (arg0 == 97) {
									this.anInt2101 = arg1.method896();
									return;
								}
								if (arg0 == 98) {
									this.anInt2091 = arg1.method896();
									return;
								}
								if (arg0 >= 100 && arg0 < 110) {
									if (this.anIntArray279 == null) {
										this.anIntArray278 = new int[10];
										this.anIntArray279 = new int[10];
									}
									this.anIntArray279[arg0 - 100] = arg1.method896();
									this.anIntArray278[arg0 - 100] = arg1.method896();
									return;
								}
								if (arg0 != 110) {
									if (arg0 != 111) {
										if (arg0 != 112) {
											if (arg0 != 113) {
												if (arg0 == 114) {
													this.anInt2067 = arg1.method922() * 5;
												} else if (arg0 == 115) {
													this.anInt2092 = arg1.method933();
													return;
												}
												return;
											}
											this.anInt2082 = arg1.method922();
											return;
										}
										this.anInt2089 = arg1.method896();
										return;
									}
									this.anInt2097 = arg1.method896();
									return;
								}
								this.anInt2066 = arg1.method896();
								return;
							}
							this.anInt2060 = arg1.method896();
							return;
						}
						this.anInt2090 = arg1.method896();
						return;
					}
					local423 = arg1.method933();
					this.aShortArray25 = new short[local423];
					this.aShortArray26 = new short[local423];
					for (local433 = 0; local433 < local423; local433++) {
						this.aShortArray26[local433] = (short) arg1.method896();
						this.aShortArray25[local433] = (short) arg1.method896();
					}
					return;
				}
				local423 = arg1.method933();
				this.aShortArray27 = new short[local423];
				this.aShortArray24 = new short[local423];
				for (local433 = 0; local433 < local423; local433++) {
					this.aShortArray24[local433] = (short) arg1.method896();
					this.aShortArray27[local433] = (short) arg1.method896();
				}
			} else {
				this.aClass65Array49[arg0 - 35] = arg1.method931();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)Lclient!qa;")
	public Class2_Sub1_Sub11 method1536(@OriginalArg(1) int arg0) {
		if (this.anIntArray279 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (this.anIntArray278[local15] <= arg0 && this.anIntArray278[local15] != 0) {
					local13 = this.anIntArray279[local15];
				}
			}
			if (local13 != -1) {
				return Static4.method872(local13);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)Lclient!wb;")
	public Class2_Sub1_Sub1_Sub7 method1537(@OriginalArg(0) int arg0) {
		if (this.anIntArray279 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (arg0 >= this.anIntArray278[local17] && this.anIntArray278[local17] != 0) {
					local15 = this.anIntArray279[local17];
				}
			}
			if (local15 != -1) {
				return Static4.method872(local15).method1537(1);
			}
		}
		@Pc(62) Class2_Sub1_Sub1_Sub7 local62 = (Class2_Sub1_Sub1_Sub7) Static75.aClass8_52.method172((long) this.anInt2093);
		if (local62 != null) {
			return local62;
		}
		@Pc(72) Class2_Sub1_Sub1_Sub2 local72 = Static27.method559(Static115.aClass56_35, this.anInt2086);
		if (local72 == null) {
			return null;
		}
		if (this.anInt2066 != 128 || this.anInt2097 != 128 || this.anInt2089 != 128) {
			local72.method545(this.anInt2066, this.anInt2097, this.anInt2089);
		}
		@Pc(108) int local108;
		if (this.aShortArray24 != null) {
			for (local108 = 0; local108 < this.aShortArray24.length; local108++) {
				local72.method544(this.aShortArray24[local108], this.aShortArray27[local108]);
			}
		}
		if (this.aShortArray26 != null) {
			for (local108 = 0; local108 < this.aShortArray26.length; local108++) {
				local72.method555(this.aShortArray26[local108], this.aShortArray25[local108]);
			}
		}
		local62 = local72.method542(this.anInt2082 + 64, this.anInt2067 + 768, -50, -10, -50);
		local62.aBoolean130 = true;
		Static75.aClass8_52.method176((long) this.anInt2093, local62);
		return local62;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!be;I)V")
	public void method1538(@OriginalArg(0) Class2_Sub4 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method933();
			if (local13 == 0) {
				return;
			}
			this.method1534(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI)Lclient!ed;")
	public Class2_Sub1_Sub1_Sub2 method1540(@OriginalArg(0) boolean arg0) {
		@Pc(4) int local4 = this.anInt2085;
		@Pc(11) int local11 = this.anInt2081;
		if (arg0) {
			local11 = this.anInt2090;
			local4 = this.anInt2099;
		}
		if (local4 == -1) {
			return null;
		}
		@Pc(29) Class2_Sub1_Sub1_Sub2 local29 = Static27.method559(Static115.aClass56_35, local4);
		if (local11 != -1) {
			@Pc(38) Class2_Sub1_Sub1_Sub2 local38 = Static27.method559(Static115.aClass56_35, local11);
			@Pc(49) Class2_Sub1_Sub1_Sub2[] local49 = new Class2_Sub1_Sub1_Sub2[] { local29, local38 };
			local29 = new Class2_Sub1_Sub1_Sub2(local49, 2);
		}
		@Pc(60) int local60;
		if (this.aShortArray24 != null) {
			for (local60 = 0; local60 < this.aShortArray24.length; local60++) {
				local29.method544(this.aShortArray24[local60], this.aShortArray27[local60]);
			}
		}
		if (this.aShortArray26 != null) {
			for (local60 = 0; local60 < this.aShortArray26.length; local60++) {
				local29.method555(this.aShortArray26[local60], this.aShortArray25[local60]);
			}
		}
		return local29;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZB)Z")
	public boolean method1541(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt2081;
		@Pc(9) int local9 = this.anInt2085;
		if (arg0) {
			local9 = this.anInt2099;
			local6 = this.anInt2090;
		}
		if (local9 == -1) {
			return true;
		}
		@Pc(25) boolean local25 = true;
		if (!Static115.aClass56_35.method1670(local9, 0)) {
			local25 = false;
		}
		if (local6 != -1 && !Static115.aClass56_35.method1670(local6, 0)) {
			local25 = false;
		}
		return local25;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!qa;Lclient!qa;I)V")
	public void method1543(@OriginalArg(0) Class2_Sub1_Sub11 arg0, @OriginalArg(1) Class2_Sub1_Sub11 arg1) {
		this.anInt2076 = arg1.anInt2076;
		this.aShortArray24 = arg1.aShortArray24;
		this.aClass65_870 = arg0.aClass65_870;
		this.anInt2086 = arg1.anInt2086;
		this.aShortArray27 = arg1.aShortArray27;
		this.aShortArray25 = arg1.aShortArray25;
		this.anInt2080 = arg1.anInt2080;
		this.anInt2071 = 1;
		this.anInt2095 = arg0.anInt2095;
		this.anInt2068 = arg1.anInt2068;
		this.aBoolean80 = arg0.aBoolean80;
		this.aShortArray26 = arg1.aShortArray26;
		this.anInt2069 = arg1.anInt2069;
		this.anInt2061 = arg1.anInt2061;
		this.anInt2060 = arg1.anInt2060;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(ZI)Z")
	public boolean method1544(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt2062;
		@Pc(9) int local9 = this.anInt2070;
		@Pc(19) int local19 = this.anInt2079;
		if (arg0) {
			local19 = this.anInt2074;
			local9 = this.anInt2100;
			local6 = this.anInt2073;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(37) boolean local37 = true;
		if (!Static115.aClass56_35.method1670(local6, 0)) {
			local37 = false;
		}
		if (local9 != -1 && !Static115.aClass56_35.method1670(local9, 0)) {
			local37 = false;
		}
		if (local19 != -1 && !Static115.aClass56_35.method1670(local19, 0)) {
			local37 = false;
		}
		return local37;
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(ZI)Lclient!ed;")
	public Class2_Sub1_Sub1_Sub2 method1545(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.anInt2062;
		@Pc(11) int local11 = this.anInt2070;
		@Pc(14) int local14 = this.anInt2079;
		if (arg0) {
			local8 = this.anInt2073;
			local11 = this.anInt2100;
			local14 = this.anInt2074;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(35) Class2_Sub1_Sub1_Sub2 local35 = Static27.method559(Static115.aClass56_35, local8);
		if (local11 != -1) {
			@Pc(44) Class2_Sub1_Sub1_Sub2 local44 = Static27.method559(Static115.aClass56_35, local11);
			if (local14 == -1) {
				@Pc(58) Class2_Sub1_Sub1_Sub2[] local58 = new Class2_Sub1_Sub1_Sub2[] { local35, local44 };
				local35 = new Class2_Sub1_Sub1_Sub2(local58, 2);
			} else {
				@Pc(71) Class2_Sub1_Sub1_Sub2 local71 = Static27.method559(Static115.aClass56_35, local14);
				@Pc(86) Class2_Sub1_Sub1_Sub2[] local86 = new Class2_Sub1_Sub1_Sub2[] { local35, local44, local71 };
				local35 = new Class2_Sub1_Sub1_Sub2(local86, 3);
			}
		}
		if (!arg0 && this.anInt2065 != 0) {
			local35.method538(0, this.anInt2065, 0);
		}
		if (arg0 && this.anInt2096 != 0) {
			local35.method538(0, this.anInt2096, 0);
		}
		@Pc(122) int local122;
		if (this.aShortArray24 != null) {
			for (local122 = 0; local122 < this.aShortArray24.length; local122++) {
				local35.method544(this.aShortArray24[local122], this.aShortArray27[local122]);
			}
		}
		if (this.aShortArray26 != null) {
			for (local122 = 0; local122 < this.aShortArray26.length; local122++) {
				local35.method555(this.aShortArray26[local122], this.aShortArray25[local122]);
			}
		}
		return local35;
	}
}
