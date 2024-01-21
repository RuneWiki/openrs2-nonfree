import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sb", name = "Y", descriptor = "[I")
	public int[] anIntArray419;

	@OriginalMember(owner = "client!sb", name = "Z", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!sb", name = "ob", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!sb", name = "Kb", descriptor = "I")
	private int anInt2746;

	@OriginalMember(owner = "client!sb", name = "Nb", descriptor = "I")
	public int anInt2749;

	@OriginalMember(owner = "client!sb", name = "Sb", descriptor = "[I")
	public int[] anIntArray420;

	@OriginalMember(owner = "client!sb", name = "V", descriptor = "I")
	private int anInt2714 = -1;

	@OriginalMember(owner = "client!sb", name = "jb", descriptor = "[Lclient!kd;")
	public Class39[] aClass39Array27 = new Class39[] { null, null, null, null, Static87.aClass39_1013 };

	@OriginalMember(owner = "client!sb", name = "qb", descriptor = "I")
	public int anInt2729 = -1;

	@OriginalMember(owner = "client!sb", name = "lb", descriptor = "I")
	private int anInt2725 = -1;

	@OriginalMember(owner = "client!sb", name = "ub", descriptor = "I")
	private int anInt2733 = 128;

	@OriginalMember(owner = "client!sb", name = "Cb", descriptor = "I")
	public int anInt2740 = 0;

	@OriginalMember(owner = "client!sb", name = "nb", descriptor = "I")
	private int anInt2727 = 0;

	@OriginalMember(owner = "client!sb", name = "Fb", descriptor = "I")
	public int anInt2742 = 1;

	@OriginalMember(owner = "client!sb", name = "Hb", descriptor = "I")
	public int anInt2744 = 0;

	@OriginalMember(owner = "client!sb", name = "kb", descriptor = "Z")
	public boolean aBoolean220 = false;

	@OriginalMember(owner = "client!sb", name = "tb", descriptor = "I")
	public int anInt2732 = 0;

	@OriginalMember(owner = "client!sb", name = "pb", descriptor = "I")
	private int anInt2728 = -1;

	@OriginalMember(owner = "client!sb", name = "fb", descriptor = "I")
	public int anInt2721 = 0;

	@OriginalMember(owner = "client!sb", name = "X", descriptor = "I")
	private int anInt2716 = -1;

	@OriginalMember(owner = "client!sb", name = "Db", descriptor = "Lclient!kd;")
	public Class39 aClass39_1321 = Static105.aClass39_1300;

	@OriginalMember(owner = "client!sb", name = "bb", descriptor = "I")
	private int anInt2718 = 128;

	@OriginalMember(owner = "client!sb", name = "Tb", descriptor = "I")
	private int anInt2753 = 128;

	@OriginalMember(owner = "client!sb", name = "hb", descriptor = "I")
	public int anInt2723 = 0;

	@OriginalMember(owner = "client!sb", name = "yb", descriptor = "I")
	public int anInt2737 = 0;

	@OriginalMember(owner = "client!sb", name = "Mb", descriptor = "I")
	public int anInt2748 = -1;

	@OriginalMember(owner = "client!sb", name = "rb", descriptor = "I")
	public int anInt2730 = 0;

	@OriginalMember(owner = "client!sb", name = "Ab", descriptor = "I")
	public int anInt2738 = 0;

	@OriginalMember(owner = "client!sb", name = "ib", descriptor = "I")
	public int anInt2724 = 2000;

	@OriginalMember(owner = "client!sb", name = "mb", descriptor = "I")
	private int anInt2726 = -1;

	@OriginalMember(owner = "client!sb", name = "Gb", descriptor = "I")
	private int anInt2743 = -1;

	@OriginalMember(owner = "client!sb", name = "Lb", descriptor = "I")
	private int anInt2747 = -1;

	@OriginalMember(owner = "client!sb", name = "Bb", descriptor = "I")
	private int anInt2739 = -1;

	@OriginalMember(owner = "client!sb", name = "zb", descriptor = "[Lclient!kd;")
	public Class39[] aClass39Array28 = new Class39[] { null, null, Static4.aClass39_65, null, null };

	@OriginalMember(owner = "client!sb", name = "Ub", descriptor = "I")
	private int anInt2754 = -1;

	@OriginalMember(owner = "client!sb", name = "Wb", descriptor = "I")
	private int anInt2756 = 0;

	@OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
	private int anInt2713 = -1;

	@OriginalMember(owner = "client!sb", name = "Vb", descriptor = "I")
	public int anInt2755 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI)Z")
	public boolean method1906(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt2739;
		@Pc(9) int local9 = this.anInt2714;
		@Pc(12) int local12 = this.anInt2728;
		if (arg0) {
			local9 = this.anInt2743;
			local12 = this.anInt2754;
			local6 = this.anInt2716;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(35) boolean local35 = true;
		if (!Static81.aClass62_25.method2019(local6, 0)) {
			local35 = false;
		}
		if (local9 != -1 && !Static81.aClass62_25.method2019(local9, 0)) {
			local35 = false;
		}
		if (local12 != -1 && !Static81.aClass62_25.method2019(local12, 0)) {
			local35 = false;
		}
		return local35;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!sb;ILclient!sb;)V")
	public void method1908(@OriginalArg(0) Class1_Sub1_Sub17 arg0, @OriginalArg(2) Class1_Sub1_Sub17 arg1) {
		this.aShortArray11 = arg1.aShortArray11;
		this.anInt2744 = arg1.anInt2744;
		this.aShortArray12 = arg1.aShortArray12;
		this.aBoolean220 = arg0.aBoolean220;
		this.anInt2737 = arg1.anInt2737;
		this.anInt2740 = arg1.anInt2740;
		this.anInt2746 = arg1.anInt2746;
		this.anInt2724 = arg1.anInt2724;
		this.aClass39_1321 = arg0.aClass39_1321;
		this.anInt2730 = arg1.anInt2730;
		this.anInt2755 = 1;
		this.anInt2742 = arg0.anInt2742;
		this.anInt2721 = arg1.anInt2721;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZ)Z")
	public boolean method1909(@OriginalArg(1) boolean arg0) {
		@Pc(2) int local2 = this.anInt2713;
		@Pc(9) int local9 = this.anInt2725;
		if (arg0) {
			local2 = this.anInt2747;
			local9 = this.anInt2726;
		}
		if (local2 == -1) {
			return true;
		}
		@Pc(32) boolean local32 = true;
		if (!Static81.aClass62_25.method2019(local2, 0)) {
			local32 = false;
		}
		if (local9 != -1 && !Static81.aClass62_25.method2019(local9, 0)) {
			local32 = false;
		}
		return local32;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
	public void method1910() {
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!qc;IB)V")
	private void method1912(@OriginalArg(0) Class1_Sub18 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2746 = arg0.method2156();
		} else if (arg1 == 2) {
			this.aClass39_1321 = arg0.method2139();
		} else if (arg1 == 4) {
			this.anInt2724 = arg0.method2156();
		} else if (arg1 == 5) {
			this.anInt2721 = arg0.method2156();
		} else if (arg1 == 6) {
			this.anInt2740 = arg0.method2156();
		} else if (arg1 == 7) {
			this.anInt2730 = arg0.method2156();
			if (this.anInt2730 > 32767) {
				this.anInt2730 -= 65536;
				return;
			}
		} else if (arg1 == 8) {
			this.anInt2744 = arg0.method2156();
			if (this.anInt2744 > 32767) {
				this.anInt2744 -= 65536;
				return;
			}
		} else if (arg1 == 11) {
			this.anInt2755 = 1;
			return;
		} else if (arg1 == 12) {
			this.anInt2742 = arg0.method2185();
			return;
		} else if (arg1 == 16) {
			this.aBoolean220 = true;
		} else {
			if (arg1 == 23) {
				this.anInt2739 = arg0.method2156();
				this.anInt2756 = arg0.method2169();
			} else if (arg1 == 24) {
				this.anInt2714 = arg0.method2156();
				return;
			} else if (arg1 == 25) {
				this.anInt2716 = arg0.method2156();
				this.anInt2727 = arg0.method2169();
				return;
			} else if (arg1 == 26) {
				this.anInt2743 = arg0.method2156();
				return;
			} else if (arg1 >= 30 && arg1 < 35) {
				this.aClass39Array28[arg1 - 30] = arg0.method2139();
				if (this.aClass39Array28[arg1 - 30].method1158(Static79.aClass39_1228)) {
					this.aClass39Array28[arg1 - 30] = null;
					return;
				}
			} else if (arg1 < 35 || arg1 >= 40) {
				if (arg1 != 40) {
					if (arg1 == 78) {
						this.anInt2728 = arg0.method2156();
						return;
					}
					if (arg1 != 79) {
						if (arg1 == 90) {
							this.anInt2713 = arg0.method2156();
							return;
						}
						if (arg1 == 91) {
							this.anInt2747 = arg0.method2156();
							return;
						}
						if (arg1 == 92) {
							this.anInt2725 = arg0.method2156();
							return;
						}
						if (arg1 != 93) {
							if (arg1 == 95) {
								this.anInt2737 = arg0.method2156();
								return;
							}
							if (arg1 == 97) {
								this.anInt2729 = arg0.method2156();
								return;
							}
							if (arg1 != 98) {
								if (arg1 >= 100 && arg1 < 110) {
									if (this.anIntArray419 == null) {
										this.anIntArray420 = new int[10];
										this.anIntArray419 = new int[10];
									}
									this.anIntArray419[arg1 - 100] = arg0.method2156();
									this.anIntArray420[arg1 - 100] = arg0.method2156();
									return;
								}
								if (arg1 == 110) {
									this.anInt2733 = arg0.method2156();
									return;
								}
								if (arg1 == 111) {
									this.anInt2753 = arg0.method2156();
									return;
								}
								if (arg1 != 112) {
									if (arg1 == 113) {
										this.anInt2738 = arg0.method2178();
									} else if (arg1 == 114) {
										this.anInt2723 = arg0.method2178() * 5;
										return;
									} else if (arg1 == 115) {
										this.anInt2732 = arg0.method2169();
										return;
									}
									return;
								}
								this.anInt2718 = arg0.method2156();
								return;
							}
							this.anInt2748 = arg0.method2156();
							return;
						}
						this.anInt2726 = arg0.method2156();
						return;
					}
					this.anInt2754 = arg0.method2156();
					return;
				}
				@Pc(191) int local191 = arg0.method2169();
				this.aShortArray11 = new short[local191];
				this.aShortArray12 = new short[local191];
				for (@Pc(201) int local201 = 0; local201 < local191; local201++) {
					this.aShortArray12[local201] = (short) arg0.method2156();
					this.aShortArray11[local201] = (short) arg0.method2156();
				}
				return;
			} else {
				this.aClass39Array27[arg1 - 35] = arg0.method2139();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(BI)Lclient!sb;")
	public Class1_Sub1_Sub17 method1913(@OriginalArg(1) int arg0) {
		if (this.anIntArray419 != null && arg0 > 1) {
			@Pc(19) int local19 = -1;
			for (@Pc(21) int local21 = 0; local21 < 10; local21++) {
				if (this.anIntArray420[local21] <= arg0 && this.anIntArray420[local21] != 0) {
					local19 = this.anIntArray419[local21];
				}
			}
			if (local19 != -1) {
				return Static8.method224(local19);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)Lclient!na;")
	public Class1_Sub1_Sub2_Sub7 method1916(@OriginalArg(0) int arg0) {
		if (this.anIntArray419 != null && arg0 > 1) {
			@Pc(18) int local18 = -1;
			for (@Pc(20) int local20 = 0; local20 < 10; local20++) {
				if (this.anIntArray420[local20] <= arg0 && this.anIntArray420[local20] != 0) {
					local18 = this.anIntArray419[local20];
				}
			}
			if (local18 != -1) {
				return Static8.method224(local18).method1916(1);
			}
		}
		@Pc(65) Class1_Sub1_Sub2_Sub7 local65 = (Class1_Sub1_Sub2_Sub7) Static46.aClass33_38.method1038((long) this.anInt2749);
		if (local65 != null) {
			return local65;
		}
		@Pc(75) Class1_Sub1_Sub2_Sub5 local75 = Static60.method1097(Static81.aClass62_25, this.anInt2746);
		if (local75 == null) {
			return null;
		}
		if (this.anInt2733 != 128 || this.anInt2753 != 128 || this.anInt2718 != 128) {
			local75.method1100(this.anInt2733, this.anInt2753, this.anInt2718);
		}
		if (this.aShortArray12 != null) {
			for (@Pc(106) int local106 = 0; local106 < this.aShortArray12.length; local106++) {
				local75.method1104(this.aShortArray12[local106], this.aShortArray11[local106]);
			}
		}
		local65 = local75.method1101(this.anInt2738 + 64, this.anInt2723 + 768, -50, -10, -50);
		local65.aBoolean162 = true;
		Static46.aClass33_38.method1042(local65, (long) this.anInt2749);
		return local65;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(ZI)Lclient!je;")
	public Class1_Sub1_Sub2_Sub5 method1917(@OriginalArg(0) boolean arg0) {
		@Pc(4) int local4 = this.anInt2739;
		@Pc(16) int local16 = this.anInt2714;
		@Pc(19) int local19 = this.anInt2728;
		if (arg0) {
			local19 = this.anInt2754;
			local16 = this.anInt2743;
			local4 = this.anInt2716;
		}
		if (local4 == -1) {
			return null;
		}
		@Pc(41) Class1_Sub1_Sub2_Sub5 local41 = Static60.method1097(Static81.aClass62_25, local4);
		if (local16 != -1) {
			@Pc(50) Class1_Sub1_Sub2_Sub5 local50 = Static60.method1097(Static81.aClass62_25, local16);
			if (local19 == -1) {
				@Pc(65) Class1_Sub1_Sub2_Sub5[] local65 = new Class1_Sub1_Sub2_Sub5[] { local41, local50 };
				local41 = new Class1_Sub1_Sub2_Sub5(local65, 2);
			} else {
				@Pc(78) Class1_Sub1_Sub2_Sub5 local78 = Static60.method1097(Static81.aClass62_25, local19);
				@Pc(93) Class1_Sub1_Sub2_Sub5[] local93 = new Class1_Sub1_Sub2_Sub5[] { local41, local50, local78 };
				local41 = new Class1_Sub1_Sub2_Sub5(local93, 3);
			}
		}
		if (!arg0 && this.anInt2756 != 0) {
			local41.method1092(0, this.anInt2756, 0);
		}
		if (arg0 && this.anInt2727 != 0) {
			local41.method1092(0, this.anInt2727, 0);
		}
		if (this.aShortArray12 != null) {
			for (@Pc(129) int local129 = 0; local129 < this.aShortArray12.length; local129++) {
				local41.method1104(this.aShortArray12[local129], this.aShortArray11[local129]);
			}
		}
		return local41;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZZ)Lclient!je;")
	public Class1_Sub1_Sub2_Sub5 method1918(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt2713;
		@Pc(17) int local17 = this.anInt2725;
		if (arg0) {
			local17 = this.anInt2726;
			local8 = this.anInt2747;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(35) Class1_Sub1_Sub2_Sub5 local35 = Static60.method1097(Static81.aClass62_25, local8);
		if (local17 != -1) {
			@Pc(43) Class1_Sub1_Sub2_Sub5 local43 = Static60.method1097(Static81.aClass62_25, local17);
			@Pc(54) Class1_Sub1_Sub2_Sub5[] local54 = new Class1_Sub1_Sub2_Sub5[] { local35, local43 };
			local35 = new Class1_Sub1_Sub2_Sub5(local54, 2);
		}
		if (this.aShortArray12 != null) {
			for (@Pc(65) int local65 = 0; local65 < this.aShortArray12.length; local65++) {
				local35.method1104(this.aShortArray12[local65], this.aShortArray11[local65]);
			}
		}
		return local35;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(ZI)Lclient!je;")
	public Class1_Sub1_Sub2_Sub5 method1919(@OriginalArg(1) int arg0) {
		@Pc(15) int local15;
		if (this.anIntArray419 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (local15 = 0; local15 < 10; local15++) {
				if (arg0 >= this.anIntArray420[local15] && this.anIntArray420[local15] != 0) {
					local13 = this.anIntArray419[local15];
				}
			}
			if (local13 != -1) {
				return Static8.method224(local13).method1919(1);
			}
		}
		@Pc(58) Class1_Sub1_Sub2_Sub5 local58 = Static60.method1097(Static81.aClass62_25, this.anInt2746);
		if (local58 == null) {
			return null;
		}
		if (this.anInt2733 != 128 || this.anInt2753 != 128 || this.anInt2718 != 128) {
			local58.method1100(this.anInt2733, this.anInt2753, this.anInt2718);
		}
		if (this.aShortArray12 != null) {
			for (local15 = 0; local15 < this.aShortArray12.length; local15++) {
				local58.method1104(this.aShortArray12[local15], this.aShortArray11[local15]);
			}
		}
		return local58;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLclient!qc;)V")
	public void method1920(@OriginalArg(1) Class1_Sub18 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2169();
			if (local9 == 0) {
				return;
			}
			this.method1912(arg0, local9);
		}
	}
}
