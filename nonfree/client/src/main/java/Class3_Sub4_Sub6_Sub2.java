import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class3_Sub4_Sub6_Sub2 extends Class3_Sub4_Sub6 {

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!ue;Ljava/lang/Object;I)V")
	public Class3_Sub4_Sub6_Sub2(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5832() {
		return true;
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5833() {
		return this.aSoftReference2.get();
	}
}
