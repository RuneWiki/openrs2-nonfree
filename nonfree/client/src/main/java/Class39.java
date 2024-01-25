import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public final class Class39 {

	@OriginalMember(owner = "client!bga", name = "d", descriptor = "Lclient!rda;")
	private final Class57_Sub3_Sub1 aClass57_Sub3_Sub1_3;

	@OriginalMember(owner = "client!bga", name = "e", descriptor = "J")
	public final long aLong20;

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lclient!rda;J[Lclient!hu;)V")
	public Class39(@OriginalArg(0) Class57_Sub3_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class166[] arg2) {
		this.aClass57_Sub3_Sub1_3 = arg0;
		this.aLong20 = arg1;
	}

	@OriginalMember(owner = "client!bga", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass57_Sub3_Sub1_3.method7398(this.aLong20);
		super.finalize();
	}
}
