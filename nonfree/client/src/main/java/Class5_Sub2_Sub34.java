import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class5_Sub2_Sub34 extends Class5_Sub2 {

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			Static359.method754(local9, 0, Static15.anInt493, Static287.anIntArray413[arg0]);
		}
		return local9;
	}
}
