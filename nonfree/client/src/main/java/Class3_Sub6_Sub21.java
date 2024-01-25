import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class3_Sub6_Sub21 extends Class3_Sub6 {

	@OriginalMember(owner = "client!lp", name = "B", descriptor = "I")
	private int anInt5275;

	@OriginalMember(owner = "client!lp", name = "F", descriptor = "[[I")
	private int[][] anIntArrayArray118;

	@OriginalMember(owner = "client!lp", name = "J", descriptor = "I")
	private int anInt5281;

	@OriginalMember(owner = "client!lp", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray119;

	@OriginalMember(owner = "client!lp", name = "P", descriptor = "[I")
	private int[] anIntArray293;

	@OriginalMember(owner = "client!lp", name = "W", descriptor = "I")
	private int anInt5290;

	@OriginalMember(owner = "client!lp", name = "I", descriptor = "I")
	private int anInt5280 = 1024;

	@OriginalMember(owner = "client!lp", name = "H", descriptor = "I")
	private int anInt5279 = 4;

	@OriginalMember(owner = "client!lp", name = "E", descriptor = "I")
	private int anInt5277 = 8;

	@OriginalMember(owner = "client!lp", name = "K", descriptor = "I")
	private int anInt5282 = 409;

	@OriginalMember(owner = "client!lp", name = "L", descriptor = "I")
	private int anInt5283 = 0;

	@OriginalMember(owner = "client!lp", name = "O", descriptor = "I")
	private int anInt5285 = 204;

	@OriginalMember(owner = "client!lp", name = "R", descriptor = "I")
	private int anInt5286 = 1024;

	@OriginalMember(owner = "client!lp", name = "V", descriptor = "I")
	private int anInt5289 = 81;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)V")
	private void method4548() {
		@Pc(12) Random local12 = new Random((long) this.anInt5277);
		this.anInt5281 = 4096 / this.anInt5279;
		this.anInt5275 = 4096 / this.anInt5277;
		this.anInt5290 = this.anInt5289 / 2;
		@Pc(41) int local41 = this.anInt5281 / 2;
		this.anIntArrayArray118 = new int[this.anInt5277][this.anInt5279];
		@Pc(53) int local53 = this.anInt5275 / 2;
		this.anIntArrayArray119 = new int[this.anInt5277][this.anInt5279 + 1];
		this.anIntArray293 = new int[this.anInt5277 + 1];
		this.anIntArray293[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt5277; local76++) {
			@Pc(86) int local86;
			@Pc(98) int local98;
			if (local76 > 0) {
				local86 = this.anInt5275;
				local98 = (Static164.method2981(local12, 4096) - 2048) * this.anInt5285 >> 12;
				@Pc(106) int local106 = local86 + (local53 * local98 >> 12);
				this.anIntArray293[local76] = local106 + this.anIntArray293[local76 - 1];
			}
			this.anIntArrayArray119[local76][0] = 0;
			for (local86 = 0; local86 < this.anInt5279; local86++) {
				if (local86 > 0) {
					local98 = this.anInt5281;
					@Pc(146) int local146 = (Static164.method2981(local12, 4096) - 2048) * this.anInt5282 >> 12;
					local98 += local146 * local41 >> 12;
					this.anIntArrayArray119[local76][local86] = this.anIntArrayArray119[local76][local86 - 1] + local98;
				}
				this.anIntArrayArray118[local76][local86] = this.anInt5286 <= 0 ? 4096 : 4096 - Static164.method2981(local12, this.anInt5286);
			}
			this.anIntArrayArray119[local76][this.anInt5279] = 4096;
		}
		this.anIntArray293[this.anInt5277] = 4096;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V")
	@Override
	public void method7768() {
		this.method4548();
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			@Pc(17) int local17 = 0;
			@Pc(24) int local24;
			for (local24 = Static525.anIntArray553[arg0] + this.anInt5283; local24 < 0; local24 += 4096) {
			}
			while (local24 > 4096) {
				local24 -= 4096;
			}
			while (local17 < this.anInt5277 && this.anIntArray293[local17] <= local24) {
				local17++;
			}
			@Pc(65) int local65 = local17 - 1;
			@Pc(76) boolean local76 = (local17 & 0x1) == 0;
			@Pc(81) int local81 = this.anIntArray293[local17];
			@Pc(88) int local88 = this.anIntArray293[local17 - 1];
			if (local88 + this.anInt5290 < local24 && local81 - this.anInt5290 > local24) {
				for (@Pc(110) int local110 = 0; local110 < Static521.anInt8383; local110++) {
					@Pc(114) int local114 = 0;
					@Pc(123) int local123 = local76 ? this.anInt5280 : -this.anInt5280;
					@Pc(134) int local134;
					for (local134 = Static73.anIntArray76[local110] + (this.anInt5281 * local123 >> 12); local134 < 0; local134 += 4096) {
					}
					while (local134 > 4096) {
						local134 -= 4096;
					}
					while (local114 < this.anInt5279 && this.anIntArrayArray119[local65][local114] <= local134) {
						local114++;
					}
					@Pc(175) int local175 = local114 - 1;
					@Pc(182) int local182 = this.anIntArrayArray119[local65][local114];
					@Pc(189) int local189 = this.anIntArrayArray119[local65][local175];
					if (local134 > this.anInt5290 + local189 && local182 - this.anInt5290 > local134) {
						local11[local110] = this.anIntArrayArray118[local65][local175];
					} else {
						local11[local110] = 0;
					}
				}
			} else {
				Static601.method2820(local11, 0, Static521.anInt8383, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5279 = arg0.method5175();
		} else if (arg1 == 1) {
			this.anInt5277 = arg0.method5175();
		} else if (arg1 == 2) {
			this.anInt5282 = arg0.method5198();
		} else if (arg1 == 3) {
			this.anInt5285 = arg0.method5198();
		} else if (arg1 == 4) {
			this.anInt5280 = arg0.method5198();
		} else if (arg1 == 5) {
			this.anInt5283 = arg0.method5198();
		} else if (arg1 == 6) {
			this.anInt5289 = arg0.method5198();
		} else if (arg1 == 7) {
			this.anInt5286 = arg0.method5198();
		}
	}
}
