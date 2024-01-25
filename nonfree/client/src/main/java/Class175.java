import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ima")
public final class Class175 {

	@OriginalMember(owner = "client!ima", name = "d", descriptor = "J")
	public final long aLong173;

	@OriginalMember(owner = "client!ima", name = "c", descriptor = "Lclient!gia;")
	private final Class67_Sub2 aClass67_Sub2_20;

	@OriginalMember(owner = "client!ima", name = "<init>", descriptor = "(Lclient!gia;J[Lclient!gda;)V")
	public Class175(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class127[] arg2) {
		this.aLong173 = arg1;
		this.aClass67_Sub2_20 = arg0;
	}

	@OriginalMember(owner = "client!ima", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass67_Sub2_20.method3267(this.aLong173);
		super.finalize();
	}
}
