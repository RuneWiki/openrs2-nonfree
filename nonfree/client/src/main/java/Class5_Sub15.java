import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public final class Class5_Sub15 extends Class5 {

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
	public final int anInt1657;

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
	public final int anInt1654;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(II)V")
	public Class5_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1657 = arg0;
		this.anInt1654 = arg1;
	}
}
