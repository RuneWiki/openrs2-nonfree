import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class18_Sub2 extends Class18 {

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
	private final int anInt1408;

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
	private final int anInt1410;

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
	private final int anInt1407;

	@OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
	private final int anInt1411;

	static {
		new Class102("", 76);
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(IIIIIII)V")
	public Class18_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1408 = arg0;
		this.anInt1410 = arg3;
		this.anInt1407 = arg2;
		this.anInt1411 = arg1;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZI)V")
	@Override
	public void method2847(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt1408 >> 12;
		@Pc(17) int local17 = this.anInt1407 * arg1 >> 12;
		@Pc(29) int local29 = this.anInt1411 * arg0 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt1410 >> 12;
		Static210.method3963(local29, super.anInt3162, local10, local36, super.anInt3161, local17);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BII)V")
	@Override
	public void method2850(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt1408 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt1407 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt1411 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt1410 >> 12;
		Static307.method5141(local10, local36, local17, super.anInt3164, local29);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)V")
	@Override
	public void method2849(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * this.anInt1408 >> 12;
		@Pc(21) int local21 = this.anInt1407 * arg0 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt1411 >> 12;
		@Pc(35) int local35 = this.anInt1410 * arg1 >> 12;
		Static80.method1630(local21, super.anInt3162, super.anInt3164, local28, local35, super.anInt3161, local14);
	}
}
