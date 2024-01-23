import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!bg", name = "A", descriptor = "I")
	private final int anInt391;

	@OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
	private final int anInt385;

	@OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
	private final int anInt383;

	@OriginalMember(owner = "client!bg", name = "D", descriptor = "I")
	private final int anInt394;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(IIIIIII)V")
	public Class14_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt391 = arg1;
		this.anInt385 = arg3;
		this.anInt383 = arg2;
		this.anInt394 = arg0;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(IBI)V")
	@Override
	public void method3211(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt383 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt394 >> 12;
		@Pc(32) int local32 = this.anInt391 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt385 * arg1 >> 12;
		Static195.method3539(super.anInt4048, local39, super.anInt4055, local17, local10, super.anInt4056, local32);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V")
	@Override
	public void method3207(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt383 * arg1 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt394 >> 12;
		@Pc(32) int local32 = this.anInt391 * arg0 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt385 >> 12;
		Static213.method1600(local25, local18, local32, local39, super.anInt4055);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBI)V")
	@Override
	public void method3208(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
