import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public final class Class1_Sub2_Sub6_Sub1 extends Class1_Sub2_Sub6 {

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "Ljava/lang/Object;")
	private final Object anObject2;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!kb;Ljava/lang/Object;)V")
	public Class1_Sub2_Sub6_Sub1(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.anObject2 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method2973() {
		return this.anObject2;
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method2976() {
		return false;
	}
}
