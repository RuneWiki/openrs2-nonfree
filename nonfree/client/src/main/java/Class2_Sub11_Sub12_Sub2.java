import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public final class Class2_Sub11_Sub12_Sub2 extends Class2_Sub11_Sub12 {

	@OriginalMember(owner = "client!sm", name = "M", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class2_Sub11_Sub12_Sub2(@OriginalArg(0) Object arg0) {
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5151() {
		return true;
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method5152() {
		return this.aSoftReference2.get();
	}
}
