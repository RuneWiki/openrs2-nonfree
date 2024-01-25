import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public final class Class4_Sub4_Sub24 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		return Static80.anIntArray212;
	}
}
