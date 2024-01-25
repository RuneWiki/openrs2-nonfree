import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public abstract class Class57 {

	@OriginalMember(owner = "client!dw", name = "o", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "I")
	protected int anInt5722 = 4;

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "[S")
	private final short[] aShortArray114 = new short[512];

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "I")
	private int anInt5724 = 4;

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
	private int anInt5720 = 0;

	@OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
	private int anInt5725 = 4;

	@OriginalMember(owner = "client!dw", name = "k", descriptor = "I")
	private int anInt5728 = 4;

	static {
		new Class189("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
		new Class189("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
	}

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(IIIII)V")
	protected Class57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5722 = arg1;
		this.anInt5728 = arg2;
		this.anInt5720 = arg0;
		this.anInt5725 = arg3;
		this.anInt5724 = arg4;
		this.method4478();
		this.method4473();
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V")
	private void method4473() {
		@Pc(10) Random local10 = new Random((long) this.anInt5720);
		for (@Pc(12) int local12 = 0; local12 < 255; local12++) {
			this.aShortArray114[local12] = (short) local12;
		}
		for (@Pc(27) int local27 = 0; local27 < 255; local27++) {
			@Pc(33) int local33 = 255 - local27;
			@Pc(40) int local40 = Static180.method2865(local10, local33);
			@Pc(45) short local45 = this.aShortArray114[local40];
			this.aShortArray114[local40] = this.aShortArray114[local33];
			this.aShortArray114[local33] = this.aShortArray114[local33 + 256] = local45;
		}
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(I)V")
	protected abstract void method4475();

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(III)V")
	protected abstract void method4476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIII)V")
	protected final void method4477() {
		@Pc(6) int[] local6 = new int[128];
		@Pc(9) int[] local9 = new int[128];
		for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
			local6[local11] = (local11 << 12) / 128;
		}
		@Pc(31) int[] local31 = new int[16];
		for (@Pc(33) int local33 = 0; local33 < 128; local33++) {
			local9[local33] = (local33 << 12) / 128;
		}
		for (@Pc(48) int local48 = 0; local48 < 16; local48++) {
			local31[local48] = (local48 << 12) / 16;
		}
		this.method4475();
		for (@Pc(66) int local66 = 0; local66 < 16; local66++) {
			for (@Pc(69) int local69 = 0; local69 < 128; local69++) {
				for (@Pc(72) int local72 = 0; local72 < 128; local72++) {
					for (@Pc(75) int local75 = 0; local75 < this.anInt5722; local75++) {
						@Pc(83) int local83 = this.aShortArray115[local75] << 12;
						@Pc(91) int local91 = local31[local66] * local83 >> 12;
						@Pc(98) int local98 = this.anInt5728 * local83 >> 12;
						@Pc(105) int local105 = local83 * this.anInt5725 >> 12;
						@Pc(113) int local113 = local83 * local9[local69] >> 12;
						@Pc(120) int local120 = local83 * this.anInt5724 >> 12;
						@Pc(128) int local128 = local6[local72] * local83 >> 12;
						@Pc(133) int local133 = local113 * this.anInt5725;
						@Pc(138) int local138 = local128 * this.anInt5728;
						@Pc(143) int local143 = local91 * this.anInt5724;
						@Pc(147) int local147 = local138 >> 12;
						@Pc(151) int local151 = local147 + 1;
						@Pc(155) int local155 = local133 >> 12;
						@Pc(159) int local159 = local147 & 0xFF;
						@Pc(163) int local163 = local155 + 1;
						@Pc(167) int local167 = local155 & 0xFF;
						@Pc(171) int local171 = local143 >> 12;
						@Pc(175) int local175 = local171 + 1;
						@Pc(179) int local179 = local143 & 0xFFF;
						if (local163 >= local105) {
							local163 = 0;
						} else {
							local163 &= 0xFF;
						}
						if (local98 > local151) {
							local151 &= 0xFF;
						} else {
							local151 = 0;
						}
						local128 = local138 & 0xFFF;
						if (local175 < local120) {
							local175 &= 0xFF;
						} else {
							local175 = 0;
						}
						local171 &= 0xFF;
						local113 = local133 & 0xFFF;
						@Pc(233) int local233 = Class3_Sub2_Sub23.anIntArray363[local128];
						@Pc(237) int local237 = Class3_Sub2_Sub23.anIntArray363[local179];
						@Pc(242) short local242 = this.aShortArray114[local171];
						@Pc(246) int local246 = local113 - 4096;
						@Pc(250) int local250 = local128 - 4096;
						@Pc(254) int local254 = local179 - 4096;
						@Pc(259) short local259 = this.aShortArray114[local175];
						@Pc(263) int local263 = Class3_Sub2_Sub23.anIntArray363[local113];
						@Pc(271) short local271 = this.aShortArray114[local167 + local259];
						@Pc(278) short local278 = this.aShortArray114[local163 + local259];
						@Pc(285) short local285 = this.aShortArray114[local163 + local242];
						@Pc(292) short local292 = this.aShortArray114[local242 + local167];
						@Pc(304) int local304 = Static398.method5108(this.aShortArray114[local292 + local159], local113, local128, local179);
						@Pc(316) int local316 = Static398.method5108(this.aShortArray114[local292 + local151], local113, local250, local179);
						@Pc(327) int local327 = local304 + (local233 * (local316 - local304) >> 12);
						@Pc(341) int local341 = Static398.method5108(this.aShortArray114[local285 + local159], local246, local128, local179);
						@Pc(355) int local355 = Static398.method5108(this.aShortArray114[local285 + local151], local246, local250, local179);
						@Pc(365) int local365 = (local233 * (local355 - local341) >> 12) + local341;
						@Pc(377) int local377 = Static398.method5108(this.aShortArray114[local159 + local271], local113, local128, local254);
						@Pc(388) int local388 = ((local365 - local327) * local263 >> 12) + local327;
						@Pc(401) int local401 = Static398.method5108(this.aShortArray114[local151 + local271], local113, local250, local254);
						@Pc(412) int local412 = ((local401 - local377) * local233 >> 12) + local377;
						@Pc(427) int local427 = Static398.method5108(this.aShortArray114[local159 + local278], local246, local128, local254);
						@Pc(440) int local440 = Static398.method5108(this.aShortArray114[local151 + local278], local246, local250, local254);
						@Pc(452) int local452 = local427 + ((local440 - local427) * local233 >> 12);
						@Pc(463) int local463 = (local263 * (local452 - local412) >> 12) + local412;
						this.method4476(local75, ((local463 - local388) * local237 >> 12) + local388);
					}
					this.method4481();
				}
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Z)V")
	private void method4478() {
		this.aShortArray115 = new short[this.anInt5722];
		for (@Pc(10) int local10 = 0; local10 < this.anInt5722; local10++) {
			this.aShortArray115[local10] = (short) Math.pow(2.0D, (double) local10);
		}
	}

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "(I)V")
	protected abstract void method4481();
}
