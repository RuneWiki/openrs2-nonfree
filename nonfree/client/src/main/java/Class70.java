import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public final class Class70 {

	@OriginalMember(owner = "client!di", name = "d", descriptor = "Lclient!vj;")
	private final Class45_Sub3 aClass45_Sub3_13;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "J")
	public final long aLong48;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lclient!vj;J[Lclient!mc;)V")
	public Class70(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class203[] arg2) {
		this.aClass45_Sub3_13 = arg0;
		this.aLong48 = arg1;
	}

	@OriginalMember(owner = "client!di", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass45_Sub3_13.method7470(this.aLong48);
		super.finalize();
	}
}
