import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eda")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!eda", name = "G", descriptor = "I")
	private int anInt2317;

	@OriginalMember(owner = "client!eda", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!eda", name = "I", descriptor = "I")
	private int anInt2318;

	@OriginalMember(owner = "client!eda", name = "J", descriptor = "[I")
	private int[] anIntArray137;

	@OriginalMember(owner = "client!eda", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!eda", name = "V", descriptor = "I")
	private int anInt2327;

	@OriginalMember(owner = "client!eda", name = "B", descriptor = "I")
	private int anInt2313 = 0;

	@OriginalMember(owner = "client!eda", name = "D", descriptor = "I")
	private int anInt2315 = 81;

	@OriginalMember(owner = "client!eda", name = "P", descriptor = "I")
	private int anInt2322 = 1024;

	@OriginalMember(owner = "client!eda", name = "C", descriptor = "I")
	private int anInt2314 = 1024;

	@OriginalMember(owner = "client!eda", name = "O", descriptor = "I")
	private int anInt2321 = 4;

	@OriginalMember(owner = "client!eda", name = "S", descriptor = "I")
	private int anInt2325 = 204;

	@OriginalMember(owner = "client!eda", name = "T", descriptor = "I")
	private int anInt2326 = 8;

	@OriginalMember(owner = "client!eda", name = "N", descriptor = "I")
	private int anInt2320 = 409;

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt2321 = arg1.method4393();
		} else if (arg0 == 1) {
			this.anInt2326 = arg1.method4393();
		} else if (arg0 == 2) {
			this.anInt2320 = arg1.method4426();
		} else if (arg0 == 3) {
			this.anInt2325 = arg1.method4426();
		} else if (arg0 == 4) {
			this.anInt2322 = arg1.method4426();
		} else if (arg0 == 5) {
			this.anInt2313 = arg1.method4426();
		} else if (arg0 == 6) {
			this.anInt2315 = arg1.method4426();
		} else if (arg0 == 7) {
			this.anInt2314 = arg1.method4426();
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)V")
	@Override
	public void method7885() {
		this.method2004();
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = this.anInt2313 + Static337.anIntArray406[arg0]; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (this.anInt2326 > local22 && local29 >= this.anIntArray137[local22]) {
				local22++;
			}
			@Pc(63) int local63 = local22 - 1;
			@Pc(74) boolean local74 = (local22 & 0x1) == 0;
			@Pc(79) int local79 = this.anIntArray137[local22];
			@Pc(86) int local86 = this.anIntArray137[local22 - 1];
			if (local29 > this.anInt2317 + local86 && local29 < local79 - this.anInt2317) {
				for (@Pc(109) int local109 = 0; local109 < Static87.anInt1964; local109++) {
					@Pc(113) int local113 = 0;
					@Pc(122) int local122 = local74 ? this.anInt2322 : -this.anInt2322;
					@Pc(133) int local133;
					for (local133 = (local122 * this.anInt2318 >> 12) + Static436.anIntArray506[local109]; local133 < 0; local133 += 4096) {
					}
					while (local133 > 4096) {
						local133 -= 4096;
					}
					while (local113 < this.anInt2321 && this.anIntArrayArray17[local63][local113] <= local133) {
						local113++;
					}
					@Pc(163) int local163 = local113 - 1;
					@Pc(170) int local170 = this.anIntArrayArray17[local63][local113];
					@Pc(177) int local177 = this.anIntArrayArray17[local63][local163];
					if (local133 > local177 + this.anInt2317 && local133 < local170 - this.anInt2317) {
						local16[local109] = this.anIntArrayArray18[local63][local163];
					} else {
						local16[local109] = 0;
					}
				}
			} else {
				Static600.method3767(local16, 0, Static87.anInt1964, 0);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "(I)V")
	private void method2004() {
		@Pc(12) Random local12 = new Random((long) this.anInt2326);
		this.anInt2318 = 4096 / this.anInt2321;
		this.anInt2317 = this.anInt2315 / 2;
		this.anInt2327 = 4096 / this.anInt2326;
		@Pc(43) int local43 = this.anInt2318 / 2;
		@Pc(48) int local48 = this.anInt2327 / 2;
		this.anIntArrayArray17 = new int[this.anInt2326][this.anInt2321 + 1];
		this.anIntArrayArray18 = new int[this.anInt2326][this.anInt2321];
		this.anIntArray137 = new int[this.anInt2326 + 1];
		this.anIntArray137[0] = 0;
		for (@Pc(78) int local78 = 0; local78 < this.anInt2326; local78++) {
			@Pc(85) int local85;
			@Pc(97) int local97;
			if (local78 > 0) {
				local85 = this.anInt2327;
				local97 = (Static521.method7113(4096, local12) - 2048) * this.anInt2325 >> 12;
				@Pc(105) int local105 = local85 + (local48 * local97 >> 12);
				this.anIntArray137[local78] = this.anIntArray137[local78 - 1] + local105;
			}
			this.anIntArrayArray17[local78][0] = 0;
			for (local85 = 0; local85 < this.anInt2321; local85++) {
				if (local85 > 0) {
					local97 = this.anInt2318;
					@Pc(149) int local149 = (Static521.method7113(4096, local12) - 2048) * this.anInt2320 >> 12;
					local97 += local43 * local149 >> 12;
					this.anIntArrayArray17[local78][local85] = local97 + this.anIntArrayArray17[local78][local85 - 1];
				}
				this.anIntArrayArray18[local78][local85] = this.anInt2314 <= 0 ? 4096 : 4096 - Static521.method7113(this.anInt2314, local12);
			}
			this.anIntArrayArray17[local78][this.anInt2321] = 4096;
		}
		this.anIntArray137[this.anInt2326] = 4096;
	}
}
