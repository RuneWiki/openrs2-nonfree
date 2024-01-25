import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public final class Class1_Sub2_Sub9_Sub2 extends Class1_Sub2_Sub9 {

	@OriginalMember(owner = "client!pn", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!cg;Ljava/lang/Object;I)V")
	public Class1_Sub2_Sub9_Sub2(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method4433() {
		return true;
	}

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4434() {
		return this.aSoftReference1.get();
	}
}
