import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bc", name = "V", descriptor = "[I")
	public int[] anIntArray19;

	@OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
	private int anInt187;

	@OriginalMember(owner = "client!bc", name = "Y", descriptor = "I")
	public int anInt189;

	@OriginalMember(owner = "client!bc", name = "nb", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!bc", name = "ub", descriptor = "[I")
	public int[] anIntArray21;

	@OriginalMember(owner = "client!bc", name = "Xb", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!bc", name = "ab", descriptor = "I")
	private int anInt190 = -1;

	@OriginalMember(owner = "client!bc", name = "fb", descriptor = "I")
	public int anInt195 = 0;

	@OriginalMember(owner = "client!bc", name = "rb", descriptor = "I")
	public int anInt204 = -1;

	@OriginalMember(owner = "client!bc", name = "wb", descriptor = "I")
	private int anInt208 = -1;

	@OriginalMember(owner = "client!bc", name = "zb", descriptor = "I")
	public int anInt210 = 1;

	@OriginalMember(owner = "client!bc", name = "sb", descriptor = "I")
	private int anInt205 = 0;

	@OriginalMember(owner = "client!bc", name = "mb", descriptor = "I")
	public int anInt200 = 0;

	@OriginalMember(owner = "client!bc", name = "gb", descriptor = "I")
	public int anInt196 = 2000;

	@OriginalMember(owner = "client!bc", name = "hb", descriptor = "[Lclient!mc;")
	public Class42[] aClass42Array1 = new Class42[] { null, null, null, null, Static65.aClass42_835 };

	@OriginalMember(owner = "client!bc", name = "kb", descriptor = "I")
	private int anInt198 = 128;

	@OriginalMember(owner = "client!bc", name = "yb", descriptor = "Z")
	public boolean aBoolean8 = false;

	@OriginalMember(owner = "client!bc", name = "Bb", descriptor = "I")
	private int anInt212 = -1;

	@OriginalMember(owner = "client!bc", name = "T", descriptor = "I")
	public int anInt185 = 0;

	@OriginalMember(owner = "client!bc", name = "Fb", descriptor = "I")
	private int anInt216 = -1;

	@OriginalMember(owner = "client!bc", name = "Lb", descriptor = "[Lclient!mc;")
	public Class42[] aClass42Array2 = new Class42[] { null, null, Static101.aClass42_1391, null, null };

	@OriginalMember(owner = "client!bc", name = "Ib", descriptor = "Z")
	public boolean aBoolean9 = false;

	@OriginalMember(owner = "client!bc", name = "Eb", descriptor = "I")
	private int anInt215 = 128;

	@OriginalMember(owner = "client!bc", name = "tb", descriptor = "I")
	private int anInt206 = -1;

	@OriginalMember(owner = "client!bc", name = "pb", descriptor = "I")
	private int anInt202 = -1;

	@OriginalMember(owner = "client!bc", name = "qb", descriptor = "I")
	private int anInt203 = -1;

	@OriginalMember(owner = "client!bc", name = "Nb", descriptor = "I")
	public int anInt222 = 0;

	@OriginalMember(owner = "client!bc", name = "Kb", descriptor = "I")
	private int anInt220 = 128;

	@OriginalMember(owner = "client!bc", name = "Pb", descriptor = "I")
	private int anInt224 = -1;

	@OriginalMember(owner = "client!bc", name = "Ab", descriptor = "I")
	public int anInt211 = -1;

	@OriginalMember(owner = "client!bc", name = "Vb", descriptor = "I")
	public int anInt228 = 0;

	@OriginalMember(owner = "client!bc", name = "Wb", descriptor = "I")
	public int anInt229 = 0;

	@OriginalMember(owner = "client!bc", name = "xb", descriptor = "I")
	public int anInt209 = 0;

	@OriginalMember(owner = "client!bc", name = "Tb", descriptor = "I")
	private int anInt226 = -1;

	@OriginalMember(owner = "client!bc", name = "Cb", descriptor = "I")
	public int anInt213 = 0;

	@OriginalMember(owner = "client!bc", name = "Gb", descriptor = "I")
	private int anInt217 = -1;

	@OriginalMember(owner = "client!bc", name = "Qb", descriptor = "Lclient!mc;")
	public Class42 aClass42_120 = Static25.aClass42_394;

	@OriginalMember(owner = "client!bc", name = "Zb", descriptor = "I")
	private int anInt231 = 0;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V")
	public void method146() {
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)Z")
	public boolean method148(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt203;
		@Pc(9) int local9 = this.anInt208;
		@Pc(12) int local12 = this.anInt226;
		if (arg0) {
			local12 = this.anInt216;
			local6 = this.anInt202;
			local9 = this.anInt217;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static106.aClass33_33.method1310(0, local6)) {
			local30 = false;
		}
		if (local9 != -1 && !Static106.aClass33_33.method1310(0, local9)) {
			local30 = false;
		}
		if (local12 != -1 && !Static106.aClass33_33.method1310(0, local12)) {
			local30 = false;
		}
		return local30;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)Z")
	public boolean method149(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt190;
		@Pc(9) int local9 = this.anInt224;
		if (arg0) {
			local9 = this.anInt206;
			local6 = this.anInt212;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(24) boolean local24 = true;
		if (!Static106.aClass33_33.method1310(0, local6)) {
			local24 = false;
		}
		if (local9 != -1 && !Static106.aClass33_33.method1310(0, local9)) {
			local24 = false;
		}
		return local24;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZIZ)Lclient!pc;")
	public Class1_Sub1_Sub8_Sub3 method151(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(21) int local21;
		if (this.anIntArray21 != null && arg1 > 1) {
			@Pc(19) int local19 = -1;
			for (local21 = 0; local21 < 10; local21++) {
				if (arg1 >= this.anIntArray19[local21] && this.anIntArray19[local21] != 0) {
					local19 = this.anIntArray21[local21];
				}
			}
			if (local19 != -1) {
				return Static36.method617(local19).method151(arg0, 1);
			}
		}
		@Pc(67) Class1_Sub1_Sub8_Sub3 local67;
		if (arg0) {
			local67 = (Class1_Sub1_Sub8_Sub3) Static42.aClass37_27.method982((long) this.anInt189);
			if (local67 != null) {
				return local67;
			}
		}
		local67 = Static76.method1372(Static106.aClass33_33, this.anInt187);
		if (local67 == null) {
			return null;
		}
		if (this.anInt215 != 128 || this.anInt198 != 128 || this.anInt220 != 128) {
			local67.method1364(this.anInt215, this.anInt198, this.anInt220);
		}
		if (this.anIntArray22 != null) {
			for (local21 = 0; local21 < this.anIntArray22.length; local21++) {
				local67.method1383(this.anIntArray22[local21], this.anIntArray20[local21]);
			}
		}
		if (arg0) {
			local67.method1394(this.anInt195 + 64, this.anInt185 + 768, -50, -10, -50, true);
			local67.aBoolean108 = true;
			Static42.aClass37_27.method981((long) this.anInt189, local67);
		}
		return local67;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!ka;B)V")
	public void method152(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1186();
			if (local3 == 0) {
				return;
			}
			this.method161(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZZ)Lclient!pc;")
	public Class1_Sub1_Sub8_Sub3 method156(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.anInt203;
		@Pc(11) int local11 = this.anInt226;
		@Pc(14) int local14 = this.anInt208;
		if (arg0) {
			local8 = this.anInt202;
			local14 = this.anInt217;
			local11 = this.anInt216;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(36) Class1_Sub1_Sub8_Sub3 local36 = Static76.method1372(Static106.aClass33_33, local8);
		if (local14 != -1) {
			@Pc(49) Class1_Sub1_Sub8_Sub3 local49 = Static76.method1372(Static106.aClass33_33, local14);
			if (local11 == -1) {
				@Pc(63) Class1_Sub1_Sub8_Sub3[] local63 = new Class1_Sub1_Sub8_Sub3[] { local36, local49 };
				local36 = new Class1_Sub1_Sub8_Sub3(local63, 2);
			} else {
				@Pc(76) Class1_Sub1_Sub8_Sub3 local76 = Static76.method1372(Static106.aClass33_33, local11);
				@Pc(91) Class1_Sub1_Sub8_Sub3[] local91 = new Class1_Sub1_Sub8_Sub3[] { local36, local49, local76 };
				local36 = new Class1_Sub1_Sub8_Sub3(local91, 3);
			}
		}
		if (!arg0 && this.anInt231 != 0) {
			local36.method1375(0, this.anInt231, 0);
		}
		if (arg0 && this.anInt205 != 0) {
			local36.method1375(0, this.anInt205, 0);
		}
		if (this.anIntArray22 != null) {
			for (@Pc(127) int local127 = 0; local127 < this.anIntArray22.length; local127++) {
				local36.method1383(this.anIntArray22[local127], this.anIntArray20[local127]);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!bc;BLclient!bc;)V")
	public void method158(@OriginalArg(0) Class1_Sub1_Sub2 arg0, @OriginalArg(2) Class1_Sub1_Sub2 arg1) {
		this.anInt229 = arg0.anInt229;
		this.aClass42_120 = arg1.aClass42_120;
		this.anInt200 = arg0.anInt200;
		this.anInt187 = arg0.anInt187;
		this.anInt213 = arg0.anInt213;
		this.anInt222 = arg0.anInt222;
		this.aBoolean8 = true;
		this.anIntArray22 = arg0.anIntArray22;
		this.anIntArray20 = arg0.anIntArray20;
		this.anInt196 = arg0.anInt196;
		this.anInt209 = arg0.anInt209;
		this.anInt210 = arg1.anInt210;
		this.aBoolean9 = arg1.aBoolean9;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(ZI)Lclient!pc;")
	public Class1_Sub1_Sub8_Sub3 method159(@OriginalArg(0) boolean arg0) {
		@Pc(4) int local4 = this.anInt224;
		@Pc(7) int local7 = this.anInt190;
		if (arg0) {
			local7 = this.anInt212;
			local4 = this.anInt206;
		}
		if (local7 == -1) {
			return null;
		}
		@Pc(30) Class1_Sub1_Sub8_Sub3 local30 = Static76.method1372(Static106.aClass33_33, local7);
		if (local4 != -1) {
			@Pc(38) Class1_Sub1_Sub8_Sub3 local38 = Static76.method1372(Static106.aClass33_33, local4);
			@Pc(49) Class1_Sub1_Sub8_Sub3[] local49 = new Class1_Sub1_Sub8_Sub3[] { local30, local38 };
			local30 = new Class1_Sub1_Sub8_Sub3(local49, 2);
		}
		if (this.anIntArray22 != null) {
			for (@Pc(65) int local65 = 0; local65 < this.anIntArray22.length; local65++) {
				local30.method1383(this.anIntArray22[local65], this.anIntArray20[local65]);
			}
		}
		return local30;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!ka;B)V")
	private void method161(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt187 = arg1.method1199();
		} else if (arg0 == 2) {
			this.aClass42_120 = arg1.method1201();
		} else if (arg0 == 4) {
			this.anInt196 = arg1.method1199();
		} else if (arg0 == 5) {
			this.anInt209 = arg1.method1199();
		} else if (arg0 == 6) {
			this.anInt222 = arg1.method1199();
		} else if (arg0 == 7) {
			this.anInt229 = arg1.method1199();
			if (this.anInt229 > 32767) {
				this.anInt229 -= 65536;
			}
		} else if (arg0 == 8) {
			this.anInt200 = arg1.method1199();
			if (this.anInt200 > 32767) {
				this.anInt200 -= 65536;
			}
		} else if (arg0 == 10) {
			arg1.method1199();
		} else if (arg0 == 11) {
			this.aBoolean8 = true;
		} else if (arg0 == 12) {
			this.anInt210 = arg1.method1188();
		} else if (arg0 == 16) {
			this.aBoolean9 = true;
		} else if (arg0 == 23) {
			this.anInt203 = arg1.method1199();
			this.anInt231 = arg1.method1186();
		} else if (arg0 == 24) {
			this.anInt208 = arg1.method1199();
		} else if (arg0 == 25) {
			this.anInt202 = arg1.method1199();
			this.anInt205 = arg1.method1186();
		} else if (arg0 == 26) {
			this.anInt217 = arg1.method1199();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass42Array2[arg0 - 30] = arg1.method1201();
			if (this.aClass42Array2[arg0 - 30].method1040(Static107.aClass42_1423)) {
				this.aClass42Array2[arg0 - 30] = null;
			}
		} else if (arg0 >= 35 && arg0 < 40) {
			this.aClass42Array1[arg0 - 35] = arg1.method1201();
		} else if (arg0 == 40) {
			@Pc(181) int local181 = arg1.method1186();
			this.anIntArray20 = new int[local181];
			this.anIntArray22 = new int[local181];
			for (@Pc(191) int local191 = 0; local191 < local181; local191++) {
				this.anIntArray22[local191] = arg1.method1199();
				this.anIntArray20[local191] = arg1.method1199();
			}
		} else if (arg0 == 78) {
			this.anInt226 = arg1.method1199();
		} else if (arg0 == 79) {
			this.anInt216 = arg1.method1199();
		} else if (arg0 == 90) {
			this.anInt190 = arg1.method1199();
		} else if (arg0 == 91) {
			this.anInt212 = arg1.method1199();
		} else if (arg0 == 92) {
			this.anInt224 = arg1.method1199();
		} else if (arg0 == 93) {
			this.anInt206 = arg1.method1199();
		} else if (arg0 == 95) {
			this.anInt213 = arg1.method1199();
		} else if (arg0 == 97) {
			this.anInt211 = arg1.method1199();
		} else if (arg0 == 98) {
			this.anInt204 = arg1.method1199();
		} else if (arg0 >= 100 && arg0 < 110) {
			if (this.anIntArray21 == null) {
				this.anIntArray21 = new int[10];
				this.anIntArray19 = new int[10];
			}
			this.anIntArray21[arg0 - 100] = arg1.method1199();
			this.anIntArray19[arg0 - 100] = arg1.method1199();
		} else if (arg0 == 110) {
			this.anInt215 = arg1.method1199();
		} else if (arg0 == 111) {
			this.anInt198 = arg1.method1199();
		} else if (arg0 == 112) {
			this.anInt220 = arg1.method1199();
		} else if (arg0 == 113) {
			this.anInt195 = arg1.method1209();
		} else if (arg0 == 114) {
			this.anInt185 = arg1.method1209() * 5;
		} else if (arg0 == 115) {
			this.anInt228 = arg1.method1186();
		}
	}
}
