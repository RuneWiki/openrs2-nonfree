import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public final class Class2_Sub23 extends Class2 {

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
	public final int anInt3634;

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
	public final int anInt3631;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(II)V")
	public Class2_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3634 = arg0;
		this.anInt3631 = arg1;
	}
}
