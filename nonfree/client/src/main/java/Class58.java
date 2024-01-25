import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public abstract class Class58 {

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
	protected Class58() {
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)V")
	public abstract void method4267(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(FFFFIILclient!sg;II)V")
	public final void method4268(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class118 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method4282() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method4282() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method4286() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method4286() - arg3) * local23) / 4096.0F + arg1;
		this.method4275(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)V")
	public final void method4269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4276(arg0, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IILclient!sg;II)V")
	public abstract void method4270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method4271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method4272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIII)V")
	public abstract void method4273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "()I")
	public abstract int method4274();

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(FFFFFFLclient!sg;II)V")
	protected abstract void method4275(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class118 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIII)V")
	public abstract void method4276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(FFIILclient!sg;II)V")
	public final void method4277(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class118 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method4268(arg0, arg1, (float) this.method4282() / 2.0F, (float) this.method4286() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIII)V")
	public final void method4278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method4272(arg0, arg1, arg2, arg3, 0, 0, 1);
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "()I")
	public abstract int method4279();

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(IIII)V")
	public abstract void method4280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(FFFFFFIII)V")
	protected abstract void method4281(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "()I")
	public abstract int method4282();

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(FFIIIII)V")
	public final void method4283(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method4285(arg0, arg1, (float) this.method4282() / 2.0F, (float) this.method4286() / 2.0F, arg2, arg3, 1, arg4);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(FFII)V")
	public final void method4284(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method4285(arg0, arg1, (float) this.method4282() / 2.0F, (float) this.method4286() / 2.0F, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(FFFFIIIII)V")
	private void method4285(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.method4282() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.method4282() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.method4286() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.method4286() - arg3) * local23) / 4096.0F + arg1;
		this.method4281(local37, local50, local67, local85, local102, local118, arg6, arg7);
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "()I")
	public abstract int method4286();
}
