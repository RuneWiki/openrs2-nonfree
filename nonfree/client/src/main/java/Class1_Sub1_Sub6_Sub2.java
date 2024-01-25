import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public final class Class1_Sub1_Sub6_Sub2 extends Class1_Sub1_Sub6 {

	@OriginalMember(owner = "client!kn", name = "A", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub1_Sub6_Sub2(@OriginalArg(0) Object arg0) {
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3235() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method3232() {
		return true;
	}
}
