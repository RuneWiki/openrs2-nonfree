import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public final class Class11_Sub4_Sub13_Sub1 extends Class11_Sub4_Sub13 {

	@OriginalMember(owner = "client!rd", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class11_Sub4_Sub13_Sub1(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5302() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5306() {
		return true;
	}
}
