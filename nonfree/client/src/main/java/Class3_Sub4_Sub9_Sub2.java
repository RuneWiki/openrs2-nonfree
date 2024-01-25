import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public final class Class3_Sub4_Sub9_Sub2 extends Class3_Sub4_Sub9 {

	@OriginalMember(owner = "client!il", name = "U", descriptor = "Ljava/lang/Object;")
	private final Object anObject9;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!gj;Ljava/lang/Object;I)V")
	public Class3_Sub4_Sub9_Sub2(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject9 = arg1;
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method3821() {
		return false;
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3818() {
		return this.anObject9;
	}
}
