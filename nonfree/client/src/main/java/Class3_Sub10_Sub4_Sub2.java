import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public final class Class3_Sub10_Sub4_Sub2 extends Class3_Sub10_Sub4 {

	@OriginalMember(owner = "client!se", name = "u", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!uk;Ljava/lang/Object;I)V")
	public Class3_Sub10_Sub4_Sub2(@OriginalArg(0) Interface18 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!se", name = "g", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method6668() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6666() {
		return true;
	}
}
