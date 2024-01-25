import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class Class64_Sub1 extends Class64 {

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "[I")
	public final int[] anIntArray246;

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "[I")
	public final int[] anIntArray247;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(II[I[I)V")
	public Class64_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray246 = arg2;
		this.anIntArray247 = arg3;
	}
}
