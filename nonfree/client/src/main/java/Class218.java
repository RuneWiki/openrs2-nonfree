import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public final class Class218 {

	@OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
	public final int anInt6950;

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "Lclient!ji;")
	private final Class15_Sub3 aClass15_Sub3_24;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!ji;II)V")
	public Class218(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6950 = arg2;
		this.aClass15_Sub3_24 = arg0;
	}

	@OriginalMember(owner = "client!mt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass15_Sub3_24.method4412(this.anInt6950);
		super.finalize();
	}
}
