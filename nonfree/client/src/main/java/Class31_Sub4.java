import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class31_Sub4 extends Class31 {

	@OriginalMember(owner = "client!v", name = "A", descriptor = "I")
	private int anInt5815;

	@OriginalMember(owner = "client!v", name = "l", descriptor = "I")
	private int anInt5800;

	@OriginalMember(owner = "client!v", name = "v", descriptor = "I")
	private int anInt5810;

	@OriginalMember(owner = "client!v", name = "m", descriptor = "I")
	private int anInt5801;

	@OriginalMember(owner = "client!v", name = "r", descriptor = "I")
	private int anInt5806;

	@OriginalMember(owner = "client!v", name = "k", descriptor = "I")
	private int anInt5799;

	@OriginalMember(owner = "client!v", name = "o", descriptor = "I")
	private int anInt5803;

	@OriginalMember(owner = "client!v", name = "u", descriptor = "I")
	private int anInt5809;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class31_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt5815 = arg4;
		this.anInt5800 = arg6;
		this.anInt5810 = arg1;
		this.anInt5801 = arg5;
		this.anInt5806 = arg3;
		this.anInt5799 = arg0;
		this.anInt5803 = arg7;
		this.anInt5809 = arg2;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BII)V")
	@Override
	public void method4431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IZI)V")
	@Override
	public void method4428(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt5799 * arg1 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt5810 >> 12;
		@Pc(24) int local24 = this.anInt5815 * arg1 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt5801 >> 12;
		@Pc(38) int local38 = arg1 * this.anInt5809 >> 12;
		@Pc(45) int local45 = this.anInt5800 * arg1 >> 12;
		@Pc(52) int local52 = this.anInt5806 * arg0 >> 12;
		@Pc(59) int local59 = this.anInt5803 * arg0 >> 12;
		Static48.method958(local31, local17, local59, local45, local24, local6, local38, this.anInt5797, local52);
	}
}
