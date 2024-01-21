import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class3_Sub3_Sub11 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ff", name = "F", descriptor = "[I")
	public int[] anIntArray68;

	@OriginalMember(owner = "client!ff", name = "P", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!ff", name = "S", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!ff", name = "eb", descriptor = "I")
	public int anInt1234;

	@OriginalMember(owner = "client!ff", name = "ib", descriptor = "[I")
	public int[] anIntArray69;

	@OriginalMember(owner = "client!ff", name = "kb", descriptor = "I")
	private int anInt1239;

	@OriginalMember(owner = "client!ff", name = "zb", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!ff", name = "Rb", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!ff", name = "Z", descriptor = "I")
	private int anInt1231 = -1;

	@OriginalMember(owner = "client!ff", name = "X", descriptor = "I")
	private int anInt1230 = -1;

	@OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
	public int anInt1222 = -1;

	@OriginalMember(owner = "client!ff", name = "lb", descriptor = "I")
	private int anInt1240 = 0;

	@OriginalMember(owner = "client!ff", name = "mb", descriptor = "I")
	private int anInt1241 = 128;

	@OriginalMember(owner = "client!ff", name = "Y", descriptor = "Z")
	public boolean aBoolean72 = false;

	@OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
	public int anInt1218 = 0;

	@OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
	private int anInt1219 = 128;

	@OriginalMember(owner = "client!ff", name = "tb", descriptor = "I")
	private int anInt1248 = 0;

	@OriginalMember(owner = "client!ff", name = "ab", descriptor = "Z")
	public boolean aBoolean73 = false;

	@OriginalMember(owner = "client!ff", name = "db", descriptor = "I")
	public int anInt1233 = 0;

	@OriginalMember(owner = "client!ff", name = "sb", descriptor = "I")
	private int anInt1247 = -1;

	@OriginalMember(owner = "client!ff", name = "Cb", descriptor = "[Lclient!oc;")
	public Class70[] aClass70Array25 = new Class70[] { null, null, null, null, Static69.aClass70_656 };

	@OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
	private int anInt1221 = 128;

	@OriginalMember(owner = "client!ff", name = "Ab", descriptor = "I")
	private int anInt1252 = 0;

	@OriginalMember(owner = "client!ff", name = "Db", descriptor = "I")
	public int anInt1254 = 0;

	@OriginalMember(owner = "client!ff", name = "Jb", descriptor = "I")
	public int anInt1260 = 1;

	@OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
	public int anInt1228 = -1;

	@OriginalMember(owner = "client!ff", name = "ob", descriptor = "I")
	private int anInt1243 = -1;

	@OriginalMember(owner = "client!ff", name = "yb", descriptor = "I")
	public int anInt1251 = 2000;

	@OriginalMember(owner = "client!ff", name = "wb", descriptor = "I")
	public int anInt1250 = -1;

	@OriginalMember(owner = "client!ff", name = "Gb", descriptor = "I")
	private int anInt1257 = -1;

	@OriginalMember(owner = "client!ff", name = "Nb", descriptor = "I")
	private int anInt1264 = -1;

	@OriginalMember(owner = "client!ff", name = "Eb", descriptor = "I")
	public int anInt1255 = 0;

	@OriginalMember(owner = "client!ff", name = "hb", descriptor = "I")
	private int anInt1237 = 0;

	@OriginalMember(owner = "client!ff", name = "gb", descriptor = "I")
	private int anInt1236 = -1;

	@OriginalMember(owner = "client!ff", name = "Pb", descriptor = "I")
	public int anInt1265 = 0;

	@OriginalMember(owner = "client!ff", name = "Lb", descriptor = "I")
	public int anInt1262 = -1;

	@OriginalMember(owner = "client!ff", name = "Mb", descriptor = "I")
	private int anInt1263 = -1;

	@OriginalMember(owner = "client!ff", name = "Ib", descriptor = "I")
	public int anInt1259 = -1;

	@OriginalMember(owner = "client!ff", name = "cb", descriptor = "I")
	public int anInt1232 = 0;

	@OriginalMember(owner = "client!ff", name = "Kb", descriptor = "I")
	public int anInt1261 = -1;

	@OriginalMember(owner = "client!ff", name = "Sb", descriptor = "I")
	public int anInt1266 = 0;

	@OriginalMember(owner = "client!ff", name = "xb", descriptor = "Lclient!oc;")
	public Class70 aClass70_579 = Static99.aClass70_999;

	@OriginalMember(owner = "client!ff", name = "Tb", descriptor = "[Lclient!oc;")
	public Class70[] aClass70Array26 = new Class70[] { null, null, Static90.aClass70_918, null, null };

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)Lclient!ff;")
	public Class3_Sub3_Sub11 method900(@OriginalArg(1) int arg0) {
		if (this.anIntArray69 != null && arg0 > 1) {
			@Pc(18) int local18 = -1;
			for (@Pc(20) int local20 = 0; local20 < 10; local20++) {
				if (arg0 >= this.anIntArray68[local20] && this.anIntArray68[local20] != 0) {
					local18 = this.anIntArray69[local20];
				}
			}
			if (local18 != -1) {
				return Static14.method275(local18);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(B)Lclient!rh;")
	public Class26_Sub6_Sub1 method901() {
		@Pc(15) Class26_Sub5 local15 = Static128.method1788(Static13.aClass52_3, this.anInt1239);
		if (local15 == null) {
			return null;
		}
		@Pc(24) int local24;
		if (this.aShortArray14 != null) {
			for (local24 = 0; local24 < this.aShortArray14.length; local24++) {
				local15.method1779(this.aShortArray14[local24], this.aShortArray17[local24]);
			}
		}
		if (this.aShortArray16 != null) {
			for (local24 = 0; local24 < this.aShortArray16.length; local24++) {
				local15.method1793(this.aShortArray16[local24], this.aShortArray15[local24]);
			}
		}
		@Pc(86) Class26_Sub6_Sub1 local86 = local15.method1783(this.anInt1248 + 64, 768 - -this.anInt1240);
		if (this.anInt1219 != 128 || this.anInt1221 != 128 || this.anInt1241 != 128) {
			local86.method2536(this.anInt1219, this.anInt1221, this.anInt1241);
		}
		return local86;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZI)Z")
	public boolean method904(@OriginalArg(0) boolean arg0) {
		@Pc(12) int local12 = this.anInt1230;
		@Pc(15) int local15 = this.anInt1243;
		@Pc(18) int local18 = this.anInt1228;
		if (arg0) {
			local18 = this.anInt1259;
			local12 = this.anInt1257;
			local15 = this.anInt1236;
		}
		if (local18 == -1) {
			return true;
		}
		@Pc(37) boolean local37 = true;
		if (!Static13.aClass52_3.method1558(local18, 0)) {
			local37 = false;
		}
		if (local15 != -1 && !Static13.aClass52_3.method1558(local15, 0)) {
			local37 = false;
		}
		if (local12 != -1 && !Static13.aClass52_3.method1558(local12, 0)) {
			local37 = false;
		}
		return local37;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!nd;III)Lclient!wa;")
	public Class26_Sub6 method905(@OriginalArg(0) Class3_Sub3_Sub17 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.anIntArray69 != null && arg1 > 1) {
			@Pc(18) int local18 = -1;
			for (@Pc(20) int local20 = 0; local20 < 10; local20++) {
				if (arg1 >= this.anIntArray68[local20] && this.anIntArray68[local20] != 0) {
					local18 = this.anIntArray69[local20];
				}
			}
			if (local18 != -1) {
				return Static14.method275(local18).method905(arg0, 1, arg2);
			}
		}
		@Pc(65) Class26_Sub6 local65 = (Class26_Sub6) Static55.aClass94_3.method3153((long) this.anInt1234);
		if (local65 == null) {
			@Pc(73) Class26_Sub5 local73 = Static128.method1788(Static13.aClass52_3, this.anInt1239);
			if (local73 == null) {
				return null;
			}
			@Pc(82) int local82;
			if (this.aShortArray14 != null) {
				for (local82 = 0; local82 < this.aShortArray14.length; local82++) {
					local73.method1779(this.aShortArray14[local82], this.aShortArray17[local82]);
				}
			}
			if (this.aShortArray16 != null) {
				for (local82 = 0; local82 < this.aShortArray16.length; local82++) {
					local73.method1793(this.aShortArray16[local82], this.aShortArray15[local82]);
				}
			}
			local65 = local73.method1798(this.anInt1248 + 64, 768 - -this.anInt1240, -50, -10, -50);
			if (this.anInt1219 != 128 || this.anInt1221 != 128 || this.anInt1241 != 128) {
				local65.method2536(this.anInt1219, this.anInt1221, this.anInt1241);
			}
			local65.aBoolean154 = true;
			Static55.aClass94_3.method3154((long) this.anInt1234, local65);
		}
		if (arg0 != null) {
			local65 = arg0.method1926(local65, arg2);
		}
		return local65;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZZ)Lclient!md;")
	public Class26_Sub5 method907(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt1264;
		@Pc(9) int local9 = this.anInt1247;
		if (arg0) {
			local6 = this.anInt1263;
			local9 = this.anInt1231;
		}
		if (local9 == -1) {
			return null;
		}
		@Pc(33) Class26_Sub5 local33 = Static128.method1788(Static13.aClass52_3, local9);
		if (local6 != -1) {
			@Pc(42) Class26_Sub5 local42 = Static128.method1788(Static13.aClass52_3, local6);
			@Pc(53) Class26_Sub5[] local53 = new Class26_Sub5[] { local33, local42 };
			local33 = new Class26_Sub5(local53, 2);
		}
		@Pc(64) int local64;
		if (this.aShortArray14 != null) {
			for (local64 = 0; local64 < this.aShortArray14.length; local64++) {
				local33.method1779(this.aShortArray14[local64], this.aShortArray17[local64]);
			}
		}
		if (this.aShortArray16 != null) {
			for (local64 = 0; local64 < this.aShortArray16.length; local64++) {
				local33.method1793(this.aShortArray16[local64], this.aShortArray15[local64]);
			}
		}
		return local33;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!ff;Lclient!ff;I)V")
	public void method908(@OriginalArg(0) Class3_Sub3_Sub11 arg0, @OriginalArg(1) Class3_Sub3_Sub11 arg1) {
		this.anInt1243 = arg1.anInt1243;
		this.aClass70Array25 = new Class70[5];
		this.anInt1257 = arg1.anInt1257;
		this.anInt1236 = arg1.anInt1236;
		this.anInt1254 = arg0.anInt1254;
		this.anInt1265 = arg1.anInt1265;
		this.anInt1228 = arg1.anInt1228;
		this.aShortArray15 = arg0.aShortArray15;
		this.aClass70Array26 = arg1.aClass70Array26;
		this.aBoolean72 = arg1.aBoolean72;
		this.anInt1255 = arg0.anInt1255;
		this.aClass70_579 = arg1.aClass70_579;
		this.anInt1259 = arg1.anInt1259;
		this.anInt1263 = arg1.anInt1263;
		this.anInt1247 = arg1.anInt1247;
		this.anInt1264 = arg1.anInt1264;
		this.anInt1231 = arg1.anInt1231;
		this.aShortArray16 = arg0.aShortArray16;
		this.anInt1233 = arg0.anInt1233;
		this.aShortArray14 = arg0.aShortArray14;
		this.aShortArray17 = arg0.aShortArray17;
		this.anInt1266 = arg0.anInt1266;
		this.anInt1239 = arg0.anInt1239;
		this.anInt1218 = arg0.anInt1218;
		this.anInt1251 = arg0.anInt1251;
		this.anInt1260 = 0;
		this.anInt1230 = arg1.anInt1230;
		if (arg1.aClass70Array25 != null) {
			for (@Pc(122) int local122 = 0; local122 < 4; local122++) {
				this.aClass70Array25[local122] = arg1.aClass70Array25[local122];
			}
		}
		this.aClass70Array25[4] = Static54.aClass70_559;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZB)Lclient!md;")
	public Class26_Sub5 method909(@OriginalArg(0) boolean arg0) {
		@Pc(10) int local10 = this.anInt1228;
		@Pc(13) int local13 = this.anInt1243;
		@Pc(16) int local16 = this.anInt1230;
		if (arg0) {
			local10 = this.anInt1259;
			local13 = this.anInt1236;
			local16 = this.anInt1257;
		}
		if (local10 == -1) {
			return null;
		}
		@Pc(41) Class26_Sub5 local41 = Static128.method1788(Static13.aClass52_3, local10);
		if (local13 != -1) {
			@Pc(50) Class26_Sub5 local50 = Static128.method1788(Static13.aClass52_3, local13);
			if (local16 == -1) {
				@Pc(64) Class26_Sub5[] local64 = new Class26_Sub5[] { local41, local50 };
				local41 = new Class26_Sub5(local64, 2);
			} else {
				@Pc(76) Class26_Sub5 local76 = Static128.method1788(Static13.aClass52_3, local16);
				@Pc(91) Class26_Sub5[] local91 = new Class26_Sub5[] { local41, local50, local76 };
				local41 = new Class26_Sub5(local91, 3);
			}
		}
		if (!arg0 && this.anInt1237 != 0) {
			local41.method1797(0, this.anInt1237, 0);
		}
		if (arg0 && this.anInt1252 != 0) {
			local41.method1797(0, this.anInt1252, 0);
		}
		@Pc(127) int local127;
		if (this.aShortArray14 != null) {
			for (local127 = 0; local127 < this.aShortArray14.length; local127++) {
				local41.method1779(this.aShortArray14[local127], this.aShortArray17[local127]);
			}
		}
		if (this.aShortArray16 != null) {
			for (local127 = 0; local127 < this.aShortArray16.length; local127++) {
				local41.method1793(this.aShortArray16[local127], this.aShortArray15[local127]);
			}
		}
		return local41;
	}

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)V")
	public void method910() {
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZ)Z")
	public boolean method911(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt1247;
		@Pc(9) int local9 = this.anInt1264;
		if (arg0) {
			local6 = this.anInt1231;
			local9 = this.anInt1263;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(26) boolean local26 = true;
		if (!Static13.aClass52_3.method1558(local6, 0)) {
			local26 = false;
		}
		if (local9 != -1 && !Static13.aClass52_3.method1558(local9, 0)) {
			local26 = false;
		}
		return local26;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!ce;BI)V")
	private void method912(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1239 = arg0.method1270();
		} else if (arg1 == 2) {
			this.aClass70_579 = arg0.method1246();
		} else if (arg1 == 4) {
			this.anInt1251 = arg0.method1270();
		} else if (arg1 == 5) {
			this.anInt1233 = arg0.method1270();
		} else if (arg1 == 6) {
			this.anInt1218 = arg0.method1270();
		} else if (arg1 == 7) {
			this.anInt1266 = arg0.method1270();
			if (this.anInt1266 > 32767) {
				this.anInt1266 -= 65536;
			}
		} else if (arg1 == 8) {
			this.anInt1254 = arg0.method1270();
			if (this.anInt1254 > 32767) {
				this.anInt1254 -= 65536;
			}
		} else if (arg1 == 11) {
			this.anInt1232 = 1;
		} else if (arg1 == 12) {
			this.anInt1260 = arg0.method1245();
		} else if (arg1 == 16) {
			this.aBoolean72 = true;
		} else if (arg1 == 23) {
			this.anInt1228 = arg0.method1270();
			this.anInt1237 = arg0.method1278();
		} else if (arg1 == 24) {
			this.anInt1243 = arg0.method1270();
		} else if (arg1 == 25) {
			this.anInt1259 = arg0.method1270();
			this.anInt1252 = arg0.method1278();
		} else if (arg1 == 26) {
			this.anInt1236 = arg0.method1270();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass70Array26[arg1 - 30] = arg0.method1246();
			if (this.aClass70Array26[arg1 - 30].method2059(Static33.aClass70_322)) {
				this.aClass70Array26[arg1 - 30] = null;
			}
		} else if (arg1 >= 35 && arg1 < 40) {
			this.aClass70Array25[arg1 - 35] = arg0.method1246();
		} else {
			@Pc(396) int local396;
			@Pc(406) int local406;
			if (arg1 == 40) {
				local396 = arg0.method1278();
				this.aShortArray14 = new short[local396];
				this.aShortArray17 = new short[local396];
				for (local406 = 0; local406 < local396; local406++) {
					this.aShortArray14[local406] = (short) arg0.method1270();
					this.aShortArray17[local406] = (short) arg0.method1270();
				}
			} else if (arg1 == 41) {
				local396 = arg0.method1278();
				this.aShortArray15 = new short[local396];
				this.aShortArray16 = new short[local396];
				for (local406 = 0; local406 < local396; local406++) {
					this.aShortArray16[local406] = (short) arg0.method1270();
					this.aShortArray15[local406] = (short) arg0.method1270();
				}
			} else if (arg1 == 65) {
				this.aBoolean73 = true;
			} else if (arg1 == 78) {
				this.anInt1230 = arg0.method1270();
			} else if (arg1 == 79) {
				this.anInt1257 = arg0.method1270();
			} else if (arg1 == 90) {
				this.anInt1247 = arg0.method1270();
			} else if (arg1 == 91) {
				this.anInt1231 = arg0.method1270();
			} else if (arg1 == 92) {
				this.anInt1264 = arg0.method1270();
			} else if (arg1 == 93) {
				this.anInt1263 = arg0.method1270();
			} else if (arg1 == 95) {
				this.anInt1255 = arg0.method1270();
			} else if (arg1 == 97) {
				this.anInt1250 = arg0.method1270();
			} else if (arg1 == 98) {
				this.anInt1261 = arg0.method1270();
			} else if (arg1 >= 100 && arg1 < 110) {
				if (this.anIntArray69 == null) {
					this.anIntArray68 = new int[10];
					this.anIntArray69 = new int[10];
				}
				this.anIntArray69[arg1 - 100] = arg0.method1270();
				this.anIntArray68[arg1 - 100] = arg0.method1270();
			} else if (arg1 == 110) {
				this.anInt1219 = arg0.method1270();
			} else if (arg1 == 111) {
				this.anInt1221 = arg0.method1270();
			} else if (arg1 == 112) {
				this.anInt1241 = arg0.method1270();
			} else if (arg1 == 113) {
				this.anInt1248 = arg0.method1248();
			} else if (arg1 == 114) {
				this.anInt1240 = arg0.method1248() * 5;
			} else if (arg1 == 115) {
				this.anInt1265 = arg0.method1278();
			} else if (arg1 == 121) {
				this.anInt1222 = arg0.method1270();
			} else if (arg1 == 122) {
				this.anInt1262 = arg0.method1270();
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!ce;I)V")
	public void method914(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1278();
			if (local13 == 0) {
				return;
			}
			this.method912(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLclient!ff;Lclient!ff;)V")
	public void method916(@OriginalArg(1) Class3_Sub3_Sub11 arg0, @OriginalArg(2) Class3_Sub3_Sub11 arg1) {
		this.aShortArray15 = arg1.aShortArray15;
		this.aClass70_579 = arg0.aClass70_579;
		this.aBoolean72 = arg0.aBoolean72;
		this.anInt1260 = arg0.anInt1260;
		this.anInt1239 = arg1.anInt1239;
		this.anInt1254 = arg1.anInt1254;
		this.anInt1266 = arg1.anInt1266;
		this.anInt1233 = arg1.anInt1233;
		this.anInt1251 = arg1.anInt1251;
		this.aShortArray14 = arg1.aShortArray14;
		this.aShortArray17 = arg1.aShortArray17;
		this.anInt1255 = arg1.anInt1255;
		this.anInt1232 = 1;
		this.anInt1218 = arg1.anInt1218;
		this.aShortArray16 = arg1.aShortArray16;
	}
}
