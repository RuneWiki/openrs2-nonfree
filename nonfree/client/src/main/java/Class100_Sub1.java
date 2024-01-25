import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class Class100_Sub1 extends Class100 {

	@OriginalMember(owner = "client!eq", name = "O", descriptor = "Lclient!bla;")
	private final Class19_Sub1 aClass19_Sub1_23;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lclient!bla;Z)V")
	public Class100_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg1);
		this.aClass19_Sub1_23 = arg0;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!bg;II)V")
	@Override
	protected final void method8972(@OriginalArg(0) Class26 arg0, @OriginalArg(2) int arg1) {
		Static647.method8724(this.aClass19_Sub1_23, arg0, arg1);
	}
}
