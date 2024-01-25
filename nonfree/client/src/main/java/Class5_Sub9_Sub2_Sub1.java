import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public final class Class5_Sub9_Sub2_Sub1 extends Class5_Sub9_Sub2 {

	@OriginalMember(owner = "client!dq", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lclient!gl;Ljava/lang/Object;)V")
	public Class5_Sub9_Sub2_Sub1(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method1807() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method1809() {
		return true;
	}
}
