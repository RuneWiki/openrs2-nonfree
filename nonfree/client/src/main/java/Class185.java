import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public final class Class185 {

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "Lclient!ji;")
	private final Class15_Sub3 aClass15_Sub3_21;

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "J")
	public final long aLong164;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!ji;JI)V")
	public Class185(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass15_Sub3_21 = arg0;
		this.aLong164 = arg1;
	}

	@OriginalMember(owner = "client!kk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass15_Sub3_21.method4446(this.aLong164);
		super.finalize();
	}
}
