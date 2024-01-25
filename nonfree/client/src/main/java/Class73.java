import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vca")
public abstract class Class73 {

	@OriginalMember(owner = "client!vca", name = "e", descriptor = "[S")
	private short[] aShortArray145;

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "I")
	private int anInt8821 = 4;

	@OriginalMember(owner = "client!vca", name = "g", descriptor = "I")
	private int anInt8824 = 4;

	@OriginalMember(owner = "client!vca", name = "k", descriptor = "I")
	private int anInt8827 = 0;

	@OriginalMember(owner = "client!vca", name = "d", descriptor = "I")
	protected int anInt8823 = 4;

	@OriginalMember(owner = "client!vca", name = "f", descriptor = "[S")
	private final short[] aShortArray146 = new short[512];

	@OriginalMember(owner = "client!vca", name = "j", descriptor = "I")
	private int anInt8826 = 4;

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(IIIII)V")
	protected Class73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8826 = arg3;
		this.anInt8824 = arg2;
		this.anInt8823 = arg1;
		this.anInt8827 = arg0;
		this.anInt8821 = arg4;
		this.method7237();
		this.method7240();
	}

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)V")
	protected abstract void method7235();

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)V")
	protected abstract void method7236();

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(B)V")
	private void method7237() {
		this.aShortArray145 = new short[this.anInt8823];
		for (@Pc(10) int local10 = 0; local10 < this.anInt8823; local10++) {
			this.aShortArray145[local10] = (short) Math.pow(2.0D, (double) local10);
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIII)V")
	protected final void method7238() {
		@Pc(11) int[] local11 = new int[128];
		@Pc(14) int[] local14 = new int[128];
		@Pc(17) int[] local17 = new int[16];
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			local11[local19] = (local19 << 12) / 128;
		}
		for (@Pc(38) int local38 = 0; local38 < 128; local38++) {
			local14[local38] = (local38 << 12) / 128;
		}
		for (@Pc(53) int local53 = 0; local53 < 16; local53++) {
			local17[local53] = (local53 << 12) / 16;
		}
		this.method7236();
		for (@Pc(75) int local75 = 0; local75 < 16; local75++) {
			for (@Pc(78) int local78 = 0; local78 < 128; local78++) {
				for (@Pc(81) int local81 = 0; local81 < 128; local81++) {
					for (@Pc(84) int local84 = 0; local84 < this.anInt8823; local84++) {
						@Pc(92) int local92 = this.aShortArray145[local84] << 12;
						@Pc(100) int local100 = local92 * local11[local81] >> 12;
						@Pc(108) int local108 = local17[local75] * local92 >> 12;
						@Pc(115) int local115 = this.anInt8821 * local92 >> 12;
						@Pc(122) int local122 = local92 * this.anInt8826 >> 12;
						@Pc(130) int local130 = local14[local78] * local92 >> 12;
						@Pc(137) int local137 = local92 * this.anInt8824 >> 12;
						@Pc(142) int local142 = local108 * this.anInt8821;
						@Pc(147) int local147 = local130 * this.anInt8826;
						@Pc(152) int local152 = local100 * this.anInt8824;
						@Pc(156) int local156 = local152 >> 12;
						@Pc(160) int local160 = local156 + 1;
						@Pc(164) int local164 = local147 >> 12;
						@Pc(168) int local168 = local156 & 0xFF;
						@Pc(172) int local172 = local164 + 1;
						@Pc(176) int local176 = local142 >> 12;
						@Pc(180) int local180 = local164 & 0xFF;
						@Pc(184) int local184 = local176 + 1;
						if (local137 > local160) {
							local160 &= 0xFF;
						} else {
							local160 = 0;
						}
						local100 = local152 & 0xFFF;
						local108 = local142 & 0xFFF;
						if (local172 < local122) {
							local172 &= 0xFF;
						} else {
							local172 = 0;
						}
						local130 = local147 & 0xFFF;
						if (local184 >= local115) {
							local184 = 0;
						} else {
							local184 &= 0xFF;
						}
						local176 &= 0xFF;
						@Pc(238) int local238 = Class77.anIntArray125[local130];
						@Pc(243) short local243 = this.aShortArray146[local184];
						@Pc(248) short local248 = this.aShortArray146[local176];
						@Pc(252) int local252 = Class77.anIntArray125[local100];
						@Pc(256) int local256 = local130 - 4096;
						@Pc(260) int local260 = local100 - 4096;
						@Pc(264) int local264 = local108 - 4096;
						@Pc(268) int local268 = Class77.anIntArray125[local108];
						@Pc(275) short local275 = this.aShortArray146[local248 + local172];
						@Pc(283) short local283 = this.aShortArray146[local172 + local243];
						@Pc(290) short local290 = this.aShortArray146[local248 + local180];
						@Pc(297) short local297 = this.aShortArray146[local243 + local180];
						@Pc(312) int local312 = Static392.method6251(local108, local130, this.aShortArray146[local168 + local290], local100);
						@Pc(326) int local326 = Static392.method6251(local108, local130, this.aShortArray146[local160 + local290], local260);
						@Pc(337) int local337 = local312 + (local252 * (local326 - local312) >> 12);
						@Pc(350) int local350 = Static392.method6251(local108, local256, this.aShortArray146[local168 + local275], local100);
						@Pc(363) int local363 = Static392.method6251(local108, local256, this.aShortArray146[local160 + local275], local260);
						@Pc(375) int local375 = local350 + (local252 * (local363 - local350) >> 12);
						@Pc(388) int local388 = Static392.method6251(local264, local130, this.aShortArray146[local168 + local297], local100);
						@Pc(399) int local399 = ((local375 - local337) * local238 >> 12) + local337;
						@Pc(412) int local412 = Static392.method6251(local264, local130, this.aShortArray146[local160 + local297], local260);
						@Pc(423) int local423 = (local252 * (local412 - local388) >> 12) + local388;
						@Pc(435) int local435 = Static392.method6251(local264, local256, this.aShortArray146[local168 + local283], local100);
						@Pc(447) int local447 = Static392.method6251(local264, local256, this.aShortArray146[local283 + local160], local260);
						@Pc(458) int local458 = (local252 * (local447 - local435) >> 12) + local435;
						@Pc(468) int local468 = ((local458 - local423) * local238 >> 12) + local423;
						this.method7239(local399 + ((local468 - local399) * local268 >> 12), local84);
					}
					this.method7235();
				}
			}
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIZ)V")
	protected abstract void method7239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vca", name = "c", descriptor = "(B)V")
	private void method7240() {
		@Pc(10) Random local10 = new Random((long) this.anInt8827);
		for (@Pc(12) int local12 = 0; local12 < 255; local12++) {
			this.aShortArray146[local12] = (short) local12;
		}
		for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
			@Pc(35) int local35 = 255 - local30;
			@Pc(40) int local40 = Static137.method2798(local10, local35);
			@Pc(45) short local45 = this.aShortArray146[local40];
			this.aShortArray146[local40] = this.aShortArray146[local35];
			this.aShortArray146[local35] = this.aShortArray146[local35 + 256] = local45;
		}
	}
}
