import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public final class Class3_Sub1_Sub4 extends Class3_Sub1 {

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		return Static241.anIntArray759;
	}
}
