import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public final class Class1_Sub2_Sub2_Sub2 extends Class1_Sub2_Sub2 {

	@OriginalMember(owner = "client!hg", name = "G", descriptor = "Ljava/lang/ref/SoftReference;")
	private SoftReference aSoftReference1;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub2_Sub2_Sub2(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method1808() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method1802() {
		return true;
	}
}
