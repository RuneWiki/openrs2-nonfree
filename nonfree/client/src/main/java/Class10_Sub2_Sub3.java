import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public final class Class10_Sub2_Sub3 extends Class10_Sub2 {

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		return Static182.anIntArray374;
	}
}
