import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class6_Sub3_Sub27 extends Class6_Sub3 {

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			Static596.method7718(local9, 0, Static35.anInt670, Static77.anIntArray116[arg0]);
		}
		return local9;
	}
}
