import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public final class Class6_Sub2_Sub14_Sub1 extends Class6_Sub2_Sub14 {

	@OriginalMember(owner = "client!nm", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class6_Sub2_Sub14_Sub1(@OriginalArg(0) Object arg0) {
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3870() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method3875() {
		return true;
	}
}
