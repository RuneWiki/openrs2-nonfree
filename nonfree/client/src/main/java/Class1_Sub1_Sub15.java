import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!r", name = "T", descriptor = "[I")
	private int[] anIntArray337;

	@OriginalMember(owner = "client!r", name = "U", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!r", name = "X", descriptor = "[I")
	public int[] anIntArray338;

	@OriginalMember(owner = "client!r", name = "db", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!r", name = "jb", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!r", name = "pb", descriptor = "I")
	public int anInt3799;

	@OriginalMember(owner = "client!r", name = "Db", descriptor = "[I")
	private int[] anIntArray339;

	@OriginalMember(owner = "client!r", name = "Jb", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!r", name = "N", descriptor = "I")
	public int anInt3784 = -1;

	@OriginalMember(owner = "client!r", name = "Y", descriptor = "I")
	private int anInt3788 = -1;

	@OriginalMember(owner = "client!r", name = "V", descriptor = "I")
	public int anInt3787 = -1;

	@OriginalMember(owner = "client!r", name = "W", descriptor = "Z")
	public boolean aBoolean164 = true;

	@OriginalMember(owner = "client!r", name = "M", descriptor = "I")
	public int anInt3783 = -1;

	@OriginalMember(owner = "client!r", name = "cb", descriptor = "I")
	public int anInt3791 = -1;

	@OriginalMember(owner = "client!r", name = "S", descriptor = "I")
	public int anInt3786 = -1;

	@OriginalMember(owner = "client!r", name = "fb", descriptor = "I")
	private int anInt3792 = 0;

	@OriginalMember(owner = "client!r", name = "J", descriptor = "Z")
	public boolean aBoolean163 = true;

	@OriginalMember(owner = "client!r", name = "hb", descriptor = "I")
	public int anInt3793 = 32;

	@OriginalMember(owner = "client!r", name = "zb", descriptor = "Lclient!ea;")
	public Class18 aClass18_964 = Static15.aClass18_143;

	@OriginalMember(owner = "client!r", name = "ub", descriptor = "Z")
	public boolean aBoolean165 = true;

	@OriginalMember(owner = "client!r", name = "kb", descriptor = "I")
	public int anInt3794 = -1;

	@OriginalMember(owner = "client!r", name = "tb", descriptor = "I")
	private int anInt3803 = -1;

	@OriginalMember(owner = "client!r", name = "Ab", descriptor = "I")
	private int anInt3806 = 0;

	@OriginalMember(owner = "client!r", name = "rb", descriptor = "I")
	public int anInt3801 = -1;

	@OriginalMember(owner = "client!r", name = "Bb", descriptor = "I")
	private int anInt3807 = 128;

	@OriginalMember(owner = "client!r", name = "bb", descriptor = "I")
	public int anInt3790 = -1;

	@OriginalMember(owner = "client!r", name = "Ib", descriptor = "[Lclient!ea;")
	public final Class18[] aClass18Array19 = new Class18[5];

	@OriginalMember(owner = "client!r", name = "Cb", descriptor = "I")
	private int anInt3808 = 128;

	@OriginalMember(owner = "client!r", name = "Fb", descriptor = "I")
	public int anInt3809 = 1;

	@OriginalMember(owner = "client!r", name = "Hb", descriptor = "I")
	public int anInt3810 = -1;

	@OriginalMember(owner = "client!r", name = "Kb", descriptor = "Z")
	public boolean aBoolean166 = false;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BILclient!hc;)V")
	private void method2584(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		@Pc(200) int local200;
		@Pc(208) int local208;
		if (arg0 == 1) {
			local200 = arg1.method544();
			this.anIntArray337 = new int[local200];
			for (local208 = 0; local208 < local200; local208++) {
				this.anIntArray337[local208] = arg1.method546();
			}
		} else if (arg0 == 2) {
			this.aClass18_964 = arg1.method510();
		} else if (arg0 == 12) {
			this.anInt3809 = arg1.method544();
		} else if (arg0 == 13) {
			this.anInt3783 = arg1.method546();
		} else if (arg0 == 14) {
			this.anInt3784 = arg1.method546();
		} else if (arg0 == 15) {
			this.anInt3794 = arg1.method546();
		} else if (arg0 == 16) {
			this.anInt3790 = arg1.method546();
		} else if (arg0 == 17) {
			this.anInt3784 = arg1.method546();
			this.anInt3787 = arg1.method546();
			this.anInt3810 = arg1.method546();
			this.anInt3801 = arg1.method546();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass18Array19[arg0 - 30] = arg1.method510();
			if (this.aClass18Array19[arg0 - 30].method734(Static59.aClass18_217)) {
				this.aClass18Array19[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local200 = arg1.method544();
			this.aShortArray30 = new short[local200];
			this.aShortArray28 = new short[local200];
			for (local208 = 0; local208 < local200; local208++) {
				this.aShortArray28[local208] = (short) arg1.method546();
				this.aShortArray30[local208] = (short) arg1.method546();
			}
		} else if (arg0 == 41) {
			local200 = arg1.method544();
			this.aShortArray31 = new short[local200];
			this.aShortArray29 = new short[local200];
			for (local208 = 0; local208 < local200; local208++) {
				this.aShortArray31[local208] = (short) arg1.method546();
				this.aShortArray29[local208] = (short) arg1.method546();
			}
		} else if (arg0 == 60) {
			local200 = arg1.method544();
			this.anIntArray339 = new int[local200];
			for (local208 = 0; local208 < local200; local208++) {
				this.anIntArray339[local208] = arg1.method546();
			}
		} else if (arg0 == 93) {
			this.aBoolean164 = false;
		} else if (arg0 == 95) {
			this.anInt3786 = arg1.method546();
		} else if (arg0 == 97) {
			this.anInt3807 = arg1.method546();
		} else if (arg0 == 98) {
			this.anInt3808 = arg1.method546();
		} else if (arg0 == 99) {
			this.aBoolean166 = true;
		} else if (arg0 == 100) {
			this.anInt3792 = arg1.method548();
		} else if (arg0 == 101) {
			this.anInt3806 = arg1.method548() * 5;
		} else if (arg0 == 102) {
			this.anInt3791 = arg1.method546();
		} else if (arg0 == 103) {
			this.anInt3793 = arg1.method546();
		} else if (arg0 == 106) {
			this.anInt3803 = arg1.method546();
			if (this.anInt3803 == 65535) {
				this.anInt3803 = -1;
			}
			this.anInt3788 = arg1.method546();
			if (this.anInt3788 == 65535) {
				this.anInt3788 = -1;
			}
			local200 = arg1.method544();
			this.anIntArray338 = new int[local200 + 1];
			for (local208 = 0; local208 <= local200; local208++) {
				this.anIntArray338[local208] = arg1.method546();
				if (this.anIntArray338[local208] == 65535) {
					this.anIntArray338[local208] = -1;
				}
			}
		} else if (arg0 == 107) {
			this.aBoolean163 = false;
		} else if (arg0 == 109) {
			this.aBoolean165 = false;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!pf;Lclient!pf;IIB)Lclient!rg;")
	public Class1_Sub1_Sub5_Sub4 method2585(@OriginalArg(0) Class1_Sub1_Sub12 arg0, @OriginalArg(1) Class1_Sub1_Sub12 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anIntArray338 != null) {
			@Pc(12) Class1_Sub1_Sub15 local12 = this.method2589();
			return local12 == null ? null : local12.method2585(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class1_Sub1_Sub5_Sub4 local32 = (Class1_Sub1_Sub5_Sub4) Static159.aClass66_20.method2599((long) this.anInt3799);
		if (local32 == null) {
			@Pc(44) boolean local44 = false;
			for (@Pc(46) int local46 = 0; local46 < this.anIntArray337.length; local46++) {
				if (!Static53.aClass16_6.method2238(this.anIntArray337[local46], 0)) {
					local44 = true;
				}
			}
			if (local44) {
				return null;
			}
			@Pc(74) Class1_Sub1_Sub5_Sub5[] local74 = new Class1_Sub1_Sub5_Sub5[this.anIntArray337.length];
			for (@Pc(76) int local76 = 0; local76 < this.anIntArray337.length; local76++) {
				local74[local76] = Static70.method1483(Static53.aClass16_6, this.anIntArray337[local76]);
			}
			@Pc(109) Class1_Sub1_Sub5_Sub5 local109;
			if (local74.length == 1) {
				local109 = local74[0];
			} else {
				local109 = new Class1_Sub1_Sub5_Sub5(local74, local74.length);
			}
			@Pc(120) int local120;
			if (this.aShortArray28 != null) {
				for (local120 = 0; local120 < this.aShortArray28.length; local120++) {
					local109.method1489(this.aShortArray28[local120], this.aShortArray30[local120]);
				}
			}
			if (this.aShortArray31 != null) {
				for (local120 = 0; local120 < this.aShortArray31.length; local120++) {
					local109.method1479(this.aShortArray31[local120], this.aShortArray29[local120]);
				}
			}
			local32 = local109.method1472(this.anInt3792 + 64, this.anInt3806 + 850, -30, -50, -30, true);
			Static159.aClass66_20.method2597((long) this.anInt3799, local32);
		}
		@Pc(200) Class1_Sub1_Sub5_Sub4 local200;
		if (arg1 != null && arg0 != null) {
			local200 = arg1.method2406(arg2, local32, arg0, arg3);
		} else if (arg1 != null) {
			local200 = arg1.method2409(local32, arg2);
		} else if (arg0 == null) {
			local200 = local32.method1012(true);
		} else {
			local200 = arg0.method2409(local32, arg3);
		}
		if (this.anInt3807 != 128 || this.anInt3808 != 128) {
			local200.method1005(this.anInt3807, this.anInt3808, this.anInt3807);
		}
		return local200;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BLclient!hc;)V")
	public void method2587(@OriginalArg(1) Class1_Sub6 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method544();
			if (local17 == 0) {
				return;
			}
			this.method2584(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(Z)V")
	public void method2588() {
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(B)Lclient!r;")
	public Class1_Sub1_Sub15 method2589() {
		@Pc(9) int local9 = -1;
		if (this.anInt3803 != -1) {
			local9 = Static59.method549(this.anInt3803);
		} else if (this.anInt3788 != -1) {
			local9 = Static170.anIntArray420[this.anInt3788];
		}
		return local9 < 0 || local9 >= this.anIntArray338.length || this.anIntArray338[local9] == -1 ? null : Static164.method3047(this.anIntArray338[local9]);
	}

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)Lclient!ja;")
	public Class1_Sub1_Sub5_Sub5 method2590() {
		if (this.anIntArray338 != null) {
			@Pc(12) Class1_Sub1_Sub15 local12 = this.method2589();
			return local12 == null ? null : local12.method2590();
		} else if (this.anIntArray339 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(34) int local34 = 0; local34 < this.anIntArray339.length; local34++) {
				if (!Static53.aClass16_6.method2238(this.anIntArray339[local34], 0)) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(64) Class1_Sub1_Sub5_Sub5[] local64 = new Class1_Sub1_Sub5_Sub5[this.anIntArray339.length];
			for (@Pc(66) int local66 = 0; local66 < this.anIntArray339.length; local66++) {
				local64[local66] = Static70.method1483(Static53.aClass16_6, this.anIntArray339[local66]);
			}
			@Pc(98) Class1_Sub1_Sub5_Sub5 local98;
			if (local64.length == 1) {
				local98 = local64[0];
			} else {
				local98 = new Class1_Sub1_Sub5_Sub5(local64, local64.length);
			}
			@Pc(112) int local112;
			if (this.aShortArray28 != null) {
				for (local112 = 0; local112 < this.aShortArray28.length; local112++) {
					local98.method1489(this.aShortArray28[local112], this.aShortArray30[local112]);
				}
			}
			if (this.aShortArray31 != null) {
				for (local112 = 0; local112 < this.aShortArray31.length; local112++) {
					local98.method1479(this.aShortArray31[local112], this.aShortArray29[local112]);
				}
			}
			return local98;
		}
	}

	@OriginalMember(owner = "client!r", name = "h", descriptor = "(I)Z")
	public boolean method2591() {
		if (this.anIntArray338 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt3803 != -1) {
			local10 = Static59.method549(this.anInt3803);
		} else if (this.anInt3788 != -1) {
			local10 = Static170.anIntArray420[this.anInt3788];
		}
		return local10 >= 0 && local10 < this.anIntArray338.length && this.anIntArray338[local10] != -1;
	}
}
