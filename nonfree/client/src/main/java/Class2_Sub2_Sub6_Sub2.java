import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public final class Class2_Sub2_Sub6_Sub2 extends Class2_Sub2_Sub6 {

	@OriginalMember(owner = "client!raa", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(Lclient!wf;Ljava/lang/Object;I)V")
	public Class2_Sub2_Sub6_Sub2(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!raa", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method6485() {
		return true;
	}

	@OriginalMember(owner = "client!raa", name = "h", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method6488() {
		return this.aSoftReference2.get();
	}
}
