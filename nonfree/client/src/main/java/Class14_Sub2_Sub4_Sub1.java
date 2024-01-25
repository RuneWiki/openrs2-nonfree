import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public final class Class14_Sub2_Sub4_Sub1 extends Class14_Sub2_Sub4 {

	@OriginalMember(owner = "client!cga", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Lclient!uha;Ljava/lang/Object;I)V")
	public Class14_Sub2_Sub4_Sub1(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method7557() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!cga", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7554() {
		return true;
	}
}
