import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!bc", name = "bb", descriptor = "[I")
	public int[] anIntArray23;

	@OriginalMember(owner = "client!bc", name = "zb", descriptor = "[I")
	public int[] anIntArray24;

	@OriginalMember(owner = "client!bc", name = "Bb", descriptor = "I")
	public int anInt288;

	@OriginalMember(owner = "client!bc", name = "Db", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!bc", name = "Rb", descriptor = "[I")
	private int[] anIntArray26;

	@OriginalMember(owner = "client!bc", name = "Wb", descriptor = "I")
	private int anInt301;

	@OriginalMember(owner = "client!bc", name = "T", descriptor = "I")
	private int anInt266 = 128;

	@OriginalMember(owner = "client!bc", name = "ab", descriptor = "I")
	private int anInt270 = 128;

	@OriginalMember(owner = "client!bc", name = "db", descriptor = "Z")
	public boolean aBoolean12 = false;

	@OriginalMember(owner = "client!bc", name = "ub", descriptor = "I")
	private int anInt283 = -1;

	@OriginalMember(owner = "client!bc", name = "S", descriptor = "I")
	public int anInt265 = 0;

	@OriginalMember(owner = "client!bc", name = "jb", descriptor = "I")
	private int anInt275 = -1;

	@OriginalMember(owner = "client!bc", name = "Ib", descriptor = "I")
	public int anInt292 = 0;

	@OriginalMember(owner = "client!bc", name = "pb", descriptor = "I")
	public int anInt280 = -1;

	@OriginalMember(owner = "client!bc", name = "eb", descriptor = "Lclient!v;")
	public Class62 aClass62_116 = Static3.aClass62_64;

	@OriginalMember(owner = "client!bc", name = "fb", descriptor = "I")
	public int anInt271 = 0;

	@OriginalMember(owner = "client!bc", name = "Jb", descriptor = "I")
	private int anInt293 = -1;

	@OriginalMember(owner = "client!bc", name = "Gb", descriptor = "[Lclient!v;")
	public Class62[] aClass62Array3 = new Class62[] { null, null, null, null, Static33.aClass62_460 };

	@OriginalMember(owner = "client!bc", name = "ib", descriptor = "I")
	private int anInt274 = -1;

	@OriginalMember(owner = "client!bc", name = "Vb", descriptor = "I")
	public int anInt300 = 0;

	@OriginalMember(owner = "client!bc", name = "Fb", descriptor = "Z")
	public boolean aBoolean14 = false;

	@OriginalMember(owner = "client!bc", name = "Hb", descriptor = "I")
	private int anInt291 = -1;

	@OriginalMember(owner = "client!bc", name = "Qb", descriptor = "I")
	private int anInt297 = -1;

	@OriginalMember(owner = "client!bc", name = "ac", descriptor = "I")
	public int anInt304 = 0;

	@OriginalMember(owner = "client!bc", name = "Ub", descriptor = "I")
	private int anInt299 = 128;

	@OriginalMember(owner = "client!bc", name = "Eb", descriptor = "I")
	public int anInt290 = 2000;

	@OriginalMember(owner = "client!bc", name = "Ab", descriptor = "I")
	private int anInt287 = -1;

	@OriginalMember(owner = "client!bc", name = "R", descriptor = "I")
	private int anInt264 = -1;

	@OriginalMember(owner = "client!bc", name = "Mb", descriptor = "I")
	public int anInt296 = 1;

	@OriginalMember(owner = "client!bc", name = "Kb", descriptor = "I")
	public int anInt294 = 0;

	@OriginalMember(owner = "client!bc", name = "Tb", descriptor = "I")
	public int anInt298 = -1;

	@OriginalMember(owner = "client!bc", name = "Xb", descriptor = "I")
	private int anInt302 = -1;

	@OriginalMember(owner = "client!bc", name = "Zb", descriptor = "I")
	public int anInt303 = 0;

	@OriginalMember(owner = "client!bc", name = "fc", descriptor = "I")
	private int anInt309 = -1;

	@OriginalMember(owner = "client!bc", name = "ec", descriptor = "I")
	private int anInt308 = 0;

	@OriginalMember(owner = "client!bc", name = "xb", descriptor = "I")
	private int anInt286 = 0;

	@OriginalMember(owner = "client!bc", name = "cc", descriptor = "I")
	public int anInt306 = 0;

	@OriginalMember(owner = "client!bc", name = "Nb", descriptor = "[Lclient!v;")
	public Class62[] aClass62Array4 = new Class62[] { null, null, Static16.aClass62_265, null, null };

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)Lclient!lb;")
	public Class3_Sub1_Sub3_Sub3 method205(@OriginalArg(1) boolean arg0) {
		@Pc(4) int local4 = this.anInt287;
		@Pc(7) int local7 = this.anInt309;
		@Pc(14) int local14 = this.anInt283;
		if (arg0) {
			local7 = this.anInt274;
			local14 = this.anInt275;
			local4 = this.anInt302;
		}
		if (local4 == -1) {
			return null;
		}
		@Pc(37) Class3_Sub1_Sub3_Sub3 local37 = Static57.method949(Static64.aClass42_47, local4);
		if (local14 != -1) {
			@Pc(46) Class3_Sub1_Sub3_Sub3 local46 = Static57.method949(Static64.aClass42_47, local14);
			if (local7 == -1) {
				@Pc(88) Class3_Sub1_Sub3_Sub3[] local88 = new Class3_Sub1_Sub3_Sub3[] { local37, local46 };
				local37 = new Class3_Sub1_Sub3_Sub3(local88, 2);
			} else {
				@Pc(54) Class3_Sub1_Sub3_Sub3 local54 = Static57.method949(Static64.aClass42_47, local7);
				@Pc(69) Class3_Sub1_Sub3_Sub3[] local69 = new Class3_Sub1_Sub3_Sub3[] { local37, local46, local54 };
				local37 = new Class3_Sub1_Sub3_Sub3(local69, 3);
			}
		}
		if (!arg0 && this.anInt308 != 0) {
			local37.method964(0, this.anInt308, 0);
		}
		if (arg0 && this.anInt286 != 0) {
			local37.method964(0, this.anInt286, 0);
		}
		if (this.anIntArray26 != null) {
			for (@Pc(124) int local124 = 0; local124 < this.anIntArray26.length; local124++) {
				local37.method965(this.anIntArray26[local124], this.anIntArray25[local124]);
			}
		}
		return local37;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(IZ)Z")
	public boolean method207(@OriginalArg(1) boolean arg0) {
		@Pc(2) int local2 = this.anInt293;
		@Pc(5) int local5 = this.anInt264;
		if (arg0) {
			local5 = this.anInt291;
			local2 = this.anInt297;
		}
		if (local5 == -1) {
			return true;
		}
		@Pc(25) boolean local25 = true;
		if (!Static64.aClass42_47.method1493(0, local5)) {
			local25 = false;
		}
		if (local2 != -1 && !Static64.aClass42_47.method1493(0, local2)) {
			local25 = false;
		}
		return local25;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(IZ)Z")
	public boolean method209(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt287;
		@Pc(14) int local14 = this.anInt283;
		@Pc(17) int local17 = this.anInt309;
		if (arg0) {
			local17 = this.anInt274;
			local14 = this.anInt275;
			local6 = this.anInt302;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(35) boolean local35 = true;
		if (!Static64.aClass42_47.method1493(0, local6)) {
			local35 = false;
		}
		if (local14 != -1 && !Static64.aClass42_47.method1493(0, local14)) {
			local35 = false;
		}
		if (local17 != -1 && !Static64.aClass42_47.method1493(0, local17)) {
			local35 = false;
		}
		return local35;
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(IZ)Lclient!lb;")
	public Class3_Sub1_Sub3_Sub3 method210(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt264;
		@Pc(11) int local11 = this.anInt293;
		if (arg0) {
			local8 = this.anInt291;
			local11 = this.anInt297;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(34) Class3_Sub1_Sub3_Sub3 local34 = Static57.method949(Static64.aClass42_47, local8);
		if (local11 != -1) {
			@Pc(42) Class3_Sub1_Sub3_Sub3 local42 = Static57.method949(Static64.aClass42_47, local11);
			@Pc(53) Class3_Sub1_Sub3_Sub3[] local53 = new Class3_Sub1_Sub3_Sub3[] { local34, local42 };
			local34 = new Class3_Sub1_Sub3_Sub3(local53, 2);
		}
		if (this.anIntArray26 != null) {
			for (@Pc(64) int local64 = 0; local64 < this.anIntArray26.length; local64++) {
				local34.method965(this.anIntArray26[local64], this.anIntArray25[local64]);
			}
		}
		return local34;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!bc;Lclient!bc;)V")
	public void method211(@OriginalArg(1) Class3_Sub1_Sub2 arg0, @OriginalArg(2) Class3_Sub1_Sub2 arg1) {
		this.anInt303 = arg1.anInt303;
		this.anInt301 = arg1.anInt301;
		this.anInt306 = arg1.anInt306;
		this.anInt294 = arg1.anInt294;
		this.aBoolean12 = true;
		this.anInt271 = arg1.anInt271;
		this.anIntArray26 = arg1.anIntArray26;
		this.anInt296 = arg0.anInt296;
		this.aClass62_116 = arg0.aClass62_116;
		this.anInt290 = arg1.anInt290;
		this.anInt300 = arg1.anInt300;
		this.aBoolean14 = arg0.aBoolean14;
		this.anIntArray25 = arg1.anIntArray25;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!kd;B)V")
	public void method213(@OriginalArg(0) Class3_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1803();
			if (local5 == 0) {
				return;
			}
			this.method218(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZII)Lclient!lb;")
	public Class3_Sub1_Sub3_Sub3 method214(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22;
		if (this.anIntArray24 != null && arg1 > 1) {
			@Pc(20) int local20 = -1;
			for (local22 = 0; local22 < 10; local22++) {
				if (this.anIntArray23[local22] <= arg1 && this.anIntArray23[local22] != 0) {
					local20 = this.anIntArray24[local22];
				}
			}
			if (local20 != -1) {
				return Static4.method160(local20).method214(arg0, 1);
			}
		}
		@Pc(68) Class3_Sub1_Sub3_Sub3 local68;
		if (arg0) {
			local68 = (Class3_Sub1_Sub3_Sub3) Static79.aClass34_26.method764((long) this.anInt288);
			if (local68 != null) {
				return local68;
			}
		}
		local68 = Static57.method949(Static64.aClass42_47, this.anInt301);
		if (local68 == null) {
			return null;
		}
		if (this.anInt266 != 128 || this.anInt299 != 128 || this.anInt270 != 128) {
			local68.method957(this.anInt266, this.anInt299, this.anInt270);
		}
		if (this.anIntArray26 != null) {
			for (local22 = 0; local22 < this.anIntArray26.length; local22++) {
				local68.method965(this.anIntArray26[local22], this.anIntArray25[local22]);
			}
		}
		if (arg0) {
			local68.method953(this.anInt265 + 64, this.anInt292 + 768, -50, -10, -50, true);
			local68.aBoolean85 = true;
			Static79.aClass34_26.method765((long) this.anInt288, local68);
		}
		return local68;
	}

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)V")
	public void method217() {
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!kd;II)V")
	private void method218(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt301 = arg0.method1789();
		} else if (arg1 == 2) {
			this.aClass62_116 = arg0.method1773();
		} else if (arg1 == 4) {
			this.anInt290 = arg0.method1789();
		} else if (arg1 == 5) {
			this.anInt303 = arg0.method1789();
		} else if (arg1 == 6) {
			this.anInt306 = arg0.method1789();
		} else if (arg1 == 7) {
			this.anInt294 = arg0.method1789();
			if (this.anInt294 > 32767) {
				this.anInt294 -= 65536;
				return;
			}
		} else if (arg1 == 8) {
			this.anInt300 = arg0.method1789();
			if (this.anInt300 > 32767) {
				this.anInt300 -= 65536;
				return;
			}
			return;
		} else if (arg1 == 10) {
			arg0.method1789();
			return;
		} else if (arg1 == 11) {
			this.aBoolean12 = true;
			return;
		} else if (arg1 == 12) {
			this.anInt296 = arg0.method1770();
			return;
		} else if (arg1 == 16) {
			this.aBoolean14 = true;
			return;
		} else if (arg1 == 23) {
			this.anInt287 = arg0.method1789();
			this.anInt308 = arg0.method1803();
			return;
		} else {
			if (arg1 == 24) {
				this.anInt283 = arg0.method1789();
			} else if (arg1 == 25) {
				this.anInt302 = arg0.method1789();
				this.anInt286 = arg0.method1803();
				return;
			} else if (arg1 == 26) {
				this.anInt275 = arg0.method1789();
				return;
			} else if (arg1 >= 30 && arg1 < 35) {
				this.aClass62Array4[arg1 - 30] = arg0.method1773();
				if (this.aClass62Array4[arg1 - 30].method1680(Static72.aClass62_861)) {
					this.aClass62Array4[arg1 - 30] = null;
					return;
				}
			} else if (arg1 < 35 || arg1 >= 40) {
				if (arg1 != 40) {
					if (arg1 != 78) {
						if (arg1 == 79) {
							this.anInt274 = arg0.method1789();
							return;
						}
						if (arg1 == 90) {
							this.anInt264 = arg0.method1789();
							return;
						}
						if (arg1 == 91) {
							this.anInt291 = arg0.method1789();
							return;
						}
						if (arg1 == 92) {
							this.anInt293 = arg0.method1789();
							return;
						}
						if (arg1 == 93) {
							this.anInt297 = arg0.method1789();
							return;
						}
						if (arg1 == 95) {
							this.anInt271 = arg0.method1789();
							return;
						}
						if (arg1 == 97) {
							this.anInt298 = arg0.method1789();
							return;
						}
						if (arg1 == 98) {
							this.anInt280 = arg0.method1789();
							return;
						}
						if (arg1 >= 100 && arg1 < 110) {
							if (this.anIntArray24 == null) {
								this.anIntArray23 = new int[10];
								this.anIntArray24 = new int[10];
							}
							this.anIntArray24[arg1 - 100] = arg0.method1789();
							this.anIntArray23[arg1 - 100] = arg0.method1789();
							return;
						}
						if (arg1 == 110) {
							this.anInt266 = arg0.method1789();
							return;
						}
						if (arg1 == 111) {
							this.anInt299 = arg0.method1789();
							return;
						}
						if (arg1 == 112) {
							this.anInt270 = arg0.method1789();
							return;
						}
						if (arg1 == 113) {
							this.anInt265 = arg0.method1765();
						} else if (arg1 == 114) {
							this.anInt292 = arg0.method1765() * 5;
							return;
						} else if (arg1 == 115) {
							this.anInt304 = arg0.method1803();
							return;
						}
						return;
					}
					this.anInt309 = arg0.method1789();
					return;
				}
				@Pc(151) int local151 = arg0.method1803();
				this.anIntArray26 = new int[local151];
				this.anIntArray25 = new int[local151];
				for (@Pc(161) int local161 = 0; local161 < local151; local161++) {
					this.anIntArray26[local161] = arg0.method1789();
					this.anIntArray25[local161] = arg0.method1789();
				}
				return;
			} else {
				this.aClass62Array3[arg1 - 35] = arg0.method1773();
				return;
			}
			return;
		}
	}
}
