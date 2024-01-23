import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class Class4_Sub3_Sub4_Sub2 extends Class4_Sub3_Sub4 {

	@OriginalMember(owner = "client!kh", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private SoftReference aSoftReference1;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class4_Sub3_Sub4_Sub2(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method2327() {
		return true;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method2326() {
		return this.aSoftReference1.get();
	}
}
