import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class17_Sub2 extends Class17 {

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "[I")
	public final int[] anIntArray150;

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "[I")
	public final int[] anIntArray151;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(II[I[I)V")
	public Class17_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray150 = arg3;
		this.anIntArray151 = arg2;
	}
}
