import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public final class Class81 {

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "Lclient!qo;")
	private final Class20_Sub3 aClass20_Sub3_8;

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "J")
	public final long aLong70;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lclient!qo;J[Lclient!tba;)V")
	public Class81(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class324[] arg2) {
		this.aClass20_Sub3_8 = arg0;
		this.aLong70 = arg1;
	}

	@OriginalMember(owner = "client!dw", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass20_Sub3_8.method7356(this.aLong70);
		super.finalize();
	}
}
