import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mja")
public final class Class232 {

	@OriginalMember(owner = "client!mja", name = "f", descriptor = "Lclient!lf;")
	private final Class95_Sub3 aClass95_Sub3_24;

	@OriginalMember(owner = "client!mja", name = "d", descriptor = "J")
	public final long aLong173;

	@OriginalMember(owner = "client!mja", name = "<init>", descriptor = "(Lclient!lf;JI)V")
	public Class232(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass95_Sub3_24 = arg0;
		this.aLong173 = arg1;
	}

	@OriginalMember(owner = "client!mja", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass95_Sub3_24.method4842(this.aLong173);
		super.finalize();
	}
}
