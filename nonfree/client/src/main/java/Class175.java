import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public final class Class175 {

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "J")
	public final long aLong134;

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "Lclient!vf;")
	private final Class100_Sub3 aClass100_Sub3_17;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!vf;J[Lclient!lo;)V")
	public Class175(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class224[] arg2) {
		this.aLong134 = arg1;
		this.aClass100_Sub3_17 = arg0;
	}

	@OriginalMember(owner = "client!ir", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass100_Sub3_17.method8741(this.aLong134);
		super.finalize();
	}
}
