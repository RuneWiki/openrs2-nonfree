import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
	private final int anInt802;

	@OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
	private final int anInt799;

	@OriginalMember(owner = "client!cf", name = "C", descriptor = "I")
	private final int anInt800;

	@OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
	private final int anInt801;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(IIIIIII)V")
	public Class5_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt802 = arg1;
		this.anInt799 = arg0;
		this.anInt800 = arg3;
		this.anInt801 = arg2;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BII)V")
	@Override
	public void method2104(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt799 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt801 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt802 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt800 >> 12;
		Static88.method1495(local24, super.anInt2783, local10, local17, local31);
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(BII)V")
	@Override
	public void method2105(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V")
	@Override
	public void method2102(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = this.anInt799 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt801 * arg0 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt800 >> 12;
		@Pc(38) int local38 = this.anInt802 * arg1 >> 12;
		Static165.method2843(super.anInt2786, super.anInt2782, local24, local17, super.anInt2783, local38, local31);
	}
}
