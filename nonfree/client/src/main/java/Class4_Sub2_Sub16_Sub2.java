import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public final class Class4_Sub2_Sub16_Sub2 extends Class4_Sub2_Sub16 {

	@OriginalMember(owner = "client!tc", name = "v", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!hf;Ljava/lang/Object;I)V")
	public Class4_Sub2_Sub16_Sub2(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4974() {
		return true;
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4973() {
		return this.aSoftReference2.get();
	}
}
