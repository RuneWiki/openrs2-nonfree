import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public final class Class249 {

	@OriginalMember(owner = "client!v", name = "b", descriptor = "J")
	public final long aLong215;

	@OriginalMember(owner = "client!v", name = "e", descriptor = "Lclient!qg;")
	private final Class121_Sub2 aClass121_Sub2_40;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!qg;J[Lclient!we;)V")
	public Class249(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class259[] arg2) {
		this.aLong215 = arg1;
		this.aClass121_Sub2_40 = arg0;
	}

	@OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass121_Sub2_40.method4686(this.aLong215);
		super.finalize();
	}
}
