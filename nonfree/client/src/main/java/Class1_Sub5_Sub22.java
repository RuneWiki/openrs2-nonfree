import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class1_Sub5_Sub22 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ng", name = "Q", descriptor = "I")
	private int anInt2595;

	@OriginalMember(owner = "client!ng", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!ng", name = "T", descriptor = "[I")
	private int[] anIntArray274;

	@OriginalMember(owner = "client!ng", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!ng", name = "ib", descriptor = "I")
	private int anInt2604;

	@OriginalMember(owner = "client!ng", name = "nb", descriptor = "I")
	private int anInt2608;

	@OriginalMember(owner = "client!ng", name = "N", descriptor = "I")
	private int anInt2592;

	@OriginalMember(owner = "client!ng", name = "X", descriptor = "I")
	private int anInt2598;

	@OriginalMember(owner = "client!ng", name = "P", descriptor = "I")
	private int anInt2594;

	@OriginalMember(owner = "client!ng", name = "db", descriptor = "I")
	private int anInt2601;

	@OriginalMember(owner = "client!ng", name = "ab", descriptor = "I")
	private int anInt2600;

	@OriginalMember(owner = "client!ng", name = "gb", descriptor = "I")
	private int anInt2603;

	@OriginalMember(owner = "client!ng", name = "jb", descriptor = "I")
	private int anInt2605;

	@OriginalMember(owner = "client!ng", name = "S", descriptor = "I")
	private int anInt2596;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2596 = arg0.method336();
		} else if (arg1 == 1) {
			this.anInt2603 = arg0.method336();
		} else if (arg1 == 2) {
			this.anInt2594 = arg0.method359();
		} else if (arg1 == 3) {
			this.anInt2592 = arg0.method359();
		} else if (arg1 == 4) {
			this.anInt2601 = arg0.method359();
		} else if (arg1 == 5) {
			this.anInt2598 = arg0.method359();
		} else if (arg1 == 6) {
			this.anInt2605 = arg0.method359();
		} else if (arg1 == 7) {
			this.anInt2600 = arg0.method359();
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V")
	@Override
	public void method3146() {
		this.method2023();
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(27) int local27;
			for (local27 = this.anInt2598 + Static34.anIntArray75[arg0]; local27 < 0; local27 += 4096) {
			}
			@Pc(34) int local34 = 0;
			while (local27 > 4096) {
				local27 -= 4096;
			}
			while (local34 < this.anInt2603 && local27 >= this.anIntArray274[local34]) {
				local34++;
			}
			@Pc(63) float local63 = (float) this.anIntArray274[local34];
			@Pc(71) float local71 = (float) this.anIntArray274[local34 - 1];
			if (local71 + (float) this.anInt2595 < (float) local27 && (float) local27 < (float) -this.anInt2595 + local63) {
				for (@Pc(99) int local99 = 0; local99 < Static177.anInt4018; local99++) {
					@Pc(103) int local103 = 0;
					@Pc(117) int local117 = local34 % 2 == 0 ? this.anInt2601 : -this.anInt2601;
					@Pc(128) int local128;
					for (local128 = (this.anInt2608 * local117 >> 12) + Static116.anIntArray275[local99]; local128 < 0; local128 += 4096) {
					}
					while (local128 > 4096) {
						local128 -= 4096;
					}
					while (this.anInt2596 > local103 && local128 >= this.anIntArrayArray21[local34 - 1][local103]) {
						local103++;
					}
					@Pc(173) float local173 = (float) this.anIntArrayArray21[local34 - 1][local103];
					@Pc(185) float local185 = (float) this.anIntArrayArray21[local34 - 1][local103 - 1];
					if ((float) this.anInt2595 + local185 < (float) local128 && (float) local128 < (float) -this.anInt2595 + local173) {
						local16[local99] = this.anIntArrayArray22[local34 - 1][local103 - 1];
					} else {
						local16[local99] = 0;
					}
				}
			} else {
				Static190.method1385(local16, 0, Static177.anInt4018, 0);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(Z)V")
	private void method2023() {
		@Pc(8) Random local8 = new Random((long) this.anInt2603);
		this.anInt2608 = 4096 / this.anInt2596;
		this.anInt2604 = 4096 / this.anInt2603;
		@Pc(25) int local25 = this.anInt2608 / 2;
		this.anIntArray274 = new int[this.anInt2603 + 1];
		this.anIntArrayArray21 = new int[this.anInt2603][this.anInt2596 + 1];
		this.anIntArray274[0] = 0;
		this.anIntArrayArray22 = new int[this.anInt2603][this.anInt2596];
		this.anInt2595 = this.anInt2605 / 2;
		@Pc(68) int local68 = this.anInt2604 / 2;
		for (@Pc(70) int local70 = 0; local70 < this.anInt2603; local70++) {
			@Pc(80) int local80;
			@Pc(92) int local92;
			if (local70 > 0) {
				local80 = this.anInt2604;
				local92 = (Static103.method1706(4096, local8) - 2048) * this.anInt2592 >> 12;
				@Pc(100) int local100 = local80 + (local92 * local68 >> 12);
				this.anIntArray274[local70] = local100 + this.anIntArray274[local70 - 1];
			}
			this.anIntArrayArray21[local70][0] = 0;
			for (local80 = 0; local80 < this.anInt2596; local80++) {
				if (local80 > 0) {
					local92 = this.anInt2608;
					@Pc(143) int local143 = (Static103.method1706(4096, local8) - 2048) * this.anInt2594 >> 12;
					local92 += local25 * local143 >> 12;
					this.anIntArrayArray21[local70][local80] = this.anIntArrayArray21[local70][local80 - 1] + local92;
				}
				this.anIntArrayArray22[local70][local80] = this.anInt2600 <= 0 ? 4096 : 4096 - Static103.method1706(this.anInt2600, local8);
			}
			this.anIntArrayArray21[local70][this.anInt2596] = 4096;
		}
		this.anIntArray274[this.anInt2603] = 4096;
	}
}
