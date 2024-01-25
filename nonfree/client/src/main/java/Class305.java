import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public final class Class305 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "J")
	public final long aLong218;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "Lclient!jaa;")
	private final Class14_Sub3 aClass14_Sub3_39;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!jaa;J[Lclient!hr;)V")
	public Class305(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class137[] arg2) {
		this.aLong218 = arg1;
		this.aClass14_Sub3_39 = arg0;
	}

	@OriginalMember(owner = "client!sh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass14_Sub3_39.method3909(this.aLong218);
		super.finalize();
	}
}
