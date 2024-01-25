import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public final class Class10_Sub1_Sub3_Sub1 extends Class10_Sub1_Sub3 {

	@OriginalMember(owner = "client!ks", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class10_Sub1_Sub3_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5667() {
		return true;
	}

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5668() {
		return this.aSoftReference1.get();
	}
}
