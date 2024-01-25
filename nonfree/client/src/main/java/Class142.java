import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public final class Class142 {

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "Lclient!qi;")
	private final Class12_Sub2_Sub2 aClass12_Sub2_Sub2_4;

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "J")
	public final long aLong166;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!qi;J[Lclient!mn;)V")
	public Class142(@OriginalArg(0) Class12_Sub2_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class217[] arg2) {
		this.aClass12_Sub2_Sub2_4 = arg0;
		this.aLong166 = arg1;
	}

	@OriginalMember(owner = "client!hr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass12_Sub2_Sub2_4.method6294(this.aLong166);
		super.finalize();
	}
}
