import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public final class Class208 {

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
	public final int anInt5618;

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "Lclient!pi;")
	private final Class144_Sub3 aClass144_Sub3_20;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!pi;II)V")
	public Class208(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5618 = arg2;
		this.aClass144_Sub3_20 = arg0;
	}

	@OriginalMember(owner = "client!ko", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass144_Sub3_20.method7013(this.anInt5618);
		super.finalize();
	}
}
