import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public final class Class4_Sub2_Sub10 extends Class4_Sub2 {

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		return Static312.anIntArray370;
	}
}
