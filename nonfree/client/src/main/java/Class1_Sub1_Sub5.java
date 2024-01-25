import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		return Static273.anIntArray414;
	}
}
