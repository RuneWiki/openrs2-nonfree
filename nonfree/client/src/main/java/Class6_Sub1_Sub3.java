import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class6_Sub1_Sub3 extends Class6_Sub1 {

	@OriginalMember(owner = "client!an", name = "K", descriptor = "I")
	private int anInt219 = 1024;

	@OriginalMember(owner = "client!an", name = "M", descriptor = "I")
	private int anInt221 = 2048;

	@OriginalMember(owner = "client!an", name = "H", descriptor = "I")
	private int anInt217 = 3072;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V")
	@Override
	public void method5611() {
		this.anInt221 = this.anInt217 - this.anInt219;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			@Pc(26) int[] local26 = this.method5609(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static299.anInt5659; local28++) {
				local11[local28] = (this.anInt221 * local26[local28] >> 12) + this.anInt219;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt219 = arg0.method4021();
		} else if (arg1 == 1) {
			this.anInt217 = arg0.method4021();
		} else if (arg1 == 2) {
			super.aBoolean411 = arg0.method3972() == 1;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5608(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass220_41.method5816(arg0);
		if (super.aClass220_41.aBoolean429) {
			@Pc(29) int[][] local29 = this.method5618(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static299.anInt5659; local55++) {
				local45[local55] = this.anInt219 + (this.anInt221 * local33[local55] >> 12);
				local49[local55] = this.anInt219 + (this.anInt221 * local37[local55] >> 12);
				local53[local55] = this.anInt219 + (local41[local55] * this.anInt221 >> 12);
			}
		}
		return local11;
	}
}
