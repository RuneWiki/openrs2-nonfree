import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class74_Sub3 extends Class74 {

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
	private final int anInt5837;

	@OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
	private final int anInt5836;

	@OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
	private final int anInt5830;

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
	private final int anInt5832;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(IIIIIII)V")
	public Class74_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5837 = arg3;
		this.anInt5836 = arg1;
		this.anInt5830 = arg0;
		this.anInt5832 = arg2;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)V")
	@Override
	public void method7570(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.anInt5830 * arg1 >> 12;
		@Pc(27) int local27 = arg1 * this.anInt5832 >> 12;
		@Pc(34) int local34 = this.anInt5836 * arg0 >> 12;
		@Pc(41) int local41 = this.anInt5837 * arg0 >> 12;
		Static495.method7458(super.anInt8750, local20, local34, local27, local41);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7572(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(III)V")
	@Override
	public void method7574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt5830 * arg0 >> 12;
		@Pc(27) int local27 = this.anInt5832 * arg0 >> 12;
		@Pc(34) int local34 = arg1 * this.anInt5836 >> 12;
		@Pc(41) int local41 = this.anInt5837 * arg1 >> 12;
		Static178.method2631(local27, local10, super.anInt8751, local41, super.anInt8749, super.anInt8750, local34);
	}
}
