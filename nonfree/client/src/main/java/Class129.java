import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public final class Class129 {

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "J")
	public final long aLong103;

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "Lclient!rl;")
	private final Class66_Sub2 aClass66_Sub2_20;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!rl;J[Lclient!mt;)V")
	public Class129(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class168[] arg2) {
		this.aLong103 = arg1;
		this.aClass66_Sub2_20 = arg0;
	}

	@OriginalMember(owner = "client!jh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass66_Sub2_20.method5096(this.aLong103);
		super.finalize();
	}
}
