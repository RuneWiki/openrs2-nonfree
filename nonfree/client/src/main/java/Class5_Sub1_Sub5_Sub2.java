import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public final class Class5_Sub1_Sub5_Sub2 extends Class5_Sub1_Sub5 {

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class5_Sub1_Sub5_Sub2(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3819() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method3820() {
		return true;
	}
}
