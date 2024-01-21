import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class2_Sub2_Sub25 extends Class2_Sub2 {

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			@Pc(29) int[] local29 = this.method3569(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static106.anInt3045; local31++) {
				local19[local31] = 4096 - local29[local31];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			super.aBoolean183 = arg1.method218() == 1;
		}
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3568(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass90_41.method3443(arg0);
		if (super.aClass90_41.aBoolean177) {
			@Pc(29) int[][] local29 = this.method3557(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[1];
			@Pc(49) int[] local49 = local19[2];
			@Pc(53) int[] local53 = local19[0];
			for (@Pc(55) int local55 = 0; local55 < Static106.anInt3045; local55++) {
				local53[local55] = 4096 - local33[local55];
				local45[local55] = 4096 - local37[local55];
				local49[local55] = 4096 - local41[local55];
			}
		}
		return local19;
	}
}
