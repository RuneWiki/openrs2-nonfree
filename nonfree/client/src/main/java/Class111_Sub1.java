import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class111_Sub1 extends Class111 {

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
	private final int anInt3250;

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
	private final int anInt3256;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	private final int anInt3253;

	@OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
	private final int anInt3258;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIIII)V")
	public Class111_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3250 = arg3;
		this.anInt3256 = arg0;
		this.anInt3253 = arg2;
		this.anInt3258 = arg1;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)V")
	@Override
	public void method7711(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt3256 * arg0 >> 12;
		@Pc(21) int local21 = arg0 * this.anInt3253 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt3258 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt3250 >> 12;
		Static518.method6896(local28, local21, local35, local10, super.anInt9309);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7714(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt3256 >> 12;
		@Pc(17) int local17 = this.anInt3253 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt3258 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt3250 >> 12;
		Static134.method2612(local35, local10, super.anInt9309, local24, super.anInt9310, super.anInt9311, local17);
	}
}
