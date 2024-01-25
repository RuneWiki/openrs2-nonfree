import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public final class Class177 {

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "J")
	public final long aLong221;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "Lclient!na;")
	private final Class75_Sub2 aClass75_Sub2_28;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!na;J[Lclient!im;)V")
	public Class177(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class124[] arg2) {
		this.aLong221 = arg1;
		this.aClass75_Sub2_28 = arg0;
	}

	@OriginalMember(owner = "client!mv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass75_Sub2_28.method3860(this.aLong221);
		super.finalize();
	}
}
