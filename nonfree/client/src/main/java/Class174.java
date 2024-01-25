import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public final class Class174 {

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "Lclient!sha;")
	private final Class95_Sub1_Sub1 aClass95_Sub1_Sub1_4;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "J")
	public final long aLong129;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lclient!sha;J[Lclient!mca;)V")
	public Class174(@OriginalArg(0) Class95_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class224[] arg2) {
		this.aClass95_Sub1_Sub1_4 = arg0;
		this.aLong129 = arg1;
	}

	@OriginalMember(owner = "client!jd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass95_Sub1_Sub1_4.method7306(this.aLong129);
		super.finalize();
	}
}
