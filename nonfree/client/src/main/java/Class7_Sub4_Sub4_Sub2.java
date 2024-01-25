import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public final class Class7_Sub4_Sub4_Sub2 extends Class7_Sub4_Sub4 {

	@OriginalMember(owner = "client!iu", name = "s", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lclient!rb;Ljava/lang/Object;I)V")
	public Class7_Sub4_Sub4_Sub2(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method2644() {
		return true;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method2643() {
		return this.aSoftReference2.get();
	}
}
