import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public final class Class1_Sub2_Sub3_Sub1 extends Class1_Sub2_Sub3 {

	@OriginalMember(owner = "client!ck", name = "P", descriptor = "Ljava/lang/ref/SoftReference;")
	private SoftReference aSoftReference1;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub2_Sub3_Sub1(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method4237() {
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method4241() {
		return this.aSoftReference1.get();
	}
}
