import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class22_Sub4 extends Class22 {

	@OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
	private final int anInt4175;

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
	private final int anInt4170;

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
	private final int anInt4169;

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
	private final int anInt4173;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(IIIIIII)V")
	public Class22_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4175 = arg3;
		this.anInt4170 = arg0;
		this.anInt4169 = arg2;
		this.anInt4173 = arg1;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method3217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt4170 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt4169 >> 12;
		@Pc(32) int local32 = this.anInt4173 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt4175 * arg1 >> 12;
		Static205.method3460(super.anInt4159, local32, local39, super.anInt4156, local10, local25, super.anInt4155);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BII)V")
	@Override
	public void method3216(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt4170 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt4169 >> 12;
		@Pc(24) int local24 = this.anInt4173 * arg0 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt4175 >> 12;
		Static169.method2916(local17, local39, super.anInt4156, local10, local24);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(III)V")
	@Override
	public void method3215(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt4170 >> 12;
		@Pc(17) int local17 = this.anInt4169 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt4173 * arg1 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt4175 >> 12;
		Static199.method2224(local17, super.anInt4159, super.anInt4155, local39, local10, local24);
	}
}
