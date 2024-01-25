import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class104_Sub2 extends Class104 {

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
	private final int anInt4279;

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
	private final int anInt4286;

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
	private final int anInt4285;

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
	private final int anInt4280;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(IIIIII)V")
	public Class104_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt4279 = arg2;
		this.anInt4286 = arg3;
		this.anInt4285 = arg0;
		this.anInt4280 = arg1;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)V")
	@Override
	public void method5080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZII)V")
	@Override
	public void method5079(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BII)V")
	@Override
	public void method5084(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt4285 * arg1 >> 12;
		@Pc(25) int local25 = this.anInt4279 * arg1 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt4280 >> 12;
		@Pc(39) int local39 = this.anInt4286 * arg0 >> 12;
		Static160.method2671(local18, local32, super.anInt5807, local39, local25);
	}
}
