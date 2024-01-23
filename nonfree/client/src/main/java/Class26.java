import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public abstract class Class26 {

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
	protected int anInt5549 = 4;

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
	private int anInt5552 = 4;

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
	private int anInt5551 = 4;

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
	private int anInt5559 = 0;

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
	private int anInt5550 = 4;

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "[S")
	private short[] aShortArray92 = new short[512];

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(IIIII)V")
	protected Class26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5549 = arg1;
		this.anInt5551 = arg2;
		this.anInt5550 = arg4;
		this.anInt5559 = arg0;
		this.anInt5552 = arg3;
		this.method4608();
		this.method4609();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
	private void method4608() {
		this.aShortArray91 = new short[this.anInt5549];
		for (@Pc(17) int local17 = 0; local17 < this.anInt5549; local17++) {
			this.aShortArray91[local17] = (short) Math.pow(2.0D, (double) local17);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
	private void method4609() {
		@Pc(8) Random local8 = new Random((long) this.anInt5559);
		@Pc(10) int local10;
		for (local10 = 0; local10 < 255; local10++) {
			this.aShortArray92[local10] = (short) local10;
		}
		for (local10 = 0; local10 < 255; local10++) {
			@Pc(34) int local34 = 255 - local10;
			@Pc(39) int local39 = Static118.method2140(local8, local34);
			@Pc(44) short local44 = this.aShortArray92[local39];
			this.aShortArray92[local39] = this.aShortArray92[local34];
			this.aShortArray92[local34] = this.aShortArray92[local34 + 256] = local44;
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	protected abstract void method4611();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIB)V")
	protected abstract void method4614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
	protected abstract void method4616();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIBI)V")
	protected final void method4617() {
		@Pc(8) int[] local8 = new int[64];
		@Pc(11) int[] local11 = new int[64];
		@Pc(20) int[] local20 = new int[64];
		@Pc(22) int local22;
		for (local22 = 0; local22 < 64; local22++) {
			local8[local22] = (local22 << 12) / 64;
		}
		for (local22 = 0; local22 < 64; local22++) {
			local11[local22] = (local22 << 12) / 64;
		}
		for (local22 = 0; local22 < 64; local22++) {
			local20[local22] = (local22 << 12) / 64;
		}
		this.method4611();
		for (@Pc(81) int local81 = 0; local81 < 64; local81++) {
			for (@Pc(86) int local86 = 0; local86 < 64; local86++) {
				for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
					for (@Pc(104) int local104 = 0; local104 < this.anInt5549; local104++) {
						local22 = this.aShortArray91[local104] << 12;
						@Pc(126) int local126 = local22 * this.anInt5552 >> 12;
						@Pc(133) int local133 = this.anInt5550 * local22 >> 12;
						@Pc(141) int local141 = local8[local95] * local22 >> 12;
						@Pc(148) int local148 = this.anInt5551 * local22 >> 12;
						@Pc(153) int local153 = local141 * this.anInt5551;
						@Pc(161) int local161 = local22 * local20[local81] >> 12;
						@Pc(169) int local169 = local11[local86] * local22 >> 12;
						@Pc(174) int local174 = local169 * this.anInt5552;
						@Pc(178) int local178 = local153 >> 12;
						@Pc(182) int local182 = local153 & 0xFFF;
						@Pc(186) int local186 = local182 - 4096;
						@Pc(190) int local190 = Class1_Sub1_Sub37.anIntArray570[local182];
						@Pc(194) int local194 = local178 + 1;
						if (local194 >= local148) {
							local194 = 0;
						} else {
							local194 &= 0xFF;
						}
						local161 *= this.anInt5550;
						local178 &= 0xFF;
						@Pc(218) int local218 = local174 >> 12;
						local169 = local174 & 0xFFF;
						@Pc(226) int local226 = Class1_Sub1_Sub37.anIntArray570[local169];
						@Pc(230) int local230 = local161 >> 12;
						@Pc(234) int local234 = local230 + 1;
						if (local133 > local234) {
							local234 &= 0xFF;
						} else {
							local234 = 0;
						}
						local230 &= 0xFF;
						@Pc(257) int local257 = local218 + 1;
						@Pc(262) short local262 = this.aShortArray92[local230];
						@Pc(267) short local267 = this.aShortArray92[local234];
						local161 &= 0xFFF;
						@Pc(275) int local275 = Class1_Sub1_Sub37.anIntArray570[local161];
						if (local257 >= local126) {
							local257 = 0;
						} else {
							local257 &= 0xFF;
						}
						@Pc(294) int local294 = local169 - 4096;
						@Pc(301) short local301 = this.aShortArray92[local267 + local257];
						local218 &= 0xFF;
						@Pc(313) short local313 = this.aShortArray92[local218 + local267];
						@Pc(317) int local317 = local161 - 4096;
						@Pc(324) short local324 = this.aShortArray92[local262 + local218];
						@Pc(332) short local332 = this.aShortArray92[local257 + local262];
						@Pc(344) int local344 = Static112.method4461(local182, local161, local169, this.aShortArray92[local324 + local178]);
						@Pc(356) int local356 = Static112.method4461(local186, local161, local169, this.aShortArray92[local194 + local324]);
						@Pc(368) int local368 = local344 + (local190 * (local356 - local344) >> 12);
						@Pc(382) int local382 = Static112.method4461(local182, local161, local294, this.aShortArray92[local178 + local332]);
						@Pc(396) int local396 = Static112.method4461(local186, local161, local294, this.aShortArray92[local332 + local194]);
						@Pc(407) int local407 = local382 + ((local396 - local382) * local190 >> 12);
						@Pc(419) int local419 = Static112.method4461(local182, local317, local169, this.aShortArray92[local178 + local313]);
						@Pc(431) int local431 = local368 + ((local407 - local368) * local226 >> 12);
						@Pc(443) int local443 = Static112.method4461(local186, local317, local169, this.aShortArray92[local194 + local313]);
						@Pc(454) int local454 = local419 + (local190 * (local443 - local419) >> 12);
						@Pc(468) int local468 = Static112.method4461(local182, local317, local294, this.aShortArray92[local178 + local301]);
						@Pc(480) int local480 = Static112.method4461(local186, local317, local294, this.aShortArray92[local194 + local301]);
						@Pc(490) int local490 = (local190 * (local480 - local468) >> 12) + local468;
						@Pc(501) int local501 = ((local490 - local454) * local226 >> 12) + local454;
						this.method4614(((local501 - local431) * local275 >> 12) + local431, local104);
					}
					this.method4616();
				}
			}
		}
	}
}
