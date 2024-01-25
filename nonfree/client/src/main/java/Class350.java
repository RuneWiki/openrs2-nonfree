import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public final class Class350 {

	@OriginalMember(owner = "client!un", name = "g", descriptor = "J")
	public final long aLong247;

	@OriginalMember(owner = "client!un", name = "c", descriptor = "Lclient!rs;")
	private final Class133_Sub3 aClass133_Sub3_36;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!rs;J[Lclient!waa;)V")
	public Class350(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class369[] arg2) {
		this.aLong247 = arg1;
		this.aClass133_Sub3_36 = arg0;
	}

	@OriginalMember(owner = "client!un", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass133_Sub3_36.method7333(this.aLong247);
		super.finalize();
	}
}
