import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class235 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "J")
	public final long aLong181;

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "Lclient!mba;")
	private final Class145_Sub1_Sub1 aClass145_Sub1_Sub1_8;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!mba;J[Lclient!su;)V")
	public Class235(@OriginalArg(0) Class145_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class345[] arg2) {
		this.aLong181 = arg1;
		this.aClass145_Sub1_Sub1_8 = arg0;
	}

	@OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass145_Sub1_Sub1_8.method5742(this.aLong181);
		super.finalize();
	}
}
