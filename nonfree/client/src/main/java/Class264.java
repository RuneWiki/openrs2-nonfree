import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public final class Class264 {

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "Lclient!qo;")
	private final Class20_Sub3 aClass20_Sub3_28;

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
	public final int anInt8064;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!qo;II)V")
	public Class264(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass20_Sub3_28 = arg0;
		this.anInt8064 = arg2;
	}

	@OriginalMember(owner = "client!pl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass20_Sub3_28.method7352(this.anInt8064);
		super.finalize();
	}
}
