import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "[I")
	public final int[] anIntArray94;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "[I")
	public final int[] anIntArray93;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(II[I[I)V")
	public Class10_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray94 = arg3;
		this.anIntArray93 = arg2;
	}
}
