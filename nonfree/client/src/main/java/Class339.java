import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public final class Class339 {

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "Lclient!mr;")
	private final Class45_Sub2_Sub2 aClass45_Sub2_Sub2_12;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "J")
	public final long aLong250;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lclient!mr;J[Lclient!si;)V")
	public Class339(@OriginalArg(0) Class45_Sub2_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class311[] arg2) {
		this.aClass45_Sub2_Sub2_12 = arg0;
		this.aLong250 = arg1;
	}

	@OriginalMember(owner = "client!uj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass45_Sub2_Sub2_12.method5036(this.aLong250);
		super.finalize();
	}
}
