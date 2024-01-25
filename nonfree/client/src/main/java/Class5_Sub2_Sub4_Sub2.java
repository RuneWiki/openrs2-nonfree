import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public final class Class5_Sub2_Sub4_Sub2 extends Class5_Sub2_Sub4 {

	@OriginalMember(owner = "client!pl", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class5_Sub2_Sub4_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method3965() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3963() {
		return true;
	}
}
