import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public final class Class324 {

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "Lclient!qo;")
	private final Class20_Sub3 aClass20_Sub3_36;

	@OriginalMember(owner = "client!tba", name = "f", descriptor = "J")
	public final long aLong238;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lclient!qo;JI)V")
	public Class324(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass20_Sub3_36 = arg0;
		this.aLong238 = arg1;
	}

	@OriginalMember(owner = "client!tba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass20_Sub3_36.method7356(this.aLong238);
		super.finalize();
	}
}
