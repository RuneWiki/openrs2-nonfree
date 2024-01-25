import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public final class Class147 {

	@OriginalMember(owner = "client!hq", name = "g", descriptor = "Lclient!ji;")
	private final Class15_Sub3 aClass15_Sub3_16;

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "J")
	public final long aLong114;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!ji;J[Lclient!kk;)V")
	public Class147(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class185[] arg2) {
		this.aClass15_Sub3_16 = arg0;
		this.aLong114 = arg1;
	}

	@OriginalMember(owner = "client!hq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass15_Sub3_16.method4446(this.aLong114);
		super.finalize();
	}
}
