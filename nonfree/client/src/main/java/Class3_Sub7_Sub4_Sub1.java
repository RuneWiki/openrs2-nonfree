import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public final class Class3_Sub7_Sub4_Sub1 extends Class3_Sub7_Sub4 {

	@OriginalMember(owner = "client!eq", name = "M", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub7_Sub4_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method2648() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method2647() {
		return true;
	}
}
