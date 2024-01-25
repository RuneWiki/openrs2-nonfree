import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class2_Sub1_Sub33 extends Class2_Sub1 {

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			Static459.method3349(local9, 0, Static131.anInt2581, Static373.anIntArray55[arg0]);
		}
		return local9;
	}
}
