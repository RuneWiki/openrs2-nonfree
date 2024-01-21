import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class1_Sub1_Sub37 extends Class1_Sub1 {

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		return Static171.anIntArray439;
	}
}
