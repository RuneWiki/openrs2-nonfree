import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class53_Sub1 extends Class53 {

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
	private final int anInt1822;

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
	private final int anInt1826;

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
	private final int anInt1821;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
	private final int anInt1824;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(IIIIII)V")
	public Class53_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt1822 = arg0;
		this.anInt1826 = arg1;
		this.anInt1821 = arg3;
		this.anInt1824 = arg2;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8322(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(III)V")
	@Override
	public void method8329(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt1822 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt1824 >> 12;
		@Pc(24) int local24 = this.anInt1826 * arg1 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt1821 >> 12;
		Static499.method6053(local31, super.anInt9772, local24, local10, local17);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V")
	@Override
	public void method8328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
