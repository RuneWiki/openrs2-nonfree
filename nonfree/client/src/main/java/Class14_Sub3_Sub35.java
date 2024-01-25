import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class14_Sub3_Sub35 extends Class14_Sub3 {

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			Static358.method768(local9, 0, Static294.anInt5657, Static213.anIntArray381[arg0]);
		}
		return local9;
	}
}
