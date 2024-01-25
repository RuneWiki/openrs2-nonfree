import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public final class Class5_Sub2_Sub10_Sub2 extends Class5_Sub2_Sub10 {

	@OriginalMember(owner = "client!sf", name = "L", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!bg;Ljava/lang/Object;I)V")
	public Class5_Sub2_Sub10_Sub2(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method4847() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method4853() {
		return true;
	}
}
