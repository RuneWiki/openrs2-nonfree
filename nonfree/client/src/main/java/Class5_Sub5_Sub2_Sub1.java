import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public final class Class5_Sub5_Sub2_Sub1 extends Class5_Sub5_Sub2 {

	@OriginalMember(owner = "client!bo", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class5_Sub5_Sub2_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4145() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method4147() {
		return true;
	}
}
