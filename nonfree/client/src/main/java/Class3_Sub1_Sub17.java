import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class3_Sub1_Sub17 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ve", name = "W", descriptor = "I")
	public int anInt3412;

	@OriginalMember(owner = "client!ve", name = "eb", descriptor = "[I")
	private int[] anIntArray385;

	@OriginalMember(owner = "client!ve", name = "rb", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!ve", name = "xb", descriptor = "[I")
	public int[] anIntArray386;

	@OriginalMember(owner = "client!ve", name = "Qb", descriptor = "[I")
	public int[] anIntArray387;

	@OriginalMember(owner = "client!ve", name = "Xb", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!ve", name = "gc", descriptor = "[I")
	private int[] anIntArray388;

	@OriginalMember(owner = "client!ve", name = "U", descriptor = "I")
	private int anInt3411 = 128;

	@OriginalMember(owner = "client!ve", name = "jb", descriptor = "I")
	private int anInt3419 = -1;

	@OriginalMember(owner = "client!ve", name = "Z", descriptor = "I")
	public int anInt3414 = 0;

	@OriginalMember(owner = "client!ve", name = "sb", descriptor = "I")
	public int anInt3425 = 0;

	@OriginalMember(owner = "client!ve", name = "ab", descriptor = "I")
	public int anInt3415 = -1;

	@OriginalMember(owner = "client!ve", name = "vb", descriptor = "I")
	public int anInt3428 = -1;

	@OriginalMember(owner = "client!ve", name = "hb", descriptor = "I")
	public int anInt3417 = -1;

	@OriginalMember(owner = "client!ve", name = "qb", descriptor = "I")
	public int anInt3424 = -1;

	@OriginalMember(owner = "client!ve", name = "wb", descriptor = "I")
	private int anInt3429 = 128;

	@OriginalMember(owner = "client!ve", name = "T", descriptor = "I")
	private int anInt3410 = 0;

	@OriginalMember(owner = "client!ve", name = "Jb", descriptor = "I")
	public int anInt3439 = 0;

	@OriginalMember(owner = "client!ve", name = "Hb", descriptor = "I")
	public int anInt3437 = -1;

	@OriginalMember(owner = "client!ve", name = "db", descriptor = "Z")
	public boolean aBoolean124 = true;

	@OriginalMember(owner = "client!ve", name = "Rb", descriptor = "I")
	private int anInt3444 = 0;

	@OriginalMember(owner = "client!ve", name = "Cb", descriptor = "Z")
	public boolean aBoolean125 = false;

	@OriginalMember(owner = "client!ve", name = "Mb", descriptor = "I")
	public int anInt3441 = 1;

	@OriginalMember(owner = "client!ve", name = "Ob", descriptor = "I")
	private int anInt3442 = -1;

	@OriginalMember(owner = "client!ve", name = "gb", descriptor = "[Lclient!qf;")
	public final Class60[] aClass60Array22 = new Class60[5];

	@OriginalMember(owner = "client!ve", name = "Vb", descriptor = "I")
	public int anInt3446 = 16;

	@OriginalMember(owner = "client!ve", name = "mb", descriptor = "I")
	private int anInt3421 = 0;

	@OriginalMember(owner = "client!ve", name = "Yb", descriptor = "I")
	public int anInt3447 = -1;

	@OriginalMember(owner = "client!ve", name = "ob", descriptor = "I")
	private int anInt3422 = 0;

	@OriginalMember(owner = "client!ve", name = "Lb", descriptor = "Z")
	public boolean aBoolean126 = false;

	@OriginalMember(owner = "client!ve", name = "ic", descriptor = "Lclient!qf;")
	public Class60 aClass60_1425 = Static61.aClass60_851;

	@OriginalMember(owner = "client!ve", name = "Sb", descriptor = "I")
	private int anInt3445 = 0;

	@OriginalMember(owner = "client!ve", name = "pb", descriptor = "I")
	public int anInt3423 = 0;

	@OriginalMember(owner = "client!ve", name = "ac", descriptor = "I")
	private int anInt3448 = 128;

	@OriginalMember(owner = "client!ve", name = "cc", descriptor = "I")
	public int anInt3449 = 1;

	@OriginalMember(owner = "client!ve", name = "fc", descriptor = "Z")
	public boolean aBoolean130 = true;

	@OriginalMember(owner = "client!ve", name = "hc", descriptor = "Z")
	public boolean aBoolean131 = false;

	@OriginalMember(owner = "client!ve", name = "bc", descriptor = "Z")
	private boolean aBoolean128 = false;

	@OriginalMember(owner = "client!ve", name = "ec", descriptor = "Z")
	private boolean aBoolean129 = false;

	@OriginalMember(owner = "client!ve", name = "Gb", descriptor = "I")
	public int anInt3436 = 2;

	@OriginalMember(owner = "client!ve", name = "jc", descriptor = "Z")
	public boolean aBoolean132 = false;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "(I)Z")
	public boolean method2274() {
		if (this.anIntArray387 == null) {
			return this.anInt3415 != -1 || this.anIntArray386 != null;
		}
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray387.length; local22++) {
			if (this.anIntArray387[local22] != -1) {
				@Pc(45) Class3_Sub1_Sub17 local45 = Static18.method517(this.anIntArray387[local22]);
				if (local45.anInt3415 != -1 || local45.anIntArray386 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "(I)Lclient!ve;")
	public Class3_Sub1_Sub17 method2275() {
		@Pc(5) int local5 = -1;
		if (this.anInt3442 != -1) {
			local5 = Static35.method780(this.anInt3442);
		} else if (this.anInt3419 != -1) {
			local5 = Static18.anIntArray80[this.anInt3419];
		}
		return local5 < 0 || local5 >= this.anIntArray387.length || this.anIntArray387[local5] == -1 ? null : Static18.method517(this.anIntArray387[local5]);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!la;I)V")
	public void method2276(@OriginalArg(0) Class3_Sub12 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1936();
			if (local9 == 0) {
				return;
			}
			this.method2285(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BIIIIII)Lclient!ea;")
	public Class3_Sub1_Sub1_Sub4 method2280(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) long local22;
		if (this.anIntArray388 == null) {
			local22 = arg1 + (this.anInt3412 << 10);
		} else {
			local22 = arg1 + (this.anInt3412 << 10) + (arg4 << 3);
		}
		@Pc(42) Class3_Sub1_Sub1_Sub4 local42 = (Class3_Sub1_Sub1_Sub4) Static33.aClass17_17.method643(local22);
		if (local42 == null) {
			@Pc(50) Class3_Sub1_Sub1_Sub7 local50 = this.method2282(arg4, arg1);
			if (local50 == null) {
				return null;
			}
			local42 = local50.method2229(this.anInt3444 + 64, this.anInt3445 * 5 + 768, -50, -10, -50);
			Static33.aClass17_17.method644(local22, local42);
		}
		if (this.aBoolean131) {
			local42 = local42.method622(arg2, arg5, arg0, arg3, true);
		}
		return local42;
	}

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "(I)Z")
	public boolean method2281() {
		if (this.anIntArray385 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray385.length; local19++) {
			local12 &= Static65.aClass25_20.method918(this.anIntArray385[local19] & 0xFFFF, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(III)Lclient!ue;")
	private Class3_Sub1_Sub1_Sub7 method2282(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class3_Sub1_Sub1_Sub7 local7 = null;
		@Pc(34) boolean local34;
		@Pc(38) int local38;
		@Pc(40) int local40;
		@Pc(46) int local46;
		if (this.anIntArray388 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.anIntArray385 == null) {
				return null;
			}
			local34 = this.aBoolean128 ^ arg1 > 3;
			local38 = this.anIntArray385.length;
			for (local40 = 0; local40 < local38; local40++) {
				local46 = this.anIntArray385[local40];
				if (local34) {
					local46 += 65536;
				}
				local7 = (Class3_Sub1_Sub1_Sub7) Static48.aClass17_25.method643((long) local46);
				if (local7 == null) {
					local7 = Static121.method2242(Static65.aClass25_20, local46 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local34) {
						local7.method2226();
					}
					Static48.aClass17_25.method644((long) local46, local7);
				}
				if (local38 > 1) {
					Static105.aClass3_Sub1_Sub1_Sub7Array1[local40] = local7;
				}
			}
			if (local38 > 1) {
				local7 = new Class3_Sub1_Sub1_Sub7(Static105.aClass3_Sub1_Sub1_Sub7Array1, local38);
			}
		} else {
			@Pc(109) int local109 = -1;
			for (local38 = 0; local38 < this.anIntArray388.length; local38++) {
				if (arg0 == this.anIntArray388[local38]) {
					local109 = local38;
					break;
				}
			}
			if (local109 == -1) {
				return null;
			}
			local40 = this.anIntArray385[local109];
			@Pc(154) boolean local154 = this.aBoolean128 ^ arg1 > 3;
			if (local154) {
				local40 += 65536;
			}
			local7 = (Class3_Sub1_Sub1_Sub7) Static48.aClass17_25.method643((long) local40);
			if (local7 == null) {
				local7 = Static121.method2242(Static65.aClass25_20, local40 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local154) {
					local7.method2226();
				}
				Static48.aClass17_25.method644((long) local40, local7);
			}
		}
		if (this.anInt3448 == 128 && this.anInt3411 == 128 && this.anInt3429 == 128) {
			local34 = false;
		} else {
			local34 = true;
		}
		@Pc(228) boolean local228;
		if (this.anInt3410 == 0 && this.anInt3422 == 0 && this.anInt3421 == 0) {
			local228 = false;
		} else {
			local228 = true;
		}
		@Pc(256) Class3_Sub1_Sub1_Sub7 local256 = new Class3_Sub1_Sub1_Sub7(local7, arg1 == 0 && !local34 && !local228, this.aShortArray14 == null, true);
		@Pc(260) int local260 = arg1 & 0x3;
		if (local260 == 1) {
			local256.method2232();
		} else if (local260 == 2) {
			local256.method2245();
		} else if (local260 == 3) {
			local256.method2231();
		}
		if (this.aShortArray14 != null) {
			for (local46 = 0; local46 < this.aShortArray14.length; local46++) {
				local256.method2233(this.aShortArray14[local46], this.aShortArray13[local46]);
			}
		}
		if (local34) {
			local256.method2228(this.anInt3448, this.anInt3411, this.anInt3429);
		}
		if (local228) {
			local256.method2237(this.anInt3410, this.anInt3422, this.anInt3421);
		}
		return local256;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!nf;IIIIIIBI)Lclient!ea;")
	public Class3_Sub1_Sub1_Sub4 method2284(@OriginalArg(0) Class3_Sub1_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(17) long local17;
		if (this.anIntArray388 == null) {
			local17 = (this.anInt3412 << 10) + arg3;
		} else {
			local17 = arg3 + (arg6 << 3) + (this.anInt3412 << 10);
		}
		@Pc(39) Class3_Sub1_Sub1_Sub4 local39 = (Class3_Sub1_Sub1_Sub4) Static33.aClass17_17.method643(local17);
		if (local39 == null) {
			@Pc(47) Class3_Sub1_Sub1_Sub7 local47 = this.method2282(arg6, arg3);
			if (local47 == null) {
				return null;
			}
			local39 = local47.method2229(this.anInt3444 + 64, this.anInt3445 * 5 + 768, -50, -10, -50);
			Static33.aClass17_17.method644(local17, local39);
		}
		if (arg0 == null && !this.aBoolean131) {
			return local39;
		}
		if (arg0 == null) {
			local39 = local39.method627(true);
		} else {
			local39 = arg0.method1596(arg7, local39, arg3);
		}
		if (this.aBoolean131) {
			local39.method622(arg5, arg2, arg1, arg4, false);
		}
		return local39;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IBLclient!la;)V")
	private void method2285(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub12 arg1) {
		@Pc(287) int local287;
		@Pc(295) int local295;
		if (arg0 == 1) {
			local287 = arg1.method1936();
			if (local287 > 0) {
				if (this.anIntArray385 == null || Static61.aBoolean65) {
					this.anIntArray385 = new int[local287];
					this.anIntArray388 = new int[local287];
					for (local295 = 0; local295 < local287; local295++) {
						this.anIntArray385[local295] = arg1.method1963();
						this.anIntArray388[local295] = arg1.method1936();
					}
				} else {
					arg1.anInt2886 += local287 * 3;
				}
			}
		} else if (arg0 == 2) {
			this.aClass60_1425 = arg1.method1943();
		} else if (arg0 == 5) {
			local287 = arg1.method1936();
			if (local287 > 0) {
				if (this.anIntArray385 == null || Static61.aBoolean65) {
					this.anIntArray388 = null;
					this.anIntArray385 = new int[local287];
					for (local295 = 0; local295 < local287; local295++) {
						this.anIntArray385[local295] = arg1.method1963();
					}
				} else {
					arg1.anInt2886 += local287 * 2;
				}
			}
		} else if (arg0 == 14) {
			this.anInt3449 = arg1.method1936();
		} else if (arg0 == 15) {
			this.anInt3441 = arg1.method1936();
		} else if (arg0 == 17) {
			this.anInt3436 = 0;
			this.aBoolean130 = false;
		} else if (arg0 == 18) {
			this.aBoolean130 = false;
		} else if (arg0 == 19) {
			this.anInt3424 = arg1.method1936();
		} else if (arg0 == 21) {
			this.aBoolean131 = true;
		} else if (arg0 == 22) {
			this.aBoolean129 = true;
		} else if (arg0 == 23) {
			this.aBoolean132 = true;
		} else if (arg0 == 24) {
			this.anInt3437 = arg1.method1963();
			if (this.anInt3437 == 65535) {
				this.anInt3437 = -1;
			}
		} else if (arg0 == 27) {
			this.anInt3436 = 1;
		} else if (arg0 == 28) {
			this.anInt3446 = arg1.method1936();
		} else if (arg0 == 29) {
			this.anInt3444 = arg1.method1958();
		} else if (arg0 == 39) {
			this.anInt3445 = arg1.method1958() * 5;
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass60Array22[arg0 - 30] = arg1.method1943();
			if (this.aClass60Array22[arg0 - 30].method1860(Static27.aClass60_383)) {
				this.aClass60Array22[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local287 = arg1.method1936();
			this.aShortArray14 = new short[local287];
			this.aShortArray13 = new short[local287];
			for (local295 = 0; local295 < local287; local295++) {
				this.aShortArray14[local295] = (short) arg1.method1963();
				this.aShortArray13[local295] = (short) arg1.method1963();
			}
		} else if (arg0 == 60) {
			this.anInt3428 = arg1.method1963();
		} else if (arg0 == 62) {
			this.aBoolean128 = true;
		} else if (arg0 == 64) {
			this.aBoolean124 = false;
		} else if (arg0 == 65) {
			this.anInt3448 = arg1.method1963();
		} else if (arg0 == 66) {
			this.anInt3411 = arg1.method1963();
		} else if (arg0 == 67) {
			this.anInt3429 = arg1.method1963();
		} else if (arg0 == 68) {
			this.anInt3447 = arg1.method1963();
		} else if (arg0 == 69) {
			this.anInt3439 = arg1.method1936();
		} else if (arg0 == 70) {
			this.anInt3410 = arg1.method1969();
		} else if (arg0 == 71) {
			this.anInt3422 = arg1.method1969();
		} else if (arg0 == 72) {
			this.anInt3421 = arg1.method1969();
		} else if (arg0 == 73) {
			this.aBoolean125 = true;
		} else if (arg0 == 74) {
			this.aBoolean126 = true;
		} else if (arg0 == 75) {
			this.anInt3417 = arg1.method1936();
		} else if (arg0 == 77) {
			this.anInt3442 = arg1.method1963();
			if (this.anInt3442 == 65535) {
				this.anInt3442 = -1;
			}
			this.anInt3419 = arg1.method1963();
			if (this.anInt3419 == 65535) {
				this.anInt3419 = -1;
			}
			local287 = arg1.method1936();
			this.anIntArray387 = new int[local287 + 1];
			for (local295 = 0; local295 <= local287; local295++) {
				this.anIntArray387[local295] = arg1.method1963();
				if (this.anIntArray387[local295] == 65535) {
					this.anIntArray387[local295] = -1;
				}
			}
		} else if (arg0 == 78) {
			this.anInt3415 = arg1.method1963();
			this.anInt3423 = arg1.method1936();
		} else if (arg0 == 79) {
			this.anInt3425 = arg1.method1963();
			this.anInt3414 = arg1.method1963();
			this.anInt3423 = arg1.method1936();
			local287 = arg1.method1936();
			this.anIntArray386 = new int[local287];
			for (local295 = 0; local295 < local287; local295++) {
				this.anIntArray386[local295] = arg1.method1963();
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "(I)V")
	public void method2286() {
		if (this.anInt3424 == -1) {
			this.anInt3424 = 0;
			if (this.anIntArray385 != null && (this.anIntArray388 == null || this.anIntArray388[0] == 10)) {
				this.anInt3424 = 1;
			}
			for (@Pc(33) int local33 = 0; local33 < 5; local33++) {
				if (this.aClass60Array22[local33] != null) {
					this.anInt3424 = 1;
				}
			}
		}
		if (this.anInt3417 == -1) {
			this.anInt3417 = this.anInt3436 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(BI)Z")
	public boolean method2287(@OriginalArg(1) int arg0) {
		if (this.anIntArray388 != null) {
			for (@Pc(62) int local62 = 0; local62 < this.anIntArray388.length; local62++) {
				if (arg0 == this.anIntArray388[local62]) {
					return Static65.aClass25_20.method918(this.anIntArray385[local62] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray385 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(31) boolean local31 = true;
			for (@Pc(33) int local33 = 0; local33 < this.anIntArray385.length; local33++) {
				local31 &= Static65.aClass25_20.method918(this.anIntArray385[local33] & 0xFFFF, 0);
			}
			return local31;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIII)Lclient!ee;")
	public Class3_Sub1_Sub1 method2288(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(20) long local20;
		if (this.anIntArray388 == null) {
			local20 = arg1 + (this.anInt3412 << 10);
		} else {
			local20 = (arg4 << 3) + (this.anInt3412 << 10) + arg1;
		}
		@Pc(38) Class3_Sub1_Sub1 local38 = (Class3_Sub1_Sub1) Static35.aClass17_19.method643(local20);
		if (local38 == null) {
			@Pc(46) Class3_Sub1_Sub1_Sub7 local46 = this.method2282(arg4, arg1);
			if (local46 == null) {
				return null;
			}
			if (this.aBoolean129) {
				local46.aShort1 = (short) (this.anInt3445 * 5 + 768);
				local38 = local46;
				local46.aShort2 = (short) (this.anInt3444 + 64);
				local46.method2241();
			} else {
				local38 = local46.method2229(this.anInt3444 + 64, 768 - -(this.anInt3445 * 5), -50, -10, -50);
			}
			Static35.aClass17_19.method644(local20, local38);
		}
		if (this.aBoolean129) {
			local38 = ((Class3_Sub1_Sub1_Sub7) local38).method2236();
		}
		if (this.aBoolean131) {
			if (local38 instanceof Class3_Sub1_Sub1_Sub4) {
				local38 = ((Class3_Sub1_Sub1_Sub4) local38).method622(arg2, arg5, arg3, arg0, true);
			} else if (local38 instanceof Class3_Sub1_Sub1_Sub7) {
				local38 = ((Class3_Sub1_Sub1_Sub7) local38).method2243(arg2, arg5, arg3, arg0);
			}
		}
		return local38;
	}
}
