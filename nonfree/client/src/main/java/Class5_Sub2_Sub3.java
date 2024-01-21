import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class5_Sub2_Sub3 extends Class5_Sub2 {

	@OriginalMember(owner = "client!be", name = "T", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!be", name = "Y", descriptor = "I")
	public int anInt234;

	@OriginalMember(owner = "client!be", name = "Z", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!be", name = "wb", descriptor = "[I")
	public int[] anIntArray29;

	@OriginalMember(owner = "client!be", name = "Hb", descriptor = "[I")
	public int[] anIntArray30;

	@OriginalMember(owner = "client!be", name = "Yb", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!be", name = "pb", descriptor = "I")
	public int anInt249 = 0;

	@OriginalMember(owner = "client!be", name = "bb", descriptor = "I")
	private int anInt235 = -1;

	@OriginalMember(owner = "client!be", name = "mb", descriptor = "I")
	public int anInt246 = 0;

	@OriginalMember(owner = "client!be", name = "db", descriptor = "I")
	public int anInt237 = 2000;

	@OriginalMember(owner = "client!be", name = "fb", descriptor = "I")
	private int anInt239 = -1;

	@OriginalMember(owner = "client!be", name = "sb", descriptor = "I")
	private int anInt250 = -1;

	@OriginalMember(owner = "client!be", name = "Bb", descriptor = "I")
	private int anInt256 = -1;

	@OriginalMember(owner = "client!be", name = "qb", descriptor = "[Lclient!mb;")
	public Class45[] aClass45Array1 = new Class45[] { null, null, null, null, Static89.aClass45_1049 };

	@OriginalMember(owner = "client!be", name = "Eb", descriptor = "I")
	private int anInt259 = 128;

	@OriginalMember(owner = "client!be", name = "X", descriptor = "I")
	private int anInt233 = 0;

	@OriginalMember(owner = "client!be", name = "kb", descriptor = "I")
	private int anInt244 = -1;

	@OriginalMember(owner = "client!be", name = "Jb", descriptor = "Z")
	public boolean aBoolean9 = false;

	@OriginalMember(owner = "client!be", name = "hb", descriptor = "I")
	public int anInt241 = 1;

	@OriginalMember(owner = "client!be", name = "Mb", descriptor = "I")
	private int anInt264 = -1;

	@OriginalMember(owner = "client!be", name = "vb", descriptor = "I")
	public int anInt253 = 0;

	@OriginalMember(owner = "client!be", name = "gb", descriptor = "I")
	public int anInt240 = 0;

	@OriginalMember(owner = "client!be", name = "U", descriptor = "I")
	private int anInt231 = -1;

	@OriginalMember(owner = "client!be", name = "V", descriptor = "I")
	public int anInt232 = -1;

	@OriginalMember(owner = "client!be", name = "Ob", descriptor = "I")
	private int anInt266 = -1;

	@OriginalMember(owner = "client!be", name = "Db", descriptor = "I")
	private int anInt258 = -1;

	@OriginalMember(owner = "client!be", name = "Sb", descriptor = "I")
	public int anInt270 = 0;

	@OriginalMember(owner = "client!be", name = "Qb", descriptor = "I")
	public int anInt268 = 0;

	@OriginalMember(owner = "client!be", name = "lb", descriptor = "I")
	private int anInt245 = 0;

	@OriginalMember(owner = "client!be", name = "Vb", descriptor = "I")
	private int anInt273 = -1;

	@OriginalMember(owner = "client!be", name = "xb", descriptor = "I")
	public int anInt254 = 0;

	@OriginalMember(owner = "client!be", name = "Rb", descriptor = "I")
	public int anInt269 = 0;

	@OriginalMember(owner = "client!be", name = "Ib", descriptor = "I")
	private int anInt261 = 128;

	@OriginalMember(owner = "client!be", name = "Wb", descriptor = "[Lclient!mb;")
	public Class45[] aClass45Array2 = new Class45[] { null, null, Static112.aClass45_1290, null, null };

	@OriginalMember(owner = "client!be", name = "Pb", descriptor = "I")
	private int anInt267 = 128;

	@OriginalMember(owner = "client!be", name = "ab", descriptor = "Lclient!mb;")
	public Class45 aClass45_108 = Static111.aClass45_1275;

	@OriginalMember(owner = "client!be", name = "Zb", descriptor = "I")
	public int anInt275 = -1;

	@OriginalMember(owner = "client!be", name = "Xb", descriptor = "I")
	public int anInt274 = 0;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)Lclient!dd;")
	public Class5_Sub2_Sub4_Sub2 method160(@OriginalArg(0) int arg0) {
		if (this.anIntArray30 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (this.anIntArray29[local15] <= arg0 && this.anIntArray29[local15] != 0) {
					local13 = this.anIntArray30[local15];
				}
			}
			if (local13 != -1) {
				return Static81.method1515(local13).method160(1);
			}
		}
		@Pc(60) Class5_Sub2_Sub4_Sub2 local60 = (Class5_Sub2_Sub4_Sub2) Static10.aClass67_2.method1823((long) this.anInt234);
		if (local60 != null) {
			return local60;
		}
		@Pc(70) Class5_Sub2_Sub4_Sub7 local70 = Static83.method1570(Static77.aClass29_51, this.anInt230);
		if (local70 == null) {
			return null;
		}
		if (this.anInt261 != 128 || this.anInt267 != 128 || this.anInt259 != 128) {
			local70.method1587(this.anInt261, this.anInt267, this.anInt259);
		}
		if (this.aShortArray1 != null) {
			for (@Pc(105) int local105 = 0; local105 < this.aShortArray1.length; local105++) {
				local70.method1575(this.aShortArray1[local105], this.aShortArray2[local105]);
			}
		}
		local60 = local70.method1579(this.anInt240 + 64, this.anInt254 + 768, -50, -10, -50);
		local60.aBoolean28 = true;
		Static10.aClass67_2.method1818(local60, (long) this.anInt234);
		return local60;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZB)Lclient!pa;")
	public Class5_Sub2_Sub4_Sub7 method162(@OriginalArg(0) boolean arg0) {
		@Pc(14) int local14 = this.anInt256;
		@Pc(17) int local17 = this.anInt239;
		if (arg0) {
			local14 = this.anInt235;
			local17 = this.anInt231;
		}
		if (local14 == -1) {
			return null;
		}
		@Pc(36) Class5_Sub2_Sub4_Sub7 local36 = Static83.method1570(Static77.aClass29_51, local14);
		if (local17 != -1) {
			@Pc(45) Class5_Sub2_Sub4_Sub7 local45 = Static83.method1570(Static77.aClass29_51, local17);
			@Pc(56) Class5_Sub2_Sub4_Sub7[] local56 = new Class5_Sub2_Sub4_Sub7[] { local36, local45 };
			local36 = new Class5_Sub2_Sub4_Sub7(local56, 2);
		}
		if (this.aShortArray1 != null) {
			for (@Pc(67) int local67 = 0; local67 < this.aShortArray1.length; local67++) {
				local36.method1575(this.aShortArray1[local67], this.aShortArray2[local67]);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)Lclient!pa;")
	public Class5_Sub2_Sub4_Sub7 method164(@OriginalArg(1) boolean arg0) {
		@Pc(9) int local9 = this.anInt264;
		@Pc(12) int local12 = this.anInt258;
		@Pc(15) int local15 = this.anInt273;
		if (arg0) {
			local9 = this.anInt266;
			local12 = this.anInt244;
			local15 = this.anInt250;
		}
		if (local12 == -1) {
			return null;
		}
		@Pc(41) Class5_Sub2_Sub4_Sub7 local41 = Static83.method1570(Static77.aClass29_51, local12);
		if (local15 != -1) {
			@Pc(49) Class5_Sub2_Sub4_Sub7 local49 = Static83.method1570(Static77.aClass29_51, local15);
			if (local9 == -1) {
				@Pc(63) Class5_Sub2_Sub4_Sub7[] local63 = new Class5_Sub2_Sub4_Sub7[] { local41, local49 };
				local41 = new Class5_Sub2_Sub4_Sub7(local63, 2);
			} else {
				@Pc(76) Class5_Sub2_Sub4_Sub7 local76 = Static83.method1570(Static77.aClass29_51, local9);
				@Pc(91) Class5_Sub2_Sub4_Sub7[] local91 = new Class5_Sub2_Sub4_Sub7[] { local41, local49, local76 };
				local41 = new Class5_Sub2_Sub4_Sub7(local91, 3);
			}
		}
		if (!arg0 && this.anInt245 != 0) {
			local41.method1582(0, this.anInt245, 0);
		}
		if (arg0 && this.anInt233 != 0) {
			local41.method1582(0, this.anInt233, 0);
		}
		if (this.aShortArray1 != null) {
			for (@Pc(127) int local127 = 0; local127 < this.aShortArray1.length; local127++) {
				local41.method1575(this.aShortArray1[local127], this.aShortArray2[local127]);
			}
		}
		return local41;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(IZ)Lclient!pa;")
	public Class5_Sub2_Sub4_Sub7 method165(@OriginalArg(0) int arg0) {
		@Pc(20) int local20;
		if (this.anIntArray30 != null && arg0 > 1) {
			@Pc(18) int local18 = -1;
			for (local20 = 0; local20 < 10; local20++) {
				if (arg0 >= this.anIntArray29[local20] && this.anIntArray29[local20] != 0) {
					local18 = this.anIntArray30[local20];
				}
			}
			if (local18 != -1) {
				return Static81.method1515(local18).method165(1);
			}
		}
		@Pc(57) Class5_Sub2_Sub4_Sub7 local57 = Static83.method1570(Static77.aClass29_51, this.anInt230);
		if (local57 == null) {
			return null;
		}
		if (this.anInt261 != 128 || this.anInt267 != 128 || this.anInt259 != 128) {
			local57.method1587(this.anInt261, this.anInt267, this.anInt259);
		}
		if (this.aShortArray1 != null) {
			for (local20 = 0; local20 < this.aShortArray1.length; local20++) {
				local57.method1575(this.aShortArray1[local20], this.aShortArray2[local20]);
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BZ)Z")
	public boolean method166(@OriginalArg(1) boolean arg0) {
		@Pc(2) int local2 = this.anInt256;
		@Pc(14) int local14 = this.anInt239;
		if (arg0) {
			local14 = this.anInt231;
			local2 = this.anInt235;
		}
		if (local2 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static77.aClass29_51.method739(local2, 0)) {
			local30 = false;
		}
		if (local14 != -1 && !Static77.aClass29_51.method739(local14, 0)) {
			local30 = false;
		}
		return local30;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IBLclient!hb;)V")
	private void method167(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt230 = arg1.method1418();
		} else if (arg0 == 2) {
			this.aClass45_108 = arg1.method1448();
		} else if (arg0 == 4) {
			this.anInt237 = arg1.method1418();
		} else if (arg0 == 5) {
			this.anInt246 = arg1.method1418();
		} else if (arg0 == 6) {
			this.anInt269 = arg1.method1418();
		} else if (arg0 == 7) {
			this.anInt270 = arg1.method1418();
			if (this.anInt270 > 32767) {
				this.anInt270 -= 65536;
			}
		} else if (arg0 == 8) {
			this.anInt249 = arg1.method1418();
			if (this.anInt249 > 32767) {
				this.anInt249 -= 65536;
			}
		} else if (arg0 == 11) {
			this.anInt268 = 1;
		} else if (arg0 == 12) {
			this.anInt241 = arg1.method1434();
		} else if (arg0 == 16) {
			this.aBoolean9 = true;
		} else if (arg0 == 23) {
			this.anInt258 = arg1.method1418();
			this.anInt245 = arg1.method1408();
		} else if (arg0 == 24) {
			this.anInt273 = arg1.method1418();
		} else if (arg0 == 25) {
			this.anInt244 = arg1.method1418();
			this.anInt233 = arg1.method1408();
		} else if (arg0 == 26) {
			this.anInt250 = arg1.method1418();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass45Array2[arg0 - 30] = arg1.method1448();
			if (this.aClass45Array2[arg0 - 30].method1330(Static50.aClass45_642)) {
				this.aClass45Array2[arg0 - 30] = null;
			}
		} else if (arg0 >= 35 && arg0 < 40) {
			this.aClass45Array1[arg0 - 35] = arg1.method1448();
		} else if (arg0 == 40) {
			@Pc(185) int local185 = arg1.method1408();
			this.aShortArray2 = new short[local185];
			this.aShortArray1 = new short[local185];
			for (@Pc(195) int local195 = 0; local195 < local185; local195++) {
				this.aShortArray1[local195] = (short) arg1.method1418();
				this.aShortArray2[local195] = (short) arg1.method1418();
			}
		} else if (arg0 == 78) {
			this.anInt264 = arg1.method1418();
		} else if (arg0 == 79) {
			this.anInt266 = arg1.method1418();
		} else if (arg0 == 90) {
			this.anInt256 = arg1.method1418();
		} else if (arg0 == 91) {
			this.anInt235 = arg1.method1418();
		} else if (arg0 == 92) {
			this.anInt239 = arg1.method1418();
		} else if (arg0 == 93) {
			this.anInt231 = arg1.method1418();
		} else if (arg0 == 95) {
			this.anInt253 = arg1.method1418();
		} else if (arg0 == 97) {
			this.anInt232 = arg1.method1418();
		} else if (arg0 == 98) {
			this.anInt275 = arg1.method1418();
		} else if (arg0 >= 100 && arg0 < 110) {
			if (this.anIntArray30 == null) {
				this.anIntArray29 = new int[10];
				this.anIntArray30 = new int[10];
			}
			this.anIntArray30[arg0 - 100] = arg1.method1418();
			this.anIntArray29[arg0 - 100] = arg1.method1418();
		} else if (arg0 == 110) {
			this.anInt261 = arg1.method1418();
		} else if (arg0 == 111) {
			this.anInt267 = arg1.method1418();
		} else if (arg0 == 112) {
			this.anInt259 = arg1.method1418();
		} else if (arg0 == 113) {
			this.anInt240 = arg1.method1447();
		} else if (arg0 == 114) {
			this.anInt254 = arg1.method1447() * 5;
		} else if (arg0 == 115) {
			this.anInt274 = arg1.method1408();
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(IZ)Z")
	public boolean method168(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt258;
		@Pc(9) int local9 = this.anInt264;
		@Pc(12) int local12 = this.anInt273;
		if (arg0) {
			local6 = this.anInt244;
			local9 = this.anInt266;
			local12 = this.anInt250;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(36) boolean local36 = true;
		if (!Static77.aClass29_51.method739(local6, 0)) {
			local36 = false;
		}
		if (local12 != -1 && !Static77.aClass29_51.method739(local12, 0)) {
			local36 = false;
		}
		if (local9 != -1 && !Static77.aClass29_51.method739(local9, 0)) {
			local36 = false;
		}
		return local36;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!be;Lclient!be;I)V")
	public void method169(@OriginalArg(0) Class5_Sub2_Sub3 arg0, @OriginalArg(1) Class5_Sub2_Sub3 arg1) {
		this.anInt249 = arg0.anInt249;
		this.aBoolean9 = arg1.aBoolean9;
		this.anInt246 = arg0.anInt246;
		this.aShortArray2 = arg0.aShortArray2;
		this.anInt237 = arg0.anInt237;
		this.anInt268 = 1;
		this.aShortArray1 = arg0.aShortArray1;
		this.anInt241 = arg1.anInt241;
		this.anInt230 = arg0.anInt230;
		this.anInt253 = arg0.anInt253;
		this.anInt270 = arg0.anInt270;
		this.aClass45_108 = arg1.aClass45_108;
		this.anInt269 = arg0.anInt269;
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V")
	public void method172() {
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!hb;)V")
	public void method174(@OriginalArg(1) Class5_Sub9 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method1408();
			if (local11 == 0) {
				return;
			}
			this.method167(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(II)Lclient!be;")
	public Class5_Sub2_Sub3 method175(@OriginalArg(1) int arg0) {
		if (this.anIntArray30 != null && arg0 > 1) {
			@Pc(18) int local18 = -1;
			for (@Pc(20) int local20 = 0; local20 < 10; local20++) {
				if (arg0 >= this.anIntArray29[local20] && this.anIntArray29[local20] != 0) {
					local18 = this.anIntArray30[local20];
				}
			}
			if (local18 != -1) {
				return Static81.method1515(local18);
			}
		}
		return this;
	}
}
