import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public abstract class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "Z")
	public boolean aBoolean45 = false;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	public abstract void method528(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([[IIIIII)V")
	protected final void method529(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static240.method543(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static240.method543(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static240.method543(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static240.method543(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		if (arg5 != 0) {
			@Pc(120) int local120 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
			if (local120 != 0) {
				this.method530(local120);
			}
		}
		if (arg4 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
			if (local140 != 0) {
				this.method528(local140);
			}
		}
		@Pc(149) int local149 = local24 + local77;
		if (local42 + local60 < local149) {
			local149 = local42 + local60;
		}
		local149 = (local149 >> 1) - arg2;
		if (local149 != 0) {
			this.method532(0, local149, 0);
		}
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
	public abstract void method530(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZZ)Lclient!nb;")
	public abstract Class5_Sub3 method531(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(III)V")
	public abstract void method532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!cc;ILclient!cc;I[IZ)V")
	public abstract void method533(@OriginalArg(0) Class1_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "()V")
	public abstract void method534();

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V")
	public abstract void method535(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "()I")
	public abstract int method536();

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "()I")
	public abstract int method537();

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(III)V")
	public abstract void method538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!cc;IZ)V")
	public abstract void method539(@OriginalArg(0) Class1_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIIJ)V")
	public abstract void method2300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method540(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "()V")
	public abstract void method541();

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "()I")
	public abstract int method542();

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!cc;I)V")
	public abstract void method544(@OriginalArg(0) Class1_Sub2_Sub3 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "()I")
	public abstract int method2297();

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "()I")
	public abstract int method545();

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(ZZ)Lclient!nb;")
	public abstract Class5_Sub3 method546(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "()V")
	public abstract void method547();

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "()I")
	public abstract int method548();
}
