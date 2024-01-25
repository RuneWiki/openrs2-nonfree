import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public final class Class23 {

	@OriginalMember(owner = "client!as", name = "f", descriptor = "J")
	public final long aLong24;

	@OriginalMember(owner = "client!as", name = "c", descriptor = "Lclient!oea;")
	private final Class87_Sub2 aClass87_Sub2_3;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!oea;J[Lclient!gn;)V")
	public Class23(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class134[] arg2) {
		this.aLong24 = arg1;
		this.aClass87_Sub2_3 = arg0;
	}

	@OriginalMember(owner = "client!as", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass87_Sub2_3.method6173(this.aLong24);
		super.finalize();
	}
}
