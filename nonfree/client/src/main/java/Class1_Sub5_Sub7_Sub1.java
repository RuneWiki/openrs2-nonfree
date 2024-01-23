import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public final class Class1_Sub5_Sub7_Sub1 extends Class1_Sub5_Sub7 {

	@OriginalMember(owner = "client!in", name = "L", descriptor = "Ljava/lang/ref/SoftReference;")
	private SoftReference aSoftReference1;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub5_Sub7_Sub1(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!in", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3312() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!in", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method3318() {
		return true;
	}
}
