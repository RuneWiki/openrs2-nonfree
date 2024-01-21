import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class1_Sub1_Sub35 extends Class1_Sub1 {

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			Static217.method2360(local14, 0, Static176.anInt3921, Static22.anIntArray68[arg0]);
		}
		return local14;
	}
}
