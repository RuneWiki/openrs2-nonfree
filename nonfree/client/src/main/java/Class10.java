import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public final class Class10 {

	@OriginalMember(owner = "client!af", name = "d", descriptor = "J")
	public final long aLong5;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "Lclient!qj;")
	private final Class100_Sub3 aClass100_Sub3_1;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!qj;JI)V")
	public Class10(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong5 = arg1;
		this.aClass100_Sub3_1 = arg0;
	}

	@OriginalMember(owner = "client!af", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass100_Sub3_1.method6293(this.aLong5);
		super.finalize();
	}
}
