import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class7_Sub1_Sub3_Sub1 extends Class7_Sub1_Sub3 {

	@OriginalMember(owner = "client!bb", name = "I", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class7_Sub1_Sub3_Sub1(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method1191() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method1189() {
		return true;
	}
}
