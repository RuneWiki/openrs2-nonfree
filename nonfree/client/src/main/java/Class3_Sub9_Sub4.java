import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public final class Class3_Sub9_Sub4 extends Class3_Sub9 {

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		return Static239.anIntArray394;
	}
}
