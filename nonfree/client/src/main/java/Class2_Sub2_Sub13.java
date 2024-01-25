import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class2_Sub2_Sub13 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			Static457.method686(local9, 0, Static429.anInt6518, Static318.anIntArray565[arg0]);
		}
		return local9;
	}
}
