import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public final class Class3_Sub3_Sub2_Sub2 extends Class3_Sub3_Sub2 {

	@OriginalMember(owner = "client!qj", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!sv;Ljava/lang/Object;I)V")
	public Class3_Sub3_Sub2_Sub2(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method4696() {
		return true;
	}

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4695() {
		return this.aSoftReference1.get();
	}
}
