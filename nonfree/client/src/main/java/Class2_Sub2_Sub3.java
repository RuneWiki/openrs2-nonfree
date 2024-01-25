import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class2_Sub2_Sub3 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			Static598.method1134(local17, 0, Static153.anInt3070, Static211.anIntArray576[arg0]);
		}
		return local17;
	}
}
