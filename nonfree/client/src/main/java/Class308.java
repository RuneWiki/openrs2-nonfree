import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public final class Class308 {

	@OriginalMember(owner = "client!vv", name = "f", descriptor = "J")
	public final long aLong245;

	@OriginalMember(owner = "client!vv", name = "d", descriptor = "Lclient!jj;")
	private final Class62_Sub3 aClass62_Sub3_42;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lclient!jj;J[Lclient!ud;)V")
	public Class308(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class289[] arg2) {
		this.aLong245 = arg1;
		this.aClass62_Sub3_42 = arg0;
	}

	@OriginalMember(owner = "client!vv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass62_Sub3_42.method3940(this.aLong245);
		super.finalize();
	}
}
