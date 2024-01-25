import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public final class Class6_Sub2_Sub9_Sub1 extends Class6_Sub2_Sub9 {

	@OriginalMember(owner = "client!hn", name = "x", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lclient!sea;Ljava/lang/Object;I)V")
	public Class6_Sub2_Sub9_Sub1(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method4705() {
		return true;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method4703() {
		return this.aSoftReference2.get();
	}
}
