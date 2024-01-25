import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class3_Sub8_Sub5 extends Class3_Sub8 {

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub5() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			@Pc(29) int[][] local29 = this.method8779(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			for (@Pc(43) int local43 = 0; local43 < Static91.anInt1849; local43++) {
				local19[local43] = (local41[local43] + local37[local43] + local33[local43]) / 3;
			}
		}
		return local19;
	}
}
