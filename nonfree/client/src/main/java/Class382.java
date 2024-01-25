import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public final class Class382 {

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "J")
	public final long aLong274;

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "Lclient!hj;")
	private final Class82_Sub3_Sub1 aClass82_Sub3_Sub1_12;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!hj;JI)V")
	public Class382(@OriginalArg(0) Class82_Sub3_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong274 = arg1;
		this.aClass82_Sub3_Sub1_12 = arg0;
	}

	@OriginalMember(owner = "client!ws", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass82_Sub3_Sub1_12.method3751(this.aLong274);
		super.finalize();
	}
}
