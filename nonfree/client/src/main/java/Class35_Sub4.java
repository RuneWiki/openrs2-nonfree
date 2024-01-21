import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class35_Sub4 extends Class35 {

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
	private final int anInt4076;

	@OriginalMember(owner = "client!vi", name = "H", descriptor = "I")
	private final int anInt4088;

	@OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
	private final int anInt4077;

	@OriginalMember(owner = "client!vi", name = "E", descriptor = "I")
	private final int anInt4085;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(IIIIIII)V")
	public Class35_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4076 = arg1;
		this.anInt4088 = arg0;
		this.anInt4077 = arg3;
		this.anInt4085 = arg2;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIB)V")
	@Override
	public void method3111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)V")
	@Override
	public void method3115(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt4085 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt4088 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt4076 >> 12;
		@Pc(39) int local39 = this.anInt4077 * arg1 >> 12;
		Static161.method226(local25, super.anInt4071, local32, local10, super.anInt4073, super.anInt4070, local39);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZII)V")
	@Override
	public void method3114(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt4088 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt4076 >> 12;
		@Pc(28) int local28 = this.anInt4085 * arg0 >> 12;
		@Pc(35) int local35 = this.anInt4077 * arg1 >> 12;
		Static131.method2188(local17, local10, local28, super.anInt4070, local35);
	}
}
