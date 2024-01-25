import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public final class Class2_Sub9_Sub18_Sub1 extends Class2_Sub9_Sub18 {

	@OriginalMember(owner = "client!qa", name = "U", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub9_Sub18_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5574() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5575() {
		return this.aSoftReference2.get();
	}
}
