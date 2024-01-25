import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public final class Class128 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "Lclient!ko;")
	private final Class137_Sub1_Sub1 aClass137_Sub1_Sub1_4;

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "J")
	public final long aLong107;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!ko;J[Lclient!ec;)V")
	public Class128(@OriginalArg(0) Class137_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class82[] arg2) {
		this.aClass137_Sub1_Sub1_4 = arg0;
		this.aLong107 = arg1;
	}

	@OriginalMember(owner = "client!gl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass137_Sub1_Sub1_4.method4974(this.aLong107);
		super.finalize();
	}
}
