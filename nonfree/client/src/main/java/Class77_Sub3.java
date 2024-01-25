import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class77_Sub3 extends Class77 {

	@OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
	private final int anInt4381;

	@OriginalMember(owner = "client!hs", name = "p", descriptor = "I")
	private final int anInt4387;

	@OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
	private final int anInt4384;

	@OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
	private final int anInt4382;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(IIIIII)V")
	public Class77_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt4381 = arg2;
		this.anInt4387 = arg1;
		this.anInt4384 = arg3;
		this.anInt4382 = arg0;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5253(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(IBI)V")
	@Override
	public void method5256(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt4382 >> 12;
		@Pc(17) int local17 = this.anInt4381 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt4387 >> 12;
		@Pc(31) int local31 = this.anInt4384 * arg1 >> 12;
		Static162.method3293(local17, local31, local10, super.anInt6157, local24);
	}
}
