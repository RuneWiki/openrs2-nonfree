import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public final class Class6_Sub25 extends Class6 {

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
	public final int anInt3948;

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
	public final int anInt3947;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(II)V")
	public Class6_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3948 = arg1;
		this.anInt3947 = arg0;
	}
}
