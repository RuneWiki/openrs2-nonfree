import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public final class Class93_Sub2 extends Class93 {

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "[I")
	public final int[] anIntArray452;

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "[I")
	public final int[] anIntArray453;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(II[I[I)V")
	public Class93_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray452 = arg2;
		this.anIntArray453 = arg3;
	}
}
