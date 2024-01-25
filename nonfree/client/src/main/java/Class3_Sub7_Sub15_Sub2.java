import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public final class Class3_Sub7_Sub15_Sub2 extends Class3_Sub7_Sub15 {

	@OriginalMember(owner = "client!saa", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub7_Sub15_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!saa", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method6554() {
		return true;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method6553() {
		return this.aSoftReference2.get();
	}
}
