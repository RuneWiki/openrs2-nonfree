import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public abstract class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "Z")
	public boolean aBoolean139 = false;

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(III)V")
	public abstract void method1849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "()V")
	public abstract void method1850();

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "()V")
	public abstract void method1851();

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(III)V")
	public abstract void method1852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZZ)Lclient!cg;")
	public abstract Class12_Sub2 method1853(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(ZZ)Lclient!cg;")
	public abstract Class12_Sub2 method1854(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "()I")
	public abstract int method1855();

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!li;IZ)V")
	public abstract void method1856(@OriginalArg(0) Class2_Sub2_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIIIJ)V")
	public abstract void method2715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8);

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
	public abstract void method1857(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!li;ILclient!li;I[IZ)V")
	public abstract void method1858(@OriginalArg(0) Class2_Sub2_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub13 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "()V")
	public abstract void method1859();

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V")
	public abstract void method1860(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "()I")
	public abstract int method1861();

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method1862(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "()I")
	public abstract int method1863();

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "()I")
	public abstract int method1865();

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)V")
	public abstract void method1866(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "()I")
	public abstract int method1867();

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([[IIIIII)V")
	protected final void method1868(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static222.method1864(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static222.method1864(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static222.method1864(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static222.method1864(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		@Pc(118) int local118 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
		if (local118 != 0) {
			this.method1866(local118);
		}
		@Pc(136) int local136 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
		if (local136 != 0) {
			this.method1860(local136);
		}
		@Pc(145) int local145 = local24 + local77;
		if (local42 + local60 < local145) {
			local145 = local42 + local60;
		}
		local145 = (local145 >> 1) - arg2;
		if (local145 != 0) {
			this.method1849(0, local145, 0);
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "()I")
	public abstract int method2718();
}
