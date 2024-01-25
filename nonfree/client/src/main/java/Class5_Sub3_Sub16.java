import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hka")
public final class Class5_Sub3_Sub16 extends Class5_Sub3 {

	@OriginalMember(owner = "client!hka", name = "P", descriptor = "I")
	private int anInt3822;

	@OriginalMember(owner = "client!hka", name = "bb", descriptor = "[I")
	private int[] anIntArray192;

	@OriginalMember(owner = "client!hka", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!hka", name = "fb", descriptor = "I")
	private int anInt3827;

	@OriginalMember(owner = "client!hka", name = "Z", descriptor = "I")
	private int anInt3837;

	@OriginalMember(owner = "client!hka", name = "Y", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!hka", name = "V", descriptor = "I")
	private int anInt3826 = 1024;

	@OriginalMember(owner = "client!hka", name = "L", descriptor = "I")
	private int anInt3824 = 0;

	@OriginalMember(owner = "client!hka", name = "db", descriptor = "I")
	private int anInt3833 = 204;

	@OriginalMember(owner = "client!hka", name = "gb", descriptor = "I")
	private int anInt3823 = 1024;

	@OriginalMember(owner = "client!hka", name = "S", descriptor = "I")
	private int anInt3831 = 4;

	@OriginalMember(owner = "client!hka", name = "O", descriptor = "I")
	private int anInt3836 = 8;

	@OriginalMember(owner = "client!hka", name = "W", descriptor = "I")
	private int anInt3835 = 409;

	@OriginalMember(owner = "client!hka", name = "N", descriptor = "I")
	private int anInt3834 = 81;

	@OriginalMember(owner = "client!hka", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			@Pc(17) int local17 = 0;
			@Pc(24) int local24;
			for (local24 = this.anInt3824 + Static458.anIntArray438[arg0]; local24 < 0; local24 += 4096) {
			}
			while (local24 > 4096) {
				local24 -= 4096;
			}
			while (local17 < this.anInt3836 && local24 >= this.anIntArray192[local17]) {
				local17++;
			}
			@Pc(69) int local69 = local17 - 1;
			@Pc(83) boolean local83 = (local17 & 0x1) == 0;
			@Pc(88) int local88 = this.anIntArray192[local17];
			@Pc(95) int local95 = this.anIntArray192[local17 - 1];
			if (local95 + this.anInt3827 < local24 && local88 - this.anInt3827 > local24) {
				for (@Pc(125) int local125 = 0; local125 < Static7.anInt102; local125++) {
					@Pc(139) int local139 = local83 ? this.anInt3826 : -this.anInt3826;
					@Pc(141) int local141 = 0;
					@Pc(152) int local152;
					for (local152 = (this.anInt3837 * local139 >> 12) + Static382.anIntArray368[local125]; local152 < 0; local152 += 4096) {
					}
					while (local152 > 4096) {
						local152 -= 4096;
					}
					while (local141 < this.anInt3831 && this.anIntArrayArray30[local69][local141] <= local152) {
						local141++;
					}
					@Pc(200) int local200 = local141 - 1;
					@Pc(207) int local207 = this.anIntArrayArray30[local69][local200];
					@Pc(214) int local214 = this.anIntArrayArray30[local69][local141];
					if (local152 > this.anInt3827 + local207 && local214 - this.anInt3827 > local152) {
						local11[local125] = this.anIntArrayArray29[local69][local200];
					} else {
						local11[local125] = 0;
					}
				}
			} else {
				Static693.method8318(local11, 0, Static7.anInt102, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(Z)V")
	private void method3524() {
		@Pc(12) Random local12 = new Random((long) this.anInt3836);
		this.anInt3827 = this.anInt3834 / 2;
		this.anInt3822 = 4096 / this.anInt3836;
		this.anInt3837 = 4096 / this.anInt3831;
		@Pc(35) int local35 = this.anInt3837 / 2;
		this.anIntArray192 = new int[this.anInt3836 + 1];
		this.anIntArrayArray30 = new int[this.anInt3836][this.anInt3831 + 1];
		this.anIntArrayArray29 = new int[this.anInt3836][this.anInt3831];
		@Pc(63) int local63 = this.anInt3822 / 2;
		this.anIntArray192[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt3836; local70++) {
			@Pc(90) int local90;
			@Pc(102) int local102;
			if (local70 > 0) {
				local90 = this.anInt3822;
				local102 = (Static131.method1936(local12, 4096) - 2048) * this.anInt3833 >> 12;
				@Pc(110) int local110 = local90 + (local102 * local63 >> 12);
				this.anIntArray192[local70] = this.anIntArray192[local70 - 1] + local110;
			}
			this.anIntArrayArray30[local70][0] = 0;
			for (local90 = 0; local90 < this.anInt3831; local90++) {
				if (local90 > 0) {
					local102 = this.anInt3837;
					@Pc(155) int local155 = (Static131.method1936(local12, 4096) - 2048) * this.anInt3835 >> 12;
					local102 += local35 * local155 >> 12;
					this.anIntArrayArray30[local70][local90] = this.anIntArrayArray30[local70][local90 - 1] + local102;
				}
				this.anIntArrayArray29[local70][local90] = this.anInt3823 <= 0 ? 4096 : 4096 - Static131.method1936(local12, this.anInt3823);
			}
			this.anIntArrayArray30[local70][this.anInt3831] = 4096;
		}
		this.anIntArray192[this.anInt3836] = 4096;
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(B)V")
	@Override
	public void method9210() {
		this.method3524();
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3831 = arg0.method7291();
		} else if (arg1 == 1) {
			this.anInt3836 = arg0.method7291();
		} else if (arg1 == 2) {
			this.anInt3835 = arg0.method7333();
		} else if (arg1 == 3) {
			this.anInt3833 = arg0.method7333();
		} else if (arg1 == 4) {
			this.anInt3826 = arg0.method7333();
		} else if (arg1 == 5) {
			this.anInt3824 = arg0.method7333();
		} else if (arg1 == 6) {
			this.anInt3834 = arg0.method7333();
		} else if (arg1 == 7) {
			this.anInt3823 = arg0.method7333();
		}
	}
}
