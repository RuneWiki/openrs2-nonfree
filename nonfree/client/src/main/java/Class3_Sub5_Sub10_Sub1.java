import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public final class Class3_Sub5_Sub10_Sub1 extends Class3_Sub5_Sub10 {

	@OriginalMember(owner = "client!ica", name = "x", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub5_Sub10_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4379() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!ica", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method4382() {
		return true;
	}
}
