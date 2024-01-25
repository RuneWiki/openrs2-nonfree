import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "[I")
	public final int[] anIntArray171;

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "[I")
	public final int[] anIntArray170;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(II[I[I)V")
	public Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray171 = arg3;
		this.anIntArray170 = arg2;
	}
}
