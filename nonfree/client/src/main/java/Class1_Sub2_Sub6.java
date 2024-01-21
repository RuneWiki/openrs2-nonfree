import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ef", name = "ab", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!ef", name = "cb", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!ef", name = "ib", descriptor = "[I")
	private int[] anIntArray167;

	@OriginalMember(owner = "client!ef", name = "lb", descriptor = "I")
	public int anInt858;

	@OriginalMember(owner = "client!ef", name = "qb", descriptor = "[I")
	public int[] anIntArray168;

	@OriginalMember(owner = "client!ef", name = "xb", descriptor = "[I")
	private int[] anIntArray169;

	@OriginalMember(owner = "client!ef", name = "Yb", descriptor = "[I")
	public int[] anIntArray171;

	@OriginalMember(owner = "client!ef", name = "N", descriptor = "Z")
	public boolean aBoolean29 = true;

	@OriginalMember(owner = "client!ef", name = "V", descriptor = "I")
	public int anInt847 = -1;

	@OriginalMember(owner = "client!ef", name = "bb", descriptor = "I")
	public int anInt852 = -1;

	@OriginalMember(owner = "client!ef", name = "kb", descriptor = "I")
	public int anInt857 = 1;

	@OriginalMember(owner = "client!ef", name = "pb", descriptor = "Z")
	public boolean aBoolean33 = false;

	@OriginalMember(owner = "client!ef", name = "Z", descriptor = "I")
	private int anInt851 = 128;

	@OriginalMember(owner = "client!ef", name = "P", descriptor = "Z")
	private boolean aBoolean30 = false;

	@OriginalMember(owner = "client!ef", name = "eb", descriptor = "Z")
	public boolean aBoolean32 = false;

	@OriginalMember(owner = "client!ef", name = "tb", descriptor = "I")
	public int anInt863 = -1;

	@OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
	public int anInt844 = 0;

	@OriginalMember(owner = "client!ef", name = "db", descriptor = "Z")
	public boolean aBoolean31 = false;

	@OriginalMember(owner = "client!ef", name = "ob", descriptor = "[Lclient!fc;")
	public final Class25[] aClass25Array4 = new Class25[5];

	@OriginalMember(owner = "client!ef", name = "Db", descriptor = "I")
	public int anInt867 = 0;

	@OriginalMember(owner = "client!ef", name = "nb", descriptor = "I")
	private int anInt860 = 0;

	@OriginalMember(owner = "client!ef", name = "gb", descriptor = "I")
	public int anInt854 = 0;

	@OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
	public int anInt843 = -1;

	@OriginalMember(owner = "client!ef", name = "Jb", descriptor = "I")
	public int anInt873 = 16;

	@OriginalMember(owner = "client!ef", name = "hb", descriptor = "I")
	private int anInt855 = 0;

	@OriginalMember(owner = "client!ef", name = "Eb", descriptor = "I")
	private int anInt868 = 0;

	@OriginalMember(owner = "client!ef", name = "Gb", descriptor = "I")
	private int anInt870 = -1;

	@OriginalMember(owner = "client!ef", name = "zb", descriptor = "Z")
	public boolean aBoolean34 = true;

	@OriginalMember(owner = "client!ef", name = "X", descriptor = "I")
	public int anInt849 = -1;

	@OriginalMember(owner = "client!ef", name = "Ob", descriptor = "I")
	private int anInt878 = 0;

	@OriginalMember(owner = "client!ef", name = "Hb", descriptor = "I")
	public int anInt871 = 2;

	@OriginalMember(owner = "client!ef", name = "Ib", descriptor = "I")
	private int anInt872 = 0;

	@OriginalMember(owner = "client!ef", name = "mb", descriptor = "I")
	public int anInt859 = 0;

	@OriginalMember(owner = "client!ef", name = "yb", descriptor = "I")
	private int anInt866 = 128;

	@OriginalMember(owner = "client!ef", name = "Nb", descriptor = "I")
	public int anInt877 = -1;

	@OriginalMember(owner = "client!ef", name = "ub", descriptor = "Lclient!fc;")
	public Class25 aClass25_359 = Static116.aClass25_1298;

	@OriginalMember(owner = "client!ef", name = "S", descriptor = "I")
	public int anInt845 = 1;

	@OriginalMember(owner = "client!ef", name = "Sb", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!ef", name = "Lb", descriptor = "I")
	private int anInt875 = 128;

	@OriginalMember(owner = "client!ef", name = "Ab", descriptor = "Z")
	public boolean aBoolean35 = false;

	@OriginalMember(owner = "client!ef", name = "Pb", descriptor = "I")
	private int anInt879 = -1;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BII)Lclient!ub;")
	private Class1_Sub2_Sub3_Sub7 method702(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class1_Sub2_Sub3_Sub7 local7 = null;
		@Pc(14) int local14;
		@Pc(46) int local46;
		@Pc(115) boolean local115;
		if (this.anIntArray167 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.anIntArray169 == null) {
				return null;
			}
			local115 = this.aBoolean30 ^ arg1 > 3;
			local14 = this.anIntArray169.length;
			for (local46 = 0; local46 < local14; local46++) {
				@Pc(127) int local127 = this.anIntArray169[local46];
				if (local115) {
					local127 += 65536;
				}
				local7 = (Class1_Sub2_Sub3_Sub7) Static68.aClass63_10.method1517((long) local127);
				if (local7 == null) {
					local7 = Static117.method1886(Static125.aClass56_74, local127 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local115) {
						local7.method1900();
					}
					Static68.aClass63_10.method1520(local7, (long) local127);
				}
				if (local14 > 1) {
					Static28.aClass1_Sub2_Sub3_Sub7Array1[local46] = local7;
				}
			}
			if (local14 > 1) {
				local7 = new Class1_Sub2_Sub3_Sub7(Static28.aClass1_Sub2_Sub3_Sub7Array1, local14);
			}
		} else {
			@Pc(12) int local12 = -1;
			for (local14 = 0; local14 < this.anIntArray167.length; local14++) {
				if (this.anIntArray167[local14] == arg0) {
					local12 = local14;
					break;
				}
			}
			if (local12 == -1) {
				return null;
			}
			local46 = this.anIntArray169[local12];
			@Pc(58) boolean local58 = arg1 > 3 ^ this.aBoolean30;
			if (local58) {
				local46 += 65536;
			}
			local7 = (Class1_Sub2_Sub3_Sub7) Static68.aClass63_10.method1517((long) local46);
			if (local7 == null) {
				local7 = Static117.method1886(Static125.aClass56_74, local46 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local58) {
					local7.method1900();
				}
				Static68.aClass63_10.method1520(local7, (long) local46);
			}
		}
		@Pc(212) boolean local212;
		if (this.anInt860 == 0 && this.anInt868 == 0 && this.anInt878 == 0) {
			local212 = false;
		} else {
			local212 = true;
		}
		if (this.anInt875 == 128 && this.anInt866 == 128 && this.anInt851 == 128) {
			local115 = false;
		} else {
			local115 = true;
		}
		@Pc(259) Class1_Sub2_Sub3_Sub7 local259 = new Class1_Sub2_Sub3_Sub7(local7, arg1 == 0 && !local115 && !local212, this.aShortArray2 == null, true);
		@Pc(263) int local263 = arg1 & 0x3;
		if (local263 == 1) {
			local259.method1894();
		} else if (local263 == 2) {
			local259.method1892();
		} else if (local263 == 3) {
			local259.method1885();
		}
		if (this.aShortArray2 != null) {
			for (@Pc(289) int local289 = 0; local289 < this.aShortArray2.length; local289++) {
				local259.method1888(this.aShortArray2[local289], this.aShortArray3[local289]);
			}
		}
		if (local115) {
			local259.method1897(this.anInt875, this.anInt866, this.anInt851);
		}
		if (local212) {
			local259.method1896(this.anInt860, this.anInt868, this.anInt878);
		}
		return local259;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BILclient!qe;IIIIII)Lclient!da;")
	public Class1_Sub2_Sub3_Sub2 method703(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub2_Sub17 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(28) long local28;
		if (this.anIntArray167 == null) {
			local28 = (this.anInt858 << 10) + arg2;
		} else {
			local28 = (this.anInt858 << 10) + (arg7 << 3) + arg2;
		}
		@Pc(44) Class1_Sub2_Sub3_Sub2 local44 = (Class1_Sub2_Sub3_Sub2) Static85.aClass63_16.method1517(local28);
		if (local44 == null) {
			@Pc(52) Class1_Sub2_Sub3_Sub7 local52 = this.method702(arg7, arg2);
			if (local52 == null) {
				return null;
			}
			local44 = local52.method1893(this.anInt872 + 64, this.anInt855 * 5 + 768, -50, -10, -50);
			Static85.aClass63_16.method1520(local44, local28);
		}
		if (arg1 == null && !this.aBoolean32) {
			return local44;
		}
		if (arg1 == null) {
			local44 = local44.method481(true);
		} else {
			local44 = arg1.method1679(arg2, arg4, local44);
		}
		if (this.aBoolean32) {
			local44.method460(arg5, arg3, arg6, arg0, false);
		}
		return local44;
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)V")
	public void method705() {
		if (this.anInt877 == -1) {
			this.anInt877 = 0;
			if (this.anIntArray169 != null && (this.anIntArray167 == null || this.anIntArray167[0] == 10)) {
				this.anInt877 = 1;
			}
			for (@Pc(27) int local27 = 0; local27 < 5; local27++) {
				if (this.aClass25Array4[local27] != null) {
					this.anInt877 = 1;
				}
			}
		}
		if (this.anInt849 == -1) {
			this.anInt849 = this.anInt871 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)Z")
	public boolean method706() {
		if (this.anIntArray171 == null) {
			return this.anInt863 != -1 || this.anIntArray168 != null;
		}
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray171.length; local22++) {
			if (this.anIntArray171[local22] != -1) {
				@Pc(38) Class1_Sub2_Sub6 local38 = Static78.method1315(this.anIntArray171[local22]);
				if (local38.anInt863 != -1 || local38.anIntArray168 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(Z)Lclient!ef;")
	public Class1_Sub2_Sub6 method707() {
		@Pc(1) int local1 = -1;
		if (this.anInt870 != -1) {
			local1 = Static49.method984(this.anInt870);
		} else if (this.anInt879 != -1) {
			local1 = Static95.anIntArray385[this.anInt879];
		}
		return local1 < 0 || this.anIntArray171.length <= local1 || this.anIntArray171[local1] == -1 ? null : Static78.method1315(this.anIntArray171[local1]);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZLclient!dc;)V")
	public void method709(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method672();
			if (local15 == 0) {
				return;
			}
			this.method714(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIII)Lclient!da;")
	public Class1_Sub2_Sub3_Sub2 method710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) long local10;
		if (this.anIntArray167 == null) {
			local10 = (this.anInt858 << 10) + arg3;
		} else {
			local10 = (arg1 << 3) + ((this.anInt858 << 10) + arg3);
		}
		@Pc(35) Class1_Sub2_Sub3_Sub2 local35 = (Class1_Sub2_Sub3_Sub2) Static85.aClass63_16.method1517(local10);
		if (local35 == null) {
			@Pc(43) Class1_Sub2_Sub3_Sub7 local43 = this.method702(arg1, arg3);
			if (local43 == null) {
				return null;
			}
			local35 = local43.method1893(this.anInt872 + 64, this.anInt855 * 5 + 768, -50, -10, -50);
			Static85.aClass63_16.method1520(local35, local10);
		}
		if (this.aBoolean32) {
			local35 = local35.method460(arg2, arg4, arg5, arg0, true);
		}
		return local35;
	}

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)Z")
	public boolean method712() {
		if (this.anIntArray169 == null) {
			return true;
		}
		@Pc(19) boolean local19 = true;
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray169.length; local21++) {
			local19 &= Static125.aClass56_74.method1265(this.anIntArray169[local21] & 0xFFFF, 0);
		}
		return local19;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!dc;BI)V")
	private void method714(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(2) int arg1) {
		@Pc(32) int local32;
		@Pc(51) int local51;
		if (arg1 == 1) {
			local32 = arg0.method672();
			if (local32 > 0) {
				if (this.anIntArray169 == null || Static27.aBoolean24) {
					this.anIntArray167 = new int[local32];
					this.anIntArray169 = new int[local32];
					for (local51 = 0; local51 < local32; local51++) {
						this.anIntArray169[local51] = arg0.method651();
						this.anIntArray167[local51] = arg0.method672();
					}
				} else {
					arg0.anInt792 += local32 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass25_359 = arg0.method654();
		} else if (arg1 == 5) {
			local32 = arg0.method672();
			if (local32 > 0) {
				if (this.anIntArray169 == null || Static27.aBoolean24) {
					this.anIntArray167 = null;
					this.anIntArray169 = new int[local32];
					for (local51 = 0; local51 < local32; local51++) {
						this.anIntArray169[local51] = arg0.method651();
					}
				} else {
					arg0.anInt792 += local32 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.anInt845 = arg0.method672();
		} else if (arg1 == 15) {
			this.anInt857 = arg0.method672();
		} else if (arg1 == 17) {
			this.aBoolean34 = false;
			this.anInt871 = 0;
		} else if (arg1 == 18) {
			this.aBoolean34 = false;
		} else if (arg1 == 19) {
			this.anInt877 = arg0.method672();
		} else if (arg1 == 21) {
			this.aBoolean32 = true;
		} else if (arg1 == 22) {
			this.aBoolean36 = true;
		} else if (arg1 == 23) {
			this.aBoolean31 = true;
		} else if (arg1 == 24) {
			this.anInt847 = arg0.method651();
			if (this.anInt847 == 65535) {
				this.anInt847 = -1;
			}
		} else if (arg1 == 27) {
			this.anInt871 = 1;
		} else if (arg1 == 28) {
			this.anInt873 = arg0.method672();
		} else if (arg1 == 29) {
			this.anInt872 = arg0.method643();
		} else if (arg1 == 39) {
			this.anInt855 = arg0.method643() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass25Array4[arg1 - 30] = arg0.method654();
			if (this.aClass25Array4[arg1 - 30].method786(Static78.aClass25_818)) {
				this.aClass25Array4[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local32 = arg0.method672();
			this.aShortArray3 = new short[local32];
			this.aShortArray2 = new short[local32];
			for (local51 = 0; local51 < local32; local51++) {
				this.aShortArray2[local51] = (short) arg0.method651();
				this.aShortArray3[local51] = (short) arg0.method651();
			}
		} else if (arg1 == 60) {
			this.anInt843 = arg0.method651();
		} else if (arg1 == 62) {
			this.aBoolean30 = true;
		} else if (arg1 == 64) {
			this.aBoolean29 = false;
		} else if (arg1 == 65) {
			this.anInt875 = arg0.method651();
		} else if (arg1 == 66) {
			this.anInt866 = arg0.method651();
		} else if (arg1 == 67) {
			this.anInt851 = arg0.method651();
		} else if (arg1 == 68) {
			this.anInt852 = arg0.method651();
		} else if (arg1 == 69) {
			this.anInt854 = arg0.method672();
		} else if (arg1 == 70) {
			this.anInt860 = arg0.method668();
		} else if (arg1 == 71) {
			this.anInt868 = arg0.method668();
		} else if (arg1 == 72) {
			this.anInt878 = arg0.method668();
		} else if (arg1 == 73) {
			this.aBoolean35 = true;
		} else if (arg1 == 74) {
			this.aBoolean33 = true;
		} else if (arg1 == 75) {
			this.anInt849 = arg0.method672();
		} else if (arg1 == 77) {
			this.anInt870 = arg0.method651();
			if (this.anInt870 == 65535) {
				this.anInt870 = -1;
			}
			this.anInt879 = arg0.method651();
			if (this.anInt879 == 65535) {
				this.anInt879 = -1;
			}
			local32 = arg0.method672();
			this.anIntArray171 = new int[local32 + 1];
			for (local51 = 0; local51 <= local32; local51++) {
				this.anIntArray171[local51] = arg0.method651();
				if (this.anIntArray171[local51] == 65535) {
					this.anIntArray171[local51] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.anInt863 = arg0.method651();
			this.anInt844 = arg0.method672();
		} else if (arg1 == 79) {
			this.anInt859 = arg0.method651();
			this.anInt867 = arg0.method651();
			this.anInt844 = arg0.method672();
			local32 = arg0.method672();
			this.anIntArray168 = new int[local32];
			for (local51 = 0; local51 < local32; local51++) {
				this.anIntArray168[local51] = arg0.method651();
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Z")
	public boolean method716(@OriginalArg(1) int arg0) {
		if (this.anIntArray167 != null) {
			for (@Pc(57) int local57 = 0; local57 < this.anIntArray167.length; local57++) {
				if (this.anIntArray167[local57] == arg0) {
					return Static125.aClass56_74.method1265(this.anIntArray169[local57] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray169 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(30) boolean local30 = true;
			for (@Pc(32) int local32 = 0; local32 < this.anIntArray169.length; local32++) {
				local30 &= Static125.aClass56_74.method1265(this.anIntArray169[local32] & 0xFFFF, 0);
			}
			return local30;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(IIIIIII)Lclient!qb;")
	public Class1_Sub2_Sub3 method717(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33;
		if (this.anIntArray167 == null) {
			local33 = arg3 + (this.anInt858 << 10);
		} else {
			local33 = (arg5 << 3) + (this.anInt858 << 10) + arg3;
		}
		@Pc(49) Class1_Sub2_Sub3 local49 = (Class1_Sub2_Sub3) Static78.aClass63_14.method1517(local33);
		if (local49 == null) {
			@Pc(57) Class1_Sub2_Sub3_Sub7 local57 = this.method702(arg5, arg3);
			if (local57 == null) {
				return null;
			}
			if (this.aBoolean36) {
				local57.aShort1 = (short) (this.anInt872 + 64);
				local57.aShort2 = (short) (this.anInt855 * 5 + 768);
				local49 = local57;
				local57.method1898();
			} else {
				local49 = local57.method1893(this.anInt872 + 64, this.anInt855 * 5 + 768, -50, -10, -50);
			}
			Static78.aClass63_14.method1520(local49, local33);
		}
		if (this.aBoolean36) {
			local49 = ((Class1_Sub2_Sub3_Sub7) local49).method1889();
		}
		if (this.aBoolean32) {
			if (local49 instanceof Class1_Sub2_Sub3_Sub2) {
				local49 = ((Class1_Sub2_Sub3_Sub2) local49).method460(arg4, arg1, arg0, arg2, true);
			} else if (local49 instanceof Class1_Sub2_Sub3_Sub7) {
				local49 = ((Class1_Sub2_Sub3_Sub7) local49).method1881(arg4, arg1, arg0, arg2);
			}
		}
		return local49;
	}
}
