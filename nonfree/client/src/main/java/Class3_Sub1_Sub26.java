import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class3_Sub1_Sub26 extends Class3_Sub1 {

	@OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
	private int anInt2897;

	@OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
	private int anInt2899;

	@OriginalMember(owner = "client!pc", name = "S", descriptor = "[I")
	private int[] anIntArray330;

	@OriginalMember(owner = "client!pc", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!pc", name = "qb", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!pc", name = "tb", descriptor = "I")
	private int anInt2917;

	@OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
	private int anInt2894;

	@OriginalMember(owner = "client!pc", name = "ib", descriptor = "I")
	private int anInt2909;

	@OriginalMember(owner = "client!pc", name = "mb", descriptor = "I")
	private int anInt2912;

	@OriginalMember(owner = "client!pc", name = "eb", descriptor = "I")
	private int anInt2907;

	@OriginalMember(owner = "client!pc", name = "jb", descriptor = "I")
	private int anInt2910;

	@OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
	private int anInt2901;

	@OriginalMember(owner = "client!pc", name = "U", descriptor = "I")
	private int anInt2900;

	@OriginalMember(owner = "client!pc", name = "rb", descriptor = "I")
	private int anInt2915;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
	private void method2084() {
		@Pc(12) Random local12 = new Random((long) this.anInt2910);
		this.anInt2899 = 4096 / this.anInt2909;
		this.anIntArrayArray34 = new int[this.anInt2910][this.anInt2909 + 1];
		this.anIntArray330 = new int[this.anInt2910 + 1];
		@Pc(39) int local39 = this.anInt2899 / 2;
		this.anInt2897 = this.anInt2907 / 2;
		this.anIntArray330[0] = 0;
		this.anInt2917 = 4096 / this.anInt2910;
		this.anIntArrayArray33 = new int[this.anInt2910][this.anInt2909];
		@Pc(74) int local74 = this.anInt2917 / 2;
		for (@Pc(76) int local76 = 0; local76 < this.anInt2910; local76++) {
			@Pc(86) int local86;
			@Pc(98) int local98;
			if (local76 > 0) {
				local86 = this.anInt2917;
				local98 = (Static54.method1020(4096, local12) - 2048) * this.anInt2894 >> 12;
				@Pc(106) int local106 = local86 + (local98 * local74 >> 12);
				this.anIntArray330[local76] = this.anIntArray330[local76 - 1] + local106;
			}
			this.anIntArrayArray34[local76][0] = 0;
			for (local86 = 0; local86 < this.anInt2909; local86++) {
				if (local86 > 0) {
					local98 = this.anInt2899;
					@Pc(146) int local146 = (Static54.method1020(4096, local12) - 2048) * this.anInt2912 >> 12;
					local98 += local39 * local146 >> 12;
					this.anIntArrayArray34[local76][local86] = local98 + this.anIntArrayArray34[local76][local86 - 1];
				}
				this.anIntArrayArray33[local76][local86] = this.anInt2901 <= 0 ? 4096 : 4096 - Static54.method1020(this.anInt2901, local12);
			}
			this.anIntArrayArray34[local76][this.anInt2909] = 4096;
		}
		this.anIntArray330[this.anInt2910] = 4096;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V")
	@Override
	public void method2916() {
		this.method2084();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt2909 = arg1.method191();
		} else if (arg0 == 1) {
			this.anInt2910 = arg1.method191();
		} else if (arg0 == 2) {
			this.anInt2912 = arg1.method208();
		} else if (arg0 == 3) {
			this.anInt2894 = arg1.method208();
		} else if (arg0 == 4) {
			this.anInt2900 = arg1.method208();
		} else if (arg0 == 5) {
			this.anInt2915 = arg1.method208();
		} else if (arg0 == 6) {
			this.anInt2907 = arg1.method208();
		} else if (arg0 == 7) {
			this.anInt2901 = arg1.method208();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			@Pc(17) int local17 = 0;
			@Pc(25) int local25;
			for (local25 = Static125.anIntArray336[arg0] + this.anInt2915; local25 < 0; local25 += 4096) {
			}
			while (local25 > 4096) {
				local25 -= 4096;
			}
			while (local17 < this.anInt2910 && local25 >= this.anIntArray330[local17]) {
				local17++;
			}
			@Pc(68) float local68 = (float) this.anIntArray330[local17 - 1];
			@Pc(74) float local74 = (float) this.anIntArray330[local17];
			if ((float) this.anInt2897 + local68 < (float) local25 && (float) local25 < (float) -this.anInt2897 + local74) {
				for (@Pc(95) int local95 = 0; local95 < Static141.anInt3261; local95++) {
					@Pc(99) int local99 = 0;
					@Pc(110) int local110 = local17 % 2 == 0 ? this.anInt2900 : -this.anInt2900;
					@Pc(121) int local121;
					for (local121 = Static85.anIntArray47[local95] + (local110 * this.anInt2899 >> 12); local121 < 0; local121 += 4096) {
					}
					while (local121 > 4096) {
						local121 -= 4096;
					}
					while (this.anInt2909 > local99 && this.anIntArrayArray34[local17 - 1][local99] <= local121) {
						local99++;
					}
					@Pc(170) float local170 = (float) this.anIntArrayArray34[local17 - 1][local99 - 1];
					@Pc(180) float local180 = (float) this.anIntArrayArray34[local17 - 1][local99];
					if (local170 + (float) this.anInt2897 < (float) local121 && (float) -this.anInt2897 + local180 > (float) local121) {
						local7[local95] = this.anIntArrayArray33[local17 - 1][local99 - 1];
					} else {
						local7[local95] = 0;
					}
				}
			} else {
				Static184.method1308(local7, 0, Static141.anInt3261, 0);
			}
		}
		return local7;
	}
}
