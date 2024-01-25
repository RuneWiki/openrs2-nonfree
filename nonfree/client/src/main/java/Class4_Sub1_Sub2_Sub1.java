import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public final class Class4_Sub1_Sub2_Sub1 extends Class4_Sub1_Sub2 {

	@OriginalMember(owner = "client!nd", name = "F", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class4_Sub1_Sub2_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5315() {
		return true;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5314() {
		return this.aSoftReference2.get();
	}
}
