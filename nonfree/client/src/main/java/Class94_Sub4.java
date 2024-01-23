import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class94_Sub4 extends Class94 {

	@OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
	private int anInt3386;

	@OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
	private int anInt3383;

	@OriginalMember(owner = "client!mk", name = "B", descriptor = "I")
	private int anInt3389;

	@OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
	private int anInt3388;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(IIIIIII)V")
	public Class94_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3386 = arg0;
		this.anInt3383 = arg3;
		this.anInt3389 = arg2;
		this.anInt3388 = arg1;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZI)V")
	@Override
	public void method2965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg0 * this.anInt3386 >> 12;
		@Pc(17) int local17 = this.anInt3389 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt3388 * arg1 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt3383 >> 12;
		Static255.method3999(local6, local17, this.anInt3373, local31, local24, this.anInt3366);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIB)V")
	@Override
	public void method2966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt3386 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt3388 >> 12;
		@Pc(24) int local24 = this.anInt3383 * arg0 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt3389 >> 12;
		Static104.method1985(local31, local17, this.anInt3366, local10, this.anInt3369, local24, this.anInt3373);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IBI)V")
	@Override
	public void method2964(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt3386 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt3389 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt3388 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt3383 >> 12;
		Static79.method1631(this.anInt3369, local17, local6, local24, local31);
	}
}
