import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public final class Class1_Sub1_Sub3_Sub1 extends Class1_Sub1_Sub3 {

	@OriginalMember(owner = "client!cg", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub1_Sub3_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7497() {
		return true;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7496() {
		return this.aSoftReference1.get();
	}
}
