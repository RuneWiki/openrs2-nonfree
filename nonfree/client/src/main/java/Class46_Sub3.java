import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class46_Sub3 extends Class46 {

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
	private final int anInt6057;

	@OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
	private final int anInt6058;

	@OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
	private final int anInt6062;

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
	private final int anInt6060;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(IIIIIII)V")
	public Class46_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6057 = arg2;
		this.anInt6058 = arg3;
		this.anInt6062 = arg0;
		this.anInt6060 = arg1;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(III)V")
	@Override
	public void method5893(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt6062 * arg1 >> 12;
		@Pc(20) int local20 = this.anInt6057 * arg1 >> 12;
		@Pc(27) int local27 = this.anInt6060 * arg0 >> 12;
		@Pc(34) int local34 = arg0 * this.anInt6058 >> 12;
		Static449.method5791(local27, local20, local34, local10, super.anInt7292);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V")
	@Override
	public void method5892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt6062 * arg1 >> 12;
		@Pc(20) int local20 = this.anInt6057 * arg1 >> 12;
		@Pc(27) int local27 = arg0 * this.anInt6060 >> 12;
		@Pc(34) int local34 = this.anInt6058 * arg0 >> 12;
		Static335.method4398(super.anInt7287, local27, local20, local34, super.anInt7289, local13);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 * this.anInt6062 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt6057 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt6060 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt6058 >> 12;
		Static428.method5440(local35, local14, super.anInt7289, super.anInt7287, local28, super.anInt7292, local21);
	}
}
