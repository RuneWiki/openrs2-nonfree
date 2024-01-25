import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class71_Sub4 extends Class71 {

	@OriginalMember(owner = "client!qs", name = "x", descriptor = "I")
	private final int anInt8481;

	@OriginalMember(owner = "client!qs", name = "t", descriptor = "I")
	private final int anInt8477;

	@OriginalMember(owner = "client!qs", name = "w", descriptor = "I")
	private final int anInt8480;

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "I")
	private final int anInt8473;

	@OriginalMember(owner = "client!qs", name = "v", descriptor = "I")
	private final int anInt8479;

	@OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
	private final int anInt8469;

	@OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
	private final int anInt8474;

	@OriginalMember(owner = "client!qs", name = "u", descriptor = "I")
	private final int anInt8478;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class71_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt8481 = arg1;
		this.anInt8477 = arg5;
		this.anInt8480 = arg0;
		this.anInt8473 = arg7;
		this.anInt8479 = arg4;
		this.anInt8469 = arg2;
		this.anInt8474 = arg6;
		this.anInt8478 = arg3;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)V")
	@Override
	public void method6988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BII)V")
	@Override
	public void method6990(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt8480 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt8481 >> 12;
		@Pc(24) int local24 = this.anInt8469 * arg0 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt8478 >> 12;
		@Pc(38) int local38 = this.anInt8479 * arg0 >> 12;
		@Pc(45) int local45 = arg1 * this.anInt8477 >> 12;
		@Pc(52) int local52 = arg0 * this.anInt8474 >> 12;
		@Pc(59) int local59 = this.anInt8473 * arg1 >> 12;
		Static630.method8538(local45, local24, local59, local52, local17, local38, super.anInt8466, local31, local10);
	}
}
