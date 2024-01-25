import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
	public int anInt3023;

	@OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
	private int anInt3024;

	@OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
	private int anInt3025;

	@OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
	private int anInt3026;

	@OriginalMember(owner = "client!fg", name = "A", descriptor = "I")
	private int anInt3027;

	@OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
	private int anInt3028;

	@OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
	private int anInt3029;

	@OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
	private int anInt3030;

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "Z")
	public boolean aBoolean221 = false;

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
	private int anInt3022 = 0;

	@OriginalMember(owner = "client!fg", name = "s", descriptor = "Lclient!pw;")
	public Class287 aClass287_1 = new Class287();

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "Lclient!pw;")
	private Class287 aClass287_2 = new Class287();

	@OriginalMember(owner = "client!fg", name = "D", descriptor = "Z")
	private boolean aBoolean222 = false;

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "J")
	private final long aLong84;

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "Lclient!vja;")
	public final Class373 aClass373_1;

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "Lclient!ls;")
	public final Class34_Sub7 aClass34_Sub7_4;

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "Lclient!rfa;")
	public Class307 aClass307_1;

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "Lclient!saa;")
	public final Class317 aClass317_3;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lclient!ha;Lclient!vja;Lclient!ls;J)V")
	public Class34_Sub2(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class373 arg1, @OriginalArg(2) Class34_Sub7 arg2, @OriginalArg(3) long arg3) {
		this.aLong84 = arg3;
		this.aClass373_1 = arg1;
		this.aClass34_Sub7_4 = arg2;
		this.aClass307_1 = this.aClass373_1.method8647();
		if (!arg0.method7995() && this.aClass307_1.anInt8151 != -1) {
			this.aClass307_1 = Static672.method8958(this.aClass307_1.anInt8151);
		}
		this.aClass317_3 = new Class317();
		this.anInt3022 = (int) ((double) this.anInt3022 + Math.random() * 64.0D);
		this.method2616();
		this.aClass287_2.anInt7572 = this.aClass287_1.anInt7572;
		this.aClass287_2.anInt7577 = this.aClass287_1.anInt7577;
		this.aClass287_2.anInt7585 = this.aClass287_1.anInt7585;
		this.aClass287_2.anInt7570 = this.aClass287_1.anInt7570;
		this.aClass287_2.anInt7583 = this.aClass287_1.anInt7583;
		this.aClass287_2.anInt7581 = this.aClass287_1.anInt7581;
		this.aClass287_2.anInt7573 = this.aClass287_1.anInt7573;
		this.aClass287_2.anInt7586 = this.aClass287_1.anInt7586;
		this.aClass287_2.anInt7587 = this.aClass287_1.anInt7587;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZBLclient!ha;J)V")
	public void method2615(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class95 arg2, @OriginalArg(4) long arg3) {
		if (this.aBoolean221) {
			arg1 = false;
		} else if (this.aClass307_1.anInt8157 > Static87.anInt1807) {
			arg1 = false;
		} else if (Static339.anInt5829 > Static642.anIntArray559[Static87.anInt1807]) {
			arg1 = false;
		} else if (this.aBoolean222) {
			arg1 = false;
		} else if (this.aClass307_1.anInt8135 != -1) {
			@Pc(41) int local41 = (int) (arg3 - this.aLong84);
			if (this.aClass307_1.aBoolean571 || local41 <= this.aClass307_1.anInt8135) {
				local41 %= this.aClass307_1.anInt8135;
			} else {
				arg1 = false;
			}
			if (!this.aClass307_1.aBoolean566 && this.aClass307_1.anInt8172 > local41) {
				arg1 = false;
			}
			if (this.aClass307_1.aBoolean566 && this.aClass307_1.anInt8172 <= local41) {
				arg1 = false;
			}
		}
		if (arg1) {
			Static619.anInt10270++;
			@Pc(126) int local126 = (this.aClass287_1.anInt7572 + this.aClass287_1.anInt7587 + this.aClass287_1.anInt7581) / 3;
			@Pc(140) int local140 = (this.aClass287_1.anInt7577 + this.aClass287_1.anInt7570 + this.aClass287_1.anInt7573) / 3;
			@Pc(155) int local155 = (this.aClass287_1.anInt7583 + this.aClass287_1.anInt7586 + this.aClass287_1.anInt7585) / 3;
			@Pc(199) int local199;
			@Pc(208) int local208;
			@Pc(217) int local217;
			@Pc(226) int local226;
			@Pc(235) int local235;
			@Pc(243) int local243;
			@Pc(345) int local345;
			@Pc(398) int local398;
			@Pc(419) int local419;
			if (this.aClass287_1.anInt7571 != local126 || local140 != this.aClass287_1.anInt7579 || this.aClass287_1.anInt7584 != local155) {
				this.aClass287_1.anInt7584 = local155;
				this.aClass287_1.anInt7571 = local126;
				this.aClass287_1.anInt7579 = local140;
				local199 = this.aClass287_1.anInt7581 - this.aClass287_1.anInt7587;
				local208 = this.aClass287_1.anInt7577 - this.aClass287_1.anInt7570;
				local217 = this.aClass287_1.anInt7583 - this.aClass287_1.anInt7586;
				local226 = this.aClass287_1.anInt7572 - this.aClass287_1.anInt7587;
				local235 = this.aClass287_1.anInt7573 - this.aClass287_1.anInt7570;
				local243 = this.aClass287_1.anInt7585 - this.aClass287_1.anInt7586;
				this.anInt3025 = local208 * local243 - local217 * local235;
				this.anInt3030 = local217 * local226 - local243 * local199;
				this.anInt3027 = local235 * local199 - local226 * local208;
				while (true) {
					if (this.anInt3025 <= 32767 && this.anInt3030 <= 32767 && this.anInt3027 <= 32767 && this.anInt3025 >= -32767 && this.anInt3030 >= -32767 && this.anInt3027 >= -32767) {
						local345 = (int) Math.sqrt((double) (this.anInt3030 * this.anInt3030 + this.anInt3025 * this.anInt3025 + this.anInt3027 * this.anInt3027));
						if (local345 <= 0) {
							local345 = 1;
						}
						this.anInt3025 = this.anInt3025 * 32767 / local345;
						this.anInt3030 = this.anInt3030 * 32767 / local345;
						this.anInt3027 = this.anInt3027 * 32767 / local345;
						if (this.aClass307_1.aShort76 > 0 || this.aClass307_1.aShort77 > 0) {
							local398 = (int) (Math.atan2((double) this.anInt3027, (double) this.anInt3025) * 2607.5945876176133D);
							local419 = (int) (Math.atan2((double) this.anInt3030, Math.sqrt((double) (this.anInt3027 * this.anInt3027 + this.anInt3025 * this.anInt3025))) * 2607.5945876176133D);
							this.anInt3024 = this.aClass307_1.aShort76 - this.aClass307_1.aShort74;
							this.anInt3026 = this.aClass307_1.aShort77 - this.aClass307_1.aShort75;
							this.anInt3029 = this.aClass307_1.aShort74 + local398 - (this.anInt3024 >> 1);
							this.anInt3028 = this.aClass307_1.aShort75 + local419 - (this.anInt3026 >> 1);
						}
						break;
					}
					this.anInt3025 >>= 0x1;
					this.anInt3030 >>= 0x1;
					this.anInt3027 >>= 0x1;
				}
			}
			this.anInt3022 += (int) ((double) arg0 * ((double) this.aClass307_1.anInt8164 + Math.random() * (double) (this.aClass307_1.anInt8166 - this.aClass307_1.anInt8164)));
			if (this.anInt3022 > 63) {
				local199 = this.anInt3022 >> 6;
				this.anInt3022 &= 0x3F;
				for (local235 = 0; local235 < local199; local235++) {
					@Pc(575) int local575;
					@Pc(579) int local579;
					if (this.aClass307_1.aShort76 <= 0 && this.aClass307_1.aShort77 <= 0) {
						local217 = this.anInt3030;
						local208 = this.anInt3025;
						local226 = this.anInt3027;
					} else {
						local243 = (int) ((double) this.anInt3024 * Math.random()) + this.anInt3029;
						local243 &= 0x3FFF;
						local345 = Class94.anIntArray561[local243];
						local398 = Class94.anIntArray560[local243];
						local419 = (int) ((double) this.anInt3026 * Math.random()) + this.anInt3028;
						local419 &= 0x1FFF;
						local575 = Class94.anIntArray561[local419];
						local579 = Class94.anIntArray560[local419];
						local217 = (local579 << 1) * -1;
						local208 = local398 * local575 >> 13;
						local226 = local575 * local345 >> 13;
					}
					@Pc(602) float local602 = (float) Math.random();
					@Pc(605) float local605 = (float) Math.random();
					if (local602 + local605 > 1.0F) {
						local605 = 1.0F - local605;
						local602 = 1.0F - local602;
					}
					@Pc(625) float local625 = 1.0F - local605 - local602;
					local419 = (int) (local602 * (float) this.aClass287_1.anInt7587 + (float) this.aClass287_1.anInt7581 * local605 + (float) this.aClass287_1.anInt7572 * local625);
					local575 = (int) (local625 * (float) this.aClass287_1.anInt7573 + (float) this.aClass287_1.anInt7570 * local602 + (float) this.aClass287_1.anInt7577 * local605);
					local579 = (int) (local625 * (float) this.aClass287_1.anInt7585 + local605 * (float) this.aClass287_1.anInt7583 + (float) this.aClass287_1.anInt7586 * local602);
					@Pc(713) int local713 = (int) (local625 * (float) this.aClass287_2.anInt7572 + (float) this.aClass287_2.anInt7587 * local602 + (float) this.aClass287_2.anInt7581 * local605);
					@Pc(735) int local735 = (int) (local602 * (float) this.aClass287_2.anInt7570 + (float) this.aClass287_2.anInt7577 * local605 + local625 * (float) this.aClass287_2.anInt7573);
					@Pc(757) int local757 = (int) (local625 * (float) this.aClass287_2.anInt7585 + (float) this.aClass287_2.anInt7586 * local602 + local605 * (float) this.aClass287_2.anInt7583);
					@Pc(762) int local762 = local419 - local713;
					@Pc(767) int local767 = local575 - local735;
					@Pc(772) int local772 = local579 - local757;
					@Pc(781) int local781 = (int) ((double) local713 + (double) local762 * Math.random());
					@Pc(790) int local790 = (int) ((double) local735 + (double) local767 * Math.random());
					@Pc(799) int local799 = (int) ((double) local757 + Math.random() * (double) local772);
					@Pc(816) int local816 = this.aClass307_1.anInt8149 + (int) (Math.random() * (double) (this.aClass307_1.anInt8185 - this.aClass307_1.anInt8149));
					@Pc(832) int local832 = this.aClass307_1.anInt8143 + (int) (Math.random() * (double) (this.aClass307_1.anInt8165 - this.aClass307_1.anInt8143));
					@Pc(849) int local849 = (int) (Math.random() * (double) (this.aClass307_1.anInt8147 - this.aClass307_1.anInt8156)) + this.aClass307_1.anInt8156;
					@Pc(913) int local913;
					if (this.aClass307_1.aBoolean573) {
						@Pc(855) double local855 = Math.random();
						local913 = (int) ((double) this.aClass307_1.anInt8136 * local855 + (double) this.aClass307_1.anInt8138) | (int) ((double) this.aClass307_1.anInt8159 * local855 + (double) this.aClass307_1.anInt8148) << 16 | (int) ((double) this.aClass307_1.anInt8134 + local855 * (double) this.aClass307_1.anInt8142) << 8 | (int) ((double) this.aClass307_1.anInt8181 + Math.random() * (double) this.aClass307_1.anInt8154) << 24;
					} else {
						local913 = (int) ((double) this.aClass307_1.anInt8181 + (double) this.aClass307_1.anInt8154 * Math.random()) << 24 | (int) ((double) this.aClass307_1.anInt8134 + (double) this.aClass307_1.anInt8142 * Math.random()) << 8 | (int) ((double) this.aClass307_1.anInt8159 * Math.random() + (double) this.aClass307_1.anInt8148) << 16 | (int) ((double) this.aClass307_1.anInt8138 + Math.random() * (double) this.aClass307_1.anInt8136);
					}
					@Pc(977) int local977 = this.aClass307_1.anInt8158;
					if (!arg2.method7995() && !this.aClass307_1.aBoolean570) {
						local977 = -1;
					}
					if (Static21.anInt7428 == Static33.anInt8505) {
						new Class34_Sub3_Sub2_Sub1(this, local781, local790, local799, local208, local217, local226, local816, local832, local913, local849, local977, this.aClass307_1.aBoolean567, this.aClass307_1.aBoolean568);
					} else {
						@Pc(1017) Class34_Sub3_Sub2_Sub1 local1017 = Static97.aClass34_Sub3_Sub2_Sub1Array1[Static33.anInt8505];
						Static33.anInt8505 = Static33.anInt8505 + 1 & 0x3FF;
						local1017.method8662(this, local781, local790, local799, local208, local217, local226, local816, local832, local913, local849, local977, this.aClass307_1.aBoolean567, this.aClass307_1.aBoolean568);
					}
				}
			}
		}
		if (!this.aClass287_1.method6316(this.aClass287_2)) {
			@Pc(1057) Class287 local1057 = this.aClass287_2;
			this.aClass287_2 = this.aClass287_1;
			this.aClass287_1 = local1057;
			this.aClass287_1.anInt7583 = this.aClass373_1.anInt10550;
			this.aClass287_1.anInt7587 = this.aClass373_1.anInt10560;
			this.aClass287_1.anInt7577 = this.aClass373_1.anInt10561;
			this.aClass287_1.anInt7585 = this.aClass373_1.anInt10546;
			this.aClass287_1.anInt7570 = this.aClass373_1.anInt10545;
			this.aClass287_1.anInt7586 = this.aClass373_1.anInt10547;
			this.aClass287_1.anInt7572 = this.aClass373_1.anInt10563;
			this.aClass287_1.anInt7573 = this.aClass373_1.anInt10554;
			this.aClass287_1.anInt7584 = this.aClass287_2.anInt7584;
			this.aClass287_1.anInt7571 = this.aClass287_2.anInt7571;
			this.aClass287_1.anInt7581 = this.aClass373_1.anInt10551;
			this.aClass287_1.anInt7579 = this.aClass287_2.anInt7579;
		}
		this.anInt3023 = 0;
		for (@Pc(1145) Class34_Sub3_Sub2_Sub1 local1145 = (Class34_Sub3_Sub2_Sub1) this.aClass317_3.method6891(); local1145 != null; local1145 = (Class34_Sub3_Sub2_Sub1) this.aClass317_3.method6894()) {
			local1145.method8665(arg3, arg0);
			this.anInt3023++;
		}
		Static567.anInt6323 += this.anInt3023;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
	public void method2616() {
		this.aClass287_1.anInt7577 = this.aClass373_1.anInt10561;
		this.aClass287_1.anInt7573 = this.aClass373_1.anInt10554;
		this.aClass287_1.anInt7570 = this.aClass373_1.anInt10545;
		this.aClass287_1.anInt7581 = this.aClass373_1.anInt10551;
		this.aClass287_1.anInt7586 = this.aClass373_1.anInt10547;
		this.aClass287_1.anInt7585 = this.aClass373_1.anInt10546;
		this.aClass287_1.anInt7583 = this.aClass373_1.anInt10550;
		this.aClass287_1.anInt7572 = this.aClass373_1.anInt10563;
		this.aClass287_1.anInt7587 = this.aClass373_1.anInt10560;
		if (this.aClass287_1.anInt7587 == this.aClass287_1.anInt7581 && this.aClass287_1.anInt7581 == this.aClass287_1.anInt7572 && this.aClass287_1.anInt7570 == this.aClass287_1.anInt7577 && this.aClass287_1.anInt7577 == this.aClass287_1.anInt7573 && this.aClass287_1.anInt7586 == this.aClass287_1.anInt7583 && this.aClass287_1.anInt7585 == this.aClass287_1.anInt7583) {
			this.aBoolean222 = true;
		} else if (this.aBoolean222) {
			this.aClass287_2.anInt7577 = this.aClass287_1.anInt7577;
			this.aClass287_2.anInt7581 = this.aClass287_1.anInt7581;
			this.aClass287_2.anInt7573 = this.aClass287_1.anInt7573;
			this.aClass287_2.anInt7587 = this.aClass287_1.anInt7587;
			this.aClass287_2.anInt7583 = this.aClass287_1.anInt7583;
			this.aBoolean222 = false;
			this.aClass287_2.anInt7585 = this.aClass287_1.anInt7585;
			this.aClass287_2.anInt7586 = this.aClass287_1.anInt7586;
			this.aClass287_2.anInt7570 = this.aClass287_1.anInt7570;
			this.aClass287_2.anInt7572 = this.aClass287_1.anInt7572;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(JBLclient!ha;)V")
	public void method2618(@OriginalArg(0) long arg0, @OriginalArg(2) Class95 arg1) {
		for (@Pc(11) Class34_Sub3_Sub2_Sub1 local11 = (Class34_Sub3_Sub2_Sub1) this.aClass317_3.method6891(); local11 != null; local11 = (Class34_Sub3_Sub2_Sub1) this.aClass317_3.method6894()) {
			local11.method8664(arg1, arg0);
		}
	}
}
