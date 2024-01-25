import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class367 {

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "Lclient!ck;")
	private final Class33_Sub1_Sub1 aClass33_Sub1_Sub1_12;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "J")
	public final long aLong272;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!ck;J[Lclient!ju;)V")
	public Class367(@OriginalArg(0) Class33_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class168[] arg2) {
		this.aClass33_Sub1_Sub1_12 = arg0;
		this.aLong272 = arg1;
	}

	@OriginalMember(owner = "client!wd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass33_Sub1_Sub1_12.method1729(this.aLong272);
		super.finalize();
	}
}
