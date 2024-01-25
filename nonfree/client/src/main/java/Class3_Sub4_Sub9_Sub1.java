import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public final class Class3_Sub4_Sub9_Sub1 extends Class3_Sub4_Sub9 {

	@OriginalMember(owner = "client!eq", name = "N", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lclient!gj;Ljava/lang/Object;I)V")
	public Class3_Sub4_Sub9_Sub1(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method3821() {
		return true;
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3818() {
		return this.aSoftReference1.get();
	}
}
