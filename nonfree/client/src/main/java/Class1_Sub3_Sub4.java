import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public final class Class1_Sub3_Sub4 extends Class1_Sub3 {

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		return Static209.anIntArray377;
	}
}
