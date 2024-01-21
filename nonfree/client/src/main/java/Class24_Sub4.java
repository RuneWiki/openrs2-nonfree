import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class24_Sub4 extends Class24 {

	@OriginalMember(owner = "client!w", name = "O", descriptor = "I")
	private final int anInt4302;

	@OriginalMember(owner = "client!w", name = "N", descriptor = "I")
	private final int anInt4301;

	@OriginalMember(owner = "client!w", name = "Q", descriptor = "I")
	private final int anInt4304;

	@OriginalMember(owner = "client!w", name = "z", descriptor = "I")
	private final int anInt4291;

	@OriginalMember(owner = "client!w", name = "I", descriptor = "I")
	private final int anInt4298;

	@OriginalMember(owner = "client!w", name = "F", descriptor = "I")
	private final int anInt4296;

	@OriginalMember(owner = "client!w", name = "B", descriptor = "I")
	private final int anInt4293;

	@OriginalMember(owner = "client!w", name = "x", descriptor = "I")
	private final int anInt4289;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class24_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt4302 = arg7;
		this.anInt4301 = arg0;
		this.anInt4304 = arg3;
		this.anInt4291 = arg4;
		this.anInt4298 = arg5;
		this.anInt4296 = arg6;
		this.anInt4293 = arg2;
		this.anInt4289 = arg1;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IZI)V")
	@Override
	public void method2999(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt4301 >> 12;
		@Pc(17) int local17 = this.anInt4293 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt4304 * arg1 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt4289 >> 12;
		@Pc(38) int local38 = this.anInt4291 * arg0 >> 12;
		@Pc(50) int local50 = this.anInt4296 * arg0 >> 12;
		@Pc(57) int local57 = this.anInt4298 * arg1 >> 12;
		@Pc(64) int local64 = this.anInt4302 * arg1 >> 12;
		Static138.method2055(super.anInt4287, local50, local57, local10, local64, local17, local38, local31, local24);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IBI)V")
	@Override
	public void method3007(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V")
	@Override
	public void method3002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
