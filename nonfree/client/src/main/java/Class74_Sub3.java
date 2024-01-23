import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class74_Sub3 extends Class74 {

	@OriginalMember(owner = "client!vh", name = "y", descriptor = "I")
	private int anInt5808;

	@OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
	private int anInt5801;

	@OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
	private int anInt5811;

	@OriginalMember(owner = "client!vh", name = "B", descriptor = "I")
	private int anInt5810;

	@OriginalMember(owner = "client!vh", name = "w", descriptor = "I")
	private int anInt5806;

	@OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
	private int anInt5809;

	@OriginalMember(owner = "client!vh", name = "x", descriptor = "I")
	private int anInt5807;

	@OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
	private int anInt5803;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class74_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt5808 = arg1;
		this.anInt5801 = arg6;
		this.anInt5811 = arg2;
		this.anInt5810 = arg3;
		this.anInt5806 = arg5;
		this.anInt5809 = arg4;
		this.anInt5807 = arg7;
		this.anInt5803 = arg0;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(III)V")
	@Override
	public void method4818(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
	@Override
	public void method4816(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5808 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt5803 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt5810 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt5811 >> 12;
		@Pc(38) int local38 = arg0 * this.anInt5809 >> 12;
		@Pc(45) int local45 = arg1 * this.anInt5806 >> 12;
		@Pc(56) int local56 = arg0 * this.anInt5801 >> 12;
		@Pc(63) int local63 = arg1 * this.anInt5807 >> 12;
		Static114.method1191(this.anInt6030, local17, local38, local63, local24, local10, local31, local56, local45);
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(III)V")
	@Override
	public void method4820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
