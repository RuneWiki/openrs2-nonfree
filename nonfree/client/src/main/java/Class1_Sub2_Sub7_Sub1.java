import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class1_Sub2_Sub7_Sub1 extends Class1_Sub2_Sub7 {

	@OriginalMember(owner = "client!ie", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub2_Sub7_Sub1(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4374() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method4370() {
		return true;
	}
}
