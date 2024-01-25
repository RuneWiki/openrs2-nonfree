import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class2_Sub2_Sub37 extends Class2_Sub2 {

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub37() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			@Pc(29) int[][] local29 = this.method6276(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			for (@Pc(43) int local43 = 0; local43 < Static398.anInt6955; local43++) {
				local11[local43] = (local37[local43] + local33[local43] + local41[local43]) / 3;
			}
		}
		return local11;
	}
}
