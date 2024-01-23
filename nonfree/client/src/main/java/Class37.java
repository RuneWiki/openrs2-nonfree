import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public abstract class Class37 {

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
	protected int anInt5634 = 4;

	@OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
	private int anInt5641 = 4;

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
	private int anInt5638 = 0;

	@OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
	private int anInt5642 = 4;

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
	private int anInt5633 = 4;

	@OriginalMember(owner = "client!dk", name = "p", descriptor = "[S")
	private short[] aShortArray92 = new short[512];

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(IIIII)V")
	protected Class37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5633 = arg4;
		this.anInt5641 = arg3;
		this.anInt5638 = arg0;
		this.anInt5634 = arg1;
		this.anInt5642 = arg2;
		this.method4721();
		this.method4724();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	protected abstract void method4714();

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BII)V")
	protected abstract void method4718(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BIII)V")
	protected final void method4719() {
		@Pc(14) int[] local14 = new int[64];
		@Pc(17) int[] local17 = new int[64];
		@Pc(20) int[] local20 = new int[64];
		@Pc(22) int local22;
		for (local22 = 0; local22 < 64; local22++) {
			local14[local22] = (local22 << 12) / 64;
		}
		for (local22 = 0; local22 < 64; local22++) {
			local20[local22] = (local22 << 12) / 64;
		}
		for (local22 = 0; local22 < 64; local22++) {
			local17[local22] = (local22 << 12) / 64;
		}
		this.method4720();
		for (@Pc(81) int local81 = 0; local81 < 64; local81++) {
			for (@Pc(90) int local90 = 0; local90 < 64; local90++) {
				for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
					for (@Pc(100) int local100 = 0; local100 < this.anInt5634; local100++) {
						local22 = this.aShortArray91[local100] << 12;
						@Pc(119) int local119 = local22 * local14[local95] >> 12;
						@Pc(124) int local124 = local119 * this.anInt5642;
						@Pc(131) int local131 = this.anInt5642 * local22 >> 12;
						@Pc(139) int local139 = local17[local81] * local22 >> 12;
						@Pc(147) int local147 = local20[local90] * local22 >> 12;
						@Pc(152) int local152 = local139 * this.anInt5633;
						@Pc(156) int local156 = local124 >> 12;
						@Pc(161) int local161 = local147 * this.anInt5641;
						@Pc(165) int local165 = local161 >> 12;
						@Pc(172) int local172 = local22 * this.anInt5641 >> 12;
						@Pc(176) int local176 = local156 + 1;
						@Pc(180) int local180 = local156 & 0xFF;
						@Pc(184) int local184 = local124 & 0xFFF;
						@Pc(188) int local188 = local184 - 4096;
						@Pc(192) int local192 = local161 & 0xFFF;
						@Pc(196) int local196 = Class77.anIntArray216[local184];
						@Pc(203) int local203 = local22 * this.anInt5633 >> 12;
						@Pc(207) int local207 = local152 >> 12;
						@Pc(211) int local211 = Class77.anIntArray216[local192];
						@Pc(215) int local215 = local207 + 1;
						@Pc(219) int local219 = local207 & 0xFF;
						@Pc(223) int local223 = local152 & 0xFFF;
						@Pc(228) short local228 = this.aShortArray92[local219];
						@Pc(232) int local232 = local165 + 1;
						@Pc(236) int local236 = Class77.anIntArray216[local223];
						if (local203 > local215) {
							local215 &= 0xFF;
						} else {
							local215 = 0;
						}
						if (local232 >= local172) {
							local232 = 0;
						} else {
							local232 &= 0xFF;
						}
						local165 &= 0xFF;
						@Pc(270) int local270 = local223 - 4096;
						@Pc(275) short local275 = this.aShortArray92[local215];
						@Pc(282) short local282 = this.aShortArray92[local275 + local165];
						@Pc(289) short local289 = this.aShortArray92[local232 + local275];
						if (local176 >= local131) {
							local176 = 0;
						} else {
							local176 &= 0xFF;
						}
						@Pc(311) short local311 = this.aShortArray92[local165 + local228];
						@Pc(315) int local315 = local192 - 4096;
						@Pc(322) short local322 = this.aShortArray92[local228 + local232];
						@Pc(335) int local335 = Static97.method1796(local184, this.aShortArray92[local180 + local311], local192, local223);
						@Pc(348) int local348 = Static97.method1796(local188, this.aShortArray92[local176 + local311], local192, local223);
						@Pc(359) int local359 = (local196 * (local348 - local335) >> 12) + local335;
						@Pc(371) int local371 = Static97.method1796(local184, this.aShortArray92[local322 + local180], local315, local223);
						@Pc(383) int local383 = Static97.method1796(local188, this.aShortArray92[local176 + local322], local315, local223);
						@Pc(394) int local394 = local371 + ((local383 - local371) * local196 >> 12);
						@Pc(406) int local406 = Static97.method1796(local184, this.aShortArray92[local180 + local282], local192, local270);
						@Pc(417) int local417 = (local211 * (local394 - local359) >> 12) + local359;
						@Pc(430) int local430 = Static97.method1796(local188, this.aShortArray92[local176 + local282], local192, local270);
						@Pc(441) int local441 = ((local430 - local406) * local196 >> 12) + local406;
						@Pc(453) int local453 = Static97.method1796(local184, this.aShortArray92[local180 + local289], local315, local270);
						@Pc(465) int local465 = Static97.method1796(local188, this.aShortArray92[local289 + local176], local315, local270);
						@Pc(476) int local476 = local453 + (local196 * (local465 - local453) >> 12);
						@Pc(487) int local487 = (local211 * (local476 - local441) >> 12) + local441;
						this.method4718(((local487 - local417) * local236 >> 12) + local417, local100);
					}
					this.method4714();
				}
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
	protected abstract void method4720();

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(B)V")
	private void method4721() {
		this.aShortArray91 = new short[this.anInt5634];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5634; local16++) {
			this.aShortArray91[local16] = (short) Math.pow(2.0D, (double) local16);
		}
	}

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "(B)V")
	private void method4724() {
		@Pc(8) Random local8 = new Random((long) this.anInt5638);
		@Pc(22) int local22;
		for (local22 = 0; local22 < 255; local22++) {
			this.aShortArray92[local22] = (short) local22;
		}
		for (local22 = 0; local22 < 255; local22++) {
			@Pc(45) int local45 = 255 - local22;
			@Pc(50) int local50 = Static151.method2554(local45, local8);
			@Pc(55) short local55 = this.aShortArray92[local50];
			this.aShortArray92[local50] = this.aShortArray92[local45];
			this.aShortArray92[local45] = this.aShortArray92[local45 + 256] = local55;
		}
	}
}
