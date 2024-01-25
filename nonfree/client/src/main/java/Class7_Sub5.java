import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class7_Sub5 extends Class7 {

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
	private int anInt2242;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
	private int anInt2245;

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
	private int anInt2246;

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
	private int anInt2247;

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
	private int anInt2248;

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
	private int anInt2249;

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
	public int anInt2251;

	@OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
	private int anInt2252;

	@OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
	private int anInt2253;

	@OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
	private int anInt2254;

	@OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
	private int anInt2255;

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
	public int anInt2256;

	@OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
	private int anInt2257;

	@OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
	public int anInt2258;

	@OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
	private int anInt2260;

	@OriginalMember(owner = "client!hk", name = "D", descriptor = "I")
	private int anInt2261;

	@OriginalMember(owner = "client!hk", name = "E", descriptor = "I")
	private int anInt2262;

	@OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
	private int anInt2263;

	@OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
	public int anInt2267;

	@OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
	private int anInt2269;

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "Z")
	private boolean aBoolean184 = false;

	@OriginalMember(owner = "client!hk", name = "x", descriptor = "Z")
	public boolean aBoolean185 = false;

	@OriginalMember(owner = "client!hk", name = "L", descriptor = "I")
	private int anInt2268 = 0;

	@OriginalMember(owner = "client!hk", name = "F", descriptor = "Lclient!kr;")
	public final Class7_Sub7 aClass7_Sub7_5;

	@OriginalMember(owner = "client!hk", name = "w", descriptor = "Lclient!ho;")
	public final Class100 aClass100_1;

	@OriginalMember(owner = "client!hk", name = "P", descriptor = "J")
	private final long aLong55;

	@OriginalMember(owner = "client!hk", name = "A", descriptor = "Lclient!hh;")
	public Class95 aClass95_1;

	@OriginalMember(owner = "client!hk", name = "M", descriptor = "Lclient!ke;")
	public final Class122 aClass122_3;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!ii;Lclient!ho;Lclient!kr;J)V")
	public Class7_Sub5(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) Class7_Sub7 arg2, @OriginalArg(3) long arg3) {
		this.aClass7_Sub7_5 = arg2;
		this.aClass100_1 = arg1;
		this.aLong55 = arg3;
		this.aClass95_1 = Static170.method3017(this.aClass100_1.anInt2295);
		if (!arg0.method4260() && this.aClass95_1.anInt2184 != -1) {
			this.aClass95_1 = Static170.method3017(this.aClass95_1.anInt2184);
		}
		this.aClass122_3 = new Class122();
		this.anInt2268 = (int) ((double) this.anInt2268 + Math.random() * 64.0D);
		this.method1843();
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
	public void method1843() {
		this.anInt2262 = this.aClass100_1.anInt2311;
		this.anInt2257 = this.aClass100_1.anInt2303;
		this.anInt2255 = this.aClass100_1.anInt2299;
		this.anInt2260 = this.aClass100_1.anInt2294;
		this.anInt2254 = this.aClass100_1.anInt2296;
		this.anInt2246 = this.aClass100_1.anInt2300;
		this.anInt2261 = this.aClass100_1.anInt2308;
		this.anInt2269 = this.aClass100_1.anInt2309;
		this.anInt2242 = this.aClass100_1.anInt2307;
		if (this.anInt2257 == this.anInt2260 && this.anInt2260 == this.anInt2269 && this.anInt2255 == this.anInt2254 && this.anInt2242 == this.anInt2255 && this.anInt2246 == this.anInt2262 && this.anInt2246 == this.anInt2261) {
			this.aBoolean184 = true;
			return;
		}
		this.aBoolean184 = false;
		@Pc(115) int local115 = (this.anInt2269 + this.anInt2260 + this.anInt2257) / 3;
		@Pc(126) int local126 = (this.anInt2242 + this.anInt2255 + this.anInt2254) / 3;
		@Pc(141) int local141 = (this.anInt2262 + this.anInt2246 + this.anInt2261) / 3;
		if (local115 == this.anInt2251 && local126 == this.anInt2267 && local141 == this.anInt2256) {
			return;
		}
		this.anInt2256 = local141;
		this.anInt2251 = local115;
		this.anInt2267 = local126;
		@Pc(169) int local169 = this.anInt2260 - this.anInt2257;
		@Pc(176) int local176 = this.anInt2255 - this.anInt2254;
		@Pc(182) int local182 = this.anInt2246 - this.anInt2262;
		@Pc(188) int local188 = this.anInt2269 - this.anInt2257;
		@Pc(195) int local195 = this.anInt2242 - this.anInt2254;
		@Pc(202) int local202 = this.anInt2261 - this.anInt2262;
		this.anInt2248 = local182 * local188 - local202 * local169;
		this.anInt2253 = local195 * local169 - local176 * local188;
		this.anInt2249 = local176 * local202 - local195 * local182;
		while (this.anInt2249 > 32767 || this.anInt2248 > 32767 || this.anInt2253 > 32767 || this.anInt2249 < -32767 || this.anInt2248 < -32767 || this.anInt2253 < -32767) {
			this.anInt2248 >>= 0x1;
			this.anInt2249 >>= 0x1;
			this.anInt2253 >>= 0x1;
		}
		@Pc(303) int local303 = (int) Math.sqrt((double) (this.anInt2249 * this.anInt2249 + this.anInt2248 * this.anInt2248 + this.anInt2253 * this.anInt2253));
		if (local303 <= 0) {
			local303 = 1;
		}
		this.anInt2253 = this.anInt2253 * 32767 / local303;
		this.anInt2249 = this.anInt2249 * 32767 / local303;
		this.anInt2248 = this.anInt2248 * 32767 / local303;
		if (this.aClass95_1.aShort43 <= 0 && this.aClass95_1.aShort44 <= 0) {
			return;
		}
		@Pc(359) int local359 = (int) (Math.atan2((double) this.anInt2253, (double) this.anInt2249) * 2607.5945876176133D);
		@Pc(380) int local380 = (int) (Math.atan2((double) this.anInt2248, Math.sqrt((double) (this.anInt2249 * this.anInt2249 + this.anInt2253 * this.anInt2253))) * 2607.5945876176133D);
		this.anInt2245 = this.aClass95_1.aShort43 - this.aClass95_1.aShort46;
		this.anInt2263 = this.aClass95_1.aShort46 + local359 - (this.anInt2245 >> 1);
		this.anInt2252 = this.aClass95_1.aShort44 - this.aClass95_1.aShort45;
		this.anInt2247 = this.aClass95_1.aShort45 + local380 - (this.anInt2252 >> 1);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IJ)V")
	public void method1847(@OriginalArg(1) long arg0) {
		for (@Pc(20) Class7_Sub2_Sub1_Sub1 local20 = (Class7_Sub2_Sub1_Sub1) this.aClass122_3.method2626(); local20 != null; local20 = (Class7_Sub2_Sub1_Sub1) this.aClass122_3.method2630()) {
			local20.method751(arg0);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!ii;JIZI)V")
	public void method1848(@OriginalArg(0) Class105 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(41) int local41;
		if (this.aBoolean185) {
			arg3 = false;
		} else if (Static67.anInt1464 < this.aClass95_1.anInt2222) {
			arg3 = false;
		} else if (Static230.anInt4803 > Static314.anIntArray627[Static67.anInt1464]) {
			arg3 = false;
		} else if (this.aBoolean184) {
			arg3 = false;
		} else if (this.aClass95_1.anInt2199 != -1) {
			local41 = (int) (arg1 - this.aLong55);
			if (this.aClass95_1.aBoolean182 || this.aClass95_1.anInt2199 >= local41) {
				local41 %= this.aClass95_1.anInt2199;
			} else {
				arg3 = false;
			}
			if (!this.aClass95_1.aBoolean181 && this.aClass95_1.anInt2201 > local41) {
				arg3 = false;
			}
			if (this.aClass95_1.aBoolean181 && this.aClass95_1.anInt2201 <= local41) {
				arg3 = false;
			}
		}
		if (arg3) {
			this.anInt2268 += (int) (((double) this.aClass95_1.anInt2213 + (double) (this.aClass95_1.anInt2177 - this.aClass95_1.anInt2213) * Math.random()) * (double) arg2);
			if (this.anInt2268 > 63) {
				local41 = this.anInt2268 >> 6;
				this.anInt2268 &= 0x3F;
				for (@Pc(142) int local142 = 0; local142 < local41; local142++) {
					@Pc(202) int local202;
					@Pc(210) int local210;
					@Pc(216) int local216;
					@Pc(165) int local165;
					@Pc(173) int local173;
					@Pc(177) int local177;
					@Pc(188) int local188;
					@Pc(196) int local196;
					@Pc(206) int local206;
					if (this.aClass95_1.aShort43 <= 0 && this.aClass95_1.aShort44 <= 0) {
						local216 = this.anInt2253;
						local202 = this.anInt2249;
						local210 = this.anInt2248;
					} else {
						local165 = (int) ((double) this.anInt2245 * Math.random()) + this.anInt2263;
						@Pc(169) int local169 = local165 & 0x3FFF;
						local173 = Class1_Sub5_Sub15.anIntArray335[local169];
						local177 = Class1_Sub5_Sub15.anIntArray333[local169];
						local188 = this.anInt2247 + (int) (Math.random() * (double) this.anInt2252);
						@Pc(192) int local192 = local188 & 0x1FFF;
						local196 = Class1_Sub5_Sub15.anIntArray335[local192];
						local202 = local177 * local196 >> 15;
						local206 = Class1_Sub5_Sub15.anIntArray333[local192];
						local210 = local206 * -1;
						local216 = local196 * local173 >> 15;
					}
					local165 = (int) (Math.random() * 65535.0D);
					local173 = (int) (Math.random() * 65535.0D);
					if (local173 + local165 > 65535) {
						local165 = 65535 - local165;
						local173 = 65535 - local173;
					}
					local177 = 65535 - local173 - local165;
					local188 = this.anInt2257 * local165 + local173 * this.anInt2260 + local177 * this.anInt2269 >> 16;
					local196 = this.anInt2242 * local177 + local165 * this.anInt2254 + this.anInt2255 * local173 >> 16;
					local206 = this.anInt2262 * local165 + this.anInt2246 * local173 + this.anInt2261 * local177 >> 16;
					@Pc(330) int local330 = (int) ((double) (this.aClass95_1.anInt2220 - this.aClass95_1.anInt2181) * Math.random()) + this.aClass95_1.anInt2181;
					@Pc(347) int local347 = this.aClass95_1.anInt2186 + (int) (Math.random() * (double) (this.aClass95_1.anInt2204 - this.aClass95_1.anInt2186));
					@Pc(365) int local365 = this.aClass95_1.anInt2192 + (int) (Math.random() * (double) (this.aClass95_1.anInt2215 - this.aClass95_1.anInt2192));
					@Pc(427) int local427;
					if (this.aClass95_1.aBoolean179) {
						@Pc(431) double local431 = Math.random();
						local427 = (int) ((double) this.aClass95_1.anInt2208 + local431 * (double) this.aClass95_1.anInt2175) << 24 | (int) ((double) this.aClass95_1.anInt2212 + local431 * (double) this.aClass95_1.anInt2187) | (int) ((double) this.aClass95_1.anInt2174 * local431 + (double) this.aClass95_1.anInt2200) << 16 | (int) ((double) this.aClass95_1.anInt2176 + (double) this.aClass95_1.anInt2203 * local431) << 8;
					} else {
						local427 = (int) (Math.random() * (double) this.aClass95_1.anInt2175 + (double) this.aClass95_1.anInt2208) << 24 | (int) ((double) this.aClass95_1.anInt2212 + (double) this.aClass95_1.anInt2187 * Math.random()) | (int) ((double) this.aClass95_1.anInt2174 * Math.random() + (double) this.aClass95_1.anInt2200) << 16 | (int) ((double) this.aClass95_1.anInt2203 * Math.random() + (double) this.aClass95_1.anInt2176) << 8;
					}
					@Pc(493) int local493 = this.aClass95_1.anInt2170;
					if (!arg0.method4260() && !this.aClass95_1.aBoolean178) {
						local493 = -1;
					}
					if (Static195.anInt6717 == Static331.anInt3768) {
						new Class7_Sub2_Sub1_Sub1(this, local188, local196, local206, local202, local210, local216, local330, local347, local427, local365, local493, this.aClass95_1.aBoolean177);
					} else {
						@Pc(509) Class7_Sub2_Sub1_Sub1 local509 = Static35.aClass7_Sub2_Sub1_Sub1Array1[Static195.anInt6717];
						Static195.anInt6717 = Static195.anInt6717 + 1 & 0x3FF;
						local509.method749(this, local188, local196, local206, local202, local210, local216, local330, local347, local427, local365, local493, this.aClass95_1.aBoolean177);
					}
				}
			}
		}
		this.anInt2258 = 0;
		for (@Pc(577) Class7_Sub2_Sub1_Sub1 local577 = (Class7_Sub2_Sub1_Sub1) this.aClass122_3.method2626(); local577 != null; local577 = (Class7_Sub2_Sub1_Sub1) this.aClass122_3.method2630()) {
			local577.method750(arg1, arg2);
			this.anInt2258++;
		}
		Static189.anInt6108 += this.anInt2258;
	}
}
