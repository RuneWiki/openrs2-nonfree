import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ac", name = "T", descriptor = "I")
	public int anInt155;

	@OriginalMember(owner = "client!ac", name = "U", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!ac", name = "cb", descriptor = "[I")
	public int[] anIntArray16;

	@OriginalMember(owner = "client!ac", name = "rb", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!ac", name = "tb", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!ac", name = "ub", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!ac", name = "zb", descriptor = "[I")
	public int[] anIntArray17;

	@OriginalMember(owner = "client!ac", name = "Bb", descriptor = "I")
	private int anInt180;

	@OriginalMember(owner = "client!ac", name = "S", descriptor = "Z")
	public boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ac", name = "G", descriptor = "Z")
	public boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
	private int anInt148 = -1;

	@OriginalMember(owner = "client!ac", name = "gb", descriptor = "Lclient!rf;")
	public Class70 aClass70_49 = Static139.aClass70_1239;

	@OriginalMember(owner = "client!ac", name = "Y", descriptor = "I")
	public int anInt159 = -1;

	@OriginalMember(owner = "client!ac", name = "bb", descriptor = "I")
	private int anInt162 = 0;

	@OriginalMember(owner = "client!ac", name = "V", descriptor = "I")
	private int anInt156 = -1;

	@OriginalMember(owner = "client!ac", name = "mb", descriptor = "I")
	public int anInt170 = 0;

	@OriginalMember(owner = "client!ac", name = "ob", descriptor = "I")
	public int anInt171 = 0;

	@OriginalMember(owner = "client!ac", name = "hb", descriptor = "I")
	public int anInt166 = 0;

	@OriginalMember(owner = "client!ac", name = "M", descriptor = "[Lclient!rf;")
	public Class70[] aClass70Array1 = new Class70[] { null, null, null, null, Static73.aClass70_719 };

	@OriginalMember(owner = "client!ac", name = "db", descriptor = "I")
	public int anInt163 = -1;

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
	private int anInt147 = 128;

	@OriginalMember(owner = "client!ac", name = "xb", descriptor = "I")
	public int anInt177 = 0;

	@OriginalMember(owner = "client!ac", name = "jb", descriptor = "I")
	private int anInt167 = -1;

	@OriginalMember(owner = "client!ac", name = "vb", descriptor = "I")
	private int anInt175 = -1;

	@OriginalMember(owner = "client!ac", name = "X", descriptor = "I")
	public int anInt158 = -1;

	@OriginalMember(owner = "client!ac", name = "Q", descriptor = "I")
	private int anInt153 = 128;

	@OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
	private int anInt151 = -1;

	@OriginalMember(owner = "client!ac", name = "Cb", descriptor = "I")
	public int anInt181 = 0;

	@OriginalMember(owner = "client!ac", name = "lb", descriptor = "I")
	public int anInt169 = -1;

	@OriginalMember(owner = "client!ac", name = "ab", descriptor = "I")
	private int anInt161 = -1;

	@OriginalMember(owner = "client!ac", name = "Db", descriptor = "I")
	private int anInt182 = 0;

	@OriginalMember(owner = "client!ac", name = "wb", descriptor = "I")
	private int anInt176 = -1;

	@OriginalMember(owner = "client!ac", name = "Kb", descriptor = "I")
	public int anInt188 = 2000;

	@OriginalMember(owner = "client!ac", name = "yb", descriptor = "I")
	private int anInt178 = 0;

	@OriginalMember(owner = "client!ac", name = "Fb", descriptor = "I")
	public int anInt184 = 0;

	@OriginalMember(owner = "client!ac", name = "Hb", descriptor = "I")
	private int anInt185 = 128;

	@OriginalMember(owner = "client!ac", name = "Gb", descriptor = "[Lclient!rf;")
	public Class70[] aClass70Array2 = new Class70[] { null, null, Static137.aClass70_1212, null, null };

	@OriginalMember(owner = "client!ac", name = "fb", descriptor = "I")
	private int anInt165 = 0;

	@OriginalMember(owner = "client!ac", name = "Ob", descriptor = "I")
	public int anInt191 = 0;

	@OriginalMember(owner = "client!ac", name = "Nb", descriptor = "I")
	public int anInt190 = 1;

	@OriginalMember(owner = "client!ac", name = "Mb", descriptor = "I")
	private int anInt189 = -1;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ)Lclient!ei;")
	public Class1_Sub1_Sub4_Sub3 method160(@OriginalArg(1) boolean arg0) {
		@Pc(16) int local16 = this.anInt189;
		@Pc(19) int local19 = this.anInt176;
		if (arg0) {
			local16 = this.anInt175;
			local19 = this.anInt156;
		}
		if (local19 == -1) {
			return null;
		}
		@Pc(38) Class1_Sub1_Sub4_Sub3 local38 = Static46.method1144(Static101.aClass76_83, local19);
		if (local16 != -1) {
			@Pc(47) Class1_Sub1_Sub4_Sub3 local47 = Static46.method1144(Static101.aClass76_83, local16);
			@Pc(58) Class1_Sub1_Sub4_Sub3[] local58 = new Class1_Sub1_Sub4_Sub3[] { local38, local47 };
			local38 = new Class1_Sub1_Sub4_Sub3(local58, 2);
		}
		@Pc(69) int local69;
		if (this.aShortArray2 != null) {
			for (local69 = 0; local69 < this.aShortArray2.length; local69++) {
				local38.method1146(this.aShortArray2[local69], this.aShortArray1[local69]);
			}
		}
		if (this.aShortArray4 != null) {
			for (local69 = 0; local69 < this.aShortArray4.length; local69++) {
				local38.method1149(this.aShortArray4[local69], this.aShortArray3[local69]);
			}
		}
		return local38;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!re;IIB)Lclient!je;")
	public Class1_Sub1_Sub4_Sub1 method162(@OriginalArg(0) Class1_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anIntArray16 != null && arg1 > 1) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (arg1 >= this.anIntArray17[local17] && this.anIntArray17[local17] != 0) {
					local15 = this.anIntArray16[local17];
				}
			}
			if (local15 != -1) {
				return Static90.method1963(local15).method162(arg0, 1, arg2);
			}
		}
		@Pc(65) Class1_Sub1_Sub4_Sub1 local65 = (Class1_Sub1_Sub4_Sub1) Static54.aClass25_9.method1302((long) this.anInt155);
		if (local65 == null) {
			@Pc(73) Class1_Sub1_Sub4_Sub3 local73 = Static46.method1144(Static101.aClass76_83, this.anInt180);
			if (local73 == null) {
				return null;
			}
			@Pc(82) int local82;
			if (this.aShortArray2 != null) {
				for (local82 = 0; local82 < this.aShortArray2.length; local82++) {
					local73.method1146(this.aShortArray2[local82], this.aShortArray1[local82]);
				}
			}
			if (this.aShortArray4 != null) {
				for (local82 = 0; local82 < this.aShortArray4.length; local82++) {
					local73.method1149(this.aShortArray4[local82], this.aShortArray3[local82]);
				}
			}
			local65 = local73.method1135(this.anInt165 + 64, this.anInt178 + 768, -50, -10, -50, false);
			if (this.anInt147 != 128 || this.anInt185 != 128 || this.anInt153 != 128) {
				local65.method719(this.anInt147, this.anInt185, this.anInt153);
			}
			Static54.aClass25_9.method1299(local65, (long) this.anInt155);
		}
		if (arg0 != null) {
			local65 = arg0.method2888(local65, arg2);
		}
		return local65;
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(B)V")
	public void method163() {
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!fa;B)V")
	public void method164(@OriginalArg(0) Class1_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1234();
			if (local9 == 0) {
				return;
			}
			this.method172(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(IZ)Lclient!ei;")
	public Class1_Sub1_Sub4_Sub3 method165(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt169;
		@Pc(11) int local11 = this.anInt167;
		@Pc(14) int local14 = this.anInt148;
		if (arg0) {
			local14 = this.anInt151;
			local11 = this.anInt161;
			local8 = this.anInt163;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(35) Class1_Sub1_Sub4_Sub3 local35 = Static46.method1144(Static101.aClass76_83, local8);
		if (local14 != -1) {
			@Pc(44) Class1_Sub1_Sub4_Sub3 local44 = Static46.method1144(Static101.aClass76_83, local14);
			if (local11 == -1) {
				@Pc(87) Class1_Sub1_Sub4_Sub3[] local87 = new Class1_Sub1_Sub4_Sub3[] { local35, local44 };
				local35 = new Class1_Sub1_Sub4_Sub3(local87, 2);
			} else {
				@Pc(53) Class1_Sub1_Sub4_Sub3 local53 = Static46.method1144(Static101.aClass76_83, local11);
				@Pc(68) Class1_Sub1_Sub4_Sub3[] local68 = new Class1_Sub1_Sub4_Sub3[] { local35, local44, local53 };
				local35 = new Class1_Sub1_Sub4_Sub3(local68, 3);
			}
		}
		if (!arg0 && this.anInt162 != 0) {
			local35.method1147(0, this.anInt162, 0);
		}
		if (arg0 && this.anInt182 != 0) {
			local35.method1147(0, this.anInt182, 0);
		}
		@Pc(131) int local131;
		if (this.aShortArray2 != null) {
			for (local131 = 0; local131 < this.aShortArray2.length; local131++) {
				local35.method1146(this.aShortArray2[local131], this.aShortArray1[local131]);
			}
		}
		if (this.aShortArray4 != null) {
			for (local131 = 0; local131 < this.aShortArray4.length; local131++) {
				local35.method1149(this.aShortArray4[local131], this.aShortArray3[local131]);
			}
		}
		return local35;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZB)Z")
	public boolean method166(@OriginalArg(0) boolean arg0) {
		@Pc(2) int local2 = this.anInt169;
		@Pc(5) int local5 = this.anInt148;
		@Pc(12) int local12 = this.anInt167;
		if (arg0) {
			local2 = this.anInt163;
			local5 = this.anInt151;
			local12 = this.anInt161;
		}
		if (local2 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static101.aClass76_83.method3329(local2, 0)) {
			local30 = false;
		}
		if (local5 != -1 && !Static101.aClass76_83.method3329(local5, 0)) {
			local30 = false;
		}
		if (local12 != -1 && !Static101.aClass76_83.method3329(local12, 0)) {
			local30 = false;
		}
		return local30;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZZ)Z")
	public boolean method167(@OriginalArg(0) boolean arg0) {
		@Pc(10) int local10 = this.anInt176;
		@Pc(17) int local17 = this.anInt189;
		if (arg0) {
			local17 = this.anInt175;
			local10 = this.anInt156;
		}
		if (local10 == -1) {
			return true;
		}
		@Pc(33) boolean local33 = true;
		if (!Static101.aClass76_83.method3329(local10, 0)) {
			local33 = false;
		}
		if (local17 != -1 && !Static101.aClass76_83.method3329(local17, 0)) {
			local33 = false;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)Lclient!ci;")
	public Class1_Sub1_Sub4_Sub1_Sub1 method168() {
		@Pc(16) Class1_Sub1_Sub4_Sub3 local16 = Static46.method1144(Static101.aClass76_83, this.anInt180);
		if (local16 == null) {
			return null;
		}
		@Pc(25) int local25;
		if (this.aShortArray2 != null) {
			for (local25 = 0; local25 < this.aShortArray2.length; local25++) {
				local16.method1146(this.aShortArray2[local25], this.aShortArray1[local25]);
			}
		}
		if (this.aShortArray4 != null) {
			for (local25 = 0; local25 < this.aShortArray4.length; local25++) {
				local16.method1149(this.aShortArray4[local25], this.aShortArray3[local25]);
			}
		}
		@Pc(88) Class1_Sub1_Sub4_Sub1_Sub1 local88 = local16.method1151(this.anInt165 + 64, this.anInt178 + 768);
		local88.aBoolean35 = true;
		if (this.anInt147 != 128 || this.anInt185 != 128 || this.anInt153 != 128) {
			local88.method719(this.anInt147, this.anInt185, this.anInt153);
		}
		return local88;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)Lclient!ac;")
	public Class1_Sub1_Sub2 method169(@OriginalArg(0) int arg0) {
		if (this.anIntArray16 != null && arg0 > 1) {
			@Pc(21) int local21 = -1;
			for (@Pc(23) int local23 = 0; local23 < 10; local23++) {
				if (arg0 >= this.anIntArray17[local23] && this.anIntArray17[local23] != 0) {
					local21 = this.anIntArray16[local23];
				}
			}
			if (local21 != -1) {
				return Static90.method1963(local21);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!ac;Lclient!ac;)V")
	public void method171(@OriginalArg(1) Class1_Sub1_Sub2 arg0, @OriginalArg(2) Class1_Sub1_Sub2 arg1) {
		this.aShortArray1 = arg0.aShortArray1;
		this.anInt166 = arg0.anInt166;
		this.aShortArray2 = arg0.aShortArray2;
		this.aShortArray3 = arg0.aShortArray3;
		this.aBoolean7 = arg1.aBoolean7;
		this.aShortArray4 = arg0.aShortArray4;
		this.anInt171 = arg0.anInt171;
		this.anInt190 = arg1.anInt190;
		this.anInt170 = arg0.anInt170;
		this.anInt184 = 1;
		this.aClass70_49 = arg1.aClass70_49;
		this.anInt188 = arg0.anInt188;
		this.anInt191 = arg0.anInt191;
		this.anInt181 = arg0.anInt181;
		this.anInt180 = arg0.anInt180;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!fa;II)V")
	private void method172(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt180 = arg0.method1280();
		} else if (arg1 == 2) {
			this.aClass70_49 = arg0.method1253();
		} else if (arg1 == 4) {
			this.anInt188 = arg0.method1280();
		} else if (arg1 == 5) {
			this.anInt181 = arg0.method1280();
		} else if (arg1 == 6) {
			this.anInt170 = arg0.method1280();
		} else if (arg1 == 7) {
			this.anInt166 = arg0.method1280();
			if (this.anInt166 > 32767) {
				this.anInt166 -= 65536;
			}
		} else if (arg1 == 8) {
			this.anInt171 = arg0.method1280();
			if (this.anInt171 > 32767) {
				this.anInt171 -= 65536;
			}
		} else if (arg1 == 11) {
			this.anInt184 = 1;
		} else if (arg1 == 12) {
			this.anInt190 = arg0.method1273();
		} else if (arg1 == 16) {
			this.aBoolean7 = true;
		} else if (arg1 == 23) {
			this.anInt169 = arg0.method1280();
			this.anInt162 = arg0.method1234();
		} else if (arg1 == 24) {
			this.anInt148 = arg0.method1280();
		} else if (arg1 == 25) {
			this.anInt163 = arg0.method1280();
			this.anInt182 = arg0.method1234();
		} else if (arg1 == 26) {
			this.anInt151 = arg0.method1280();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass70Array2[arg1 - 30] = arg0.method1253();
			if (this.aClass70Array2[arg1 - 30].method2905(Static67.aClass70_646)) {
				this.aClass70Array2[arg1 - 30] = null;
			}
		} else if (arg1 >= 35 && arg1 < 40) {
			this.aClass70Array1[arg1 - 35] = arg0.method1253();
		} else {
			@Pc(174) int local174;
			@Pc(184) int local184;
			if (arg1 == 40) {
				local174 = arg0.method1234();
				this.aShortArray1 = new short[local174];
				this.aShortArray2 = new short[local174];
				for (local184 = 0; local184 < local174; local184++) {
					this.aShortArray2[local184] = (short) arg0.method1280();
					this.aShortArray1[local184] = (short) arg0.method1280();
				}
			} else if (arg1 == 41) {
				local174 = arg0.method1234();
				this.aShortArray3 = new short[local174];
				this.aShortArray4 = new short[local174];
				for (local184 = 0; local184 < local174; local184++) {
					this.aShortArray4[local184] = (short) arg0.method1280();
					this.aShortArray3[local184] = (short) arg0.method1280();
				}
			} else if (arg1 == 65) {
				this.aBoolean8 = true;
			} else if (arg1 == 78) {
				this.anInt167 = arg0.method1280();
			} else if (arg1 == 79) {
				this.anInt161 = arg0.method1280();
			} else if (arg1 == 90) {
				this.anInt176 = arg0.method1280();
			} else if (arg1 == 91) {
				this.anInt156 = arg0.method1280();
			} else if (arg1 == 92) {
				this.anInt189 = arg0.method1280();
			} else if (arg1 == 93) {
				this.anInt175 = arg0.method1280();
			} else if (arg1 == 95) {
				this.anInt191 = arg0.method1280();
			} else if (arg1 == 97) {
				this.anInt159 = arg0.method1280();
			} else if (arg1 == 98) {
				this.anInt158 = arg0.method1280();
			} else if (arg1 >= 100 && arg1 < 110) {
				if (this.anIntArray16 == null) {
					this.anIntArray17 = new int[10];
					this.anIntArray16 = new int[10];
				}
				this.anIntArray16[arg1 - 100] = arg0.method1280();
				this.anIntArray17[arg1 - 100] = arg0.method1280();
			} else if (arg1 == 110) {
				this.anInt147 = arg0.method1280();
			} else if (arg1 == 111) {
				this.anInt185 = arg0.method1280();
			} else if (arg1 == 112) {
				this.anInt153 = arg0.method1280();
			} else if (arg1 == 113) {
				this.anInt165 = arg0.method1243();
			} else if (arg1 == 114) {
				this.anInt178 = arg0.method1243() * 5;
			} else if (arg1 == 115) {
				this.anInt177 = arg0.method1234();
			}
		}
	}
}
