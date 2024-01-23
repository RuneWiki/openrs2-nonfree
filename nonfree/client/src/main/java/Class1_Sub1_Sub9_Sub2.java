import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public final class Class1_Sub1_Sub9_Sub2 extends Class1_Sub1_Sub9 {

	@OriginalMember(owner = "client!ne", name = "H", descriptor = "Ljava/lang/ref/SoftReference;")
	private SoftReference aSoftReference1;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub1_Sub9_Sub2(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method2983() {
		return true;
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method2981() {
		return this.aSoftReference1.get();
	}
}
