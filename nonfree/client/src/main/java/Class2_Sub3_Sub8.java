import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class2_Sub3_Sub8 extends Class2_Sub3 {

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub8() {
		super(1, true);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(21) int[] local21 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			@Pc(31) int[][] local31 = this.method5707(arg0, 0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			for (@Pc(45) int local45 = 0; local45 < Static263.anInt5504; local45++) {
				local21[local45] = (local43[local45] + local39[local45] + local35[local45]) / 3;
			}
		}
		return local21;
	}
}
