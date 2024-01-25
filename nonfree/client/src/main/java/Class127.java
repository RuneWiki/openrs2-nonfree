import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public final class Class127 {

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "J")
	public final long aLong127;

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "Lclient!gia;")
	private final Class67_Sub2 aClass67_Sub2_14;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!gia;JI)V")
	public Class127(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong127 = arg1;
		this.aClass67_Sub2_14 = arg0;
	}

	@OriginalMember(owner = "client!gda", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass67_Sub2_14.method3267(this.aLong127);
		super.finalize();
	}
}
