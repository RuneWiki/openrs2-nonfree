import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public final class Class6_Sub2_Sub2_Sub2 extends Class6_Sub2_Sub2 {

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!mc;Ljava/lang/Object;)V")
	public Class6_Sub2_Sub2_Sub2(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method578() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method577() {
		return true;
	}
}
