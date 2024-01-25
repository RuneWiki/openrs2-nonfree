import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public final class Class1_Sub1_Sub3_Sub2 extends Class1_Sub1_Sub3 {

	@OriginalMember(owner = "client!fu", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!mb;Ljava/lang/Object;I)V")
	public Class1_Sub1_Sub3_Sub2(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method2044() {
		return true;
	}

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method2045() {
		return this.aSoftReference1.get();
	}
}
