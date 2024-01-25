import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public final class Class2_Sub5_Sub2_Sub1 extends Class2_Sub5_Sub2 {

	@OriginalMember(owner = "client!f", name = "G", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub5_Sub2_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!f", name = "g", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method1877() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method1871() {
		return true;
	}
}
