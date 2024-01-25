import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class51_Sub3 extends Class51 {

	@OriginalMember(owner = "client!rr", name = "m", descriptor = "I")
	private final int anInt5853;

	@OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
	private final int anInt5857;

	@OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
	private final int anInt5858;

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
	private final int anInt5852;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(IIIIIII)V")
	public Class51_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5853 = arg1;
		this.anInt5857 = arg3;
		this.anInt5858 = arg0;
		this.anInt5852 = arg2;
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(III)V")
	@Override
	public void method5809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt5858 >> 12;
		@Pc(17) int local17 = this.anInt5852 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt5853 * arg1 >> 12;
		@Pc(34) int local34 = arg1 * this.anInt5857 >> 12;
		Static197.method2847(super.anInt7226, local10, local24, local17, local34);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(III)V")
	@Override
	public void method5807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt5858 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt5852 >> 12;
		@Pc(24) int local24 = this.anInt5853 * arg1 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt5857 >> 12;
		Static398.method4983(super.anInt7228, local31, super.anInt7226, super.anInt7223, local24, local10, local17);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5810(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
