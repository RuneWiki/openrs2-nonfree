import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public final class Class2_Sub1_Sub21 extends Class2_Sub1 {

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		return Static252.anIntArray323;
	}
}
