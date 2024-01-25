import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public final class Class5_Sub1_Sub11_Sub2 extends Class5_Sub1_Sub11 {

	@OriginalMember(owner = "client!uf", name = "E", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!m;Ljava/lang/Object;)V")
	public Class5_Sub1_Sub11_Sub2(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5569() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5571() {
		return true;
	}
}
