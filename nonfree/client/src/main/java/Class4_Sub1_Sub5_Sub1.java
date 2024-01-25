import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public final class Class4_Sub1_Sub5_Sub1 extends Class4_Sub1_Sub5 {

	@OriginalMember(owner = "client!jd", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lclient!dt;Ljava/lang/Object;I)V")
	public Class4_Sub1_Sub5_Sub1(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5864() {
		return true;
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5865() {
		return this.aSoftReference1.get();
	}
}
