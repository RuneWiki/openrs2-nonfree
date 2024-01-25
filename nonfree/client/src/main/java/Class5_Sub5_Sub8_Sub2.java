import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public final class Class5_Sub5_Sub8_Sub2 extends Class5_Sub5_Sub8 {

	@OriginalMember(owner = "client!kaa", name = "w", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class5_Sub5_Sub8_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method4379() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method4378() {
		return true;
	}
}
