import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public abstract class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "Z")
	public boolean aBoolean173 = false;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "([[IIIIII)V")
	protected final void method2913(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static234.method2933(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static234.method2933(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static234.method2933(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static234.method2933(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		@Pc(118) int local118 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
		if (local118 != 0) {
			this.method2919(local118);
		}
		@Pc(136) int local136 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
		if (local136 != 0) {
			this.method2927(local136);
		}
		@Pc(145) int local145 = local24 + local77;
		if (local42 + local60 < local145) {
			local145 = local42 + local60;
		}
		local145 = (local145 >> 1) - arg2;
		if (local145 != 0) {
			this.method2925(0, local145, 0);
		}
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "()I")
	public abstract int method2914();

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "()I")
	public abstract int method2915();

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZZ)Lclient!ei;")
	public abstract Class5_Sub2 method2916(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method2917(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "()I")
	public abstract int method2918();

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
	public abstract void method2919(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "()I")
	public abstract int method2920();

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "()V")
	public abstract void method2921();

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIIIJ)V")
	public abstract void method3679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8);

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(III)V")
	public abstract void method2922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "()I")
	public abstract int method2923();

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "()V")
	public abstract void method2924();

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(III)V")
	public abstract void method2925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!qh;IZ)V")
	public abstract void method2926(@OriginalArg(0) Class1_Sub2_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V")
	public abstract void method2927(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "()V")
	public abstract void method2928();

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!qh;ILclient!qh;I[IZ)V")
	public abstract void method2929(@OriginalArg(0) Class1_Sub2_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub14 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V")
	public abstract void method2930(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(ZZ)Lclient!ei;")
	public abstract Class5_Sub2 method2931(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!qh;I)V")
	public abstract void method2932(@OriginalArg(0) Class1_Sub2_Sub14 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "()I")
	public abstract int method3680();
}
