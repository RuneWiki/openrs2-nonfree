import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class111_Sub7 extends Class111 {

	@OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
	private int anInt6402;

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
	private int anInt6404;

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
	private int anInt6405;

	@OriginalMember(owner = "client!tq", name = "m", descriptor = "I")
	private int anInt6406;

	@OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
	private int anInt6407;

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "I")
	private int anInt6408;

	@OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
	private int anInt6409;

	@OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
	private int anInt6410;

	@OriginalMember(owner = "client!tq", name = "t", descriptor = "I")
	private int anInt6411;

	@OriginalMember(owner = "client!tq", name = "u", descriptor = "I")
	public int anInt6412;

	@OriginalMember(owner = "client!tq", name = "y", descriptor = "I")
	private int anInt6414;

	@OriginalMember(owner = "client!tq", name = "B", descriptor = "I")
	private int anInt6416;

	@OriginalMember(owner = "client!tq", name = "D", descriptor = "I")
	private int anInt6417;

	@OriginalMember(owner = "client!tq", name = "E", descriptor = "I")
	private int anInt6418;

	@OriginalMember(owner = "client!tq", name = "F", descriptor = "I")
	public int anInt6419;

	@OriginalMember(owner = "client!tq", name = "G", descriptor = "I")
	public int anInt6420;

	@OriginalMember(owner = "client!tq", name = "H", descriptor = "I")
	private int anInt6421;

	@OriginalMember(owner = "client!tq", name = "L", descriptor = "I")
	private int anInt6423;

	@OriginalMember(owner = "client!tq", name = "M", descriptor = "I")
	public int anInt6424;

	@OriginalMember(owner = "client!tq", name = "N", descriptor = "I")
	private int anInt6425;

	@OriginalMember(owner = "client!tq", name = "r", descriptor = "Z")
	public boolean aBoolean562 = false;

	@OriginalMember(owner = "client!tq", name = "x", descriptor = "I")
	private int anInt6413 = 0;

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "Z")
	private boolean aBoolean561 = false;

	@OriginalMember(owner = "client!tq", name = "v", descriptor = "Lclient!lm;")
	public final Class111_Sub4 aClass111_Sub4_5;

	@OriginalMember(owner = "client!tq", name = "w", descriptor = "J")
	private final long aLong214;

	@OriginalMember(owner = "client!tq", name = "J", descriptor = "Lclient!ck;")
	public final Class40 aClass40_2;

	@OriginalMember(owner = "client!tq", name = "z", descriptor = "Lclient!ui;")
	public Class250 aClass250_1;

	@OriginalMember(owner = "client!tq", name = "s", descriptor = "Lclient!dv;")
	public final Class63 aClass63_8;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!za;Lclient!ck;Lclient!lm;J)V")
	public Class111_Sub7(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) Class111_Sub4 arg2, @OriginalArg(3) long arg3) {
		this.aClass111_Sub4_5 = arg2;
		this.aLong214 = arg3;
		this.aClass40_2 = arg1;
		this.aClass250_1 = this.aClass40_2.method698();
		if (!arg0.method5697() && this.aClass250_1.anInt6591 != -1) {
			this.aClass250_1 = Static377.method4868(this.aClass250_1.anInt6591);
		}
		this.aClass63_8 = new Class63();
		this.anInt6413 = (int) ((double) this.anInt6413 + Math.random() * 64.0D);
		this.method5174();
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(JZILclient!za;Z)V")
	public void method5171(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class117 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(50) int local50;
		if (this.aBoolean562) {
			arg3 = false;
		} else if (Static306.anInt5095 < this.aClass250_1.anInt6576) {
			arg3 = false;
		} else if (Static43.anIntArray546[Static306.anInt5095] < Static462.anInt7417) {
			arg3 = false;
		} else if (this.aBoolean561) {
			arg3 = false;
		} else if (this.aClass250_1.anInt6578 != -1) {
			local50 = (int) (arg0 - this.aLong214);
			if (this.aClass250_1.aBoolean577 || local50 <= this.aClass250_1.anInt6578) {
				local50 %= this.aClass250_1.anInt6578;
			} else {
				arg3 = false;
			}
			if (!this.aClass250_1.aBoolean580 && this.aClass250_1.anInt6606 > local50) {
				arg3 = false;
			}
			if (this.aClass250_1.aBoolean580 && local50 >= this.aClass250_1.anInt6606) {
				arg3 = false;
			}
		}
		if (arg3) {
			this.anInt6413 += (int) (((double) this.aClass250_1.anInt6618 + Math.random() * (double) (this.aClass250_1.lb - this.aClass250_1.anInt6618)) * (double) arg1);
			if (this.anInt6413 > 63) {
				local50 = this.anInt6413 >> 6;
				this.anInt6413 &= 0x3F;
				for (@Pc(157) int local157 = 0; local157 < local50; local157++) {
					@Pc(179) int local179;
					@Pc(182) int local182;
					@Pc(176) int local176;
					@Pc(195) int local195;
					@Pc(203) int local203;
					@Pc(207) int local207;
					@Pc(217) int local217;
					@Pc(225) int local225;
					@Pc(229) int local229;
					if (this.aClass250_1.aShort112 <= 0 && this.aClass250_1.aShort111 <= 0) {
						local176 = this.anInt6425;
						local179 = this.anInt6407;
						local182 = this.anInt6421;
					} else {
						local195 = this.anInt6418 + (int) ((double) this.anInt6423 * Math.random());
						@Pc(199) int local199 = local195 & 0x3FFF;
						local203 = Class1_Sub29.anIntArray537[local199];
						local207 = Class1_Sub29.anIntArray536[local199];
						local217 = (int) ((double) this.anInt6411 * Math.random()) + this.anInt6410;
						@Pc(221) int local221 = local217 & 0x1FFF;
						local225 = Class1_Sub29.anIntArray537[local221];
						local229 = Class1_Sub29.anIntArray536[local221];
						local182 = (local229 << 0) * -1;
						local179 = local225 * local207 >> 15;
						local176 = local225 * local203 >> 15;
					}
					local195 = (int) (Math.random() * 65535.0D);
					local203 = (int) (Math.random() * 65535.0D);
					if (local195 + local203 > 65535) {
						local195 = 65535 - local195;
						local203 = 65535 - local203;
					}
					local207 = 65535 - local195 - local203;
					local217 = (int) ((long) local195 * (long) this.anInt6409 + (long) local203 * (long) this.anInt6417 + (long) local207 * (long) this.anInt6402 >> 16);
					local225 = (int) ((long) local207 * (long) this.anInt6405 + (long) local203 * (long) this.anInt6404 + (long) this.anInt6414 * (long) local195 >> 16);
					local229 = (int) ((long) this.anInt6408 * (long) local207 + (long) this.anInt6416 * (long) local195 + (long) local203 * (long) this.anInt6406 >> 16);
					@Pc(372) int local372 = (int) ((double) (this.aClass250_1.anInt6610 - this.aClass250_1.anInt6574) * Math.random()) + this.aClass250_1.anInt6574;
					@Pc(388) int local388 = (int) (Math.random() * (double) (this.aClass250_1.anInt6572 - this.aClass250_1.anInt6593)) + this.aClass250_1.anInt6593;
					@Pc(405) int local405 = this.aClass250_1.anInt6575 + (int) ((double) (this.aClass250_1.anInt6613 - this.aClass250_1.anInt6575) * Math.random());
					@Pc(467) int local467;
					if (this.aClass250_1.aBoolean581) {
						@Pc(471) double local471 = Math.random();
						local467 = (int) ((double) this.aClass250_1.anInt6598 + local471 * (double) this.aClass250_1.anInt6597) | (int) ((double) this.aClass250_1.anInt6582 * local471 + (double) this.aClass250_1.anInt6588) << 8 | (int) ((double) this.aClass250_1.anInt6581 + (double) this.aClass250_1.anInt6594 * local471) << 16 | (int) ((double) this.aClass250_1.anInt6608 + (double) this.aClass250_1.anInt6584 * Math.random()) << 24;
					} else {
						local467 = (int) (Math.random() * (double) this.aClass250_1.anInt6584 + (double) this.aClass250_1.anInt6608) << 24 | (int) ((double) this.aClass250_1.anInt6597 * Math.random() + (double) this.aClass250_1.anInt6598) | (int) (Math.random() * (double) this.aClass250_1.anInt6594 + (double) this.aClass250_1.anInt6581) << 16 | (int) (Math.random() * (double) this.aClass250_1.anInt6582 + (double) this.aClass250_1.anInt6588) << 8;
					}
					@Pc(533) int local533 = this.aClass250_1.anInt6569;
					if (!arg2.method5697() && !this.aClass250_1.aBoolean579) {
						local533 = -1;
					}
					if (Static388.anInt6814 == Static221.anInt4063) {
						new Class111_Sub1_Sub2_Sub1(this, local217, local225, local229, local179, local182, local176, local372, local388, local467, local405, local533, this.aClass250_1.aBoolean576, this.aClass250_1.aBoolean578);
					} else {
						@Pc(553) Class111_Sub1_Sub2_Sub1 local553 = Static65.aClass111_Sub1_Sub2_Sub1Array1[Static221.anInt4063];
						Static221.anInt4063 = Static221.anInt4063 + 1 & 0x3FF;
						local553.method5266(this, local217, local225, local229, local179, local182, local176, local372, local388, local467, local405, local533, this.aClass250_1.aBoolean576, this.aClass250_1.aBoolean578);
					}
				}
			}
		}
		this.anInt6424 = 0;
		for (@Pc(620) Class111_Sub1_Sub2_Sub1 local620 = (Class111_Sub1_Sub2_Sub1) this.aClass63_8.method1019(); local620 != null; local620 = (Class111_Sub1_Sub2_Sub1) this.aClass63_8.method1022()) {
			local620.method5265(arg0, arg1);
			this.anInt6424++;
		}
		Static374.anInt6023 += this.anInt6424;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(JI)V")
	public void method5173(@OriginalArg(0) long arg0) {
		for (@Pc(16) Class111_Sub1_Sub2_Sub1 local16 = (Class111_Sub1_Sub2_Sub1) this.aClass63_8.method1019(); local16 != null; local16 = (Class111_Sub1_Sub2_Sub1) this.aClass63_8.method1022()) {
			local16.method5267(arg0);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
	public void method5174() {
		this.anInt6414 = this.aClass40_2.anInt768;
		this.anInt6409 = this.aClass40_2.anInt760;
		this.anInt6404 = this.aClass40_2.anInt761;
		this.anInt6416 = this.aClass40_2.anInt759;
		this.anInt6408 = this.aClass40_2.anInt767;
		this.anInt6417 = this.aClass40_2.anInt766;
		this.anInt6402 = this.aClass40_2.anInt762;
		this.anInt6406 = this.aClass40_2.anInt769;
		this.anInt6405 = this.aClass40_2.anInt763;
		if (this.anInt6409 == this.anInt6417 && this.anInt6417 == this.anInt6402 && this.anInt6414 == this.anInt6404 && this.anInt6404 == this.anInt6405 && this.anInt6406 == this.anInt6416 && this.anInt6408 == this.anInt6406) {
			this.aBoolean561 = true;
			return;
		}
		this.aBoolean561 = false;
		@Pc(114) int local114 = (this.anInt6402 + this.anInt6417 + this.anInt6409) / 3;
		@Pc(126) int local126 = (this.anInt6405 + this.anInt6414 + this.anInt6404) / 3;
		@Pc(137) int local137 = (this.anInt6406 + this.anInt6416 + this.anInt6408) / 3;
		if (this.anInt6419 == local114 && this.anInt6420 == local126 && this.anInt6412 == local137) {
			return;
		}
		this.anInt6412 = local137;
		this.anInt6420 = local126;
		this.anInt6419 = local114;
		@Pc(176) int local176 = this.anInt6417 - this.anInt6409;
		@Pc(183) int local183 = this.anInt6404 - this.anInt6414;
		@Pc(190) int local190 = this.anInt6406 - this.anInt6416;
		@Pc(197) int local197 = this.anInt6402 - this.anInt6409;
		@Pc(203) int local203 = this.anInt6405 - this.anInt6414;
		@Pc(209) int local209 = this.anInt6408 - this.anInt6416;
		this.anInt6407 = local209 * local183 - local203 * local190;
		this.anInt6421 = local197 * local190 - local209 * local176;
		for (this.anInt6425 = local176 * local203 - local183 * local197; this.anInt6407 > 32767 || this.anInt6421 > 32767 || this.anInt6425 > 32767 || this.anInt6407 < -32767 || this.anInt6421 < -32767 || this.anInt6425 < -32767; this.anInt6425 >>= 0x1) {
			this.anInt6407 >>= 0x1;
			this.anInt6421 >>= 0x1;
		}
		@Pc(307) int local307 = (int) Math.sqrt((double) (this.anInt6407 * this.anInt6407 + this.anInt6421 * this.anInt6421 + this.anInt6425 * this.anInt6425));
		if (local307 <= 0) {
			local307 = 1;
		}
		this.anInt6421 = this.anInt6421 * 32767 / local307;
		this.anInt6407 = this.anInt6407 * 32767 / local307;
		this.anInt6425 = this.anInt6425 * 32767 / local307;
		if (this.aClass250_1.aShort112 <= 0 && this.aClass250_1.aShort111 <= 0) {
			return;
		}
		@Pc(354) int local354 = (int) (Math.atan2((double) this.anInt6425, (double) this.anInt6407) * 2607.5945876176133D);
		@Pc(375) int local375 = (int) (Math.atan2((double) this.anInt6421, Math.sqrt((double) (this.anInt6407 * this.anInt6407 + this.anInt6425 * this.anInt6425))) * 2607.5945876176133D);
		this.anInt6423 = this.aClass250_1.aShort112 - this.aClass250_1.aShort110;
		this.anInt6418 = this.aClass250_1.aShort110 + local354 - (this.anInt6423 >> 1);
		this.anInt6411 = this.aClass250_1.aShort111 - this.aClass250_1.aShort113;
		this.anInt6410 = local375 + this.aClass250_1.aShort113 - (this.anInt6411 >> 1);
	}
}
