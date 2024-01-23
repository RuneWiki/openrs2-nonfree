import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public final class Class1_Sub2_Sub3_Sub2 extends Class1_Sub2_Sub3 {

	@OriginalMember(owner = "client!ko", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
	private SoftReference aSoftReference1;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub2_Sub3_Sub2(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method2576() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method2573() {
		return true;
	}
}
