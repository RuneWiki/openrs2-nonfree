import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public final class Class1_Sub5_Sub7 extends Class1_Sub5 {

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		return Static49.anIntArray492;
	}
}
