import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public final class Class2_Sub5_Sub2_Sub1 extends Class2_Sub5_Sub2 {

	@OriginalMember(owner = "client!cu", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lclient!jo;Ljava/lang/Object;I)V")
	public Class2_Sub5_Sub2_Sub1(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method2956() {
		return true;
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method2955() {
		return this.aSoftReference1.get();
	}
}
