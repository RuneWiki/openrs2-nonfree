import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public abstract class Class13 {

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "[S")
	private short[] aShortArray96;

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
	protected int anInt8608 = 4;

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
	private int anInt8611 = 4;

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
	private int anInt8607 = 4;

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "[S")
	private final short[] aShortArray97 = new short[512];

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
	private int anInt8606 = 0;

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
	private int anInt8602 = 4;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(IIIII)V")
	protected Class13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8611 = arg4;
		this.anInt8602 = arg2;
		this.anInt8607 = arg3;
		this.anInt8606 = arg0;
		this.anInt8608 = arg1;
		this.method7325();
		this.method7334();
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
	private void method7325() {
		this.aShortArray96 = new short[this.anInt8608];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8608; local15++) {
			this.aShortArray96[local15] = (short) (int) Math.pow(2.0D, (double) local15);
		}
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
	protected abstract void method7327();

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
	protected abstract void method7328();

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIZI)V")
	protected final void method7333() {
		@Pc(12) int[] local12 = new int[128];
		@Pc(15) int[] local15 = new int[128];
		@Pc(18) int[] local18 = new int[16];
		for (@Pc(20) int local20 = 0; local20 < 128; local20++) {
			local12[local20] = (local20 << 12) / 128;
		}
		for (@Pc(39) int local39 = 0; local39 < 128; local39++) {
			local15[local39] = (local39 << 12) / 128;
		}
		for (@Pc(54) int local54 = 0; local54 < 16; local54++) {
			local18[local54] = (local54 << 12) / 16;
		}
		this.method7327();
		for (@Pc(76) int local76 = 0; local76 < 16; local76++) {
			for (@Pc(79) int local79 = 0; local79 < 128; local79++) {
				for (@Pc(82) int local82 = 0; local82 < 128; local82++) {
					for (@Pc(85) int local85 = 0; local85 < this.anInt8608; local85++) {
						@Pc(93) int local93 = this.aShortArray96[local85] << 12;
						@Pc(100) int local100 = local93 * this.anInt8611 >> 12;
						@Pc(107) int local107 = this.anInt8607 * local93 >> 12;
						@Pc(114) int local114 = local93 * this.anInt8602 >> 12;
						@Pc(122) int local122 = local93 * local12[local82] >> 12;
						@Pc(130) int local130 = local93 * local15[local79] >> 12;
						@Pc(138) int local138 = local18[local76] * local93 >> 12;
						@Pc(143) int local143 = local122 * this.anInt8602;
						@Pc(148) int local148 = local130 * this.anInt8607;
						@Pc(153) int local153 = local138 * this.anInt8611;
						@Pc(157) int local157 = local143 >> 12;
						@Pc(161) int local161 = local157 + 1;
						@Pc(165) int local165 = local148 >> 12;
						@Pc(169) int local169 = local157 & 0xFF;
						@Pc(173) int local173 = local165 + 1;
						@Pc(177) int local177 = local165 & 0xFF;
						@Pc(181) int local181 = local153 >> 12;
						@Pc(185) int local185 = local181 + 1;
						@Pc(189) int local189 = local148 & 0xFFF;
						@Pc(193) int local193 = local181 & 0xFF;
						if (local100 <= local185) {
							local185 = 0;
						} else {
							local185 &= 0xFF;
						}
						local122 = local143 & 0xFFF;
						local138 = local153 & 0xFFF;
						if (local173 < local107) {
							local173 &= 0xFF;
						} else {
							local173 = 0;
						}
						if (local161 >= local114) {
							local161 = 0;
						} else {
							local161 &= 0xFF;
						}
						@Pc(244) short local244 = this.aShortArray97[local193];
						@Pc(248) int local248 = local189 - 4096;
						@Pc(252) int local252 = local138 - 4096;
						@Pc(256) int local256 = local122 - 4096;
						@Pc(260) int local260 = Class106.anIntArray130[local189];
						@Pc(265) short local265 = this.aShortArray97[local185];
						@Pc(269) int local269 = Class106.anIntArray130[local122];
						@Pc(273) int local273 = Class106.anIntArray130[local138];
						@Pc(280) short local280 = this.aShortArray97[local265 + local177];
						@Pc(287) short local287 = this.aShortArray97[local244 + local177];
						@Pc(294) short local294 = this.aShortArray97[local244 + local173];
						@Pc(302) short local302 = this.aShortArray97[local173 + local265];
						@Pc(314) int local314 = Static314.method4953(local138, this.aShortArray97[local287 + local169], local189, local122);
						@Pc(326) int local326 = Static314.method4953(local138, this.aShortArray97[local287 + local161], local189, local256);
						@Pc(338) int local338 = local314 + ((local326 - local314) * local269 >> 12);
						@Pc(350) int local350 = Static314.method4953(local138, this.aShortArray97[local294 + local169], local248, local122);
						@Pc(363) int local363 = Static314.method4953(local138, this.aShortArray97[local161 + local294], local248, local256);
						@Pc(374) int local374 = local350 + ((local363 - local350) * local269 >> 12);
						@Pc(386) int local386 = Static314.method4953(local252, this.aShortArray97[local169 + local280], local189, local122);
						@Pc(398) int local398 = local338 + ((local374 - local338) * local260 >> 12);
						@Pc(411) int local411 = Static314.method4953(local252, this.aShortArray97[local161 + local280], local189, local256);
						@Pc(422) int local422 = local386 + (local269 * (local411 - local386) >> 12);
						@Pc(434) int local434 = Static314.method4953(local252, this.aShortArray97[local169 + local302], local248, local122);
						@Pc(446) int local446 = Static314.method4953(local252, this.aShortArray97[local302 + local161], local248, local256);
						@Pc(458) int local458 = local434 + ((local446 - local434) * local269 >> 12);
						@Pc(469) int local469 = local422 + ((local458 - local422) * local260 >> 12);
						this.method7335(local85, (local273 * (local469 - local398) >> 12) + local398);
					}
					this.method7328();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V")
	private void method7334() {
		@Pc(10) Random local10 = new Random((long) this.anInt8606);
		for (@Pc(12) int local12 = 0; local12 < 255; local12++) {
			this.aShortArray97[local12] = (short) local12;
		}
		for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
			@Pc(36) int local36 = 255 - local30;
			@Pc(41) int local41 = Static508.method7270(local36, local10);
			@Pc(46) short local46 = this.aShortArray97[local41];
			this.aShortArray97[local41] = this.aShortArray97[local36];
			this.aShortArray97[local36] = this.aShortArray97[local36 + 256] = local46;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZI)V")
	protected abstract void method7335(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
