import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public final class Class167 {

	@OriginalMember(owner = "client!it", name = "g", descriptor = "Lclient!bi;")
	private final Class13_Sub2 aClass13_Sub2_19;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "J")
	public final long aLong112;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!bi;J[Lclient!pf;)V")
	public Class167(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class268[] arg2) {
		this.aClass13_Sub2_19 = arg0;
		this.aLong112 = arg1;
	}

	@OriginalMember(owner = "client!it", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass13_Sub2_19.method1064(this.aLong112);
		super.finalize();
	}
}
