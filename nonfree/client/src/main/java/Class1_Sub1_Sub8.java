import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			@Pc(28) int[] local28 = this.method4450(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static131.anInt2513; local30++) {
				local11[local30] = 4096 - local28[local30];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method4444(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = this.aClass153_41.method3955(arg0);
		if (this.aClass153_41.aBoolean396) {
			@Pc(21) int[][] local21 = this.method4457(0, arg0);
			@Pc(25) int[] local25 = local21[1];
			@Pc(29) int[] local29 = local21[0];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static131.anInt2513; local47++) {
				local37[local47] = 4096 - local29[local47];
				local41[local47] = 4096 - local25[local47];
				local45[local47] = 4096 - local33[local47];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean434 = arg0.method3122() == 1;
		}
	}
}
