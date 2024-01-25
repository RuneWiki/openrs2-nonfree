import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public final class Class82 {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "J")
	public final long aLong66;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Lclient!ko;")
	private final Class137_Sub1_Sub1 aClass137_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!ko;JI)V")
	public Class82(@OriginalArg(0) Class137_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong66 = arg1;
		this.aClass137_Sub1_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass137_Sub1_Sub1_1.method4974(this.aLong66);
		super.finalize();
	}
}
