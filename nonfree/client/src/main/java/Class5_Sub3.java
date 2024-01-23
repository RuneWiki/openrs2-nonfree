import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!kc", name = "B", descriptor = "I")
	private int anInt2758;

	@OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
	private int anInt2765;

	@OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
	private int anInt2756;

	@OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
	private int anInt2760;

	@OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
	private int anInt2759;

	@OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
	private int anInt2763;

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
	private int anInt2752;

	@OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
	private int anInt2766;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt2758 = arg3;
		this.anInt2765 = arg1;
		this.anInt2756 = arg4;
		this.anInt2760 = arg6;
		this.anInt2759 = arg5;
		this.anInt2763 = arg2;
		this.anInt2752 = arg7;
		this.anInt2766 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V")
	@Override
	public void method2328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIB)V")
	@Override
	public void method2331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 * this.anInt2766 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt2765 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt2758 >> 12;
		@Pc(39) int local39 = this.anInt2763 * arg0 >> 12;
		@Pc(46) int local46 = arg1 * this.anInt2759 >> 12;
		@Pc(53) int local53 = arg0 * this.anInt2756 >> 12;
		@Pc(60) int local60 = arg0 * this.anInt2760 >> 12;
		@Pc(67) int local67 = arg1 * this.anInt2752 >> 12;
		Static188.method4640(local67, local17, local39, local6, local46, this.anInt2885, local53, local60, local24);
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(III)V")
	@Override
	public void method2334(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
