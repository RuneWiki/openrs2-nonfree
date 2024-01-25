import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class14_Sub7_Sub35 extends Class14_Sub7 {

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			@Pc(31) int[] local31 = this.method9379(0, arg0);
			for (@Pc(33) int local33 = 0; local33 < Static613.anInt10114; local33++) {
				local11[local33] = 4096 - local31[local33];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9388(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass340_41.method8152(arg0);
		if (super.aClass340_41.aBoolean655) {
			@Pc(21) int[][] local21 = this.method9384(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static613.anInt10114; local47++) {
				local37[local47] = 4096 - local25[local47];
				local41[local47] = 4096 - local29[local47];
				local45[local47] = 4096 - local33[local47];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			super.aBoolean773 = arg1.method7695(105) == 1;
		}
	}
}
