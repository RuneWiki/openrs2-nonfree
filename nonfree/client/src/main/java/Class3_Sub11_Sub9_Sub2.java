import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public final class Class3_Sub11_Sub9_Sub2 extends Class3_Sub11_Sub9 {

	@OriginalMember(owner = "client!ia", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!pj;Ljava/lang/Object;I)V")
	public Class3_Sub11_Sub9_Sub2(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4007() {
		return true;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method4006() {
		return this.aSoftReference1.get();
	}
}
