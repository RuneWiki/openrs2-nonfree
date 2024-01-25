import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public final class Class32_Sub1 extends Class32 {

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "[I")
	public final int[] anIntArray73;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "[I")
	public final int[] anIntArray72;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(II[I[I)V")
	public Class32_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray73 = arg3;
		this.anIntArray72 = arg2;
	}
}
