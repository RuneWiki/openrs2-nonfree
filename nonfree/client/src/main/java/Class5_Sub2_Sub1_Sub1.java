import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public final class Class5_Sub2_Sub1_Sub1 extends Class5_Sub2_Sub1 {

	@OriginalMember(owner = "client!aca", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Lclient!pha;Ljava/lang/Object;I)V")
	public Class5_Sub2_Sub1_Sub1(@OriginalArg(0) Interface20 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!aca", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7594() {
		return true;
	}

	@OriginalMember(owner = "client!aca", name = "g", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7595() {
		return this.aSoftReference1.get();
	}
}
