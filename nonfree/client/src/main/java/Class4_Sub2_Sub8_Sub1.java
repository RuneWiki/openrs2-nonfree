import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public final class Class4_Sub2_Sub8_Sub1 extends Class4_Sub2_Sub8 {

	@OriginalMember(owner = "client!gd", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
	private SoftReference aSoftReference1;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class4_Sub2_Sub8_Sub1(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method1915() {
		return true;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method1916() {
		return this.aSoftReference1.get();
	}
}
