import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public final class Class2_Sub6_Sub11_Sub2 extends Class2_Sub6_Sub11 {

	@OriginalMember(owner = "client!ni", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub6_Sub11_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method6201() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method6204() {
		return true;
	}
}
