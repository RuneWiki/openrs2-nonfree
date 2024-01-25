import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public final class Class2_Sub7_Sub15_Sub2 extends Class2_Sub7_Sub15 {

	@OriginalMember(owner = "client!tfa", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub7_Sub15_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!tfa", name = "e", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method7544() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7543() {
		return true;
	}
}
