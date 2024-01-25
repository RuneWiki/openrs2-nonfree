import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class4_Sub2_Sub20 extends Class4_Sub2 {

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			Static685.method6467(local9, 0, Static269.anInt4330, Static429.anIntArray465[arg0]);
		}
		return local9;
	}
}
