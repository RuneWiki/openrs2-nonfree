import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public final class Class6_Sub11 extends Class6 {

	@OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
	public final int anInt1594;

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
	public final int anInt1593;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(II)V")
	public Class6_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1594 = arg0;
		this.anInt1593 = arg1;
	}
}
