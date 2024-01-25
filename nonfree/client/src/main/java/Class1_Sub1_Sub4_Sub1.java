import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public final class Class1_Sub1_Sub4_Sub1 extends Class1_Sub1_Sub4 {

	@OriginalMember(owner = "client!en", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub1_Sub4_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method1758() {
		return true;
	}

	@OriginalMember(owner = "client!en", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method1756() {
		return this.aSoftReference1.get();
	}
}
