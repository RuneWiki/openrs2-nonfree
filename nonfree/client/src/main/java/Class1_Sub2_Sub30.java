import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class1_Sub2_Sub30 extends Class1_Sub2 {

	@OriginalMember(owner = "client!qb", name = "db", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!qb", name = "gb", descriptor = "I")
	private int anInt3665;

	@OriginalMember(owner = "client!qb", name = "lb", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!qb", name = "nb", descriptor = "I")
	private int anInt3670;

	@OriginalMember(owner = "client!qb", name = "ob", descriptor = "[I")
	private int[] anIntArray352;

	@OriginalMember(owner = "client!qb", name = "tb", descriptor = "I")
	private int anInt3673;

	@OriginalMember(owner = "client!qb", name = "bb", descriptor = "I")
	private int anInt3661;

	@OriginalMember(owner = "client!qb", name = "Y", descriptor = "I")
	private int anInt3658;

	@OriginalMember(owner = "client!qb", name = "Z", descriptor = "I")
	private int anInt3659;

	@OriginalMember(owner = "client!qb", name = "ab", descriptor = "I")
	private int anInt3660;

	@OriginalMember(owner = "client!qb", name = "hb", descriptor = "I")
	private int anInt3666;

	@OriginalMember(owner = "client!qb", name = "ib", descriptor = "I")
	private int anInt3667;

	@OriginalMember(owner = "client!qb", name = "T", descriptor = "I")
	private int anInt3654;

	@OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
	private int anInt3655;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "(I)V")
	private void method2727() {
		@Pc(12) Random local12 = new Random((long) this.anInt3655);
		this.anIntArrayArray31 = new int[this.anInt3655][this.anInt3654 + 1];
		this.anInt3665 = 4096 / this.anInt3654;
		this.anInt3673 = 4096 / this.anInt3655;
		this.anIntArray352 = new int[this.anInt3655 + 1];
		this.anIntArray352[0] = 0;
		this.anIntArrayArray30 = new int[this.anInt3655][this.anInt3654];
		@Pc(57) int local57 = this.anInt3665 / 2;
		@Pc(62) int local62 = this.anInt3673 / 2;
		this.anInt3670 = this.anInt3659 / 2;
		for (@Pc(70) int local70 = 0; local70 < this.anInt3655; local70++) {
			@Pc(80) int local80;
			@Pc(92) int local92;
			if (local70 > 0) {
				local80 = this.anInt3673;
				local92 = (Static152.method1616(4096, local12) - 2048) * this.anInt3667 >> 12;
				@Pc(100) int local100 = local80 + (local92 * local62 >> 12);
				this.anIntArray352[local70] = local100 + this.anIntArray352[local70 - 1];
			}
			this.anIntArrayArray31[local70][0] = 0;
			for (local80 = 0; local80 < this.anInt3654; local80++) {
				if (local80 > 0) {
					local92 = this.anInt3665;
					@Pc(140) int local140 = (Static152.method1616(4096, local12) - 2048) * this.anInt3660 >> 12;
					local92 += local140 * local57 >> 12;
					this.anIntArrayArray31[local70][local80] = local92 + this.anIntArrayArray31[local70][local80 - 1];
				}
				this.anIntArrayArray30[local70][local80] = this.anInt3658 > 0 ? 4096 - Static152.method1616(this.anInt3658, local12) : 4096;
			}
			this.anIntArrayArray31[local70][this.anInt3654] = 4096;
		}
		this.anIntArray352[this.anInt3655] = 4096;
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
	@Override
	public void method3389() {
		this.method2727();
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			for (local30 = this.anInt3661 + Static160.anIntArray399[arg0]; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (local23 < this.anInt3655 && local30 >= this.anIntArray352[local23]) {
				local23++;
			}
			@Pc(67) float local67 = (float) this.anIntArray352[local23];
			@Pc(75) float local75 = (float) this.anIntArray352[local23 - 1];
			if ((float) local30 > local75 + (float) this.anInt3670 && (float) -this.anInt3670 + local67 > (float) local30) {
				for (@Pc(103) int local103 = 0; local103 < Static22.anInt596; local103++) {
					@Pc(107) int local107 = 0;
					@Pc(121) int local121 = local23 % 2 == 0 ? this.anInt3666 : -this.anInt3666;
					@Pc(133) int local133;
					for (local133 = Static167.anIntArray417[local103] + (this.anInt3665 * local121 >> 12); local133 < 0; local133 += 4096) {
					}
					while (local133 > 4096) {
						local133 -= 4096;
					}
					while (this.anInt3654 > local107 && local133 >= this.anIntArrayArray31[local23 - 1][local107]) {
						local107++;
					}
					@Pc(176) float local176 = (float) this.anIntArrayArray31[local23 - 1][local107 - 1];
					@Pc(186) float local186 = (float) this.anIntArrayArray31[local23 - 1][local107];
					if (local176 + (float) this.anInt3670 < (float) local133 && (float) local133 < (float) -this.anInt3670 + local186) {
						local17[local103] = this.anIntArrayArray30[local23 - 1][local107 - 1];
					} else {
						local17[local103] = 0;
					}
				}
			} else {
				Static188.method2301(local17, 0, Static22.anInt596, 0);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt3654 = arg1.method1234();
		} else if (arg0 == 1) {
			this.anInt3655 = arg1.method1234();
		} else if (arg0 == 2) {
			this.anInt3660 = arg1.method1280();
		} else if (arg0 == 3) {
			this.anInt3667 = arg1.method1280();
		} else if (arg0 == 4) {
			this.anInt3666 = arg1.method1280();
		} else if (arg0 == 5) {
			this.anInt3661 = arg1.method1280();
		} else if (arg0 == 6) {
			this.anInt3659 = arg1.method1280();
		} else if (arg0 == 7) {
			this.anInt3658 = arg1.method1280();
		}
	}
}
