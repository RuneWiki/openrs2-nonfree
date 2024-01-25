import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public final class Class45 {

	@OriginalMember(owner = "client!caa", name = "d", descriptor = "J")
	public final long aLong21;

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "Lclient!er;")
	private final Class31_Sub2 aClass31_Sub2_5;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Lclient!er;J[Lclient!jf;)V")
	public Class45(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class157[] arg2) {
		this.aLong21 = arg1;
		this.aClass31_Sub2_5 = arg0;
	}

	@OriginalMember(owner = "client!caa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass31_Sub2_5.method2562(this.aLong21);
		super.finalize();
	}
}
