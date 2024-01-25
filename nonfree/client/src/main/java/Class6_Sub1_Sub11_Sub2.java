import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public final class Class6_Sub1_Sub11_Sub2 extends Class6_Sub1_Sub11 {

	@OriginalMember(owner = "client!vj", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!ah;Ljava/lang/Object;I)V")
	public Class6_Sub1_Sub11_Sub2(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5719() {
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5718() {
		return this.aSoftReference2.get();
	}
}
