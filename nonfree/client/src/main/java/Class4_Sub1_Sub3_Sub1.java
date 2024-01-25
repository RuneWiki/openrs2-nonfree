import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public final class Class4_Sub1_Sub3_Sub1 extends Class4_Sub1_Sub3 {

	@OriginalMember(owner = "client!eg", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!wa;Ljava/lang/Object;)V")
	public Class4_Sub1_Sub3_Sub1(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method3143() {
		return true;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method3144() {
		return this.aSoftReference1.get();
	}
}
