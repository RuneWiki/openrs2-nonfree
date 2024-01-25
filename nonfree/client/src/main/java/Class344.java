import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public final class Class344 {

	@OriginalMember(owner = "client!vca", name = "e", descriptor = "J")
	public final long aLong283;

	@OriginalMember(owner = "client!vca", name = "i", descriptor = "Lclient!no;")
	private final Class66_Sub3 aClass66_Sub3_40;

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lclient!no;J[Lclient!te;)V")
	public Class344(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class312[] arg2) {
		this.aLong283 = arg1;
		this.aClass66_Sub3_40 = arg0;
	}

	@OriginalMember(owner = "client!vca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass66_Sub3_40.method5399(this.aLong283);
		super.finalize();
	}
}
