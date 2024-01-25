import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public final class Class3_Sub4_Sub4_Sub2 extends Class3_Sub4_Sub4 {

	@OriginalMember(owner = "client!eea", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub4_Sub4_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!eea", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method2341() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method2337() {
		return true;
	}
}
