import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public final class Class5_Sub3_Sub6_Sub1 extends Class5_Sub3_Sub6 {

	@OriginalMember(owner = "client!st", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lclient!ofa;Ljava/lang/Object;I)V")
	public Class5_Sub3_Sub6_Sub1(@OriginalArg(0) Interface20 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!st", name = "e", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method8111() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8109() {
		return true;
	}
}
