import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public final class Class8_Sub1_Sub16_Sub2 extends Class8_Sub1_Sub16 {

	@OriginalMember(owner = "client!vh", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private SoftReference aSoftReference1;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class8_Sub1_Sub16_Sub2(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method4170() {
		return true;
	}

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4171() {
		return this.aSoftReference1.get();
	}
}
