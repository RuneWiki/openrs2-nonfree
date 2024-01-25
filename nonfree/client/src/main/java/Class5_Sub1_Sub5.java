import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class5_Sub1_Sub5 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ek", name = "E", descriptor = "[I")
	private int[] anIntArray217;

	@OriginalMember(owner = "client!ek", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!ek", name = "M", descriptor = "I")
	private int anInt2526;

	@OriginalMember(owner = "client!ek", name = "O", descriptor = "I")
	private int anInt2528;

	@OriginalMember(owner = "client!ek", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!ek", name = "U", descriptor = "I")
	private int anInt2531;

	@OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
	private int anInt2519 = 409;

	@OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
	private int anInt2520 = 0;

	@OriginalMember(owner = "client!ek", name = "Q", descriptor = "I")
	private int anInt2529 = 8;

	@OriginalMember(owner = "client!ek", name = "G", descriptor = "I")
	private int anInt2521 = 1024;

	@OriginalMember(owner = "client!ek", name = "L", descriptor = "I")
	private int anInt2525 = 4;

	@OriginalMember(owner = "client!ek", name = "R", descriptor = "I")
	private int anInt2530 = 204;

	@OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
	private int anInt2522 = 1024;

	@OriginalMember(owner = "client!ek", name = "N", descriptor = "I")
	private int anInt2527 = 81;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	@Override
	public void method7157() {
		this.method2263();
	}

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)V")
	private void method2263() {
		@Pc(12) Random local12 = new Random((long) this.anInt2529);
		this.anInt2528 = 4096 / this.anInt2525;
		this.anInt2526 = 4096 / this.anInt2529;
		this.anInt2531 = this.anInt2527 / 2;
		@Pc(35) int local35 = this.anInt2528 / 2;
		this.anIntArrayArray20 = new int[this.anInt2529][this.anInt2525 + 1];
		@Pc(49) int local49 = this.anInt2526 / 2;
		this.anIntArray217 = new int[this.anInt2529 + 1];
		this.anIntArrayArray19 = new int[this.anInt2529][this.anInt2525];
		this.anIntArray217[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt2529; local70++) {
			@Pc(77) int local77;
			@Pc(89) int local89;
			if (local70 > 0) {
				local77 = this.anInt2526;
				local89 = (Static542.method7398(local12, 4096) - 2048) * this.anInt2530 >> 12;
				@Pc(97) int local97 = local77 + (local49 * local89 >> 12);
				this.anIntArray217[local70] = local97 + this.anIntArray217[local70 - 1];
			}
			this.anIntArrayArray20[local70][0] = 0;
			for (local77 = 0; local77 < this.anInt2525; local77++) {
				if (local77 > 0) {
					local89 = this.anInt2528;
					@Pc(137) int local137 = (Static542.method7398(local12, 4096) - 2048) * this.anInt2519 >> 12;
					local89 += local137 * local35 >> 12;
					this.anIntArrayArray20[local70][local77] = this.anIntArrayArray20[local70][local77 - 1] + local89;
				}
				this.anIntArrayArray19[local70][local77] = this.anInt2522 > 0 ? 4096 - Static542.method7398(local12, this.anInt2522) : 4096;
			}
			this.anIntArrayArray20[local70][this.anInt2525] = 4096;
		}
		this.anIntArray217[this.anInt2529] = 4096;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			@Pc(25) int local25 = 0;
			@Pc(32) int local32;
			for (local32 = Static295.anIntArray403[arg0] + this.anInt2520; local32 < 0; local32 += 4096) {
			}
			while (local32 > 4096) {
				local32 -= 4096;
			}
			while (local25 < this.anInt2529 && this.anIntArray217[local25] <= local32) {
				local25++;
			}
			@Pc(69) int local69 = local25 - 1;
			@Pc(80) boolean local80 = (local25 & 0x1) == 0;
			@Pc(85) int local85 = this.anIntArray217[local25];
			@Pc(92) int local92 = this.anIntArray217[local25 - 1];
			if (local32 > local92 + this.anInt2531 && local85 - this.anInt2531 > local32) {
				for (@Pc(119) int local119 = 0; local119 < Static147.anInt3075; local119++) {
					@Pc(123) int local123 = 0;
					@Pc(132) int local132 = local80 ? this.anInt2521 : -this.anInt2521;
					@Pc(144) int local144;
					for (local144 = Static315.anIntArray425[local119] + (local132 * this.anInt2528 >> 12); local144 < 0; local144 += 4096) {
					}
					while (local144 > 4096) {
						local144 -= 4096;
					}
					while (local123 < this.anInt2525 && this.anIntArrayArray20[local69][local123] <= local144) {
						local123++;
					}
					@Pc(183) int local183 = local123 - 1;
					@Pc(190) int local190 = this.anIntArrayArray20[local69][local183];
					@Pc(197) int local197 = this.anIntArrayArray20[local69][local123];
					if (local144 > this.anInt2531 + local190 && local144 < local197 - this.anInt2531) {
						local19[local119] = this.anIntArrayArray19[local69][local183];
					} else {
						local19[local119] = 0;
					}
				}
			} else {
				Static553.method2532(local19, 0, Static147.anInt3075, 0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt2525 = arg1.method4220();
		} else if (arg0 == 1) {
			this.anInt2529 = arg1.method4220();
		} else if (arg0 == 2) {
			this.anInt2519 = arg1.method4227();
		} else if (arg0 == 3) {
			this.anInt2530 = arg1.method4227();
		} else if (arg0 == 4) {
			this.anInt2521 = arg1.method4227();
		} else if (arg0 == 5) {
			this.anInt2520 = arg1.method4227();
		} else if (arg0 == 6) {
			this.anInt2527 = arg1.method4227();
		} else if (arg0 == 7) {
			this.anInt2522 = arg1.method4227();
		}
	}
}
