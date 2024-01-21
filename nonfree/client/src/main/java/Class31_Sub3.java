import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class31_Sub3 extends Class31 {

	@OriginalMember(owner = "client!me", name = "q", descriptor = "I")
	private final int anInt2483;

	@OriginalMember(owner = "client!me", name = "r", descriptor = "I")
	private final int anInt2484;

	@OriginalMember(owner = "client!me", name = "t", descriptor = "I")
	private final int anInt2485;

	@OriginalMember(owner = "client!me", name = "z", descriptor = "I")
	private final int anInt2488;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(IIIIIII)V")
	public Class31_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2483 = arg3;
		this.anInt2484 = arg0;
		this.anInt2485 = arg2;
		this.anInt2488 = arg1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V")
	@Override
	public void method2817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIB)V")
	@Override
	public void method2821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt2484 >> 12;
		@Pc(25) int local25 = this.anInt2485 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt2488 >> 12;
		@Pc(39) int local39 = this.anInt2483 * arg1 >> 12;
		Static88.method1280(local32, local39, super.anInt3940, local25, super.anInt3936, super.anInt3938, local18);
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(III)V")
	@Override
	public void method2819(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2488 >> 12;
		@Pc(17) int local17 = this.anInt2483 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt2485 * arg1 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt2484 >> 12;
		Static104.method1562(local31, local24, local10, super.anInt3938, local17);
	}
}
