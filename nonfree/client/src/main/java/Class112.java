import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public final class Class112 {

	@OriginalMember(owner = "client!gda", name = "e", descriptor = "J")
	public final long aLong81;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "Lclient!tba;")
	private final Class78_Sub1_Sub2 aClass78_Sub1_Sub2_2;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!tba;J[Lclient!tu;)V")
	public Class112(@OriginalArg(0) Class78_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class327[] arg2) {
		this.aLong81 = arg1;
		this.aClass78_Sub1_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!gda", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass78_Sub1_Sub2_2.method6990(this.aLong81);
		super.finalize();
	}
}
