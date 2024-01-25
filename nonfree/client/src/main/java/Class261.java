import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public final class Class261 {

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "Lclient!da;")
	private final Class50_Sub1 aClass50_Sub1_41;

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "J")
	public final long aLong248;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!da;J[Lclient!rs;)V")
	public Class261(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class214[] arg2) {
		this.aClass50_Sub1_41 = arg0;
		this.aLong248 = arg1;
	}

	@OriginalMember(owner = "client!vo", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass50_Sub1_41.method1276(this.aLong248);
		super.finalize();
	}
}
