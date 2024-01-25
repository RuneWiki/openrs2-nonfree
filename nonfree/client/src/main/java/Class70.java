import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public abstract class Class70 {

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "[S")
	private short[] aShortArray131;

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
	protected int anInt7436 = 4;

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
	private int anInt7433 = 4;

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
	private int anInt7437 = 0;

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
	private int anInt7440 = 4;

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
	private int anInt7438 = 4;

	@OriginalMember(owner = "client!rt", name = "m", descriptor = "[S")
	private final short[] aShortArray132 = new short[512];

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(IIIII)V")
	protected Class70(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt7433 = arg2;
		this.anInt7438 = arg4;
		this.anInt7437 = arg0;
		this.anInt7440 = arg3;
		this.anInt7436 = arg1;
		this.method5664();
		this.method5665();
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V")
	protected abstract void method5662();

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)V")
	private void method5664() {
		this.aShortArray131 = new short[this.anInt7436];
		for (@Pc(10) int local10 = 0; local10 < this.anInt7436; local10++) {
			this.aShortArray131[local10] = (short) Math.pow(2.0D, (double) local10);
		}
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)V")
	private void method5665() {
		@Pc(10) Random local10 = new Random((long) this.anInt7437);
		for (@Pc(20) int local20 = 0; local20 < 255; local20++) {
			this.aShortArray132[local20] = (short) local20;
		}
		for (@Pc(35) int local35 = 0; local35 < 255; local35++) {
			@Pc(41) int local41 = 255 - local35;
			@Pc(46) int local46 = Static70.method1340(local10, local41);
			@Pc(51) short local51 = this.aShortArray132[local46];
			this.aShortArray132[local46] = this.aShortArray132[local41];
			this.aShortArray132[local41] = this.aShortArray132[local41 + 256] = local51;
		}
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)V")
	protected abstract void method5666();

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)V")
	protected abstract void method5667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIII)V")
	protected final void method5668() {
		@Pc(10) int[] local10 = new int[128];
		@Pc(13) int[] local13 = new int[128];
		@Pc(16) int[] local16 = new int[16];
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			local10[local18] = (local18 << 12) / 128;
		}
		for (@Pc(33) int local33 = 0; local33 < 128; local33++) {
			local13[local33] = (local33 << 12) / 128;
		}
		for (@Pc(52) int local52 = 0; local52 < 16; local52++) {
			local16[local52] = (local52 << 12) / 16;
		}
		this.method5666();
		for (@Pc(74) int local74 = 0; local74 < 16; local74++) {
			for (@Pc(77) int local77 = 0; local77 < 128; local77++) {
				for (@Pc(80) int local80 = 0; local80 < 128; local80++) {
					for (@Pc(83) int local83 = 0; local83 < this.anInt7436; local83++) {
						@Pc(91) int local91 = this.aShortArray131[local83] << 12;
						@Pc(99) int local99 = local91 * local13[local77] >> 12;
						@Pc(107) int local107 = local10[local80] * local91 >> 12;
						@Pc(114) int local114 = this.anInt7438 * local91 >> 12;
						@Pc(121) int local121 = this.anInt7433 * local91 >> 12;
						@Pc(128) int local128 = this.anInt7440 * local91 >> 12;
						@Pc(136) int local136 = local16[local74] * local91 >> 12;
						@Pc(141) int local141 = local99 * this.anInt7440;
						@Pc(146) int local146 = local136 * this.anInt7438;
						@Pc(151) int local151 = local107 * this.anInt7433;
						@Pc(155) int local155 = local151 >> 12;
						@Pc(159) int local159 = local155 + 1;
						@Pc(163) int local163 = local141 >> 12;
						@Pc(167) int local167 = local155 & 0xFF;
						@Pc(171) int local171 = local163 + 1;
						@Pc(175) int local175 = local163 & 0xFF;
						@Pc(179) int local179 = local146 >> 12;
						@Pc(183) int local183 = local179 + 1;
						@Pc(187) int local187 = local151 & 0xFFF;
						if (local114 <= local183) {
							local183 = 0;
						} else {
							local183 &= 0xFF;
						}
						local136 = local146 & 0xFFF;
						if (local128 > local171) {
							local171 &= 0xFF;
						} else {
							local171 = 0;
						}
						local99 = local141 & 0xFFF;
						local179 &= 0xFF;
						if (local121 <= local159) {
							local159 = 0;
						} else {
							local159 &= 0xFF;
						}
						@Pc(241) int local241 = Class1_Sub1_Sub10.anIntArray538[local99];
						@Pc(245) int local245 = local99 - 4096;
						@Pc(249) int local249 = local136 - 4096;
						@Pc(253) int local253 = local187 - 4096;
						@Pc(258) short local258 = this.aShortArray132[local179];
						@Pc(263) short local263 = this.aShortArray132[local183];
						@Pc(267) int local267 = Class1_Sub1_Sub10.anIntArray538[local136];
						@Pc(271) int local271 = Class1_Sub1_Sub10.anIntArray538[local187];
						@Pc(278) short local278 = this.aShortArray132[local175 + local258];
						@Pc(285) short local285 = this.aShortArray132[local171 + local258];
						@Pc(293) short local293 = this.aShortArray132[local171 + local263];
						@Pc(301) short local301 = this.aShortArray132[local175 + local263];
						@Pc(314) int local314 = Static129.method2128(local99, local136, this.aShortArray132[local167 + local278], local187);
						@Pc(326) int local326 = Static129.method2128(local99, local136, this.aShortArray132[local278 + local159], local253);
						@Pc(337) int local337 = ((local326 - local314) * local271 >> 12) + local314;
						@Pc(349) int local349 = Static129.method2128(local245, local136, this.aShortArray132[local285 + local167], local187);
						@Pc(361) int local361 = Static129.method2128(local245, local136, this.aShortArray132[local285 + local159], local253);
						@Pc(372) int local372 = (local271 * (local361 - local349) >> 12) + local349;
						@Pc(383) int local383 = ((local372 - local337) * local241 >> 12) + local337;
						@Pc(395) int local395 = Static129.method2128(local99, local249, this.aShortArray132[local301 + local167], local187);
						@Pc(407) int local407 = Static129.method2128(local99, local249, this.aShortArray132[local301 + local159], local253);
						@Pc(418) int local418 = (local271 * (local407 - local395) >> 12) + local395;
						@Pc(430) int local430 = Static129.method2128(local245, local249, this.aShortArray132[local293 + local167], local187);
						@Pc(442) int local442 = Static129.method2128(local245, local249, this.aShortArray132[local293 + local159], local253);
						@Pc(453) int local453 = ((local442 - local430) * local271 >> 12) + local430;
						@Pc(464) int local464 = local418 + ((local453 - local418) * local241 >> 12);
						this.method5667(((local464 - local383) * local267 >> 12) + local383, local83);
					}
					this.method5662();
				}
			}
		}
	}
}
