import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class4_Sub2_Sub8_Sub2 extends Class4_Sub2_Sub8 {

	@OriginalMember(owner = "client!hl", name = "K", descriptor = "Ljava/lang/ref/SoftReference;")
	private SoftReference aSoftReference1;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class4_Sub2_Sub8_Sub2(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method1815() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method1817() {
		return true;
	}
}
