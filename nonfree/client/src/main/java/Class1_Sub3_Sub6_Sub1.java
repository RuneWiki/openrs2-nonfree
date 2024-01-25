import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public final class Class1_Sub3_Sub6_Sub1 extends Class1_Sub3_Sub6 {

	@OriginalMember(owner = "client!bn", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub3_Sub6_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method5933() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5932() {
		return true;
	}
}
