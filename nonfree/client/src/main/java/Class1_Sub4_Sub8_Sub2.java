import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public final class Class1_Sub4_Sub8_Sub2 extends Class1_Sub4_Sub8 {

	@OriginalMember(owner = "client!ka", name = "T", descriptor = "Ljava/lang/Object;")
	private final Object anObject1;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lclient!ur;Ljava/lang/Object;I)V")
	public Class1_Sub4_Sub8_Sub2(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject1 = arg1;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method3010() {
		return false;
	}

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3009() {
		return this.anObject1;
	}
}
