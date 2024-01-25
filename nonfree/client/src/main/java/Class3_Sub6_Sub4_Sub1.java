import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public final class Class3_Sub6_Sub4_Sub1 extends Class3_Sub6_Sub4 {

	@OriginalMember(owner = "client!cf", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!wf;Ljava/lang/Object;I)V")
	public Class3_Sub6_Sub4_Sub1(@OriginalArg(0) Interface25 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6816() {
		return true;
	}

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method6818() {
		return this.aSoftReference1.get();
	}
}
