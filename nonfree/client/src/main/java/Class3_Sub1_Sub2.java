import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!bh", name = "T", descriptor = "[I")
	public int[] anIntArray59;

	@OriginalMember(owner = "client!bh", name = "U", descriptor = "I")
	public int anInt351;

	@OriginalMember(owner = "client!bh", name = "eb", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!bh", name = "rb", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!bh", name = "ub", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!bh", name = "Fb", descriptor = "[I")
	public int[] anIntArray60;

	@OriginalMember(owner = "client!bh", name = "Ib", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!bh", name = "Kb", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!bh", name = "cb", descriptor = "Lclient!rd;")
	public Class80 aClass80_116 = Static43.aClass80_367;

	@OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
	public int anInt347 = 0;

	@OriginalMember(owner = "client!bh", name = "bb", descriptor = "I")
	private int anInt356 = 0;

	@OriginalMember(owner = "client!bh", name = "fb", descriptor = "I")
	private int anInt358 = 128;

	@OriginalMember(owner = "client!bh", name = "W", descriptor = "I")
	private int anInt353 = -1;

	@OriginalMember(owner = "client!bh", name = "gb", descriptor = "I")
	public int anInt359 = 0;

	@OriginalMember(owner = "client!bh", name = "Y", descriptor = "[Lclient!rd;")
	public Class80[] aClass80Array3 = new Class80[] { null, null, null, null, Static188.aClass80_1690 };

	@OriginalMember(owner = "client!bh", name = "hb", descriptor = "I")
	private int anInt360 = -1;

	@OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
	public int anInt350 = 0;

	@OriginalMember(owner = "client!bh", name = "Bb", descriptor = "I")
	public int anInt377 = 0;

	@OriginalMember(owner = "client!bh", name = "jb", descriptor = "I")
	private int anInt361 = -1;

	@OriginalMember(owner = "client!bh", name = "xb", descriptor = "I")
	private int anInt373 = -1;

	@OriginalMember(owner = "client!bh", name = "O", descriptor = "Z")
	public boolean aBoolean22 = false;

	@OriginalMember(owner = "client!bh", name = "mb", descriptor = "I")
	private int anInt363 = -1;

	@OriginalMember(owner = "client!bh", name = "lb", descriptor = "I")
	public int anInt362 = -1;

	@OriginalMember(owner = "client!bh", name = "Db", descriptor = "I")
	private int anInt379 = 0;

	@OriginalMember(owner = "client!bh", name = "Ab", descriptor = "I")
	private int anInt376 = -1;

	@OriginalMember(owner = "client!bh", name = "Jb", descriptor = "I")
	public int anInt382 = -1;

	@OriginalMember(owner = "client!bh", name = "kb", descriptor = "[Lclient!rd;")
	public Class80[] aClass80Array4 = new Class80[] { null, null, Static15.aClass80_103, null, null };

	@OriginalMember(owner = "client!bh", name = "Eb", descriptor = "I")
	private int anInt380 = 0;

	@OriginalMember(owner = "client!bh", name = "Gb", descriptor = "I")
	public int anInt381 = 0;

	@OriginalMember(owner = "client!bh", name = "vb", descriptor = "I")
	private int anInt371 = -1;

	@OriginalMember(owner = "client!bh", name = "ab", descriptor = "I")
	public int anInt355 = 2000;

	@OriginalMember(owner = "client!bh", name = "Mb", descriptor = "I")
	private int anInt384 = 128;

	@OriginalMember(owner = "client!bh", name = "Ob", descriptor = "I")
	public int anInt385 = -1;

	@OriginalMember(owner = "client!bh", name = "sb", descriptor = "I")
	private int anInt368 = -1;

	@OriginalMember(owner = "client!bh", name = "P", descriptor = "Z")
	public boolean aBoolean23 = false;

	@OriginalMember(owner = "client!bh", name = "Tb", descriptor = "I")
	public int anInt390 = 1;

	@OriginalMember(owner = "client!bh", name = "Qb", descriptor = "I")
	private int anInt387 = 128;

	@OriginalMember(owner = "client!bh", name = "Lb", descriptor = "I")
	private int anInt383 = 0;

	@OriginalMember(owner = "client!bh", name = "yb", descriptor = "I")
	public int anInt374 = -1;

	@OriginalMember(owner = "client!bh", name = "Sb", descriptor = "I")
	public int anInt389 = 0;

	@OriginalMember(owner = "client!bh", name = "Ub", descriptor = "I")
	public int anInt391 = 0;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!mb;B)V")
	private void method261(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt370 = arg1.method2111();
		} else if (arg0 == 2) {
			this.aClass80_116 = arg1.method2102();
		} else if (arg0 == 4) {
			this.anInt355 = arg1.method2111();
		} else if (arg0 == 5) {
			this.anInt377 = arg1.method2111();
		} else if (arg0 == 6) {
			this.anInt391 = arg1.method2111();
		} else if (arg0 == 7) {
			this.anInt359 = arg1.method2111();
			if (this.anInt359 > 32767) {
				this.anInt359 -= 65536;
			}
		} else if (arg0 == 8) {
			this.anInt381 = arg1.method2111();
			if (this.anInt381 > 32767) {
				this.anInt381 -= 65536;
			}
		} else if (arg0 == 11) {
			this.anInt389 = 1;
		} else if (arg0 == 12) {
			this.anInt390 = arg1.method2132();
		} else if (arg0 == 16) {
			this.aBoolean23 = true;
		} else if (arg0 == 23) {
			this.anInt385 = arg1.method2111();
			this.anInt383 = arg1.method2107();
		} else if (arg0 == 24) {
			this.anInt376 = arg1.method2111();
		} else if (arg0 == 25) {
			this.anInt382 = arg1.method2111();
			this.anInt379 = arg1.method2107();
		} else if (arg0 == 26) {
			this.anInt360 = arg1.method2111();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass80Array4[arg0 - 30] = arg1.method2102();
			if (this.aClass80Array4[arg0 - 30].method2432(Static58.aClass80_509)) {
				this.aClass80Array4[arg0 - 30] = null;
			}
		} else if (arg0 >= 35 && arg0 < 40) {
			this.aClass80Array3[arg0 - 35] = arg1.method2102();
		} else {
			@Pc(368) int local368;
			@Pc(378) int local378;
			if (arg0 == 40) {
				local368 = arg1.method2107();
				this.aShortArray7 = new short[local368];
				this.aShortArray8 = new short[local368];
				for (local378 = 0; local378 < local368; local378++) {
					this.aShortArray8[local378] = (short) arg1.method2111();
					this.aShortArray7[local378] = (short) arg1.method2111();
				}
			} else if (arg0 == 41) {
				local368 = arg1.method2107();
				this.aShortArray6 = new short[local368];
				this.aShortArray9 = new short[local368];
				for (local378 = 0; local378 < local368; local378++) {
					this.aShortArray6[local378] = (short) arg1.method2111();
					this.aShortArray9[local378] = (short) arg1.method2111();
				}
			} else if (arg0 == 65) {
				this.aBoolean22 = true;
			} else if (arg0 == 78) {
				this.anInt371 = arg1.method2111();
			} else if (arg0 == 79) {
				this.anInt368 = arg1.method2111();
			} else if (arg0 == 90) {
				this.anInt363 = arg1.method2111();
			} else if (arg0 == 91) {
				this.anInt373 = arg1.method2111();
			} else if (arg0 == 92) {
				this.anInt361 = arg1.method2111();
			} else if (arg0 == 93) {
				this.anInt353 = arg1.method2111();
			} else if (arg0 == 95) {
				this.anInt347 = arg1.method2111();
			} else if (arg0 == 97) {
				this.anInt374 = arg1.method2111();
			} else if (arg0 == 98) {
				this.anInt362 = arg1.method2111();
			} else if (arg0 >= 100 && arg0 < 110) {
				if (this.anIntArray60 == null) {
					this.anIntArray59 = new int[10];
					this.anIntArray60 = new int[10];
				}
				this.anIntArray60[arg0 - 100] = arg1.method2111();
				this.anIntArray59[arg0 - 100] = arg1.method2111();
			} else if (arg0 == 110) {
				this.anInt358 = arg1.method2111();
			} else if (arg0 == 111) {
				this.anInt387 = arg1.method2111();
			} else if (arg0 == 112) {
				this.anInt384 = arg1.method2111();
			} else if (arg0 == 113) {
				this.anInt356 = arg1.method2123();
			} else if (arg0 == 114) {
				this.anInt380 = arg1.method2123() * 5;
			} else if (arg0 == 115) {
				this.anInt350 = arg1.method2107();
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!ri;III)Lclient!vf;")
	public Class3_Sub1_Sub5_Sub3 method262(@OriginalArg(0) Class3_Sub1_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.anIntArray60 != null && arg1 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (arg1 >= this.anIntArray59[local15] && this.anIntArray59[local15] != 0) {
					local13 = this.anIntArray60[local15];
				}
			}
			if (local13 != -1) {
				return Static173.method2793(local13).method262(arg0, 1, arg2);
			}
		}
		@Pc(70) Class3_Sub1_Sub5_Sub3 local70 = (Class3_Sub1_Sub5_Sub3) Static192.aClass5_64.method139((long) this.anInt351);
		if (local70 == null) {
			@Pc(78) Class3_Sub1_Sub5_Sub5 local78 = Static127.method1911(Static36.aClass1_6, this.anInt370);
			if (local78 == null) {
				return null;
			}
			@Pc(87) int local87;
			if (this.aShortArray8 != null) {
				for (local87 = 0; local87 < this.aShortArray8.length; local87++) {
					local78.method1901(this.aShortArray8[local87], this.aShortArray7[local87]);
				}
			}
			if (this.aShortArray6 != null) {
				for (local87 = 0; local87 < this.aShortArray6.length; local87++) {
					local78.method1899(this.aShortArray6[local87], this.aShortArray9[local87]);
				}
			}
			local70 = local78.method1908(this.anInt356 + 64, 768 - -this.anInt380, -50, -10, -50, false);
			if (this.anInt358 != 128 || this.anInt387 != 128 || this.anInt384 != 128) {
				local70.method1369(this.anInt358, this.anInt387, this.anInt384);
			}
			Static192.aClass5_64.method145(local70, (long) this.anInt351);
		}
		if (arg0 != null) {
			local70 = arg0.method2545(local70, arg2);
		}
		return local70;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BZ)Z")
	public boolean method263(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt385;
		@Pc(9) int local9 = this.anInt376;
		@Pc(20) int local20 = this.anInt371;
		if (arg0) {
			local20 = this.anInt368;
			local6 = this.anInt382;
			local9 = this.anInt360;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(39) boolean local39 = true;
		if (!Static36.aClass1_6.method52(local6, 0)) {
			local39 = false;
		}
		if (local9 != -1 && !Static36.aClass1_6.method52(local9, 0)) {
			local39 = false;
		}
		if (local20 != -1 && !Static36.aClass1_6.method52(local20, 0)) {
			local39 = false;
		}
		return local39;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!bh;Lclient!bh;)V")
	public void method265(@OriginalArg(1) Class3_Sub1_Sub2 arg0, @OriginalArg(2) Class3_Sub1_Sub2 arg1) {
		this.aClass80_116 = arg1.aClass80_116;
		this.aShortArray8 = arg0.aShortArray8;
		this.anInt391 = arg0.anInt391;
		this.anInt347 = arg0.anInt347;
		this.anInt389 = 1;
		this.anInt370 = arg0.anInt370;
		this.aBoolean23 = arg1.aBoolean23;
		this.anInt390 = arg1.anInt390;
		this.aShortArray9 = arg0.aShortArray9;
		this.aShortArray7 = arg0.aShortArray7;
		this.anInt355 = arg0.anInt355;
		this.anInt359 = arg0.anInt359;
		this.anInt381 = arg0.anInt381;
		this.aShortArray6 = arg0.aShortArray6;
		this.anInt377 = arg0.anInt377;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!mb;Z)V")
	public void method266(@OriginalArg(0) Class3_Sub17 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2107();
			if (local13 == 0) {
				return;
			}
			this.method261(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZ)Z")
	public boolean method267(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt363;
		@Pc(9) int local9 = this.anInt361;
		if (arg0) {
			local9 = this.anInt353;
			local6 = this.anInt373;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(24) boolean local24 = true;
		if (!Static36.aClass1_6.method52(local6, 0)) {
			local24 = false;
		}
		if (local9 != -1 && !Static36.aClass1_6.method52(local9, 0)) {
			local24 = false;
		}
		return local24;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(IZ)Lclient!ob;")
	public Class3_Sub1_Sub5_Sub5 method268(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt363;
		@Pc(11) int local11 = this.anInt361;
		if (arg0) {
			local8 = this.anInt373;
			local11 = this.anInt353;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(29) Class3_Sub1_Sub5_Sub5 local29 = Static127.method1911(Static36.aClass1_6, local8);
		if (local11 != -1) {
			@Pc(43) Class3_Sub1_Sub5_Sub5 local43 = Static127.method1911(Static36.aClass1_6, local11);
			@Pc(54) Class3_Sub1_Sub5_Sub5[] local54 = new Class3_Sub1_Sub5_Sub5[] { local29, local43 };
			local29 = new Class3_Sub1_Sub5_Sub5(local54, 2);
		}
		@Pc(65) int local65;
		if (this.aShortArray8 != null) {
			for (local65 = 0; local65 < this.aShortArray8.length; local65++) {
				local29.method1901(this.aShortArray8[local65], this.aShortArray7[local65]);
			}
		}
		if (this.aShortArray6 != null) {
			for (local65 = 0; local65 < this.aShortArray6.length; local65++) {
				local29.method1899(this.aShortArray6[local65], this.aShortArray9[local65]);
			}
		}
		return local29;
	}

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "(B)Lclient!kc;")
	public Class3_Sub1_Sub5_Sub3_Sub1 method270() {
		@Pc(11) Class3_Sub1_Sub5_Sub5 local11 = Static127.method1911(Static36.aClass1_6, this.anInt370);
		if (local11 == null) {
			return null;
		}
		@Pc(20) int local20;
		if (this.aShortArray8 != null) {
			for (local20 = 0; local20 < this.aShortArray8.length; local20++) {
				local11.method1901(this.aShortArray8[local20], this.aShortArray7[local20]);
			}
		}
		if (this.aShortArray6 != null) {
			for (local20 = 0; local20 < this.aShortArray6.length; local20++) {
				local11.method1899(this.aShortArray6[local20], this.aShortArray9[local20]);
			}
		}
		@Pc(88) Class3_Sub1_Sub5_Sub3_Sub1 local88 = local11.method1895(this.anInt356 + 64, this.anInt380 + 768);
		local88.aBoolean75 = true;
		if (this.anInt358 != 128 || this.anInt387 != 128 || this.anInt384 != 128) {
			local88.method1369(this.anInt358, this.anInt387, this.anInt384);
		}
		return local88;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)Lclient!bh;")
	public Class3_Sub1_Sub2 method271(@OriginalArg(1) int arg0) {
		if (this.anIntArray60 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (arg0 >= this.anIntArray59[local17] && this.anIntArray59[local17] != 0) {
					local15 = this.anIntArray60[local17];
				}
			}
			if (local15 != -1) {
				return Static173.method2793(local15);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(BZ)Lclient!ob;")
	public Class3_Sub1_Sub5_Sub5 method272(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt376;
		@Pc(11) int local11 = this.anInt371;
		@Pc(14) int local14 = this.anInt385;
		if (arg0) {
			local11 = this.anInt368;
			local8 = this.anInt360;
			local14 = this.anInt382;
		}
		if (local14 == -1) {
			return null;
		}
		@Pc(36) Class3_Sub1_Sub5_Sub5 local36 = Static127.method1911(Static36.aClass1_6, local14);
		if (local8 != -1) {
			@Pc(55) Class3_Sub1_Sub5_Sub5 local55 = Static127.method1911(Static36.aClass1_6, local8);
			if (local11 == -1) {
				@Pc(69) Class3_Sub1_Sub5_Sub5[] local69 = new Class3_Sub1_Sub5_Sub5[] { local36, local55 };
				local36 = new Class3_Sub1_Sub5_Sub5(local69, 2);
			} else {
				@Pc(82) Class3_Sub1_Sub5_Sub5 local82 = Static127.method1911(Static36.aClass1_6, local11);
				@Pc(97) Class3_Sub1_Sub5_Sub5[] local97 = new Class3_Sub1_Sub5_Sub5[] { local36, local55, local82 };
				local36 = new Class3_Sub1_Sub5_Sub5(local97, 3);
			}
		}
		if (!arg0 && this.anInt383 != 0) {
			local36.method1905(0, this.anInt383, 0);
		}
		if (arg0 && this.anInt379 != 0) {
			local36.method1905(0, this.anInt379, 0);
		}
		@Pc(133) int local133;
		if (this.aShortArray8 != null) {
			for (local133 = 0; local133 < this.aShortArray8.length; local133++) {
				local36.method1901(this.aShortArray8[local133], this.aShortArray7[local133]);
			}
		}
		if (this.aShortArray6 != null) {
			for (local133 = 0; local133 < this.aShortArray6.length; local133++) {
				local36.method1899(this.aShortArray6[local133], this.aShortArray9[local133]);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "(B)V")
	public void method275() {
	}
}
