import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public final class Class237 {

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "J")
	public final long aLong192;

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "Lclient!qfa;")
	private final Class137_Sub3 aClass137_Sub3_25;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!qfa;JI)V")
	public Class237(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong192 = arg1;
		this.aClass137_Sub3_25 = arg0;
	}

	@OriginalMember(owner = "client!mv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass137_Sub3_25.method7055(this.aLong192);
		super.finalize();
	}
}
