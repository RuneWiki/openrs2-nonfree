import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public final class Class6_Sub2_Sub7_Sub2 extends Class6_Sub2_Sub7 {

	@OriginalMember(owner = "client!rr", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!rc;Ljava/lang/Object;I)V")
	public Class6_Sub2_Sub7_Sub2(@OriginalArg(0) Interface22 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method7670() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7671() {
		return true;
	}
}
