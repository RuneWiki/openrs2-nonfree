import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public final class Class2_Sub3_Sub9_Sub2 extends Class2_Sub3_Sub9 {

	@OriginalMember(owner = "client!lj", name = "x", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub3_Sub9_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4641() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4640() {
		return true;
	}
}
