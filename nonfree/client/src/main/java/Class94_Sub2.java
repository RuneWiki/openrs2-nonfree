import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class94_Sub2 extends Class94 {

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
	private int anInt2765;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
	private int anInt2760;

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
	private int anInt2767;

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
	private int anInt2763;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(IIIIIII)V")
	public Class94_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2765 = arg2;
		this.anInt2760 = arg0;
		this.anInt2767 = arg1;
		this.anInt2763 = arg3;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIB)V")
	@Override
	public void method2966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 * this.anInt2760 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt2765 >> 12;
		@Pc(28) int local28 = this.anInt2767 * arg0 >> 12;
		@Pc(35) int local35 = this.anInt2763 * arg0 >> 12;
		Static17.method277(local28, this.anInt3373, local21, local14, this.anInt3366, this.anInt3369, local35);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZI)V")
	@Override
	public void method2965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBI)V")
	@Override
	public void method2964(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 * this.anInt2765 >> 12;
		@Pc(23) int local23 = this.anInt2767 * arg0 >> 12;
		@Pc(30) int local30 = this.anInt2760 * arg1 >> 12;
		@Pc(37) int local37 = this.anInt2763 * arg0 >> 12;
		Static21.method439(local16, local23, local30, this.anInt3369, local37);
	}
}
