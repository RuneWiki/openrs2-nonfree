import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public final class Class2_Sub13_Sub3_Sub2 extends Class2_Sub13_Sub3 {

	@OriginalMember(owner = "client!ir", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!ws;Ljava/lang/Object;I)V")
	public Class2_Sub13_Sub3_Sub2(@OriginalArg(0) Interface20 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method3362() {
		return true;
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method3363() {
		return this.aSoftReference1.get();
	}
}
