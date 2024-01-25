import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public final class Class4_Sub5_Sub5_Sub2 extends Class4_Sub5_Sub5 {

	@OriginalMember(owner = "client!ww", name = "A", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class4_Sub5_Sub5_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method8998() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8996() {
		return true;
	}
}
