import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public final class Class258 {

	@OriginalMember(owner = "client!pga", name = "e", descriptor = "Lclient!eea;")
	private final Class87_Sub1_Sub1 aClass87_Sub1_Sub1_6;

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "J")
	public final long aLong217;

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lclient!eea;J[Lclient!ib;)V")
	public Class258(@OriginalArg(0) Class87_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class154[] arg2) {
		this.aClass87_Sub1_Sub1_6 = arg0;
		this.aLong217 = arg1;
	}

	@OriginalMember(owner = "client!pga", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass87_Sub1_Sub1_6.method2402(this.aLong217);
		super.finalize();
	}
}
