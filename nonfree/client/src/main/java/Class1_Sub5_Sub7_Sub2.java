import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class1_Sub5_Sub7_Sub2 extends Class1_Sub5_Sub7 {

	@OriginalMember(owner = "client!ob", name = "P", descriptor = "Ljava/lang/Object;")
	private Object anObject4;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub5_Sub7_Sub2(@OriginalArg(0) Object arg0) {
		this.anObject4 = arg0;
	}

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3312() {
		return this.anObject4;
	}

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method3318() {
		return false;
	}
}
