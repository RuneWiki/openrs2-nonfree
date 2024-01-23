import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public final class Class1_Sub2_Sub13_Sub2 extends Class1_Sub2_Sub13 {

	@OriginalMember(owner = "client!tb", name = "V", descriptor = "Ljava/lang/ref/SoftReference;")
	private SoftReference aSoftReference1;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub2_Sub13_Sub2(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method3207() {
		return true;
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method3208() {
		return this.aSoftReference1.get();
	}
}
