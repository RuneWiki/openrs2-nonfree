import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public final class Class2_Sub5_Sub9_Sub2 extends Class2_Sub5_Sub9 {

	@OriginalMember(owner = "client!tg", name = "H", descriptor = "Ljava/lang/Object;")
	private final Object anObject9;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!sl;Ljava/lang/Object;I)V")
	public Class2_Sub5_Sub9_Sub2(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject9 = arg1;
	}

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5077() {
		return this.anObject9;
	}

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5075() {
		return false;
	}
}
