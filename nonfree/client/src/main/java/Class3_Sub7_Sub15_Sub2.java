import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class Class3_Sub7_Sub15_Sub2 extends Class3_Sub7_Sub15 {

	@OriginalMember(owner = "client!qd", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub7_Sub15_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6724() {
		return true;
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method6730() {
		return this.aSoftReference2.get();
	}
}
