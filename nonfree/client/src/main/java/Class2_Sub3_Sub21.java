import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class2_Sub3_Sub21 extends Class2_Sub3 {

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub21() {
		super(1, true);
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			@Pc(31) int[][] local31 = this.method9147(arg0, 0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			for (@Pc(45) int local45 = 0; local45 < Static222.anInt4971; local45++) {
				local13[local45] = (local35[local45] + local39[local45] + local43[local45]) / 3;
			}
		}
		return local13;
	}
}
