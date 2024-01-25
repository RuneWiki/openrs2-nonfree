import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class3_Sub2_Sub7 extends Class3_Sub2 {

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		return Static352.anIntArray400;
	}
}
