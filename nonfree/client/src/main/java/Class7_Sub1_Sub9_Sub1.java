import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public final class Class7_Sub1_Sub9_Sub1 extends Class7_Sub1_Sub9 {

	@OriginalMember(owner = "client!rp", name = "K", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!pc;Ljava/lang/Object;)V")
	public Class7_Sub1_Sub9_Sub1(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method4766() {
		return true;
	}

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4768() {
		return this.aSoftReference2.get();
	}
}
