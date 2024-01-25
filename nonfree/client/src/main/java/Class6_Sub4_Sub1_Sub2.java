import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nja")
public final class Class6_Sub4_Sub1_Sub2 extends Class6_Sub4_Sub1 {

	@OriginalMember(owner = "client!nja", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!nja", name = "<init>", descriptor = "(Lclient!wt;Ljava/lang/Object;I)V")
	public Class6_Sub4_Sub1_Sub2(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5716() {
		return true;
	}

	@OriginalMember(owner = "client!nja", name = "b", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5714() {
		return this.aSoftReference2.get();
	}
}
