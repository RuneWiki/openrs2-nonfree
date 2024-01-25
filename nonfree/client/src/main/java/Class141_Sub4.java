import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class141_Sub4 extends Class141 {

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
	private final int anInt8965;

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
	private final int anInt8960;

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
	private final int anInt8963;

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
	private final int anInt8958;

	@OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
	private final int anInt8971;

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
	private final int anInt8969;

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
	private final int anInt8968;

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
	private final int anInt8964;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class141_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt8965 = arg0;
		this.anInt8960 = arg2;
		this.anInt8963 = arg3;
		this.anInt8958 = arg7;
		this.anInt8971 = arg4;
		this.anInt8969 = arg6;
		this.anInt8968 = arg5;
		this.anInt8964 = arg1;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BII)V")
	@Override
	public void method7715(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)V")
	@Override
	public void method7719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt8965 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt8964 >> 12;
		@Pc(32) int local32 = this.anInt8960 * arg1 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt8963 >> 12;
		@Pc(46) int local46 = arg1 * this.anInt8971 >> 12;
		@Pc(53) int local53 = this.anInt8968 * arg0 >> 12;
		@Pc(60) int local60 = this.anInt8969 * arg1 >> 12;
		@Pc(67) int local67 = this.anInt8958 * arg0 >> 12;
		Static579.method8208(local39, local53, local46, local32, super.anInt8951, local10, local67, local25, local60);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7716(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
