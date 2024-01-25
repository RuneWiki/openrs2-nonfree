import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class62_Sub4 extends Class62 {

	@OriginalMember(owner = "client!su", name = "m", descriptor = "I")
	private final int anInt8337;

	@OriginalMember(owner = "client!su", name = "r", descriptor = "I")
	private final int anInt8342;

	@OriginalMember(owner = "client!su", name = "j", descriptor = "I")
	private final int anInt8335;

	@OriginalMember(owner = "client!su", name = "i", descriptor = "I")
	private final int anInt8334;

	@OriginalMember(owner = "client!su", name = "t", descriptor = "I")
	private final int anInt8344;

	@OriginalMember(owner = "client!su", name = "o", descriptor = "I")
	private final int anInt8339;

	@OriginalMember(owner = "client!su", name = "p", descriptor = "I")
	private final int anInt8340;

	@OriginalMember(owner = "client!su", name = "n", descriptor = "I")
	private final int anInt8338;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class62_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt8337 = arg0;
		this.anInt8342 = arg2;
		this.anInt8335 = arg6;
		this.anInt8334 = arg3;
		this.anInt8344 = arg4;
		this.anInt8339 = arg5;
		this.anInt8340 = arg7;
		this.anInt8338 = arg1;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6732(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(III)V")
	@Override
	public void method6731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(III)V")
	@Override
	public void method6729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt8337 * arg0 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt8338 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt8342 >> 12;
		@Pc(31) int local31 = this.anInt8334 * arg1 >> 12;
		@Pc(38) int local38 = arg0 * this.anInt8344 >> 12;
		@Pc(45) int local45 = arg1 * this.anInt8339 >> 12;
		@Pc(56) int local56 = this.anInt8335 * arg0 >> 12;
		@Pc(63) int local63 = this.anInt8340 * arg1 >> 12;
		Static387.method5583(local63, local17, local10, super.anInt8330, local45, local56, local38, local24, local31);
	}
}
