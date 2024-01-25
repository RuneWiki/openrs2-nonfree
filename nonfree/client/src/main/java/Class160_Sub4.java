import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class160_Sub4 extends Class160 {

	@OriginalMember(owner = "client!us", name = "o", descriptor = "I")
	private final int anInt9575;

	@OriginalMember(owner = "client!us", name = "g", descriptor = "I")
	private final int anInt9567;

	@OriginalMember(owner = "client!us", name = "r", descriptor = "I")
	private final int anInt9578;

	@OriginalMember(owner = "client!us", name = "j", descriptor = "I")
	private final int anInt9570;

	@OriginalMember(owner = "client!us", name = "l", descriptor = "I")
	private final int anInt9572;

	@OriginalMember(owner = "client!us", name = "p", descriptor = "I")
	private final int anInt9576;

	@OriginalMember(owner = "client!us", name = "i", descriptor = "I")
	private final int anInt9569;

	@OriginalMember(owner = "client!us", name = "h", descriptor = "I")
	private final int anInt9568;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class160_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt9575 = arg0;
		this.anInt9567 = arg6;
		this.anInt9578 = arg5;
		this.anInt9570 = arg7;
		this.anInt9572 = arg2;
		this.anInt9576 = arg1;
		this.anInt9569 = arg3;
		this.anInt9568 = arg4;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt9575 * arg0 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt9576 >> 12;
		@Pc(28) int local28 = this.anInt9572 * arg0 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt9569 >> 12;
		@Pc(42) int local42 = this.anInt9568 * arg0 >> 12;
		@Pc(49) int local49 = arg1 * this.anInt9578 >> 12;
		@Pc(56) int local56 = this.anInt9567 * arg0 >> 12;
		@Pc(63) int local63 = this.anInt9570 * arg1 >> 12;
		Static556.method7706(local28, local10, local49, local63, super.anInt9562, local35, local17, local42, local56);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IZI)V")
	@Override
	public void method8041(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(III)V")
	@Override
	public void method8042(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
