import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public final class Class301 {

	@OriginalMember(owner = "client!ro", name = "h", descriptor = "J")
	public final long aLong209;

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "Lclient!kd;")
	private final Class162_Sub1_Sub2 aClass162_Sub1_Sub2_9;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lclient!kd;J[Lclient!oh;)V")
	public Class301(@OriginalArg(0) Class162_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class254[] arg2) {
		this.aLong209 = arg1;
		this.aClass162_Sub1_Sub2_9 = arg0;
	}

	@OriginalMember(owner = "client!ro", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass162_Sub1_Sub2_9.method3960(this.aLong209);
		super.finalize();
	}
}
