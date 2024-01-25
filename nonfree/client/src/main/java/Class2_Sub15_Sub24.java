import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public final class Class2_Sub15_Sub24 extends Class2_Sub15 {

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		return Static537.anIntArray480;
	}
}
