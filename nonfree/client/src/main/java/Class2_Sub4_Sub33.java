import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public final class Class2_Sub4_Sub33 extends Class2_Sub4 {

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		return Static20.anIntArray40;
	}
}
