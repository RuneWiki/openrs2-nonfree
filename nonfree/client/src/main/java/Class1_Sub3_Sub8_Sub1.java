import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public final class Class1_Sub3_Sub8_Sub1 extends Class1_Sub3_Sub8 {

	@OriginalMember(owner = "client!mb", name = "T", descriptor = "Ljava/lang/ref/SoftReference;")
	private SoftReference aSoftReference1;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub3_Sub8_Sub1(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method3401() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method3395() {
		return true;
	}
}
