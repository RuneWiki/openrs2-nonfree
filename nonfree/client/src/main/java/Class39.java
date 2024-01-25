import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public abstract class Class39 {

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "[S")
	private short[] aShortArray46;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
	protected int anInt3866 = 4;

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "[S")
	private final short[] aShortArray45 = new short[512];

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
	private int anInt3869 = 4;

	@OriginalMember(owner = "client!pq", name = "s", descriptor = "I")
	private int anInt3880 = 0;

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
	private int anInt3878 = 4;

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
	private int anInt3877 = 4;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(IIIII)V")
	protected Class39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3878 = arg4;
		this.anInt3866 = arg1;
		this.anInt3880 = arg0;
		this.anInt3869 = arg2;
		this.anInt3877 = arg3;
		this.method3553();
		this.method3559();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V")
	private void method3553() {
		this.aShortArray46 = new short[this.anInt3866];
		for (@Pc(12) int local12 = 0; local12 < this.anInt3866; local12++) {
			this.aShortArray46[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V")
	protected abstract void method3556();

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIB)V")
	protected abstract void method3558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(B)V")
	private void method3559() {
		@Pc(12) Random local12 = new Random((long) this.anInt3880);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray45[local14] = (short) local14;
		}
		for (@Pc(28) int local28 = 0; local28 < 255; local28++) {
			@Pc(34) int local34 = 255 - local28;
			@Pc(39) int local39 = Static210.method4979(local34, local12);
			@Pc(44) short local44 = this.aShortArray45[local39];
			this.aShortArray45[local39] = this.aShortArray45[local34];
			this.aShortArray45[local34] = this.aShortArray45[local34 + 256] = local44;
		}
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)V")
	protected abstract void method3560();

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIII)V")
	protected final void method3561() {
		@Pc(13) int[] local13 = new int[128];
		@Pc(16) int[] local16 = new int[128];
		@Pc(19) int[] local19 = new int[16];
		for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
			local13[local21] = (local21 << 12) / 128;
		}
		for (@Pc(37) int local37 = 0; local37 < 128; local37++) {
			local16[local37] = (local37 << 12) / 128;
		}
		for (@Pc(57) int local57 = 0; local57 < 16; local57++) {
			local19[local57] = (local57 << 12) / 16;
		}
		this.method3556();
		for (@Pc(80) int local80 = 0; local80 < 16; local80++) {
			for (@Pc(84) int local84 = 0; local84 < 128; local84++) {
				for (@Pc(88) int local88 = 0; local88 < 128; local88++) {
					for (@Pc(92) int local92 = 0; local92 < this.anInt3866; local92++) {
						@Pc(101) int local101 = this.aShortArray46[local92] << 12;
						@Pc(109) int local109 = local101 * local16[local84] >> 12;
						@Pc(117) int local117 = local13[local88] * local101 >> 12;
						@Pc(124) int local124 = this.anInt3878 * local101 >> 12;
						@Pc(131) int local131 = local101 * this.anInt3869 >> 12;
						@Pc(138) int local138 = local101 * this.anInt3877 >> 12;
						@Pc(146) int local146 = local19[local80] * local101 >> 12;
						@Pc(151) int local151 = local109 * this.anInt3877;
						@Pc(156) int local156 = local117 * this.anInt3869;
						@Pc(161) int local161 = local146 * this.anInt3878;
						@Pc(165) int local165 = local156 >> 12;
						@Pc(169) int local169 = local165 + 1;
						@Pc(173) int local173 = local165 & 0xFF;
						@Pc(177) int local177 = local151 >> 12;
						@Pc(181) int local181 = local177 + 1;
						@Pc(185) int local185 = local177 & 0xFF;
						@Pc(189) int local189 = local161 >> 12;
						@Pc(193) int local193 = local189 + 1;
						@Pc(197) int local197 = local161 & 0xFFF;
						if (local169 < local131) {
							local169 &= 0xFF;
						} else {
							local169 = 0;
						}
						if (local138 > local181) {
							local181 &= 0xFF;
						} else {
							local181 = 0;
						}
						local109 = local151 & 0xFFF;
						local117 = local156 & 0xFFF;
						if (local124 > local193) {
							local193 &= 0xFF;
						} else {
							local193 = 0;
						}
						local189 &= 0xFF;
						@Pc(250) int local250 = local109 - 4096;
						@Pc(255) short local255 = this.aShortArray45[local193];
						@Pc(259) int local259 = Class191.anIntArray486[local197];
						@Pc(263) int local263 = local117 - 4096;
						@Pc(268) short local268 = this.aShortArray45[local189];
						@Pc(272) int local272 = local197 - 4096;
						@Pc(276) int local276 = Class191.anIntArray486[local109];
						@Pc(280) int local280 = Class191.anIntArray486[local117];
						@Pc(288) short local288 = this.aShortArray45[local185 + local268];
						@Pc(295) short local295 = this.aShortArray45[local255 + local181];
						@Pc(303) short local303 = this.aShortArray45[local185 + local255];
						@Pc(310) short local310 = this.aShortArray45[local268 + local181];
						@Pc(322) int local322 = Static252.method4412(this.aShortArray45[local173 + local288], local197, local109, local117);
						@Pc(334) int local334 = Static252.method4412(this.aShortArray45[local288 + local169], local197, local109, local263);
						@Pc(344) int local344 = ((local334 - local322) * local280 >> 12) + local322;
						@Pc(356) int local356 = Static252.method4412(this.aShortArray45[local310 + local173], local197, local250, local117);
						@Pc(368) int local368 = Static252.method4412(this.aShortArray45[local310 + local169], local197, local250, local263);
						@Pc(379) int local379 = ((local368 - local356) * local280 >> 12) + local356;
						@Pc(389) int local389 = (local276 * (local379 - local344) >> 12) + local344;
						@Pc(402) int local402 = Static252.method4412(this.aShortArray45[local173 + local303], local272, local109, local117);
						@Pc(415) int local415 = Static252.method4412(this.aShortArray45[local169 + local303], local272, local109, local263);
						@Pc(427) int local427 = local402 + (local280 * (local415 - local402) >> 12);
						@Pc(440) int local440 = Static252.method4412(this.aShortArray45[local173 + local295], local272, local250, local117);
						@Pc(452) int local452 = Static252.method4412(this.aShortArray45[local169 + local295], local272, local250, local263);
						@Pc(463) int local463 = local440 + ((local452 - local440) * local280 >> 12);
						@Pc(473) int local473 = (local276 * (local463 - local427) >> 12) + local427;
						this.method3558(local92, (local259 * (local473 - local389) >> 12) + local389);
					}
					this.method3560();
				}
			}
		}
	}
}
