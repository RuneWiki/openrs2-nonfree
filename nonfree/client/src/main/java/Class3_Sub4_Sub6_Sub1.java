import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class3_Sub4_Sub6_Sub1 extends Class3_Sub4_Sub6 {

	@OriginalMember(owner = "client!db", name = "A", descriptor = "Ljava/lang/Object;")
	private final Object anObject5;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!ue;Ljava/lang/Object;I)V")
	public Class3_Sub4_Sub6_Sub1(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject5 = arg1;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5832() {
		return false;
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5833() {
		return this.anObject5;
	}
}
