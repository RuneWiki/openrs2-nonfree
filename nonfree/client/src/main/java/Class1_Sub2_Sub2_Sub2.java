import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public final class Class1_Sub2_Sub2_Sub2 extends Class1_Sub2_Sub2 {

	@OriginalMember(owner = "client!th", name = "L", descriptor = "Ljava/lang/ref/SoftReference;")
	private SoftReference aSoftReference1;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub2_Sub2_Sub2(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!th", name = "j", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3756() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!th", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method3754() {
		return true;
	}
}
