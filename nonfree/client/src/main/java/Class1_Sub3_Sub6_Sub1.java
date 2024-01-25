import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public final class Class1_Sub3_Sub6_Sub1 extends Class1_Sub3_Sub6 {

	@OriginalMember(owner = "client!er", name = "A", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!go;Ljava/lang/Object;I)V")
	public Class1_Sub3_Sub6_Sub1(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method3329() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3327() {
		return true;
	}
}
