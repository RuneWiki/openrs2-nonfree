import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public final class Class2_Sub6_Sub2_Sub2 extends Class2_Sub6_Sub2 {

	@OriginalMember(owner = "client!ml", name = "A", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!we;Ljava/lang/Object;I)V")
	public Class2_Sub6_Sub2_Sub2(@OriginalArg(0) Interface26 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5984() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method5985() {
		return true;
	}
}
