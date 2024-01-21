import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class2_Sub1_Sub14 extends Class2_Sub1 {

	@OriginalMember(owner = "client!sa", name = "cb", descriptor = "[I")
	private int[] anIntArray383;

	@OriginalMember(owner = "client!sa", name = "fb", descriptor = "[I")
	public int[] anIntArray384;

	@OriginalMember(owner = "client!sa", name = "mb", descriptor = "[I")
	private int[] anIntArray385;

	@OriginalMember(owner = "client!sa", name = "ob", descriptor = "[I")
	public int[] anIntArray386;

	@OriginalMember(owner = "client!sa", name = "vb", descriptor = "I")
	public int anInt2620;

	@OriginalMember(owner = "client!sa", name = "Ib", descriptor = "[I")
	private int[] anIntArray389;

	@OriginalMember(owner = "client!sa", name = "fc", descriptor = "[I")
	private int[] anIntArray390;

	@OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
	public int anInt2611 = -1;

	@OriginalMember(owner = "client!sa", name = "Z", descriptor = "Z")
	public boolean aBoolean137 = true;

	@OriginalMember(owner = "client!sa", name = "lb", descriptor = "I")
	private int anInt2617 = 128;

	@OriginalMember(owner = "client!sa", name = "yb", descriptor = "I")
	public int anInt2622 = 0;

	@OriginalMember(owner = "client!sa", name = "ib", descriptor = "Z")
	public boolean aBoolean138 = false;

	@OriginalMember(owner = "client!sa", name = "Mb", descriptor = "I")
	private int anInt2633 = 0;

	@OriginalMember(owner = "client!sa", name = "Nb", descriptor = "Z")
	public boolean aBoolean141 = false;

	@OriginalMember(owner = "client!sa", name = "Vb", descriptor = "I")
	private int anInt2639 = 128;

	@OriginalMember(owner = "client!sa", name = "Kb", descriptor = "I")
	public int anInt2631 = 16;

	@OriginalMember(owner = "client!sa", name = "wb", descriptor = "Z")
	public boolean aBoolean140 = true;

	@OriginalMember(owner = "client!sa", name = "pb", descriptor = "Z")
	public boolean aBoolean139 = true;

	@OriginalMember(owner = "client!sa", name = "jb", descriptor = "I")
	public int anInt2616 = -1;

	@OriginalMember(owner = "client!sa", name = "Xb", descriptor = "I")
	public int anInt2640 = 0;

	@OriginalMember(owner = "client!sa", name = "Jb", descriptor = "I")
	private int anInt2630 = -1;

	@OriginalMember(owner = "client!sa", name = "Zb", descriptor = "I")
	public int anInt2642 = -1;

	@OriginalMember(owner = "client!sa", name = "Qb", descriptor = "I")
	private int anInt2636 = 0;

	@OriginalMember(owner = "client!sa", name = "dc", descriptor = "I")
	public int anInt2644 = -1;

	@OriginalMember(owner = "client!sa", name = "Lb", descriptor = "I")
	private int anInt2632 = 0;

	@OriginalMember(owner = "client!sa", name = "nb", descriptor = "I")
	public int anInt2618 = 0;

	@OriginalMember(owner = "client!sa", name = "oc", descriptor = "I")
	private int anInt2651 = -1;

	@OriginalMember(owner = "client!sa", name = "Gb", descriptor = "I")
	private int anInt2628 = 0;

	@OriginalMember(owner = "client!sa", name = "ec", descriptor = "I")
	public int anInt2645 = -1;

	@OriginalMember(owner = "client!sa", name = "Yb", descriptor = "I")
	private int anInt2641 = 0;

	@OriginalMember(owner = "client!sa", name = "gb", descriptor = "I")
	private int anInt2614 = 128;

	@OriginalMember(owner = "client!sa", name = "ic", descriptor = "I")
	public int anInt2646 = -1;

	@OriginalMember(owner = "client!sa", name = "Ob", descriptor = "I")
	public int anInt2634 = 1;

	@OriginalMember(owner = "client!sa", name = "hc", descriptor = "Z")
	public boolean aBoolean144 = false;

	@OriginalMember(owner = "client!sa", name = "xb", descriptor = "I")
	public int anInt2621 = 1;

	@OriginalMember(owner = "client!sa", name = "bc", descriptor = "Z")
	public boolean aBoolean143 = false;

	@OriginalMember(owner = "client!sa", name = "qc", descriptor = "Lclient!wb;")
	public Class65 aClass65_1184 = Static29.aClass65_389;

	@OriginalMember(owner = "client!sa", name = "nc", descriptor = "Z")
	private boolean aBoolean145 = false;

	@OriginalMember(owner = "client!sa", name = "sc", descriptor = "[Lclient!wb;")
	public final Class65[] aClass65Array13 = new Class65[5];

	@OriginalMember(owner = "client!sa", name = "pc", descriptor = "I")
	public int anInt2652 = 0;

	@OriginalMember(owner = "client!sa", name = "Ub", descriptor = "Z")
	private boolean aBoolean142 = false;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)Z")
	public boolean method1608() {
		if (this.anIntArray390 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray390.length; local14++) {
			local12 &= Static108.aClass33_44.method1140(0, this.anIntArray390[local14] & 0xFFFF);
		}
		return local12;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!fe;)V")
	public void method1609(@OriginalArg(1) Class2_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1410();
			if (local9 == 0) {
				return;
			}
			this.method1616(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)Z")
	public boolean method1611(@OriginalArg(1) int arg0) {
		if (this.anIntArray389 != null) {
			for (@Pc(57) int local57 = 0; local57 < this.anIntArray389.length; local57++) {
				if (arg0 == this.anIntArray389[local57]) {
					return Static108.aClass33_44.method1140(0, this.anIntArray390[local57] & 0xFFFF);
				}
			}
			return true;
		} else if (this.anIntArray390 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(30) boolean local30 = true;
			for (@Pc(32) int local32 = 0; local32 < this.anIntArray390.length; local32++) {
				local30 &= Static108.aClass33_44.method1140(0, this.anIntArray390[local32] & 0xFFFF);
			}
			return local30;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "(I)Lclient!sa;")
	public Class2_Sub1_Sub14 method1612() {
		@Pc(5) int local5 = -1;
		if (this.anInt2651 != -1) {
			local5 = Static36.method741(this.anInt2651);
		} else if (this.anInt2630 != -1) {
			local5 = Static26.anIntArray416[this.anInt2630];
		}
		return local5 < 0 || local5 >= this.anIntArray384.length || this.anIntArray384[local5] == -1 ? null : Static29.method518(this.anIntArray384[local5]);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIBIIII)Lclient!r;")
	public Class2_Sub1_Sub1_Sub6 method1613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(26) long local26;
		if (this.anIntArray389 == null) {
			local26 = (this.anInt2620 << 10) + arg2;
		} else {
			local26 = arg2 + (arg3 << 3) + (this.anInt2620 << 10);
		}
		@Pc(42) Class2_Sub1_Sub1_Sub6 local42 = (Class2_Sub1_Sub1_Sub6) Static13.aClass21_5.method744(local26);
		if (local42 == null) {
			local42 = this.method1620(!this.aBoolean145, arg3, false, arg2);
			if (local42 == null) {
				return null;
			}
			Static13.aClass21_5.method745(local26, local42);
		}
		if (this.aBoolean138 || this.aBoolean145) {
			local42 = new Class2_Sub1_Sub1_Sub6(local42, this.aBoolean138, this.aBoolean145);
		}
		if (this.aBoolean138) {
			@Pc(95) int local95 = (arg0 + arg4 + arg1 + arg5) / 4;
			for (@Pc(97) int local97 = 0; local97 < local42.anInt2507; local97++) {
				@Pc(104) int local104 = local42.anIntArray344[local97];
				@Pc(109) int local109 = local42.anIntArray338[local97];
				@Pc(123) int local123 = arg1 + (arg5 - arg1) * (local104 + 64) / 128;
				@Pc(137) int local137 = arg0 + (local104 + 64) * (arg4 + -arg0) / 128;
				@Pc(150) int local150 = local123 + (local137 - local123) * (local109 + 64) / 128;
				local42.anIntArray339[local97] += local150 - local95;
			}
		}
		return local42;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIBLclient!gd;II)Lclient!r;")
	public Class2_Sub1_Sub1_Sub6 method1615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class2_Sub1_Sub6 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(17) long local17;
		if (this.anIntArray389 == null) {
			local17 = (this.anInt2620 << 10) + arg7;
		} else {
			local17 = (this.anInt2620 << 10) + (arg4 << 3) + arg7;
		}
		@Pc(38) Class2_Sub1_Sub1_Sub6 local38 = (Class2_Sub1_Sub1_Sub6) Static62.aClass21_25.method744(local17);
		if (local38 == null) {
			local38 = this.method1620(true, arg4, true, arg7);
			if (local38 == null) {
				return null;
			}
			Static62.aClass21_25.method745(local17, local38);
		}
		if (arg5 == null && !this.aBoolean138) {
			return local38;
		}
		if (arg5 == null) {
			local38 = local38.method1522(true);
		} else {
			local38 = arg5.method740(arg3, local38, arg7);
		}
		if (this.aBoolean138) {
			@Pc(92) int local92 = (arg2 + arg1 + arg0 + arg6) / 4;
			for (@Pc(94) int local94 = 0; local94 < local38.anInt2507; local94++) {
				@Pc(101) int local101 = local38.anIntArray344[local94];
				@Pc(106) int local106 = local38.anIntArray338[local94];
				@Pc(119) int local119 = (local101 + 64) * (-arg6 + arg2) / 128 + arg6;
				@Pc(132) int local132 = (arg1 - arg0) * (local101 + 64) / 128 + arg0;
				@Pc(145) int local145 = (local106 + 64) * (local119 + -local132) / 128 + local132;
				local38.anIntArray339[local94] += local145 - local92;
			}
		}
		return local38;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!fe;BI)V")
	private void method1616(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(2) int arg1) {
		@Pc(25) int local25;
		@Pc(50) int local50;
		if (arg1 == 1) {
			local25 = arg0.method1410();
			if (local25 > 0) {
				if (this.anIntArray390 == null || Static1.aBoolean1) {
					this.anIntArray389 = new int[local25];
					this.anIntArray390 = new int[local25];
					for (local50 = 0; local50 < local25; local50++) {
						this.anIntArray390[local50] = arg0.method1396();
						this.anIntArray389[local50] = arg0.method1410();
					}
				} else {
					arg0.anInt2342 += local25 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass65_1184 = arg0.method1400();
		} else if (arg1 == 5) {
			local25 = arg0.method1410();
			if (local25 > 0) {
				if (this.anIntArray390 != null && !Static1.aBoolean1) {
					arg0.anInt2342 += local25 * 2;
					return;
				}
				this.anIntArray390 = new int[local25];
				this.anIntArray389 = null;
				for (local50 = 0; local50 < local25; local50++) {
					this.anIntArray390[local50] = arg0.method1396();
				}
				return;
			}
		} else if (arg1 == 14) {
			this.anInt2621 = arg0.method1410();
			return;
		} else if (arg1 == 15) {
			this.anInt2634 = arg0.method1410();
		} else if (arg1 == 17) {
			this.aBoolean140 = false;
			return;
		} else if (arg1 == 18) {
			this.aBoolean139 = false;
			return;
		} else if (arg1 == 19) {
			this.anInt2616 = arg0.method1410();
			return;
		} else if (arg1 == 21) {
			this.aBoolean138 = true;
			return;
		} else if (arg1 == 22) {
			this.aBoolean145 = true;
			return;
		} else if (arg1 == 23) {
			this.aBoolean141 = true;
			return;
		} else {
			if (arg1 == 24) {
				this.anInt2611 = arg0.method1396();
				if (this.anInt2611 == 65535) {
					this.anInt2611 = -1;
					return;
				}
			} else if (arg1 == 28) {
				this.anInt2631 = arg0.method1410();
			} else if (arg1 == 29) {
				this.anInt2641 = arg0.method1380();
				return;
			} else if (arg1 == 39) {
				this.anInt2628 = arg0.method1380() * 5;
				return;
			} else {
				if (arg1 >= 30 && arg1 < 35) {
					this.aClass65Array13[arg1 - 30] = arg0.method1400();
					if (this.aClass65Array13[arg1 - 30].method1788(Static102.aClass65_1261)) {
						this.aClass65Array13[arg1 - 30] = null;
						return;
					}
				} else if (arg1 == 40) {
					local25 = arg0.method1410();
					this.anIntArray385 = new int[local25];
					this.anIntArray383 = new int[local25];
					for (local50 = 0; local50 < local25; local50++) {
						this.anIntArray383[local50] = arg0.method1396();
						this.anIntArray385[local50] = arg0.method1396();
					}
				} else if (arg1 == 60) {
					this.anInt2646 = arg0.method1396();
					return;
				} else if (arg1 == 62) {
					this.aBoolean142 = true;
					return;
				} else if (arg1 == 64) {
					this.aBoolean137 = false;
					return;
				} else if (arg1 == 65) {
					this.anInt2614 = arg0.method1396();
					return;
				} else if (arg1 == 66) {
					this.anInt2639 = arg0.method1396();
					return;
				} else if (arg1 == 67) {
					this.anInt2617 = arg0.method1396();
					return;
				} else if (arg1 == 68) {
					this.anInt2642 = arg0.method1396();
					return;
				} else if (arg1 == 69) {
					this.anInt2618 = arg0.method1410();
					return;
				} else if (arg1 == 70) {
					this.anInt2632 = arg0.method1381();
					return;
				} else if (arg1 == 71) {
					this.anInt2636 = arg0.method1381();
					return;
				} else if (arg1 == 72) {
					this.anInt2633 = arg0.method1381();
					return;
				} else if (arg1 == 73) {
					this.aBoolean143 = true;
					return;
				} else if (arg1 == 74) {
					this.aBoolean144 = true;
					return;
				} else if (arg1 == 75) {
					this.anInt2644 = arg0.method1410();
					return;
				} else if (arg1 == 77) {
					this.anInt2651 = arg0.method1396();
					if (this.anInt2651 == 65535) {
						this.anInt2651 = -1;
					}
					this.anInt2630 = arg0.method1396();
					if (this.anInt2630 == 65535) {
						this.anInt2630 = -1;
					}
					local25 = arg0.method1410();
					this.anIntArray384 = new int[local25 + 1];
					for (local50 = 0; local50 <= local25; local50++) {
						this.anIntArray384[local50] = arg0.method1396();
						if (this.anIntArray384[local50] == 65535) {
							this.anIntArray384[local50] = -1;
						}
					}
					return;
				} else {
					if (arg1 == 78) {
						this.anInt2645 = arg0.method1396();
						this.anInt2622 = arg0.method1410();
					} else if (arg1 == 79) {
						this.anInt2640 = arg0.method1396();
						this.anInt2652 = arg0.method1396();
						this.anInt2622 = arg0.method1410();
						local25 = arg0.method1410();
						this.anIntArray386 = new int[local25];
						for (local50 = 0; local50 < local25; local50++) {
							this.anIntArray386[local50] = arg0.method1396();
						}
						return;
					}
					return;
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "(I)Z")
	public boolean method1618() {
		if (this.anIntArray384 == null) {
			return this.anInt2645 != -1 || this.anIntArray386 != null;
		}
		for (@Pc(28) int local28 = 0; local28 < this.anIntArray384.length; local28++) {
			if (this.anIntArray384[local28] != -1) {
				@Pc(44) Class2_Sub1_Sub14 local44 = Static29.method518(this.anIntArray384[local28]);
				if (local44.anInt2645 != -1 || local44.anIntArray386 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZBIZI)Lclient!r;")
	private Class2_Sub1_Sub1_Sub6 method1620(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class2_Sub1_Sub1_Sub6 local13 = null;
		@Pc(38) boolean local38;
		@Pc(42) int local42;
		@Pc(44) int local44;
		@Pc(50) int local50;
		if (this.anIntArray389 == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.anIntArray390 == null) {
				return null;
			}
			local38 = arg3 > 3 ^ this.aBoolean142;
			local42 = this.anIntArray390.length;
			for (local44 = 0; local44 < local42; local44++) {
				local50 = this.anIntArray390[local44];
				if (local38) {
					local50 += 65536;
				}
				local13 = (Class2_Sub1_Sub1_Sub6) Static60.aClass21_24.method744((long) local50);
				if (local13 == null) {
					local13 = Static86.method1543(Static108.aClass33_44, local50 & 0xFFFF);
					if (local13 == null) {
						return null;
					}
					if (local38) {
						local13.method1533();
					}
					Static60.aClass21_24.method745((long) local50, local13);
				}
				if (local42 > 1) {
					Static45.aClass2_Sub1_Sub1_Sub6Array1[local44] = local13;
				}
			}
			if (local42 > 1) {
				local13 = new Class2_Sub1_Sub1_Sub6(Static45.aClass2_Sub1_Sub1_Sub6Array1, local42);
			}
		} else {
			@Pc(111) int local111 = -1;
			for (local42 = 0; local42 < this.anIntArray389.length; local42++) {
				if (this.anIntArray389[local42] == arg1) {
					local111 = local42;
					break;
				}
			}
			if (local111 == -1) {
				return null;
			}
			local44 = this.anIntArray390[local111];
			@Pc(156) boolean local156 = arg3 > 3 ^ this.aBoolean142;
			if (local156) {
				local44 += 65536;
			}
			local13 = (Class2_Sub1_Sub1_Sub6) Static60.aClass21_24.method744((long) local44);
			if (local13 == null) {
				local13 = Static86.method1543(Static108.aClass33_44, local44 & 0xFFFF);
				if (local13 == null) {
					return null;
				}
				if (local156) {
					local13.method1533();
				}
				Static60.aClass21_24.method745((long) local44, local13);
			}
		}
		if (this.anInt2614 == 128 && this.anInt2639 == 128 && this.anInt2617 == 128) {
			local38 = false;
		} else {
			local38 = true;
		}
		@Pc(229) boolean local229;
		if (this.anInt2632 == 0 && this.anInt2636 == 0 && this.anInt2633 == 0) {
			local229 = false;
		} else {
			local229 = true;
		}
		@Pc(257) Class2_Sub1_Sub1_Sub6 local257 = new Class2_Sub1_Sub1_Sub6(local13, arg3 == 0 && !local38 && !local229, this.anIntArray383 == null, true);
		@Pc(261) int local261 = arg3 & 0x3;
		if (local261 == 1) {
			local257.method1539();
		} else if (local261 == 2) {
			local257.method1529();
		} else if (local261 == 3) {
			local257.method1541();
		}
		if (this.anIntArray383 != null) {
			for (local50 = 0; local50 < this.anIntArray383.length; local50++) {
				local257.method1515(this.anIntArray383[local50], this.anIntArray385[local50]);
			}
		}
		if (local38) {
			local257.method1517(this.anInt2614, this.anInt2639, this.anInt2617);
		}
		if (local229) {
			local257.method1528(this.anInt2632, this.anInt2636, this.anInt2633);
		}
		if (arg2) {
			local257.method1524();
		}
		local257.method1535(this.anInt2641 + 64, 768 - -(this.anInt2628 * 5), -50, -10, -50, arg0);
		return local257;
	}

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "(I)V")
	public void method1621() {
		if (this.anInt2616 == -1) {
			this.anInt2616 = 0;
			if (this.anIntArray390 != null && (this.anIntArray389 == null || this.anIntArray389[0] == 10)) {
				this.anInt2616 = 1;
			}
			for (@Pc(27) int local27 = 0; local27 < 5; local27++) {
				if (this.aClass65Array13[local27] != null) {
					this.anInt2616 = 1;
				}
			}
		}
		if (this.anInt2644 == -1) {
			this.anInt2644 = this.aBoolean140 ? 1 : 0;
		}
	}
}
