import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class Class1_Sub8_Sub6 extends Class1_Sub8 {

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		return Static198.anIntArray749;
	}
}
