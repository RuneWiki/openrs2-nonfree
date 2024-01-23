import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class1_Sub4_Sub11 extends Class1_Sub4 {

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean383 = arg0.method1378() == 1;
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4756(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass85_41.method2339(arg0);
		if (this.aClass85_41.aBoolean171) {
			@Pc(21) int[][] local21 = this.method4749(0, arg0);
			@Pc(25) int[] local25 = local21[2];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local11[1];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[2];
			@Pc(45) int[] local45 = local21[0];
			for (@Pc(47) int local47 = 0; local47 < Static182.anInt3492; local47++) {
				local37[local47] = 4096 - local45[local47];
				local33[local47] = 4096 - local29[local47];
				local41[local47] = 4096 - local25[local47];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			@Pc(29) int[] local29 = this.method4750(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static182.anInt3492; local31++) {
				local19[local31] = 4096 - local29[local31];
			}
		}
		return local19;
	}
}
