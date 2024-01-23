import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public abstract class Class9_Sub2 extends Class9 {

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "Z")
	public boolean aBoolean122 = false;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
	public abstract void method1691(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "()I")
	public abstract int method1692();

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "()I")
	public abstract int method1693();

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(III)V")
	public abstract void method1694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "()I")
	public abstract int method1695();

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(III)V")
	public abstract void method1696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "([[IIIIII)V")
	protected final void method1697(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static222.method1706(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static222.method1706(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static222.method1706(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static222.method1706(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		@Pc(118) int local118 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
		if (local118 != 0) {
			this.method1698(local118);
		}
		@Pc(136) int local136 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
		if (local136 != 0) {
			this.method1702(local136);
		}
		@Pc(145) int local145 = local24 + local77;
		if (local42 + local60 < local145) {
			local145 = local42 + local60;
		}
		local145 = (local145 >> 1) - arg2;
		if (local145 != 0) {
			this.method1694(0, local145, 0);
		}
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V")
	public abstract void method1698(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "()I")
	public abstract int method2902();

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZZ)Lclient!cf;")
	public abstract Class9_Sub2 method1699(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "()I")
	public abstract int method1700();

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "()V")
	public abstract void method1701();

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V")
	public abstract void method1702(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(ZZ)Lclient!cf;")
	public abstract Class9_Sub2 method1703(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "()V")
	public abstract void method1704();

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!lb;ILclient!lb;I[IZ)V")
	public abstract void method1705(@OriginalArg(0) Class1_Sub1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub11 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "()I")
	public abstract int method1707();

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIIIIJ)V")
	public abstract void method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8);

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "()V")
	public abstract void method1708();

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!lb;IZ)V")
	public abstract void method1709(@OriginalArg(0) Class1_Sub1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method1710(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);
}
