import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nja")
public final class Class2_Sub1_Sub15_Sub1 extends Class2_Sub1_Sub15 {

	@OriginalMember(owner = "client!nja", name = "H", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!nja", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub1_Sub15_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method7148() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!nja", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7150() {
		return true;
	}
}
