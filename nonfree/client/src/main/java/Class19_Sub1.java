import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!ar", name = "f", descriptor = "[I")
	public final int[] anIntArray55;

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "[I")
	public final int[] anIntArray54;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(II[I[I)V")
	public Class19_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray55 = arg2;
		this.anIntArray54 = arg3;
	}
}
