import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class Class224 {

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "J")
	public final long aLong166;

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "Lclient!vf;")
	private final Class100_Sub3 aClass100_Sub3_27;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!vf;JI)V")
	public Class224(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong166 = arg1;
		this.aClass100_Sub3_27 = arg0;
	}

	@OriginalMember(owner = "client!lo", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass100_Sub3_27.method8741(this.aLong166);
		super.finalize();
	}
}
