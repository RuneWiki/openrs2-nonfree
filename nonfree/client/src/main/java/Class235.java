import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public final class Class235 {

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "J")
	public final long aLong202;

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "Lclient!bo;")
	private final Class26_Sub1 aClass26_Sub1_33;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lclient!bo;JI)V")
	public Class235(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong202 = arg1;
		this.aClass26_Sub1_33 = arg0;
	}

	@OriginalMember(owner = "client!tr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass26_Sub1_33.method663(this.aLong202);
		super.finalize();
	}
}
