import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public final class Class2_Sub1_Sub3_Sub2 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!mea", name = "J", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lclient!qj;Ljava/lang/Object;I)V")
	public Class2_Sub1_Sub3_Sub2(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!mea", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method6239() {
		return true;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method6236() {
		return this.aSoftReference1.get();
	}
}
