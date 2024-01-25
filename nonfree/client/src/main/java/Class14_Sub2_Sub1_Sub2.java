import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public final class Class14_Sub2_Sub1_Sub2 extends Class14_Sub2_Sub1 {

	@OriginalMember(owner = "client!ta", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class14_Sub2_Sub1_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8224() {
		return true;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method8225() {
		return this.aSoftReference2.get();
	}
}
