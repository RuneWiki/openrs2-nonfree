import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public final class Class357 {

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "I")
	public final int anInt9525;

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "Lclient!tba;")
	private final Class78_Sub1_Sub2 aClass78_Sub1_Sub2_12;

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Lclient!tba;II)V")
	public Class357(@OriginalArg(0) Class78_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9525 = arg2;
		this.aClass78_Sub1_Sub2_12 = arg0;
	}

	@OriginalMember(owner = "client!wda", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass78_Sub1_Sub2_12.method6992(this.anInt9525);
		super.finalize();
	}
}
