import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public final class Class5_Sub4_Sub4_Sub2 extends Class5_Sub4_Sub4 {

	@OriginalMember(owner = "client!kr", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class5_Sub4_Sub4_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4399() {
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4398() {
		return this.aSoftReference1.get();
	}
}
