import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class46_Sub1 extends Class46 {

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
	private final int anInt977;

	@OriginalMember(owner = "client!cu", name = "w", descriptor = "I")
	private final int anInt987;

	@OriginalMember(owner = "client!cu", name = "i", descriptor = "I")
	private final int anInt974;

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
	private final int anInt975;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(IIIIIII)V")
	public Class46_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt977 = arg0;
		this.anInt987 = arg2;
		this.anInt974 = arg3;
		this.anInt975 = arg1;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anInt977 * arg1 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt987 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt975 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt974 >> 12;
		Static263.method3651(super.anInt7289, local28, local35, super.anInt7287, local14, super.anInt7292, local21);
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(III)V")
	@Override
	public void method5893(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt977 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt987 >> 12;
		@Pc(30) int local30 = this.anInt975 * arg0 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt974 >> 12;
		Static361.method4702(local30, local37, local17, local10, super.anInt7292);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)V")
	@Override
	public void method5892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
