import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public final class Class2_Sub3_Sub20_Sub1 extends Class2_Sub3_Sub20 {

	@OriginalMember(owner = "client!qc", name = "I", descriptor = "Ljava/lang/ref/SoftReference;")
	private SoftReference aSoftReference1;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class2_Sub3_Sub20_Sub1(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method4413() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method4414() {
		return true;
	}
}
