import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public final class Class2_Sub2_Sub10_Sub1 extends Class2_Sub2_Sub10 {

	@OriginalMember(owner = "client!sg", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!kr;Ljava/lang/Object;I)V")
	public Class2_Sub2_Sub10_Sub1(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5325() {
		return true;
	}

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5326() {
		return this.aSoftReference1.get();
	}
}
