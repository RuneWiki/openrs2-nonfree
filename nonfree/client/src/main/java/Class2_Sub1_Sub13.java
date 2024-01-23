import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class2_Sub1_Sub13 extends Class2_Sub1 {

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		return Static20.anIntArray45;
	}
}
