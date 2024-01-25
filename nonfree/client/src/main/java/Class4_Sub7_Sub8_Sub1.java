import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public final class Class4_Sub7_Sub8_Sub1 extends Class4_Sub7_Sub8 {

	@OriginalMember(owner = "client!il", name = "x", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!hg;Ljava/lang/Object;I)V")
	public Class4_Sub7_Sub8_Sub1(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3887() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3886() {
		return true;
	}
}
