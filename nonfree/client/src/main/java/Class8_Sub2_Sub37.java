import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class8_Sub2_Sub37 extends Class8_Sub2 {

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			Static649.method5534(local9, 0, Static538.anInt9297, Static426.anIntArray424[arg0]);
		}
		return local9;
	}
}
