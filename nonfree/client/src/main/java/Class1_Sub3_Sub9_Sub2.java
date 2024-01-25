import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class1_Sub3_Sub9_Sub2 extends Class1_Sub3_Sub9 {

	@OriginalMember(owner = "client!le", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!dc;Ljava/lang/Object;I)V")
	public Class1_Sub3_Sub9_Sub2(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4597() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method4596() {
		return true;
	}
}
