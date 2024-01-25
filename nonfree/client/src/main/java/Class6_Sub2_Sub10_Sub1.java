import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class6_Sub2_Sub10_Sub1 extends Class6_Sub2_Sub10 {

	@OriginalMember(owner = "client!ie", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!vm;Ljava/lang/Object;I)V")
	public Class6_Sub2_Sub10_Sub1(@OriginalArg(0) Interface26 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method6996() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6997() {
		return true;
	}
}
