import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class Class149 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "J")
	public final long aLong133;

	@OriginalMember(owner = "client!lo", name = "l", descriptor = "Lclient!ht;")
	private final Class109_Sub1 aClass109_Sub1_29;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!ht;JI)V")
	public Class149(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong133 = arg1;
		this.aClass109_Sub1_29 = arg0;
	}

	@OriginalMember(owner = "client!lo", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass109_Sub1_29.method2602(this.aLong133);
		super.finalize();
	}
}
