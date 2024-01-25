import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public final class Class6_Sub2_Sub4_Sub1 extends Class6_Sub2_Sub4 {

	@OriginalMember(owner = "client!ik", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!qa;Ljava/lang/Object;I)V")
	public Class6_Sub2_Sub4_Sub1(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method3933() {
		return true;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3930() {
		return this.aSoftReference2.get();
	}
}
