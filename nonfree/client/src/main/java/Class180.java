import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public final class Class180 {

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "Lclient!hj;")
	private final Class82_Sub3_Sub1 aClass82_Sub3_Sub1_7;

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "J")
	public final long aLong143;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!hj;J[Lclient!ws;)V")
	public Class180(@OriginalArg(0) Class82_Sub3_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class382[] arg2) {
		this.aClass82_Sub3_Sub1_7 = arg0;
		this.aLong143 = arg1;
	}

	@OriginalMember(owner = "client!jp", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass82_Sub3_Sub1_7.method3751(this.aLong143);
		super.finalize();
	}
}
