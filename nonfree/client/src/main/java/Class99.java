import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public final class Class99 {

	@OriginalMember(owner = "client!gda", name = "f", descriptor = "J")
	public final long aLong90;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "Lclient!te;")
	private final Class9_Sub3 aClass9_Sub3_15;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!te;J[Lclient!we;)V")
	public Class99(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class315[] arg2) {
		this.aLong90 = arg1;
		this.aClass9_Sub3_15 = arg0;
	}

	@OriginalMember(owner = "client!gda", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass9_Sub3_15.method6716(this.aLong90);
		super.finalize();
	}
}
