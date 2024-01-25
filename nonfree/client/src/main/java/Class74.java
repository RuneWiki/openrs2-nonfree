import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public final class Class74 {

	@OriginalMember(owner = "client!eu", name = "e", descriptor = "J")
	public final long aLong60;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "Lclient!bo;")
	private final Class26_Sub1 aClass26_Sub1_10;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lclient!bo;J[Lclient!tr;)V")
	public Class74(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class235[] arg2) {
		this.aLong60 = arg1;
		this.aClass26_Sub1_10 = arg0;
	}

	@OriginalMember(owner = "client!eu", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass26_Sub1_10.method663(this.aLong60);
		super.finalize();
	}
}
