import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public final class Class2_Sub2_Sub10_Sub1 extends Class2_Sub2_Sub10 {

	@OriginalMember(owner = "client!ku", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!pe;Ljava/lang/Object;I)V")
	public Class2_Sub2_Sub10_Sub1(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!ku", name = "h", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7668() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7664() {
		return true;
	}
}
