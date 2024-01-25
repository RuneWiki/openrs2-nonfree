import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public final class Class1_Sub1_Sub10_Sub1 extends Class1_Sub1_Sub10 {

	@OriginalMember(owner = "client!fs", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!c;Ljava/lang/Object;)V")
	public Class1_Sub1_Sub10_Sub1(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method5109() {
		return true;
	}

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5108() {
		return this.aSoftReference1.get();
	}
}
