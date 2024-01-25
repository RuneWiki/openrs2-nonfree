import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class9_Sub4 extends Class9 {

	@OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
	private final int anInt8572;

	@OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
	private final int anInt8570;

	@OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
	private final int anInt8574;

	@OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
	private final int anInt8573;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(IIIIII)V")
	public Class9_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt8572 = arg0;
		this.anInt8570 = arg1;
		this.anInt8574 = arg3;
		this.anInt8573 = arg2;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V")
	@Override
	public void method7306(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt8572 * arg0 >> 12;
		@Pc(25) int local25 = this.anInt8573 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt8570 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt8574 * arg1 >> 12;
		Static238.method3724(local10, local32, super.anInt8564, local39, local25);
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(IIB)V")
	@Override
	public void method7305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
