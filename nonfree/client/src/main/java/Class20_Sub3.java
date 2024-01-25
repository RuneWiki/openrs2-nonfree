import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public final class Class20_Sub3 extends Class20 {

	@OriginalMember(owner = "client!nu", name = "k", descriptor = "[I")
	public final int[] anIntArray453;

	@OriginalMember(owner = "client!nu", name = "g", descriptor = "[I")
	public final int[] anIntArray452;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(II[I[I)V")
	public Class20_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray453 = arg3;
		this.anIntArray452 = arg2;
	}
}
