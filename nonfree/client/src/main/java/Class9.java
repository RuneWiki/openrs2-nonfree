import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public abstract class Class9 {

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
	private int anInt656 = 4;

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "[S")
	private final short[] aShortArray30 = new short[512];

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
	protected int anInt660 = 4;

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
	private int anInt663 = 0;

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
	private int anInt655 = 4;

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
	private int anInt665 = 4;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(IIIII)V")
	protected Class9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt655 = arg2;
		this.anInt665 = arg3;
		this.anInt656 = arg4;
		this.anInt663 = arg0;
		this.anInt660 = arg1;
		this.method839();
		this.method837();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
	private void method837() {
		@Pc(16) Random local16 = new Random((long) this.anInt663);
		for (@Pc(18) int local18 = 0; local18 < 255; local18++) {
			this.aShortArray30[local18] = (short) local18;
		}
		for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
			@Pc(38) int local38 = 255 - local32;
			@Pc(43) int local43 = Static188.method3700(local16, local38);
			@Pc(48) short local48 = this.aShortArray30[local43];
			this.aShortArray30[local43] = this.aShortArray30[local38];
			this.aShortArray30[local38] = this.aShortArray30[local38 + 256] = local48;
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
	protected abstract void method838();

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
	private void method839() {
		this.aShortArray29 = new short[this.anInt660];
		for (@Pc(12) int local12 = 0; local12 < this.anInt660; local12++) {
			this.aShortArray29[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V")
	protected abstract void method840();

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZI)V")
	protected abstract void method842(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIII)V")
	protected final void method844() {
		@Pc(12) int[] local12 = new int[128];
		@Pc(15) int[] local15 = new int[128];
		@Pc(18) int[] local18 = new int[16];
		for (@Pc(20) int local20 = 0; local20 < 128; local20++) {
			local12[local20] = (local20 << 12) / 128;
		}
		for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
			local15[local36] = (local36 << 12) / 128;
		}
		for (@Pc(52) int local52 = 0; local52 < 16; local52++) {
			local18[local52] = (local52 << 12) / 16;
		}
		this.method838();
		for (@Pc(73) int local73 = 0; local73 < 16; local73++) {
			for (@Pc(77) int local77 = 0; local77 < 128; local77++) {
				for (@Pc(81) int local81 = 0; local81 < 128; local81++) {
					for (@Pc(85) int local85 = 0; local85 < this.anInt660; local85++) {
						@Pc(94) int local94 = this.aShortArray29[local85] << 12;
						@Pc(101) int local101 = local94 * this.anInt665 >> 12;
						@Pc(108) int local108 = local94 * this.anInt656 >> 12;
						@Pc(115) int local115 = local94 * this.anInt655 >> 12;
						@Pc(123) int local123 = local94 * local12[local81] >> 12;
						@Pc(131) int local131 = local15[local77] * local94 >> 12;
						@Pc(139) int local139 = local18[local73] * local94 >> 12;
						@Pc(144) int local144 = local123 * this.anInt655;
						@Pc(149) int local149 = local131 * this.anInt665;
						@Pc(154) int local154 = local139 * this.anInt656;
						@Pc(158) int local158 = local144 >> 12;
						@Pc(162) int local162 = local158 + 1;
						@Pc(166) int local166 = local149 >> 12;
						@Pc(170) int local170 = local158 & 0xFF;
						@Pc(174) int local174 = local166 + 1;
						@Pc(178) int local178 = local154 >> 12;
						@Pc(182) int local182 = local166 & 0xFF;
						@Pc(186) int local186 = local178 + 1;
						@Pc(190) int local190 = local149 & 0xFFF;
						if (local101 <= local174) {
							local174 = 0;
						} else {
							local174 &= 0xFF;
						}
						local178 &= 0xFF;
						if (local115 > local162) {
							local162 &= 0xFF;
						} else {
							local162 = 0;
						}
						local139 = local154 & 0xFFF;
						local123 = local144 & 0xFFF;
						if (local108 > local186) {
							local186 &= 0xFF;
						} else {
							local186 = 0;
						}
						@Pc(247) int local247 = Class100.anIntArray266[local123];
						@Pc(251) int local251 = Class100.anIntArray266[local190];
						@Pc(256) short local256 = this.aShortArray30[local186];
						@Pc(260) int local260 = local123 - 4096;
						@Pc(265) short local265 = this.aShortArray30[local178];
						@Pc(269) int local269 = Class100.anIntArray266[local139];
						@Pc(273) int local273 = local190 - 4096;
						@Pc(277) int local277 = local139 - 4096;
						@Pc(284) short local284 = this.aShortArray30[local182 + local256];
						@Pc(292) short local292 = this.aShortArray30[local174 + local256];
						@Pc(299) short local299 = this.aShortArray30[local265 + local182];
						@Pc(306) short local306 = this.aShortArray30[local174 + local265];
						@Pc(319) int local319 = Static18.method671(local123, local139, this.aShortArray30[local170 + local299], local190);
						@Pc(331) int local331 = Static18.method671(local260, local139, this.aShortArray30[local299 + local162], local190);
						@Pc(342) int local342 = local319 + ((local331 - local319) * local247 >> 12);
						@Pc(354) int local354 = Static18.method671(local123, local139, this.aShortArray30[local306 + local170], local273);
						@Pc(368) int local368 = Static18.method671(local260, local139, this.aShortArray30[local306 + local162], local273);
						@Pc(379) int local379 = (local247 * (local368 - local354) >> 12) + local354;
						@Pc(390) int local390 = ((local379 - local342) * local251 >> 12) + local342;
						@Pc(403) int local403 = Static18.method671(local123, local277, this.aShortArray30[local170 + local284], local190);
						@Pc(415) int local415 = Static18.method671(local260, local277, this.aShortArray30[local284 + local162], local190);
						@Pc(427) int local427 = local403 + (local247 * (local415 - local403) >> 12);
						@Pc(439) int local439 = Static18.method671(local123, local277, this.aShortArray30[local170 + local292], local273);
						@Pc(453) int local453 = Static18.method671(local260, local277, this.aShortArray30[local292 + local162], local273);
						@Pc(464) int local464 = (local247 * (local453 - local439) >> 12) + local439;
						@Pc(475) int local475 = local427 + ((local464 - local427) * local251 >> 12);
						this.method842(local85, local390 + ((local475 - local390) * local269 >> 12));
					}
					this.method840();
				}
			}
		}
	}
}
