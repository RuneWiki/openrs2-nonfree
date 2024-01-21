import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public final class Class6_Sub16 extends Class6 {

	@OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
	public final int anInt2726;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(I)V")
	public Class6_Sub16(@OriginalArg(0) int arg0) {
		this.anInt2726 = arg0;
	}
}
