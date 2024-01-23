import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
	private int anInt113;

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
	private int anInt110;

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
	private int anInt111;

	@OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
	private int anInt112;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(IIIIIII)V")
	public Class5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt113 = arg0;
		this.anInt110 = arg3;
		this.anInt111 = arg2;
		this.anInt112 = arg1;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIB)V")
	@Override
	public void method2331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt113 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt111 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt112 * arg1 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt110 >> 12;
		Static76.method1295(this.anInt2894, this.anInt2885, local24, local17, local10, local31);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V")
	@Override
	public void method2328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt113 >> 12;
		@Pc(17) int local17 = this.anInt111 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt112 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt110 >> 12;
		Static99.method1634(local10, local17, local24, this.anInt2895, local31);
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(III)V")
	@Override
	public void method2334(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt111 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt113 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt110 >> 12;
		@Pc(37) int local37 = this.anInt112 * arg0 >> 12;
		Static82.method1395(local17, local37, local10, this.anInt2885, this.anInt2895, local30, this.anInt2894);
	}
}
