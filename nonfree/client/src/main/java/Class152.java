import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public final class Class152 {

	@OriginalMember(owner = "client!hw", name = "f", descriptor = "J")
	public final long aLong121;

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "Lclient!qfa;")
	private final Class137_Sub3 aClass137_Sub3_15;

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lclient!qfa;J[Lclient!mv;)V")
	public Class152(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class237[] arg2) {
		this.aLong121 = arg1;
		this.aClass137_Sub3_15 = arg0;
	}

	@OriginalMember(owner = "client!hw", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass137_Sub3_15.method7055(this.aLong121);
		super.finalize();
	}
}
