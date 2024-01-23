import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public abstract class Class4 {

	@OriginalMember(owner = "client!dk", name = "n", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
	private int anInt255 = 4;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
	private int anInt253 = 0;

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
	private int anInt260 = 4;

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
	protected int anInt254 = 4;

	@OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
	private int anInt263 = 4;

	@OriginalMember(owner = "client!dk", name = "s", descriptor = "[S")
	private short[] aShortArray24 = new short[512];

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(IIIII)V")
	protected Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt255 = arg3;
		this.anInt254 = arg1;
		this.anInt260 = arg2;
		this.anInt253 = arg0;
		this.anInt263 = arg4;
		this.method283();
		this.method282();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	protected abstract void method277();

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(IIII)V")
	protected final void method279() {
		@Pc(14) int[] local14 = new int[64];
		@Pc(17) int[] local17 = new int[64];
		@Pc(20) int[] local20 = new int[64];
		@Pc(22) int local22;
		for (local22 = 0; local22 < 64; local22++) {
			local14[local22] = (local22 << 12) / 64;
		}
		for (local22 = 0; local22 < 64; local22++) {
			local17[local22] = (local22 << 12) / 64;
		}
		for (local22 = 0; local22 < 64; local22++) {
			local20[local22] = (local22 << 12) / 64;
		}
		this.method277();
		for (@Pc(77) int local77 = 0; local77 < 64; local77++) {
			for (@Pc(86) int local86 = 0; local86 < 64; local86++) {
				for (@Pc(91) int local91 = 0; local91 < 64; local91++) {
					for (@Pc(100) int local100 = 0; local100 < this.anInt254; local100++) {
						local22 = this.aShortArray23[local100] << 12;
						@Pc(118) int local118 = local22 * this.anInt260 >> 12;
						@Pc(126) int local126 = local22 * local20[local77] >> 12;
						@Pc(134) int local134 = local17[local86] * local22 >> 12;
						@Pc(139) int local139 = local134 * this.anInt255;
						@Pc(144) int local144 = local126 * this.anInt263;
						@Pc(152) int local152 = local14[local91] * local22 >> 12;
						@Pc(159) int local159 = local22 * this.anInt255 >> 12;
						@Pc(163) int local163 = local144 >> 12;
						@Pc(167) int local167 = local144 & 0xFFF;
						@Pc(171) int local171 = local163 + 1;
						@Pc(175) int local175 = Class34.anIntArray501[local167];
						@Pc(179) int local179 = local167 - 4096;
						@Pc(183) int local183 = local163 & 0xFF;
						@Pc(190) int local190 = this.anInt263 * local22 >> 12;
						@Pc(195) int local195 = local152 * this.anInt260;
						if (local190 > local171) {
							local171 &= 0xFF;
						} else {
							local171 = 0;
						}
						@Pc(215) short local215 = this.aShortArray24[local183];
						@Pc(219) int local219 = local195 >> 12;
						local152 = local195 & 0xFFF;
						@Pc(227) int local227 = local152 - 4096;
						@Pc(231) int local231 = local219 + 1;
						@Pc(235) int local235 = local139 >> 12;
						@Pc(239) int local239 = local219 & 0xFF;
						@Pc(243) int local243 = Class34.anIntArray501[local152];
						if (local118 > local231) {
							local231 &= 0xFF;
						} else {
							local231 = 0;
						}
						local134 = local139 & 0xFFF;
						@Pc(262) int local262 = local134 - 4096;
						@Pc(266) int local266 = local235 + 1;
						local235 &= 0xFF;
						@Pc(274) int local274 = Class34.anIntArray501[local134];
						@Pc(282) short local282 = this.aShortArray24[local235 + local215];
						@Pc(287) short local287 = this.aShortArray24[local171];
						if (local266 >= local159) {
							local266 = 0;
						} else {
							local266 &= 0xFF;
						}
						@Pc(309) short local309 = this.aShortArray24[local266 + local215];
						@Pc(316) short local316 = this.aShortArray24[local287 + local266];
						@Pc(324) short local324 = this.aShortArray24[local235 + local287];
						@Pc(336) int local336 = Static132.method2263(local152, this.aShortArray24[local239 + local282], local134, local167);
						@Pc(350) int local350 = Static132.method2263(local227, this.aShortArray24[local282 + local231], local134, local167);
						@Pc(361) int local361 = local336 + ((local350 - local336) * local243 >> 12);
						@Pc(373) int local373 = Static132.method2263(local152, this.aShortArray24[local239 + local309], local262, local167);
						@Pc(385) int local385 = Static132.method2263(local227, this.aShortArray24[local231 + local309], local262, local167);
						@Pc(397) int local397 = local373 + ((local385 - local373) * local243 >> 12);
						@Pc(408) int local408 = local361 + (local274 * (local397 - local361) >> 12);
						@Pc(420) int local420 = Static132.method2263(local152, this.aShortArray24[local324 + local239], local134, local179);
						@Pc(432) int local432 = Static132.method2263(local227, this.aShortArray24[local324 + local231], local134, local179);
						@Pc(443) int local443 = ((local432 - local420) * local243 >> 12) + local420;
						@Pc(456) int local456 = Static132.method2263(local152, this.aShortArray24[local239 + local316], local262, local179);
						@Pc(468) int local468 = Static132.method2263(local227, this.aShortArray24[local316 + local231], local262, local179);
						@Pc(479) int local479 = (local243 * (local468 - local456) >> 12) + local456;
						@Pc(490) int local490 = ((local479 - local443) * local274 >> 12) + local443;
						this.method280(local408 + ((local490 - local408) * local175 >> 12), local100);
					}
					this.method285();
				}
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)V")
	protected abstract void method280(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V")
	private void method282() {
		@Pc(8) Random local8 = new Random((long) this.anInt253);
		@Pc(10) int local10;
		for (local10 = 0; local10 < 255; local10++) {
			this.aShortArray24[local10] = (short) local10;
		}
		for (local10 = 0; local10 < 255; local10++) {
			@Pc(41) int local41 = 255 - local10;
			@Pc(46) int local46 = Static207.method3275(local41, local8);
			@Pc(51) short local51 = this.aShortArray24[local46];
			this.aShortArray24[local46] = this.aShortArray24[local41];
			this.aShortArray24[local41] = this.aShortArray24[local41 + 256] = local51;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
	private void method283() {
		this.aShortArray23 = new short[this.anInt254];
		for (@Pc(8) int local8 = 0; local8 < this.anInt254; local8++) {
			this.aShortArray23[local8] = (short) Math.pow(2.0D, (double) local8);
		}
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(Z)V")
	protected abstract void method285();
}
