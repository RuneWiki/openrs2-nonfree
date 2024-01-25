import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public final class Class3_Sub4_Sub2_Sub1 extends Class3_Sub4_Sub2 {

	@OriginalMember(owner = "client!bca", name = "t", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub4_Sub2_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!bca", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8738() {
		return true;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method8739() {
		return this.aSoftReference1.get();
	}
}
