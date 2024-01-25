import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "[I")
	public final int[] anIntArray456;

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "[I")
	public final int[] anIntArray458;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(II[I[I)V")
	public Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray456 = arg3;
		this.anIntArray458 = arg2;
	}
}
