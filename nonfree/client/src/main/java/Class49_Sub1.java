import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public final class Class49_Sub1 extends Class49 {

	@OriginalMember(owner = "client!d", name = "n", descriptor = "[I")
	public final int[] anIntArray103;

	@OriginalMember(owner = "client!d", name = "j", descriptor = "[I")
	public final int[] anIntArray102;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(II[I[I)V")
	public Class49_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray103 = arg3;
		this.anIntArray102 = arg2;
	}
}
