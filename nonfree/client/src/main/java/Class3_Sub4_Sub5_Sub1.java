import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public final class Class3_Sub4_Sub5_Sub1 extends Class3_Sub4_Sub5 {

	@OriginalMember(owner = "client!dj", name = "G", descriptor = "Ljava/lang/ref/SoftReference;")
	private SoftReference aSoftReference1;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class3_Sub4_Sub5_Sub1(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method4035() {
		return true;
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method4033() {
		return this.aSoftReference1.get();
	}
}
