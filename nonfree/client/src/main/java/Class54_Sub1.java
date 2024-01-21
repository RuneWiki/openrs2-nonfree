import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class54_Sub1 extends Class54 {

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
	private final int anInt2039;

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
	private final int anInt2035;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
	private final int anInt2037;

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
	private final int anInt2042;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(IIIIIII)V")
	public Class54_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2039 = arg0;
		this.anInt2035 = arg3;
		this.anInt2037 = arg2;
		this.anInt2042 = arg1;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(III)V")
	@Override
	public void method2770(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(III)V")
	@Override
	public void method2769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) int local20 = this.anInt2037 * arg0 >> 12;
		@Pc(27) int local27 = arg0 * this.anInt2039 >> 12;
		@Pc(34) int local34 = arg1 * this.anInt2035 >> 12;
		@Pc(41) int local41 = arg1 * this.anInt2042 >> 12;
		Static56.method953(local27, local34, super.anInt3666, local20, super.anInt3663, local41, super.anInt3669);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
	@Override
	public void method2767(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt2039 >> 12;
		@Pc(17) int local17 = this.anInt2042 * arg0 >> 12;
		@Pc(29) int local29 = this.anInt2037 * arg1 >> 12;
		@Pc(36) int local36 = this.anInt2035 * arg0 >> 12;
		Static157.method2388(local10, local29, local36, super.anInt3663, local17);
	}
}
