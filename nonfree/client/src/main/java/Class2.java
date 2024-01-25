import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public abstract class Class2 {

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "[S")
	private short[] aShortArray117;

	@OriginalMember(owner = "client!lca", name = "e", descriptor = "I")
	private int anInt7427 = 4;

	@OriginalMember(owner = "client!lca", name = "f", descriptor = "I")
	protected int anInt7428 = 4;

	@OriginalMember(owner = "client!lca", name = "h", descriptor = "I")
	private int anInt7429 = 0;

	@OriginalMember(owner = "client!lca", name = "g", descriptor = "[S")
	private final short[] aShortArray118 = new short[512];

	@OriginalMember(owner = "client!lca", name = "j", descriptor = "I")
	private int anInt7431 = 4;

	@OriginalMember(owner = "client!lca", name = "m", descriptor = "I")
	private int anInt7433 = 4;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(IIIII)V")
	protected Class2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt7433 = arg2;
		this.anInt7429 = arg0;
		this.anInt7431 = arg4;
		this.anInt7428 = arg1;
		this.anInt7427 = arg3;
		this.method6196();
		this.method6201();
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)V")
	private void method6196() {
		this.aShortArray117 = new short[this.anInt7428];
		for (@Pc(18) int local18 = 0; local18 < this.anInt7428; local18++) {
			this.aShortArray117[local18] = (short) Math.pow(2.0D, (double) local18);
		}
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(B)V")
	protected abstract void method6198();

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V")
	protected abstract void method6200();

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "(B)V")
	private void method6201() {
		@Pc(12) Random local12 = new Random((long) this.anInt7429);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray118[local14] = (short) local14;
		}
		for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
			@Pc(39) int local39 = 255 - local32;
			@Pc(44) int local44 = Static164.method2981(local12, local39);
			@Pc(49) short local49 = this.aShortArray118[local44];
			this.aShortArray118[local44] = this.aShortArray118[local39];
			this.aShortArray118[local39] = this.aShortArray118[local39 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIII)V")
	protected final void method6202() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		@Pc(14) int[] local14 = new int[16];
		for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
			local8[local16] = (local16 << 12) / 128;
		}
		for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
			local11[local36] = (local36 << 12) / 128;
		}
		for (@Pc(56) int local56 = 0; local56 < 16; local56++) {
			local14[local56] = (local56 << 12) / 16;
		}
		this.method6200();
		for (@Pc(87) int local87 = 0; local87 < 16; local87++) {
			for (@Pc(91) int local91 = 0; local91 < 128; local91++) {
				for (@Pc(95) int local95 = 0; local95 < 128; local95++) {
					for (@Pc(99) int local99 = 0; local99 < this.anInt7428; local99++) {
						@Pc(108) int local108 = this.aShortArray117[local99] << 12;
						@Pc(116) int local116 = local108 * local14[local87] >> 12;
						@Pc(124) int local124 = local11[local91] * local108 >> 12;
						@Pc(131) int local131 = this.anInt7427 * local108 >> 12;
						@Pc(139) int local139 = local108 * local8[local95] >> 12;
						@Pc(146) int local146 = this.anInt7431 * local108 >> 12;
						@Pc(153) int local153 = local108 * this.anInt7433 >> 12;
						@Pc(158) int local158 = local139 * this.anInt7433;
						@Pc(163) int local163 = local116 * this.anInt7431;
						@Pc(168) int local168 = local124 * this.anInt7427;
						@Pc(172) int local172 = local158 >> 12;
						@Pc(176) int local176 = local172 + 1;
						@Pc(180) int local180 = local168 >> 12;
						@Pc(184) int local184 = local172 & 0xFF;
						@Pc(188) int local188 = local180 + 1;
						@Pc(192) int local192 = local163 >> 12;
						@Pc(196) int local196 = local180 & 0xFF;
						@Pc(200) int local200 = local192 + 1;
						@Pc(204) int local204 = local168 & 0xFFF;
						if (local146 > local200) {
							local200 &= 0xFF;
						} else {
							local200 = 0;
						}
						local116 = local163 & 0xFFF;
						if (local188 >= local131) {
							local188 = 0;
						} else {
							local188 &= 0xFF;
						}
						local192 &= 0xFF;
						if (local153 > local176) {
							local176 &= 0xFF;
						} else {
							local176 = 0;
						}
						local139 = local158 & 0xFFF;
						@Pc(261) int local261 = Class355.anIntArray591[local139];
						@Pc(266) short local266 = this.aShortArray118[local192];
						@Pc(270) int local270 = Class355.anIntArray591[local204];
						@Pc(274) int local274 = local204 - 4096;
						@Pc(278) int local278 = Class355.anIntArray591[local116];
						@Pc(283) short local283 = this.aShortArray118[local200];
						@Pc(287) int local287 = local116 - 4096;
						@Pc(291) int local291 = local139 - 4096;
						@Pc(299) short local299 = this.aShortArray118[local196 + local266];
						@Pc(306) short local306 = this.aShortArray118[local188 + local266];
						@Pc(314) short local314 = this.aShortArray118[local196 + local283];
						@Pc(321) short local321 = this.aShortArray118[local283 + local188];
						@Pc(333) int local333 = Static239.method3674(local204, local116, local139, this.aShortArray118[local299 + local184]);
						@Pc(345) int local345 = Static239.method3674(local204, local116, local291, this.aShortArray118[local299 + local176]);
						@Pc(356) int local356 = local333 + ((local345 - local333) * local261 >> 12);
						@Pc(368) int local368 = Static239.method3674(local274, local116, local139, this.aShortArray118[local306 + local184]);
						@Pc(381) int local381 = Static239.method3674(local274, local116, local291, this.aShortArray118[local176 + local306]);
						@Pc(391) int local391 = local368 + ((local381 - local368) * local261 >> 12);
						@Pc(404) int local404 = Static239.method3674(local204, local287, local139, this.aShortArray118[local184 + local314]);
						@Pc(415) int local415 = local356 + (local270 * (local391 - local356) >> 12);
						@Pc(427) int local427 = Static239.method3674(local204, local287, local291, this.aShortArray118[local314 + local176]);
						@Pc(438) int local438 = ((local427 - local404) * local261 >> 12) + local404;
						@Pc(451) int local451 = Static239.method3674(local274, local287, local139, this.aShortArray118[local184 + local321]);
						@Pc(463) int local463 = Static239.method3674(local274, local287, local291, this.aShortArray118[local321 + local176]);
						@Pc(474) int local474 = (local261 * (local463 - local451) >> 12) + local451;
						@Pc(485) int local485 = (local270 * (local474 - local438) >> 12) + local438;
						this.method6204(local415 + ((local485 - local415) * local278 >> 12), local99);
					}
					this.method6198();
				}
			}
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(III)V")
	protected abstract void method6204(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
