import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iw")
public abstract class Class10 {

	@OriginalMember(owner = "client!iw", name = "l", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "I")
	private int anInt4489 = 0;

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "I")
	protected int anInt4488 = 4;

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "I")
	private int anInt4491 = 4;

	@OriginalMember(owner = "client!iw", name = "i", descriptor = "I")
	private int anInt4494 = 4;

	@OriginalMember(owner = "client!iw", name = "k", descriptor = "[S")
	private final short[] aShortArray83 = new short[512];

	@OriginalMember(owner = "client!iw", name = "m", descriptor = "I")
	private int anInt4496 = 4;

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(IIIII)V")
	protected Class10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4494 = arg2;
		this.anInt4496 = arg4;
		this.anInt4489 = arg0;
		this.anInt4491 = arg3;
		this.anInt4488 = arg1;
		this.method3906();
		this.method3912();
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)V")
	private void method3906() {
		this.aShortArray84 = new short[this.anInt4488];
		for (@Pc(12) int local12 = 0; local12 < this.anInt4488; local12++) {
			this.aShortArray84[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)V")
	protected abstract void method3908();

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(III)V")
	protected abstract void method3910(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(B)V")
	private void method3912() {
		@Pc(12) Random local12 = new Random((long) this.anInt4489);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray83[local14] = (short) local14;
		}
		for (@Pc(34) int local34 = 0; local34 < 255; local34++) {
			@Pc(40) int local40 = 255 - local34;
			@Pc(45) int local45 = Static202.method3259(local40, local12);
			@Pc(50) short local50 = this.aShortArray83[local45];
			this.aShortArray83[local45] = this.aShortArray83[local40];
			this.aShortArray83[local40] = this.aShortArray83[local40 + 256] = local50;
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIII)V")
	protected final void method3913() {
		@Pc(16) int[] local16 = new int[128];
		@Pc(19) int[] local19 = new int[128];
		@Pc(22) int[] local22 = new int[16];
		for (@Pc(24) int local24 = 0; local24 < 128; local24++) {
			local16[local24] = (local24 << 12) / 128;
		}
		for (@Pc(40) int local40 = 0; local40 < 128; local40++) {
			local19[local40] = (local40 << 12) / 128;
		}
		for (@Pc(56) int local56 = 0; local56 < 16; local56++) {
			local22[local56] = (local56 << 12) / 16;
		}
		this.method3908();
		for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
			for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
				for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
					for (@Pc(91) int local91 = 0; local91 < this.anInt4488; local91++) {
						@Pc(100) int local100 = this.aShortArray84[local91] << 12;
						@Pc(107) int local107 = local100 * this.anInt4491 >> 12;
						@Pc(115) int local115 = local100 * local22[local79] >> 12;
						@Pc(123) int local123 = local16[local87] * local100 >> 12;
						@Pc(130) int local130 = local100 * this.anInt4494 >> 12;
						@Pc(137) int local137 = this.anInt4496 * local100 >> 12;
						@Pc(145) int local145 = local19[local83] * local100 >> 12;
						@Pc(150) int local150 = local115 * this.anInt4496;
						@Pc(155) int local155 = local145 * this.anInt4491;
						@Pc(160) int local160 = local123 * this.anInt4494;
						@Pc(164) int local164 = local160 >> 12;
						@Pc(168) int local168 = local164 + 1;
						@Pc(172) int local172 = local164 & 0xFF;
						@Pc(176) int local176 = local155 >> 12;
						@Pc(180) int local180 = local176 + 1;
						@Pc(184) int local184 = local176 & 0xFF;
						@Pc(188) int local188 = local150 >> 12;
						@Pc(192) int local192 = local188 + 1;
						@Pc(196) int local196 = local155 & 0xFFF;
						if (local137 > local192) {
							local192 &= 0xFF;
						} else {
							local192 = 0;
						}
						local115 = local150 & 0xFFF;
						if (local180 >= local107) {
							local180 = 0;
						} else {
							local180 &= 0xFF;
						}
						local123 = local160 & 0xFFF;
						if (local168 < local130) {
							local168 &= 0xFF;
						} else {
							local168 = 0;
						}
						local188 &= 0xFF;
						@Pc(249) int local249 = Class160.anIntArray428[local123];
						@Pc(253) int local253 = local196 - 4096;
						@Pc(257) int local257 = Class160.anIntArray428[local196];
						@Pc(262) short local262 = this.aShortArray83[local188];
						@Pc(266) int local266 = local123 - 4096;
						@Pc(271) short local271 = this.aShortArray83[local192];
						@Pc(275) int local275 = local115 - 4096;
						@Pc(279) int local279 = Class160.anIntArray428[local115];
						@Pc(286) short local286 = this.aShortArray83[local262 + local184];
						@Pc(293) short local293 = this.aShortArray83[local271 + local184];
						@Pc(300) short local300 = this.aShortArray83[local262 + local180];
						@Pc(307) short local307 = this.aShortArray83[local271 + local180];
						@Pc(319) int local319 = Static3.method261(this.aShortArray83[local286 + local172], local196, local123, local115);
						@Pc(331) int local331 = Static3.method261(this.aShortArray83[local286 + local168], local196, local266, local115);
						@Pc(342) int local342 = ((local331 - local319) * local249 >> 12) + local319;
						@Pc(354) int local354 = Static3.method261(this.aShortArray83[local172 + local300], local253, local123, local115);
						@Pc(366) int local366 = Static3.method261(this.aShortArray83[local168 + local300], local253, local266, local115);
						@Pc(377) int local377 = ((local366 - local354) * local249 >> 12) + local354;
						@Pc(388) int local388 = local342 + ((local377 - local342) * local257 >> 12);
						@Pc(401) int local401 = Static3.method261(this.aShortArray83[local172 + local293], local196, local123, local275);
						@Pc(413) int local413 = Static3.method261(this.aShortArray83[local293 + local168], local196, local266, local275);
						@Pc(424) int local424 = (local249 * (local413 - local401) >> 12) + local401;
						@Pc(436) int local436 = Static3.method261(this.aShortArray83[local172 + local307], local253, local123, local275);
						@Pc(448) int local448 = Static3.method261(this.aShortArray83[local168 + local307], local253, local266, local275);
						@Pc(459) int local459 = local436 + ((local448 - local436) * local249 >> 12);
						@Pc(471) int local471 = local424 + (local257 * (local459 - local424) >> 12);
						this.method3910(local91, local388 + (local279 * (local471 - local388) >> 12));
					}
					this.method3914();
				}
			}
		}
	}

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "(I)V")
	protected abstract void method3914();
}
