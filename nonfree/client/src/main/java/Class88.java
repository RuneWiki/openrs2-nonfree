import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public final class Class88 {

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "Lclient!jaa;")
	private final Class14_Sub3 aClass14_Sub3_15;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
	public final int anInt2919;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!jaa;II)V")
	public Class88(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass14_Sub3_15 = arg0;
		this.anInt2919 = arg2;
	}

	@OriginalMember(owner = "client!fb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass14_Sub3_15.method3969(this.anInt2919);
		super.finalize();
	}
}
