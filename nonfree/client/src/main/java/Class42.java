import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public final class Class42 {

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "Lclient!dw;")
	private final Class82_Sub1 aClass82_Sub1_9;

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "J")
	public final long aLong45;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lclient!dw;J[Lclient!ie;)V")
	public Class42(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class158[] arg2) {
		this.aClass82_Sub1_9 = arg0;
		this.aLong45 = arg1;
	}

	@OriginalMember(owner = "client!cba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass82_Sub1_9.method2041(this.aLong45);
		super.finalize();
	}
}
