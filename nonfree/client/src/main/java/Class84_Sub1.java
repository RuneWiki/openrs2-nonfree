import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public final class Class84_Sub1 extends Class84 {

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "[I")
	public final int[] anIntArray480;

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "[I")
	public final int[] anIntArray481;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(II[I[I)V")
	public Class84_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray480 = arg2;
		this.anIntArray481 = arg3;
	}
}
