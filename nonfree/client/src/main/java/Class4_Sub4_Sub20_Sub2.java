import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public final class Class4_Sub4_Sub20_Sub2 extends Class4_Sub4_Sub20 {

	@OriginalMember(owner = "client!wp", name = "L", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class4_Sub4_Sub20_Sub2(@OriginalArg(0) Object arg0) {
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5679() {
		return true;
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5681() {
		return this.aSoftReference2.get();
	}
}
