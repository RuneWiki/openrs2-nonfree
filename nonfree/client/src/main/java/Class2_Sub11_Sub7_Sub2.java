import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public final class Class2_Sub11_Sub7_Sub2 extends Class2_Sub11_Sub7 {

	@OriginalMember(owner = "client!oh", name = "H", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!mn;Ljava/lang/Object;)V")
	public Class2_Sub11_Sub7_Sub2(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3998() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method3992() {
		return true;
	}
}
