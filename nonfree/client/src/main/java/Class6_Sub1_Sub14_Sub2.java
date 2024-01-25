import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public final class Class6_Sub1_Sub14_Sub2 extends Class6_Sub1_Sub14 {

	@OriginalMember(owner = "client!t", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class6_Sub1_Sub14_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!t", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method5222() {
		return true;
	}

	@OriginalMember(owner = "client!t", name = "g", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5221() {
		return this.aSoftReference1.get();
	}
}
