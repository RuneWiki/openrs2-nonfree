import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public final class Class14_Sub2_Sub9_Sub1 extends Class14_Sub2_Sub9 {

	@OriginalMember(owner = "client!on", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class14_Sub2_Sub9_Sub1(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!on", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4168() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!on", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method4169() {
		return true;
	}
}
