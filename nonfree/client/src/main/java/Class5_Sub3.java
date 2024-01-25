import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
	private final int anInt2304;

	@OriginalMember(owner = "client!cn", name = "x", descriptor = "I")
	private final int anInt2312;

	@OriginalMember(owner = "client!cn", name = "E", descriptor = "I")
	private final int anInt2318;

	@OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
	private final int anInt2307;

	@OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
	private final int anInt2314;

	@OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
	private final int anInt2308;

	@OriginalMember(owner = "client!cn", name = "B", descriptor = "I")
	private final int anInt2315;

	@OriginalMember(owner = "client!cn", name = "C", descriptor = "I")
	private final int anInt2316;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt2304 = arg3;
		this.anInt2312 = arg4;
		this.anInt2318 = arg5;
		this.anInt2307 = arg6;
		this.anInt2314 = arg1;
		this.anInt2308 = arg2;
		this.anInt2315 = arg7;
		this.anInt2316 = arg0;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)V")
	@Override
	public void method6416(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt2316 * arg1 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt2314 >> 12;
		@Pc(24) int local24 = this.anInt2308 * arg1 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt2304 >> 12;
		@Pc(42) int local42 = arg1 * this.anInt2312 >> 12;
		@Pc(49) int local49 = this.anInt2318 * arg0 >> 12;
		@Pc(56) int local56 = arg1 * this.anInt2307 >> 12;
		@Pc(63) int local63 = this.anInt2315 * arg0 >> 12;
		Static311.method8379(local17, super.anInt7728, local24, local35, local10, local63, local49, local42, local56);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method6414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
