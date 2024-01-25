import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public final class Class297 {

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "Lclient!pc;")
	private final Class33_Sub3 aClass33_Sub3_26;

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "J")
	public final long aLong220;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lclient!pc;JI)V")
	public Class297(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass33_Sub3_26 = arg0;
		this.aLong220 = arg1;
	}

	@OriginalMember(owner = "client!qba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass33_Sub3_26.method6331(this.aLong220);
		super.finalize();
	}
}
