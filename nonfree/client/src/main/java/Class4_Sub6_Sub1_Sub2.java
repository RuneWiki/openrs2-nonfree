import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public final class Class4_Sub6_Sub1_Sub2 extends Class4_Sub6_Sub1 {

	@OriginalMember(owner = "client!saa", name = "J", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lclient!er;Ljava/lang/Object;I)V")
	public Class4_Sub6_Sub1_Sub2(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6872() {
		return true;
	}

	@OriginalMember(owner = "client!saa", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method6875() {
		return this.aSoftReference2.get();
	}
}
