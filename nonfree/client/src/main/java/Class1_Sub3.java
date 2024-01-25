import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "[I")
	public final int[] anIntArray670;

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "[I")
	public final int[] anIntArray669;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(II[I[I)V")
	public Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray670 = arg3;
		this.anIntArray669 = arg2;
	}
}
