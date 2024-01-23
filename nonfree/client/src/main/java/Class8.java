import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public abstract class Class8 {

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
	private int anInt5181 = 4;

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
	private int anInt5177 = 4;

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "[S")
	private short[] aShortArray85 = new short[512];

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
	protected int anInt5185 = 4;

	@OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
	private int anInt5186 = 0;

	@OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
	private int anInt5187 = 4;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(IIIII)V")
	protected Class8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5185 = arg1;
		this.anInt5181 = arg2;
		this.anInt5187 = arg3;
		this.anInt5186 = arg0;
		this.anInt5177 = arg4;
		this.method4252();
		this.method4248();
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)V")
	protected abstract void method4247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
	private void method4248() {
		@Pc(12) Random local12 = new Random((long) this.anInt5186);
		@Pc(14) int local14;
		for (local14 = 0; local14 < 255; local14++) {
			this.aShortArray85[local14] = (short) local14;
		}
		for (local14 = 0; local14 < 255; local14++) {
			@Pc(46) int local46 = 255 - local14;
			@Pc(51) int local51 = Static276.method4529(local46, local12);
			@Pc(56) short local56 = this.aShortArray85[local51];
			this.aShortArray85[local51] = this.aShortArray85[local46];
			this.aShortArray85[local46] = this.aShortArray85[local46 + 256] = local56;
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
	protected abstract void method4251();

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V")
	private void method4252() {
		this.aShortArray84 = new short[this.anInt5185];
		for (@Pc(12) int local12 = 0; local12 < this.anInt5185; local12++) {
			this.aShortArray84[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIII)V")
	protected final void method4253() {
		@Pc(8) int[] local8 = new int[64];
		@Pc(11) int[] local11 = new int[64];
		@Pc(14) int[] local14 = new int[64];
		@Pc(16) int local16;
		for (local16 = 0; local16 < 64; local16++) {
			local8[local16] = (local16 << 12) / 64;
		}
		for (local16 = 0; local16 < 64; local16++) {
			local11[local16] = (local16 << 12) / 64;
		}
		for (local16 = 0; local16 < 64; local16++) {
			local14[local16] = (local16 << 12) / 64;
		}
		this.method4254();
		for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
			for (@Pc(80) int local80 = 0; local80 < 64; local80++) {
				for (@Pc(85) int local85 = 0; local85 < 64; local85++) {
					for (@Pc(94) int local94 = 0; local94 < this.anInt5185; local94++) {
						local16 = this.aShortArray84[local94] << 12;
						@Pc(116) int local116 = local16 * this.anInt5187 >> 12;
						@Pc(124) int local124 = local16 * local8[local85] >> 12;
						@Pc(131) int local131 = this.anInt5177 * local16 >> 12;
						@Pc(139) int local139 = local16 * local11[local80] >> 12;
						@Pc(146) int local146 = this.anInt5181 * local16 >> 12;
						@Pc(154) int local154 = local14[local75] * local16 >> 12;
						@Pc(159) int local159 = local154 * this.anInt5177;
						@Pc(164) int local164 = local139 * this.anInt5187;
						@Pc(168) int local168 = local164 >> 12;
						@Pc(173) int local173 = local124 * this.anInt5181;
						@Pc(177) int local177 = local173 >> 12;
						@Pc(181) int local181 = local168 + 1;
						@Pc(185) int local185 = local159 >> 12;
						@Pc(189) int local189 = local168 & 0xFF;
						@Pc(193) int local193 = local173 & 0xFFF;
						@Pc(197) int local197 = local193 - 4096;
						if (local181 < local116) {
							local181 &= 0xFF;
						} else {
							local181 = 0;
						}
						@Pc(212) int local212 = Class49.anIntArray133[local193];
						local139 = local164 & 0xFFF;
						@Pc(220) int local220 = local139 - 4096;
						@Pc(224) int local224 = local177 + 1;
						@Pc(228) int local228 = local185 + 1;
						@Pc(232) int local232 = Class49.anIntArray133[local139];
						if (local224 >= local146) {
							local224 = 0;
						} else {
							local224 &= 0xFF;
						}
						local177 &= 0xFF;
						local185 &= 0xFF;
						local154 = local159 & 0xFFF;
						@Pc(263) int local263 = Class49.anIntArray133[local154];
						@Pc(268) short local268 = this.aShortArray85[local185];
						@Pc(275) short local275 = this.aShortArray85[local268 + local181];
						if (local131 > local228) {
							local228 &= 0xFF;
						} else {
							local228 = 0;
						}
						@Pc(291) short local291 = this.aShortArray85[local228];
						@Pc(295) int local295 = local154 - 4096;
						@Pc(302) short local302 = this.aShortArray85[local181 + local291];
						@Pc(310) short local310 = this.aShortArray85[local189 + local291];
						@Pc(318) short local318 = this.aShortArray85[local189 + local268];
						@Pc(330) int local330 = Static167.method2789(local154, local193, this.aShortArray85[local318 + local177], local139);
						@Pc(342) int local342 = Static167.method2789(local154, local197, this.aShortArray85[local224 + local318], local139);
						@Pc(354) int local354 = local330 + (local212 * (local342 - local330) >> 12);
						@Pc(366) int local366 = Static167.method2789(local154, local193, this.aShortArray85[local275 + local177], local220);
						@Pc(378) int local378 = Static167.method2789(local154, local197, this.aShortArray85[local224 + local275], local220);
						@Pc(388) int local388 = local366 + (local212 * (local378 - local366) >> 12);
						@Pc(399) int local399 = (local232 * (local388 - local354) >> 12) + local354;
						@Pc(411) int local411 = Static167.method2789(local295, local193, this.aShortArray85[local177 + local310], local139);
						@Pc(423) int local423 = Static167.method2789(local295, local197, this.aShortArray85[local224 + local310], local139);
						@Pc(433) int local433 = ((local423 - local411) * local212 >> 12) + local411;
						@Pc(445) int local445 = Static167.method2789(local295, local193, this.aShortArray85[local302 + local177], local220);
						@Pc(457) int local457 = Static167.method2789(local295, local197, this.aShortArray85[local302 + local224], local220);
						@Pc(469) int local469 = local445 + ((local457 - local445) * local212 >> 12);
						@Pc(480) int local480 = (local232 * (local469 - local433) >> 12) + local433;
						this.method4247(local94, ((local480 - local399) * local263 >> 12) + local399);
					}
					this.method4251();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(Z)V")
	protected abstract void method4254();
}
