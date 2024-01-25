import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public final class Class1_Sub4_Sub14_Sub2 extends Class1_Sub4_Sub14 {

	@OriginalMember(owner = "client!rk", name = "H", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub4_Sub14_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method4960() {
		return true;
	}

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method4959() {
		return this.aSoftReference2.get();
	}
}
