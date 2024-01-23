import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class44_Sub4 extends Class44 {

	@OriginalMember(owner = "client!u", name = "t", descriptor = "I")
	private int anInt4989;

	@OriginalMember(owner = "client!u", name = "p", descriptor = "I")
	private int anInt4985;

	@OriginalMember(owner = "client!u", name = "D", descriptor = "I")
	private int anInt4998;

	@OriginalMember(owner = "client!u", name = "s", descriptor = "I")
	private int anInt4988;

	@OriginalMember(owner = "client!u", name = "w", descriptor = "I")
	private int anInt4992;

	@OriginalMember(owner = "client!u", name = "A", descriptor = "I")
	private int anInt4996;

	@OriginalMember(owner = "client!u", name = "x", descriptor = "I")
	private int anInt4993;

	@OriginalMember(owner = "client!u", name = "F", descriptor = "I")
	private int anInt5000;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class44_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt4989 = arg4;
		this.anInt4985 = arg1;
		this.anInt4998 = arg7;
		this.anInt4988 = arg2;
		this.anInt4992 = arg0;
		this.anInt4996 = arg6;
		this.anInt4993 = arg5;
		this.anInt5000 = arg3;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V")
	@Override
	public void method4279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt4985 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt4992 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt4988 >> 12;
		@Pc(39) int local39 = this.anInt5000 * arg0 >> 12;
		@Pc(46) int local46 = arg1 * this.anInt4989 >> 12;
		@Pc(53) int local53 = this.anInt4996 * arg1 >> 12;
		@Pc(60) int local60 = this.anInt4993 * arg0 >> 12;
		@Pc(67) int local67 = arg0 * this.anInt4998 >> 12;
		Static237.method3671(local53, local60, local39, local46, this.anInt4984, local18, local67, local25, local32);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BII)V")
	@Override
	public void method4277(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(BII)V")
	@Override
	public void method4284(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
