import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public final class Class4_Sub2_Sub8_Sub2 extends Class4_Sub2_Sub8 {

	@OriginalMember(owner = "client!ri", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class4_Sub2_Sub8_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4595() {
		return true;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4596() {
		return this.aSoftReference1.get();
	}
}
