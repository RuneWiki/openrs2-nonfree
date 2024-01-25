import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public final class Class206 {

	@OriginalMember(owner = "client!l", name = "h", descriptor = "J")
	public final long aLong158;

	@OriginalMember(owner = "client!l", name = "d", descriptor = "Lclient!ck;")
	private final Class65_Sub1 aClass65_Sub1_17;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!ck;JI)V")
	public Class206(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong158 = arg1;
		this.aClass65_Sub1_17 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass65_Sub1_17.method1277(this.aLong158);
		super.finalize();
	}
}
