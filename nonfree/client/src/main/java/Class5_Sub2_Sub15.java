import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class5_Sub2_Sub15 extends Class5_Sub2 {

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			Static686.method4970(local14, 0, Static195.anInt3759, Static369.anIntArray377[arg0]);
		}
		return local14;
	}
}
