import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public final class Class5_Sub2_Sub3_Sub2 extends Class5_Sub2_Sub3 {

	@OriginalMember(owner = "client!pv", name = "u", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class5_Sub2_Sub3_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6867() {
		return true;
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method6866() {
		return this.aSoftReference2.get();
	}
}
