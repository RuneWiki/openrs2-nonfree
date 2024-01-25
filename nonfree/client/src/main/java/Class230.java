import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public final class Class230 {

	@OriginalMember(owner = "client!n", name = "g", descriptor = "Lclient!lj;")
	private final Class78_Sub3 aClass78_Sub3_25;

	@OriginalMember(owner = "client!n", name = "e", descriptor = "J")
	public final long aLong150;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!lj;JI)V")
	public Class230(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass78_Sub3_25 = arg0;
		this.aLong150 = arg1;
	}

	@OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass78_Sub3_25.method4514(this.aLong150);
		super.finalize();
	}
}
