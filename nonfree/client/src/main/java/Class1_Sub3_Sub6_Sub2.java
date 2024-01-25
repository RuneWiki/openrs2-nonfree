import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public final class Class1_Sub3_Sub6_Sub2 extends Class1_Sub3_Sub6 {

	@OriginalMember(owner = "client!lf", name = "Q", descriptor = "Ljava/lang/Object;")
	private final Object anObject3;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lclient!go;Ljava/lang/Object;I)V")
	public Class1_Sub3_Sub6_Sub2(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject3 = arg1;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method3329() {
		return this.anObject3;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3327() {
		return false;
	}
}
