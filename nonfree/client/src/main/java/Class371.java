import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public final class Class371 {

	@OriginalMember(owner = "client!v", name = "h", descriptor = "I")
	public final int anInt9907;

	@OriginalMember(owner = "client!v", name = "e", descriptor = "Lclient!ml;")
	private final Class75_Sub3 aClass75_Sub3_40;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!ml;II)V")
	public Class371(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9907 = arg2;
		this.aClass75_Sub3_40 = arg0;
	}

	@OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass75_Sub3_40.method5820(this.anInt9907);
		super.finalize();
	}
}
