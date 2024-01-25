import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public final class Class1_Sub2_Sub6_Sub2 extends Class1_Sub2_Sub6 {

	@OriginalMember(owner = "client!lh", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!kb;Ljava/lang/Object;)V")
	public Class1_Sub2_Sub6_Sub2(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method2973() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method2976() {
		return true;
	}
}
