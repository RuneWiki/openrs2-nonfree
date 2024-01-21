import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
	private final int anInt1015;

	@OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
	private final int anInt1014;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
	private final int anInt1010;

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
	private final int anInt1017;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIII)V")
	public Class5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt1015 = arg2;
		this.anInt1014 = arg3;
		this.anInt1010 = arg0;
		this.anInt1017 = arg1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BII)V")
	@Override
	public void method2104(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(BII)V")
	@Override
	public void method2105(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt1010 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt1015 >> 12;
		@Pc(24) int local24 = this.anInt1017 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt1014 * arg0 >> 12;
		Static54.method2789(super.anInt2786, local17, local10, local31, local24);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)V")
	@Override
	public void method2102(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
