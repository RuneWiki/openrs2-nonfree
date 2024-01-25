import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class312 {

	@OriginalMember(owner = "client!te", name = "e", descriptor = "Lclient!no;")
	private final Class66_Sub3 aClass66_Sub3_36;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "J")
	public final long aLong260;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!no;JI)V")
	public Class312(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass66_Sub3_36 = arg0;
		this.aLong260 = arg1;
	}

	@OriginalMember(owner = "client!te", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass66_Sub3_36.method5399(this.aLong260);
		super.finalize();
	}
}
