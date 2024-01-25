import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class35_Sub1 extends Class35 {

	@OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
	private final int anInt959;

	@OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
	private final int anInt956;

	@OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
	private final int anInt955;

	@OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
	private final int anInt960;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IIIIIII)V")
	public Class35_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt959 = arg1;
		this.anInt956 = arg0;
		this.anInt955 = arg3;
		this.anInt960 = arg2;
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(III)V")
	@Override
	public void method5622(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V")
	@Override
	public void method5617(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt956 * arg1 >> 12;
		@Pc(21) int local21 = this.anInt960 * arg1 >> 12;
		@Pc(28) int local28 = this.anInt959 * arg0 >> 12;
		@Pc(35) int local35 = this.anInt955 * arg0 >> 12;
		Static217.method5719(super.anInt6706, local14, local35, local28, local21);
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(III)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) int local20 = arg0 * this.anInt956 >> 12;
		@Pc(27) int local27 = this.anInt960 * arg0 >> 12;
		@Pc(34) int local34 = this.anInt959 * arg1 >> 12;
		@Pc(41) int local41 = arg1 * this.anInt955 >> 12;
		Static350.method5693(local27, local34, super.anInt6706, super.anInt6704, local20, super.anInt6699, local41);
	}
}
