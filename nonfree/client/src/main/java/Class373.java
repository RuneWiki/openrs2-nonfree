import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public final class Class373 {

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "J")
	public final long aLong276;

	@OriginalMember(owner = "client!wga", name = "c", descriptor = "Lclient!sb;")
	private final Class95_Sub3_Sub2 aClass95_Sub3_Sub2_12;

	@OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Lclient!sb;J[Lclient!jr;)V")
	public Class373(@OriginalArg(0) Class95_Sub3_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class176[] arg2) {
		this.aLong276 = arg1;
		this.aClass95_Sub3_Sub2_12 = arg0;
	}

	@OriginalMember(owner = "client!wga", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass95_Sub3_Sub2_12.method7155(this.aLong276);
		super.finalize();
	}
}
