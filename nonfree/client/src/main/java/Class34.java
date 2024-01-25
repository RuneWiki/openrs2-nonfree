import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public abstract class Class34 {

	@OriginalMember(owner = "client!wo", name = "t", descriptor = "[S")
	private short[] aShortArray53;

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
	private int anInt4682 = 0;

	@OriginalMember(owner = "client!wo", name = "n", descriptor = "I")
	private int anInt4690 = 4;

	@OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
	protected int anInt4688 = 4;

	@OriginalMember(owner = "client!wo", name = "r", descriptor = "[S")
	private final short[] aShortArray52 = new short[512];

	@OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
	private int anInt4689 = 4;

	@OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
	private int anInt4693 = 4;

	static {
		new Class256("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(IIIII)V")
	protected Class34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4682 = arg0;
		this.anInt4689 = arg2;
		this.anInt4693 = arg4;
		this.anInt4688 = arg1;
		this.anInt4690 = arg3;
		this.method3795();
		this.method3792();
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)V")
	private void method3792() {
		@Pc(12) Random local12 = new Random((long) this.anInt4682);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray52[local14] = (short) local14;
		}
		for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
			@Pc(42) int local42 = 255 - local30;
			@Pc(47) int local47 = Static159.method2512(local42, local12);
			@Pc(52) short local52 = this.aShortArray52[local47];
			this.aShortArray52[local47] = this.aShortArray52[local42];
			this.aShortArray52[local42] = this.aShortArray52[local42 + 256] = local52;
		}
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(B)V")
	protected abstract void method3793();

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)V")
	protected abstract void method3794(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
	private void method3795() {
		this.aShortArray53 = new short[this.anInt4688];
		for (@Pc(20) int local20 = 0; local20 < this.anInt4688; local20++) {
			this.aShortArray53[local20] = (short) Math.pow(2.0D, (double) local20);
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIII)V")
	protected final void method3796() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(15) int[] local15 = new int[128];
		for (@Pc(17) int local17 = 0; local17 < 128; local17++) {
			local8[local17] = (local17 << 12) / 128;
		}
		@Pc(34) int[] local34 = new int[16];
		for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
			local15[local36] = (local36 << 12) / 128;
		}
		for (@Pc(56) int local56 = 0; local56 < 16; local56++) {
			local34[local56] = (local56 << 12) / 16;
		}
		this.method3798();
		for (@Pc(75) int local75 = 0; local75 < 16; local75++) {
			for (@Pc(79) int local79 = 0; local79 < 128; local79++) {
				for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
					for (@Pc(87) int local87 = 0; local87 < this.anInt4688; local87++) {
						@Pc(96) int local96 = this.aShortArray53[local87] << 12;
						@Pc(103) int local103 = this.anInt4690 * local96 >> 12;
						@Pc(110) int local110 = local96 * this.anInt4689 >> 12;
						@Pc(117) int local117 = local96 * this.anInt4693 >> 12;
						@Pc(125) int local125 = local8[local83] * local96 >> 12;
						@Pc(133) int local133 = local15[local79] * local96 >> 12;
						@Pc(141) int local141 = local96 * local34[local75] >> 12;
						@Pc(146) int local146 = local141 * this.anInt4693;
						@Pc(151) int local151 = local133 * this.anInt4690;
						@Pc(156) int local156 = local125 * this.anInt4689;
						@Pc(160) int local160 = local156 >> 12;
						@Pc(164) int local164 = local160 + 1;
						@Pc(168) int local168 = local151 >> 12;
						@Pc(172) int local172 = local160 & 0xFF;
						@Pc(176) int local176 = local168 + 1;
						@Pc(180) int local180 = local146 >> 12;
						@Pc(184) int local184 = local168 & 0xFF;
						@Pc(188) int local188 = local180 + 1;
						if (local176 < local103) {
							local176 &= 0xFF;
						} else {
							local176 = 0;
						}
						local180 &= 0xFF;
						local141 = local146 & 0xFFF;
						local125 = local156 & 0xFFF;
						local133 = local151 & 0xFFF;
						if (local110 > local164) {
							local164 &= 0xFF;
						} else {
							local164 = 0;
						}
						if (local188 < local117) {
							local188 &= 0xFF;
						} else {
							local188 = 0;
						}
						@Pc(245) int local245 = Class2_Sub1_Sub19.anIntArray269[local125];
						@Pc(249) int local249 = local125 - 4096;
						@Pc(254) short local254 = this.aShortArray52[local188];
						@Pc(258) int local258 = local141 - 4096;
						@Pc(262) int local262 = Class2_Sub1_Sub19.anIntArray269[local133];
						@Pc(266) int local266 = Class2_Sub1_Sub19.anIntArray269[local141];
						@Pc(271) short local271 = this.aShortArray52[local180];
						@Pc(275) int local275 = local133 - 4096;
						@Pc(282) short local282 = this.aShortArray52[local271 + local184];
						@Pc(289) short local289 = this.aShortArray52[local176 + local271];
						@Pc(297) short local297 = this.aShortArray52[local176 + local254];
						@Pc(304) short local304 = this.aShortArray52[local254 + local184];
						@Pc(316) int local316 = Static421.method5713(local125, this.aShortArray52[local282 + local172], local141, local133);
						@Pc(328) int local328 = Static421.method5713(local249, this.aShortArray52[local164 + local282], local141, local133);
						@Pc(339) int local339 = (local245 * (local328 - local316) >> 12) + local316;
						@Pc(351) int local351 = Static421.method5713(local125, this.aShortArray52[local172 + local289], local141, local275);
						@Pc(364) int local364 = Static421.method5713(local249, this.aShortArray52[local164 + local289], local141, local275);
						@Pc(375) int local375 = ((local364 - local351) * local245 >> 12) + local351;
						@Pc(386) int local386 = ((local375 - local339) * local262 >> 12) + local339;
						@Pc(398) int local398 = Static421.method5713(local125, this.aShortArray52[local304 + local172], local258, local133);
						@Pc(410) int local410 = Static421.method5713(local249, this.aShortArray52[local164 + local304], local258, local133);
						@Pc(421) int local421 = (local245 * (local410 - local398) >> 12) + local398;
						@Pc(433) int local433 = Static421.method5713(local125, this.aShortArray52[local297 + local172], local258, local275);
						@Pc(445) int local445 = Static421.method5713(local249, this.aShortArray52[local297 + local164], local258, local275);
						@Pc(456) int local456 = local433 + (local245 * (local445 - local433) >> 12);
						@Pc(467) int local467 = local421 + ((local456 - local421) * local262 >> 12);
						this.method3794(local87, (local266 * (local467 - local386) >> 12) + local386);
					}
					this.method3793();
				}
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V")
	protected abstract void method3798();
}
