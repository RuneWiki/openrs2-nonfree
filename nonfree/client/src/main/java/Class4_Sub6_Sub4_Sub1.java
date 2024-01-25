import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public final class Class4_Sub6_Sub4_Sub1 extends Class4_Sub6_Sub4 {

	@OriginalMember(owner = "client!ef", name = "H", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class4_Sub6_Sub4_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method3257() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3254() {
		return true;
	}
}
