import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class1_Sub3_Sub22 extends Class1_Sub3 {

	@OriginalMember(owner = "client!tf", name = "P", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!tf", name = "R", descriptor = "I")
	public int anInt3864;

	@OriginalMember(owner = "client!tf", name = "T", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!tf", name = "gb", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!tf", name = "jb", descriptor = "[S")
	private short[] aShortArray42;

	@OriginalMember(owner = "client!tf", name = "ub", descriptor = "[I")
	public int[] anIntArray323;

	@OriginalMember(owner = "client!tf", name = "Ib", descriptor = "[I")
	public int[] anIntArray324;

	@OriginalMember(owner = "client!tf", name = "Vb", descriptor = "I")
	private int anInt3906;

	@OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
	private int anInt3862 = 0;

	@OriginalMember(owner = "client!tf", name = "Z", descriptor = "I")
	public int anInt3870 = -1;

	@OriginalMember(owner = "client!tf", name = "U", descriptor = "I")
	private int anInt3866 = -1;

	@OriginalMember(owner = "client!tf", name = "X", descriptor = "I")
	public int anInt3869 = -1;

	@OriginalMember(owner = "client!tf", name = "qb", descriptor = "I")
	public int anInt3884 = -1;

	@OriginalMember(owner = "client!tf", name = "hb", descriptor = "I")
	public int anInt3877 = 0;

	@OriginalMember(owner = "client!tf", name = "N", descriptor = "I")
	private int anInt3861 = 128;

	@OriginalMember(owner = "client!tf", name = "eb", descriptor = "I")
	private int anInt3875 = 0;

	@OriginalMember(owner = "client!tf", name = "pb", descriptor = "I")
	private int anInt3883 = -1;

	@OriginalMember(owner = "client!tf", name = "xb", descriptor = "I")
	private int anInt3889 = -1;

	@OriginalMember(owner = "client!tf", name = "sb", descriptor = "I")
	public int anInt3885 = 1;

	@OriginalMember(owner = "client!tf", name = "cb", descriptor = "I")
	public int anInt3873 = -1;

	@OriginalMember(owner = "client!tf", name = "Eb", descriptor = "I")
	public int anInt3894 = -1;

	@OriginalMember(owner = "client!tf", name = "lb", descriptor = "I")
	public int anInt3879 = 2000;

	@OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
	public int anInt3860 = 0;

	@OriginalMember(owner = "client!tf", name = "mb", descriptor = "I")
	private int anInt3880 = -1;

	@OriginalMember(owner = "client!tf", name = "Lb", descriptor = "I")
	private int anInt3900 = 128;

	@OriginalMember(owner = "client!tf", name = "V", descriptor = "I")
	private int anInt3867 = 0;

	@OriginalMember(owner = "client!tf", name = "Jb", descriptor = "I")
	private int anInt3898 = 0;

	@OriginalMember(owner = "client!tf", name = "W", descriptor = "I")
	private int anInt3868 = 128;

	@OriginalMember(owner = "client!tf", name = "vb", descriptor = "I")
	private int anInt3887 = -1;

	@OriginalMember(owner = "client!tf", name = "rb", descriptor = "[Lclient!vd;")
	public Class92[] aClass92Array26 = new Class92[] { null, null, null, null, Static95.aClass92_893 };

	@OriginalMember(owner = "client!tf", name = "Kb", descriptor = "I")
	public int anInt3899 = 0;

	@OriginalMember(owner = "client!tf", name = "nb", descriptor = "I")
	public int anInt3881 = 0;

	@OriginalMember(owner = "client!tf", name = "M", descriptor = "[Lclient!vd;")
	public Class92[] aClass92Array25 = new Class92[] { null, null, Static107.aClass92_1033, null, null };

	@OriginalMember(owner = "client!tf", name = "wb", descriptor = "I")
	public int anInt3888 = -1;

	@OriginalMember(owner = "client!tf", name = "Q", descriptor = "I")
	public int anInt3863 = 0;

	@OriginalMember(owner = "client!tf", name = "Db", descriptor = "I")
	private int anInt3893 = -1;

	@OriginalMember(owner = "client!tf", name = "Hb", descriptor = "I")
	private int anInt3897 = -1;

	@OriginalMember(owner = "client!tf", name = "Bb", descriptor = "Lclient!vd;")
	public Class92 aClass92_1846 = Static208.aClass92_453;

	@OriginalMember(owner = "client!tf", name = "Pb", descriptor = "I")
	private int anInt3903 = -1;

	@OriginalMember(owner = "client!tf", name = "Mb", descriptor = "Z")
	public boolean aBoolean219 = false;

	@OriginalMember(owner = "client!tf", name = "Rb", descriptor = "Z")
	public boolean aBoolean220 = false;

	@OriginalMember(owner = "client!tf", name = "yb", descriptor = "I")
	public int anInt3890 = 0;

	@OriginalMember(owner = "client!tf", name = "zb", descriptor = "I")
	public int anInt3891 = 0;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZB)Z")
	public boolean method2924(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt3869;
		@Pc(15) int local15 = this.anInt3866;
		@Pc(18) int local18 = this.anInt3903;
		if (arg0) {
			local15 = this.anInt3893;
			local18 = this.anInt3889;
			local6 = this.anInt3894;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(37) boolean local37 = true;
		if (!Static108.aClass3_20.method3247(0, local6)) {
			local37 = false;
		}
		if (local18 != -1 && !Static108.aClass3_20.method3247(0, local18)) {
			local37 = false;
		}
		if (local15 != -1 && !Static108.aClass3_20.method3247(0, local15)) {
			local37 = false;
		}
		return local37;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!tf;Lclient!tf;)V")
	public void method2926(@OriginalArg(1) Class1_Sub3_Sub22 arg0, @OriginalArg(2) Class1_Sub3_Sub22 arg1) {
		this.anInt3860 = arg1.anInt3860;
		this.anInt3890 = arg1.anInt3890;
		this.anInt3869 = arg0.anInt3869;
		this.anInt3877 = arg1.anInt3877;
		this.anInt3903 = arg0.anInt3903;
		this.aClass92Array25 = arg0.aClass92Array25;
		this.anInt3881 = arg1.anInt3881;
		this.anInt3885 = 0;
		this.anInt3883 = arg0.anInt3883;
		this.aBoolean219 = arg0.aBoolean219;
		this.anInt3906 = arg1.anInt3906;
		this.anInt3879 = arg1.anInt3879;
		this.aShortArray41 = arg1.aShortArray41;
		this.anInt3897 = arg0.anInt3897;
		this.anInt3893 = arg0.anInt3893;
		this.anInt3899 = arg1.anInt3899;
		this.aShortArray40 = arg1.aShortArray40;
		this.anInt3891 = arg0.anInt3891;
		this.anInt3889 = arg0.anInt3889;
		this.aShortArray42 = arg1.aShortArray42;
		this.aClass92Array26 = new Class92[5];
		this.anInt3894 = arg0.anInt3894;
		this.anInt3866 = arg0.anInt3866;
		this.anInt3880 = arg0.anInt3880;
		this.anInt3887 = arg0.anInt3887;
		this.aClass92_1846 = arg0.aClass92_1846;
		this.aShortArray39 = arg1.aShortArray39;
		if (arg0.aClass92Array26 != null) {
			for (@Pc(125) int local125 = 0; local125 < 4; local125++) {
				this.aClass92Array26[local125] = arg0.aClass92Array26[local125];
			}
		}
		this.aClass92Array26[4] = Static179.aClass92_1848;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI)Z")
	public boolean method2927(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt3880;
		@Pc(9) int local9 = this.anInt3883;
		if (arg0) {
			local6 = this.anInt3897;
			local9 = this.anInt3887;
		}
		if (local9 == -1) {
			return true;
		}
		@Pc(25) boolean local25 = true;
		if (!Static108.aClass3_20.method3247(0, local9)) {
			local25 = false;
		}
		if (local6 != -1 && !Static108.aClass3_20.method3247(0, local6)) {
			local25 = false;
		}
		return local25;
	}

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "(I)Lclient!ob;")
	public Class8_Sub5_Sub1 method2930() {
		@Pc(7) Class8_Sub7 local7 = Static135.method1997(Static108.aClass3_20, this.anInt3906);
		if (local7 == null) {
			return null;
		}
		@Pc(20) int local20;
		if (this.aShortArray40 != null) {
			for (local20 = 0; local20 < this.aShortArray40.length; local20++) {
				local7.method2006(this.aShortArray40[local20], this.aShortArray39[local20]);
			}
		}
		if (this.aShortArray41 != null) {
			for (local20 = 0; local20 < this.aShortArray41.length; local20++) {
				local7.method2010(this.aShortArray41[local20], this.aShortArray42[local20]);
			}
		}
		@Pc(76) Class8_Sub5_Sub1 local76 = local7.method2000(this.anInt3867 + 64, 768 - -this.anInt3898);
		local76.aBoolean163 = true;
		if (this.anInt3868 != 128 || this.anInt3861 != 128 || this.anInt3900 != 128) {
			local76.method2038(this.anInt3868, this.anInt3861, this.anInt3900);
		}
		return local76;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)Lclient!tf;")
	public Class1_Sub3_Sub22 method2931(@OriginalArg(0) int arg0) {
		if (this.anIntArray323 != null && arg0 > 1) {
			@Pc(21) int local21 = -1;
			for (@Pc(23) int local23 = 0; local23 < 10; local23++) {
				if (arg0 >= this.anIntArray324[local23] && this.anIntArray324[local23] != 0) {
					local21 = this.anIntArray323[local23];
				}
			}
			if (local21 != -1) {
				return Static102.method1549(local21);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!ka;I)V")
	public void method2932(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3010();
			if (local9 == 0) {
				return;
			}
			this.method2933(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!ka;II)V")
	private void method2933(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt3906 = arg0.method3023();
		} else if (arg1 == 2) {
			this.aClass92_1846 = arg0.method3022();
		} else if (arg1 == 4) {
			this.anInt3879 = arg0.method3023();
		} else if (arg1 == 5) {
			this.anInt3877 = arg0.method3023();
		} else if (arg1 == 6) {
			this.anInt3890 = arg0.method3023();
		} else if (arg1 == 7) {
			this.anInt3860 = arg0.method3023();
			if (this.anInt3860 > 32767) {
				this.anInt3860 -= 65536;
			}
		} else if (arg1 == 8) {
			this.anInt3899 = arg0.method3023();
			if (this.anInt3899 > 32767) {
				this.anInt3899 -= 65536;
			}
		} else if (arg1 == 11) {
			this.anInt3863 = 1;
		} else if (arg1 == 12) {
			this.anInt3885 = arg0.method3058();
		} else if (arg1 == 16) {
			this.aBoolean219 = true;
		} else if (arg1 == 23) {
			this.anInt3869 = arg0.method3023();
			this.anInt3862 = arg0.method3010();
		} else if (arg1 == 24) {
			this.anInt3903 = arg0.method3023();
		} else if (arg1 == 25) {
			this.anInt3894 = arg0.method3023();
			this.anInt3875 = arg0.method3010();
		} else if (arg1 == 26) {
			this.anInt3889 = arg0.method3023();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass92Array25[arg1 - 30] = arg0.method3022();
			if (this.aClass92Array25[arg1 - 30].method3241(Static42.aClass92_427)) {
				this.aClass92Array25[arg1 - 30] = null;
			}
		} else if (arg1 >= 35 && arg1 < 40) {
			this.aClass92Array26[arg1 - 35] = arg0.method3022();
		} else {
			@Pc(148) int local148;
			@Pc(158) int local158;
			if (arg1 == 40) {
				local148 = arg0.method3010();
				this.aShortArray39 = new short[local148];
				this.aShortArray40 = new short[local148];
				for (local158 = 0; local158 < local148; local158++) {
					this.aShortArray40[local158] = (short) arg0.method3023();
					this.aShortArray39[local158] = (short) arg0.method3023();
				}
			} else if (arg1 == 41) {
				local148 = arg0.method3010();
				this.aShortArray42 = new short[local148];
				this.aShortArray41 = new short[local148];
				for (local158 = 0; local158 < local148; local158++) {
					this.aShortArray41[local158] = (short) arg0.method3023();
					this.aShortArray42[local158] = (short) arg0.method3023();
				}
			} else if (arg1 == 65) {
				this.aBoolean220 = true;
			} else if (arg1 == 78) {
				this.anInt3866 = arg0.method3023();
			} else if (arg1 == 79) {
				this.anInt3893 = arg0.method3023();
			} else if (arg1 == 90) {
				this.anInt3883 = arg0.method3023();
			} else if (arg1 == 91) {
				this.anInt3887 = arg0.method3023();
			} else if (arg1 == 92) {
				this.anInt3880 = arg0.method3023();
			} else if (arg1 == 93) {
				this.anInt3897 = arg0.method3023();
			} else if (arg1 == 95) {
				this.anInt3881 = arg0.method3023();
			} else if (arg1 == 97) {
				this.anInt3873 = arg0.method3023();
			} else if (arg1 == 98) {
				this.anInt3870 = arg0.method3023();
			} else if (arg1 >= 100 && arg1 < 110) {
				if (this.anIntArray323 == null) {
					this.anIntArray323 = new int[10];
					this.anIntArray324 = new int[10];
				}
				this.anIntArray323[arg1 - 100] = arg0.method3023();
				this.anIntArray324[arg1 - 100] = arg0.method3023();
			} else if (arg1 == 110) {
				this.anInt3868 = arg0.method3023();
			} else if (arg1 == 111) {
				this.anInt3861 = arg0.method3023();
			} else if (arg1 == 112) {
				this.anInt3900 = arg0.method3023();
			} else if (arg1 == 113) {
				this.anInt3867 = arg0.method3009();
			} else if (arg1 == 114) {
				this.anInt3898 = arg0.method3009() * 5;
			} else if (arg1 == 115) {
				this.anInt3891 = arg0.method3010();
			} else if (arg1 == 121) {
				this.anInt3888 = arg0.method3023();
			} else if (arg1 == 122) {
				this.anInt3884 = arg0.method3023();
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V")
	public void method2934() {
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZZ)Lclient!o;")
	public Class8_Sub7 method2935(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.anInt3883;
		@Pc(11) int local11 = this.anInt3880;
		if (arg0) {
			local11 = this.anInt3897;
			local8 = this.anInt3887;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(29) Class8_Sub7 local29 = Static135.method1997(Static108.aClass3_20, local8);
		if (local11 != -1) {
			@Pc(47) Class8_Sub7 local47 = Static135.method1997(Static108.aClass3_20, local11);
			@Pc(58) Class8_Sub7[] local58 = new Class8_Sub7[] { local29, local47 };
			local29 = new Class8_Sub7(local58, 2);
		}
		@Pc(69) int local69;
		if (this.aShortArray40 != null) {
			for (local69 = 0; local69 < this.aShortArray40.length; local69++) {
				local29.method2006(this.aShortArray40[local69], this.aShortArray39[local69]);
			}
		}
		if (this.aShortArray41 != null) {
			for (local69 = 0; local69 < this.aShortArray41.length; local69++) {
				local29.method2010(this.aShortArray41[local69], this.aShortArray42[local69]);
			}
		}
		return local29;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(ILclient!tf;Lclient!tf;)V")
	public void method2936(@OriginalArg(1) Class1_Sub3_Sub22 arg0, @OriginalArg(2) Class1_Sub3_Sub22 arg1) {
		this.aShortArray39 = arg1.aShortArray39;
		this.anInt3881 = arg1.anInt3881;
		this.aClass92_1846 = arg0.aClass92_1846;
		this.aShortArray40 = arg1.aShortArray40;
		this.anInt3885 = arg0.anInt3885;
		this.anInt3877 = arg1.anInt3877;
		this.anInt3879 = arg1.anInt3879;
		this.anInt3899 = arg1.anInt3899;
		this.anInt3890 = arg1.anInt3890;
		this.anInt3863 = 1;
		this.aBoolean219 = arg0.aBoolean219;
		this.anInt3906 = arg1.anInt3906;
		this.anInt3860 = arg1.anInt3860;
		this.aShortArray42 = arg1.aShortArray42;
		this.aShortArray41 = arg1.aShortArray41;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!re;IBI)Lclient!ee;")
	public Class8_Sub5 method2938(@OriginalArg(0) Class1_Sub3_Sub20 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.anIntArray323 != null && arg1 > 1) {
			@Pc(25) int local25 = -1;
			for (@Pc(27) int local27 = 0; local27 < 10; local27++) {
				if (arg1 >= this.anIntArray324[local27] && this.anIntArray324[local27] != 0) {
					local25 = this.anIntArray323[local27];
				}
			}
			if (local25 != -1) {
				return Static102.method1549(local25).method2938(arg0, 1, arg2);
			}
		}
		@Pc(70) Class8_Sub5 local70 = (Class8_Sub5) Static41.aClass77_2.method2259((long) this.anInt3864);
		if (local70 == null) {
			@Pc(78) Class8_Sub7 local78 = Static135.method1997(Static108.aClass3_20, this.anInt3906);
			if (local78 == null) {
				return null;
			}
			@Pc(87) int local87;
			if (this.aShortArray40 != null) {
				for (local87 = 0; local87 < this.aShortArray40.length; local87++) {
					local78.method2006(this.aShortArray40[local87], this.aShortArray39[local87]);
				}
			}
			if (this.aShortArray41 != null) {
				for (local87 = 0; local87 < this.aShortArray41.length; local87++) {
					local78.method2010(this.aShortArray41[local87], this.aShortArray42[local87]);
				}
			}
			local70 = local78.method2007(this.anInt3867 + 64, 768 - -this.anInt3898, -50, -10, -50);
			if (this.anInt3868 != 128 || this.anInt3861 != 128 || this.anInt3900 != 128) {
				local70.method2038(this.anInt3868, this.anInt3861, this.anInt3900);
			}
			Static41.aClass77_2.method2257(local70, (long) this.anInt3864);
		}
		if (arg0 != null) {
			local70 = arg0.method2555(arg2, local70);
		}
		return local70;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)Lclient!o;")
	public Class8_Sub7 method2939(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt3869;
		@Pc(11) int local11 = this.anInt3866;
		@Pc(14) int local14 = this.anInt3903;
		if (arg0) {
			local8 = this.anInt3894;
			local14 = this.anInt3889;
			local11 = this.anInt3893;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(35) Class8_Sub7 local35 = Static135.method1997(Static108.aClass3_20, local8);
		if (local14 != -1) {
			@Pc(44) Class8_Sub7 local44 = Static135.method1997(Static108.aClass3_20, local14);
			if (local11 == -1) {
				@Pc(58) Class8_Sub7[] local58 = new Class8_Sub7[] { local35, local44 };
				local35 = new Class8_Sub7(local58, 2);
			} else {
				@Pc(71) Class8_Sub7 local71 = Static135.method1997(Static108.aClass3_20, local11);
				@Pc(86) Class8_Sub7[] local86 = new Class8_Sub7[] { local35, local44, local71 };
				local35 = new Class8_Sub7(local86, 3);
			}
		}
		if (!arg0 && this.anInt3862 != 0) {
			local35.method1995(0, this.anInt3862, 0);
		}
		if (arg0 && this.anInt3875 != 0) {
			local35.method1995(0, this.anInt3875, 0);
		}
		@Pc(125) int local125;
		if (this.aShortArray40 != null) {
			for (local125 = 0; local125 < this.aShortArray40.length; local125++) {
				local35.method2006(this.aShortArray40[local125], this.aShortArray39[local125]);
			}
		}
		if (this.aShortArray41 != null) {
			for (local125 = 0; local125 < this.aShortArray41.length; local125++) {
				local35.method2010(this.aShortArray41[local125], this.aShortArray42[local125]);
			}
		}
		return local35;
	}
}
