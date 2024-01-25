import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public final class Class2_Sub1_Sub3_Sub1 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!bj", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub1_Sub3_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5179() {
		return true;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5178() {
		return this.aSoftReference1.get();
	}
}
