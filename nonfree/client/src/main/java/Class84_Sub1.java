import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public final class Class84_Sub1 extends Class84 {

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "[I")
	public final int[] anIntArray167;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "[I")
	public final int[] anIntArray166;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(II[I[I)V")
	public Class84_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray167 = arg2;
		this.anIntArray166 = arg3;
	}
}
