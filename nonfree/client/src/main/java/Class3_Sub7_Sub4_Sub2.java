import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class3_Sub7_Sub4_Sub2 extends Class3_Sub7_Sub4 {

	@OriginalMember(owner = "client!jk", name = "T", descriptor = "Ljava/lang/Object;")
	private final Object anObject2;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub7_Sub4_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject2 = arg0;
	}

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method2648() {
		return this.anObject2;
	}

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method2647() {
		return false;
	}
}
