import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public abstract class Class77 {

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
	private int anInt5993 = 4;

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
	protected int anInt6001 = 4;

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
	private int anInt5997 = 0;

	@OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
	private int anInt6005 = 4;

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
	private int anInt6002 = 4;

	@OriginalMember(owner = "client!ho", name = "t", descriptor = "[S")
	private short[] aShortArray92 = new short[512];

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(IIIII)V")
	protected Class77(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6002 = arg4;
		this.anInt5993 = arg2;
		this.anInt6005 = arg3;
		this.anInt6001 = arg1;
		this.anInt5997 = arg0;
		this.method4705();
		this.method4710();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)V")
	protected abstract void method4703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
	protected abstract void method4704();

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)V")
	private void method4705() {
		this.aShortArray91 = new short[this.anInt6001];
		for (@Pc(8) int local8 = 0; local8 < this.anInt6001; local8++) {
			this.aShortArray91[local8] = (short) Math.pow(2.0D, (double) local8);
		}
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V")
	protected abstract void method4709();

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)V")
	private void method4710() {
		@Pc(8) Random local8 = new Random((long) this.anInt5997);
		@Pc(10) int local10;
		for (local10 = 0; local10 < 255; local10++) {
			this.aShortArray92[local10] = (short) local10;
		}
		for (local10 = 0; local10 < 255; local10++) {
			@Pc(38) int local38 = 255 - local10;
			@Pc(43) int local43 = Static222.method3672(local8, local38);
			@Pc(48) short local48 = this.aShortArray92[local43];
			this.aShortArray92[local43] = this.aShortArray92[local38];
			this.aShortArray92[local38] = this.aShortArray92[local38 + 256] = local48;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIII)V")
	protected final void method4713() {
		@Pc(8) int[] local8 = new int[64];
		@Pc(11) int[] local11 = new int[64];
		@Pc(20) int[] local20 = new int[64];
		@Pc(22) int local22;
		for (local22 = 0; local22 < 64; local22++) {
			local11[local22] = (local22 << 12) / 64;
		}
		for (local22 = 0; local22 < 64; local22++) {
			local8[local22] = (local22 << 12) / 64;
		}
		for (local22 = 0; local22 < 64; local22++) {
			local20[local22] = (local22 << 12) / 64;
		}
		this.method4709();
		for (@Pc(81) int local81 = 0; local81 < 64; local81++) {
			for (@Pc(86) int local86 = 0; local86 < 64; local86++) {
				for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
					for (@Pc(100) int local100 = 0; local100 < this.anInt6001; local100++) {
						local22 = this.aShortArray91[local100] << 12;
						@Pc(123) int local123 = local8[local86] * local22 >> 12;
						@Pc(131) int local131 = local20[local81] * local22 >> 12;
						@Pc(136) int local136 = local123 * this.anInt6005;
						@Pc(144) int local144 = local11[local95] * local22 >> 12;
						@Pc(149) int local149 = local131 * this.anInt6002;
						@Pc(153) int local153 = local136 >> 12;
						@Pc(160) int local160 = local22 * this.anInt5993 >> 12;
						@Pc(165) int local165 = local144 * this.anInt5993;
						@Pc(169) int local169 = local136 & 0xFFF;
						@Pc(173) int local173 = local149 >> 12;
						@Pc(177) int local177 = local173 + 1;
						@Pc(181) int local181 = local169 - 4096;
						@Pc(185) int local185 = local165 >> 12;
						@Pc(189) int local189 = Class2_Sub5.anIntArray51[local169];
						@Pc(193) int local193 = local185 + 1;
						@Pc(197) int local197 = local185 & 0xFF;
						@Pc(204) int local204 = local22 * this.anInt6002 >> 12;
						@Pc(208) int local208 = local149 & 0xFFF;
						@Pc(212) int local212 = local153 + 1;
						@Pc(216) int local216 = Class2_Sub5.anIntArray51[local208];
						if (local193 >= local160) {
							local193 = 0;
						} else {
							local193 &= 0xFF;
						}
						@Pc(231) int local231 = local208 - 4096;
						local144 = local165 & 0xFFF;
						local153 &= 0xFF;
						local173 &= 0xFF;
						@Pc(247) int local247 = Class2_Sub5.anIntArray51[local144];
						@Pc(252) short local252 = this.aShortArray92[local173];
						@Pc(256) int local256 = local144 - 4096;
						if (local204 <= local177) {
							local177 = 0;
						} else {
							local177 &= 0xFF;
						}
						@Pc(278) int local278 = this.anInt6005 * local22 >> 12;
						@Pc(285) short local285 = this.aShortArray92[local252 + local153];
						@Pc(290) short local290 = this.aShortArray92[local177];
						if (local212 >= local278) {
							local212 = 0;
						} else {
							local212 &= 0xFF;
						}
						@Pc(308) short local308 = this.aShortArray92[local290 + local212];
						@Pc(315) short local315 = this.aShortArray92[local212 + local252];
						@Pc(322) short local322 = this.aShortArray92[local290 + local153];
						@Pc(336) int local336 = Static270.method3458(local144, local208, this.aShortArray92[local285 + local197], local169);
						@Pc(348) int local348 = Static270.method3458(local256, local208, this.aShortArray92[local285 + local193], local169);
						@Pc(360) int local360 = local336 + (local247 * (local348 - local336) >> 12);
						@Pc(372) int local372 = Static270.method3458(local144, local208, this.aShortArray92[local315 + local197], local181);
						@Pc(385) int local385 = Static270.method3458(local256, local208, this.aShortArray92[local193 + local315], local181);
						@Pc(396) int local396 = local372 + ((local385 - local372) * local247 >> 12);
						@Pc(407) int local407 = local360 + (local189 * (local396 - local360) >> 12);
						@Pc(419) int local419 = Static270.method3458(local144, local231, this.aShortArray92[local197 + local322], local169);
						@Pc(431) int local431 = Static270.method3458(local256, local231, this.aShortArray92[local322 + local193], local169);
						@Pc(442) int local442 = local419 + ((local431 - local419) * local247 >> 12);
						@Pc(454) int local454 = Static270.method3458(local144, local231, this.aShortArray92[local308 + local197], local181);
						@Pc(466) int local466 = Static270.method3458(local256, local231, this.aShortArray92[local193 + local308], local181);
						@Pc(477) int local477 = ((local466 - local454) * local247 >> 12) + local454;
						@Pc(488) int local488 = local442 + (local189 * (local477 - local442) >> 12);
						this.method4703(((local488 - local407) * local216 >> 12) + local407, local100);
					}
					this.method4704();
				}
			}
		}
	}
}
