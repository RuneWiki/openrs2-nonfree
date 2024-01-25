import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public final class Class3_Sub7_Sub16_Sub1 extends Class3_Sub7_Sub16 {

	@OriginalMember(owner = "client!nv", name = "v", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lclient!qaa;Ljava/lang/Object;I)V")
	public Class3_Sub7_Sub16_Sub1(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6645() {
		return true;
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method6647() {
		return this.aSoftReference2.get();
	}
}
