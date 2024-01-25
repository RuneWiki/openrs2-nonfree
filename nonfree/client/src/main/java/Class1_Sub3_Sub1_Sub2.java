import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public final class Class1_Sub3_Sub1_Sub2 extends Class1_Sub3_Sub1 {

	@OriginalMember(owner = "client!qm", name = "J", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!vs;Ljava/lang/Object;I)V")
	public Class1_Sub3_Sub1_Sub2(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method4230() {
		return true;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4229() {
		return this.aSoftReference2.get();
	}
}
