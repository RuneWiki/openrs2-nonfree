import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public final class Class2_Sub9_Sub3_Sub1 extends Class2_Sub9_Sub3 {

	@OriginalMember(owner = "client!fa", name = "V", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lclient!ur;Ljava/lang/Object;I)V")
	public Class2_Sub9_Sub3_Sub1(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method2499() {
		return true;
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method2500() {
		return this.aSoftReference1.get();
	}
}
