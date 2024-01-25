import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public final class Class2_Sub1_Sub4_Sub2 extends Class2_Sub1_Sub4 {

	@OriginalMember(owner = "client!ff", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!ig;Ljava/lang/Object;I)V")
	public Class2_Sub1_Sub4_Sub2(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method1618() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method1616() {
		return true;
	}
}
