import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public abstract class Class6 {

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "[S")
	private short[] aShortArray109;

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
	private int anInt6067 = 4;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
	private int anInt6072 = 4;

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
	private int anInt6065 = 0;

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
	private int anInt6068 = 4;

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "[S")
	private final short[] aShortArray110 = new short[512];

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
	protected int anInt6076 = 4;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIII)V")
	protected Class6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6068 = arg3;
		this.anInt6072 = arg2;
		this.anInt6065 = arg0;
		this.anInt6067 = arg4;
		this.anInt6076 = arg1;
		this.method5166();
		this.method5162();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIBI)V")
	protected final void method5159() {
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
		this.method5160();
		for (@Pc(77) int local77 = 0; local77 < 16; local77++) {
			for (@Pc(81) int local81 = 0; local81 < 128; local81++) {
				for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
					for (@Pc(89) int local89 = 0; local89 < this.anInt6076; local89++) {
						@Pc(98) int local98 = this.aShortArray109[local89] << 12;
						@Pc(105) int local105 = this.anInt6067 * local98 >> 12;
						@Pc(113) int local113 = local17[local81] * local98 >> 12;
						@Pc(121) int local121 = local98 * local36[local77] >> 12;
						@Pc(128) int local128 = this.anInt6072 * local98 >> 12;
						@Pc(136) int local136 = local98 * local14[local85] >> 12;
						@Pc(143) int local143 = local98 * this.anInt6068 >> 12;
						@Pc(148) int local148 = local113 * this.anInt6068;
						@Pc(153) int local153 = local121 * this.anInt6067;
						@Pc(158) int local158 = local136 * this.anInt6072;
						@Pc(162) int local162 = local158 >> 12;
						@Pc(166) int local166 = local162 + 1;
						@Pc(170) int local170 = local148 >> 12;
						@Pc(174) int local174 = local162 & 0xFF;
						@Pc(178) int local178 = local170 + 1;
						@Pc(182) int local182 = local170 & 0xFF;
						@Pc(186) int local186 = local153 >> 12;
						@Pc(190) int local190 = local186 + 1;
						@Pc(194) int local194 = local153 & 0xFFF;
						@Pc(198) int local198 = local158 & 0xFFF;
						if (local178 < local143) {
							local178 &= 0xFF;
						} else {
							local178 = 0;
						}
						if (local190 >= local105) {
							local190 = 0;
						} else {
							local190 &= 0xFF;
						}
						if (local166 < local128) {
							local166 &= 0xFF;
						} else {
							local166 = 0;
						}
						local186 &= 0xFF;
						local113 = local148 & 0xFFF;
						@Pc(247) int local247 = local194 - 4096;
						@Pc(251) int local251 = local198 - 4096;
						@Pc(255) int local255 = local113 - 4096;
						@Pc(259) int local259 = Class79.anIntArray532[local194];
						@Pc(264) short local264 = this.aShortArray110[local186];
						@Pc(268) int local268 = Class79.anIntArray532[local113];
						@Pc(273) short local273 = this.aShortArray110[local190];
						@Pc(277) int local277 = Class79.anIntArray532[local198];
						@Pc(284) short local284 = this.aShortArray110[local273 + local182];
						@Pc(291) short local291 = this.aShortArray110[local273 + local178];
						@Pc(298) short local298 = this.aShortArray110[local264 + local182];
						@Pc(305) short local305 = this.aShortArray110[local264 + local178];
						@Pc(317) int local317 = Static138.method2269(local198, local113, this.aShortArray110[local298 + local174], local194);
						@Pc(329) int local329 = Static138.method2269(local251, local113, this.aShortArray110[local166 + local298], local194);
						@Pc(340) int local340 = ((local329 - local317) * local277 >> 12) + local317;
						@Pc(352) int local352 = Static138.method2269(local198, local255, this.aShortArray110[local305 + local174], local194);
						@Pc(365) int local365 = Static138.method2269(local251, local255, this.aShortArray110[local166 + local305], local194);
						@Pc(375) int local375 = (local277 * (local365 - local352) >> 12) + local352;
						@Pc(386) int local386 = (local268 * (local375 - local340) >> 12) + local340;
						@Pc(398) int local398 = Static138.method2269(local198, local113, this.aShortArray110[local174 + local284], local247);
						@Pc(410) int local410 = Static138.method2269(local251, local113, this.aShortArray110[local166 + local284], local247);
						@Pc(422) int local422 = local398 + ((local410 - local398) * local277 >> 12);
						@Pc(434) int local434 = Static138.method2269(local198, local255, this.aShortArray110[local291 + local174], local247);
						@Pc(446) int local446 = Static138.method2269(local251, local255, this.aShortArray110[local291 + local166], local247);
						@Pc(457) int local457 = local434 + ((local446 - local434) * local277 >> 12);
						@Pc(468) int local468 = (local268 * (local457 - local422) >> 12) + local422;
						this.method5165(local386 + ((local468 - local386) * local259 >> 12), local89);
					}
					this.method5164();
				}
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
	protected abstract void method5160();

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	private void method5162() {
		@Pc(12) Random local12 = new Random((long) this.anInt6065);
		for (@Pc(20) int local20 = 0; local20 < 255; local20++) {
			this.aShortArray110[local20] = (short) local20;
		}
		for (@Pc(36) int local36 = 0; local36 < 255; local36++) {
			@Pc(42) int local42 = 255 - local36;
			@Pc(47) int local47 = Static54.method915(local42, local12);
			@Pc(52) short local52 = this.aShortArray110[local47];
			this.aShortArray110[local47] = this.aShortArray110[local42];
			this.aShortArray110[local42] = this.aShortArray110[local42 + 256] = local52;
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V")
	protected abstract void method5164();

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BII)V")
	protected abstract void method5165(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)V")
	private void method5166() {
		this.aShortArray109 = new short[this.anInt6076];
		for (@Pc(20) int local20 = 0; local20 < this.anInt6076; local20++) {
			this.aShortArray109[local20] = (short) Math.pow(2.0D, (double) local20);
		}
	}
}
