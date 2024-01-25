import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public final class Class108 {

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "Lclient!dga;")
	private final Class75_Sub1_Sub1 aClass75_Sub1_Sub1_5;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "J")
	public final long aLong88;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!dga;JI)V")
	public Class108(@OriginalArg(0) Class75_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass75_Sub1_Sub1_5 = arg0;
		this.aLong88 = arg1;
	}

	@OriginalMember(owner = "client!fb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass75_Sub1_Sub1_5.method1955(this.aLong88);
		super.finalize();
	}
}
