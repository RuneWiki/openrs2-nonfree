import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class8_Sub4 extends Class8 {

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
	private int anInt2255;

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
	private int anInt2257;

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
	private int anInt2258;

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
	private int anInt2259;

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
	private int anInt2260;

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
	private int anInt2262;

	@OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
	public int anInt2263;

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
	private int anInt2264;

	@OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
	public int anInt2265;

	@OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
	private int anInt2266;

	@OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
	private int anInt2269;

	@OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
	private int anInt2270;

	@OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
	private int anInt2271;

	@OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
	private int anInt2272;

	@OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
	private int anInt2273;

	@OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
	public int anInt2275;

	@OriginalMember(owner = "client!ga", name = "O", descriptor = "I")
	public int anInt2276;

	@OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
	private int anInt2278;

	@OriginalMember(owner = "client!ga", name = "U", descriptor = "I")
	private int anInt2281;

	@OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
	private int anInt2282;

	@OriginalMember(owner = "client!ga", name = "y", descriptor = "Z")
	public boolean aBoolean212 = false;

	@OriginalMember(owner = "client!ga", name = "M", descriptor = "Z")
	private boolean aBoolean213 = false;

	@OriginalMember(owner = "client!ga", name = "X", descriptor = "I")
	private int anInt2283 = 0;

	@OriginalMember(owner = "client!ga", name = "Y", descriptor = "J")
	private final long aLong74;

	@OriginalMember(owner = "client!ga", name = "W", descriptor = "Lclient!kq;")
	public final Class8_Sub6 aClass8_Sub6_3;

	@OriginalMember(owner = "client!ga", name = "F", descriptor = "Lclient!un;")
	public final Class206 aClass206_1;

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "Lclient!rd;")
	public Class177 aClass177_1;

	@OriginalMember(owner = "client!ga", name = "R", descriptor = "Lclient!wp;")
	public final Class217 aClass217_3;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!uo;Lclient!un;Lclient!kq;J)V")
	public Class8_Sub4(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class8_Sub6 arg2, @OriginalArg(3) long arg3) {
		this.aLong74 = arg3;
		this.aClass8_Sub6_3 = arg2;
		this.aClass206_1 = arg1;
		this.aClass177_1 = Static147.method2935(this.aClass206_1.anInt6266);
		if (!arg0.method2192() && this.aClass177_1.anInt5430 != -1) {
			this.aClass177_1 = Static147.method2935(this.aClass177_1.anInt5430);
		}
		this.aClass217_3 = new Class217();
		this.anInt2283 = (int) ((double) this.anInt2283 + Math.random() * 64.0D);
		this.method1956();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IJ)V")
	public void method1954(@OriginalArg(1) long arg0) {
		for (@Pc(17) Class8_Sub2_Sub1_Sub1 local17 = (Class8_Sub2_Sub1_Sub1) this.aClass217_3.method5683(); local17 != null; local17 = (Class8_Sub2_Sub1_Sub1) this.aClass217_3.method5679()) {
			local17.method890(arg0);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
	public void method1956() {
		this.anInt2269 = this.aClass206_1.anInt6263;
		this.anInt2262 = this.aClass206_1.anInt6257;
		this.anInt2281 = this.aClass206_1.anInt6267;
		this.anInt2258 = this.aClass206_1.anInt6261;
		this.anInt2266 = this.aClass206_1.anInt6258;
		this.anInt2273 = this.aClass206_1.anInt6265;
		this.anInt2264 = this.aClass206_1.anInt6259;
		this.anInt2271 = this.aClass206_1.anInt6268;
		this.anInt2282 = this.aClass206_1.anInt6256;
		if (this.anInt2271 == this.anInt2269 && this.anInt2262 == this.anInt2269 && this.anInt2266 == this.anInt2282 && this.anInt2264 == this.anInt2266 && this.anInt2258 == this.anInt2273 && this.anInt2281 == this.anInt2273) {
			this.aBoolean213 = true;
			return;
		}
		this.aBoolean213 = false;
		@Pc(119) int local119 = (this.anInt2262 + this.anInt2271 + this.anInt2269) / 3;
		@Pc(131) int local131 = (this.anInt2264 + this.anInt2282 + this.anInt2266) / 3;
		@Pc(143) int local143 = (this.anInt2258 + this.anInt2273 + this.anInt2281) / 3;
		if (this.anInt2276 == local119 && this.anInt2275 == local131 && this.anInt2263 == local143) {
			return;
		}
		this.anInt2276 = local119;
		this.anInt2275 = local131;
		this.anInt2263 = local143;
		@Pc(176) int local176 = this.anInt2269 - this.anInt2271;
		@Pc(183) int local183 = this.anInt2266 - this.anInt2282;
		@Pc(190) int local190 = this.anInt2273 - this.anInt2258;
		@Pc(197) int local197 = this.anInt2262 - this.anInt2271;
		@Pc(204) int local204 = this.anInt2264 - this.anInt2282;
		@Pc(211) int local211 = this.anInt2281 - this.anInt2258;
		this.anInt2260 = local190 * local197 - local176 * local211;
		this.anInt2259 = local183 * local211 - local204 * local190;
		this.anInt2257 = local176 * local204 - local197 * local183;
		while (this.anInt2259 > 32767 || this.anInt2260 > 32767 || this.anInt2257 > 32767 || this.anInt2259 < -32767 || this.anInt2260 < -32767 || this.anInt2257 < -32767) {
			this.anInt2259 >>= 0x1;
			this.anInt2257 >>= 0x1;
			this.anInt2260 >>= 0x1;
		}
		@Pc(316) int local316 = (int) Math.sqrt((double) (this.anInt2259 * this.anInt2259 + this.anInt2260 * this.anInt2260 + this.anInt2257 * this.anInt2257));
		if (local316 <= 0) {
			local316 = 1;
		}
		this.anInt2259 = this.anInt2259 * 32767 / local316;
		this.anInt2257 = this.anInt2257 * 32767 / local316;
		this.anInt2260 = this.anInt2260 * 32767 / local316;
		if (this.aClass177_1.aShort81 <= 0 && this.aClass177_1.aShort80 <= 0) {
			return;
		}
		@Pc(366) int local366 = (int) (Math.atan2((double) this.anInt2257, (double) this.anInt2259) * 2607.5945876176133D);
		@Pc(387) int local387 = (int) (Math.atan2((double) this.anInt2260, Math.sqrt((double) (this.anInt2257 * this.anInt2257 + this.anInt2259 * this.anInt2259))) * 2607.5945876176133D);
		this.anInt2270 = this.aClass177_1.aShort81 - this.aClass177_1.aShort82;
		this.anInt2272 = this.aClass177_1.aShort80 - this.aClass177_1.aShort79;
		this.anInt2278 = this.aClass177_1.aShort82 + local366 - (this.anInt2270 >> 1);
		this.anInt2255 = local387 + this.aClass177_1.aShort79 - (this.anInt2272 >> 1);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZLclient!uo;JII)V")
	public void method1957(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3) {
		@Pc(45) int local45;
		if (this.aBoolean212) {
			arg0 = false;
		} else if (this.aClass177_1.anInt5456 > Static327.anInt6280) {
			arg0 = false;
		} else if (Static219.anIntArray414[Static327.anInt6280] < Static74.anInt1952) {
			arg0 = false;
		} else if (this.aBoolean213) {
			arg0 = false;
		} else if (this.aClass177_1.anInt5451 != -1) {
			local45 = (int) (arg2 - this.aLong74);
			if (this.aClass177_1.aBoolean524 || this.aClass177_1.anInt5451 >= local45) {
				local45 %= this.aClass177_1.anInt5451;
			} else {
				arg0 = false;
			}
			if (!this.aClass177_1.aBoolean526 && local45 < this.aClass177_1.anInt5474) {
				arg0 = false;
			}
			if (this.aClass177_1.aBoolean526 && local45 >= this.aClass177_1.anInt5474) {
				arg0 = false;
			}
		}
		if (arg0) {
			this.anInt2283 += (int) ((double) arg3 * ((double) (this.aClass177_1.anInt5439 - this.aClass177_1.anInt5448) * Math.random() + (double) this.aClass177_1.anInt5448));
			if (this.anInt2283 > 63) {
				local45 = this.anInt2283 >> 6;
				this.anInt2283 &= 0x3F;
				for (@Pc(152) int local152 = 0; local152 < local45; local152++) {
					@Pc(208) int local208;
					@Pc(222) int local222;
					@Pc(218) int local218;
					@Pc(172) int local172;
					@Pc(180) int local180;
					@Pc(184) int local184;
					@Pc(194) int local194;
					@Pc(202) int local202;
					@Pc(212) int local212;
					if (this.aClass177_1.aShort81 <= 0 && this.aClass177_1.aShort80 <= 0) {
						local218 = this.anInt2257;
						local222 = this.anInt2260;
						local208 = this.anInt2259;
					} else {
						local172 = (int) ((double) this.anInt2270 * Math.random()) + this.anInt2278;
						@Pc(176) int local176 = local172 & 0x3FFF;
						local180 = Class1_Sub3_Sub8.anIntArray159[local176];
						local184 = Class1_Sub3_Sub8.anIntArray156[local176];
						local194 = (int) (Math.random() * (double) this.anInt2272) + this.anInt2255;
						@Pc(198) int local198 = local194 & 0x1FFF;
						local202 = Class1_Sub3_Sub8.anIntArray159[local198];
						local208 = local184 * local202 >> 15;
						local212 = Class1_Sub3_Sub8.anIntArray156[local198];
						local218 = local202 * local180 >> 15;
						local222 = local212 * -1;
					}
					local172 = (int) (Math.random() * 65535.0D);
					local180 = (int) (Math.random() * 65535.0D);
					if (local180 + local172 > 65535) {
						local172 = 65535 - local172;
						local180 = 65535 - local180;
					}
					local184 = 65535 - local172 - local180;
					local194 = this.anInt2271 * local172 + local180 * this.anInt2269 + local184 * this.anInt2262 >> 16;
					local202 = this.anInt2282 * local172 + local180 * this.anInt2266 + local184 * this.anInt2264 >> 16;
					local212 = this.anInt2281 * local184 + local180 * this.anInt2273 + this.anInt2258 * local172 >> 16;
					@Pc(334) int local334 = (int) ((double) (this.aClass177_1.anInt5426 - this.aClass177_1.anInt5462) * Math.random()) + this.aClass177_1.anInt5462;
					@Pc(351) int local351 = this.aClass177_1.anInt5441 + (int) ((double) (this.aClass177_1.anInt5463 - this.aClass177_1.anInt5441) * Math.random());
					@Pc(368) int local368 = (int) ((double) (this.aClass177_1.anInt5434 - this.aClass177_1.anInt5469) * Math.random()) + this.aClass177_1.anInt5469;
					@Pc(432) int local432;
					if (this.aClass177_1.aBoolean525) {
						@Pc(374) double local374 = Math.random();
						local432 = (int) ((double) this.aClass177_1.anInt5472 + (double) this.aClass177_1.anInt5429 * local374) << 24 | (int) ((double) this.aClass177_1.anInt5459 * local374 + (double) this.aClass177_1.anInt5467) | (int) ((double) this.aClass177_1.anInt5476 + local374 * (double) this.aClass177_1.anInt5464) << 8 | (int) ((double) this.aClass177_1.anInt5435 + (double) this.aClass177_1.anInt5427 * local374) << 16;
					} else {
						local432 = (int) (Math.random() * (double) this.aClass177_1.anInt5429 + (double) this.aClass177_1.anInt5472) << 24 | (int) ((double) this.aClass177_1.anInt5435 + (double) this.aClass177_1.anInt5427 * Math.random()) << 16 | (int) ((double) this.aClass177_1.anInt5464 * Math.random() + (double) this.aClass177_1.anInt5476) << 8 | (int) ((double) this.aClass177_1.anInt5467 + Math.random() * (double) this.aClass177_1.anInt5459);
					}
					@Pc(496) int local496 = this.aClass177_1.anInt5475;
					if (!arg1.method2192() && !this.aClass177_1.aBoolean528) {
						local496 = -1;
					}
					if (Static166.anInt3592 == Static230.anInt4755) {
						new Class8_Sub2_Sub1_Sub1(this, local194, local202, local212, local208, local222, local218, local334, local351, local432, local368, local496, this.aClass177_1.aBoolean527);
					} else {
						@Pc(516) Class8_Sub2_Sub1_Sub1 local516 = Static324.aClass8_Sub2_Sub1_Sub1Array2[Static166.anInt3592];
						Static166.anInt3592 = Static166.anInt3592 + 1 & 0x3FF;
						local516.method893(this, local194, local202, local212, local208, local222, local218, local334, local351, local432, local368, local496, this.aClass177_1.aBoolean527);
					}
				}
			}
		}
		this.anInt2265 = 0;
		for (@Pc(573) Class8_Sub2_Sub1_Sub1 local573 = (Class8_Sub2_Sub1_Sub1) this.aClass217_3.method5683(); local573 != null; local573 = (Class8_Sub2_Sub1_Sub1) this.aClass217_3.method5679()) {
			local573.method892(arg2, arg3);
			this.anInt2265++;
		}
		Static355.anInt6768 += this.anInt2265;
	}
}
