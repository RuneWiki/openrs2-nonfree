import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public abstract class Class5_Sub9_Sub2 extends Class5_Sub9 {

	@OriginalMember(owner = "client!ea", name = "z", descriptor = "Lclient!gl;")
	public final Interface3 anInterface3_3;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!gl;)V")
	protected Class5_Sub9_Sub2(@OriginalArg(0) Interface3 arg0) {
		this.anInterface3_3 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method1807();

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)Z")
	public abstract boolean method1809();
}
