import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public abstract class Class60 {

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
	private int anInt4931 = 4;

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
	private int anInt4938 = 4;

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
	private int anInt4934 = 0;

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
	private int anInt4941 = 4;

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
	protected int anInt4935 = 4;

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "[S")
	private final short[] aShortArray67 = new short[512];

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(IIIII)V")
	protected Class60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4941 = arg4;
		this.anInt4935 = arg1;
		this.anInt4938 = arg3;
		this.anInt4931 = arg2;
		this.anInt4934 = arg0;
		this.method4162();
		this.method4157();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	protected abstract void method4152();

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII)V")
	protected final void method4154() {
		@Pc(14) int[] local14 = new int[128];
		@Pc(17) int[] local17 = new int[128];
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			local14[local19] = (local19 << 12) / 128;
		}
		@Pc(36) int[] local36 = new int[16];
		for (@Pc(38) int local38 = 0; local38 < 128; local38++) {
			local17[local38] = (local38 << 12) / 128;
		}
		for (@Pc(54) int local54 = 0; local54 < 16; local54++) {
			local36[local54] = (local54 << 12) / 16;
		}
		this.method4158();
		for (@Pc(77) int local77 = 0; local77 < 16; local77++) {
			for (@Pc(81) int local81 = 0; local81 < 128; local81++) {
				for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
					for (@Pc(89) int local89 = 0; local89 < this.anInt4935; local89++) {
						@Pc(98) int local98 = this.aShortArray68[local89] << 12;
						@Pc(105) int local105 = local98 * this.anInt4941 >> 12;
						@Pc(112) int local112 = local98 * this.anInt4931 >> 12;
						@Pc(120) int local120 = local98 * local17[local81] >> 12;
						@Pc(128) int local128 = local36[local77] * local98 >> 12;
						@Pc(136) int local136 = local14[local85] * local98 >> 12;
						@Pc(143) int local143 = this.anInt4938 * local98 >> 12;
						@Pc(148) int local148 = local136 * this.anInt4931;
						@Pc(153) int local153 = local120 * this.anInt4938;
						@Pc(158) int local158 = local128 * this.anInt4941;
						@Pc(162) int local162 = local148 >> 12;
						@Pc(166) int local166 = local162 + 1;
						@Pc(170) int local170 = local153 >> 12;
						@Pc(174) int local174 = local162 & 0xFF;
						@Pc(178) int local178 = local170 + 1;
						@Pc(182) int local182 = local170 & 0xFF;
						@Pc(186) int local186 = local158 >> 12;
						@Pc(190) int local190 = local186 + 1;
						@Pc(194) int local194 = local153 & 0xFFF;
						if (local190 >= local105) {
							local190 = 0;
						} else {
							local190 &= 0xFF;
						}
						if (local112 <= local166) {
							local166 = 0;
						} else {
							local166 &= 0xFF;
						}
						local186 &= 0xFF;
						local136 = local148 & 0xFFF;
						if (local178 >= local143) {
							local178 = 0;
						} else {
							local178 &= 0xFF;
						}
						local128 = local158 & 0xFFF;
						@Pc(255) int local255 = Class6_Sub37.anIntArray410[local128];
						@Pc(259) int local259 = Class6_Sub37.anIntArray410[local194];
						@Pc(263) int local263 = local194 - 4096;
						@Pc(267) int local267 = Class6_Sub37.anIntArray410[local136];
						@Pc(271) int local271 = local128 - 4096;
						@Pc(275) int local275 = local136 - 4096;
						@Pc(280) short local280 = this.aShortArray67[local190];
						@Pc(285) short local285 = this.aShortArray67[local186];
						@Pc(292) short local292 = this.aShortArray67[local280 + local182];
						@Pc(299) short local299 = this.aShortArray67[local178 + local285];
						@Pc(306) short local306 = this.aShortArray67[local285 + local182];
						@Pc(313) short local313 = this.aShortArray67[local280 + local178];
						@Pc(328) int local328 = Static221.method3324(local136, local194, this.aShortArray67[local174 + local306], local128);
						@Pc(340) int local340 = Static221.method3324(local275, local194, this.aShortArray67[local166 + local306], local128);
						@Pc(350) int local350 = ((local340 - local328) * local267 >> 12) + local328;
						@Pc(362) int local362 = Static221.method3324(local136, local263, this.aShortArray67[local174 + local299], local128);
						@Pc(374) int local374 = Static221.method3324(local275, local263, this.aShortArray67[local299 + local166], local128);
						@Pc(385) int local385 = ((local374 - local362) * local267 >> 12) + local362;
						@Pc(399) int local399 = Static221.method3324(local136, local194, this.aShortArray67[local292 + local174], local271);
						@Pc(410) int local410 = (local259 * (local385 - local350) >> 12) + local350;
						@Pc(422) int local422 = Static221.method3324(local275, local194, this.aShortArray67[local292 + local166], local271);
						@Pc(433) int local433 = (local267 * (local422 - local399) >> 12) + local399;
						@Pc(447) int local447 = Static221.method3324(local136, local263, this.aShortArray67[local313 + local174], local271);
						@Pc(459) int local459 = Static221.method3324(local275, local263, this.aShortArray67[local166 + local313], local271);
						@Pc(470) int local470 = ((local459 - local447) * local267 >> 12) + local447;
						@Pc(481) int local481 = (local259 * (local470 - local433) >> 12) + local433;
						this.method4160(local89, (local255 * (local481 - local410) >> 12) + local410);
					}
					this.method4152();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
	private void method4157() {
		@Pc(12) Random local12 = new Random((long) this.anInt4934);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray67[local14] = (short) local14;
		}
		for (@Pc(38) int local38 = 0; local38 < 255; local38++) {
			@Pc(45) int local45 = 255 - local38;
			@Pc(50) int local50 = Static267.method4083(local12, local45);
			@Pc(55) short local55 = this.aShortArray67[local50];
			this.aShortArray67[local50] = this.aShortArray67[local45];
			this.aShortArray67[local45] = this.aShortArray67[local45 + 256] = local55;
		}
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
	protected abstract void method4158();

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(III)V")
	protected abstract void method4160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)V")
	private void method4162() {
		this.aShortArray68 = new short[this.anInt4935];
		for (@Pc(12) int local12 = 0; local12 < this.anInt4935; local12++) {
			this.aShortArray68[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}
}
