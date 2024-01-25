import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public final class Class98_Sub1 extends Class98 {

	@OriginalMember(owner = "client!oda", name = "h", descriptor = "[I")
	public final int[] anIntArray536;

	@OriginalMember(owner = "client!oda", name = "g", descriptor = "[I")
	public final int[] anIntArray535;

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(II[I[I)V")
	public Class98_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray536 = arg2;
		this.anIntArray535 = arg3;
	}
}
