import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public final class Class3_Sub4_Sub5_Sub2 extends Class3_Sub4_Sub5 {

	@OriginalMember(owner = "client!np", name = "B", descriptor = "Ljava/lang/Object;")
	private final Object anObject11;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub4_Sub5_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject11 = arg0;
	}

	@OriginalMember(owner = "client!np", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method3899() {
		return false;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method3898() {
		return this.anObject11;
	}
}
