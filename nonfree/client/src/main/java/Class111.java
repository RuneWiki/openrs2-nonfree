import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public abstract class Class111 {

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
	private int anInt6586 = 4;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
	protected int anInt6588 = 4;

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
	private int anInt6589 = 0;

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
	private int anInt6590 = 4;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "[S")
	private final short[] aShortArray91 = new short[512];

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
	private int anInt6593 = 4;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(IIIII)V")
	protected Class111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6590 = arg4;
		this.anInt6589 = arg0;
		this.anInt6593 = arg3;
		this.anInt6586 = arg2;
		this.anInt6588 = arg1;
		this.method5108();
		this.method5104();
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)V")
	protected abstract void method5103();

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	private void method5104() {
		@Pc(12) Random local12 = new Random((long) this.anInt6589);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray91[local14] = (short) local14;
		}
		for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
			@Pc(43) int local43 = 255 - local30;
			@Pc(48) int local48 = Static175.method2474(local43, local12);
			@Pc(53) short local53 = this.aShortArray91[local48];
			this.aShortArray91[local48] = this.aShortArray91[local43];
			this.aShortArray91[local43] = this.aShortArray91[local43 + 256] = local53;
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	protected abstract void method5105();

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)V")
	protected final void method5107() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		@Pc(14) int[] local14 = new int[16];
		for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
			local8[local16] = (local16 << 12) / 128;
		}
		for (@Pc(32) int local32 = 0; local32 < 128; local32++) {
			local11[local32] = (local32 << 12) / 128;
		}
		for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
			local14[local58] = (local58 << 12) / 16;
		}
		this.method5103();
		for (@Pc(77) int local77 = 0; local77 < 16; local77++) {
			for (@Pc(81) int local81 = 0; local81 < 128; local81++) {
				for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
					for (@Pc(89) int local89 = 0; local89 < this.anInt6588; local89++) {
						@Pc(98) int local98 = this.aShortArray92[local89] << 12;
						@Pc(106) int local106 = local98 * local11[local81] >> 12;
						@Pc(113) int local113 = local98 * this.anInt6593 >> 12;
						@Pc(121) int local121 = local98 * local14[local77] >> 12;
						@Pc(128) int local128 = local98 * this.anInt6590 >> 12;
						@Pc(135) int local135 = this.anInt6586 * local98 >> 12;
						@Pc(143) int local143 = local8[local85] * local98 >> 12;
						@Pc(148) int local148 = local106 * this.anInt6593;
						@Pc(153) int local153 = local121 * this.anInt6590;
						@Pc(158) int local158 = local143 * this.anInt6586;
						@Pc(162) int local162 = local158 >> 12;
						@Pc(166) int local166 = local162 + 1;
						@Pc(170) int local170 = local148 >> 12;
						@Pc(174) int local174 = local162 & 0xFF;
						@Pc(178) int local178 = local170 + 1;
						@Pc(182) int local182 = local170 & 0xFF;
						@Pc(186) int local186 = local153 >> 12;
						@Pc(190) int local190 = local186 + 1;
						if (local113 > local178) {
							local178 &= 0xFF;
						} else {
							local178 = 0;
						}
						if (local135 <= local166) {
							local166 = 0;
						} else {
							local166 &= 0xFF;
						}
						if (local190 >= local128) {
							local190 = 0;
						} else {
							local190 &= 0xFF;
						}
						local106 = local148 & 0xFFF;
						local186 &= 0xFF;
						local143 = local158 & 0xFFF;
						local121 = local153 & 0xFFF;
						@Pc(247) int local247 = Class2_Sub2_Sub16.anIntArray208[local143];
						@Pc(251) int local251 = local121 - 4096;
						@Pc(255) int local255 = local143 - 4096;
						@Pc(259) int local259 = local106 - 4096;
						@Pc(264) short local264 = this.aShortArray91[local186];
						@Pc(268) int local268 = Class2_Sub2_Sub16.anIntArray208[local121];
						@Pc(273) short local273 = this.aShortArray91[local190];
						@Pc(277) int local277 = Class2_Sub2_Sub16.anIntArray208[local106];
						@Pc(285) short local285 = this.aShortArray91[local182 + local264];
						@Pc(292) short local292 = this.aShortArray91[local182 + local273];
						@Pc(299) short local299 = this.aShortArray91[local273 + local178];
						@Pc(306) short local306 = this.aShortArray91[local264 + local178];
						@Pc(319) int local319 = Static456.method5712(local121, local106, this.aShortArray91[local174 + local285], local143);
						@Pc(331) int local331 = Static456.method5712(local121, local106, this.aShortArray91[local285 + local166], local255);
						@Pc(342) int local342 = ((local331 - local319) * local247 >> 12) + local319;
						@Pc(354) int local354 = Static456.method5712(local121, local259, this.aShortArray91[local306 + local174], local143);
						@Pc(366) int local366 = Static456.method5712(local121, local259, this.aShortArray91[local306 + local166], local255);
						@Pc(377) int local377 = local354 + (local247 * (local366 - local354) >> 12);
						@Pc(391) int local391 = Static456.method5712(local251, local106, this.aShortArray91[local174 + local292], local143);
						@Pc(402) int local402 = ((local377 - local342) * local277 >> 12) + local342;
						@Pc(414) int local414 = Static456.method5712(local251, local106, this.aShortArray91[local166 + local292], local255);
						@Pc(424) int local424 = local391 + ((local414 - local391) * local247 >> 12);
						@Pc(436) int local436 = Static456.method5712(local251, local259, this.aShortArray91[local174 + local299], local143);
						@Pc(448) int local448 = Static456.method5712(local251, local259, this.aShortArray91[local299 + local166], local255);
						@Pc(459) int local459 = ((local448 - local436) * local247 >> 12) + local436;
						@Pc(470) int local470 = ((local459 - local424) * local277 >> 12) + local424;
						this.method5109((local268 * (local470 - local402) >> 12) + local402, local89);
					}
					this.method5105();
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
	private void method5108() {
		this.aShortArray92 = new short[this.anInt6588];
		for (@Pc(12) int local12 = 0; local12 < this.anInt6588; local12++) {
			this.aShortArray92[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIB)V")
	protected abstract void method5109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
