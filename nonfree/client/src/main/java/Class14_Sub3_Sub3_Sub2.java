import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public final class Class14_Sub3_Sub3_Sub2 extends Class14_Sub3_Sub3 {

	@OriginalMember(owner = "client!lha", name = "K", descriptor = "Ljava/lang/Object;")
	private final Object anObject16;

	@OriginalMember(owner = "client!lha", name = "<init>", descriptor = "(Lclient!dr;Ljava/lang/Object;I)V")
	public Class14_Sub3_Sub3_Sub2(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject16 = arg1;
	}

	@OriginalMember(owner = "client!lha", name = "e", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5212() {
		return this.anObject16;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5210() {
		return false;
	}
}
