import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class36_Sub4 extends Class36 {

	@OriginalMember(owner = "client!nc", name = "Q", descriptor = "Lclient!rb;")
	private Class105_Sub1 aClass105_Sub1_2;

	@OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
	private int anInt3381 = 0;

	@OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
	private int anInt3387 = 0;

	@OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
	private int anInt3399 = 0;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	private int anInt3376 = -32768;

	@OriginalMember(owner = "client!nc", name = "V", descriptor = "I")
	private int anInt3401 = -1;

	@OriginalMember(owner = "client!nc", name = "M", descriptor = "Z")
	private boolean aBoolean282 = false;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "Lclient!wk;")
	private Class43_Sub2 aClass43_Sub2_4 = null;

	@OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
	private int anInt3397 = -1;

	@OriginalMember(owner = "client!nc", name = "db", descriptor = "Z")
	private boolean aBoolean283 = true;

	@OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
	private int anInt3388;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	private int anInt3375;

	@OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
	private int anInt3396;

	@OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
	private int anInt3395;

	@OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
	private int anInt3382;

	@OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
	private int anInt3389;

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
	private int anInt3378;

	@OriginalMember(owner = "client!nc", name = "X", descriptor = "I")
	private int anInt3403;

	@OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
	private int anInt3379;

	@OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
	private int anInt3394;

	@OriginalMember(owner = "client!nc", name = "U", descriptor = "Lclient!hn;")
	private Class76 aClass76_1;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(IIIIIIIZLclient!eh;)V")
	public Class36_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class36 arg8) {
		this.anInt3388 = arg1;
		this.anInt3375 = arg2;
		this.anInt3396 = arg3;
		this.anInt3395 = arg0;
		this.anInt3382 = arg5;
		this.anInt3389 = arg4;
		if (arg8 != null) {
			this.aBoolean282 = true;
			if (arg8 instanceof Class36_Sub4) {
				@Pc(94) Class36_Sub4 local94 = (Class36_Sub4) arg8;
				if (Static116.aBoolean188) {
					local94.method2667();
				}
				this.anInt3378 = local94.anInt3378;
				this.anInt3403 = local94.anInt3403;
				this.anInt3379 = local94.anInt3379;
				this.anInt3394 = local94.anInt3394;
				this.aClass76_1 = local94.aClass76_1;
			} else if (Static116.aBoolean188) {
				@Pc(62) Class70 local62 = Static235.method3578(this.anInt3395);
				if (local62.anIntArray145 != null) {
					local62 = local62.method1575();
				}
				if (local62 != null) {
					Static147.method2394(0, this.anInt3396, 0, this.anInt3389, local62, this.anInt3382, this.anInt3388, this.anInt3375);
				}
			}
		}
		if (this.aBoolean282) {
			this.method2664(arg6);
		}
		if (Static116.aBoolean188 && arg8 != null) {
			this.method2659(true);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)Lclient!eh;")
	public Class36 method2658() {
		return this.method2659(false);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZB)Lclient!eh;")
	private Class36 method2659(@OriginalArg(0) boolean arg0) {
		@Pc(8) boolean local8 = Static195.anIntArrayArrayArray7 != Static87.anIntArrayArrayArray5;
		@Pc(13) Class70 local13 = Static235.method3578(this.anInt3395);
		if (local13.anIntArray145 != null) {
			local13 = local13.method1575();
		}
		if (local13 == null) {
			if (Static116.aBoolean188 && !local8) {
				this.method2667();
			}
			this.anInt3401 = -1;
			this.anInt3397 = this.anInt3379;
			return null;
		}
		if (!this.aBoolean282 && this.anInt3401 != local13.anInt2087) {
			this.method2664(-1);
		}
		@Pc(70) int local70 = this.anInt3375 & 0x3;
		@Pc(82) int local82;
		@Pc(79) int local79;
		if (local70 == 1 || local70 == 3) {
			local79 = local13.anInt2065;
			local82 = local13.anInt2063;
		} else {
			local79 = local13.anInt2063;
			local82 = local13.anInt2065;
		}
		@Pc(100) int local100 = this.anInt3389 + (local82 + 1 >> 1);
		@Pc(107) int local107 = (local82 >> 1) + this.anInt3389;
		@Pc(116) int local116 = this.anInt3382 + (local79 + 1 >> 1);
		@Pc(123) int local123 = (local79 >> 1) + this.anInt3382;
		this.method2661(local107 * 128, local123 * 128);
		@Pc(174) boolean local174 = !local8 && local13.aBoolean154 && (local13.anInt2087 != this.anInt3401 || (this.anInt3397 != this.anInt3379 || this.aClass76_1 != null && (this.aClass76_1.aBoolean173 || Static48.aBoolean74) && this.anInt3394 != this.anInt3379) && Static270.anInt5337 >= 2);
		if (arg0 && !local174) {
			this.anInt3397 = this.anInt3379;
			this.anInt3401 = local13.anInt2087;
			return null;
		}
		@Pc(193) int[][] local193 = Static195.anIntArrayArrayArray7[this.anInt3396];
		@Pc(202) int local202 = (local82 << 6) + (this.anInt3389 << 7);
		@Pc(229) int local229 = local193[local107][local116] + local193[local107][local123] + local193[local100][local123] + local193[local100][local116] >> 2;
		@Pc(238) int local238 = (local79 << 6) + (this.anInt3382 << 7);
		@Pc(241) int[][] local241 = null;
		if (local8) {
			local241 = Static87.anIntArrayArrayArray5[0];
		} else if (this.anInt3396 < 3) {
			local241 = Static195.anIntArrayArrayArray7[this.anInt3396 + 1];
		}
		if (Static116.aBoolean188 && local174) {
			Static6.method46(this.aClass43_Sub2_4, this.anInt3381, this.anInt3399, this.anInt3387);
		}
		@Pc(282) boolean local282 = this.aClass43_Sub2_4 == null;
		@Pc(314) Class77 local314;
		if (this.aClass76_1 == null) {
			local314 = local13.method1584(false, local282 ? Static31.aClass43_Sub2_2 : this.aClass43_Sub2_4, local229, this.anInt3388, this.anInt3375, local241, local238, local174, local202, local193);
		} else {
			local314 = local13.method1589(local282 ? Static31.aClass43_Sub2_2 : this.aClass43_Sub2_4, this.anInt3378, this.anInt3394, local193, local241, this.anInt3375, local229, local174, local202, local238, this.anInt3388, this.anInt3379, this.aClass76_1);
		}
		if (local314 == null) {
			this.anInt3401 = local13.anInt2087;
			this.anInt3397 = this.anInt3379;
			return null;
		}
		if (Static116.aBoolean188 && local174) {
			if (local282) {
				Static31.aClass43_Sub2_2 = local314.aClass43_Sub2_3;
			}
			@Pc(363) int local363 = 0;
			if (this.anInt3396 != 0) {
				@Pc(372) int[][] local372 = Static195.anIntArrayArrayArray7[0];
				local363 = local229 - (local372[local100][local116] + local372[local100][local123] + local372[local107][local123] + local372[local107][local116] >> 2);
			}
			@Pc(403) Class43_Sub2 local403 = local314.aClass43_Sub2_3;
			if (this.aBoolean283 && Static6.method53(local403, local202, local363, local238)) {
				this.aBoolean283 = false;
			}
			if (!this.aBoolean283) {
				Static6.method57(local403, local202, local363, local238);
				this.anInt3381 = local202;
				this.anInt3399 = local363;
				this.anInt3387 = local238;
				if (local282) {
					Static31.aClass43_Sub2_2 = null;
				}
				this.aClass43_Sub2_4 = local403;
			}
		}
		this.anInt3401 = local13.anInt2087;
		this.anInt3397 = this.anInt3379;
		return local314.aClass36_1;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIZ)V")
	private void method2661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label85: while (true) {
			if (this.aClass76_1 == null) {
				if (this.aBoolean282) {
					return;
				}
				this.method2664(-1);
				if (this.aClass76_1 == null) {
					return;
				}
			}
			@Pc(29) int local29 = Static183.anInt3590 - this.anInt3403;
			if (local29 > 100 && this.aClass76_1.anInt2214 > 0) {
				@Pc(49) int local49 = this.aClass76_1.anIntArray159.length - this.aClass76_1.anInt2214;
				while (local49 > this.anInt3379 && this.aClass76_1.anIntArray158[this.anInt3379] < local29) {
					local29 -= this.aClass76_1.anIntArray158[this.anInt3379];
					this.anInt3379++;
				}
				if (local49 <= this.anInt3379) {
					@Pc(93) int local93 = 0;
					for (@Pc(95) int local95 = local49; local95 < this.aClass76_1.anIntArray159.length; local95++) {
						local93 += this.aClass76_1.anIntArray158[local95];
					}
					local29 %= local93;
				}
				this.anInt3394 = this.anInt3379 + 1;
				if (this.anInt3394 >= this.aClass76_1.anIntArray159.length) {
					this.anInt3394 -= this.aClass76_1.anInt2214;
					if (this.anInt3394 < 0 || this.aClass76_1.anIntArray159.length <= this.anInt3394) {
						this.anInt3394 = -1;
					}
				}
			}
			while (this.aClass76_1.anIntArray158[this.anInt3379] < local29) {
				Static184.method2846(false, this.anInt3379, arg0, this.aClass76_1, arg1);
				local29 -= this.aClass76_1.anIntArray158[this.anInt3379];
				this.anInt3379++;
				if (this.aClass76_1.anIntArray159.length <= this.anInt3379) {
					this.anInt3379 -= this.aClass76_1.anInt2214;
					if (this.anInt3379 < 0 || this.aClass76_1.anIntArray159.length <= this.anInt3379) {
						this.aClass76_1 = null;
						continue label85;
					}
				}
				this.anInt3394 = this.anInt3379 + 1;
				if (this.anInt3394 >= this.aClass76_1.anIntArray159.length) {
					this.anInt3394 -= this.aClass76_1.anInt2214;
					if (this.anInt3394 < 0 || this.anInt3394 >= this.aClass76_1.anIntArray159.length) {
						this.anInt3394 = -1;
					}
				}
			}
			this.anInt3378 = local29;
			this.anInt3403 = Static183.anInt3590 - local29;
			return;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V")
	private void method2664(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(22) Class70 local22 = Static235.method3578(this.anInt3395);
			@Pc(24) Class70 local24 = local22;
			if (local22.anIntArray145 != null) {
				local22 = local22.method1575();
			}
			if (local22 == null) {
				return;
			}
			if (local22 == local24) {
				local24 = null;
			}
			if (local22.anIntArray148 != null) {
				if (this.aClass76_1 != null && local22.method1573(this.aClass76_1.anInt2219)) {
					return;
				}
				local7 = local22.method1571();
				if (local22.anInt2087 != this.anInt3401) {
					local9 = local22.aBoolean149;
				}
			} else if (local22.anInt2091 == -1) {
				if (local24 != null && local24.anIntArray148 != null) {
					if (this.aClass76_1 != null && local24.method1573(this.aClass76_1.anInt2219)) {
						return;
					}
					local7 = local24.method1571();
					if (this.anInt3401 != local24.anInt2087) {
						local9 = local24.aBoolean149;
					}
				} else if (local24 != null && local24.anInt2091 != -1 && this.anInt3401 != local24.anInt2087) {
					local9 = local24.aBoolean149;
					local7 = local24.anInt2091;
				}
			} else if (this.anInt3401 != local22.anInt2087) {
				local9 = local22.aBoolean149;
				local7 = local22.anInt2091;
			}
		}
		if (local7 == -1) {
			this.aClass76_1 = null;
			return;
		}
		if (this.aClass76_1 == null || local7 != this.aClass76_1.anInt2219) {
			this.aClass76_1 = Static115.method1855(local7);
		} else if (this.aClass76_1.anInt2220 == 0) {
			return;
		}
		if (local9) {
			this.anInt3379 = (int) ((double) this.aClass76_1.anIntArray159.length * Math.random());
			this.anInt3378 = (int) (Math.random() * (double) this.aClass76_1.anIntArray158[this.anInt3379]) + 1;
		} else {
			this.anInt3379 = 0;
			this.anInt3378 = 1;
		}
		this.anInt3394 = this.anInt3379 + 1;
		if (this.anInt3394 < 0 || this.anInt3394 >= this.aClass76_1.anIntArray159.length) {
			this.anInt3394 = -1;
		}
		this.anInt3403 = Static183.anInt3590 - this.anInt3378;
	}

	@OriginalMember(owner = "client!nc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "()I")
	@Override
	public int method4175() {
		return this.anInt3376;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static116.aBoolean188) {
			this.method2659(true);
		} else {
			this.method2661(arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIIJILclient!rb;)V")
	@Override
	public void method4173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class105_Sub1 arg10) {
		@Pc(7) Class36 local7 = this.method2658();
		if (local7 != null) {
			local7.method4173(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass105_Sub1_2);
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)V")
	public void method2667() {
		if (this.aClass43_Sub2_4 != null) {
			Static6.method46(this.aClass43_Sub2_4, this.anInt3381, this.anInt3399, this.anInt3387);
			this.aClass43_Sub2_4 = null;
		}
	}
}
