import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public final class Class6_Sub4_Sub5_Sub1 extends Class6_Sub4_Sub5 {

	@OriginalMember(owner = "client!ll", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class6_Sub4_Sub5_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method6328() {
		return true;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method6327() {
		return this.aSoftReference2.get();
	}
}
