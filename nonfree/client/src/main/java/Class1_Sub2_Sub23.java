import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class1_Sub2_Sub23 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ud", name = "U", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!ud", name = "jb", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!ud", name = "qb", descriptor = "[I")
	public int[] anIntArray363;

	@OriginalMember(owner = "client!ud", name = "vb", descriptor = "I")
	private int anInt4224;

	@OriginalMember(owner = "client!ud", name = "yb", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!ud", name = "Db", descriptor = "[I")
	public int[] anIntArray365;

	@OriginalMember(owner = "client!ud", name = "Jb", descriptor = "I")
	public int anInt4234;

	@OriginalMember(owner = "client!ud", name = "Tb", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
	public int anInt4198 = -1;

	@OriginalMember(owner = "client!ud", name = "L", descriptor = "Z")
	public boolean aBoolean197 = false;

	@OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
	public int anInt4197 = -1;

	@OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
	public int anInt4200 = 0;

	@OriginalMember(owner = "client!ud", name = "X", descriptor = "I")
	public int anInt4205 = -1;

	@OriginalMember(owner = "client!ud", name = "kb", descriptor = "I")
	public int anInt4216 = 0;

	@OriginalMember(owner = "client!ud", name = "ib", descriptor = "I")
	public int anInt4215 = -1;

	@OriginalMember(owner = "client!ud", name = "nb", descriptor = "I")
	private int anInt4218 = 0;

	@OriginalMember(owner = "client!ud", name = "bb", descriptor = "I")
	private int anInt4208 = -1;

	@OriginalMember(owner = "client!ud", name = "wb", descriptor = "I")
	private int anInt4225 = -1;

	@OriginalMember(owner = "client!ud", name = "sb", descriptor = "I")
	public int anInt4221 = -1;

	@OriginalMember(owner = "client!ud", name = "Ab", descriptor = "I")
	private int anInt4227 = 128;

	@OriginalMember(owner = "client!ud", name = "eb", descriptor = "I")
	public int anInt4211 = 0;

	@OriginalMember(owner = "client!ud", name = "xb", descriptor = "I")
	private int anInt4226 = -1;

	@OriginalMember(owner = "client!ud", name = "Bb", descriptor = "I")
	private int anInt4228 = -1;

	@OriginalMember(owner = "client!ud", name = "Fb", descriptor = "I")
	public int anInt4231 = 0;

	@OriginalMember(owner = "client!ud", name = "hb", descriptor = "I")
	public int anInt4214 = 0;

	@OriginalMember(owner = "client!ud", name = "V", descriptor = "I")
	private int anInt4203 = 128;

	@OriginalMember(owner = "client!ud", name = "ub", descriptor = "I")
	public int anInt4223 = -1;

	@OriginalMember(owner = "client!ud", name = "Ib", descriptor = "[Lclient!dj;")
	public Class24[] aClass24Array25 = new Class24[] { null, null, Static155.aClass24_874, null, null };

	@OriginalMember(owner = "client!ud", name = "Cb", descriptor = "I")
	private int anInt4229 = -1;

	@OriginalMember(owner = "client!ud", name = "mb", descriptor = "I")
	private int anInt4217 = -1;

	@OriginalMember(owner = "client!ud", name = "Y", descriptor = "[Lclient!dj;")
	public Class24[] aClass24Array24 = new Class24[] { null, null, null, null, Static107.aClass24_723 };

	@OriginalMember(owner = "client!ud", name = "ab", descriptor = "I")
	public int anInt4207 = 0;

	@OriginalMember(owner = "client!ud", name = "Mb", descriptor = "I")
	private int anInt4237 = -1;

	@OriginalMember(owner = "client!ud", name = "R", descriptor = "Lclient!dj;")
	public Class24 aClass24_1214 = Static194.aClass24_1248;

	@OriginalMember(owner = "client!ud", name = "db", descriptor = "I")
	public int anInt4210 = 1;

	@OriginalMember(owner = "client!ud", name = "Rb", descriptor = "I")
	private int anInt4242 = 0;

	@OriginalMember(owner = "client!ud", name = "Ob", descriptor = "I")
	private int anInt4239 = -1;

	@OriginalMember(owner = "client!ud", name = "zb", descriptor = "Z")
	public boolean aBoolean198 = false;

	@OriginalMember(owner = "client!ud", name = "Lb", descriptor = "I")
	private int anInt4236 = 0;

	@OriginalMember(owner = "client!ud", name = "Sb", descriptor = "I")
	public int anInt4243 = 0;

	@OriginalMember(owner = "client!ud", name = "Eb", descriptor = "I")
	private int anInt4230 = 128;

	@OriginalMember(owner = "client!ud", name = "Qb", descriptor = "I")
	private int anInt4241 = 0;

	@OriginalMember(owner = "client!ud", name = "Ub", descriptor = "I")
	public int anInt4244 = 2000;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)Lclient!se;")
	public Class5_Sub6 method3244(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt4197;
		@Pc(9) int local9 = this.anInt4237;
		@Pc(12) int local12 = this.anInt4217;
		if (arg0) {
			local6 = this.anInt4215;
			local9 = this.anInt4228;
			local12 = this.anInt4225;
		}
		if (local6 == -1) {
			return null;
		}
		@Pc(33) Class5_Sub6 local33 = Static171.method2955(Static56.aClass69_15, local6);
		if (local9 != -1) {
			@Pc(41) Class5_Sub6 local41 = Static171.method2955(Static56.aClass69_15, local9);
			if (local12 == -1) {
				@Pc(83) Class5_Sub6[] local83 = new Class5_Sub6[] { local33, local41 };
				local33 = new Class5_Sub6(local83, 2);
			} else {
				@Pc(50) Class5_Sub6 local50 = Static171.method2955(Static56.aClass69_15, local12);
				@Pc(65) Class5_Sub6[] local65 = new Class5_Sub6[] { local33, local41, local50 };
				local33 = new Class5_Sub6(local65, 3);
			}
		}
		if (!arg0 && this.anInt4236 != 0) {
			local33.method2950(0, this.anInt4236, 0);
		}
		if (arg0 && this.anInt4218 != 0) {
			local33.method2950(0, this.anInt4218, 0);
		}
		@Pc(116) int local116;
		if (this.aShortArray56 != null) {
			for (local116 = 0; local116 < this.aShortArray56.length; local116++) {
				local33.method2936(this.aShortArray56[local116], this.aShortArray55[local116]);
			}
		}
		if (this.aShortArray58 != null) {
			for (local116 = 0; local116 < this.aShortArray58.length; local116++) {
				local33.method2934(this.aShortArray58[local116], this.aShortArray57[local116]);
			}
		}
		return local33;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!ud;Lclient!ud;)V")
	public void method3245(@OriginalArg(1) Class1_Sub2_Sub23 arg0, @OriginalArg(2) Class1_Sub2_Sub23 arg1) {
		this.anInt4244 = arg0.anInt4244;
		this.aShortArray56 = arg0.aShortArray56;
		this.anInt4231 = arg0.anInt4231;
		this.anInt4207 = arg0.anInt4207;
		this.aBoolean197 = arg1.aBoolean197;
		this.anInt4243 = arg0.anInt4243;
		this.anInt4214 = 1;
		this.aClass24_1214 = arg1.aClass24_1214;
		this.anInt4210 = arg1.anInt4210;
		this.aShortArray58 = arg0.aShortArray58;
		this.anInt4216 = arg0.anInt4216;
		this.aShortArray55 = arg0.aShortArray55;
		this.anInt4224 = arg0.anInt4224;
		this.aShortArray57 = arg0.aShortArray57;
		this.anInt4211 = arg0.anInt4211;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ud;Lclient!ud;B)V")
	public void method3246(@OriginalArg(0) Class1_Sub2_Sub23 arg0, @OriginalArg(1) Class1_Sub2_Sub23 arg1) {
		this.anInt4224 = arg0.anInt4224;
		this.anInt4237 = arg1.anInt4237;
		this.anInt4210 = 0;
		this.anInt4211 = arg0.anInt4211;
		this.anInt4243 = arg0.anInt4243;
		this.aClass24_1214 = arg1.aClass24_1214;
		this.aShortArray55 = arg0.aShortArray55;
		this.aShortArray58 = arg0.aShortArray58;
		this.anInt4239 = arg1.anInt4239;
		this.anInt4217 = arg1.anInt4217;
		this.aBoolean197 = arg1.aBoolean197;
		this.aClass24Array25 = arg1.aClass24Array25;
		this.anInt4244 = arg0.anInt4244;
		this.aShortArray57 = arg0.aShortArray57;
		this.anInt4197 = arg1.anInt4197;
		this.anInt4208 = arg1.anInt4208;
		this.anInt4228 = arg1.anInt4228;
		this.anInt4226 = arg1.anInt4226;
		this.anInt4200 = arg1.anInt4200;
		this.anInt4229 = arg1.anInt4229;
		this.aClass24Array24 = new Class24[5];
		this.anInt4207 = arg0.anInt4207;
		this.anInt4216 = arg0.anInt4216;
		this.anInt4225 = arg1.anInt4225;
		this.anInt4215 = arg1.anInt4215;
		this.aShortArray56 = arg0.aShortArray56;
		this.anInt4231 = arg0.anInt4231;
		if (arg1.aClass24Array24 != null) {
			for (@Pc(123) int local123 = 0; local123 < 4; local123++) {
				this.aClass24Array24[local123] = arg1.aClass24Array24[local123];
			}
		}
		this.aClass24Array24[4] = Static44.aClass24_278;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIBLclient!td;)Lclient!lg;")
	public Class5_Sub1 method3247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub2_Sub22 arg2) {
		if (this.anIntArray365 != null && arg0 > 1) {
			@Pc(18) int local18 = -1;
			for (@Pc(20) int local20 = 0; local20 < 10; local20++) {
				if (arg0 >= this.anIntArray363[local20] && this.anIntArray363[local20] != 0) {
					local18 = this.anIntArray365[local20];
				}
			}
			if (local18 != -1) {
				return Static168.method2886(local18).method3247(1, arg1, arg2);
			}
		}
		@Pc(69) Class5_Sub1 local69 = (Class5_Sub1) Static152.aClass46_8.method1588((long) this.anInt4234);
		if (local69 == null) {
			@Pc(77) Class5_Sub6 local77 = Static171.method2955(Static56.aClass69_15, this.anInt4224);
			if (local77 == null) {
				return null;
			}
			@Pc(86) int local86;
			if (this.aShortArray56 != null) {
				for (local86 = 0; local86 < this.aShortArray56.length; local86++) {
					local77.method2936(this.aShortArray56[local86], this.aShortArray55[local86]);
				}
			}
			if (this.aShortArray58 != null) {
				for (local86 = 0; local86 < this.aShortArray58.length; local86++) {
					local77.method2934(this.aShortArray58[local86], this.aShortArray57[local86]);
				}
			}
			local69 = local77.method2942(this.anInt4242 + 64, 768 - -this.anInt4241, -50, -10, -50);
			if (this.anInt4227 != 128 || this.anInt4230 != 128 || this.anInt4203 != 128) {
				local69.method154(this.anInt4227, this.anInt4230, this.anInt4203);
			}
			local69.aBoolean6 = true;
			Static152.aClass46_8.method1586(local69, (long) this.anInt4234);
		}
		if (arg2 != null) {
			local69 = arg2.method3079(arg1, local69);
		}
		return local69;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)Z")
	public boolean method3249(@OriginalArg(0) boolean arg0) {
		@Pc(2) int local2 = this.anInt4197;
		@Pc(9) int local9 = this.anInt4237;
		@Pc(12) int local12 = this.anInt4217;
		if (arg0) {
			local12 = this.anInt4225;
			local2 = this.anInt4215;
			local9 = this.anInt4228;
		}
		if (local2 == -1) {
			return true;
		}
		@Pc(31) boolean local31 = true;
		if (!Static56.aClass69_15.method2194(local2, 0)) {
			local31 = false;
		}
		if (local9 != -1 && !Static56.aClass69_15.method2194(local9, 0)) {
			local31 = false;
		}
		if (local12 != -1 && !Static56.aClass69_15.method2194(local12, 0)) {
			local31 = false;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILclient!fj;)V")
	private void method3250(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt4224 = arg1.method2765();
		} else if (arg0 == 2) {
			this.aClass24_1214 = arg1.method2761();
		} else if (arg0 == 4) {
			this.anInt4244 = arg1.method2765();
		} else if (arg0 == 5) {
			this.anInt4231 = arg1.method2765();
		} else if (arg0 == 6) {
			this.anInt4207 = arg1.method2765();
		} else if (arg0 == 7) {
			this.anInt4216 = arg1.method2765();
			if (this.anInt4216 > 32767) {
				this.anInt4216 -= 65536;
			}
		} else if (arg0 == 8) {
			this.anInt4211 = arg1.method2765();
			if (this.anInt4211 > 32767) {
				this.anInt4211 -= 65536;
			}
		} else if (arg0 == 11) {
			this.anInt4214 = 1;
		} else if (arg0 == 12) {
			this.anInt4210 = arg1.method2793();
		} else if (arg0 == 16) {
			this.aBoolean197 = true;
		} else if (arg0 == 23) {
			this.anInt4197 = arg1.method2765();
			this.anInt4236 = arg1.method2771();
		} else if (arg0 == 24) {
			this.anInt4237 = arg1.method2765();
		} else if (arg0 == 25) {
			this.anInt4215 = arg1.method2765();
			this.anInt4218 = arg1.method2771();
		} else if (arg0 == 26) {
			this.anInt4228 = arg1.method2765();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass24Array25[arg0 - 30] = arg1.method2761();
			if (this.aClass24Array25[arg0 - 30].method771(Static93.aClass24_635)) {
				this.aClass24Array25[arg0 - 30] = null;
			}
		} else if (arg0 >= 35 && arg0 < 40) {
			this.aClass24Array24[arg0 - 35] = arg1.method2761();
		} else {
			@Pc(192) int local192;
			@Pc(202) int local202;
			if (arg0 == 40) {
				local192 = arg1.method2771();
				this.aShortArray56 = new short[local192];
				this.aShortArray55 = new short[local192];
				for (local202 = 0; local202 < local192; local202++) {
					this.aShortArray56[local202] = (short) arg1.method2765();
					this.aShortArray55[local202] = (short) arg1.method2765();
				}
			} else if (arg0 == 41) {
				local192 = arg1.method2771();
				this.aShortArray58 = new short[local192];
				this.aShortArray57 = new short[local192];
				for (local202 = 0; local202 < local192; local202++) {
					this.aShortArray58[local202] = (short) arg1.method2765();
					this.aShortArray57[local202] = (short) arg1.method2765();
				}
			} else if (arg0 == 65) {
				this.aBoolean198 = true;
			} else if (arg0 == 78) {
				this.anInt4217 = arg1.method2765();
			} else if (arg0 == 79) {
				this.anInt4225 = arg1.method2765();
			} else if (arg0 == 90) {
				this.anInt4239 = arg1.method2765();
			} else if (arg0 == 91) {
				this.anInt4229 = arg1.method2765();
			} else if (arg0 == 92) {
				this.anInt4208 = arg1.method2765();
			} else if (arg0 == 93) {
				this.anInt4226 = arg1.method2765();
			} else if (arg0 == 95) {
				this.anInt4243 = arg1.method2765();
			} else if (arg0 == 97) {
				this.anInt4198 = arg1.method2765();
			} else if (arg0 == 98) {
				this.anInt4221 = arg1.method2765();
			} else if (arg0 >= 100 && arg0 < 110) {
				if (this.anIntArray365 == null) {
					this.anIntArray365 = new int[10];
					this.anIntArray363 = new int[10];
				}
				this.anIntArray365[arg0 - 100] = arg1.method2765();
				this.anIntArray363[arg0 - 100] = arg1.method2765();
			} else if (arg0 == 110) {
				this.anInt4227 = arg1.method2765();
			} else if (arg0 == 111) {
				this.anInt4230 = arg1.method2765();
			} else if (arg0 == 112) {
				this.anInt4203 = arg1.method2765();
			} else if (arg0 == 113) {
				this.anInt4242 = arg1.method2770();
			} else if (arg0 == 114) {
				this.anInt4241 = arg1.method2770() * 5;
			} else if (arg0 == 115) {
				this.anInt4200 = arg1.method2771();
			} else if (arg0 == 121) {
				this.anInt4205 = arg1.method2765();
			} else if (arg0 == 122) {
				this.anInt4223 = arg1.method2765();
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(Z)Lclient!ae;")
	public Class5_Sub1_Sub1 method3251() {
		@Pc(9) Class5_Sub6 local9 = Static171.method2955(Static56.aClass69_15, this.anInt4224);
		if (local9 == null) {
			return null;
		}
		@Pc(18) int local18;
		if (this.aShortArray56 != null) {
			for (local18 = 0; local18 < this.aShortArray56.length; local18++) {
				local9.method2936(this.aShortArray56[local18], this.aShortArray55[local18]);
			}
		}
		if (this.aShortArray58 != null) {
			for (local18 = 0; local18 < this.aShortArray58.length; local18++) {
				local9.method2934(this.aShortArray58[local18], this.aShortArray57[local18]);
			}
		}
		@Pc(79) Class5_Sub1_Sub1 local79 = local9.method2948(this.anInt4242 + 64, this.anInt4241 + 768);
		if (this.anInt4227 != 128 || this.anInt4230 != 128 || this.anInt4203 != 128) {
			local79.method154(this.anInt4227, this.anInt4230, this.anInt4203);
		}
		return local79;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)Lclient!ud;")
	public Class1_Sub2_Sub23 method3252(@OriginalArg(0) int arg0) {
		if (this.anIntArray365 != null && arg0 > 1) {
			@Pc(20) int local20 = -1;
			for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
				if (arg0 >= this.anIntArray363[local22] && this.anIntArray363[local22] != 0) {
					local20 = this.anIntArray365[local22];
				}
			}
			if (local20 != -1) {
				return Static168.method2886(local20);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(IZ)Lclient!se;")
	public Class5_Sub6 method3253(@OriginalArg(1) boolean arg0) {
		@Pc(10) int local10 = this.anInt4208;
		@Pc(17) int local17 = this.anInt4239;
		if (arg0) {
			local10 = this.anInt4226;
			local17 = this.anInt4229;
		}
		if (local17 == -1) {
			return null;
		}
		@Pc(36) Class5_Sub6 local36 = Static171.method2955(Static56.aClass69_15, local17);
		if (local10 != -1) {
			@Pc(44) Class5_Sub6 local44 = Static171.method2955(Static56.aClass69_15, local10);
			@Pc(55) Class5_Sub6[] local55 = new Class5_Sub6[] { local36, local44 };
			local36 = new Class5_Sub6(local55, 2);
		}
		@Pc(66) int local66;
		if (this.aShortArray56 != null) {
			for (local66 = 0; local66 < this.aShortArray56.length; local66++) {
				local36.method2936(this.aShortArray56[local66], this.aShortArray55[local66]);
			}
		}
		if (this.aShortArray58 != null) {
			for (local66 = 0; local66 < this.aShortArray58.length; local66++) {
				local36.method2934(this.aShortArray58[local66], this.aShortArray57[local66]);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V")
	public void method3255() {
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(IZ)Z")
	public boolean method3257(@OriginalArg(1) boolean arg0) {
		@Pc(2) int local2 = this.anInt4239;
		@Pc(5) int local5 = this.anInt4208;
		if (arg0) {
			local5 = this.anInt4226;
			local2 = this.anInt4229;
		}
		if (local2 == -1) {
			return true;
		}
		@Pc(24) boolean local24 = true;
		if (!Static56.aClass69_15.method2194(local2, 0)) {
			local24 = false;
		}
		if (local5 != -1 && !Static56.aClass69_15.method2194(local5, 0)) {
			local24 = false;
		}
		return local24;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!fj;)V")
	public void method3259(@OriginalArg(1) Class1_Sub7 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2771();
			if (local3 == 0) {
				return;
			}
			this.method3250(local3, arg0);
		}
	}
}
