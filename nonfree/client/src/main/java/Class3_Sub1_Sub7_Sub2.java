import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public final class Class3_Sub1_Sub7_Sub2 extends Class3_Sub1_Sub7 {

	@OriginalMember(owner = "client!tb", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!qq;Ljava/lang/Object;I)V")
	public Class3_Sub1_Sub7_Sub2(@OriginalArg(0) Interface20 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7560() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7563() {
		return true;
	}
}
