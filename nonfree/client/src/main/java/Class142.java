import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public final class Class142 {

	@OriginalMember(owner = "client!gw", name = "h", descriptor = "J")
	public final long aLong98;

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "Lclient!lf;")
	private final Class95_Sub3 aClass95_Sub3_16;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lclient!lf;J[Lclient!mja;)V")
	public Class142(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class232[] arg2) {
		this.aLong98 = arg1;
		this.aClass95_Sub3_16 = arg0;
	}

	@OriginalMember(owner = "client!gw", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass95_Sub3_16.method4842(this.aLong98);
		super.finalize();
	}
}
