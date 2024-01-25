import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public abstract class Class11 {

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	protected Class11() {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V")
	public final void method4390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.JA(arg0, arg1, arg2, arg3, 1, 0, 1);
	}

	@OriginalMember(owner = "client!l", name = "j", descriptor = "()I")
	public abstract int j();

	@OriginalMember(owner = "client!l", name = "r", descriptor = "(IIIII)V")
	public abstract void r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FFFFIIIII)V")
	private void method4391(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.j() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.j() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.T() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.T() - arg3) * local23) / 4096.0F + arg1;
		this.a(local37, local50, local67, local85, local102, local118, arg6, arg7, 1);
	}

	@OriginalMember(owner = "client!l", name = "MA", descriptor = "(IIII)V")
	public abstract void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FFIIIII)V")
	public final void method4392(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method4391(arg0, arg1, (float) this.j() / 2.0F, (float) this.T() / 2.0F, arg2, arg3, 0, arg4);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FFII)V")
	public final void method4393(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method4391(arg0, arg1, (float) this.j() / 2.0F, (float) this.T() / 2.0F, arg2, arg3, 1, 0);
	}

	@OriginalMember(owner = "client!l", name = "JA", descriptor = "(IIIIIII)V")
	public abstract void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V")
	public final void method4394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.r(arg0, arg1, 1, 0, 1);
	}

	@OriginalMember(owner = "client!l", name = "T", descriptor = "()I")
	public abstract int T();

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(FFFFFFLclient!ma;II)V")
	protected abstract void method4395(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class119 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IILclient!ma;II)V")
	public abstract void method4396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class119 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FFFFFFIII)V")
	protected abstract void a(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FFFFIILclient!ma;II)V")
	public final void method4397(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class119 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(50) float local50 = (arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(67) float local67 = (((float) this.j() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(85) float local85 = (-((float) this.j() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(102) float local102 = (-arg2 * local23 + ((float) this.T() - arg3) * local16) / 4096.0F + arg0;
		@Pc(118) float local118 = (arg2 * local16 + ((float) this.T() - arg3) * local23) / 4096.0F + arg1;
		this.method4395(local37, local50, local67, local85, local102, local118, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!l", name = "s", descriptor = "(IIIIIII)V")
	public abstract void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!l", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FFIILclient!ma;II)V")
	public final void method4398(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class119 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.method4397(arg0, arg1, (float) this.j() / 2.0F, (float) this.T() / 2.0F, 4096, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "la", descriptor = "()I")
	public abstract int la();

	@OriginalMember(owner = "client!l", name = "BA", descriptor = "(III)V")
	public abstract void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!l", name = "t", descriptor = "(IIIIII)V")
	public abstract void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IIII)V")
	public final void method4399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.s(arg0, arg1, arg2, arg3, 1, 0, 1);
	}
}
