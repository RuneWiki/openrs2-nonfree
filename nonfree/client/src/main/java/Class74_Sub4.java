import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class74_Sub4 extends Class74 {

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
	private final int anInt8761;

	@OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
	private final int anInt8756;

	@OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
	private final int anInt8757;

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
	private final int anInt8759;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(IIIIIII)V")
	public Class74_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt8761 = arg0;
		this.anInt8756 = arg2;
		this.anInt8757 = arg3;
		this.anInt8759 = arg1;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)V")
	@Override
	public void method7570(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anInt8761 * arg1 >> 12;
		@Pc(22) int local22 = this.anInt8756 * arg1 >> 12;
		@Pc(29) int local29 = this.anInt8759 * arg0 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt8757 >> 12;
		Static242.method4049(local29, local22, local15, super.anInt8750, local36);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7572(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt8761 * arg1 >> 12;
		@Pc(25) int local25 = this.anInt8756 * arg1 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt8759 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt8757 >> 12;
		Static681.method9396(local25, super.anInt8749, local39, super.anInt8751, local10, local32);
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(III)V")
	@Override
	public void method7574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) int local20 = arg0 * this.anInt8761 >> 12;
		@Pc(27) int local27 = arg0 * this.anInt8756 >> 12;
		@Pc(34) int local34 = arg1 * this.anInt8759 >> 12;
		@Pc(41) int local41 = arg1 * this.anInt8757 >> 12;
		Static683.method9419(local41, super.anInt8750, super.anInt8749, local20, local27, super.anInt8751, local34);
	}
}
