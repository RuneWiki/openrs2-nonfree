import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public final class Class3_Sub7_Sub1_Sub2 extends Class3_Sub7_Sub1 {

	@OriginalMember(owner = "client!si", name = "A", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class3_Sub7_Sub1_Sub2(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!si", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method4909() {
		return true;
	}

	@OriginalMember(owner = "client!si", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method4905() {
		return this.aSoftReference1.get();
	}
}
