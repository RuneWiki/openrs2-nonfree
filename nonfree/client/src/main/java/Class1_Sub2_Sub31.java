import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class1_Sub2_Sub31 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pd", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!pd", name = "eb", descriptor = "I")
	private int anInt3307;

	@OriginalMember(owner = "client!pd", name = "lb", descriptor = "I")
	private int anInt3311;

	@OriginalMember(owner = "client!pd", name = "pb", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!pd", name = "qb", descriptor = "[I")
	private int[] anIntArray437;

	@OriginalMember(owner = "client!pd", name = "ub", descriptor = "I")
	private int anInt3316;

	@OriginalMember(owner = "client!pd", name = "hb", descriptor = "I")
	private int anInt3309;

	@OriginalMember(owner = "client!pd", name = "rb", descriptor = "I")
	private int anInt3313;

	@OriginalMember(owner = "client!pd", name = "yb", descriptor = "I")
	private int anInt3318;

	@OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
	private int anInt3303;

	@OriginalMember(owner = "client!pd", name = "kb", descriptor = "I")
	private int anInt3310;

	@OriginalMember(owner = "client!pd", name = "mb", descriptor = "I")
	private int anInt3312;

	@OriginalMember(owner = "client!pd", name = "Bb", descriptor = "I")
	private int anInt3321;

	@OriginalMember(owner = "client!pd", name = "cb", descriptor = "I")
	private int anInt3305;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3312 = arg0.method861();
		} else if (arg1 == 1) {
			this.anInt3310 = arg0.method861();
		} else if (arg1 == 2) {
			this.anInt3303 = arg0.method878();
		} else if (arg1 == 3) {
			this.anInt3305 = arg0.method878();
		} else if (arg1 == 4) {
			this.anInt3309 = arg0.method878();
		} else if (arg1 == 5) {
			this.anInt3318 = arg0.method878();
		} else if (arg1 == 6) {
			this.anInt3321 = arg0.method878();
		} else if (arg1 == 7) {
			this.anInt3313 = arg0.method878();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = this.anInt3318 + Static37.anIntArray125[arg0]; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (this.anInt3310 > local22 && local29 >= this.anIntArray437[local22]) {
				local22++;
			}
			@Pc(68) float local68 = (float) this.anIntArray437[local22 - 1];
			@Pc(74) float local74 = (float) this.anIntArray437[local22];
			if (local68 + (float) this.anInt3316 < (float) local29 && local74 - (float) this.anInt3316 > (float) local29) {
				for (@Pc(94) int local94 = 0; local94 < Static110.anInt2825; local94++) {
					@Pc(98) int local98 = 0;
					@Pc(109) int local109 = local22 % 2 == 0 ? this.anInt3309 : -this.anInt3309;
					@Pc(121) int local121;
					for (local121 = Static86.anIntArray294[local94] + (local109 * this.anInt3307 >> 12); local121 < 0; local121 += 4096) {
					}
					while (local121 > 4096) {
						local121 -= 4096;
					}
					while (this.anInt3312 > local98 && this.anIntArrayArray29[local22 - 1][local98] <= local121) {
						local98++;
					}
					@Pc(169) float local169 = (float) this.anIntArrayArray29[local22 - 1][local98 - 1];
					@Pc(179) float local179 = (float) this.anIntArrayArray29[local22 - 1][local98];
					if (local169 + (float) this.anInt3316 < (float) local121 && (float) local121 < local179 - (float) this.anInt3316) {
						local16[local94] = this.anIntArrayArray30[local22 - 1][local98 - 1];
					} else {
						local16[local94] = 0;
					}
				}
			} else {
				Static184.method627(local16, 0, Static110.anInt2825, 0);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
	@Override
	public void method3125() {
		this.method2252();
	}

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V")
	private void method2252() {
		@Pc(20) Random local20 = new Random((long) this.anInt3310);
		this.anIntArray437 = new int[this.anInt3310 + 1];
		this.anIntArray437[0] = 0;
		this.anInt3316 = this.anInt3321 / 2;
		this.anIntArrayArray30 = new int[this.anInt3310][this.anInt3312];
		this.anInt3311 = 4096 / this.anInt3310;
		this.anIntArrayArray29 = new int[this.anInt3310][this.anInt3312 + 1];
		@Pc(65) int local65 = this.anInt3311 / 2;
		this.anInt3307 = 4096 / this.anInt3312;
		@Pc(76) int local76 = this.anInt3307 / 2;
		for (@Pc(78) int local78 = 0; local78 < this.anInt3310; local78++) {
			@Pc(85) int local85;
			@Pc(97) int local97;
			if (local78 > 0) {
				local85 = this.anInt3311;
				local97 = (Static137.method2402(local20, 4096) - 2048) * this.anInt3305 >> 12;
				@Pc(105) int local105 = local85 + (local65 * local97 >> 12);
				this.anIntArray437[local78] = this.anIntArray437[local78 - 1] + local105;
			}
			this.anIntArrayArray29[local78][0] = 0;
			for (local85 = 0; local85 < this.anInt3312; local85++) {
				if (local85 > 0) {
					local97 = this.anInt3307;
					@Pc(145) int local145 = (Static137.method2402(local20, 4096) - 2048) * this.anInt3303 >> 12;
					local97 += local145 * local76 >> 12;
					this.anIntArrayArray29[local78][local85] = local97 + this.anIntArrayArray29[local78][local85 - 1];
				}
				this.anIntArrayArray30[local78][local85] = this.anInt3313 > 0 ? 4096 - Static137.method2402(local20, this.anInt3313) : 4096;
			}
			this.anIntArrayArray29[local78][this.anInt3312] = 4096;
		}
		this.anIntArray437[this.anInt3310] = 4096;
	}
}
