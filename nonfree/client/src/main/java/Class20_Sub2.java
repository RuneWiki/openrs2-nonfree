import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public abstract class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
	protected int anInt9297;

	@OriginalMember(owner = "client!bq", name = "p", descriptor = "I")
	protected final int anInt9300;

	@OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
	public final int anInt9299;

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
	protected int anInt9298;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(IIII)V")
	protected Class20_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9297 = arg2;
		this.anInt9300 = arg1;
		this.anInt9299 = arg3;
		this.anInt9298 = arg0;
	}
}
