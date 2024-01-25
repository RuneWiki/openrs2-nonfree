import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public final class Class369 {

	@OriginalMember(owner = "client!waa", name = "i", descriptor = "Lclient!rs;")
	private final Class133_Sub3 aClass133_Sub3_39;

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "J")
	public final long aLong269;

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lclient!rs;JI)V")
	public Class369(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass133_Sub3_39 = arg0;
		this.aLong269 = arg1;
	}

	@OriginalMember(owner = "client!waa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass133_Sub3_39.method7333(this.aLong269);
		super.finalize();
	}
}
