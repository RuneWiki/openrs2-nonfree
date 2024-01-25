import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class2_Sub2_Sub14 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			Static464.method1962(local9, 0, Static217.anInt3574, Static405.anIntArray555[arg0]);
		}
		return local9;
	}
}
