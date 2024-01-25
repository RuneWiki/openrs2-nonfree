import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public final class Class4_Sub1_Sub9_Sub1 extends Class4_Sub1_Sub9 {

	@OriginalMember(owner = "client!fv", name = "G", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!bq;Ljava/lang/Object;I)V")
	public Class4_Sub1_Sub9_Sub1(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method2571() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method2567() {
		return true;
	}
}
