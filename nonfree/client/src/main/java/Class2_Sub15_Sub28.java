import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public final class Class2_Sub15_Sub28 extends Class2_Sub15 {

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub28() {
		super(1, true);
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			@Pc(29) int[][] local29 = this.method9727(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			for (@Pc(43) int local43 = 0; local43 < Static329.anInt6017; local43++) {
				local11[local43] = (local33[local43] + local37[local43] + local41[local43]) / 3;
			}
		}
		return local11;
	}
}
