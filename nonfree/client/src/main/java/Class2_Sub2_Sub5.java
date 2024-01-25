import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public final class Class2_Sub2_Sub5 extends Class2_Sub2 {

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		return Static145.anIntArray199;
	}
}
