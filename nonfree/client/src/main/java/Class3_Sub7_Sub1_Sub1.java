import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public final class Class3_Sub7_Sub1_Sub1 extends Class3_Sub7_Sub1 {

	@OriginalMember(owner = "client!bk", name = "G", descriptor = "Ljava/lang/Object;")
	private final Object anObject3;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class3_Sub7_Sub1_Sub1(@OriginalArg(0) Object arg0) {
		this.anObject3 = arg0;
	}

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method4909() {
		return false;
	}

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method4905() {
		return this.anObject3;
	}
}
