import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class160_Sub3 extends Class160 {

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
	private final int anInt8457;

	@OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
	private final int anInt8461;

	@OriginalMember(owner = "client!rt", name = "o", descriptor = "I")
	private final int anInt8462;

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
	private final int anInt8454;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(IIIIIII)V")
	public Class160_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt8457 = arg2;
		this.anInt8461 = arg1;
		this.anInt8462 = arg3;
		this.anInt8454 = arg0;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)V")
	@Override
	public void method8042(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt8454 * arg1 >> 12;
		@Pc(23) int local23 = arg1 * this.anInt8457 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt8461 >> 12;
		@Pc(37) int local37 = this.anInt8462 * arg0 >> 12;
		Static580.method8026(local37, super.anInt9564, super.anInt9562, super.anInt9565, local30, local23, local10);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZI)V")
	@Override
	public void method8041(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt8454 * arg0 >> 12;
		@Pc(23) int local23 = this.anInt8457 * arg0 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt8461 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt8462 >> 12;
		Static473.method6795(local37, super.anInt9565, local23, local30, local10);
	}
}
