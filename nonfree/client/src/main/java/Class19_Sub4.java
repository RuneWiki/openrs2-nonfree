import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uba")
public final class Class19_Sub4 extends Class19 {

	@OriginalMember(owner = "client!uba", name = "o", descriptor = "I")
	private final int anInt8871;

	@OriginalMember(owner = "client!uba", name = "q", descriptor = "I")
	private final int anInt8873;

	@OriginalMember(owner = "client!uba", name = "r", descriptor = "I")
	private final int anInt8874;

	@OriginalMember(owner = "client!uba", name = "v", descriptor = "I")
	private final int anInt8878;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(IIIIIII)V")
	public Class19_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt8871 = arg3;
		this.anInt8873 = arg2;
		this.anInt8874 = arg0;
		this.anInt8878 = arg1;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7060(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt8874 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt8873 >> 12;
		@Pc(29) int local29 = this.anInt8878 * arg1 >> 12;
		@Pc(36) int local36 = this.anInt8871 * arg1 >> 12;
		Static544.method5972(super.anInt8864, local36, local29, local17, local10);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt8874 >> 12;
		@Pc(23) int local23 = arg1 * this.anInt8873 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt8878 >> 12;
		@Pc(37) int local37 = this.anInt8871 * arg0 >> 12;
		Static469.method6537(local37, super.anInt8861, local23, local10, super.anInt8860, local30);
	}

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(III)V")
	@Override
	public void method7064(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt8874 >> 12;
		@Pc(17) int local17 = this.anInt8873 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt8878 >> 12;
		@Pc(39) int local39 = this.anInt8871 * arg1 >> 12;
		Static77.method1112(super.anInt8864, local10, local32, super.anInt8861, local17, local39, super.anInt8860);
	}
}
