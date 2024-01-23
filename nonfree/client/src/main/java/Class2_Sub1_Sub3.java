import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(5) int[] local5 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			Static225.method1840(local5, 0, Static62.anInt1675, Static97.anIntArray240[arg0]);
		}
		return local5;
	}
}
