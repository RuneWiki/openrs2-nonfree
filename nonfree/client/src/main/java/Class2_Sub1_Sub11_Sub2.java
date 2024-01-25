import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public final class Class2_Sub1_Sub11_Sub2 extends Class2_Sub1_Sub11 {

	@OriginalMember(owner = "client!pi", name = "y", descriptor = "Ljava/lang/Object;")
	private final Object anObject16;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!dd;Ljava/lang/Object;I)V")
	public Class2_Sub1_Sub11_Sub2(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject16 = arg1;
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4480() {
		return this.anObject16;
	}

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method4481() {
		return false;
	}
}
