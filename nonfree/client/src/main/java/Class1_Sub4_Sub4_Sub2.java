import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public final class Class1_Sub4_Sub4_Sub2 extends Class1_Sub4_Sub4 {

	@OriginalMember(owner = "client!fs", name = "u", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub4_Sub4_Sub2(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method1930() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method1929() {
		return true;
	}
}
