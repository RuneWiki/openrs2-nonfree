import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public final class Class218 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "J")
	public final long aLong188;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "Lclient!ih;")
	private final Class117_Sub1 aClass117_Sub1_34;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!ih;J[Lclient!kt;)V")
	public Class218(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class143[] arg2) {
		this.aLong188 = arg1;
		this.aClass117_Sub1_34 = arg0;
	}

	@OriginalMember(owner = "client!re", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass117_Sub1_34.method2482(this.aLong188);
		super.finalize();
	}
}
