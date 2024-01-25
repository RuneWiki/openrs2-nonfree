import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public final class Class45 {

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "J")
	public final long aLong40;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "Lclient!eq;")
	private final Class33_Sub3 aClass33_Sub3_5;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!eq;JI)V")
	public Class45(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong40 = arg1;
		this.aClass33_Sub3_5 = arg0;
	}

	@OriginalMember(owner = "client!ci", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass33_Sub3_5.method3021(this.aLong40);
		super.finalize();
	}
}
