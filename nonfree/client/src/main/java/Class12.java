import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public abstract class Class12 {

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
	private int anInt8629 = 4;

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
	protected int anInt8630 = 4;

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
	private int anInt8633 = 0;

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
	private int anInt8635 = 4;

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "[S")
	private final short[] aShortArray116 = new short[512];

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
	private int anInt8639 = 4;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(IIIII)V")
	protected Class12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8630 = arg1;
		this.anInt8635 = arg3;
		this.anInt8629 = arg4;
		this.anInt8639 = arg2;
		this.anInt8633 = arg0;
		this.method7642();
		this.method7635();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZII)V")
	protected abstract void method7633(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
	protected abstract void method7634();

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
	private void method7635() {
		@Pc(12) Random local12 = new Random((long) this.anInt8633);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray116[local14] = (short) local14;
		}
		for (@Pc(38) int local38 = 0; local38 < 255; local38++) {
			@Pc(45) int local45 = 255 - local38;
			@Pc(50) int local50 = Static17.method7641(local45, local12);
			@Pc(55) short local55 = this.aShortArray116[local50];
			this.aShortArray116[local50] = this.aShortArray116[local45];
			this.aShortArray116[local45] = this.aShortArray116[local45 + 256] = local55;
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
	protected abstract void method7636();

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIII)V")
	protected final void method7640() {
		@Pc(17) int[] local17 = new int[128];
		@Pc(20) int[] local20 = new int[128];
		@Pc(23) int[] local23 = new int[16];
		for (@Pc(25) int local25 = 0; local25 < 128; local25++) {
			local17[local25] = (local25 << 12) / 128;
		}
		for (@Pc(45) int local45 = 0; local45 < 128; local45++) {
			local20[local45] = (local45 << 12) / 128;
		}
		for (@Pc(65) int local65 = 0; local65 < 16; local65++) {
			local23[local65] = (local65 << 12) / 16;
		}
		this.method7636();
		for (@Pc(90) int local90 = 0; local90 < 16; local90++) {
			for (@Pc(94) int local94 = 0; local94 < 128; local94++) {
				for (@Pc(98) int local98 = 0; local98 < 128; local98++) {
					for (@Pc(102) int local102 = 0; local102 < this.anInt8630; local102++) {
						@Pc(111) int local111 = this.aShortArray115[local102] << 12;
						@Pc(119) int local119 = local111 * local17[local98] >> 12;
						@Pc(126) int local126 = local111 * this.anInt8629 >> 12;
						@Pc(133) int local133 = local111 * this.anInt8639 >> 12;
						@Pc(140) int local140 = local111 * this.anInt8635 >> 12;
						@Pc(148) int local148 = local111 * local23[local90] >> 12;
						@Pc(156) int local156 = local20[local94] * local111 >> 12;
						@Pc(161) int local161 = local119 * this.anInt8639;
						@Pc(166) int local166 = local148 * this.anInt8629;
						@Pc(171) int local171 = local156 * this.anInt8635;
						@Pc(175) int local175 = local161 >> 12;
						@Pc(179) int local179 = local175 + 1;
						@Pc(183) int local183 = local171 >> 12;
						@Pc(187) int local187 = local175 & 0xFF;
						@Pc(191) int local191 = local183 + 1;
						@Pc(195) int local195 = local183 & 0xFF;
						@Pc(199) int local199 = local166 >> 12;
						@Pc(203) int local203 = local199 + 1;
						if (local191 >= local140) {
							local191 = 0;
						} else {
							local191 &= 0xFF;
						}
						local156 = local171 & 0xFFF;
						local199 &= 0xFF;
						local148 = local166 & 0xFFF;
						if (local126 <= local203) {
							local203 = 0;
						} else {
							local203 &= 0xFF;
						}
						local119 = local161 & 0xFFF;
						if (local179 >= local133) {
							local179 = 0;
						} else {
							local179 &= 0xFF;
						}
						@Pc(257) short local257 = this.aShortArray116[local203];
						@Pc(261) int local261 = local119 - 4096;
						@Pc(265) int local265 = Class306.anIntArray446[local156];
						@Pc(269) int local269 = Class306.anIntArray446[local119];
						@Pc(274) short local274 = this.aShortArray116[local199];
						@Pc(278) int local278 = Class306.anIntArray446[local148];
						@Pc(282) int local282 = local148 - 4096;
						@Pc(286) int local286 = local156 - 4096;
						@Pc(294) short local294 = this.aShortArray116[local195 + local257];
						@Pc(302) short local302 = this.aShortArray116[local191 + local257];
						@Pc(310) short local310 = this.aShortArray116[local195 + local274];
						@Pc(318) short local318 = this.aShortArray116[local191 + local274];
						@Pc(333) int local333 = Static312.method5101(this.aShortArray116[local187 + local310], local148, local119, local156);
						@Pc(347) int local347 = Static312.method5101(this.aShortArray116[local179 + local310], local148, local261, local156);
						@Pc(358) int local358 = (local269 * (local347 - local333) >> 12) + local333;
						@Pc(371) int local371 = Static312.method5101(this.aShortArray116[local187 + local318], local148, local119, local286);
						@Pc(383) int local383 = Static312.method5101(this.aShortArray116[local318 + local179], local148, local261, local286);
						@Pc(394) int local394 = ((local383 - local371) * local269 >> 12) + local371;
						@Pc(404) int local404 = local358 + (local265 * (local394 - local358) >> 12);
						@Pc(419) int local419 = Static312.method5101(this.aShortArray116[local187 + local294], local282, local119, local156);
						@Pc(431) int local431 = Static312.method5101(this.aShortArray116[local294 + local179], local282, local261, local156);
						@Pc(443) int local443 = local419 + ((local431 - local419) * local269 >> 12);
						@Pc(455) int local455 = Static312.method5101(this.aShortArray116[local302 + local187], local282, local119, local286);
						@Pc(468) int local468 = Static312.method5101(this.aShortArray116[local179 + local302], local282, local261, local286);
						@Pc(479) int local479 = local455 + (local269 * (local468 - local455) >> 12);
						@Pc(490) int local490 = ((local479 - local443) * local265 >> 12) + local443;
						this.method7633(local102, ((local490 - local404) * local278 >> 12) + local404);
					}
					this.method7634();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V")
	private void method7642() {
		this.aShortArray115 = new short[this.anInt8630];
		for (@Pc(12) int local12 = 0; local12 < this.anInt8630; local12++) {
			this.aShortArray115[local12] = (short) (int) Math.pow(2.0D, (double) local12);
		}
	}
}
