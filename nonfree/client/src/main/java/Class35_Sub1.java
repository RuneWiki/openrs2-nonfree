import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class35_Sub1 extends Class35 {

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
	private int anInt1143;

	@OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
	private int anInt1148;

	@OriginalMember(owner = "client!dg", name = "t", descriptor = "I")
	private int anInt1147;

	@OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
	private int anInt1149;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(IIIIIII)V")
	public Class35_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1143 = arg2;
		this.anInt1148 = arg0;
		this.anInt1147 = arg1;
		this.anInt1149 = arg3;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(III)V")
	@Override
	public void method4143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = this.anInt1148 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt1147 * arg1 >> 12;
		@Pc(29) int local29 = arg0 * this.anInt1143 >> 12;
		@Pc(36) int local36 = this.anInt1149 * arg1 >> 12;
		Static109.method1721(local29, local36, local6, this.anInt5404, local17);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method4140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt1143 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt1148 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt1147 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt1149 >> 12;
		Static288.method4408(this.anInt5402, local30, this.anInt5404, this.anInt5399, local10, local37, local17);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V")
	@Override
	public void method4139(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt1143 >> 12;
		@Pc(22) int local22 = this.anInt1147 * arg1 >> 12;
		@Pc(29) int local29 = this.anInt1148 * arg0 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt1149 >> 12;
		Static266.method4097(local29, local36, local22, local10, this.anInt5402, this.anInt5399);
	}
}
