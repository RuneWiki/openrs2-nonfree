import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class10_Sub1_Sub5_Sub2 extends Class10_Sub1_Sub5 {

	@OriginalMember(owner = "client!le", name = "F", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!ws;Ljava/lang/Object;I)V")
	public Class10_Sub1_Sub5_Sub2(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3394() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method3395() {
		return true;
	}
}
