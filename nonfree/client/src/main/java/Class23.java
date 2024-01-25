import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public abstract class Class23 {

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
	private int anInt4747 = 4;

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
	private int anInt4754 = 4;

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "[S")
	private final short[] aShortArray77 = new short[512];

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
	private int anInt4756 = 4;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
	private int anInt4748 = 0;

	@OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
	protected int anInt4761 = 4;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(IIIII)V")
	protected Class23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4747 = arg4;
		this.anInt4754 = arg3;
		this.anInt4756 = arg2;
		this.anInt4748 = arg0;
		this.anInt4761 = arg1;
		this.method4273();
		this.method4267();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
	private void method4267() {
		@Pc(12) Random local12 = new Random((long) this.anInt4748);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray77[local14] = (short) local14;
		}
		for (@Pc(36) int local36 = 0; local36 < 255; local36++) {
			@Pc(42) int local42 = 255 - local36;
			@Pc(47) int local47 = Static371.method5907(local42, local12);
			@Pc(52) short local52 = this.aShortArray77[local47];
			this.aShortArray77[local47] = this.aShortArray77[local42];
			this.aShortArray77[local42] = this.aShortArray77[local42 + 256] = local52;
		}
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
	protected abstract void method4268();

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
	protected abstract void method4270();

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
	private void method4273() {
		this.aShortArray78 = new short[this.anInt4761];
		for (@Pc(17) int local17 = 0; local17 < this.anInt4761; local17++) {
			this.aShortArray78[local17] = (short) Math.pow(2.0D, (double) local17);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIBI)V")
	protected final void method4275() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			local8[local13] = (local13 << 12) / 128;
		}
		@Pc(34) int[] local34 = new int[16];
		for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
			local11[local36] = (local36 << 12) / 128;
		}
		for (@Pc(52) int local52 = 0; local52 < 16; local52++) {
			local34[local52] = (local52 << 12) / 16;
		}
		this.method4270();
		for (@Pc(82) int local82 = 0; local82 < 16; local82++) {
			for (@Pc(86) int local86 = 0; local86 < 128; local86++) {
				for (@Pc(90) int local90 = 0; local90 < 128; local90++) {
					for (@Pc(94) int local94 = 0; local94 < this.anInt4761; local94++) {
						@Pc(103) int local103 = this.aShortArray78[local94] << 12;
						@Pc(111) int local111 = local103 * local11[local86] >> 12;
						@Pc(119) int local119 = local103 * local34[local82] >> 12;
						@Pc(127) int local127 = local103 * local8[local90] >> 12;
						@Pc(134) int local134 = local103 * this.anInt4756 >> 12;
						@Pc(141) int local141 = this.anInt4747 * local103 >> 12;
						@Pc(148) int local148 = this.anInt4754 * local103 >> 12;
						@Pc(153) int local153 = local111 * this.anInt4754;
						@Pc(158) int local158 = local119 * this.anInt4747;
						@Pc(163) int local163 = local127 * this.anInt4756;
						@Pc(167) int local167 = local163 >> 12;
						@Pc(171) int local171 = local167 + 1;
						@Pc(175) int local175 = local167 & 0xFF;
						@Pc(179) int local179 = local153 >> 12;
						@Pc(183) int local183 = local179 + 1;
						@Pc(187) int local187 = local179 & 0xFF;
						@Pc(191) int local191 = local158 >> 12;
						@Pc(195) int local195 = local191 + 1;
						@Pc(199) int local199 = local163 & 0xFFF;
						if (local171 < local134) {
							local171 &= 0xFF;
						} else {
							local171 = 0;
						}
						local111 = local153 & 0xFFF;
						local119 = local158 & 0xFFF;
						if (local183 < local148) {
							local183 &= 0xFF;
						} else {
							local183 = 0;
						}
						local191 &= 0xFF;
						if (local141 > local195) {
							local195 &= 0xFF;
						} else {
							local195 = 0;
						}
						@Pc(257) short local257 = this.aShortArray77[local191];
						@Pc(262) short local262 = this.aShortArray77[local195];
						@Pc(266) int local266 = local119 - 4096;
						@Pc(270) int local270 = Class42.anIntArray85[local119];
						@Pc(274) int local274 = Class42.anIntArray85[local111];
						@Pc(278) int local278 = local199 - 4096;
						@Pc(282) int local282 = local111 - 4096;
						@Pc(286) int local286 = Class42.anIntArray85[local199];
						@Pc(294) short local294 = this.aShortArray77[local187 + local257];
						@Pc(301) short local301 = this.aShortArray77[local262 + local183];
						@Pc(308) short local308 = this.aShortArray77[local187 + local262];
						@Pc(316) short local316 = this.aShortArray77[local183 + local257];
						@Pc(328) int local328 = Static110.method2008(local119, local199, this.aShortArray77[local294 + local175], local111);
						@Pc(340) int local340 = Static110.method2008(local119, local278, this.aShortArray77[local294 + local171], local111);
						@Pc(351) int local351 = (local286 * (local340 - local328) >> 12) + local328;
						@Pc(365) int local365 = Static110.method2008(local119, local199, this.aShortArray77[local175 + local316], local282);
						@Pc(379) int local379 = Static110.method2008(local119, local278, this.aShortArray77[local316 + local171], local282);
						@Pc(389) int local389 = ((local379 - local365) * local286 >> 12) + local365;
						@Pc(401) int local401 = Static110.method2008(local266, local199, this.aShortArray77[local175 + local308], local111);
						@Pc(413) int local413 = local351 + (local274 * (local389 - local351) >> 12);
						@Pc(426) int local426 = Static110.method2008(local266, local278, this.aShortArray77[local171 + local308], local111);
						@Pc(436) int local436 = (local286 * (local426 - local401) >> 12) + local401;
						@Pc(449) int local449 = Static110.method2008(local266, local199, this.aShortArray77[local175 + local301], local282);
						@Pc(461) int local461 = Static110.method2008(local266, local278, this.aShortArray77[local301 + local171], local282);
						@Pc(473) int local473 = local449 + (local286 * (local461 - local449) >> 12);
						@Pc(485) int local485 = local436 + (local274 * (local473 - local436) >> 12);
						this.method4276(local413 + ((local485 - local413) * local270 >> 12), local94);
					}
					this.method4268();
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V")
	protected abstract void method4276(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
