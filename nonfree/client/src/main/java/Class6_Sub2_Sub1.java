import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public abstract class Class6_Sub2_Sub1 extends Class6_Sub2 {

	@OriginalMember(owner = "client!aea", name = "t", descriptor = "I")
	public final int anInt4017;

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(I)V")
	protected Class6_Sub2_Sub1(@OriginalArg(0) int arg0) {
		this.anInt4017 = arg0;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method3516();

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "(I)Z")
	public abstract boolean method3518();
}
