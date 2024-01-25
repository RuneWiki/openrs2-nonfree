import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "[I")
	public final int[] anIntArray468;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "[I")
	public final int[] anIntArray466;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(II[I[I)V")
	public Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray468 = arg2;
		this.anIntArray466 = arg3;
	}
}
