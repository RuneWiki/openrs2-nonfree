import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public final class Class2_Sub10_Sub4_Sub1 extends Class2_Sub10_Sub4 {

	@OriginalMember(owner = "client!dk", name = "N", descriptor = "Ljava/lang/Object;")
	private final Object anObject1;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!ts;Ljava/lang/Object;I)V")
	public Class2_Sub10_Sub4_Sub1(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject1 = arg1;
	}

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method3222() {
		return false;
	}

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3219() {
		return this.anObject1;
	}
}
