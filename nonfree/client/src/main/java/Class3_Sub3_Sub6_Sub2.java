import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public final class Class3_Sub3_Sub6_Sub2 extends Class3_Sub3_Sub6 {

	@OriginalMember(owner = "client!qm", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub3_Sub6_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method4739() {
		return true;
	}

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4737() {
		return this.aSoftReference2.get();
	}
}
