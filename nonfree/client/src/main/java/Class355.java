import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public final class Class355 {

	@OriginalMember(owner = "client!wba", name = "e", descriptor = "Lclient!lj;")
	private final Class78_Sub3 aClass78_Sub3_42;

	@OriginalMember(owner = "client!wba", name = "d", descriptor = "J")
	public final long aLong264;

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lclient!lj;J[Lclient!n;)V")
	public Class355(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class230[] arg2) {
		this.aClass78_Sub3_42 = arg0;
		this.aLong264 = arg1;
	}

	@OriginalMember(owner = "client!wba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass78_Sub3_42.method4514(this.aLong264);
		super.finalize();
	}
}
