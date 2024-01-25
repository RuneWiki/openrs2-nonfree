import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
	public int anInt687;

	@OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
	public final int anInt683;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(II)V")
	public Class2_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt687 = arg1;
		this.anInt683 = arg0;
	}
}
