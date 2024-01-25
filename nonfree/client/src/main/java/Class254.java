import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public final class Class254 {

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "Lclient!kd;")
	private final Class162_Sub1_Sub2 aClass162_Sub1_Sub2_6;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "J")
	public final long aLong173;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!kd;JI)V")
	public Class254(@OriginalArg(0) Class162_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass162_Sub1_Sub2_6 = arg0;
		this.aLong173 = arg1;
	}

	@OriginalMember(owner = "client!oh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass162_Sub1_Sub2_6.method3960(this.aLong173);
		super.finalize();
	}
}
