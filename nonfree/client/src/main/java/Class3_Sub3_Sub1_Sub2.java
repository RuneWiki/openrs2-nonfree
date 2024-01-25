import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public final class Class3_Sub3_Sub1_Sub2 extends Class3_Sub3_Sub1 {

	@OriginalMember(owner = "client!po", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!s;Ljava/lang/Object;I)V")
	public Class3_Sub3_Sub1_Sub2(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method4558() {
		return true;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method4560() {
		return this.aSoftReference2.get();
	}
}
