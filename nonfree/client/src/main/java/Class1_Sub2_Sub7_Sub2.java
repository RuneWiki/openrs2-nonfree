import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class Class1_Sub2_Sub7_Sub2 extends Class1_Sub2_Sub7 {

	@OriginalMember(owner = "client!qd", name = "R", descriptor = "Ljava/lang/ref/SoftReference;")
	private SoftReference aSoftReference1;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub2_Sub7_Sub2(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method2777() {
		return true;
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method2774() {
		return this.aSoftReference1.get();
	}
}
