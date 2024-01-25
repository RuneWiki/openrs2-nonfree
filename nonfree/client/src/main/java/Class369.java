import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public final class Class369 {

	@OriginalMember(owner = "client!waa", name = "d", descriptor = "Lclient!ep;")
	private final Class95_Sub1 aClass95_Sub1_42;

	@OriginalMember(owner = "client!waa", name = "f", descriptor = "J")
	public final long aLong271;

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lclient!ep;J[Lclient!ee;)V")
	public Class369(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class83[] arg2) {
		this.aClass95_Sub1_42 = arg0;
		this.aLong271 = arg1;
	}

	@OriginalMember(owner = "client!waa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass95_Sub1_42.method2061(this.aLong271);
		super.finalize();
	}
}
