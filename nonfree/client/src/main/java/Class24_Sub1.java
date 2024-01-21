import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class24_Sub1 extends Class24 {

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
	private final int anInt999;

	@OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
	private final int anInt1011;

	@OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
	private final int anInt1000;

	@OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
	private final int anInt1002;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(IIIIIII)V")
	public Class24_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt999 = arg2;
		this.anInt1011 = arg1;
		this.anInt1000 = arg0;
		this.anInt1002 = arg3;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZI)V")
	@Override
	public void method2999(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V")
	@Override
	public void method3002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt1000 * arg1 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt1011 >> 12;
		@Pc(29) int local29 = this.anInt1002 * arg0 >> 12;
		@Pc(36) int local36 = this.anInt999 * arg1 >> 12;
		Static76.method1072(local10, local29, super.anInt4288, super.anInt4280, local36, super.anInt4287, local17);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBI)V")
	@Override
	public void method3007(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt1000 * arg1 >> 12;
		@Pc(21) int local21 = arg0 * this.anInt1011 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt999 >> 12;
		@Pc(35) int local35 = this.anInt1002 * arg0 >> 12;
		Static63.method884(local10, local28, local21, local35, super.anInt4288);
	}
}
