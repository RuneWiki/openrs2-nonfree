import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public final class Class1_Sub1_Sub5_Sub1 extends Class1_Sub1_Sub5 {

	@OriginalMember(owner = "client!ea", name = "L", descriptor = "Ljava/lang/ref/SoftReference;")
	private SoftReference aSoftReference1;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub1_Sub5_Sub1(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method1277() {
		return true;
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method1271() {
		return this.aSoftReference1.get();
	}
}
