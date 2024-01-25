import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public final class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
	public final int anInt250;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
	public final int anInt252;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(II)V")
	public Class6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt250 = arg1;
		this.anInt252 = arg0;
	}
}
