import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class2_Sub4_Sub35 extends Class2_Sub4 {

	static {
		new Class312("", 73);
	}

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub35() {
		super(1, true);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			@Pc(31) int[][] local31 = this.method8898(0, arg0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			for (@Pc(45) int local45 = 0; local45 < Static395.anInt6816; local45++) {
				local19[local45] = (local35[local45] + local39[local45] + local43[local45]) / 3;
			}
		}
		return local19;
	}
}
