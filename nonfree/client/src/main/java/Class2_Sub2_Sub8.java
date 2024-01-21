import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class2_Sub2_Sub8 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			Static203.method2768(local14, 0, Static106.anInt3045, Static160.anIntArray187[arg0]);
		}
		return local14;
	}
}
