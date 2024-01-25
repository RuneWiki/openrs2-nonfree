import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public final class Class3_Sub3_Sub1_Sub2 extends Class3_Sub3_Sub1 {

	@OriginalMember(owner = "client!ij", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub3_Sub1_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method3877() {
		return true;
	}

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3880() {
		return this.aSoftReference2.get();
	}
}
