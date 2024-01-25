import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaa")
public abstract class Class50 {

	@OriginalMember(owner = "client!jaa", name = "o", descriptor = "[S")
	private short[] aShortArray83;

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "I")
	private int anInt6197 = 4;

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "[S")
	private final short[] aShortArray82 = new short[512];

	@OriginalMember(owner = "client!jaa", name = "i", descriptor = "I")
	private int anInt6201 = 4;

	@OriginalMember(owner = "client!jaa", name = "m", descriptor = "I")
	private int anInt6204 = 4;

	@OriginalMember(owner = "client!jaa", name = "n", descriptor = "I")
	private int anInt6205 = 0;

	@OriginalMember(owner = "client!jaa", name = "j", descriptor = "I")
	protected int anInt6202 = 4;

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(IIIII)V")
	protected Class50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6197 = arg4;
		this.anInt6202 = arg1;
		this.anInt6204 = arg3;
		this.anInt6201 = arg2;
		this.anInt6205 = arg0;
		this.method5242();
		this.method5243();
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIBI)V")
	protected final void method5238() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		@Pc(14) int[] local14 = new int[16];
		for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
			local8[local16] = (local16 << 12) / 128;
		}
		for (@Pc(32) int local32 = 0; local32 < 128; local32++) {
			local11[local32] = (local32 << 12) / 128;
		}
		for (@Pc(52) int local52 = 0; local52 < 16; local52++) {
			local14[local52] = (local52 << 12) / 16;
		}
		this.method5240();
		for (@Pc(80) int local80 = 0; local80 < 16; local80++) {
			for (@Pc(84) int local84 = 0; local84 < 128; local84++) {
				for (@Pc(88) int local88 = 0; local88 < 128; local88++) {
					for (@Pc(92) int local92 = 0; local92 < this.anInt6202; local92++) {
						@Pc(101) int local101 = this.aShortArray83[local92] << 12;
						@Pc(108) int local108 = this.anInt6197 * local101 >> 12;
						@Pc(116) int local116 = local101 * local14[local80] >> 12;
						@Pc(124) int local124 = local101 * local8[local88] >> 12;
						@Pc(131) int local131 = local101 * this.anInt6201 >> 12;
						@Pc(138) int local138 = local101 * this.anInt6204 >> 12;
						@Pc(146) int local146 = local101 * local11[local84] >> 12;
						@Pc(151) int local151 = local116 * this.anInt6197;
						@Pc(156) int local156 = local124 * this.anInt6201;
						@Pc(161) int local161 = local146 * this.anInt6204;
						@Pc(165) int local165 = local156 >> 12;
						@Pc(169) int local169 = local165 + 1;
						@Pc(173) int local173 = local161 >> 12;
						@Pc(177) int local177 = local165 & 0xFF;
						@Pc(181) int local181 = local173 + 1;
						@Pc(185) int local185 = local151 >> 12;
						@Pc(189) int local189 = local173 & 0xFF;
						@Pc(193) int local193 = local185 + 1;
						if (local131 <= local169) {
							local169 = 0;
						} else {
							local169 &= 0xFF;
						}
						local124 = local156 & 0xFFF;
						if (local193 < local108) {
							local193 &= 0xFF;
						} else {
							local193 = 0;
						}
						local116 = local151 & 0xFFF;
						if (local181 < local138) {
							local181 &= 0xFF;
						} else {
							local181 = 0;
						}
						local185 &= 0xFF;
						local146 = local161 & 0xFFF;
						@Pc(247) short local247 = this.aShortArray82[local193];
						@Pc(252) short local252 = this.aShortArray82[local185];
						@Pc(256) int local256 = local146 - 4096;
						@Pc(260) int local260 = local124 - 4096;
						@Pc(264) int local264 = Class392.anIntArray715[local116];
						@Pc(268) int local268 = local116 - 4096;
						@Pc(272) int local272 = Class392.anIntArray715[local146];
						@Pc(276) int local276 = Class392.anIntArray715[local124];
						@Pc(284) short local284 = this.aShortArray82[local181 + local247];
						@Pc(292) short local292 = this.aShortArray82[local189 + local247];
						@Pc(299) short local299 = this.aShortArray82[local189 + local252];
						@Pc(307) short local307 = this.aShortArray82[local181 + local252];
						@Pc(320) int local320 = Static27.method6642(local116, local124, this.aShortArray82[local177 + local299], local146);
						@Pc(332) int local332 = Static27.method6642(local116, local260, this.aShortArray82[local299 + local169], local146);
						@Pc(343) int local343 = ((local332 - local320) * local276 >> 12) + local320;
						@Pc(355) int local355 = Static27.method6642(local116, local124, this.aShortArray82[local177 + local307], local256);
						@Pc(367) int local367 = Static27.method6642(local116, local260, this.aShortArray82[local169 + local307], local256);
						@Pc(378) int local378 = local355 + (local276 * (local367 - local355) >> 12);
						@Pc(391) int local391 = Static27.method6642(local268, local124, this.aShortArray82[local177 + local292], local146);
						@Pc(402) int local402 = (local272 * (local378 - local343) >> 12) + local343;
						@Pc(414) int local414 = Static27.method6642(local268, local260, this.aShortArray82[local292 + local169], local146);
						@Pc(425) int local425 = ((local414 - local391) * local276 >> 12) + local391;
						@Pc(437) int local437 = Static27.method6642(local268, local124, this.aShortArray82[local284 + local177], local256);
						@Pc(449) int local449 = Static27.method6642(local268, local260, this.aShortArray82[local284 + local169], local256);
						@Pc(459) int local459 = ((local449 - local437) * local276 >> 12) + local437;
						@Pc(470) int local470 = local425 + ((local459 - local425) * local272 >> 12);
						this.method5244(local92, local402 + (local264 * (local470 - local402) >> 12));
					}
					this.method5241();
				}
			}
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B)V")
	protected abstract void method5240();

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "(I)V")
	protected abstract void method5241();

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "(I)V")
	private void method5242() {
		this.aShortArray83 = new short[this.anInt6202];
		for (@Pc(18) int local18 = 0; local18 < this.anInt6202; local18++) {
			this.aShortArray83[local18] = (short) (int) Math.pow(2.0D, (double) local18);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "e", descriptor = "(I)V")
	private void method5243() {
		@Pc(12) Random local12 = new Random((long) this.anInt6205);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray82[local14] = (short) local14;
		}
		for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
			@Pc(39) int local39 = 255 - local30;
			@Pc(44) int local44 = Static316.method4556(local12, local39);
			@Pc(49) short local49 = this.aShortArray82[local44];
			this.aShortArray82[local44] = this.aShortArray82[local39];
			this.aShortArray82[local39] = this.aShortArray82[local39 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(III)V")
	protected abstract void method5244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
