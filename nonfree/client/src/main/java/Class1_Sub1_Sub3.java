import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			Static459.method2113(local9, 0, Static434.anInt4326, Static221.anIntArray194[arg0]);
		}
		return local9;
	}
}
