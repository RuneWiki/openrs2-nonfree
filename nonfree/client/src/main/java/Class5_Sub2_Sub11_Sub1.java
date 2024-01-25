import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public final class Class5_Sub2_Sub11_Sub1 extends Class5_Sub2_Sub11 {

	@OriginalMember(owner = "client!dq", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class5_Sub2_Sub11_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5024() {
		return true;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5022() {
		return this.aSoftReference2.get();
	}
}
