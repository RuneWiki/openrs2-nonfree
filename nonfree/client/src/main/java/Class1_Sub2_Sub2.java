import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ld", name = "dc", descriptor = "I")
	public int anInt2271;

	@OriginalMember(owner = "client!ld", name = "lc", descriptor = "I")
	public int anInt2277;

	@OriginalMember(owner = "client!ld", name = "nc", descriptor = "Lclient!dc;")
	public Class20 aClass20_848;

	@OriginalMember(owner = "client!ld", name = "oc", descriptor = "I")
	public int anInt2279;

	@OriginalMember(owner = "client!ld", name = "pc", descriptor = "I")
	public int anInt2280;

	@OriginalMember(owner = "client!ld", name = "rc", descriptor = "Lclient!kg;")
	public Class56 aClass56_1;

	@OriginalMember(owner = "client!ld", name = "tc", descriptor = "I")
	public int anInt2282;

	@OriginalMember(owner = "client!ld", name = "uc", descriptor = "I")
	public int anInt2283;

	@OriginalMember(owner = "client!ld", name = "Ac", descriptor = "Lclient!a;")
	public Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!ld", name = "Bc", descriptor = "I")
	public int anInt2288;

	@OriginalMember(owner = "client!ld", name = "ic", descriptor = "Z")
	public boolean aBoolean97 = false;

	@OriginalMember(owner = "client!ld", name = "jc", descriptor = "S")
	private short aShort25 = 0;

	@OriginalMember(owner = "client!ld", name = "qc", descriptor = "S")
	private short aShort26 = 0;

	@OriginalMember(owner = "client!ld", name = "ec", descriptor = "I")
	public int anInt2272 = 0;

	@OriginalMember(owner = "client!ld", name = "zc", descriptor = "I")
	public int anInt2287 = -1;

	@OriginalMember(owner = "client!ld", name = "wc", descriptor = "I")
	public int anInt2284 = 0;

	@OriginalMember(owner = "client!ld", name = "kc", descriptor = "I")
	public int anInt2276 = 0;

	@OriginalMember(owner = "client!ld", name = "sc", descriptor = "I")
	public int anInt2281 = -1;

	@OriginalMember(owner = "client!ld", name = "hc", descriptor = "I")
	public int anInt2275 = 0;

	@OriginalMember(owner = "client!ld", name = "Jc", descriptor = "I")
	public int anInt2293 = 0;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method1741() {
		return this.aClass56_1 != null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!ce;)V")
	public void method1752(@OriginalArg(1) Class5_Sub6 arg0) {
		arg0.anInt4050 = 0;
		@Pc(12) int local12 = arg0.method3062();
		@Pc(16) int local16 = local12 & 0x1;
		if ((local12 & 0x2) == 2) {
			this.aShort26 = (short) (arg0.method3062() << 2);
			this.aShort25 = (short) (arg0.method3062() << 2);
		} else {
			this.aShort26 = 0;
			this.aShort25 = 0;
		}
		@Pc(55) boolean local55 = (local12 & 0x4) != 0;
		super.anInt2238 = (local12 >> 3) + 1;
		this.anInt2287 = arg0.method3053();
		this.anInt2281 = arg0.method3053();
		@Pc(75) int[] local75 = new int[12];
		@Pc(77) int local77 = -1;
		this.anInt2284 = 0;
		@Pc(102) int local102;
		@Pc(108) int local108;
		for (@Pc(82) int local82 = 0; local82 < 12; local82++) {
			@Pc(90) int local90 = arg0.method3062();
			if (local90 == 0) {
				local75[local82] = 0;
			} else {
				local102 = arg0.method3062();
				local108 = local102 + (local90 << 8);
				if (local82 == 0 && local108 == 65535) {
					local77 = arg0.method3077();
					break;
				}
				if (local108 >= 32768) {
					local108 = Static207.anIntArray423[local108 - 32768];
					local75[local82] = local108 | 0x40000000;
					@Pc(139) int local139 = Static196.method2908(local108).anInt2347;
					if (local139 != 0) {
						this.anInt2284 = local139;
					}
				} else {
					local75[local82] = Integer.MIN_VALUE | local108 - 256;
				}
			}
		}
		@Pc(164) int[] local164 = new int[5];
		for (local102 = 0; local102 < 5; local102++) {
			local108 = arg0.method3062();
			if (local108 < 0 || Static88.aShortArrayArray6[local102].length <= local108) {
				local108 = 0;
			}
			local164[local102] = local108;
		}
		super.anInt2216 = arg0.method3077();
		if (super.anInt2216 == 65535) {
			super.anInt2216 = -1;
		}
		super.anInt2229 = arg0.method3077();
		if (super.anInt2229 == 65535) {
			super.anInt2229 = -1;
		}
		super.anInt2252 = super.anInt2229;
		super.anInt2221 = arg0.method3077();
		if (super.anInt2221 == 65535) {
			super.anInt2221 = -1;
		}
		super.anInt2230 = arg0.method3077();
		if (super.anInt2230 == 65535) {
			super.anInt2230 = -1;
		}
		super.anInt2259 = arg0.method3077();
		if (super.anInt2259 == 65535) {
			super.anInt2259 = -1;
		}
		super.anInt2243 = arg0.method3077();
		if (super.anInt2243 == 65535) {
			super.anInt2243 = -1;
		}
		super.anInt2240 = arg0.method3077();
		if (super.anInt2240 == 65535) {
			super.anInt2240 = -1;
		}
		this.aClass20_848 = Static160.method2438(arg0.method3069()).method565();
		this.anInt2275 = arg0.method3062();
		if (local55) {
			this.anInt2276 = arg0.method3077();
		} else {
			this.anInt2276 = 0;
		}
		if (this.aClass56_1 == null) {
			this.aClass56_1 = new Class56();
		}
		this.aClass56_1.method1697(local16 == 1, local164, local77, local75);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass56_1 == null) {
			return;
		}
		@Pc(24) Class5_Sub2_Sub22 local24 = super.anInt2254 != -1 && super.anInt2262 == 0 ? Static14.method253(super.anInt2254) : null;
		@Pc(49) Class5_Sub2_Sub22 local49 = super.anInt2215 == -1 || this.aBoolean97 || super.anInt2216 == super.anInt2215 && local24 != null ? null : Static14.method253(super.anInt2215);
		@Pc(60) Class1_Sub1 local60 = this.aClass56_1.method1699(super.anInt2265, super.anInt2222, local49, local24);
		if (local60 == null) {
			return;
		}
		super.anInt2248 = local60.method2449();
		@Pc(75) int local75;
		@Pc(121) int local121;
		@Pc(132) int local132;
		@Pc(167) int local167;
		if (Static210.aClass1_Sub2_Sub2_2 == this) {
			for (local75 = Static218.aClass14Array1.length - 1; local75 >= 0; local75--) {
				@Pc(81) Class14 local81 = Static218.aClass14Array1[local75];
				if (local81 != null && local81.anInt403 != -1) {
					if (local81.anInt394 == 1 && local81.anInt399 >= 0 && Static61.aClass1_Sub2_Sub1Array1.length > local81.anInt399) {
						@Pc(108) Class1_Sub2_Sub1 local108 = Static61.aClass1_Sub2_Sub1Array1[local81.anInt399];
						if (local108 != null) {
							local121 = local108.anInt2241 / 32 - Static210.aClass1_Sub2_Sub2_2.anInt2241 / 32;
							local132 = local108.anInt2234 / 32 - Static210.aClass1_Sub2_Sub2_2.anInt2234 / 32;
							this.method1755(arg5, local121, arg3, arg6, local81.anInt403, local60, arg1, arg0, local132, arg4, arg2, arg7);
						}
					}
					if (local81.anInt394 == 2) {
						local167 = (local81.anInt401 - Static86.anInt1895) * 4 + 2 - Static210.aClass1_Sub2_Sub2_2.anInt2241 / 32;
						local121 = (local81.anInt402 - Static110.anInt2295) * 4 + 2 - Static210.aClass1_Sub2_Sub2_2.anInt2234 / 32;
						this.method1755(arg5, local167, arg3, arg6, local81.anInt403, local60, arg1, arg0, local121, arg4, arg2, arg7);
					}
					if (local81.anInt394 == 10 && local81.anInt399 >= 0 && local81.anInt399 < Static6.aClass1_Sub2_Sub2Array1.length) {
						@Pc(215) Class1_Sub2_Sub2 local215 = Static6.aClass1_Sub2_Sub2Array1[local81.anInt399];
						if (local215 != null) {
							local132 = local215.anInt2234 / 32 - Static210.aClass1_Sub2_Sub2_2.anInt2234 / 32;
							local121 = local215.anInt2241 / 32 - Static210.aClass1_Sub2_Sub2_2.anInt2241 / 32;
							this.method1755(arg5, local121, arg3, arg6, local81.anInt403, local60, arg1, arg0, local132, arg4, arg2, arg7);
						}
					}
				}
			}
		}
		local75 = 0;
		@Pc(261) int local261 = 0;
		local167 = 0;
		if (this.aShort26 != 0 && this.aShort25 != 0) {
			local121 = Class80.anIntArray324[arg0];
			local132 = Class80.anIntArray327[arg0];
			@Pc(280) short local280 = this.aShort25;
			@Pc(285) int local285 = -local280 / 2;
			@Pc(288) short local288 = this.aShort26;
			@Pc(293) int local293 = -local288 / 2;
			@Pc(298) int local298 = -local280 / 2;
			@Pc(309) int local309 = local285 * local132 - local293 * local121 >> 16;
			@Pc(319) int local319 = local285 * local121 + local132 * local293 >> 16;
			@Pc(323) int local323 = local288 / 2;
			@Pc(333) int local333 = local323 * local132 + local298 * local121 >> 16;
			@Pc(338) int local338 = -local288 / 2;
			@Pc(350) int local350 = Static128.method1999(Static111.anInt2327, local319 + super.anInt2241, super.anInt2234 + local309);
			@Pc(361) int local361 = local132 * local298 - local121 * local323 >> 16;
			@Pc(374) int local374 = Static128.method1999(Static111.anInt2327, super.anInt2241 + local333, local361 + super.anInt2234);
			@Pc(378) int local378 = local280 / 2;
			@Pc(388) int local388 = local378 * local121 + local132 * local338 >> 16;
			@Pc(399) int local399 = local132 * local378 - local121 * local338 >> 16;
			@Pc(411) int local411 = Static128.method1999(Static111.anInt2327, super.anInt2241 + local388, super.anInt2234 + local399);
			@Pc(415) int local415 = local280 / 2;
			@Pc(419) int local419 = local288 / 2;
			@Pc(429) int local429 = local132 * local419 + local121 * local415 >> 16;
			@Pc(440) int local440 = local415 * local132 - local121 * local419 >> 16;
			@Pc(451) int local451 = local350 >= local374 ? local374 : local350;
			@Pc(464) int local464 = Static128.method1999(Static111.anInt2327, super.anInt2241 + local429, super.anInt2234 + local440);
			local167 = local464 + local350;
			@Pc(479) int local479 = local374 >= local464 ? local464 : local374;
			@Pc(486) int local486 = local411 <= local350 ? local411 : local350;
			if (local167 > local374 + local411) {
				local167 = local411 + local374;
			}
			@Pc(503) int local503 = local464 <= local411 ? local464 : local411;
			local75 = (int) (Math.atan2((double) (local451 - local503), (double) local280) * 325.95D) & 0x7FF;
			if (local75 != 0) {
				local60.method674(local75);
			}
			local261 = (int) (Math.atan2((double) (local486 - local479), (double) local288) * 325.95D) & 0x7FF;
			if (local261 != 0) {
				local60.method663(local261);
			}
			local167 = (local167 >> 1) - super.anInt2231;
			if (local167 != 0) {
				local60.method668(0, local167, 0);
			}
		}
		@Pc(567) Class1_Sub1 local567 = null;
		if (!this.aBoolean97 && super.anInt2266 != -1 && super.anInt2255 != -1) {
			@Pc(583) Class5_Sub2_Sub17 local583 = Static181.method2739(super.anInt2266);
			local567 = local583.method2506(super.anInt2255);
			if (local567 != null) {
				local567.method668(0, -super.anInt2225, 0);
				if (local583.aBoolean146) {
					if (local75 != 0) {
						local567.method674(local75);
					}
					if (local261 != 0) {
						local567.method663(local261);
					}
					if (local167 != 0) {
						local567.method668(0, local167, 0);
					}
				}
			}
		}
		@Pc(620) Class1_Sub1 local620 = null;
		if (!this.aBoolean97 && this.aClass1_Sub1_1 != null) {
			if (Static177.anInt3533 >= this.anInt2293) {
				this.aClass1_Sub1_1 = null;
			}
			if (Static177.anInt3533 >= this.anInt2272 && this.anInt2293 > Static177.anInt3533) {
				local620 = this.aClass1_Sub1_1;
				local620.method668(this.anInt2282 - super.anInt2241, this.anInt2288 + -super.anInt2231, this.anInt2271 - super.anInt2234);
				if (super.anInt2246 == 512) {
					local620.method662();
				} else if (super.anInt2246 == 1024) {
					local620.method661();
				} else if (super.anInt2246 == 1536) {
					local620.method664();
				}
			}
		}
		if (local567 != null) {
			local60 = ((Class1_Sub1_Sub1) local60).method679(local567);
		}
		if (local620 != null) {
			local60 = ((Class1_Sub1_Sub1) local60).method679(local620);
		}
		local60.aBoolean51 = true;
		local60.method2445(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local620 == null) {
			return;
		}
		if (super.anInt2246 == 512) {
			local620.method664();
		} else if (super.anInt2246 == 1024) {
			local620.method661();
		} else if (super.anInt2246 == 1536) {
			local620.method662();
		}
		local620.method668(super.anInt2241 - this.anInt2282, -this.anInt2288 + super.anInt2231, super.anInt2234 - this.anInt2271);
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "()I")
	@Override
	public int method2449() {
		return super.anInt2248;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIILclient!a;IIIIII)V")
	private void method1755(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1_Sub1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(11) int local11 = arg8 * arg8 + arg1 * arg1;
		if (local11 < 16 || local11 > 360000) {
			return;
		}
		@Pc(31) int local31 = (int) (Math.atan2((double) arg1, (double) arg8) * 325.949D) & 0x7FF;
		@Pc(43) Class1_Sub1 local43 = Static77.method2450(arg5, super.anInt2241, super.anInt2234, local31, arg4, super.anInt2231);
		if (local43 != null) {
			local43.method2445(0, arg6, arg10, arg2, arg9, arg0, arg3, arg11, -1L);
		}
	}
}
