import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public final class Class2_Sub5_Sub7_Sub2 extends Class2_Sub5_Sub7 {

	@OriginalMember(owner = "client!kc", name = "A", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!rf;Ljava/lang/Object;I)V")
	public Class2_Sub5_Sub7_Sub2(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4486() {
		return true;
	}

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4488() {
		return this.aSoftReference1.get();
	}
}
