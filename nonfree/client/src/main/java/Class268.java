import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public final class Class268 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "J")
	public final long aLong192;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "Lclient!bi;")
	private final Class13_Sub2 aClass13_Sub2_32;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lclient!bi;JI)V")
	public Class268(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong192 = arg1;
		this.aClass13_Sub2_32 = arg0;
	}

	@OriginalMember(owner = "client!pf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass13_Sub2_32.method1064(this.aLong192);
		super.finalize();
	}
}
