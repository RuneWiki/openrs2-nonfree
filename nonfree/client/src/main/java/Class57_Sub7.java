import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class57_Sub7 extends Class57 {

	@OriginalMember(owner = "client!mq", name = "k", descriptor = "I")
	public int anInt4542;

	@OriginalMember(owner = "client!mq", name = "l", descriptor = "I")
	private int anInt4543;

	@OriginalMember(owner = "client!mq", name = "q", descriptor = "I")
	private int anInt4546;

	@OriginalMember(owner = "client!mq", name = "r", descriptor = "I")
	private int anInt4547;

	@OriginalMember(owner = "client!mq", name = "s", descriptor = "I")
	public int anInt4548;

	@OriginalMember(owner = "client!mq", name = "u", descriptor = "I")
	private int anInt4550;

	@OriginalMember(owner = "client!mq", name = "y", descriptor = "I")
	private int anInt4551;

	@OriginalMember(owner = "client!mq", name = "z", descriptor = "I")
	private int anInt4552;

	@OriginalMember(owner = "client!mq", name = "B", descriptor = "I")
	private int anInt4553;

	@OriginalMember(owner = "client!mq", name = "C", descriptor = "I")
	public int anInt4554;

	@OriginalMember(owner = "client!mq", name = "D", descriptor = "I")
	private int anInt4555;

	@OriginalMember(owner = "client!mq", name = "E", descriptor = "I")
	private int anInt4556;

	@OriginalMember(owner = "client!mq", name = "F", descriptor = "I")
	private int anInt4557;

	@OriginalMember(owner = "client!mq", name = "G", descriptor = "I")
	private int anInt4558;

	@OriginalMember(owner = "client!mq", name = "H", descriptor = "I")
	private int anInt4559;

	@OriginalMember(owner = "client!mq", name = "J", descriptor = "I")
	private int anInt4560;

	@OriginalMember(owner = "client!mq", name = "L", descriptor = "I")
	private int anInt4562;

	@OriginalMember(owner = "client!mq", name = "M", descriptor = "I")
	private int anInt4563;

	@OriginalMember(owner = "client!mq", name = "P", descriptor = "I")
	private int anInt4566;

	@OriginalMember(owner = "client!mq", name = "Q", descriptor = "I")
	public int anInt4567;

	@OriginalMember(owner = "client!mq", name = "x", descriptor = "Z")
	private boolean aBoolean395 = false;

	@OriginalMember(owner = "client!mq", name = "p", descriptor = "Z")
	public boolean aBoolean394 = false;

	@OriginalMember(owner = "client!mq", name = "t", descriptor = "I")
	private int anInt4549 = 0;

	@OriginalMember(owner = "client!mq", name = "v", descriptor = "Lclient!mk;")
	public final Class57_Sub6 aClass57_Sub6_3;

	@OriginalMember(owner = "client!mq", name = "A", descriptor = "Lclient!tr;")
	public final Class197 aClass197_1;

	@OriginalMember(owner = "client!mq", name = "I", descriptor = "J")
	private final long aLong137;

	@OriginalMember(owner = "client!mq", name = "w", descriptor = "Lclient!gg;")
	public Class78 aClass78_1;

	@OriginalMember(owner = "client!mq", name = "o", descriptor = "Lclient!tm;")
	public final Class193 aClass193_7;

	static {
		new Class140("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!dr;Lclient!tr;Lclient!mk;J)V")
	public Class57_Sub7(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class197 arg1, @OriginalArg(2) Class57_Sub6 arg2, @OriginalArg(3) long arg3) {
		this.aClass57_Sub6_3 = arg2;
		this.aClass197_1 = arg1;
		this.aLong137 = arg3;
		this.aClass78_1 = Static124.method2399(this.aClass197_1.anInt6256);
		if (!arg0.method3695() && this.aClass78_1.anInt2259 != -1) {
			this.aClass78_1 = Static124.method2399(this.aClass78_1.anInt2259);
		}
		this.aClass193_7 = new Class193();
		this.anInt4549 = (int) ((double) this.anInt4549 + Math.random() * 64.0D);
		this.method3942();
	}

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "(B)V")
	public void method3942() {
		this.anInt4560 = this.aClass197_1.anInt6246;
		this.anInt4559 = this.aClass197_1.anInt6242;
		this.anInt4557 = this.aClass197_1.anInt6239;
		this.anInt4547 = this.aClass197_1.anInt6254;
		this.anInt4555 = this.aClass197_1.anInt6244;
		this.anInt4546 = this.aClass197_1.anInt6247;
		this.anInt4552 = this.aClass197_1.anInt6252;
		this.anInt4543 = this.aClass197_1.anInt6240;
		this.anInt4556 = this.aClass197_1.anInt6253;
		if (this.anInt4557 == this.anInt4559 && this.anInt4557 == this.anInt4546 && this.anInt4555 == this.anInt4560 && this.anInt4560 == this.anInt4552 && this.anInt4543 == this.anInt4547 && this.anInt4547 == this.anInt4556) {
			this.aBoolean395 = true;
			return;
		}
		this.aBoolean395 = false;
		@Pc(120) int local120 = (this.anInt4557 + this.anInt4559 + this.anInt4546) / 3;
		@Pc(132) int local132 = (this.anInt4552 + this.anInt4555 + this.anInt4560) / 3;
		@Pc(145) int local145 = (this.anInt4543 + this.anInt4547 + this.anInt4556) / 3;
		if (local120 == this.anInt4554 && this.anInt4567 == local132 && local145 == this.anInt4542) {
			return;
		}
		this.anInt4542 = local145;
		this.anInt4567 = local132;
		this.anInt4554 = local120;
		@Pc(173) int local173 = this.anInt4557 - this.anInt4559;
		@Pc(180) int local180 = this.anInt4560 - this.anInt4555;
		@Pc(187) int local187 = this.anInt4547 - this.anInt4543;
		@Pc(194) int local194 = this.anInt4546 - this.anInt4559;
		@Pc(200) int local200 = this.anInt4552 - this.anInt4555;
		@Pc(207) int local207 = this.anInt4556 - this.anInt4543;
		this.anInt4551 = local194 * local187 - local207 * local173;
		this.anInt4553 = local180 * local207 - local200 * local187;
		this.anInt4550 = local173 * local200 - local194 * local180;
		while (this.anInt4553 > 32767 || this.anInt4551 > 32767 || this.anInt4550 > 32767 || this.anInt4553 < -32767 || this.anInt4551 < -32767 || this.anInt4550 < -32767) {
			this.anInt4551 >>= 0x1;
			this.anInt4550 >>= 0x1;
			this.anInt4553 >>= 0x1;
		}
		@Pc(306) int local306 = (int) Math.sqrt((double) (this.anInt4550 * this.anInt4550 + this.anInt4553 * this.anInt4553 + this.anInt4551 * this.anInt4551));
		if (local306 <= 0) {
			local306 = 1;
		}
		this.anInt4551 = this.anInt4551 * 32767 / local306;
		this.anInt4553 = this.anInt4553 * 32767 / local306;
		this.anInt4550 = this.anInt4550 * 32767 / local306;
		if (this.aClass78_1.aShort36 <= 0 && this.aClass78_1.aShort39 <= 0) {
			return;
		}
		@Pc(359) int local359 = (int) (Math.atan2((double) this.anInt4550, (double) this.anInt4553) * 2607.5945876176133D);
		@Pc(381) int local381 = (int) (Math.atan2((double) this.anInt4551, Math.sqrt((double) (this.anInt4553 * this.anInt4553 + this.anInt4550 * this.anInt4550))) * 2607.5945876176133D);
		this.anInt4562 = this.aClass78_1.aShort36 - this.aClass78_1.aShort38;
		this.anInt4563 = this.aClass78_1.aShort38 + local359 - (this.anInt4562 >> 1);
		this.anInt4558 = this.aClass78_1.aShort39 - this.aClass78_1.aShort37;
		this.anInt4566 = local381 + this.aClass78_1.aShort37 - (this.anInt4558 >> 1);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(JZLclient!dr;ZI)V")
	public void method3943(@OriginalArg(0) long arg0, @OriginalArg(2) Class37 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(33) int local33;
		if (this.aBoolean394) {
			arg2 = false;
		} else if (Static16.anInt274 < this.aClass78_1.anInt2247) {
			arg2 = false;
		} else if (Static341.anInt465 > Static328.anIntArray510[Static16.anInt274]) {
			arg2 = false;
		} else if (this.aBoolean395) {
			arg2 = false;
		} else if (this.aClass78_1.anInt2235 != -1) {
			local33 = (int) (arg0 - this.aLong137);
			if (this.aClass78_1.aBoolean219 || local33 <= this.aClass78_1.anInt2235) {
				local33 %= this.aClass78_1.anInt2235;
			} else {
				arg2 = false;
			}
			if (!this.aClass78_1.aBoolean220 && local33 < this.aClass78_1.anInt2232) {
				arg2 = false;
			}
			if (this.aClass78_1.aBoolean220 && this.aClass78_1.anInt2232 <= local33) {
				arg2 = false;
			}
		}
		if (arg2) {
			this.anInt4549 += (int) ((double) arg3 * (Math.random() * (double) (this.aClass78_1.anInt2271 - this.aClass78_1.anInt2263) + (double) this.aClass78_1.anInt2263));
			if (this.anInt4549 > 63) {
				local33 = this.anInt4549 >> 6;
				this.anInt4549 &= 0x3F;
				for (@Pc(148) int local148 = 0; local148 < local33; local148++) {
					@Pc(212) int local212;
					@Pc(222) int local222;
					@Pc(218) int local218;
					@Pc(171) int local171;
					@Pc(179) int local179;
					@Pc(183) int local183;
					@Pc(194) int local194;
					@Pc(202) int local202;
					@Pc(206) int local206;
					if (this.aClass78_1.aShort36 <= 0 && this.aClass78_1.aShort39 <= 0) {
						local222 = this.anInt4551;
						local212 = this.anInt4553;
						local218 = this.anInt4550;
					} else {
						local171 = (int) (Math.random() * (double) this.anInt4562) + this.anInt4563;
						@Pc(175) int local175 = local171 & 0x3FFF;
						local179 = Class101.anIntArray234[local175];
						local183 = Class101.anIntArray235[local175];
						local194 = this.anInt4566 + (int) ((double) this.anInt4558 * Math.random());
						@Pc(198) int local198 = local194 & 0x1FFF;
						local202 = Class101.anIntArray234[local198];
						local206 = Class101.anIntArray235[local198];
						local212 = local183 * local202 >> 15;
						local218 = local202 * local179 >> 15;
						local222 = local206 * -1;
					}
					local171 = (int) (Math.random() * 65535.0D);
					local179 = (int) (Math.random() * 65535.0D);
					if (local179 + local171 > 65535) {
						local171 = 65535 - local171;
						local179 = 65535 - local179;
					}
					local183 = 65535 - local179 - local171;
					local194 = this.anInt4557 * local179 + local171 * this.anInt4559 + this.anInt4546 * local183 >> 16;
					local202 = local171 * this.anInt4555 + local179 * this.anInt4560 + local183 * this.anInt4552 >> 16;
					local206 = this.anInt4543 * local171 + this.anInt4547 * local179 + local183 * this.anInt4556 >> 16;
					@Pc(339) int local339 = (int) ((double) (this.aClass78_1.anInt2226 - this.aClass78_1.anInt2223) * Math.random()) + this.aClass78_1.anInt2223;
					@Pc(355) int local355 = this.aClass78_1.anInt2221 + (int) ((double) (this.aClass78_1.anInt2262 - this.aClass78_1.anInt2221) * Math.random());
					@Pc(371) int local371 = (int) ((double) (this.aClass78_1.anInt2231 - this.aClass78_1.anInt2220) * Math.random()) + this.aClass78_1.anInt2220;
					@Pc(433) int local433;
					if (this.aClass78_1.aBoolean217) {
						@Pc(437) double local437 = Math.random();
						local433 = (int) ((double) this.aClass78_1.anInt2261 + local437 * (double) this.aClass78_1.anInt2243) | (int) ((double) this.aClass78_1.anInt2229 * local437 + (double) this.aClass78_1.anInt2217) << 16 | (int) ((double) this.aClass78_1.anInt2233 * local437 + (double) this.aClass78_1.anInt2256) << 8 | (int) ((double) this.aClass78_1.anInt2253 + local437 * (double) this.aClass78_1.anInt2270) << 24;
					} else {
						local433 = (int) ((double) this.aClass78_1.anInt2253 + (double) this.aClass78_1.anInt2270 * Math.random()) << 24 | (int) ((double) this.aClass78_1.anInt2233 * Math.random() + (double) this.aClass78_1.anInt2256) << 8 | (int) ((double) this.aClass78_1.anInt2217 + Math.random() * (double) this.aClass78_1.anInt2229) << 16 | (int) ((double) this.aClass78_1.anInt2243 * Math.random() + (double) this.aClass78_1.anInt2261);
					}
					@Pc(499) int local499 = this.aClass78_1.anInt2258;
					if (!arg1.method3695() && !this.aClass78_1.aBoolean221) {
						local499 = -1;
					}
					if (Static219.anInt4849 == Static122.anInt2597) {
						new Class57_Sub1_Sub1_Sub1(this, local194, local202, local206, local212, local222, local218, local339, local355, local433, local371, local499, this.aClass78_1.aBoolean222);
					} else {
						@Pc(519) Class57_Sub1_Sub1_Sub1 local519 = Static269.aClass57_Sub1_Sub1_Sub1Array4[Static219.anInt4849];
						Static219.anInt4849 = Static219.anInt4849 + 1 & 0x3FF;
						local519.method2545(this, local194, local202, local206, local212, local222, local218, local339, local355, local433, local371, local499, this.aClass78_1.aBoolean222);
					}
				}
			}
		}
		this.anInt4548 = 0;
		for (@Pc(576) Class57_Sub1_Sub1_Sub1 local576 = (Class57_Sub1_Sub1_Sub1) this.aClass193_7.method5224(); local576 != null; local576 = (Class57_Sub1_Sub1_Sub1) this.aClass193_7.method5223()) {
			local576.method2544(arg0, arg3);
			this.anInt4548++;
		}
		Static212.anInt4627 += this.anInt4548;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(JI)V")
	public void method3944(@OriginalArg(0) long arg0) {
		for (@Pc(17) Class57_Sub1_Sub1_Sub1 local17 = (Class57_Sub1_Sub1_Sub1) this.aClass193_7.method5224(); local17 != null; local17 = (Class57_Sub1_Sub1_Sub1) this.aClass193_7.method5223()) {
			local17.method2542(arg0);
		}
	}
}
