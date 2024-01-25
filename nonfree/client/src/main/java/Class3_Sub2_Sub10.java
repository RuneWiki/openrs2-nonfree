import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class3_Sub2_Sub10 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub10() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			@Pc(33) int[][] local33 = this.method8595(arg0, 0);
			@Pc(37) int[] local37 = local33[0];
			@Pc(41) int[] local41 = local33[1];
			@Pc(45) int[] local45 = local33[2];
			for (@Pc(47) int local47 = 0; local47 < Static491.anInt8519; local47++) {
				local11[local47] = (local45[local47] + local37[local47] + local41[local47]) / 3;
			}
		}
		return local11;
	}
}
