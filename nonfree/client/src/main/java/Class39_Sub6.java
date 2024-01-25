import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class39_Sub6 extends Class39 {

	@OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
	private int anInt4600;

	@OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
	private int anInt4601;

	@OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
	private int anInt4602;

	@OriginalMember(owner = "client!ms", name = "o", descriptor = "I")
	private int anInt4603;

	@OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
	public int anInt4606;

	@OriginalMember(owner = "client!ms", name = "s", descriptor = "I")
	private int anInt4607;

	@OriginalMember(owner = "client!ms", name = "u", descriptor = "I")
	private int anInt4608;

	@OriginalMember(owner = "client!ms", name = "x", descriptor = "I")
	private int anInt4611;

	@OriginalMember(owner = "client!ms", name = "y", descriptor = "I")
	private int anInt4612;

	@OriginalMember(owner = "client!ms", name = "z", descriptor = "I")
	private int anInt4613;

	@OriginalMember(owner = "client!ms", name = "B", descriptor = "I")
	public int anInt4614;

	@OriginalMember(owner = "client!ms", name = "D", descriptor = "I")
	public int anInt4615;

	@OriginalMember(owner = "client!ms", name = "E", descriptor = "I")
	public int anInt4616;

	@OriginalMember(owner = "client!ms", name = "G", descriptor = "I")
	private int anInt4617;

	@OriginalMember(owner = "client!ms", name = "I", descriptor = "I")
	private int anInt4618;

	@OriginalMember(owner = "client!ms", name = "J", descriptor = "I")
	private int anInt4619;

	@OriginalMember(owner = "client!ms", name = "L", descriptor = "I")
	private int anInt4621;

	@OriginalMember(owner = "client!ms", name = "P", descriptor = "I")
	private int anInt4623;

	@OriginalMember(owner = "client!ms", name = "S", descriptor = "I")
	private int anInt4624;

	@OriginalMember(owner = "client!ms", name = "T", descriptor = "I")
	private int anInt4625;

	@OriginalMember(owner = "client!ms", name = "j", descriptor = "Z")
	private boolean aBoolean315 = false;

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
	private int anInt4604 = 0;

	@OriginalMember(owner = "client!ms", name = "C", descriptor = "Z")
	public boolean aBoolean316 = false;

	@OriginalMember(owner = "client!ms", name = "N", descriptor = "Lclient!vj;")
	public final Class252 aClass252_1;

	@OriginalMember(owner = "client!ms", name = "F", descriptor = "J")
	private final long aLong143;

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "Lclient!vc;")
	public final Class39_Sub8 aClass39_Sub8_4;

	@OriginalMember(owner = "client!ms", name = "Q", descriptor = "Lclient!tg;")
	public Class223 aClass223_1;

	@OriginalMember(owner = "client!ms", name = "H", descriptor = "Lclient!qi;")
	public final Class188 aClass188_6;

	static {
		new Class84("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!qa;Lclient!vj;Lclient!vc;J)V")
	public Class39_Sub6(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class252 arg1, @OriginalArg(2) Class39_Sub8 arg2, @OriginalArg(3) long arg3) {
		this.aClass252_1 = arg1;
		this.aLong143 = arg3;
		this.aClass39_Sub8_4 = arg2;
		this.aClass223_1 = this.aClass252_1.method5685();
		if (!arg0.method4706() && this.aClass223_1.anInt6698 != -1) {
			this.aClass223_1 = Static298.method4255(this.aClass223_1.anInt6698);
		}
		this.aClass188_6 = new Class188();
		this.anInt4604 = (int) ((double) this.anInt4604 + Math.random() * 64.0D);
		this.method3777();
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)V")
	public void method3777() {
		this.anInt4613 = this.aClass252_1.anInt7344;
		this.anInt4611 = this.aClass252_1.anInt7335;
		this.anInt4603 = this.aClass252_1.anInt7333;
		this.anInt4618 = this.aClass252_1.anInt7331;
		this.anInt4600 = this.aClass252_1.anInt7342;
		this.anInt4617 = this.aClass252_1.anInt7340;
		this.anInt4621 = this.aClass252_1.anInt7337;
		this.anInt4601 = this.aClass252_1.anInt7336;
		this.anInt4624 = this.aClass252_1.anInt7343;
		if (this.anInt4613 == this.anInt4618 && this.anInt4618 == this.anInt4617 && this.anInt4611 == this.anInt4624 && this.anInt4601 == this.anInt4624 && this.anInt4621 == this.anInt4600 && this.anInt4600 == this.anInt4603) {
			this.aBoolean315 = true;
			return;
		}
		this.aBoolean315 = false;
		@Pc(114) int local114 = (this.anInt4618 + this.anInt4613 + this.anInt4617) / 3;
		@Pc(125) int local125 = (this.anInt4601 + this.anInt4624 + this.anInt4611) / 3;
		@Pc(137) int local137 = (this.anInt4600 + this.anInt4621 + this.anInt4603) / 3;
		if (this.anInt4615 == local114 && local125 == this.anInt4614 && this.anInt4606 == local137) {
			return;
		}
		this.anInt4606 = local137;
		this.anInt4614 = local125;
		this.anInt4615 = local114;
		@Pc(169) int local169 = this.anInt4618 - this.anInt4613;
		@Pc(176) int local176 = this.anInt4624 - this.anInt4611;
		@Pc(183) int local183 = this.anInt4600 - this.anInt4621;
		@Pc(190) int local190 = this.anInt4617 - this.anInt4613;
		@Pc(197) int local197 = this.anInt4601 - this.anInt4611;
		@Pc(204) int local204 = this.anInt4603 - this.anInt4621;
		this.anInt4612 = local197 * local169 - local190 * local176;
		this.anInt4625 = local190 * local183 - local204 * local169;
		this.anInt4602 = local204 * local176 - local183 * local197;
		while (this.anInt4602 > 32767 || this.anInt4625 > 32767 || this.anInt4612 > 32767 || this.anInt4602 < -32767 || this.anInt4625 < -32767 || this.anInt4612 < -32767) {
			this.anInt4612 >>= 0x1;
			this.anInt4602 >>= 0x1;
			this.anInt4625 >>= 0x1;
		}
		@Pc(305) int local305 = (int) Math.sqrt((double) (this.anInt4612 * this.anInt4612 + this.anInt4625 * this.anInt4625 + this.anInt4602 * this.anInt4602));
		if (local305 <= 0) {
			local305 = 1;
		}
		this.anInt4612 = this.anInt4612 * 32767 / local305;
		this.anInt4625 = this.anInt4625 * 32767 / local305;
		this.anInt4602 = this.anInt4602 * 32767 / local305;
		if (this.aClass223_1.aShort84 <= 0 && this.aClass223_1.aShort81 <= 0) {
			return;
		}
		@Pc(355) int local355 = (int) (Math.atan2((double) this.anInt4612, (double) this.anInt4602) * 2607.5945876176133D);
		@Pc(376) int local376 = (int) (Math.atan2((double) this.anInt4625, Math.sqrt((double) (this.anInt4602 * this.anInt4602 + this.anInt4612 * this.anInt4612))) * 2607.5945876176133D);
		this.anInt4608 = this.aClass223_1.aShort84 - this.aClass223_1.aShort83;
		this.anInt4623 = this.aClass223_1.aShort83 + local355 - (this.anInt4608 >> 1);
		this.anInt4619 = this.aClass223_1.aShort81 - this.aClass223_1.aShort82;
		this.anInt4607 = this.aClass223_1.aShort82 + local376 - (this.anInt4619 >> 1);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IJLclient!qa;ZI)V")
	public void method3779(@OriginalArg(1) long arg0, @OriginalArg(2) Class109 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(44) int local44;
		if (this.aBoolean316) {
			arg2 = false;
		} else if (this.aClass223_1.anInt6679 > Static381.anInt5294) {
			arg2 = false;
		} else if (Static276.anInt4920 > Static442.anIntArray405[Static381.anInt5294]) {
			arg2 = false;
		} else if (this.aBoolean315) {
			arg2 = false;
		} else if (this.aClass223_1.anInt6712 != -1) {
			local44 = (int) (arg0 - this.aLong143);
			if (this.aClass223_1.aBoolean438 || local44 <= this.aClass223_1.anInt6712) {
				local44 %= this.aClass223_1.anInt6712;
			} else {
				arg2 = false;
			}
			if (!this.aClass223_1.aBoolean437 && local44 < this.aClass223_1.anInt6692) {
				arg2 = false;
			}
			if (this.aClass223_1.aBoolean437 && this.aClass223_1.anInt6692 <= local44) {
				arg2 = false;
			}
		}
		if (arg2) {
			this.anInt4604 += (int) ((double) arg3 * ((double) (this.aClass223_1.anInt6716 - this.aClass223_1.anInt6666) * Math.random() + (double) this.aClass223_1.anInt6666));
			if (this.anInt4604 > 63) {
				local44 = this.anInt4604 >> 6;
				this.anInt4604 &= 0x3F;
				for (@Pc(143) int local143 = 0; local143 < local44; local143++) {
					@Pc(211) int local211;
					@Pc(205) int local205;
					@Pc(217) int local217;
					@Pc(163) int local163;
					@Pc(171) int local171;
					@Pc(175) int local175;
					@Pc(185) int local185;
					@Pc(193) int local193;
					@Pc(197) int local197;
					if (this.aClass223_1.aShort84 <= 0 && this.aClass223_1.aShort81 <= 0) {
						local211 = this.anInt4602;
						local217 = this.anInt4612;
						local205 = this.anInt4625;
					} else {
						local163 = this.anInt4623 + (int) (Math.random() * (double) this.anInt4608);
						@Pc(167) int local167 = local163 & 0x3FFF;
						local171 = Class4.anIntArray7[local167];
						local175 = Class4.anIntArray6[local167];
						local185 = (int) ((double) this.anInt4619 * Math.random()) + this.anInt4607;
						@Pc(189) int local189 = local185 & 0x1FFF;
						local193 = Class4.anIntArray7[local189];
						local197 = Class4.anIntArray6[local189];
						local205 = (local197 << 0) * -1;
						local211 = local193 * local175 >> 15;
						local217 = local171 * local193 >> 15;
					}
					local163 = (int) (Math.random() * 65535.0D);
					local171 = (int) (Math.random() * 65535.0D);
					if (local163 + local171 > 65535) {
						local171 = 65535 - local171;
						local163 = 65535 - local163;
					}
					local175 = 65535 - local171 - local163;
					local185 = local175 * this.anInt4617 + local163 * this.anInt4613 + this.anInt4618 * local171 >> 16;
					local193 = local171 * this.anInt4624 + this.anInt4611 * local163 + this.anInt4601 * local175 >> 16;
					local197 = local171 * this.anInt4600 + local163 * this.anInt4621 + local175 * this.anInt4603 >> 16;
					@Pc(332) int local332 = (int) (Math.random() * (double) (this.aClass223_1.anInt6670 - this.aClass223_1.anInt6697)) + this.aClass223_1.anInt6697;
					@Pc(349) int local349 = this.aClass223_1.anInt6680 + (int) ((double) (this.aClass223_1.anInt6688 - this.aClass223_1.anInt6680) * Math.random());
					@Pc(366) int local366 = this.aClass223_1.anInt6713 + (int) (Math.random() * (double) (this.aClass223_1.anInt6699 - this.aClass223_1.anInt6713));
					@Pc(428) int local428;
					if (this.aClass223_1.aBoolean440) {
						@Pc(432) double local432 = Math.random();
						local428 = (int) ((double) this.aClass223_1.anInt6681 + (double) this.aClass223_1.anInt6703 * Math.random()) << 24 | (int) ((double) this.aClass223_1.anInt6718 * local432 + (double) this.aClass223_1.anInt6669) << 16 | (int) ((double) this.aClass223_1.anInt6684 + local432 * (double) this.aClass223_1.anInt6676) << 8 | (int) (local432 * (double) this.aClass223_1.anInt6717 + (double) this.aClass223_1.anInt6672);
					} else {
						local428 = (int) ((double) this.aClass223_1.anInt6681 + (double) this.aClass223_1.anInt6703 * Math.random()) << 24 | (int) ((double) this.aClass223_1.anInt6676 * Math.random() + (double) this.aClass223_1.anInt6684) << 8 | (int) (Math.random() * (double) this.aClass223_1.anInt6718 + (double) this.aClass223_1.anInt6669) << 16 | (int) ((double) this.aClass223_1.anInt6717 * Math.random() + (double) this.aClass223_1.anInt6672);
					}
					@Pc(494) int local494 = this.aClass223_1.anInt6687;
					if (!arg1.method4706() && !this.aClass223_1.aBoolean442) {
						local494 = -1;
					}
					if (Static379.anInt6499 == Static324.anInt5681) {
						new Class39_Sub2_Sub1_Sub1(this, local185, local193, local197, local211, local205, local217, local332, local349, local428, local366, local494, this.aClass223_1.aBoolean436, this.aClass223_1.aBoolean435);
					} else {
						@Pc(510) Class39_Sub2_Sub1_Sub1 local510 = Static330.aClass39_Sub2_Sub1_Sub1Array1[Static324.anInt5681];
						Static324.anInt5681 = Static324.anInt5681 + 1 & 0x3FF;
						local510.method5585(this, local185, local193, local197, local211, local205, local217, local332, local349, local428, local366, local494, this.aClass223_1.aBoolean436, this.aClass223_1.aBoolean435);
					}
				}
			}
		}
		this.anInt4616 = 0;
		for (@Pc(573) Class39_Sub2_Sub1_Sub1 local573 = (Class39_Sub2_Sub1_Sub1) this.aClass188_6.method4534(); local573 != null; local573 = (Class39_Sub2_Sub1_Sub1) this.aClass188_6.method4530()) {
			local573.method5586(arg0, arg3);
			this.anInt4616++;
		}
		Static63.anInt1320 += this.anInt4616;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(BJ)V")
	public void method3781(@OriginalArg(1) long arg0) {
		for (@Pc(11) Class39_Sub2_Sub1_Sub1 local11 = (Class39_Sub2_Sub1_Sub1) this.aClass188_6.method4534(); local11 != null; local11 = (Class39_Sub2_Sub1_Sub1) this.aClass188_6.method4530()) {
			local11.method5583(arg0);
		}
	}
}
