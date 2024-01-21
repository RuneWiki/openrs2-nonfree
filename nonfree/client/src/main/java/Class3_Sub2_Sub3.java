import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class3_Sub2_Sub3 extends Class3_Sub2 {

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			Static218.method2015(local17, 0, Static190.anInt3865, Static34.anIntArray37[arg0]);
		}
		return local17;
	}
}
