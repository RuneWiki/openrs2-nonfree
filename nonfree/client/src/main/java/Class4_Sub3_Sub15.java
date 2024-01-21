import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class4_Sub3_Sub15 extends Class4_Sub3 {

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			@Pc(29) int[][] local29 = this.method3150(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[2];
			@Pc(41) int[] local41 = local29[1];
			for (@Pc(43) int local43 = 0; local43 < Static134.anInt3188; local43++) {
				local11[local43] = (local33[local43] + local41[local43] + local37[local43]) / 3;
			}
		}
		return local11;
	}
}
