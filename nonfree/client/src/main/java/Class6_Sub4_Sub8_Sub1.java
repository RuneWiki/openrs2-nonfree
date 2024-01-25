import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public final class Class6_Sub4_Sub8_Sub1 extends Class6_Sub4_Sub8 {

	@OriginalMember(owner = "client!jv", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!lo;Ljava/lang/Object;I)V")
	public Class6_Sub4_Sub8_Sub1(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4615() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4614() {
		return true;
	}
}
