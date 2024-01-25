import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public final class Class290 {

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "J")
	public final long aLong217;

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "Lclient!pc;")
	private final Class33_Sub3 aClass33_Sub3_23;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!pc;J[Lclient!qba;)V")
	public Class290(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class297[] arg2) {
		this.aLong217 = arg1;
		this.aClass33_Sub3_23 = arg0;
	}

	@OriginalMember(owner = "client!pq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass33_Sub3_23.method6331(this.aLong217);
		super.finalize();
	}
}
