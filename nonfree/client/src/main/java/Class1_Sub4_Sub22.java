import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class1_Sub4_Sub22 extends Class1_Sub4 {

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			@Pc(31) int[][] local31 = this.method3217(0, arg0);
			@Pc(35) int[] local35 = local31[1];
			@Pc(39) int[] local39 = local31[2];
			@Pc(43) int[] local43 = local31[0];
			for (@Pc(45) int local45 = 0; local45 < Static73.anInt1888; local45++) {
				local11[local45] = (local43[local45] + local35[local45] + local39[local45]) / 3;
			}
		}
		return local11;
	}
}
