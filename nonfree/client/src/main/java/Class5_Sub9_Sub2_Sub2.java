import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public final class Class5_Sub9_Sub2_Sub2 extends Class5_Sub9_Sub2 {

	@OriginalMember(owner = "client!fd", name = "E", descriptor = "Ljava/lang/Object;")
	private final Object anObject5;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!gl;Ljava/lang/Object;)V")
	public Class5_Sub9_Sub2_Sub2(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.anObject5 = arg1;
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method1809() {
		return false;
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method1807() {
		return this.anObject5;
	}
}
