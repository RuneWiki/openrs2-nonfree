import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public final class Class110 {

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "J")
	public final long aLong91;

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "Lclient!fc;")
	private final Class101_Sub1_Sub1 aClass101_Sub1_Sub1_4;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!fc;JI)V")
	public Class110(@OriginalArg(0) Class101_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong91 = arg1;
		this.aClass101_Sub1_Sub1_4 = arg0;
	}

	@OriginalMember(owner = "client!fo", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass101_Sub1_Sub1_4.method3146(this.aLong91);
		super.finalize();
	}
}
