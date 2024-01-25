import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public final class Class260 {

	@OriginalMember(owner = "client!on", name = "b", descriptor = "Lclient!pq;")
	private final Class132_Sub3 aClass132_Sub3_34;

	@OriginalMember(owner = "client!on", name = "e", descriptor = "J")
	public final long aLong213;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!pq;J[Lclient!hh;)V")
	public Class260(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class142[] arg2) {
		this.aClass132_Sub3_34 = arg0;
		this.aLong213 = arg1;
	}

	@OriginalMember(owner = "client!on", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass132_Sub3_34.method6743(this.aLong213);
		super.finalize();
	}
}
