import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class3_Sub11_Sub7_Sub2 extends Class3_Sub11_Sub7 {

	@OriginalMember(owner = "client!jk", name = "F", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub11_Sub7_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method4483() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method4486() {
		return true;
	}
}
