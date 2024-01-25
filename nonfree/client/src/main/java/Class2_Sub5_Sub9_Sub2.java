import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public final class Class2_Sub5_Sub9_Sub2 extends Class2_Sub5_Sub9 {

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub5_Sub9_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5193() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5190() {
		return true;
	}
}
