import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public final class Class5_Sub3_Sub4_Sub1 extends Class5_Sub3_Sub4 {

	@OriginalMember(owner = "client!gw", name = "t", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class5_Sub3_Sub4_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method8129() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8131() {
		return true;
	}
}
