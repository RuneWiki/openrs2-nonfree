import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public abstract class Class6_Sub4_Sub7 extends Class6_Sub4 {

	@OriginalMember(owner = "client!io", name = "x", descriptor = "I")
	public final int anInt5390;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(I)V")
	protected Class6_Sub4_Sub7(@OriginalArg(0) int arg0) {
		this.anInt5390 = arg0;
	}

	@OriginalMember(owner = "client!io", name = "g", descriptor = "(I)Z")
	public abstract boolean method4574();

	@OriginalMember(owner = "client!io", name = "h", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4575();
}
