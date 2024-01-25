import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class36_Sub6 extends Class36 {

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
	public int anInt5286;

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
	public int anInt5287;

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
	private int anInt5288;

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
	private int anInt5290;

	@OriginalMember(owner = "client!pq", name = "q", descriptor = "I")
	public int anInt5291;

	@OriginalMember(owner = "client!pq", name = "s", descriptor = "I")
	private int anInt5292;

	@OriginalMember(owner = "client!pq", name = "v", descriptor = "I")
	private int anInt5294;

	@OriginalMember(owner = "client!pq", name = "w", descriptor = "I")
	private int anInt5295;

	@OriginalMember(owner = "client!pq", name = "x", descriptor = "I")
	private int anInt5296;

	@OriginalMember(owner = "client!pq", name = "y", descriptor = "I")
	private int anInt5297;

	@OriginalMember(owner = "client!pq", name = "z", descriptor = "I")
	private int anInt5298;

	@OriginalMember(owner = "client!pq", name = "A", descriptor = "I")
	private int anInt5299;

	@OriginalMember(owner = "client!pq", name = "B", descriptor = "I")
	private int anInt5300;

	@OriginalMember(owner = "client!pq", name = "C", descriptor = "I")
	private int anInt5301;

	@OriginalMember(owner = "client!pq", name = "E", descriptor = "I")
	private int anInt5302;

	@OriginalMember(owner = "client!pq", name = "F", descriptor = "I")
	private int anInt5303;

	@OriginalMember(owner = "client!pq", name = "L", descriptor = "I")
	private int anInt5305;

	@OriginalMember(owner = "client!pq", name = "O", descriptor = "I")
	private int anInt5307;

	@OriginalMember(owner = "client!pq", name = "Q", descriptor = "I")
	public int anInt5308;

	@OriginalMember(owner = "client!pq", name = "R", descriptor = "I")
	private int anInt5309;

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "I")
	private int anInt5293 = 0;

	@OriginalMember(owner = "client!pq", name = "D", descriptor = "Z")
	public boolean aBoolean426 = false;

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "Z")
	private boolean aBoolean425 = false;

	@OriginalMember(owner = "client!pq", name = "H", descriptor = "Lclient!rb;")
	public final Class36_Sub7 aClass36_Sub7_5;

	@OriginalMember(owner = "client!pq", name = "P", descriptor = "J")
	private final long aLong158;

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "Lclient!qr;")
	public final Class203 aClass203_1;

	@OriginalMember(owner = "client!pq", name = "J", descriptor = "Lclient!rm;")
	public Class210 aClass210_1;

	@OriginalMember(owner = "client!pq", name = "M", descriptor = "Lclient!uj;")
	public final Class242 aClass242_5;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!qa;Lclient!qr;Lclient!rb;J)V")
	public Class36_Sub6(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) Class36_Sub7 arg2, @OriginalArg(3) long arg3) {
		this.aClass36_Sub7_5 = arg2;
		this.aLong158 = arg3;
		this.aClass203_1 = arg1;
		this.aClass210_1 = this.aClass203_1.method4788();
		if (!arg0.method4581() && this.aClass210_1.anInt6365 != -1) {
			this.aClass210_1 = Static23.method322(this.aClass210_1.anInt6365);
		}
		this.aClass242_5 = new Class242();
		this.anInt5293 = (int) ((double) this.anInt5293 + Math.random() * 64.0D);
		this.method4278();
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)V")
	public void method4278() {
		this.anInt5305 = this.aClass203_1.anInt6045;
		this.anInt5299 = this.aClass203_1.anInt6041;
		this.anInt5297 = this.aClass203_1.anInt6047;
		this.anInt5295 = this.aClass203_1.anInt6044;
		this.anInt5298 = this.aClass203_1.anInt6051;
		this.anInt5300 = this.aClass203_1.anInt6046;
		this.anInt5303 = this.aClass203_1.anInt6052;
		this.anInt5301 = this.aClass203_1.anInt6053;
		this.anInt5307 = this.aClass203_1.anInt6040;
		if (this.anInt5301 == this.anInt5298 && this.anInt5295 == this.anInt5298 && this.anInt5305 == this.anInt5307 && this.anInt5307 == this.anInt5303 && this.anInt5297 == this.anInt5300 && this.anInt5299 == this.anInt5297) {
			this.aBoolean425 = true;
			return;
		}
		this.aBoolean425 = false;
		@Pc(116) int local116 = (this.anInt5298 + this.anInt5301 + this.anInt5295) / 3;
		@Pc(127) int local127 = (this.anInt5303 + this.anInt5307 + this.anInt5305) / 3;
		@Pc(139) int local139 = (this.anInt5300 + this.anInt5297 + this.anInt5299) / 3;
		if (local116 == this.anInt5308 && this.anInt5286 == local127 && local139 == this.anInt5291) {
			return;
		}
		this.anInt5291 = local139;
		this.anInt5286 = local127;
		this.anInt5308 = local116;
		@Pc(176) int local176 = this.anInt5298 - this.anInt5301;
		@Pc(183) int local183 = this.anInt5307 - this.anInt5305;
		@Pc(190) int local190 = this.anInt5297 - this.anInt5300;
		@Pc(197) int local197 = this.anInt5295 - this.anInt5301;
		@Pc(204) int local204 = this.anInt5303 - this.anInt5305;
		@Pc(211) int local211 = this.anInt5299 - this.anInt5300;
		this.anInt5292 = local190 * local197 - local211 * local176;
		this.anInt5294 = local176 * local204 - local183 * local197;
		this.anInt5309 = local183 * local211 - local190 * local204;
		while (this.anInt5309 > 32767 || this.anInt5292 > 32767 || this.anInt5294 > 32767 || this.anInt5309 < -32767 || this.anInt5292 < -32767 || this.anInt5294 < -32767) {
			this.anInt5309 >>= 0x1;
			this.anInt5292 >>= 0x1;
			this.anInt5294 >>= 0x1;
		}
		@Pc(311) int local311 = (int) Math.sqrt((double) (this.anInt5292 * this.anInt5292 + this.anInt5309 * this.anInt5309 + this.anInt5294 * this.anInt5294));
		if (local311 <= 0) {
			local311 = 1;
		}
		this.anInt5309 = this.anInt5309 * 32767 / local311;
		this.anInt5292 = this.anInt5292 * 32767 / local311;
		this.anInt5294 = this.anInt5294 * 32767 / local311;
		if (this.aClass210_1.aShort96 <= 0 && this.aClass210_1.aShort97 <= 0) {
			return;
		}
		@Pc(364) int local364 = (int) (Math.atan2((double) this.anInt5294, (double) this.anInt5309) * 2607.5945876176133D);
		@Pc(385) int local385 = (int) (Math.atan2((double) this.anInt5292, Math.sqrt((double) (this.anInt5294 * this.anInt5294 + this.anInt5309 * this.anInt5309))) * 2607.5945876176133D);
		this.anInt5288 = this.aClass210_1.aShort96 - this.aClass210_1.aShort98;
		this.anInt5290 = this.aClass210_1.aShort98 + local364 - (this.anInt5288 >> 1);
		this.anInt5296 = this.aClass210_1.aShort97 - this.aClass210_1.aShort95;
		this.anInt5302 = local385 + this.aClass210_1.aShort95 - (this.anInt5296 >> 1);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(JI)V")
	public void method4279(@OriginalArg(0) long arg0) {
		for (@Pc(17) Class36_Sub3_Sub1_Sub1 local17 = (Class36_Sub3_Sub1_Sub1) this.aClass242_5.method5503(); local17 != null; local17 = (Class36_Sub3_Sub1_Sub1) this.aClass242_5.method5506()) {
			local17.method1675(arg0);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(JIZILclient!qa;)V")
	public void method4280(@OriginalArg(0) long arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class121 arg3) {
		@Pc(38) int local38;
		if (this.aBoolean426) {
			arg1 = false;
		} else if (Static346.anInt6353 < this.aClass210_1.anInt6404) {
			arg1 = false;
		} else if (Static255.anIntArray347[Static346.anInt6353] < Static296.anInt4975) {
			arg1 = false;
		} else if (this.aBoolean425) {
			arg1 = false;
		} else if (this.aClass210_1.anInt6394 != -1) {
			local38 = (int) (arg0 - this.aLong158);
			if (this.aClass210_1.aBoolean516 || local38 <= this.aClass210_1.anInt6394) {
				local38 %= this.aClass210_1.anInt6394;
			} else {
				arg1 = false;
			}
			if (!this.aClass210_1.aBoolean519 && this.aClass210_1.anInt6412 > local38) {
				arg1 = false;
			}
			if (this.aClass210_1.aBoolean519 && local38 >= this.aClass210_1.anInt6412) {
				arg1 = false;
			}
		}
		if (arg1) {
			this.anInt5293 += (int) ((double) arg2 * (Math.random() * (double) (this.aClass210_1.anInt6414 - this.aClass210_1.anInt6409) + (double) this.aClass210_1.anInt6409));
			if (this.anInt5293 > 63) {
				local38 = this.anInt5293 >> 6;
				this.anInt5293 &= 0x3F;
				for (@Pc(160) int local160 = 0; local160 < local38; local160++) {
					@Pc(228) int local228;
					@Pc(234) int local234;
					@Pc(240) int local240;
					@Pc(186) int local186;
					@Pc(194) int local194;
					@Pc(198) int local198;
					@Pc(208) int local208;
					@Pc(216) int local216;
					@Pc(220) int local220;
					if (this.aClass210_1.aShort96 <= 0 && this.aClass210_1.aShort97 <= 0) {
						local228 = this.anInt5309;
						local240 = this.anInt5294;
						local234 = this.anInt5292;
					} else {
						local186 = (int) (Math.random() * (double) this.anInt5288) + this.anInt5290;
						@Pc(190) int local190 = local186 & 0x3FFF;
						local194 = Class262.anIntArray575[local190];
						local198 = Class262.anIntArray576[local190];
						local208 = (int) (Math.random() * (double) this.anInt5296) + this.anInt5302;
						@Pc(212) int local212 = local208 & 0x1FFF;
						local216 = Class262.anIntArray575[local212];
						local220 = Class262.anIntArray576[local212];
						local228 = local198 * local216 >> 15;
						local234 = (local220 << 0) * -1;
						local240 = local194 * local216 >> 15;
					}
					local186 = (int) (Math.random() * 65535.0D);
					local194 = (int) (Math.random() * 65535.0D);
					if (local194 + local186 > 65535) {
						local194 = 65535 - local194;
						local186 = 65535 - local186;
					}
					local198 = 65535 - local194 - local186;
					local208 = this.anInt5295 * local198 + this.anInt5298 * local194 + local186 * this.anInt5301 >> 16;
					local216 = local186 * this.anInt5305 + local194 * this.anInt5307 + local198 * this.anInt5303 >> 16;
					local220 = this.anInt5300 * local186 + this.anInt5297 * local194 + local198 * this.anInt5299 >> 16;
					@Pc(356) int local356 = (int) (Math.random() * (double) (this.aClass210_1.anInt6397 - this.aClass210_1.anInt6366)) + this.aClass210_1.anInt6366;
					@Pc(374) int local374 = this.aClass210_1.anInt6367 + (int) (Math.random() * (double) (this.aClass210_1.anInt6408 - this.aClass210_1.anInt6367));
					@Pc(390) int local390 = (int) (Math.random() * (double) (this.aClass210_1.anInt6389 - this.aClass210_1.lb)) + this.aClass210_1.lb;
					@Pc(454) int local454;
					if (this.aClass210_1.aBoolean520) {
						@Pc(396) double local396 = Math.random();
						local454 = (int) ((double) this.aClass210_1.anInt6415 + (double) this.aClass210_1.anInt6371 * local396) | (int) ((double) this.aClass210_1.anInt6399 + (double) this.aClass210_1.anInt6377 * local396) << 8 | (int) (local396 * (double) this.aClass210_1.anInt6374 + (double) this.aClass210_1.anInt6383) << 16 | (int) (Math.random() * (double) this.aClass210_1.anInt6368 + (double) this.aClass210_1.anInt6405) << 24;
					} else {
						local454 = (int) ((double) this.aClass210_1.anInt6399 + (double) this.aClass210_1.anInt6377 * Math.random()) << 8 | (int) ((double) this.aClass210_1.anInt6383 + (double) this.aClass210_1.anInt6374 * Math.random()) << 16 | (int) ((double) this.aClass210_1.anInt6371 * Math.random() + (double) this.aClass210_1.anInt6415) | (int) ((double) this.aClass210_1.anInt6405 + Math.random() * (double) this.aClass210_1.anInt6368) << 24;
					}
					@Pc(518) int local518 = this.aClass210_1.anInt6370;
					if (!arg3.method4581() && !this.aClass210_1.aBoolean515) {
						local518 = -1;
					}
					if (Static336.anInt6116 == Static72.anInt1368) {
						new Class36_Sub3_Sub1_Sub1(this, local208, local216, local220, local228, local234, local240, local356, local374, local454, local390, local518, this.aClass210_1.aBoolean517, this.aClass210_1.aBoolean518);
					} else {
						@Pc(558) Class36_Sub3_Sub1_Sub1 local558 = Static220.aClass36_Sub3_Sub1_Sub1Array2[Static72.anInt1368];
						Static72.anInt1368 = Static72.anInt1368 + 1 & 0x3FF;
						local558.method1677(this, local208, local216, local220, local228, local234, local240, local356, local374, local454, local390, local518, this.aClass210_1.aBoolean517, this.aClass210_1.aBoolean518);
					}
				}
			}
		}
		this.anInt5287 = 0;
		for (@Pc(597) Class36_Sub3_Sub1_Sub1 local597 = (Class36_Sub3_Sub1_Sub1) this.aClass242_5.method5503(); local597 != null; local597 = (Class36_Sub3_Sub1_Sub1) this.aClass242_5.method5506()) {
			local597.method1674(arg0, arg2);
			this.anInt5287++;
		}
		Static361.anInt6591 += this.anInt5287;
	}
}
