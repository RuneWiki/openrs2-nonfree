import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class1_Sub2_Sub23 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			Static221.method34(local16, 0, Static105.anInt2391, Static128.anIntArray362[arg0]);
		}
		return local16;
	}
}
