import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public final class Class1_Sub1_Sub30 extends Class1_Sub1 {

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		return Static73.anIntArray105;
	}
}
