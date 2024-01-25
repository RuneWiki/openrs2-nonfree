import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public final class Class3_Sub3_Sub9_Sub1 extends Class3_Sub3_Sub9 {

	@OriginalMember(owner = "client!fh", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub3_Sub9_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3512() {
		return true;
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method3515() {
		return this.aSoftReference1.get();
	}
}
