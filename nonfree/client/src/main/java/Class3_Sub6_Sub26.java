import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class3_Sub6_Sub26 extends Class3_Sub6 {

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			Static601.method2820(local9, 0, Static521.anInt8383, Static525.anIntArray553[arg0]);
		}
		return local9;
	}
}
