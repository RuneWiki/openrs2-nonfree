import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public final class Class3_Sub10_Sub12_Sub2 extends Class3_Sub10_Sub12 {

	@OriginalMember(owner = "client!p", name = "t", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub10_Sub12_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5674() {
		return true;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method5671() {
		return this.aSoftReference1.get();
	}
}
