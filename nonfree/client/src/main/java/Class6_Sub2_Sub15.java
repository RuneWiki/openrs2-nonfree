import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class6_Sub2_Sub15 extends Class6_Sub2 {

	@OriginalMember(owner = "client!ua", name = "eb", descriptor = "[I")
	public int[] anIntArray278;

	@OriginalMember(owner = "client!ua", name = "ib", descriptor = "[I")
	private int[] anIntArray279;

	@OriginalMember(owner = "client!ua", name = "wb", descriptor = "[I")
	private int[] anIntArray280;

	@OriginalMember(owner = "client!ua", name = "Jb", descriptor = "[I")
	private int[] anIntArray281;

	@OriginalMember(owner = "client!ua", name = "Nb", descriptor = "[I")
	private int[] anIntArray282;

	@OriginalMember(owner = "client!ua", name = "ic", descriptor = "I")
	public int anInt3013;

	@OriginalMember(owner = "client!ua", name = "oc", descriptor = "[I")
	public int[] anIntArray285;

	@OriginalMember(owner = "client!ua", name = "nb", descriptor = "I")
	public int anInt2988 = 0;

	@OriginalMember(owner = "client!ua", name = "jb", descriptor = "I")
	private int anInt2985 = 0;

	@OriginalMember(owner = "client!ua", name = "ab", descriptor = "I")
	private int anInt2980 = 128;

	@OriginalMember(owner = "client!ua", name = "rb", descriptor = "I")
	public int anInt2991 = 16;

	@OriginalMember(owner = "client!ua", name = "xb", descriptor = "Lclient!rc;")
	public Class55 aClass55_1253 = Static106.aClass55_964;

	@OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
	private int anInt2979 = -1;

	@OriginalMember(owner = "client!ua", name = "qb", descriptor = "I")
	private int anInt2990 = 128;

	@OriginalMember(owner = "client!ua", name = "Ab", descriptor = "Z")
	public boolean aBoolean150 = true;

	@OriginalMember(owner = "client!ua", name = "Cb", descriptor = "I")
	private int anInt2996 = 128;

	@OriginalMember(owner = "client!ua", name = "Fb", descriptor = "I")
	public int anInt2998 = 0;

	@OriginalMember(owner = "client!ua", name = "hb", descriptor = "I")
	public int anInt2984 = 1;

	@OriginalMember(owner = "client!ua", name = "kb", descriptor = "Z")
	public boolean aBoolean148 = false;

	@OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
	public int anInt2981 = 1;

	@OriginalMember(owner = "client!ua", name = "Kb", descriptor = "I")
	private int anInt3001 = 0;

	@OriginalMember(owner = "client!ua", name = "gb", descriptor = "I")
	public int anInt2983 = -1;

	@OriginalMember(owner = "client!ua", name = "mb", descriptor = "I")
	private int anInt2987 = 0;

	@OriginalMember(owner = "client!ua", name = "Pb", descriptor = "[Lclient!rc;")
	public final Class55[] aClass55Array25 = new Class55[5];

	@OriginalMember(owner = "client!ua", name = "Rb", descriptor = "I")
	public int anInt3004 = -1;

	@OriginalMember(owner = "client!ua", name = "Xb", descriptor = "I")
	private int anInt3009 = 0;

	@OriginalMember(owner = "client!ua", name = "pb", descriptor = "Z")
	public boolean aBoolean149 = false;

	@OriginalMember(owner = "client!ua", name = "fb", descriptor = "I")
	public int anInt2982 = -1;

	@OriginalMember(owner = "client!ua", name = "Vb", descriptor = "I")
	public int anInt3007 = -1;

	@OriginalMember(owner = "client!ua", name = "cc", descriptor = "I")
	public int anInt3011 = -1;

	@OriginalMember(owner = "client!ua", name = "fc", descriptor = "Z")
	public boolean aBoolean152 = false;

	@OriginalMember(owner = "client!ua", name = "db", descriptor = "Z")
	public boolean aBoolean147 = true;

	@OriginalMember(owner = "client!ua", name = "lc", descriptor = "I")
	private int anInt3015 = -1;

	@OriginalMember(owner = "client!ua", name = "ec", descriptor = "I")
	public int anInt3012 = -1;

	@OriginalMember(owner = "client!ua", name = "dc", descriptor = "Z")
	public boolean aBoolean151 = true;

	@OriginalMember(owner = "client!ua", name = "rc", descriptor = "I")
	private int anInt3019 = 0;

	@OriginalMember(owner = "client!ua", name = "nc", descriptor = "I")
	public int anInt3017 = 0;

	@OriginalMember(owner = "client!ua", name = "hc", descriptor = "Z")
	public boolean aBoolean153 = false;

	@OriginalMember(owner = "client!ua", name = "Tb", descriptor = "I")
	public int anInt3005 = 0;

	@OriginalMember(owner = "client!ua", name = "pc", descriptor = "Z")
	private boolean aBoolean154 = false;

	@OriginalMember(owner = "client!ua", name = "wc", descriptor = "Z")
	private boolean aBoolean155 = false;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V")
	public void method1933() {
		if (this.anInt3004 == -1) {
			this.anInt3004 = 0;
			if (this.anIntArray281 != null && (this.anIntArray282 == null || this.anIntArray282[0] == 10)) {
				this.anInt3004 = 1;
			}
			for (@Pc(28) int local28 = 0; local28 < 5; local28++) {
				if (this.aClass55Array25[local28] != null) {
					this.anInt3004 = 1;
				}
			}
		}
		if (this.anInt2982 == -1) {
			this.anInt2982 = this.aBoolean150 ? 1 : 0;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILclient!tb;IIIIII)Lclient!jb;")
	public Class6_Sub2_Sub3_Sub3 method1936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub13 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(17) long local17;
		if (this.anIntArray282 == null) {
			local17 = (this.anInt3013 << 10) + arg6;
		} else {
			local17 = arg6 + (arg5 << 3) + (this.anInt3013 << 10);
		}
		@Pc(37) Class6_Sub2_Sub3_Sub3 local37 = (Class6_Sub2_Sub3_Sub3) Static106.aClass36_28.method1154(local17);
		if (local37 == null) {
			local37 = this.method1944(true, true, arg5, arg6);
			if (local37 == null) {
				return null;
			}
			Static106.aClass36_28.method1161(local17, local37);
		}
		if (arg2 == null && !this.aBoolean152) {
			return local37;
		}
		if (arg2 == null) {
			local37 = local37.method966(true);
		} else {
			local37 = arg2.method1863(arg6, local37, arg0);
		}
		if (this.aBoolean152) {
			@Pc(105) int local105 = (arg1 + arg4 + arg3 + arg7) / 4;
			for (@Pc(107) int local107 = 0; local107 < local37.anInt1446; local107++) {
				@Pc(114) int local114 = local37.anIntArray114[local107];
				@Pc(127) int local127 = (arg7 - arg1) * (local114 + 64) / 128 + arg1;
				@Pc(132) int local132 = local37.anIntArray110[local107];
				@Pc(145) int local145 = (local114 + 64) * (-arg4 + arg3) / 128 + arg4;
				@Pc(159) int local159 = local145 + (local132 + 64) * (local127 + -local145) / 128;
				local37.anIntArray112[local107] += local159 - local105;
			}
		}
		return local37;
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)Lclient!ua;")
	public Class6_Sub2_Sub15 method1937() {
		@Pc(5) int local5 = -1;
		if (this.anInt3015 != -1) {
			local5 = Static79.method1560(this.anInt3015);
		} else if (this.anInt2979 != -1) {
			local5 = Static11.anIntArray44[this.anInt2979];
		}
		return local5 < 0 || local5 >= this.anIntArray278.length || this.anIntArray278[local5] == -1 ? null : Static8.method333(this.anIntArray278[local5]);
	}

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(B)Z")
	public boolean method1940() {
		if (this.anIntArray281 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray281.length; local14++) {
			local12 &= Static97.aClass40_35.method1223(this.anIntArray281[local14] & 0xFFFF, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)Z")
	public boolean method1941(@OriginalArg(0) int arg0) {
		if (this.anIntArray282 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray282.length; local18++) {
				if (this.anIntArray282[local18] == arg0) {
					return Static97.aClass40_35.method1223(this.anIntArray281[local18] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray281 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(63) boolean local63 = true;
			for (@Pc(65) int local65 = 0; local65 < this.anIntArray281.length; local65++) {
				local63 &= Static97.aClass40_35.method1223(this.anIntArray281[local65] & 0xFFFF, 0);
			}
			return local63;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIBI)Lclient!jb;")
	public Class6_Sub2_Sub3_Sub3 method1942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(20) long local20;
		if (this.anIntArray282 == null) {
			local20 = (this.anInt3013 << 10) + arg4;
		} else {
			local20 = arg4 + (arg5 << 3) + (this.anInt3013 << 10);
		}
		@Pc(36) Class6_Sub2_Sub3_Sub3 local36 = (Class6_Sub2_Sub3_Sub3) Static96.aClass36_32.method1154(local20);
		if (local36 == null) {
			local36 = this.method1944(!this.aBoolean154, false, arg5, arg4);
			if (local36 == null) {
				return null;
			}
			Static96.aClass36_32.method1161(local20, local36);
		}
		if (this.aBoolean152 || this.aBoolean154) {
			local36 = new Class6_Sub2_Sub3_Sub3(local36, this.aBoolean152, this.aBoolean154);
		}
		if (this.aBoolean152) {
			@Pc(97) int local97 = (arg1 + arg3 + arg2 + arg0) / 4;
			for (@Pc(99) int local99 = 0; local99 < local36.anInt1446; local99++) {
				@Pc(106) int local106 = local36.anIntArray110[local99];
				@Pc(111) int local111 = local36.anIntArray114[local99];
				@Pc(124) int local124 = (local111 + 64) * (arg2 - arg3) / 128 + arg3;
				@Pc(137) int local137 = arg1 + (arg0 - arg1) * (local111 + 64) / 128;
				@Pc(150) int local150 = local124 + (local106 + 64) * (local137 - local124) / 128;
				local36.anIntArray112[local99] += local150 - local97;
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!b;B)V")
	public void method1943(@OriginalArg(0) Class6_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1495();
			if (local5 == 0) {
				return;
			}
			this.method1945(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZBZII)Lclient!jb;")
	private Class6_Sub2_Sub3_Sub3 method1944(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class6_Sub2_Sub3_Sub3 local7 = null;
		@Pc(14) int local14;
		@Pc(43) int local43;
		@Pc(112) boolean local112;
		@Pc(124) int local124;
		if (this.anIntArray282 == null) {
			if (arg2 != 10) {
				return null;
			}
			if (this.anIntArray281 == null) {
				return null;
			}
			local112 = this.aBoolean155 ^ arg3 > 3;
			local14 = this.anIntArray281.length;
			for (local43 = 0; local43 < local14; local43++) {
				local124 = this.anIntArray281[local43];
				if (local112) {
					local124 += 65536;
				}
				local7 = (Class6_Sub2_Sub3_Sub3) Static1.aClass36_1.method1154((long) local124);
				if (local7 == null) {
					local7 = Static42.method974(Static97.aClass40_35, local124 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local112) {
						local7.method964();
					}
					Static1.aClass36_1.method1161((long) local124, local7);
				}
				if (local14 > 1) {
					Static12.aClass6_Sub2_Sub3_Sub3Array1[local43] = local7;
				}
			}
			if (local14 > 1) {
				local7 = new Class6_Sub2_Sub3_Sub3(Static12.aClass6_Sub2_Sub3_Sub3Array1, local14);
			}
		} else {
			@Pc(12) int local12 = -1;
			for (local14 = 0; local14 < this.anIntArray282.length; local14++) {
				if (arg2 == this.anIntArray282[local14]) {
					local12 = local14;
					break;
				}
			}
			if (local12 == -1) {
				return null;
			}
			local43 = this.anIntArray281[local12];
			@Pc(53) boolean local53 = arg3 > 3 ^ this.aBoolean155;
			if (local53) {
				local43 += 65536;
			}
			local7 = (Class6_Sub2_Sub3_Sub3) Static1.aClass36_1.method1154((long) local43);
			if (local7 == null) {
				local7 = Static42.method974(Static97.aClass40_35, local43 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local53) {
					local7.method964();
				}
				Static1.aClass36_1.method1161((long) local43, local7);
			}
		}
		@Pc(195) boolean local195;
		if (this.anInt3019 == 0 && this.anInt3001 == 0 && this.anInt2987 == 0) {
			local195 = false;
		} else {
			local195 = true;
		}
		if (this.anInt2996 == 128 && this.anInt2990 == 128 && this.anInt2980 == 128) {
			local112 = false;
		} else {
			local112 = true;
		}
		@Pc(245) Class6_Sub2_Sub3_Sub3 local245 = new Class6_Sub2_Sub3_Sub3(local7, arg3 == 0 && !local112 && !local195, this.anIntArray280 == null, true);
		@Pc(249) int local249 = arg3 & 0x3;
		if (local249 == 1) {
			local245.method968();
		} else if (local249 == 2) {
			local245.method976();
		} else if (local249 == 3) {
			local245.method948();
		}
		if (this.anIntArray280 != null) {
			for (local124 = 0; local124 < this.anIntArray280.length; local124++) {
				local245.method961(this.anIntArray280[local124], this.anIntArray279[local124]);
			}
		}
		if (local112) {
			local245.method957(this.anInt2996, this.anInt2990, this.anInt2980);
		}
		if (local195) {
			local245.method971(this.anInt3019, this.anInt3001, this.anInt2987);
		}
		if (arg1) {
			local245.method978();
		}
		local245.method965(this.anInt2985 + 64, 768 - -(this.anInt3009 * 5), -50, -10, -50, arg0);
		return local245;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!b;II)V")
	private void method1945(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(30) int local30;
		@Pc(58) int local58;
		if (arg1 == 1) {
			local30 = arg0.method1495();
			if (local30 > 0) {
				if (this.anIntArray281 == null || Static92.aBoolean120) {
					this.anIntArray281 = new int[local30];
					this.anIntArray282 = new int[local30];
					for (local58 = 0; local58 < local30; local58++) {
						this.anIntArray281[local58] = arg0.method1500();
						this.anIntArray282[local58] = arg0.method1495();
					}
				} else {
					arg0.anInt2209 += local30 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass55_1253 = arg0.method1461();
		} else if (arg1 == 5) {
			local30 = arg0.method1495();
			if (local30 > 0) {
				if (this.anIntArray281 != null && !Static92.aBoolean120) {
					arg0.anInt2209 += local30 * 2;
					return;
				}
				this.anIntArray281 = new int[local30];
				this.anIntArray282 = null;
				for (local58 = 0; local58 < local30; local58++) {
					this.anIntArray281[local58] = arg0.method1500();
				}
				return;
			}
		} else if (arg1 == 14) {
			this.anInt2981 = arg0.method1495();
		} else if (arg1 == 15) {
			this.anInt2984 = arg0.method1495();
			return;
		} else if (arg1 == 17) {
			this.aBoolean150 = false;
			return;
		} else if (arg1 == 18) {
			this.aBoolean151 = false;
			return;
		} else if (arg1 == 19) {
			this.anInt3004 = arg0.method1495();
			return;
		} else if (arg1 == 21) {
			this.aBoolean152 = true;
			return;
		} else if (arg1 == 22) {
			this.aBoolean154 = true;
			return;
		} else if (arg1 == 23) {
			this.aBoolean148 = true;
			return;
		} else {
			if (arg1 == 24) {
				this.anInt3011 = arg0.method1500();
				if (this.anInt3011 == 65535) {
					this.anInt3011 = -1;
					return;
				}
			} else if (arg1 == 28) {
				this.anInt2991 = arg0.method1495();
				return;
			} else if (arg1 == 29) {
				this.anInt2985 = arg0.method1484();
				return;
			} else if (arg1 == 39) {
				this.anInt3009 = arg0.method1484() * 5;
				return;
			} else if (arg1 >= 30 && arg1 < 35) {
				this.aClass55Array25[arg1 - 30] = arg0.method1461();
				if (this.aClass55Array25[arg1 - 30].method1642(Static7.aClass55_124)) {
					this.aClass55Array25[arg1 - 30] = null;
					return;
				}
			} else if (arg1 == 40) {
				local30 = arg0.method1495();
				this.anIntArray279 = new int[local30];
				this.anIntArray280 = new int[local30];
				for (local58 = 0; local58 < local30; local58++) {
					this.anIntArray280[local58] = arg0.method1500();
					this.anIntArray279[local58] = arg0.method1500();
				}
			} else if (arg1 == 60) {
				this.anInt3012 = arg0.method1500();
				return;
			} else if (arg1 == 62) {
				this.aBoolean155 = true;
				return;
			} else if (arg1 == 64) {
				this.aBoolean147 = false;
				return;
			} else if (arg1 == 65) {
				this.anInt2996 = arg0.method1500();
				return;
			} else if (arg1 == 66) {
				this.anInt2990 = arg0.method1500();
				return;
			} else if (arg1 == 67) {
				this.anInt2980 = arg0.method1500();
				return;
			} else if (arg1 == 68) {
				this.anInt3007 = arg0.method1500();
				return;
			} else if (arg1 == 69) {
				this.anInt3017 = arg0.method1495();
				return;
			} else if (arg1 == 70) {
				this.anInt3019 = arg0.method1498();
				return;
			} else if (arg1 == 71) {
				this.anInt3001 = arg0.method1498();
				return;
			} else if (arg1 == 72) {
				this.anInt2987 = arg0.method1498();
				return;
			} else if (arg1 == 73) {
				this.aBoolean153 = true;
				return;
			} else if (arg1 == 74) {
				this.aBoolean149 = true;
				return;
			} else {
				if (arg1 == 75) {
					this.anInt2982 = arg0.method1495();
				} else if (arg1 == 77) {
					this.anInt3015 = arg0.method1500();
					if (this.anInt3015 == 65535) {
						this.anInt3015 = -1;
					}
					this.anInt2979 = arg0.method1500();
					if (this.anInt2979 == 65535) {
						this.anInt2979 = -1;
					}
					local30 = arg0.method1495();
					this.anIntArray278 = new int[local30 + 1];
					for (local58 = 0; local58 <= local30; local58++) {
						this.anIntArray278[local58] = arg0.method1500();
						if (this.anIntArray278[local58] == 65535) {
							this.anIntArray278[local58] = -1;
						}
					}
					return;
				} else if (arg1 == 78) {
					this.anInt2983 = arg0.method1500();
					this.anInt2998 = arg0.method1495();
					return;
				} else if (arg1 == 79) {
					this.anInt3005 = arg0.method1500();
					this.anInt2988 = arg0.method1500();
					this.anInt2998 = arg0.method1495();
					local30 = arg0.method1495();
					this.anIntArray285 = new int[local30];
					for (local58 = 0; local58 < local30; local58++) {
						this.anIntArray285[local58] = arg0.method1500();
					}
					return;
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "(I)Z")
	public boolean method1946() {
		if (this.anIntArray278 == null) {
			return this.anInt2983 != -1 || this.anIntArray285 != null;
		}
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray278.length; local22++) {
			if (this.anIntArray278[local22] != -1) {
				@Pc(38) Class6_Sub2_Sub15 local38 = Static8.method333(this.anIntArray278[local22]);
				if (local38.anInt2983 != -1 || local38.anIntArray285 != null) {
					return true;
				}
			}
		}
		return false;
	}
}
