import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public abstract class Class40 {

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "[S")
	private short[] aShortArray141;

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
	private int anInt10259 = 4;

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
	protected int anInt10263 = 4;

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "[S")
	private short[] aShortArray142 = new short[512];

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
	private int anInt10265 = 0;

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
	private int anInt10264 = 4;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
	private int anInt10257 = 4;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(IIIII)V")
	protected Class40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt10259 = arg3;
		this.anInt10265 = arg0;
		this.anInt10263 = arg1;
		this.anInt10257 = arg2;
		this.anInt10264 = arg4;
		this.method8828();
		this.method8824();
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
	private void method8824() {
		@Pc(12) Random local12 = new Random((long) this.anInt10265);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray142[local14] = (short) local14;
		}
		@Pc(30) int local30 = 0;
		if (-105 != -105) {
			Static416.aClass109_216 = null;
		}
		while (local30 < 255) {
			@Pc(46) int local46 = 255 - local30;
			@Pc(51) int local51 = Static547.method7966(local46, local12);
			@Pc(56) short local56 = this.aShortArray142[local51];
			this.aShortArray142[local51] = this.aShortArray142[local46];
			this.aShortArray142[local46] = this.aShortArray142[local46 + 256] = local56;
			local30++;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
	private void method8828() {
		this.aShortArray141 = new short[this.anInt10263];
		for (@Pc(12) int local12 = 0; local12 < this.anInt10263; local12++) {
			this.aShortArray141[local12] = (short) (int) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIB)V")
	protected final void method8830(@OriginalArg(3) byte arg0) {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		@Pc(14) int[] local14 = new int[16];
		for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
			local8[local16] = (local16 << 12) / 128;
		}
		@Pc(34) int local34 = 0;
		if (arg0 > -77) {
			this.aShortArray142 = null;
		}
		while (local34 < 128) {
			local11[local34] = (local34 << 12) / 128;
			local34++;
		}
		for (@Pc(62) int local62 = 0; local62 < 16; local62++) {
			local14[local62] = (local62 << 12) / 16;
		}
		this.method8832();
		for (@Pc(89) int local89 = 0; local89 < 16; local89++) {
			for (@Pc(95) int local95 = 0; local95 < 128; local95++) {
				for (@Pc(99) int local99 = 0; local99 < 128; local99++) {
					for (@Pc(103) int local103 = 0; local103 < this.anInt10263; local103++) {
						@Pc(114) int local114 = this.aShortArray141[local103] << 12;
						@Pc(122) int local122 = local114 * local8[local99] >> 12;
						@Pc(129) int local129 = this.anInt10257 * local114 >> 12;
						@Pc(136) int local136 = this.anInt10259 * local114 >> 12;
						@Pc(144) int local144 = local114 * local14[local89] >> 12;
						@Pc(151) int local151 = local114 * this.anInt10264 >> 12;
						@Pc(159) int local159 = local114 * local11[local95] >> 12;
						@Pc(164) int local164 = local144 * this.anInt10264;
						@Pc(169) int local169 = local159 * this.anInt10259;
						@Pc(174) int local174 = local122 * this.anInt10257;
						@Pc(178) int local178 = local174 >> 12;
						@Pc(182) int local182 = local178 + 1;
						@Pc(186) int local186 = local178 & 0xFF;
						@Pc(190) int local190 = local169 >> 12;
						@Pc(194) int local194 = local190 + 1;
						@Pc(198) int local198 = local190 & 0xFF;
						@Pc(202) int local202 = local164 >> 12;
						@Pc(206) int local206 = local202 + 1;
						@Pc(210) int local210 = local169 & 0xFFF;
						@Pc(214) int local214 = local202 & 0xFF;
						@Pc(218) int local218 = local164 & 0xFFF;
						if (local182 < local129) {
							local182 &= 0xFF;
						} else {
							local182 = 0;
						}
						if (local206 >= local151) {
							local206 = 0;
						} else {
							local206 &= 0xFF;
						}
						local122 = local174 & 0xFFF;
						if (local136 <= local194) {
							local194 = 0;
						} else {
							local194 &= 0xFF;
						}
						@Pc(267) int local267 = Class22_Sub1.anIntArray30[local210];
						@Pc(272) short local272 = this.aShortArray142[local214];
						@Pc(276) int local276 = local210 - 4096;
						@Pc(281) short local281 = this.aShortArray142[local206];
						@Pc(285) int local285 = local218 - 4096;
						@Pc(289) int local289 = Class22_Sub1.anIntArray30[local218];
						@Pc(293) int local293 = local122 - 4096;
						@Pc(297) int local297 = Class22_Sub1.anIntArray30[local122];
						@Pc(304) short local304 = this.aShortArray142[local281 + local198];
						@Pc(311) short local311 = this.aShortArray142[local272 + local194];
						@Pc(319) short local319 = this.aShortArray142[local198 + local272];
						@Pc(326) short local326 = this.aShortArray142[local194 + local281];
						@Pc(338) int local338 = Static91.method1359(local218, local210, this.aShortArray142[local186 + local319], local122);
						@Pc(350) int local350 = Static91.method1359(local218, local210, this.aShortArray142[local319 + local182], local293);
						@Pc(361) int local361 = local338 + ((local350 - local338) * local297 >> 12);
						@Pc(373) int local373 = Static91.method1359(local218, local276, this.aShortArray142[local186 + local311], local122);
						@Pc(385) int local385 = Static91.method1359(local218, local276, this.aShortArray142[local311 + local182], local293);
						@Pc(397) int local397 = local373 + ((local385 - local373) * local297 >> 12);
						@Pc(408) int local408 = (local267 * (local397 - local361) >> 12) + local361;
						@Pc(420) int local420 = Static91.method1359(local285, local210, this.aShortArray142[local186 + local304], local122);
						@Pc(432) int local432 = Static91.method1359(local285, local210, this.aShortArray142[local304 + local182], local293);
						@Pc(444) int local444 = local420 + ((local432 - local420) * local297 >> 12);
						@Pc(456) int local456 = Static91.method1359(local285, local276, this.aShortArray142[local186 + local326], local122);
						@Pc(468) int local468 = Static91.method1359(local285, local276, this.aShortArray142[local182 + local326], local293);
						@Pc(479) int local479 = ((local468 - local456) * local297 >> 12) + local456;
						@Pc(490) int local490 = (local267 * (local479 - local444) >> 12) + local444;
						this.method8831(((local490 - local408) * local289 >> 12) + local408, local103);
					}
					this.method8833();
				}
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
	protected abstract void method8831(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
	protected abstract void method8832();

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
	protected abstract void method8833();
}
