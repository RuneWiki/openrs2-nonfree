import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public final class Class2_Sub10_Sub4_Sub2 extends Class2_Sub10_Sub4 {

	@OriginalMember(owner = "client!kt", name = "L", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!ts;Ljava/lang/Object;I)V")
	public Class2_Sub10_Sub4_Sub2(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3219() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method3222() {
		return true;
	}
}
