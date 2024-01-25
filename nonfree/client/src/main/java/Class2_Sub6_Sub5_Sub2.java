import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public final class Class2_Sub6_Sub5_Sub2 extends Class2_Sub6_Sub5 {

	@OriginalMember(owner = "client!sia", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lclient!tm;Ljava/lang/Object;I)V")
	public Class2_Sub6_Sub5_Sub2(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8119() {
		return true;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method8120() {
		return this.aSoftReference2.get();
	}
}
