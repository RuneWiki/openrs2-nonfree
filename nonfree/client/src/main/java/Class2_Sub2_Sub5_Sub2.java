import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class Class2_Sub2_Sub5_Sub2 extends Class2_Sub2_Sub5 {

	@OriginalMember(owner = "client!nc", name = "A", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub2_Sub5_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4970() {
		return true;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4971() {
		return this.aSoftReference1.get();
	}
}
