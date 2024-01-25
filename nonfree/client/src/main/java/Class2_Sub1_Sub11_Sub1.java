import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public final class Class2_Sub1_Sub11_Sub1 extends Class2_Sub1_Sub11 {

	@OriginalMember(owner = "client!mm", name = "w", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!dd;Ljava/lang/Object;I)V")
	public Class2_Sub1_Sub11_Sub1(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4480() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method4481() {
		return true;
	}
}
