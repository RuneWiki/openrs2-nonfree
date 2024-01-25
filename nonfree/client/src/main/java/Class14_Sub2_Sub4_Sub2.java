import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qka")
public final class Class14_Sub2_Sub4_Sub2 extends Class14_Sub2_Sub4 {

	@OriginalMember(owner = "client!qka", name = "E", descriptor = "Ljava/lang/Object;")
	private final Object anObject19;

	@OriginalMember(owner = "client!qka", name = "<init>", descriptor = "(Lclient!uha;Ljava/lang/Object;I)V")
	public Class14_Sub2_Sub4_Sub2(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject19 = arg1;
	}

	@OriginalMember(owner = "client!qka", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7554() {
		return false;
	}

	@OriginalMember(owner = "client!qka", name = "b", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method7557() {
		return this.anObject19;
	}
}
