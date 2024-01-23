import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public final class Class2_Sub8_Sub4_Sub1 extends Class2_Sub8_Sub4 {

	@OriginalMember(owner = "client!p", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
	private SoftReference aSoftReference1;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class2_Sub8_Sub4_Sub1(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3754() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method3755() {
		return true;
	}
}
