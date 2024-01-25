import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public final class Class5_Sub5_Sub2_Sub2 extends Class5_Sub5_Sub2 {

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "Ljava/lang/Object;")
	private final Object anObject11;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class5_Sub5_Sub2_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject11 = arg0;
	}

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method4147() {
		return false;
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4145() {
		return this.anObject11;
	}
}
