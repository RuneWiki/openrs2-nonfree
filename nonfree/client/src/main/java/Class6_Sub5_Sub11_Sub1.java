import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public final class Class6_Sub5_Sub11_Sub1 extends Class6_Sub5_Sub11 {

	@OriginalMember(owner = "client!li", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class6_Sub5_Sub11_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method7818() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!li", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method7819() {
		return true;
	}
}
