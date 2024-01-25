import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public final class Class82 {

	@OriginalMember(owner = "client!eaa", name = "g", descriptor = "Lclient!mba;")
	private final Class5_Sub1_Sub2 aClass5_Sub1_Sub2_1;

	@OriginalMember(owner = "client!eaa", name = "j", descriptor = "J")
	public final long aLong49;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lclient!mba;J[Lclient!ms;)V")
	public Class82(@OriginalArg(0) Class5_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class224[] arg2) {
		this.aClass5_Sub1_Sub2_1 = arg0;
		this.aLong49 = arg1;
	}

	@OriginalMember(owner = "client!eaa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass5_Sub1_Sub2_1.method5698(this.aLong49);
		super.finalize();
	}
}
