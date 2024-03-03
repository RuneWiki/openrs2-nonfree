import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class12_Sub8 extends Class12 {

	@OriginalMember(owner = "client!th", name = "i", descriptor = "I")
	private int anInt6225;

	@OriginalMember(owner = "client!th", name = "l", descriptor = "I")
	private int anInt6227;

	@OriginalMember(owner = "client!th", name = "m", descriptor = "I")
	private int anInt6228;

	@OriginalMember(owner = "client!th", name = "n", descriptor = "I")
	public int anInt6229;

	@OriginalMember(owner = "client!th", name = "p", descriptor = "I")
	private int anInt6231;

	@OriginalMember(owner = "client!th", name = "u", descriptor = "I")
	private int anInt6233;

	@OriginalMember(owner = "client!th", name = "w", descriptor = "I")
	private int anInt6234;

	@OriginalMember(owner = "client!th", name = "x", descriptor = "I")
	private int anInt6235;

	@OriginalMember(owner = "client!th", name = "y", descriptor = "I")
	private int anInt6236;

	@OriginalMember(owner = "client!th", name = "z", descriptor = "I")
	private int anInt6237;

	@OriginalMember(owner = "client!th", name = "A", descriptor = "I")
	private int anInt6238;

	@OriginalMember(owner = "client!th", name = "D", descriptor = "I")
	private int anInt6240;

	@OriginalMember(owner = "client!th", name = "E", descriptor = "I")
	public int anInt6241;

	@OriginalMember(owner = "client!th", name = "G", descriptor = "I")
	public int anInt6242;

	@OriginalMember(owner = "client!th", name = "I", descriptor = "I")
	private int anInt6244;

	@OriginalMember(owner = "client!th", name = "K", descriptor = "I")
	private int anInt6245;

	@OriginalMember(owner = "client!th", name = "L", descriptor = "I")
	private int anInt6246;

	@OriginalMember(owner = "client!th", name = "M", descriptor = "I")
	private int anInt6247;

	@OriginalMember(owner = "client!th", name = "N", descriptor = "I")
	private int anInt6248;

	@OriginalMember(owner = "client!th", name = "O", descriptor = "I")
	public int anInt6249;

	@OriginalMember(owner = "client!th", name = "s", descriptor = "Z")
	private boolean aBoolean423 = false;

	@OriginalMember(owner = "client!th", name = "r", descriptor = "I")
	private int anInt6232 = 0;

	@OriginalMember(owner = "client!th", name = "j", descriptor = "Z")
	public boolean aBoolean422 = false;

	@OriginalMember(owner = "client!th", name = "q", descriptor = "Lclient!jf;")
	public final Class114 aClass114_2;

	@OriginalMember(owner = "client!th", name = "C", descriptor = "J")
	private final long aLong198;

	@OriginalMember(owner = "client!th", name = "J", descriptor = "Lclient!oh;")
	public final Class12_Sub5 aClass12_Sub5_6;

	@OriginalMember(owner = "client!th", name = "P", descriptor = "Lclient!uo;")
	public Class235 aClass235_1;

	@OriginalMember(owner = "client!th", name = "v", descriptor = "Lclient!cm;")
	public final Class36 aClass36_8;

	static {
		new Class79("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!wm;Lclient!jf;Lclient!oh;J)V", line = 343)
	public Class12_Sub8(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) Class12_Sub5 arg2, @OriginalArg(3) long arg3) {
		this.aClass114_2 = arg1;
		this.aLong198 = arg3;
		this.aClass12_Sub5_6 = arg2;
		this.aClass235_1 = Static307.method5656(this.aClass114_2.anInt2927);
		if (!arg0.method2815() && this.aClass235_1.anInt6596 != -1) {
			this.aClass235_1 = Static307.method5656(this.aClass235_1.anInt6596);
		}
		this.aClass36_8 = new Class36();
		this.anInt6232 = (int) ((double) this.anInt6232 + Math.random() * 64.0D);
		this.method5690();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(JBLclient!wm;IZ)V", line = 54)
	public void method5687(@OriginalArg(0) long arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(54) int local54;
		if (this.aBoolean422) {
			arg3 = false;
		} else if (this.aClass235_1.anInt6566 > Class108.anInt2791) {
			arg3 = false;
		} else if (Class49_Sub2_Sub1.anInt6301 > Class2_Sub2_Sub10.anIntArray421[Class108.anInt2791]) {
			arg3 = false;
		} else if (this.aBoolean423) {
			arg3 = false;
		} else if (this.aClass235_1.anInt6589 != -1) {
			local54 = (int) (arg0 - this.aLong198);
			if (this.aClass235_1.aBoolean451 || local54 <= this.aClass235_1.anInt6589) {
				local54 %= this.aClass235_1.anInt6589;
			} else {
				arg3 = false;
			}
			if (!this.aClass235_1.aBoolean454 && local54 < this.aClass235_1.anInt6585) {
				arg3 = false;
			}
			if (this.aClass235_1.aBoolean454 && this.aClass235_1.anInt6585 <= local54) {
				arg3 = false;
			}
		}
		if (arg3) {
			this.anInt6232 += (int) (((double) this.aClass235_1.anInt6554 + (double) (this.aClass235_1.anInt6561 - this.aClass235_1.anInt6554) * Math.random()) * (double) arg2);
			if (this.anInt6232 > 63) {
				local54 = this.anInt6232 >> 6;
				this.anInt6232 &= 0x3F;
				for (@Pc(147) int local147 = 0; local147 < local54; local147++) {
					@Pc(207) int local207;
					@Pc(217) int local217;
					@Pc(213) int local213;
					@Pc(167) int local167;
					@Pc(175) int local175;
					@Pc(179) int local179;
					@Pc(189) int local189;
					@Pc(197) int local197;
					@Pc(201) int local201;
					if (this.aClass235_1.aShort95 <= 0 && this.aClass235_1.aShort96 <= 0) {
						local207 = this.anInt6227;
						local217 = this.anInt6234;
						local213 = this.anInt6244;
					} else {
						local167 = (int) (Math.random() * (double) this.anInt6238) + this.anInt6235;
						@Pc(171) int local171 = local167 & 0x3FFF;
						local175 = Class19.anIntArray178[local171];
						local179 = Class19.anIntArray177[local171];
						local189 = (int) ((double) this.anInt6225 * Math.random()) + this.anInt6248;
						@Pc(193) int local193 = local189 & 0x1FFF;
						local197 = Class19.anIntArray178[local193];
						local201 = Class19.anIntArray177[local193];
						local207 = local197 * local179 >> 15;
						local213 = local197 * local175 >> 15;
						local217 = local201 * -1;
					}
					local167 = (int) (Math.random() * 65535.0D);
					local175 = (int) (Math.random() * 65535.0D);
					if (local167 + local175 > 65535) {
						local167 = 65535 - local167;
						local175 = 65535 - local175;
					}
					local179 = 65535 - local167 - local175;
					local189 = local167 * this.anInt6237 + this.anInt6247 * local175 + local179 * this.anInt6231 >> 16;
					local197 = local179 * this.anInt6233 + this.anInt6246 * local167 + local175 * this.anInt6245 >> 16;
					local201 = local175 * this.anInt6236 + this.anInt6228 * local167 + this.anInt6240 * local179 >> 16;
					@Pc(334) int local334 = this.aClass235_1.anInt6600 + (int) ((double) (this.aClass235_1.anInt6603 - this.aClass235_1.anInt6600) * Math.random());
					@Pc(351) int local351 = (int) (Math.random() * (double) (this.aClass235_1.anInt6558 - this.aClass235_1.anInt6574)) + this.aClass235_1.anInt6574;
					@Pc(368) int local368 = (int) ((double) (this.aClass235_1.anInt6598 - this.aClass235_1.anInt6586) * Math.random()) + this.aClass235_1.anInt6586;
					@Pc(430) int local430;
					if (this.aClass235_1.aBoolean449) {
						@Pc(434) double local434 = Math.random();
						local430 = (int) ((double) this.aClass235_1.lb + Math.random() * (double) this.aClass235_1.anInt6587) << 24 | (int) ((double) this.aClass235_1.anInt6593 + local434 * (double) this.aClass235_1.anInt6571) << 8 | (int) (local434 * (double) this.aClass235_1.anInt6563 + (double) this.aClass235_1.anInt6607) << 16 | (int) (local434 * (double) this.aClass235_1.anInt6570 + (double) this.aClass235_1.anInt6578);
					} else {
						local430 = (int) ((double) this.aClass235_1.anInt6578 + Math.random() * (double) this.aClass235_1.anInt6570) | (int) ((double) this.aClass235_1.anInt6607 + (double) this.aClass235_1.anInt6563 * Math.random()) << 16 | (int) ((double) this.aClass235_1.anInt6593 + Math.random() * (double) this.aClass235_1.anInt6571) << 8 | (int) ((double) this.aClass235_1.lb + (double) this.aClass235_1.anInt6587 * Math.random()) << 24;
					}
					@Pc(496) int local496 = this.aClass235_1.anInt6564;
					if (!arg1.method2815() && !this.aClass235_1.aBoolean453) {
						local496 = -1;
					}
					if (Class61.anInt1833 == Class103.anInt2703) {
						new Class12_Sub1_Sub1_Sub1(this, local189, local197, local201, local207, local217, local213, local334, local351, local430, local368, local496, this.aClass235_1.aBoolean452, this.aClass235_1.aBoolean450);
					} else {
						@Pc(536) Class12_Sub1_Sub1_Sub1 local536 = Static91.aClass12_Sub1_Sub1_Sub1Array1[Class103.anInt2703];
						Class103.anInt2703 = Class103.anInt2703 + 1 & 0x3FF;
						local536.method4219(this, local189, local197, local201, local207, local217, local213, local334, local351, local430, local368, local496, this.aClass235_1.aBoolean452, this.aClass235_1.aBoolean450);
					}
				}
			}
		}
		this.anInt6241 = 0;
		for (@Pc(583) Class12_Sub1_Sub1_Sub1 local583 = (Class12_Sub1_Sub1_Sub1) this.aClass36_8.method1417(); local583 != null; local583 = (Class12_Sub1_Sub1_Sub1) this.aClass36_8.method1422()) {
			local583.method4220(arg0, arg2);
			this.anInt6241++;
		}
		Static288.anInt5797 += this.anInt6241;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IJ)V", line = 237)
	public void method5689(@OriginalArg(1) long arg0) {
		for (@Pc(7) Class12_Sub1_Sub1_Sub1 local7 = (Class12_Sub1_Sub1_Sub1) this.aClass36_8.method1417(); local7 != null; local7 = (Class12_Sub1_Sub1_Sub1) this.aClass36_8.method1422()) {
			local7.method4217(arg0);
		}
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(B)V", line = 256)
	public void method5690() {
		this.anInt6228 = this.aClass114_2.anInt2919;
		this.anInt6247 = this.aClass114_2.anInt2922;
		this.anInt6246 = this.aClass114_2.anInt2913;
		this.anInt6233 = this.aClass114_2.anInt2912;
		this.anInt6237 = this.aClass114_2.anInt2916;
		this.anInt6240 = this.aClass114_2.anInt2918;
		this.anInt6231 = this.aClass114_2.anInt2921;
		this.anInt6245 = this.aClass114_2.anInt2925;
		this.anInt6236 = this.aClass114_2.anInt2926;
		if (this.anInt6247 == this.anInt6237 && this.anInt6231 == this.anInt6247 && this.anInt6246 == this.anInt6245 && this.anInt6233 == this.anInt6245 && this.anInt6236 == this.anInt6228 && this.anInt6236 == this.anInt6240) {
			this.aBoolean423 = true;
			return;
		}
		this.aBoolean423 = false;
		@Pc(111) int local111 = (this.anInt6237 + this.anInt6247 + this.anInt6231) / 3;
		@Pc(123) int local123 = (this.anInt6233 + this.anInt6246 + this.anInt6245) / 3;
		@Pc(134) int local134 = (this.anInt6240 + this.anInt6236 + this.anInt6228) / 3;
		if (local111 == this.anInt6242 && this.anInt6249 == local123 && local134 == this.anInt6229) {
			return;
		}
		this.anInt6242 = local111;
		this.anInt6249 = local123;
		this.anInt6229 = local134;
		@Pc(167) int local167 = this.anInt6247 - this.anInt6237;
		@Pc(174) int local174 = this.anInt6245 - this.anInt6246;
		@Pc(180) int local180 = this.anInt6236 - this.anInt6228;
		@Pc(187) int local187 = this.anInt6231 - this.anInt6237;
		@Pc(194) int local194 = this.anInt6233 - this.anInt6246;
		@Pc(201) int local201 = this.anInt6240 - this.anInt6228;
		this.anInt6244 = local194 * local167 - local174 * local187;
		this.anInt6227 = local201 * local174 - local180 * local194;
		this.anInt6234 = local187 * local180 - local201 * local167;
		while (this.anInt6227 > 32767 || this.anInt6234 > 32767 || this.anInt6244 > 32767 || this.anInt6227 < -32767 || this.anInt6234 < -32767 || this.anInt6244 < -32767) {
			this.anInt6227 >>= 0x1;
			this.anInt6234 >>= 0x1;
			this.anInt6244 >>= 0x1;
		}
		@Pc(299) int local299 = (int) Math.sqrt((double) (this.anInt6227 * this.anInt6227 + this.anInt6234 * this.anInt6234 + this.anInt6244 * this.anInt6244));
		if (local299 <= 0) {
			local299 = 1;
		}
		this.anInt6234 = this.anInt6234 * 32767 / local299;
		this.anInt6244 = this.anInt6244 * 32767 / local299;
		this.anInt6227 = this.anInt6227 * 32767 / local299;
		if (this.aClass235_1.aShort95 <= 0 && this.aClass235_1.aShort96 <= 0) {
			return;
		}
		@Pc(355) int local355 = (int) (Math.atan2((double) this.anInt6244, (double) this.anInt6227) * 2607.5945876176133D);
		@Pc(376) int local376 = (int) (Math.atan2((double) this.anInt6234, Math.sqrt((double) (this.anInt6244 * this.anInt6244 + this.anInt6227 * this.anInt6227))) * 2607.5945876176133D);
		this.anInt6238 = this.aClass235_1.aShort95 - this.aClass235_1.aShort93;
		this.anInt6235 = this.aClass235_1.aShort93 + local355 - (this.anInt6238 >> 1);
		this.anInt6225 = this.aClass235_1.aShort96 - this.aClass235_1.aShort94;
		this.anInt6248 = local376 + this.aClass235_1.aShort94 - (this.anInt6225 >> 1);
	}
}
