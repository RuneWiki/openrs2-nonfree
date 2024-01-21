import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class2_Sub1_Sub31 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ta", name = "fb", descriptor = "[I")
	private int[] anIntArray539;

	@OriginalMember(owner = "client!ta", name = "mb", descriptor = "I")
	private int anInt3693;

	@OriginalMember(owner = "client!ta", name = "rb", descriptor = "I")
	private int anInt3697;

	@OriginalMember(owner = "client!ta", name = "ub", descriptor = "I")
	private int anInt3700;

	@OriginalMember(owner = "client!ta", name = "vb", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!ta", name = "zb", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!ta", name = "db", descriptor = "I")
	private int anInt3688;

	@OriginalMember(owner = "client!ta", name = "cb", descriptor = "I")
	private int anInt3687;

	@OriginalMember(owner = "client!ta", name = "lb", descriptor = "I")
	private int anInt3692;

	@OriginalMember(owner = "client!ta", name = "ob", descriptor = "I")
	private int anInt3694;

	@OriginalMember(owner = "client!ta", name = "yb", descriptor = "I")
	private int anInt3702;

	@OriginalMember(owner = "client!ta", name = "hb", descriptor = "I")
	private int anInt3690;

	@OriginalMember(owner = "client!ta", name = "pb", descriptor = "I")
	private int anInt3695;

	@OriginalMember(owner = "client!ta", name = "Cb", descriptor = "I")
	private int anInt3705;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			@Pc(25) int local25 = 0;
			@Pc(32) int local32;
			for (local32 = this.anInt3695 + Static166.anIntArray619[arg0]; local32 < 0; local32 += 4096) {
			}
			while (local32 > 4096) {
				local32 -= 4096;
			}
			while (this.anInt3694 > local25 && local32 >= this.anIntArray539[local25]) {
				local25++;
			}
			@Pc(77) float local77 = (float) this.anIntArray539[local25 - 1];
			@Pc(83) float local83 = (float) this.anIntArray539[local25];
			if (local77 + (float) this.anInt3693 < (float) local32 && (float) local32 < local83 - (float) this.anInt3693) {
				for (@Pc(103) int local103 = 0; local103 < Static129.anInt3118; local103++) {
					@Pc(107) int local107 = 0;
					@Pc(118) int local118 = local25 % 2 == 0 ? this.anInt3690 : -this.anInt3690;
					@Pc(129) int local129;
					for (local129 = (local118 * this.anInt3697 >> 12) + Static163.anIntArray577[local103]; local129 < 0; local129 += 4096) {
					}
					while (local129 > 4096) {
						local129 -= 4096;
					}
					while (local107 < this.anInt3702 && this.anIntArrayArray34[local25 - 1][local107] <= local129) {
						local107++;
					}
					@Pc(173) float local173 = (float) this.anIntArrayArray34[local25 - 1][local107 - 1];
					@Pc(183) float local183 = (float) this.anIntArrayArray34[local25 - 1][local107];
					if ((float) local129 > (float) this.anInt3693 + local173 && (float) local129 < (float) -this.anInt3693 + local183) {
						local11[local103] = this.anIntArrayArray33[local25 - 1][local107 - 1];
					} else {
						local11[local103] = 0;
					}
				}
			} else {
				Static186.method1562(local11, 0, Static129.anInt3118, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "(I)V")
	private void method2563() {
		@Pc(8) Random local8 = new Random((long) this.anInt3694);
		this.anIntArray539 = new int[this.anInt3694 + 1];
		this.anInt3693 = this.anInt3688 / 2;
		this.anInt3700 = 4096 / this.anInt3694;
		@Pc(36) int local36 = this.anInt3700 / 2;
		this.anInt3697 = 4096 / this.anInt3702;
		this.anIntArrayArray34 = new int[this.anInt3694][this.anInt3702 + 1];
		this.anIntArray539[0] = 0;
		this.anIntArrayArray33 = new int[this.anInt3694][this.anInt3702];
		@Pc(68) int local68 = this.anInt3697 / 2;
		for (@Pc(75) int local75 = 0; local75 < this.anInt3694; local75++) {
			@Pc(85) int local85;
			@Pc(99) int local99;
			if (local75 > 0) {
				local85 = this.anInt3700;
				local99 = (Static41.method805(local8, 4096) - 2048) * this.anInt3692 >> 12;
				@Pc(107) int local107 = local85 + (local99 * local36 >> 12);
				this.anIntArray539[local75] = local107 + this.anIntArray539[local75 - 1];
			}
			this.anIntArrayArray34[local75][0] = 0;
			for (local85 = 0; local85 < this.anInt3702; local85++) {
				if (local85 > 0) {
					local99 = this.anInt3697;
					@Pc(150) int local150 = (Static41.method805(local8, 4096) - 2048) * this.anInt3687 >> 12;
					local99 += local68 * local150 >> 12;
					this.anIntArrayArray34[local75][local85] = this.anIntArrayArray34[local75][local85 - 1] + local99;
				}
				this.anIntArrayArray33[local75][local85] = this.anInt3705 <= 0 ? 4096 : 4096 - Static41.method805(local8, this.anInt3705);
			}
			this.anIntArrayArray34[local75][this.anInt3702] = 4096;
		}
		this.anIntArray539[this.anInt3694] = 4096;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3702 = arg0.method2387();
		} else if (arg1 == 1) {
			this.anInt3694 = arg0.method2387();
		} else if (arg1 == 2) {
			this.anInt3687 = arg0.method2353();
		} else if (arg1 == 3) {
			this.anInt3692 = arg0.method2353();
		} else if (arg1 == 4) {
			this.anInt3690 = arg0.method2353();
		} else if (arg1 == 5) {
			this.anInt3695 = arg0.method2353();
		} else if (arg1 == 6) {
			this.anInt3688 = arg0.method2353();
		} else if (arg1 == 7) {
			this.anInt3705 = arg0.method2353();
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(Z)V")
	@Override
	public void method2992() {
		this.method2563();
	}
}
