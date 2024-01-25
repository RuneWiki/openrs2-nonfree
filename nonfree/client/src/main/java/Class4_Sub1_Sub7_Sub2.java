import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public final class Class4_Sub1_Sub7_Sub2 extends Class4_Sub1_Sub7 {

	@OriginalMember(owner = "client!vg", name = "A", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class4_Sub1_Sub7_Sub2(@OriginalArg(0) Object arg0) {
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5510() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5508() {
		return true;
	}
}
