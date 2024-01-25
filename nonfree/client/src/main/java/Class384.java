import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public final class Class384 {

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "J")
	public final long aLong333;

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "Lclient!ml;")
	private final Class75_Sub3 aClass75_Sub3_42;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lclient!ml;J[Lclient!uk;)V")
	public Class384(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class362[] arg2) {
		this.aLong333 = arg1;
		this.aClass75_Sub3_42 = arg0;
	}

	@OriginalMember(owner = "client!vr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass75_Sub3_42.method5763(this.aLong333);
		super.finalize();
	}
}
