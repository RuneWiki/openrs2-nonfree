import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class22_Sub5 extends Class22 {

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "Lclient!ko;")
	private Class45_Sub2 aClass45_Sub2_3;

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
	private int anInt2239 = -1;

	@OriginalMember(owner = "client!ih", name = "z", descriptor = "I")
	private int anInt2251 = -1;

	@OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
	private int anInt2248 = -32768;

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "I")
	private int anInt2247 = 0;

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "Z")
	private boolean aBoolean169 = false;

	@OriginalMember(owner = "client!ih", name = "N", descriptor = "I")
	private int anInt2263 = 0;

	@OriginalMember(owner = "client!ih", name = "D", descriptor = "I")
	private int anInt2255 = 0;

	@OriginalMember(owner = "client!ih", name = "R", descriptor = "Z")
	private boolean aBoolean171 = false;

	@OriginalMember(owner = "client!ih", name = "P", descriptor = "Z")
	private boolean aBoolean170 = true;

	@OriginalMember(owner = "client!ih", name = "X", descriptor = "Lclient!wi;")
	private Class103_Sub2 aClass103_Sub2_2 = null;

	@OriginalMember(owner = "client!ih", name = "H", descriptor = "I")
	private int anInt2259;

	@OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
	private int anInt2260;

	@OriginalMember(owner = "client!ih", name = "K", descriptor = "I")
	private int anInt2261;

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
	private int anInt2241;

	@OriginalMember(owner = "client!ih", name = "y", descriptor = "I")
	private int anInt2250;

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
	private int anInt2244;

	@OriginalMember(owner = "client!ih", name = "F", descriptor = "I")
	private int anInt2257;

	@OriginalMember(owner = "client!ih", name = "B", descriptor = "I")
	private int anInt2253;

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
	private int anInt2240;

	@OriginalMember(owner = "client!ih", name = "U", descriptor = "Lclient!tc;")
	private Class167 aClass167_2;

	@OriginalMember(owner = "client!ih", name = "M", descriptor = "I")
	private int anInt2262;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(IIIIIIIZLclient!h;)V")
	public Class22_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class22 arg8) {
		this.anInt2259 = arg0;
		this.anInt2260 = arg4;
		this.anInt2261 = arg2;
		this.anInt2241 = arg1;
		this.anInt2250 = arg3;
		this.anInt2244 = arg5;
		if (arg8 != null) {
			this.aBoolean169 = true;
			if (arg8 instanceof Class22_Sub5) {
				@Pc(99) Class22_Sub5 local99 = (Class22_Sub5) arg8;
				if (Static291.aBoolean404) {
					local99.method1833();
				}
				this.anInt2257 = local99.anInt2257;
				this.anInt2253 = local99.anInt2253;
				this.anInt2240 = local99.anInt2240;
				this.aClass167_2 = local99.aClass167_2;
				this.anInt2262 = local99.anInt2262;
			} else if (Static291.aBoolean404) {
				@Pc(67) Class43 local67 = Static189.method3080(this.anInt2259);
				if (local67.anIntArray97 != null) {
					local67 = local67.method1009();
				}
				if (local67 != null) {
					Static6.method98(this.anInt2250, local67, this.anInt2261, this.anInt2244, this.anInt2260, 0, 0, this.anInt2241);
				}
			}
		}
		if (this.aBoolean169) {
			this.method1828(arg6);
		}
		if (Static291.aBoolean404 && arg8 != null) {
			this.method1823(true);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)Lclient!h;")
	private Class22 method1823(@OriginalArg(1) boolean arg0) {
		@Pc(12) boolean local12 = Static89.anIntArrayArrayArray6 != Static208.anIntArrayArrayArray11;
		@Pc(17) Class43 local17 = Static189.method3080(this.anInt2259);
		if (local17.anIntArray97 != null) {
			local17 = local17.method1009();
		}
		if (local17 == null) {
			if (Static291.aBoolean404 && !local12) {
				this.method1833();
			}
			this.anInt2251 = -1;
			this.anInt2239 = this.anInt2257;
			return null;
		}
		if (!this.aBoolean169 && this.anInt2251 != local17.anInt1198) {
			this.method1828(-1);
		}
		@Pc(67) int local67 = this.anInt2261 & 0x3;
		@Pc(79) int local79;
		@Pc(76) int local76;
		if (local67 == 1 || local67 == 3) {
			local76 = local17.anInt1185;
			local79 = local17.anInt1153;
		} else {
			local76 = local17.anInt1153;
			local79 = local17.anInt1185;
		}
		@Pc(97) int local97 = this.anInt2260 + (local79 + 1 >> 1);
		@Pc(104) int local104 = (local76 >> 1) + this.anInt2244;
		@Pc(111) int local111 = this.anInt2260 + (local79 >> 1);
		@Pc(121) int local121 = this.anInt2244 + (local76 + 1 >> 1);
		this.method1830(local104 * 128, local111 * 128);
		@Pc(179) boolean local179 = !local12 && local17.aBoolean88 && (local17.anInt1198 != this.anInt2251 || (this.anInt2239 != this.anInt2257 || this.aClass167_2 != null && (this.aClass167_2.aBoolean368 || Static110.aBoolean163) && this.anInt2253 != this.anInt2257) && Static143.anInt2823 >= 2);
		if (arg0 && !local179) {
			this.anInt2239 = this.anInt2257;
			this.anInt2251 = local17.anInt1198;
			return null;
		}
		@Pc(198) int[][] local198 = Static208.anIntArrayArrayArray11[this.anInt2250];
		@Pc(226) int local226 = local198[local97][local104] + local198[local111][local104] + local198[local111][local121] + local198[local97][local121] >> 2;
		@Pc(235) int local235 = (local76 << 6) + (this.anInt2244 << 7);
		@Pc(244) int local244 = (this.anInt2260 << 7) + (local79 << 6);
		@Pc(247) int[][] local247 = null;
		if (local12) {
			local247 = Static89.anIntArrayArrayArray6[0];
		} else if (this.anInt2250 < 3) {
			local247 = Static208.anIntArrayArrayArray11[this.anInt2250 + 1];
		}
		if (Static291.aBoolean404 && local179) {
			Static174.method2901(this.aClass103_Sub2_2, this.anInt2255, this.anInt2263, this.anInt2247);
		}
		@Pc(287) boolean local287 = this.aClass103_Sub2_2 == null;
		@Pc(319) Class111 local319;
		if (this.aClass167_2 == null) {
			local319 = local17.method1019(local247, local235, local244, this.anInt2261, local179, false, local287 ? Static72.aClass103_Sub2_1 : this.aClass103_Sub2_2, local198, local226, this.anInt2241);
		} else {
			local319 = local17.method1013(this.anInt2257, this.aClass167_2, local179, this.anInt2253, this.anInt2261, local244, local226, local247, local287 ? Static72.aClass103_Sub2_1 : this.aClass103_Sub2_2, local198, local235, this.anInt2241, this.anInt2262);
		}
		if (local319 == null) {
			this.anInt2251 = local17.anInt1198;
			this.anInt2239 = this.anInt2257;
			return null;
		}
		if (Static291.aBoolean404 && local179) {
			if (local287) {
				Static72.aClass103_Sub2_1 = local319.aClass103_Sub2_3;
			}
			@Pc(367) int local367 = 0;
			if (this.anInt2250 != 0) {
				@Pc(375) int[][] local375 = Static208.anIntArrayArrayArray11[0];
				local367 = local226 - (local375[local111][local121] + local375[local97][local104] + local375[local111][local104] + local375[local97][local121] >> 2);
			}
			@Pc(407) Class103_Sub2 local407 = local319.aClass103_Sub2_3;
			if (this.aBoolean170 && Static174.method2902(local407, local244, local367, local235)) {
				this.aBoolean170 = false;
			}
			if (!this.aBoolean170) {
				Static174.method2903(local407, local244, local367, local235);
				this.anInt2255 = local244;
				if (local287) {
					Static72.aClass103_Sub2_1 = null;
				}
				this.aClass103_Sub2_2 = local407;
				this.anInt2263 = local367;
				this.anInt2247 = local235;
			}
		}
		this.anInt2251 = local17.anInt1198;
		this.anInt2239 = this.anInt2257;
		return local319.aClass22_6;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "()I")
	@Override
	public int method4071() {
		return this.anInt2248;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) Class22 local5 = null;
		if (Static291.aBoolean404) {
			local5 = this.method1823(true);
		} else {
			this.method1830(arg4, arg3);
		}
		if (!this.aBoolean171) {
			if (local5 == null) {
				local5 = this.method1831();
			}
			if (local5 == null) {
				return;
			}
			this.method1826(local5);
		}
		if (this.aClass45_Sub2_3 != null) {
			this.aClass45_Sub2_3.method2396(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!h;)V")
	private void method1826(@OriginalArg(1) Class22 arg0) {
		@Pc(31) Class43 local31;
		if (Static291.aBoolean404) {
			@Pc(77) Class22_Sub4_Sub1 local77 = (Class22_Sub4_Sub1) arg0;
			if ((this.aClass45_Sub2_3 == null || this.aClass45_Sub2_3.aBoolean216) && (local77.aClass49Array1 != null || local77.aClass15Array1 != null)) {
				local31 = Static189.method3080(this.anInt2259);
				if (local31.anIntArray97 != null) {
					local31 = local31.method1009();
				}
				if (local31 != null) {
					this.aClass45_Sub2_3 = new Class45_Sub2(Static37.anInt757, local31.anInt1185, local31.anInt1153);
				}
			}
			if (this.aClass45_Sub2_3 != null) {
				this.aClass45_Sub2_3.method2405(local77.aClass49Array1, local77.aClass15Array1, false, local77.anIntArray174, local77.anIntArray175, local77.anIntArray170);
			}
		} else {
			@Pc(10) Class22_Sub4_Sub2 local10 = (Class22_Sub4_Sub2) arg0;
			if ((this.aClass45_Sub2_3 == null || this.aClass45_Sub2_3.aBoolean216) && (local10.aClass49Array2 != null || local10.aClass15Array2 != null)) {
				local31 = Static189.method3080(this.anInt2259);
				if (local31.anIntArray97 != null) {
					local31 = local31.method1009();
				}
				if (local31 != null) {
					this.aClass45_Sub2_3 = new Class45_Sub2(Static37.anInt757, local31.anInt1185, local31.anInt1153);
				}
			}
			if (this.aClass45_Sub2_3 != null) {
				this.aClass45_Sub2_3.method2405(local10.aClass49Array2, local10.aClass15Array2, false, local10.anIntArray385, local10.anIntArray382, local10.anIntArray379);
			}
		}
		this.aBoolean171 = true;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIIIIJILclient!ko;)V")
	@Override
	public void method4073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class45_Sub2 arg10) {
		@Pc(7) Class22 local7 = this.method1831();
		if (local7 != null) {
			this.method1826(local7);
			local7.method4073(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass45_Sub2_3);
		}
	}

	@OriginalMember(owner = "client!ih", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass45_Sub2_3 != null) {
			this.aClass45_Sub2_3.method2416();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V")
	private void method1828(@OriginalArg(1) int arg0) {
		@Pc(3) boolean local3 = false;
		@Pc(9) int local9 = arg0;
		if (arg0 == -1) {
			@Pc(18) Class43 local18 = Static189.method3080(this.anInt2259);
			@Pc(20) Class43 local20 = local18;
			if (local18.anIntArray97 != null) {
				local18 = local18.method1009();
			}
			if (local18 == null) {
				return;
			}
			if (local18 == local20) {
				local20 = null;
			}
			if (local18.anIntArray101 != null) {
				if (this.aClass167_2 != null && local18.method1016(this.aClass167_2.anInt5119)) {
					return;
				}
				local9 = local18.method1011();
				if (local18.anInt1198 != this.anInt2251) {
					local3 = local18.aBoolean97;
				}
			} else if (local18.anInt1169 == -1) {
				if (local20 != null && local20.anIntArray101 != null) {
					if (this.aClass167_2 != null && local20.method1016(this.aClass167_2.anInt5119)) {
						return;
					}
					local9 = local20.method1011();
					if (local20.anInt1198 != this.anInt2251) {
						local3 = local20.aBoolean97;
					}
				} else if (local20 != null && local20.anInt1169 != -1 && this.anInt2251 != local20.anInt1198) {
					local9 = local20.anInt1169;
					local3 = local20.aBoolean97;
				}
			} else if (local18.anInt1198 != this.anInt2251) {
				local3 = local18.aBoolean97;
				local9 = local18.anInt1169;
			}
		}
		if (local9 == -1) {
			this.aClass167_2 = null;
			return;
		}
		if (this.aClass167_2 == null || local9 != this.aClass167_2.anInt5119) {
			this.aClass167_2 = Static313.method4648(local9);
		} else if (this.aClass167_2.anInt5131 == 0) {
			return;
		}
		if (local3) {
			this.anInt2257 = (int) (Math.random() * (double) this.aClass167_2.anIntArray461.length);
			this.anInt2262 = (int) (Math.random() * (double) this.aClass167_2.anIntArray463[this.anInt2257]) + 1;
		} else {
			this.anInt2257 = 0;
			this.anInt2262 = 1;
		}
		this.anInt2253 = this.anInt2257 + 1;
		if (this.anInt2253 < 0 || this.aClass167_2.anIntArray461.length <= this.anInt2253) {
			this.anInt2253 = -1;
		}
		this.anInt2240 = Static37.anInt757 - this.anInt2262;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(III)V")
	private void method1830(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		label86: while (true) {
			if (this.aClass167_2 == null) {
				if (this.aBoolean169) {
					return;
				}
				this.method1828(-1);
				if (this.aClass167_2 == null) {
					return;
				}
			}
			@Pc(33) int local33 = Static37.anInt757 - this.anInt2240;
			if (local33 > 100 && this.aClass167_2.anInt5122 > 0) {
				@Pc(50) int local50 = this.aClass167_2.anIntArray461.length - this.aClass167_2.anInt5122;
				while (this.anInt2257 < local50 && this.aClass167_2.anIntArray463[this.anInt2257] < local33) {
					local33 -= this.aClass167_2.anIntArray463[this.anInt2257];
					this.anInt2257++;
				}
				if (this.anInt2257 >= local50) {
					@Pc(93) int local93 = 0;
					for (@Pc(95) int local95 = local50; local95 < this.aClass167_2.anIntArray461.length; local95++) {
						local93 += this.aClass167_2.anIntArray463[local95];
					}
					local33 %= local93;
				}
				this.anInt2253 = this.anInt2257 + 1;
				if (this.anInt2253 >= this.aClass167_2.anIntArray461.length) {
					this.anInt2253 -= this.aClass167_2.anInt5122;
					if (this.anInt2253 < 0 || this.anInt2253 >= this.aClass167_2.anIntArray461.length) {
						this.anInt2253 = -1;
					}
				}
			}
			while (local33 > this.aClass167_2.anIntArray463[this.anInt2257]) {
				Static212.method3338(arg1, false, this.anInt2257, this.aClass167_2, arg0);
				local33 -= this.aClass167_2.anIntArray463[this.anInt2257];
				this.anInt2257++;
				if (this.aClass167_2.anIntArray461.length <= this.anInt2257) {
					this.anInt2257 -= this.aClass167_2.anInt5122;
					if (this.anInt2257 < 0 || this.aClass167_2.anIntArray461.length <= this.anInt2257) {
						this.aClass167_2 = null;
						continue label86;
					}
				}
				this.anInt2253 = this.anInt2257 + 1;
				if (this.anInt2253 >= this.aClass167_2.anIntArray461.length) {
					this.anInt2253 -= this.aClass167_2.anInt5122;
					if (this.anInt2253 < 0 || this.anInt2253 >= this.aClass167_2.anIntArray461.length) {
						this.anInt2253 = -1;
					}
				}
			}
			this.anInt2240 = Static37.anInt757 - local33;
			this.anInt2262 = local33;
			return;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)Lclient!h;")
	public Class22 method1831() {
		return this.method1823(false);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)V")
	public void method1833() {
		if (this.aClass103_Sub2_2 != null) {
			Static174.method2901(this.aClass103_Sub2_2, this.anInt2255, this.anInt2263, this.anInt2247);
			this.aClass103_Sub2_2 = null;
		}
	}
}
