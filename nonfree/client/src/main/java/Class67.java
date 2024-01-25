import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jka")
public abstract class Class67 {

	@OriginalMember(owner = "client!jka", name = "i", descriptor = "[S")
	private short[] aShortArray94;

	@OriginalMember(owner = "client!jka", name = "g", descriptor = "I")
	private int anInt7545 = 4;

	@OriginalMember(owner = "client!jka", name = "m", descriptor = "I")
	private int anInt7547 = 4;

	@OriginalMember(owner = "client!jka", name = "f", descriptor = "I")
	private int anInt7548 = 4;

	@OriginalMember(owner = "client!jka", name = "d", descriptor = "I")
	private int anInt7550 = 0;

	@OriginalMember(owner = "client!jka", name = "b", descriptor = "I")
	protected int anInt7552 = 4;

	@OriginalMember(owner = "client!jka", name = "e", descriptor = "[S")
	private final short[] aShortArray95 = new short[512];

	@OriginalMember(owner = "client!jka", name = "<init>", descriptor = "(IIIII)V")
	protected Class67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt7552 = arg1;
		this.anInt7547 = arg2;
		this.anInt7548 = arg4;
		this.anInt7550 = arg0;
		this.anInt7545 = arg3;
		this.method6692();
		this.method6691();
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(IIII)V")
	protected final void method6687() {
		@Pc(6) int[] local6 = new int[128];
		@Pc(9) int[] local9 = new int[128];
		@Pc(12) int[] local12 = new int[16];
		for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
			local6[local14] = (local14 << 12) / 128;
		}
		for (@Pc(40) int local40 = 0; local40 < 128; local40++) {
			local9[local40] = (local40 << 12) / 128;
		}
		for (@Pc(55) int local55 = 0; local55 < 16; local55++) {
			local12[local55] = (local55 << 12) / 16;
		}
		this.method6693();
		for (@Pc(77) int local77 = 0; local77 < 16; local77++) {
			for (@Pc(80) int local80 = 0; local80 < 128; local80++) {
				for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
					for (@Pc(86) int local86 = 0; local86 < this.anInt7552; local86++) {
						@Pc(94) int local94 = this.aShortArray94[local86] << 12;
						@Pc(101) int local101 = this.anInt7547 * local94 >> 12;
						@Pc(109) int local109 = local94 * local6[local83] >> 12;
						@Pc(116) int local116 = this.anInt7548 * local94 >> 12;
						@Pc(123) int local123 = local94 * this.anInt7545 >> 12;
						@Pc(131) int local131 = local9[local80] * local94 >> 12;
						@Pc(139) int local139 = local12[local77] * local94 >> 12;
						@Pc(144) int local144 = local131 * this.anInt7545;
						@Pc(149) int local149 = local139 * this.anInt7548;
						@Pc(154) int local154 = local109 * this.anInt7547;
						@Pc(158) int local158 = local154 >> 12;
						@Pc(162) int local162 = local158 + 1;
						@Pc(166) int local166 = local144 >> 12;
						@Pc(170) int local170 = local158 & 0xFF;
						@Pc(174) int local174 = local166 + 1;
						@Pc(178) int local178 = local166 & 0xFF;
						@Pc(182) int local182 = local149 >> 12;
						@Pc(186) int local186 = local182 + 1;
						if (local101 > local162) {
							local162 &= 0xFF;
						} else {
							local162 = 0;
						}
						local182 &= 0xFF;
						local139 = local149 & 0xFFF;
						local131 = local144 & 0xFFF;
						local109 = local154 & 0xFFF;
						if (local174 >= local123) {
							local174 = 0;
						} else {
							local174 &= 0xFF;
						}
						if (local116 > local186) {
							local186 &= 0xFF;
						} else {
							local186 = 0;
						}
						@Pc(245) short local245 = this.aShortArray95[local186];
						@Pc(249) int local249 = Class4_Sub3_Sub3_Sub3_Sub1.anIntArray173[local109];
						@Pc(253) int local253 = local139 - 4096;
						@Pc(258) short local258 = this.aShortArray95[local182];
						@Pc(262) int local262 = local131 - 4096;
						@Pc(266) int local266 = Class4_Sub3_Sub3_Sub3_Sub1.anIntArray173[local139];
						@Pc(270) int local270 = local109 - 4096;
						@Pc(274) int local274 = Class4_Sub3_Sub3_Sub3_Sub1.anIntArray173[local131];
						@Pc(281) short local281 = this.aShortArray95[local174 + local258];
						@Pc(288) short local288 = this.aShortArray95[local258 + local178];
						@Pc(295) short local295 = this.aShortArray95[local245 + local178];
						@Pc(302) short local302 = this.aShortArray95[local174 + local245];
						@Pc(314) int local314 = Static540.method7938(local131, local139, this.aShortArray95[local288 + local170], local109);
						@Pc(327) int local327 = Static540.method7938(local131, local139, this.aShortArray95[local162 + local288], local270);
						@Pc(338) int local338 = local314 + (local249 * (local327 - local314) >> 12);
						@Pc(350) int local350 = Static540.method7938(local262, local139, this.aShortArray95[local281 + local170], local109);
						@Pc(362) int local362 = Static540.method7938(local262, local139, this.aShortArray95[local281 + local162], local270);
						@Pc(373) int local373 = ((local362 - local350) * local249 >> 12) + local350;
						@Pc(383) int local383 = ((local373 - local338) * local274 >> 12) + local338;
						@Pc(396) int local396 = Static540.method7938(local131, local253, this.aShortArray95[local170 + local295], local109);
						@Pc(408) int local408 = Static540.method7938(local131, local253, this.aShortArray95[local295 + local162], local270);
						@Pc(420) int local420 = local396 + ((local408 - local396) * local249 >> 12);
						@Pc(432) int local432 = Static540.method7938(local262, local253, this.aShortArray95[local302 + local170], local109);
						@Pc(444) int local444 = Static540.method7938(local262, local253, this.aShortArray95[local302 + local162], local270);
						@Pc(455) int local455 = local432 + ((local444 - local432) * local249 >> 12);
						@Pc(466) int local466 = local420 + ((local455 - local420) * local274 >> 12);
						this.method6695((local266 * (local466 - local383) >> 12) + local383, local86);
					}
					this.method6694();
				}
			}
		}
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(Z)V")
	private void method6691() {
		@Pc(20) Random local20 = new Random((long) this.anInt7550);
		for (@Pc(22) int local22 = 0; local22 < 255; local22++) {
			this.aShortArray95[local22] = (short) local22;
		}
		for (@Pc(35) int local35 = 0; local35 < 255; local35++) {
			@Pc(41) int local41 = 255 - local35;
			@Pc(46) int local46 = Static645.method9067(local41, local20);
			@Pc(51) short local51 = this.aShortArray95[local46];
			this.aShortArray95[local46] = this.aShortArray95[local41];
			this.aShortArray95[local41] = this.aShortArray95[local41 + 256] = local51;
		}
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(B)V")
	private void method6692() {
		this.aShortArray94 = new short[this.anInt7552];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7552; local15++) {
			this.aShortArray94[local15] = (short) (int) Math.pow(2.0D, (double) local15);
		}
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(I)V")
	protected abstract void method6693();

	@OriginalMember(owner = "client!jka", name = "b", descriptor = "(I)V")
	protected abstract void method6694();

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(IBI)V")
	protected abstract void method6695(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
