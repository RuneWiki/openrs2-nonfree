import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public final class Class3_Sub7_Sub3_Sub2 extends Class3_Sub7_Sub3 {

	@OriginalMember(owner = "client!lq", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!wt;Ljava/lang/Object;I)V")
	public Class3_Sub7_Sub3_Sub2(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method3208() {
		return true;
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method3205() {
		return this.aSoftReference2.get();
	}
}
