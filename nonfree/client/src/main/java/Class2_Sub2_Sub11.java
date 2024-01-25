import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class2_Sub2_Sub11 extends Class2_Sub2 {

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			Static472.method5023(local9, 0, Static398.anInt6955, Static168.anIntArray524[arg0]);
		}
		return local9;
	}
}
