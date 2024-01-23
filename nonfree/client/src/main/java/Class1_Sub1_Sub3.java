import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(20) int[] local20 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			Static317.method1052(local20, 0, Static6.anInt4960, Static10.anIntArray604[arg0]);
		}
		return local20;
	}
}
