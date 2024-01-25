import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public final class Class11_Sub4_Sub11_Sub2 extends Class11_Sub4_Sub11 {

	@OriginalMember(owner = "client!uj", name = "H", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lclient!t;Ljava/lang/Object;)V")
	public Class11_Sub4_Sub11_Sub2(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5351() {
		return true;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method5352() {
		return this.aSoftReference2.get();
	}
}
