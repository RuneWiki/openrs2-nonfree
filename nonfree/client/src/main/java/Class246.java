import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public final class Class246 {

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "J")
	public final long aLong214;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "Lclient!ur;")
	private final Class34_Sub2 aClass34_Sub2_40;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lclient!ur;J[Lclient!pi;)V")
	public Class246(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class188[] arg2) {
		this.aLong214 = arg1;
		this.aClass34_Sub2_40 = arg0;
	}

	@OriginalMember(owner = "client!uq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass34_Sub2_40.method5515(this.aLong214);
		super.finalize();
	}
}
