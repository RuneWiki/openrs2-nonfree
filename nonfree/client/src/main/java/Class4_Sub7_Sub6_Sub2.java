import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public final class Class4_Sub7_Sub6_Sub2 extends Class4_Sub7_Sub6 {

	@OriginalMember(owner = "client!td", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class4_Sub7_Sub6_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7127() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method7124() {
		return true;
	}
}
