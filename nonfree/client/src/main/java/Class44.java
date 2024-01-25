import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public abstract class Class44 {

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "[S")
	private short[] aShortArray146;

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "[S")
	private final short[] aShortArray145 = new short[512];

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
	protected int anInt9445 = 4;

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
	private int anInt9446 = 4;

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
	private int anInt9451 = 0;

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
	private int anInt9447 = 4;

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
	private int anInt9450 = 4;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(IIIII)V")
	protected Class44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt9446 = arg2;
		this.anInt9450 = arg3;
		this.anInt9447 = arg4;
		this.anInt9445 = arg1;
		this.anInt9451 = arg0;
		this.method8025();
		this.method8020();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	private void method8020() {
		@Pc(10) Random local10 = new Random((long) this.anInt9451);
		for (@Pc(12) int local12 = 0; local12 < 255; local12++) {
			this.aShortArray145[local12] = (short) local12;
		}
		for (@Pc(25) int local25 = 0; local25 < 255; local25++) {
			@Pc(30) int local30 = 255 - local25;
			@Pc(35) int local35 = Static142.method2572(local30, local10);
			@Pc(40) short local40 = this.aShortArray145[local35];
			this.aShortArray145[local35] = this.aShortArray145[local30];
			this.aShortArray145[local30] = this.aShortArray145[local30 + 256] = local40;
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V")
	protected abstract void method8021();

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIB)V")
	protected final void method8024() {
		@Pc(14) int[] local14 = new int[128];
		@Pc(17) int[] local17 = new int[128];
		@Pc(20) int[] local20 = new int[16];
		for (@Pc(22) int local22 = 0; local22 < 128; local22++) {
			local14[local22] = (local22 << 12) / 128;
		}
		for (@Pc(37) int local37 = 0; local37 < 128; local37++) {
			local17[local37] = (local37 << 12) / 128;
		}
		for (@Pc(56) int local56 = 0; local56 < 16; local56++) {
			local20[local56] = (local56 << 12) / 16;
		}
		this.method8028();
		for (@Pc(74) int local74 = 0; local74 < 16; local74++) {
			for (@Pc(77) int local77 = 0; local77 < 128; local77++) {
				for (@Pc(80) int local80 = 0; local80 < 128; local80++) {
					for (@Pc(83) int local83 = 0; local83 < this.anInt9445; local83++) {
						@Pc(91) int local91 = this.aShortArray146[local83] << 12;
						@Pc(99) int local99 = local91 * local20[local74] >> 12;
						@Pc(107) int local107 = local91 * local14[local80] >> 12;
						@Pc(114) int local114 = this.anInt9450 * local91 >> 12;
						@Pc(122) int local122 = local91 * local17[local77] >> 12;
						@Pc(129) int local129 = this.anInt9447 * local91 >> 12;
						@Pc(136) int local136 = local91 * this.anInt9446 >> 12;
						@Pc(141) int local141 = local99 * this.anInt9447;
						@Pc(146) int local146 = local122 * this.anInt9450;
						@Pc(151) int local151 = local107 * this.anInt9446;
						@Pc(155) int local155 = local151 >> 12;
						@Pc(159) int local159 = local155 + 1;
						@Pc(163) int local163 = local155 & 0xFF;
						@Pc(167) int local167 = local146 >> 12;
						@Pc(171) int local171 = local167 + 1;
						@Pc(175) int local175 = local141 >> 12;
						@Pc(179) int local179 = local167 & 0xFF;
						@Pc(183) int local183 = local175 + 1;
						@Pc(187) int local187 = local151 & 0xFFF;
						if (local129 <= local183) {
							local183 = 0;
						} else {
							local183 &= 0xFF;
						}
						local99 = local141 & 0xFFF;
						if (local159 >= local136) {
							local159 = 0;
						} else {
							local159 &= 0xFF;
						}
						if (local171 < local114) {
							local171 &= 0xFF;
						} else {
							local171 = 0;
						}
						local122 = local146 & 0xFFF;
						local175 &= 0xFF;
						@Pc(241) int local241 = Class2_Sub7_Sub19.anIntArray667[local99];
						@Pc(245) int local245 = local122 - 4096;
						@Pc(249) int local249 = local99 - 4096;
						@Pc(254) short local254 = this.aShortArray145[local175];
						@Pc(259) short local259 = this.aShortArray145[local183];
						@Pc(263) int local263 = Class2_Sub7_Sub19.anIntArray667[local122];
						@Pc(267) int local267 = local187 - 4096;
						@Pc(271) int local271 = Class2_Sub7_Sub19.anIntArray667[local187];
						@Pc(278) short local278 = this.aShortArray145[local179 + local254];
						@Pc(285) short local285 = this.aShortArray145[local254 + local171];
						@Pc(292) short local292 = this.aShortArray145[local259 + local179];
						@Pc(300) short local300 = this.aShortArray145[local171 + local259];
						@Pc(312) int local312 = Static620.method8620(local187, local122, this.aShortArray145[local163 + local278], local99);
						@Pc(324) int local324 = Static620.method8620(local267, local122, this.aShortArray145[local278 + local159], local99);
						@Pc(336) int local336 = local312 + (local271 * (local324 - local312) >> 12);
						@Pc(348) int local348 = Static620.method8620(local187, local245, this.aShortArray145[local285 + local163], local99);
						@Pc(361) int local361 = Static620.method8620(local267, local245, this.aShortArray145[local159 + local285], local99);
						@Pc(371) int local371 = (local271 * (local361 - local348) >> 12) + local348;
						@Pc(383) int local383 = Static620.method8620(local187, local122, this.aShortArray145[local163 + local292], local249);
						@Pc(393) int local393 = ((local371 - local336) * local263 >> 12) + local336;
						@Pc(405) int local405 = Static620.method8620(local267, local122, this.aShortArray145[local292 + local159], local249);
						@Pc(416) int local416 = (local271 * (local405 - local383) >> 12) + local383;
						@Pc(428) int local428 = Static620.method8620(local187, local245, this.aShortArray145[local300 + local163], local249);
						@Pc(440) int local440 = Static620.method8620(local267, local245, this.aShortArray145[local300 + local159], local249);
						@Pc(451) int local451 = local428 + (local271 * (local440 - local428) >> 12);
						@Pc(462) int local462 = ((local451 - local416) * local263 >> 12) + local416;
						this.method8026(local83, local393 + (local241 * (local462 - local393) >> 12));
					}
					this.method8021();
				}
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
	private void method8025() {
		this.aShortArray146 = new short[this.anInt9445];
		for (@Pc(10) int local10 = 0; local10 < this.anInt9445; local10++) {
			this.aShortArray146[local10] = (short) (int) Math.pow(2.0D, (double) local10);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V")
	protected abstract void method8026(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V")
	protected abstract void method8028();
}
