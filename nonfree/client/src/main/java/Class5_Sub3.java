import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public abstract class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "Z")
	public boolean aBoolean65 = false;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(III)V")
	public abstract void method1412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
	public abstract void method1414(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method1415(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "()I")
	public abstract int method1416();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZZ)Lclient!qc;")
	public abstract Class5_Sub3 method1417(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
	public abstract void method1418(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)V")
	public abstract void method1419(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIIIIJ)V")
	public abstract void method3779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!oj;I)V")
	public abstract void method1420(@OriginalArg(0) Class2_Sub3_Sub22 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(ZZ)Lclient!qc;")
	public abstract Class5_Sub3 method1421(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "()I")
	public abstract int method1422();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!oj;IZ)V")
	public abstract void method1423(@OriginalArg(0) Class2_Sub3_Sub22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "()V")
	public abstract void method1424();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([[IIIIII)V")
	protected final void method1425(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static234.method1413(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static234.method1413(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static234.method1413(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static234.method1413(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		@Pc(118) int local118 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
		if (local118 != 0) {
			this.method1418(local118);
		}
		@Pc(136) int local136 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
		if (local136 != 0) {
			this.method1419(local136);
		}
		@Pc(145) int local145 = local24 + local77;
		if (local42 + local60 < local145) {
			local145 = local42 + local60;
		}
		local145 = (local145 >> 1) - arg2;
		if (local145 != 0) {
			this.method1432(0, local145, 0);
		}
	}

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "()I")
	public abstract int method1426();

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "()V")
	public abstract void method1427();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!oj;ILclient!oj;I[IZ)V")
	public abstract void method1428(@OriginalArg(0) Class2_Sub3_Sub22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub3_Sub22 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "()V")
	public abstract void method1429();

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "()I")
	public abstract int method3773();

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "()I")
	public abstract int method1430();

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "()I")
	public abstract int method1431();

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(III)V")
	public abstract void method1432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
