import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public final class Class3_Sub7_Sub8_Sub2 extends Class3_Sub7_Sub8 {

	@OriginalMember(owner = "client!f", name = "x", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub7_Sub8_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method2600() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method2599() {
		return true;
	}
}
