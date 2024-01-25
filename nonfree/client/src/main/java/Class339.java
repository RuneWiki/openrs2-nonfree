import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public final class Class339 {

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "I")
	public final int anInt9307;

	@OriginalMember(owner = "client!waa", name = "f", descriptor = "Lclient!mc;")
	private final Class121_Sub2_Sub1 aClass121_Sub2_Sub1_9;

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lclient!mc;II)V")
	public Class339(@OriginalArg(0) Class121_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9307 = arg2;
		this.aClass121_Sub2_Sub1_9 = arg0;
	}

	@OriginalMember(owner = "client!waa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass121_Sub2_Sub1_9.method4676(this.anInt9307);
		super.finalize();
	}
}
