import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public final class Class1_Sub1_Sub12_Sub2 extends Class1_Sub1_Sub12 {

	@OriginalMember(owner = "client!og", name = "F", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub1_Sub12_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method4225() {
		return true;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4222() {
		return this.aSoftReference2.get();
	}
}
