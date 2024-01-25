import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public final class Class62_Sub1 extends Class62 {

	@OriginalMember(owner = "client!pt", name = "k", descriptor = "[I")
	public final int[] anIntArray443;

	@OriginalMember(owner = "client!pt", name = "j", descriptor = "[I")
	public final int[] anIntArray442;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(II[I[I)V")
	public Class62_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray443 = arg2;
		this.anIntArray442 = arg3;
	}
}
