import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public final class Class4_Sub5_Sub5_Sub2 extends Class4_Sub5_Sub5 {

	@OriginalMember(owner = "client!gh", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class4_Sub5_Sub5_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method3027() {
		return true;
	}

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3029() {
		return this.aSoftReference1.get();
	}
}
