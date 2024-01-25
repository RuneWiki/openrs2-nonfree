import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public final class Class142 {

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "J")
	public final long aLong114;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "Lclient!pq;")
	private final Class132_Sub3 aClass132_Sub3_16;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!pq;JI)V")
	public Class142(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong114 = arg1;
		this.aClass132_Sub3_16 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass132_Sub3_16.method6743(this.aLong114);
		super.finalize();
	}
}
