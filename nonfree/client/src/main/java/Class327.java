import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public final class Class327 {

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "J")
	public final long aLong242;

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "Lclient!tba;")
	private final Class78_Sub1_Sub2 aClass78_Sub1_Sub2_10;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!tba;JI)V")
	public Class327(@OriginalArg(0) Class78_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong242 = arg1;
		this.aClass78_Sub1_Sub2_10 = arg0;
	}

	@OriginalMember(owner = "client!tu", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass78_Sub1_Sub2_10.method6990(this.aLong242);
		super.finalize();
	}
}
