import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!a", name = "q", descriptor = "Z")
	public boolean aBoolean51 = false;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "()I")
	public abstract int method656();

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(III)V")
	public abstract void method657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!pd;ILclient!pd;I[IZ)V")
	public abstract void method658(@OriginalArg(0) Class5_Sub2_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub2_Sub16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	public abstract void method659(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "b", descriptor = "()I")
	public abstract int method2449();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZZ)Lclient!a;")
	public abstract Class1_Sub1 method660(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!a", name = "d", descriptor = "()V")
	public abstract void method661();

	@OriginalMember(owner = "client!a", name = "e", descriptor = "()V")
	public abstract void method662();

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	public abstract void method663(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "f", descriptor = "()V")
	public abstract void method664();

	@OriginalMember(owner = "client!a", name = "g", descriptor = "()I")
	public abstract int method665();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([[IIIIII)V")
	protected final void method666(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static219.method672(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static219.method672(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static219.method672(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static219.method672(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		@Pc(118) int local118 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
		if (local118 != 0) {
			this.method674(local118);
		}
		@Pc(136) int local136 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
		if (local136 != 0) {
			this.method663(local136);
		}
		@Pc(145) int local145 = local24 + local77;
		if (local42 + local60 < local145) {
			local145 = local42 + local60;
		}
		local145 = (local145 >> 1) - arg2;
		if (local145 != 0) {
			this.method668(0, local145, 0);
		}
	}

	@OriginalMember(owner = "client!a", name = "h", descriptor = "()I")
	public abstract int method667();

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(III)V")
	public abstract void method668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!a", name = "i", descriptor = "()I")
	public abstract int method669();

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(ZZ)Lclient!a;")
	public abstract Class1_Sub1 method670(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!a", name = "j", descriptor = "()I")
	public abstract int method671();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIIJ)V")
	public abstract void method2445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method673(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
	public abstract void method674(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!pd;IZ)V")
	public abstract void method675(@OriginalArg(0) Class5_Sub2_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);
}
